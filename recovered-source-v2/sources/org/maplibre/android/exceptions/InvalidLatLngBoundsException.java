package org.maplibre.android.exceptions;

/* loaded from: classes5.dex */
public class InvalidLatLngBoundsException extends RuntimeException {
    public InvalidLatLngBoundsException(int i) {
        super("Cannot create a LatLngBounds from " + i + " items");
    }
}
