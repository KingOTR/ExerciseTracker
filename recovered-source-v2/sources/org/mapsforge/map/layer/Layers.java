package org.mapsforge.map.layer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;
import org.mapsforge.map.model.DisplayModel;

/* loaded from: classes5.dex */
public class Layers implements Iterable<Layer>, RandomAccess {
    private static final Logger LOGGER = Logger.getLogger(Layers.class.getName());
    private final DisplayModel displayModel;
    private final Map<Integer, Integer> groupIndex = new HashMap();
    private final List<Integer> groupList = new ArrayList();
    private final List<Layer> layersList = new CopyOnWriteArrayList();
    private final Redrawer redrawer;

    private static void checkIsNull(Collection<Layer> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("layers must not be null");
        }
        Iterator<Layer> it = collection.iterator();
        while (it.hasNext()) {
            checkIsNull(it.next());
        }
    }

    private static void checkIsNull(Layer layer) {
        if (layer == null) {
            throw new IllegalArgumentException("layer must not be null");
        }
    }

    Layers(Redrawer redrawer, DisplayModel displayModel) {
        this.redrawer = redrawer;
        this.displayModel = displayModel;
    }

    public synchronized void add(int i, Layer layer) {
        add(i, layer, true);
    }

    public synchronized void add(int i, Layer layer, boolean z) {
        checkIsNull(layer);
        layer.setDisplayModel(this.displayModel);
        this.layersList.add(i, layer);
        layer.assign(this.redrawer);
        if (z) {
            this.redrawer.redrawLayers();
        }
    }

    public synchronized void add(Layer layer) {
        add(layer, true);
    }

    public synchronized void add(Layer layer, boolean z) {
        checkIsNull(layer);
        layer.setDisplayModel(this.displayModel);
        this.layersList.add(layer);
        layer.assign(this.redrawer);
        if (z) {
            this.redrawer.redrawLayers();
        }
    }

    public synchronized void add(Layer layer, int i) {
        add(layer, i, true);
    }

    public synchronized void add(Layer layer, int i, boolean z) {
        int indexOf = this.groupList.indexOf(Integer.valueOf(i));
        if (indexOf < 0) {
            LOGGER.warning("unknown / adding layer group" + i);
            addGroup(i);
        }
        int i2 = indexOf + 1;
        if (i2 == this.groupList.size()) {
            add(layer, z);
        } else {
            add(this.groupIndex.get(this.groupList.get(i2)).intValue(), layer, z);
            while (i2 < this.groupList.size()) {
                int intValue = this.groupList.get(i2).intValue();
                this.groupIndex.put(Integer.valueOf(intValue), Integer.valueOf(this.groupIndex.get(Integer.valueOf(intValue)).intValue() + 1));
                i2++;
            }
        }
    }

    public synchronized boolean addAll(Collection<Layer> collection) {
        return addAll(collection, true);
    }

    public synchronized boolean addAll(Collection<Layer> collection, boolean z) {
        checkIsNull(collection);
        Iterator<Layer> it = collection.iterator();
        while (it.hasNext()) {
            it.next().setDisplayModel(this.displayModel);
        }
        if (!this.layersList.addAll(collection)) {
            return false;
        }
        Iterator<Layer> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().assign(this.redrawer);
        }
        if (z) {
            this.redrawer.redrawLayers();
        }
        return true;
    }

    public synchronized boolean addAll(int i, Collection<Layer> collection) {
        return addAll(i, collection, true);
    }

    public synchronized boolean addAll(int i, Collection<Layer> collection, boolean z) {
        checkIsNull(collection);
        if (!this.layersList.addAll(i, collection)) {
            return false;
        }
        for (Layer layer : collection) {
            layer.setDisplayModel(this.displayModel);
            layer.assign(this.redrawer);
        }
        if (z) {
            this.redrawer.redrawLayers();
        }
        return true;
    }

    public synchronized boolean addAll(Collection<Layer> collection, int i) {
        return addAll(collection, i, true);
    }

    public synchronized boolean addAll(Collection<Layer> collection, int i, boolean z) {
        int indexOf = this.groupList.indexOf(Integer.valueOf(i));
        if (indexOf < 0) {
            LOGGER.warning("unknown / adding layer group" + i);
            addGroup(i);
        }
        int i2 = indexOf + 1;
        if (i2 == this.groupList.size()) {
            return addAll(collection, z);
        }
        if (!addAll(this.groupIndex.get(this.groupList.get(i2)).intValue(), collection, z)) {
            return false;
        }
        while (i2 < this.groupList.size()) {
            int intValue = this.groupList.get(i2).intValue();
            this.groupIndex.put(Integer.valueOf(intValue), Integer.valueOf(this.groupIndex.get(Integer.valueOf(intValue)).intValue() + collection.size()));
            i2++;
        }
        return true;
    }

    public synchronized void addGroup(int i) {
        if (this.groupList.contains(Integer.valueOf(i))) {
            LOGGER.warning("group " + i + " already exists");
        } else {
            this.groupList.add(Integer.valueOf(i));
            this.groupIndex.put(Integer.valueOf(i), Integer.valueOf(this.layersList.size()));
        }
    }

    public synchronized void clear() {
        clear(true);
    }

    public synchronized void clear(boolean z) {
        Iterator<Layer> it = this.layersList.iterator();
        while (it.hasNext()) {
            it.next().unassign();
        }
        this.layersList.clear();
        if (z) {
            this.redrawer.redrawLayers();
        }
    }

    public synchronized boolean contains(Layer layer) {
        checkIsNull(layer);
        return this.layersList.contains(layer);
    }

    public synchronized boolean containsGroup(int i) {
        return this.groupList.contains(Integer.valueOf(i));
    }

    public synchronized Layer get(int i) {
        return this.layersList.get(i);
    }

    public synchronized List<Integer> getGroups() {
        return this.groupList;
    }

    public synchronized int indexOf(Layer layer) {
        checkIsNull(layer);
        return this.layersList.indexOf(layer);
    }

    public synchronized boolean isEmpty() {
        return this.layersList.isEmpty();
    }

    @Override // java.lang.Iterable
    public synchronized Iterator<Layer> iterator() {
        return this.layersList.iterator();
    }

    public synchronized Layer remove(int i) {
        return remove(i, true);
    }

    public synchronized Layer remove(int i, boolean z) {
        Layer remove;
        remove = this.layersList.remove(i);
        remove.unassign();
        for (Integer num : this.groupIndex.keySet()) {
            int intValue = this.groupIndex.get(num).intValue();
            if (intValue > i) {
                this.groupIndex.put(num, Integer.valueOf(intValue - 1));
            }
        }
        if (z) {
            this.redrawer.redrawLayers();
        }
        return remove;
    }

    public synchronized boolean remove(Layer layer) {
        return remove(layer, true);
    }

    public synchronized boolean remove(Layer layer, boolean z) {
        checkIsNull(layer);
        int indexOf = this.layersList.indexOf(layer);
        if (!this.layersList.remove(layer)) {
            return false;
        }
        layer.unassign();
        for (Integer num : this.groupIndex.keySet()) {
            int intValue = this.groupIndex.get(num).intValue();
            if (intValue > indexOf) {
                this.groupIndex.put(num, Integer.valueOf(intValue - 1));
            }
        }
        if (z) {
            this.redrawer.redrawLayers();
        }
        return true;
    }

    public synchronized boolean removeAll(Collection<Layer> collection) {
        return removeAll(collection, true);
    }

    public synchronized boolean removeAll(Collection<Layer> collection, boolean z) {
        checkIsNull(collection);
        int size = collection.size();
        int[] iArr = new int[size];
        Iterator<Layer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = this.layersList.indexOf(it.next());
            i++;
        }
        if (!this.layersList.removeAll(collection)) {
            return false;
        }
        Iterator<Layer> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next().unassign();
        }
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = iArr[i2];
            for (Integer num : this.groupIndex.keySet()) {
                int intValue = this.groupIndex.get(num).intValue();
                if (intValue > i3) {
                    this.groupIndex.put(num, Integer.valueOf(intValue - 1));
                }
            }
        }
        if (z) {
            this.redrawer.redrawLayers();
        }
        return true;
    }

    public synchronized int size() {
        return this.layersList.size();
    }
}
