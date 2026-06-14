package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.UUID;

/* loaded from: classes5.dex */
public class StorageUtils {
    public static final String EXTERNAL_SD_CARD = "externalSdCard";
    public static final String SD_CARD = "sdCard";
    private static final String TAG = "StorageUtils";

    public static class StorageInfo {
        public String displayName;
        public final int display_number;
        public long freeSpace;
        public final boolean internal;
        public final String path;
        public boolean readonly;

        public StorageInfo(String str, boolean z, boolean z2, int i) {
            this.freeSpace = 0L;
            this.path = str;
            this.internal = z;
            this.display_number = i;
            this.freeSpace = new StatFs(str).getAvailableBytes();
            if (!z2) {
                this.readonly = !StorageUtils.isWritable(new File(str));
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("Internal SD card");
            } else if (i > 1) {
                sb.append("SD card ").append(i);
            } else {
                sb.append("SD card");
            }
            if (z2) {
                sb.append(" (Read only)");
            }
            this.displayName = sb.toString();
        }

        public String getDisplayName() {
            return this.displayName;
        }

        public void setDisplayName(String str) {
            this.displayName = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            StorageInfo storageInfo = (StorageInfo) obj;
            if (this.internal != storageInfo.internal || this.readonly != storageInfo.readonly || this.display_number != storageInfo.display_number || this.freeSpace != storageInfo.freeSpace) {
                return false;
            }
            String str = this.path;
            if (str == null ? storageInfo.path != null : !str.equals(storageInfo.path)) {
                return false;
            }
            String str2 = this.displayName;
            return str2 != null ? str2.equals(storageInfo.displayName) : storageInfo.displayName == null;
        }

        public int hashCode() {
            String str = this.path;
            int hashCode = (((((((str != null ? str.hashCode() : 0) * 31) + (this.internal ? 1 : 0)) * 31) + (this.readonly ? 1 : 0)) * 31) + this.display_number) * 31;
            long j = this.freeSpace;
            int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            String str2 = this.displayName;
            return i + (str2 != null ? str2.hashCode() : 0);
        }
    }

    public static List<StorageInfo> getStorageList() {
        return getStorageList(null);
    }

    public static List<StorageInfo> getStorageList(Context context) {
        if (context != null) {
            return getStorageListApi19(context);
        }
        return getStorageListPreApi19();
    }

