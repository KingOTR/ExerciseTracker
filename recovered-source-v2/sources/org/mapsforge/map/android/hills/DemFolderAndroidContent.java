package org.mapsforge.map.android.hills;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mapsforge.core.util.IOUtils;
import org.mapsforge.map.layer.hills.DemFile;
import org.mapsforge.map.layer.hills.DemFolder;

/* loaded from: classes5.dex */
public class DemFolderAndroidContent implements DemFolder {
    private List<Entry> children = null;
    private final ContentResolver contentResolver;
    private final Context context;
    private final Uri dirUri;

    public DemFolderAndroidContent(Uri uri, Context context, ContentResolver contentResolver) {
        this.dirUri = uri;
        this.context = context;
        this.contentResolver = contentResolver;
    }

    @Override // org.mapsforge.map.layer.hills.DemFolder
    public Iterable<DemFolder> subs() {
        if (this.children == null) {
            this.children = queryNested();
        }
        return new TransformedIt<DemFolder>(this.children) { // from class: org.mapsforge.map.android.hills.DemFolderAndroidContent.1
            @Override // org.mapsforge.map.android.hills.DemFolderAndroidContent.TransformedIt
            boolean accept(Entry entry) {
                return entry.isDir;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // org.mapsforge.map.android.hills.DemFolderAndroidContent.TransformedIt
            public DemFolder transform(Entry entry) {
                return new DemFolderAndroidContent(entry.uri, DemFolderAndroidContent.this.context, DemFolderAndroidContent.this.contentResolver);
            }
        };
    }

    @Override // org.mapsforge.map.layer.hills.DemFolder
    public Iterable<DemFile> files() {
        if (this.children == null) {
            this.children = queryNested();
        }
        return new TransformedIt<DemFile>(this.children) { // from class: org.mapsforge.map.android.hills.DemFolderAndroidContent.2
            @Override // org.mapsforge.map.android.hills.DemFolderAndroidContent.TransformedIt
            boolean accept(Entry entry) {
                return !entry.isDir;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // org.mapsforge.map.android.hills.DemFolderAndroidContent.TransformedIt
            public DemFile transform(Entry entry) {
                return new DemFileAndroidContent(entry, DemFolderAndroidContent.this.contentResolver);
            }
        };
    }

    abstract class TransformedIt<T> implements Iterable<T> {
        final Iterable<Entry> source;

        abstract boolean accept(Entry entry);

        abstract T transform(Entry entry);

        protected TransformedIt(Iterable<Entry> iterable) {
            this.source = iterable;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return new Iterator<T>() { // from class: org.mapsforge.map.android.hills.DemFolderAndroidContent.TransformedIt.1
                boolean endReached = false;
                final Iterator<Entry> it;
                Entry next;

                {
                    this.it = TransformedIt.this.source.iterator();
                    returnCurrentSetNext();
                }

                Entry returnCurrentSetNext() {
                    Entry entry = this.next;
                    while (true) {
                        if (!this.it.hasNext()) {
                            this.next = null;
                            this.endReached = true;
                            break;
                        }
                        Entry next = this.it.next();
                        this.next = next;
                        if (TransformedIt.this.accept(next)) {
                            break;
                        }
                    }
                    return entry;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return !this.endReached;
                }

                @Override // java.util.Iterator
                public T next() {
                    return (T) TransformedIt.this.transform(returnCurrentSetNext());
                }

                @Override // java.util.Iterator
                public void remove() {
                    this.it.remove();
                }
            };
        }
    }

    static class Entry {
        final boolean isDir;
        final String name;
        final long size;
        final Uri uri;

        private Entry(Uri uri, String str, boolean z, long j) {
            this.uri = uri;
            this.name = str;
            this.isDir = z;
            this.size = j;
        }

        public String toString() {
            return (this.isDir ? "Dir" : "File") + "{name='" + this.name + "'uri=" + this.uri + AbstractJsonLexerKt.END_OBJ;
        }
    }

    private List<Entry> queryNested() {
        Uri uri = this.dirUri;
        if (uri == null) {
            return Collections.emptyList();
        }
        String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
        if (DocumentsContract.isDocumentUri(this.context, this.dirUri)) {
            treeDocumentId = DocumentsContract.getDocumentId(this.dirUri);
        }
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(DocumentsContract.buildDocumentUriUsingTree(this.dirUri, treeDocumentId), treeDocumentId);
        Cursor cursor = null;
        try {
            cursor = this.contentResolver.query(buildChildDocumentsUriUsingTree, new String[]{"document_id", "_display_name", "mime_type", "_size"}, null, null, null);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                arrayList.add(new Entry(DocumentsContract.buildDocumentUriUsingTree(this.dirUri, string), cursor.getString(1), "vnd.android.document/directory".equals(cursor.getString(2)), cursor.getLong(3)));
            }
            return arrayList;
        } finally {
            IOUtils.closeQuietly(cursor);
        }
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof DemFolderAndroidContent)) {
            return this.dirUri.equals(((DemFolderAndroidContent) obj).dirUri);
        }
        return false;
    }
}
