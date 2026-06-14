package org.osmdroid.tileprovider.modules;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.tileprovider.util.StreamUtils;
import org.osmdroid.util.GarbageCollector;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.SplashScreenable;

/* loaded from: classes5.dex */
public class SqlTileWriter implements IFilesystemCache, SplashScreenable {
    public static final String COLUMN_EXPIRES_INDEX = "expires_index";
    public static final String DATABASE_FILENAME = "cache.db";
    private static boolean cleanOnStartup = true;
    protected static File db_file = null;
    static boolean hasInited = false;
    protected static SQLiteDatabase mDb = null;
    private static final String primaryKey = "key=? and provider=?";
    private final GarbageCollector garbageCollector;
    protected long lastSizeCheck = 0;
    private static final Object mLock = new Object();
    public static final String COLUMN_EXPIRES = "expires";
    private static final String[] queryColumns = {DatabaseFileArchive.COLUMN_TILE, COLUMN_EXPIRES};
    private static final String[] expireQueryColumn = {COLUMN_EXPIRES};

    public static long getIndex(long j, long j2, long j3) {
        int i = (int) j3;
        return (((j3 << i) + j) << i) + j2;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public void onDetach() {
    }

    public static void setCleanupOnStart(boolean z) {
        cleanOnStartup = z;
    }

    public SqlTileWriter() {
        GarbageCollector garbageCollector = new GarbageCollector(new Runnable() { // from class: org.osmdroid.tileprovider.modules.SqlTileWriter.1
            @Override // java.lang.Runnable
            public void run() {
                SqlTileWriter.this.runCleanupOperation();
            }
        });
        this.garbageCollector = garbageCollector;
        getDb();
        if (hasInited) {
            return;
        }
        hasInited = true;
        if (cleanOnStartup) {
            garbageCollector.gc();
        }
    }

    public void runCleanupOperation() {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            if (Configuration.getInstance().isDebugMode()) {
                Log.d(IMapView.LOGTAG, "Finished init thread, aborted due to null database reference");
            }
        } else {
            createIndex(db);
            long length = db_file.length();
            if (length <= Configuration.getInstance().getTileFileSystemCacheMaxBytes()) {
                return;
            }
            runCleanupOperation(length - Configuration.getInstance().getTileFileSystemCacheTrimBytes(), Configuration.getInstance().getTileGCBulkSize(), Configuration.getInstance().getTileGCBulkPauseInMillis(), true);
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean saveFile(ITileSource iTileSource, long j, InputStream inputStream, Long l) {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            Log.d(IMapView.LOGTAG, "Unable to store cached tile from " + iTileSource.name() + " " + MapTileIndex.toString(j) + ", database not available.");
            Counters.fileCacheSaveErrors++;
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    long index = getIndex(j);
                    contentValues.put(DatabaseFileArchive.COLUMN_PROVIDER, iTileSource.name());
                    byte[] bArr = new byte[512];
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream2.write(bArr, 0, read);
                        } catch (SQLiteFullException e) {
                            e = e;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            Log.e(IMapView.LOGTAG, "SQLiteFullException while saving tile.", e);
                            this.garbageCollector.gc();
                            catchException(e);
                            byteArrayOutputStream.close();
                            return false;
                        } catch (Exception e2) {
                            e = e2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            Log.e(IMapView.LOGTAG, "Unable to store cached tile from " + iTileSource.name() + " " + MapTileIndex.toString(j) + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                            Counters.fileCacheSaveErrors++;
                            catchException(e);
                            byteArrayOutputStream.close();
                            return false;
                        } catch (Throwable th) {
                            th = th;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            try {
                                byteArrayOutputStream.close();
                            } catch (IOException unused) {
                            }
                            throw th;
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    contentValues.put(DatabaseFileArchive.COLUMN_KEY, Long.valueOf(index));
                    contentValues.put(DatabaseFileArchive.COLUMN_TILE, byteArray);
                    if (l != null) {
                        contentValues.put(COLUMN_EXPIRES, l);
                    }
                    db.replaceOrThrow("tiles", null, contentValues);
                    if (Configuration.getInstance().isDebugMode()) {
                        Log.d(IMapView.LOGTAG, "tile inserted " + iTileSource.name() + MapTileIndex.toString(j));
                    }
                    if (System.currentTimeMillis() > this.lastSizeCheck + Configuration.getInstance().getTileGCFrequencyInMillis()) {
                        this.lastSizeCheck = System.currentTimeMillis();
                        this.garbageCollector.gc();
                    }
                    byteArrayOutputStream2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (SQLiteFullException e3) {
                e = e3;
            } catch (Exception e4) {
                e = e4;
            }
        } catch (IOException unused2) {
        }
        return false;
    }

    public boolean exists(String str, long j) {
        return 1 == getRowCount(primaryKey, getPrimaryKeyParameters(getIndex(j), str));
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean exists(ITileSource iTileSource, long j) {
        return exists(iTileSource.name(), j);
    }

    public boolean purgeCache() {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            return false;
        }
        try {
            db.delete("tiles", null, null);
            return true;
        } catch (Exception e) {
            Log.w(IMapView.LOGTAG, "Error purging the db", e);
            catchException(e);
            return false;
        }
    }

    public boolean purgeCache(String str) {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                db.delete("tiles", "provider = ?", new String[]{str});
                return true;
            } catch (Exception e) {
                Log.w(IMapView.LOGTAG, "Error purging the db", e);
                catchException(e);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int[] importFromFileCache(boolean z) {
        File[] listFiles;
        int[] iArr;
        boolean z2;
        char c;
        char c2;
        File[] listFiles2;
        int[] iArr2;
        char c3;
        File[] fileArr;
        String str;
        int i;
        File[] fileArr2;
        int i2;
        String str2;
        int[] iArr3;
        File[] fileArr3;
        String str3;
        int i3;
        File[] fileArr4;
        int i4;
        ContentValues contentValues;
        long parseLong;
        long parseLong2;
        long parseLong3;
        long index;
        String str4;
        SQLiteDatabase db = getDb();
        int i5 = 0;
        boolean z3 = true;
        char c4 = 2;
        char c5 = 3;
        int[] iArr4 = {0, 0, 0, 0};
        File osmdroidTileCache = Configuration.getInstance().getOsmdroidTileCache();
        if (osmdroidTileCache.exists() && (listFiles = osmdroidTileCache.listFiles()) != null) {
            int i6 = 0;
            while (i6 < listFiles.length) {
                if (!listFiles[i6].isDirectory() || listFiles[i6].isHidden()) {
                    iArr = iArr4;
                    z2 = z3;
                    c = c4;
                    c2 = c5;
                } else {
                    File[] listFiles3 = listFiles[i6].listFiles();
                    String str5 = "Unable to delete directory from ";
                    String str6 = IMapView.LOGTAG;
                    if (listFiles3 != null) {
                        int i7 = i5;
                        while (i7 < listFiles3.length) {
                            if (listFiles3[i7].isDirectory() && !listFiles3[i7].isHidden() && (listFiles2 = listFiles3[i7].listFiles()) != null) {
                                int i8 = i5;
                                while (i8 < listFiles2.length) {
                                    if (listFiles2[i8].isDirectory() && !listFiles2[i8].isHidden()) {
                                        File[] listFiles4 = listFiles2[i8].listFiles();
                                        if (listFiles2 != null) {
                                            int i9 = i5;
                                            while (i9 < listFiles4.length) {
                                                if (listFiles4[i9].isHidden() || listFiles4[i9].isDirectory()) {
                                                    iArr3 = iArr4;
                                                    fileArr3 = listFiles3;
                                                    str3 = str5;
                                                    i3 = i7;
                                                    fileArr4 = listFiles2;
                                                    i4 = i8;
                                                } else {
                                                    try {
                                                        contentValues = new ContentValues();
                                                        parseLong = Long.parseLong(listFiles2[i8].getName());
                                                        str3 = str5;
                                                    } catch (Exception e) {
                                                        e = e;
                                                        iArr3 = iArr4;
                                                        fileArr3 = listFiles3;
                                                        str3 = str5;
                                                    }
                                                    try {
                                                        fileArr4 = listFiles2;
                                                        try {
                                                            i4 = i8;
                                                            try {
                                                                parseLong2 = Long.parseLong(listFiles4[i9].getName().substring(0, listFiles4[i9].getName().indexOf(".")));
                                                                fileArr3 = listFiles3;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                iArr3 = iArr4;
                                                                fileArr3 = listFiles3;
                                                            }
                                                            try {
                                                                parseLong3 = Long.parseLong(listFiles3[i7].getName());
                                                                index = getIndex(parseLong, parseLong2, parseLong3);
                                                                i3 = i7;
                                                                try {
                                                                    iArr3 = iArr4;
                                                                    try {
                                                                        contentValues.put(DatabaseFileArchive.COLUMN_PROVIDER, listFiles[i6].getName());
                                                                        str4 = str6;
                                                                        try {
                                                                        } catch (Exception e3) {
                                                                            e = e3;
                                                                            str6 = str4;
                                                                        }
                                                                    } catch (Exception e4) {
                                                                        e = e4;
                                                                    }
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    iArr3 = iArr4;
                                                                }
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                iArr3 = iArr4;
                                                                i3 = i7;
                                                                Log.e(str6, "Unable to store cached tile from " + listFiles[i6].getName() + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                                                                iArr3[1] = iArr3[1] + 1;
                                                                catchException(e);
                                                                i9++;
                                                                i8 = i4;
                                                                i7 = i3;
                                                                iArr4 = iArr3;
                                                                str5 = str3;
                                                                listFiles2 = fileArr4;
                                                                listFiles3 = fileArr3;
                                                            }
                                                        } catch (Exception e7) {
                                                            e = e7;
                                                            iArr3 = iArr4;
                                                            fileArr3 = listFiles3;
                                                            i3 = i7;
                                                            i4 = i8;
                                                            Log.e(str6, "Unable to store cached tile from " + listFiles[i6].getName() + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                                                            iArr3[1] = iArr3[1] + 1;
                                                            catchException(e);
                                                            i9++;
                                                            i8 = i4;
                                                            i7 = i3;
                                                            iArr4 = iArr3;
                                                            str5 = str3;
                                                            listFiles2 = fileArr4;
                                                            listFiles3 = fileArr3;
                                                        }
                                                    } catch (Exception e8) {
                                                        e = e8;
                                                        iArr3 = iArr4;
                                                        fileArr3 = listFiles3;
                                                        i3 = i7;
                                                        fileArr4 = listFiles2;
                                                        i4 = i8;
                                                        Log.e(str6, "Unable to store cached tile from " + listFiles[i6].getName() + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                                                        iArr3[1] = iArr3[1] + 1;
                                                        catchException(e);
                                                        i9++;
                                                        i8 = i4;
                                                        i7 = i3;
                                                        iArr4 = iArr3;
                                                        str5 = str3;
                                                        listFiles2 = fileArr4;
                                                        listFiles3 = fileArr3;
                                                    }
                                                    if (exists(listFiles[i6].getName(), MapTileIndex.getTileIndex((int) parseLong3, (int) parseLong, (int) parseLong2))) {
                                                        str6 = str4;
                                                    } else {
                                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(listFiles4[i9]));
                                                        ArrayList arrayList = new ArrayList();
                                                        while (true) {
                                                            int read = bufferedInputStream.read();
                                                            if (read == -1) {
                                                                break;
                                                            }
                                                            arrayList.add(Byte.valueOf((byte) read));
                                                        }
                                                        byte[] bArr = new byte[arrayList.size()];
                                                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                                            bArr[i10] = ((Byte) arrayList.get(i10)).byteValue();
                                                        }
                                                        contentValues.put(DatabaseFileArchive.COLUMN_KEY, Long.valueOf(index));
                                                        contentValues.put(DatabaseFileArchive.COLUMN_TILE, bArr);
                                                        if (db.insert("tiles", null, contentValues) <= 0) {
                                                            str6 = str4;
                                                            Log.w(str6, "tile NOT inserted " + listFiles[i6].getName() + DomExceptionUtils.SEPARATOR + parseLong3 + DomExceptionUtils.SEPARATOR + parseLong + DomExceptionUtils.SEPARATOR + parseLong2);
                                                        } else {
                                                            try {
                                                                if (Configuration.getInstance().isDebugMode()) {
                                                                    str6 = str4;
                                                                    Log.d(str6, "tile inserted " + listFiles[i6].getName() + DomExceptionUtils.SEPARATOR + parseLong3 + DomExceptionUtils.SEPARATOR + parseLong + DomExceptionUtils.SEPARATOR + parseLong2);
                                                                } else {
                                                                    str6 = str4;
                                                                }
                                                                iArr3[0] = iArr3[0] + 1;
                                                                if (z) {
                                                                    try {
                                                                        listFiles4[i9].delete();
                                                                    } catch (Exception unused) {
                                                                    }
                                                                    try {
                                                                        iArr3[2] = iArr3[2] + 1;
                                                                    } catch (Exception unused2) {
                                                                        try {
                                                                            iArr3[3] = iArr3[3] + 1;
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            Log.e(str6, "Unable to store cached tile from " + listFiles[i6].getName() + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                                                                            iArr3[1] = iArr3[1] + 1;
                                                                            catchException(e);
                                                                            i9++;
                                                                            i8 = i4;
                                                                            i7 = i3;
                                                                            iArr4 = iArr3;
                                                                            str5 = str3;
                                                                            listFiles2 = fileArr4;
                                                                            listFiles3 = fileArr3;
                                                                        }
                                                                        i9++;
                                                                        i8 = i4;
                                                                        i7 = i3;
                                                                        iArr4 = iArr3;
                                                                        str5 = str3;
                                                                        listFiles2 = fileArr4;
                                                                        listFiles3 = fileArr3;
                                                                    }
                                                                }
                                                            } catch (Exception e10) {
                                                                e = e10;
                                                                str6 = str4;
                                                                Log.e(str6, "Unable to store cached tile from " + listFiles[i6].getName() + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
                                                                iArr3[1] = iArr3[1] + 1;
                                                                catchException(e);
                                                                i9++;
                                                                i8 = i4;
                                                                i7 = i3;
                                                                iArr4 = iArr3;
                                                                str5 = str3;
                                                                listFiles2 = fileArr4;
                                                                listFiles3 = fileArr3;
                                                            }
                                                        }
                                                        i9++;
                                                        i8 = i4;
                                                        i7 = i3;
                                                        iArr4 = iArr3;
                                                        str5 = str3;
                                                        listFiles2 = fileArr4;
                                                        listFiles3 = fileArr3;
                                                    }
                                                }
                                                i9++;
                                                i8 = i4;
                                                i7 = i3;
                                                iArr4 = iArr3;
                                                str5 = str3;
                                                listFiles2 = fileArr4;
                                                listFiles3 = fileArr3;
                                            }
                                            iArr2 = iArr4;
                                            fileArr = listFiles3;
                                            str = str5;
                                            i = i7;
                                            fileArr2 = listFiles2;
                                            i2 = i8;
                                            c3 = 2;
                                            if (z) {
                                                try {
                                                    fileArr2[i2].delete();
                                                } catch (Exception e11) {
                                                    str2 = str;
                                                    Log.e(str6, str2 + fileArr2[i2].getAbsolutePath(), e11);
                                                    iArr2[3] = iArr2[3] + 1;
                                                }
                                            }
                                            str2 = str;
                                            i8 = i2 + 1;
                                            str5 = str2;
                                            c4 = c3;
                                            i7 = i;
                                            iArr4 = iArr2;
                                            listFiles2 = fileArr2;
                                            listFiles3 = fileArr;
                                            i5 = 0;
                                        }
                                    }
                                    iArr2 = iArr4;
                                    c3 = c4;
                                    fileArr = listFiles3;
                                    str = str5;
                                    i = i7;
                                    fileArr2 = listFiles2;
                                    i2 = i8;
                                    if (z) {
                                    }
                                    str2 = str;
                                    i8 = i2 + 1;
                                    str5 = str2;
                                    c4 = c3;
                                    i7 = i;
                                    iArr4 = iArr2;
                                    listFiles2 = fileArr2;
                                    listFiles3 = fileArr;
                                    i5 = 0;
                                }
                            }
                            int[] iArr5 = iArr4;
                            char c6 = c4;
                            File[] fileArr5 = listFiles3;
                            String str7 = str5;
                            int i11 = i7;
                            if (z) {
                                try {
                                    fileArr5[i11].delete();
                                } catch (Exception e12) {
                                    Log.e(str6, str7 + fileArr5[i11].getAbsolutePath(), e12);
                                    iArr5[3] = iArr5[3] + 1;
                                }
                            }
                            i7 = i11 + 1;
                            str5 = str7;
                            c4 = c6;
                            iArr4 = iArr5;
                            listFiles3 = fileArr5;
                            i5 = 0;
                        }
                    }
                    iArr = iArr4;
                    c = c4;
                    String str8 = str5;
                    if (z) {
                        try {
                            listFiles[i6].delete();
                        } catch (Exception e13) {
                            Log.e(str6, str8 + listFiles[i6].getAbsolutePath(), e13);
                            c2 = 3;
                            z2 = true;
                            iArr[3] = iArr[3] + 1;
                        }
                    }
                    c2 = 3;
                    z2 = true;
                }
                i6++;
                c5 = c2;
                z3 = z2;
                c4 = c;
                iArr4 = iArr;
                i5 = 0;
            }
        }
        return iArr4;
    }

    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public boolean remove(ITileSource iTileSource, long j) {
        SQLiteDatabase db = getDb();
        if (db == null || !db.isOpen()) {
            Log.d(IMapView.LOGTAG, "Unable to delete cached tile from " + iTileSource.name() + " " + MapTileIndex.toString(j) + ", database not available.");
            Counters.fileCacheSaveErrors++;
            return false;
        }
        try {
            db.delete("tiles", primaryKey, getPrimaryKeyParameters(getIndex(j), iTileSource));
            return true;
        } catch (Exception e) {
            Log.e(IMapView.LOGTAG, "Unable to delete cached tile from " + iTileSource.name() + " " + MapTileIndex.toString(j) + " db is " + (db == null ? AbstractJsonLexerKt.NULL : "not null"), e);
            Counters.fileCacheSaveErrors++;
            catchException(e);
            return false;
        }
    }

    public long getRowCount(String str) {
        return str == null ? getRowCount(null, null) : getRowCount("provider=?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r4 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r4 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected long getRowCount(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase db = getDb();
                if (db != null && db.isOpen()) {
                    cursor = db.rawQuery("select count(*) from tiles" + (str == null ? "" : " where " + str), strArr);
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return j;
                    }
                }
                return -1L;
            } catch (Exception e) {
                this.catchException(e);
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public long getRowCount(String str, int i, Collection<Rect> collection, Collection<Rect> collection2) {
        return getRowCount(((Object) getWhereClause(i, collection, collection2)) + (str != null ? " and provider=?" : ""), str != null ? new String[]{str} : null);
    }

    public long getSize() {
        return db_file.length();
    }

    public long getFirstExpiry() {
        SQLiteDatabase db = getDb();
        if (db != null && db.isOpen()) {
            try {
                Cursor rawQuery = db.rawQuery("select min(expires) from tiles", null);
                rawQuery.moveToFirst();
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (Exception e) {
                Log.e(IMapView.LOGTAG, "Unable to query for oldest tile", e);
                catchException(e);
            }
        }
        return 0L;
    }

    protected static String extractXFromKeyInSQL(int i) {
        return "((key>>" + i + ")%" + (1 << i) + ")";
    }

    protected static String extractYFromKeyInSQL(int i) {
        return "(key%" + (1 << i) + ")";
    }

    public static long getIndex(long j) {
        return getIndex(MapTileIndex.getX(j), MapTileIndex.getY(j), MapTileIndex.getZoom(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        if (r3 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Long getExpirationTimestamp(ITileSource iTileSource, long j) {
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            cursor = getTileCursor(getPrimaryKeyParameters(getIndex(j), iTileSource), expireQueryColumn);
            try {
                try {
                    if (cursor.moveToNext()) {
                        Long valueOf = Long.valueOf(cursor.getLong(0));
                        if (cursor != null) {
                            cursor.close();
                        }
                        return valueOf;
                    }
                } catch (Exception e) {
                    e = e;
                    Log.e(IMapView.LOGTAG, "error getting expiration date from the tile cache", e);
                    this.catchException(e);
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
    }

    public static String getPrimaryKey() {
        return primaryKey;
    }

    public static String[] getPrimaryKeyParameters(long j, ITileSource iTileSource) {
        return getPrimaryKeyParameters(j, iTileSource.name());
    }

    public static String[] getPrimaryKeyParameters(long j, String str) {
        return new String[]{String.valueOf(j), str};
    }

    public Cursor getTileCursor(String[] strArr, String[] strArr2) {
        return getDb().query("tiles", strArr2, primaryKey, strArr, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.ByteArrayInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.osmdroid.tileprovider.tilesource.ITileSource] */
    @Override // org.osmdroid.tileprovider.modules.IFilesystemCache
    public Drawable loadTile(ITileSource iTileSource, long j) throws Exception {
        Cursor tileCursor;
        long j2;
        byte[] bArr;
        ?? byteArrayInputStream;
        Cursor cursor = null;
        try {
            try {
                tileCursor = getTileCursor(getPrimaryKeyParameters(getIndex(j), (ITileSource) iTileSource), queryColumns);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (tileCursor.moveToFirst()) {
                bArr = tileCursor.getBlob(0);
                j2 = tileCursor.getLong(1);
            } else {
                j2 = 0;
                bArr = null;
            }
            if (bArr == null) {
                if (Configuration.getInstance().isDebugMode()) {
                    Log.d(IMapView.LOGTAG, "SqlCache - Tile doesn't exist: " + iTileSource.name() + MapTileIndex.toString(j));
                }
                if (tileCursor != null) {
                    tileCursor.close();
                }
                return null;
            }
            if (tileCursor != null) {
                tileCursor.close();
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                Drawable drawable = iTileSource.getDrawable(byteArrayInputStream);
                if (j2 < System.currentTimeMillis() && drawable != null) {
                    if (Configuration.getInstance().isDebugMode()) {
                        Log.d(IMapView.LOGTAG, "Tile expired: " + iTileSource.name() + MapTileIndex.toString(j));
                    }
                    ExpirableBitmapDrawable.setState(drawable, -2);
                }
                StreamUtils.closeStream(byteArrayInputStream);
                return drawable;
            } catch (Throwable th3) {
                th = th3;
                cursor = byteArrayInputStream;
                if (cursor != null) {
                    StreamUtils.closeStream(cursor);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursor = tileCursor;
            catchException(e);
            throw e;
        } catch (Throwable th4) {
            th = th4;
            cursor = tileCursor;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void runCleanupOperation(long j, int i, long j2, boolean z) {
        boolean z2;
        String str;
        StringBuilder sb = new StringBuilder();
        SQLiteDatabase db = getDb();
        long j3 = j;
        boolean z3 = true;
        while (j3 > 0) {
            if (z3) {
                z2 = false;
            } else {
                if (j2 > 0) {
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException unused) {
                    }
                }
                z2 = z3;
            }
            try {
                String str2 = "";
                Cursor rawQuery = db.rawQuery("SELECT key,LENGTH(HEX(tile))/2 FROM tiles WHERE expires IS NOT NULL " + (z ? "" : "AND expires < " + System.currentTimeMillis() + " ") + "ORDER BY " + COLUMN_EXPIRES + " ASC LIMIT " + i, null);
                rawQuery.moveToFirst();
                sb.setLength(0);
                sb.append("key in (");
                String str3 = "";
                while (true) {
                    str = str2;
                    if (rawQuery.isAfterLast()) {
                        break;
                    }
                    long j4 = rawQuery.getLong(0);
                    long j5 = rawQuery.getLong(1);
                    rawQuery.moveToNext();
                    sb.append(str3).append(j4);
                    j3 -= j5;
                    str3 = ",";
                    if (j3 <= 0) {
                        break;
                    } else {
                        str2 = str;
                    }
                }
                rawQuery.close();
                if (str.equals(str3)) {
                    return;
                }
                sb.append(')');
                try {
                    db.delete("tiles", sb.toString(), null);
                } catch (SQLiteFullException e) {
                    Log.e(IMapView.LOGTAG, "SQLiteFullException while cleanup.", e);
                    catchException(e);
                } catch (Exception e2) {
                    catchException(e2);
                    return;
                }
                z3 = z2;
            } catch (Exception e3) {
                catchException(e3);
                return;
            }
        }
    }

    protected SQLiteDatabase getDb() {
        SQLiteDatabase sQLiteDatabase = mDb;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        synchronized (mLock) {
            Configuration.getInstance().getOsmdroidTileCache().mkdirs();
            File file = new File(Configuration.getInstance().getOsmdroidTileCache().getAbsolutePath() + File.separator + DATABASE_FILENAME);
            db_file = file;
            if (mDb == null) {
                try {
                    SQLiteDatabase openOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                    mDb = openOrCreateDatabase;
                    openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS tiles (key INTEGER , provider TEXT, tile BLOB, expires INTEGER, PRIMARY KEY (key, provider));");
                } catch (Exception e) {
                    Log.e(IMapView.LOGTAG, "Unable to start the sqlite tile writer. Check external storage availability.", e);
                    catchException(e);
                    return null;
                }
            }
        }
        return mDb;
    }

    public void refreshDb() {
        synchronized (mLock) {
            SQLiteDatabase sQLiteDatabase = mDb;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
                mDb = null;
            }
        }
    }

    protected void catchException(Exception exc) {
        if (!(exc instanceof SQLiteException) || isFunctionalException((SQLiteException) exc)) {
            return;
        }
        refreshDb();
    }

    public static boolean isFunctionalException(SQLiteException sQLiteException) {
        String simpleName = sQLiteException.getClass().getSimpleName();
        simpleName.hashCode();
        switch (simpleName) {
            case "SQLiteFullException":
            case "SQLiteBindOrColumnIndexOutOfRangeException":
            case "SQLiteTableLockedException":
            case "SQLiteMisuseException":
            case "SQLiteBlobTooBigException":
            case "SQLiteConstraintException":
            case "SQLiteDatatypeMismatchException":
                return true;
            default:
                return false;
        }
    }

    private void createIndex(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS expires_index ON tiles (expires);");
    }

    @Override // org.osmdroid.util.SplashScreenable
    public void runDuringSplashScreen() {
        createIndex(getDb());
    }

    protected StringBuilder getWhereClause(int i, Rect rect) {
        long j = (1 << (i + 1)) - 1;
        long j2 = i;
        long index = getIndex(0L, 0L, j2);
        long index2 = getIndex(j, j, j2);
        String extractXFromKeyInSQL = extractXFromKeyInSQL(i);
        String extractYFromKeyInSQL = extractYFromKeyInSQL(i);
        StringBuilder sb = new StringBuilder();
        sb.append("(key between ");
        sb.append(index).append(" and ").append(index2);
        if (rect != null) {
            sb.append(" and ");
            if (rect.left == rect.right) {
                sb.append(extractXFromKeyInSQL).append("=").append(rect.left);
            } else {
                sb.append("(").append(extractXFromKeyInSQL).append(">=").append(rect.left).append(rect.left < rect.right ? " and " : " or ").append(extractXFromKeyInSQL).append("<=").append(rect.right).append(")");
            }
            sb.append(" and ");
            if (rect.top == rect.bottom) {
                sb.append(extractYFromKeyInSQL).append("=").append(rect.top);
            } else {
                sb.append("(").append(extractYFromKeyInSQL).append(">=").append(rect.top).append(rect.top >= rect.bottom ? " or " : " and ").append(extractYFromKeyInSQL).append("<=").append(rect.bottom).append(")");
            }
        }
        sb.append(')');
        return sb;
    }

    protected StringBuilder getWhereClause(int i, Collection<Rect> collection, Collection<Rect> collection2) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append((CharSequence) getWhereClause(i, null));
        String str = "";
        if (collection != null && collection.size() > 0) {
            sb.append(" and (");
            Iterator<Rect> it = collection.iterator();
            String str2 = "";
            while (it.hasNext()) {
                sb.append(str2).append('(').append((CharSequence) getWhereClause(i, it.next())).append(')');
                str2 = " or ";
            }
            sb.append(")");
        }
        if (collection2 != null && collection2.size() > 0) {
            sb.append(" and not(");
            Iterator<Rect> it2 = collection2.iterator();
            while (it2.hasNext()) {
                sb.append(str).append('(').append((CharSequence) getWhereClause(i, it2.next())).append(')');
                str = " or ";
            }
            sb.append(")");
        }
        sb.append(')');
        return sb;
    }

    public long delete(String str, int i, Collection<Rect> collection, Collection<Rect> collection2) {
        try {
            SQLiteDatabase db = getDb();
            if (db != null && db.isOpen()) {
                return db.delete("tiles", ((Object) getWhereClause(i, collection, collection2)) + (str != null ? " and provider=?" : ""), str != null ? new String[]{str} : null);
            }
            return -1L;
        } catch (Exception e) {
            this.catchException(e);
            return 0L;
        }
    }
}