    private static List<StorageInfo> getStorageListPreApi19() {
        ArrayList arrayList = new ArrayList();
        StorageInfo primarySharedStorage = getPrimarySharedStorage();
        if (primarySharedStorage != null) {
            arrayList.add(primarySharedStorage);
        }
        arrayList.addAll(tryToFindOtherVoIdManagedStorages(primarySharedStorage != null ? primarySharedStorage.path : ""));
        for (File file : getAllWritableStorageLocations()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((StorageInfo) it.next()).path.equals(file.getAbsolutePath())) {
                        break;
                    }
                } else {
                    arrayList.add(new StorageInfo(file.getAbsolutePath(), false, false, -1));
                    break;
                }
            }
        }
        return arrayList;
    }

    private static List<StorageInfo> getStorageListApi19(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new StorageInfo(context.getFilesDir().getAbsolutePath(), true, false, -1));
        ArrayList arrayList2 = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new StorageInfo(((File) it.next()).getAbsolutePath(), false, false, -1));
        }
        return arrayList;
    }

    @Deprecated
    public static File getStorage() {
        return getStorage(null);
    }

    public static StorageInfo getBestWritableStorage() {
        return getBestWritableStorage(null);
    }

    @Deprecated
    public static File getStorage(Context context) {
        StorageInfo bestWritableStorage = getBestWritableStorage(context);
        if (bestWritableStorage != null) {
            return new File(bestWritableStorage.path);
        }
        return null;
    }

    public static StorageInfo getBestWritableStorage(Context context) {
        List<StorageInfo> storageList = getStorageList(context);
        StorageInfo storageInfo = null;
        for (int i = 0; i < storageList.size(); i++) {
            StorageInfo storageInfo2 = storageList.get(i);
            if (!storageInfo2.readonly && isWritable(new File(storageInfo2.path)) && (storageInfo == null || storageInfo.freeSpace < storageInfo2.freeSpace)) {
                storageInfo = storageInfo2;
            }
        }
        return storageInfo;
    }

    @Deprecated
    public static boolean isAvailable() {
        return isPrimarySharedStorageAvailable();
    }

    private static boolean isPrimarySharedStorageAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        return "mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState);
    }

    @Deprecated
    public static String getSdCardPath() {
        return Environment.getExternalStorageDirectory().getPath() + DomExceptionUtils.SEPARATOR;
    }

    @Deprecated
    public static boolean isWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean isWritable(File file) {
        FileOutputStream fileOutputStream = null;
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
            try {
                fileOutputStream2.write("hi".getBytes());
                file2.delete();
                Log.i(TAG, file.getAbsolutePath() + " is writable");
                try {
                    fileOutputStream2.close();
                    return true;
                } catch (IOException unused) {
                    return true;
                }
            } catch (Throwable unused2) {
                fileOutputStream = fileOutputStream2;
                try {
                    Log.i(TAG, file.getAbsolutePath() + " is NOT writable");
                    if (fileOutputStream == null) {
                        return false;
                    }
                    try {
                        fileOutputStream.close();
                        return false;
                    } catch (IOException unused3) {
                        return false;
                    }
                } catch (Throwable th) {
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable unused5) {
        }
    }

    public static Map<String, File> getAllStorageLocations() {
        HashMap hashMap = new HashMap(10);
        hashMap.putAll(tryToGetMountedStoragesFromFilesystem());
        if (!hashMap.containsValue(Environment.getExternalStorageDirectory())) {
            hashMap.put(SD_CARD, Environment.getExternalStorageDirectory());
        }
        for (File file : tryToGetStorageFromSystemEnv()) {
            if (file.exists() && !hashMap.containsValue(file)) {
                hashMap.put(SD_CARD, file);
            }
        }
        return hashMap;
    }

    private static Set<File> getAllWritableStorageLocations() {
        HashSet hashSet = new HashSet();
        for (File file : tryToGetStorageFromSystemEnv()) {
            if (isWritable(file)) {
                hashSet.add(file);
            }
        }
        if (Environment.getExternalStorageDirectory() != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (isWritable(externalStorageDirectory)) {
                hashSet.add(externalStorageDirectory);
            }
        }
        for (File file2 : tryToGetMountedStoragesFromFilesystem().values()) {
            if (isWritable(file2)) {
                hashSet.add(file2);
            }
        }
        return hashSet;
    }

    private static StorageInfo getPrimarySharedStorage() {
        boolean z;
        String str = "";
        try {
            if (Environment.getExternalStorageDirectory() != null) {
                str = Environment.getExternalStorageDirectory().getPath();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean z2 = false;
        boolean z3 = true;
        try {
            z = !Environment.isExternalStorageRemovable();
        } catch (Throwable th2) {
            th2.printStackTrace();
            z = false;
        }
        try {
            z2 = isPrimarySharedStorageAvailable();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            z3 = Environment.getExternalStorageState().equals("mounted_ro");
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (z2) {
            return new StorageInfo(str, z, z3, -1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e8, code lost:
    
        if (r3 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e0, code lost:
    
        r3.close();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00de, code lost:
    
        if (r3 == null) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static List<StorageInfo> tryToFindOtherVoIdManagedStorages(String str) {
        BufferedReader bufferedReader;
        HashSet hashSet;
        BufferedReader bufferedReader2;
        String readLine;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader3 = null;
        BufferedReader bufferedReader4 = null;
        BufferedReader bufferedReader5 = null;
        try {
            try {
                try {
                    hashSet = new HashSet();
                    bufferedReader2 = new BufferedReader(new FileReader("/proc/mounts"));
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FileNotFoundException e) {
                e = e;
            } catch (IOException e2) {
                e = e2;
            }
            try {
                Log.d(TAG, "/proc/mounts");
                int i = 1;
                while (true) {
                    readLine = bufferedReader2.readLine();
                    if (readLine == null) {
                        break;
                    }
                    Log.d(TAG, readLine);
                    if (readLine.contains("vfat") || readLine.contains("/mnt")) {
                        StringTokenizer stringTokenizer = new StringTokenizer(readLine, " ");
                        stringTokenizer.nextToken();
                        String nextToken = stringTokenizer.nextToken();
                        if (!hashSet.contains(nextToken)) {
                            stringTokenizer.nextToken();
                            boolean contains = Arrays.asList(stringTokenizer.nextToken().split(",")).contains("ro");
                            if (nextToken.equals(str)) {
                                hashSet.add(str);
                            } else if (readLine.contains("/dev/block/vold") && !readLine.contains("/mnt/secure") && !readLine.contains("/mnt/asec") && !readLine.contains("/mnt/obb") && !readLine.contains("/dev/mapper") && !readLine.contains("tmpfs")) {
                                hashSet.add(nextToken);
                                if (new File(nextToken + File.separator).exists()) {
                                    int i2 = i + 1;
                                    arrayList.add(new StorageInfo(nextToken, false, contains, i));
                                    i = i2;
                                }
                            }
                        }
                    }
                }
                bufferedReader2.close();
                bufferedReader3 = readLine;
            } catch (FileNotFoundException e3) {
                e = e3;
                bufferedReader4 = bufferedReader2;
                e.printStackTrace();
                bufferedReader3 = bufferedReader4;
                bufferedReader = bufferedReader4;
            } catch (IOException e4) {
                e = e4;
                bufferedReader5 = bufferedReader2;
                e.printStackTrace();
                bufferedReader3 = bufferedReader5;
                bufferedReader = bufferedReader5;
            } catch (Throwable th2) {
                th = th2;
                bufferedReader3 = bufferedReader2;
                if (bufferedReader3 != null) {
                    try {
                        bufferedReader3.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00b6, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x00b4, code lost:
    
        if (r8 != null) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0058, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0064, code lost:
    
        if (r10 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        if (r10 != null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c1, code lost:
    
        if (r8 == null) goto L56;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0188: MOVE (r8 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:126:0x0188 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Map<String, File> tryToGetMountedStoragesFromFilesystem() {
        Scanner scanner;
        Scanner scanner2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(10);
        ArrayList arrayList2 = new ArrayList(10);
        arrayList.add("/mnt/sdcard");
        arrayList2.add("/mnt/sdcard");
        Scanner scanner3 = null;
        try {
            try {
                File file = new File("/proc/mounts");
                if (file.exists()) {
                    scanner = new Scanner(file);
                    while (scanner.hasNext()) {
                        try {
                            String nextLine = scanner.nextLine();
                            if (nextLine.startsWith("/dev/block/vold/")) {
                                String str = nextLine.split(" ")[1];
                                if (!str.equals("/mnt/sdcard")) {
                                    arrayList.add(str);
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                    }
                } else {
                    scanner = null;
                }
            } catch (Throwable th) {
                th = th;
                scanner3 = scanner2;
                if (scanner3 != null) {
                    try {
                        scanner3.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            scanner = null;
        } catch (Throwable th2) {
            th = th2;
            if (scanner3 != null) {
            }
            throw th;
        }
        int i = 0;
        while (i < arrayList.size()) {
            if (!arrayList2.contains((String) arrayList.get(i))) {
                arrayList.remove(i);
                i--;
            }
            i++;
        }
        arrayList2.clear();
        ArrayList arrayList3 = new ArrayList(10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = new File((String) it.next());
            if (file2.exists() && file2.isDirectory() && file2.canWrite()) {
                File[] listFiles = file2.listFiles();
                StringBuilder sb = new StringBuilder("[");
                if (listFiles != null) {
                    for (File file3 : listFiles) {
                        sb.append(file3.getName().hashCode()).append(":").append(file3.length()).append(", ");
                    }
                }
                sb.append("]");
                if (!arrayList3.contains(sb.toString())) {
                    String str2 = "sdCard_" + hashMap.size();
                    if (hashMap.size() == 0) {
                        str2 = SD_CARD;
                    } else if (hashMap.size() == 1) {
                        str2 = EXTERNAL_SD_CARD;
                    }
                    arrayList3.add(sb.toString());
                    hashMap.put(str2, file2);
                }
            }
        }
        return hashMap;
        try {
            try {
                File file4 = new File("/system/etc/vold.fstab");
                if (file4.exists()) {
                    Scanner scanner4 = new Scanner(file4);
                    while (scanner4.hasNext()) {
                        try {
                            String nextLine2 = scanner4.nextLine();
                            if (nextLine2.startsWith("dev_mount")) {
                                String str3 = nextLine2.split(" ")[2];
                                if (str3.contains(":")) {
                                    str3 = str3.substring(0, str3.indexOf(":"));
                                }
                                if (!str3.equals("/mnt/sdcard")) {
                                    arrayList2.add(str3);
                                }
                            }
                        } catch (Exception e3) {
                            e = e3;
                            scanner3 = scanner4;
                            e.printStackTrace();
                        } catch (Throwable th3) {
                            th = th3;
                            scanner3 = scanner4;
                            if (scanner3 != null) {
                                try {
                                    scanner3.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    scanner3 = scanner4;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static Set<File> tryToGetStorageFromSystemEnv() {
        HashSet hashSet = new HashSet();
        String str = System.getenv("EXTERNAL_STORAGE");
        if (str != null) {
            hashSet.add(new File(str + File.separator));
        }
        String str2 = System.getenv("SECONDARY_STORAGE");
        if (str2 != null) {
            for (String str3 : str2.split(File.pathSeparator)) {
                hashSet.add(new File(str3 + File.separator));
            }
        }
        return hashSet;
    }
}
