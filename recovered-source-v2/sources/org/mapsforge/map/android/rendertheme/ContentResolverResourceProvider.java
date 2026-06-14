package org.mapsforge.map.android.rendertheme;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mapsforge.core.util.IOUtils;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;
import org.mapsforge.map.rendertheme.XmlUtils;

/* loaded from: classes5.dex */
public class ContentResolverResourceProvider implements XmlThemeResourceProvider {
    private final ContentResolver contentResolver;
    private final boolean isDocumentUri;
    private final Uri relativeRootUri;
    private final Map<String, Uri> resourceUriCache;

    private static class DocumentInfo {
        private final boolean isDirectory;
        private final String name;
        private final Uri uri;

        private DocumentInfo(String str, Uri uri, boolean z) {
            this.name = str;
            this.uri = uri;
            this.isDirectory = z;
        }
    }

    public ContentResolverResourceProvider(ContentResolver contentResolver, Uri uri) {
        this(contentResolver, uri, false);
    }

    public ContentResolverResourceProvider(ContentResolver contentResolver, Uri uri, boolean z) {
        this.resourceUriCache = new HashMap();
        this.contentResolver = contentResolver;
        this.relativeRootUri = uri;
        this.isDocumentUri = z;
        refreshCache();
    }

    private void buildCacheLevel(String str, Uri uri) {
        for (DocumentInfo documentInfo : queryDir(uri)) {
            if (documentInfo.isDirectory) {
                buildCacheLevel(str + documentInfo.name + DomExceptionUtils.SEPARATOR, documentInfo.uri);
            } else {
                this.resourceUriCache.put(XmlUtils.PREFIX_FILE + str + documentInfo.name, documentInfo.uri);
                this.resourceUriCache.put("file:/" + str + documentInfo.name, documentInfo.uri);
            }
        }
    }

    @Override // org.mapsforge.map.rendertheme.XmlThemeResourceProvider
    public InputStream createInputStream(String str, String str2) throws FileNotFoundException {
        Uri uri = this.resourceUriCache.get(str2);
        if (uri != null) {
            return this.contentResolver.openInputStream(uri);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<DocumentInfo> queryDir(Uri uri) {
        if (uri == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        Object[] objArr = 0;
        try {
            Cursor query = this.contentResolver.query(DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri)), new String[]{"document_id", "_display_name", "mime_type"}, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(new DocumentInfo(query.getString(1), DocumentsContract.buildDocumentUriUsingTree(uri, query.getString(0)), "vnd.android.document/directory".equals(query.getString(2))));
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    IOUtils.closeQuietly(cursor);
                    throw th;
                }
            }
            IOUtils.closeQuietly(query);
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void refreshCache() {
        this.resourceUriCache.clear();
        Uri uri = this.relativeRootUri;
        if (uri == null) {
            return;
        }
        if (!this.isDocumentUri) {
            uri = DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        }
        buildCacheLevel("", uri);
    }
}
