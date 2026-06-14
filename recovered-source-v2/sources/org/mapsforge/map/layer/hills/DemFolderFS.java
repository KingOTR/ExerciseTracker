package org.mapsforge.map.layer.hills;

import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class DemFolderFS implements DemFolder {
    public final File file;

    public DemFolderFS(File file) {
        this.file = file;
    }

    @Override // org.mapsforge.map.layer.hills.DemFolder
    public Iterable<DemFolder> subs() {
        final File[] listFiles = this.file.listFiles(new FileFilter() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return new Iterable<DemFolder>() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.2
            @Override // java.lang.Iterable
            public Iterator<DemFolder> iterator() {
                return new Iterator<DemFolder>() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.2.1
                    int nextidx = 0;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.nextidx < listFiles.length;
                    }

                    @Override // java.util.Iterator
                    public DemFolder next() {
                        DemFolderFS demFolderFS = new DemFolderFS(listFiles[this.nextidx]);
                        this.nextidx++;
                        return demFolderFS;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    @Override // org.mapsforge.map.layer.hills.DemFolder
    public Iterable<DemFile> files() {
        final File[] listFiles = this.file.listFiles(new FileFilter() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.3
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.isFile();
            }
        });
        if (listFiles == null) {
            return Collections.emptyList();
        }
        return new Iterable<DemFile>() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.4
            @Override // java.lang.Iterable
            public Iterator<DemFile> iterator() {
                return new Iterator<DemFile>() { // from class: org.mapsforge.map.layer.hills.DemFolderFS.4.1
                    int nextidx = 0;

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.nextidx < listFiles.length;
                    }

                    @Override // java.util.Iterator
                    public DemFile next() {
                        DemFileFS demFileFS = new DemFileFS(listFiles[this.nextidx]);
                        this.nextidx++;
                        return demFileFS;
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof DemFolderFS)) {
            return this.file.getAbsolutePath().equals(((DemFolderFS) obj).file.getAbsolutePath());
        }
        return false;
    }
}
