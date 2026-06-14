package org.maplibre.android;

import org.maplibre.android.http.HttpRequest;

/* loaded from: classes5.dex */
public interface ModuleProvider {
    HttpRequest createHttpRequest();

    LibraryLoaderProvider createLibraryLoaderProvider();
}
