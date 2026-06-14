package org.mapsforge.map.layer.hills;

/* loaded from: classes5.dex */
public interface DemFolder {
    Iterable<DemFile> files();

    Iterable<DemFolder> subs();
}
