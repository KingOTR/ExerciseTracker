package org.mapsforge.map.android.util;

import android.app.Activity;
import android.os.Bundle;
import com.google.common.base.Ascii;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;
import org.mapsforge.map.android.view.MapView;
import org.mapsforge.map.datastore.MapDataStore;
import org.mapsforge.map.layer.cache.TileCache;
import org.mapsforge.map.layer.hills.HillsRenderConfig;
import org.mapsforge.map.model.IMapViewPosition;
import org.mapsforge.map.model.common.PreferencesFacade;
import org.mapsforge.map.reader.MapFile;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderThemeStyleMenu;

/* loaded from: classes5.dex */
public abstract class MapViewerTemplate extends Activity {
    protected MapView mapView;
    protected PreferencesFacade preferencesFacade;
    protected XmlRenderThemeStyleMenu renderThemeStyleMenu;
    protected List<TileCache> tileCaches = new ArrayList();

    protected abstract void createLayers();

    protected abstract void createTileCaches();

    protected HillsRenderConfig getHillsRenderConfig() {
        return null;
    }

    protected abstract int getLayoutId();

    protected abstract String getMapFileName();

    protected abstract int getMapViewId();

    protected float getMaxTextWidthFactor() {
        return 0.7f;
    }

    protected abstract XmlRenderTheme getRenderTheme();

    protected float getScreenRatio() {
        return 1.0f;
    }

    protected byte getZoomLevelDefault() {
        return Ascii.FF;
    }

    protected byte getZoomLevelMax() {
        return Ascii.CAN;
    }

    protected byte getZoomLevelMin() {
        return (byte) 0;
    }

    protected boolean hasZoomControls() {
        return true;
    }

    protected boolean isZoomControlsAutoHide() {
        return true;
    }

    protected void createControls() {
        initializePosition(this.mapView.getModel().mapViewPosition);
    }

    protected void createMapViews() {
        MapView mapView = getMapView();
        this.mapView = mapView;
        mapView.getModel().init(this.preferencesFacade);
        this.mapView.getMapScaleBar().setVisible(true);
        this.mapView.setBuiltInZoomControls(hasZoomControls());
        this.mapView.getMapZoomControls().setAutoHide(isZoomControlsAutoHide());
        this.mapView.getMapZoomControls().setZoomLevelMin(getZoomLevelMin());
        this.mapView.getMapZoomControls().setZoomLevelMax(getZoomLevelMax());
    }

    protected void createSharedPreferences() {
        this.preferencesFacade = new AndroidPreferences(getSharedPreferences(getPersistableId(), 0));
    }

    protected MapPosition getDefaultInitialPosition() {
        return new MapPosition(new LatLong(0.0d, 0.0d), getZoomLevelDefault());
    }

    protected MapPosition getInitialPosition() {
        MapDataStore mapFile = getMapFile();
        if (mapFile.startPosition() != null) {
            Byte startZoomLevel = mapFile.startZoomLevel();
            if (startZoomLevel == null) {
                startZoomLevel = Byte.valueOf(Ascii.FF);
            }
            return new MapPosition(mapFile.startPosition(), startZoomLevel.byteValue());
        }
        return getDefaultInitialPosition();
    }

    protected File getMapFileDirectory() {
        return getExternalMediaDirs()[0];
    }

    protected MapDataStore getMapFile() {
        return new MapFile(new File(getMapFileDirectory(), getMapFileName()));
    }

    protected String getPersistableId() {
        return getClass().getSimpleName();
    }

    protected IMapViewPosition initializePosition(IMapViewPosition iMapViewPosition) {
        if (iMapViewPosition.getCenter().equals(new LatLong(0.0d, 0.0d))) {
            iMapViewPosition.setMapPosition(getInitialPosition());
        }
        iMapViewPosition.setZoomLevelMax(getZoomLevelMax());
        iMapViewPosition.setZoomLevelMin(getZoomLevelMin());
        return iMapViewPosition;
    }

    protected void checkPermissionsAndCreateLayersAndControls() {
        createLayers();
        createControls();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        createSharedPreferences();
        createMapViews();
        createTileCaches();
        checkPermissionsAndCreateLayersAndControls();
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.mapView.getModel().save(this.preferencesFacade);
        this.preferencesFacade.save();
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.mapView.destroyAll();
        AndroidGraphicFactory.clearResourceMemoryCache();
        this.tileCaches.clear();
        super.onDestroy();
    }

    protected void purgeTileCaches() {
        Iterator<TileCache> it = this.tileCaches.iterator();
        while (it.hasNext()) {
            it.next().purge();
        }
        this.tileCaches.clear();
    }

    protected void redrawLayers() {
        this.mapView.getLayerManager().redrawLayers();
    }

    protected void setContentView() {
        setContentView(this.mapView);
    }

    protected MapView getMapView() {
        setContentView(getLayoutId());
        return (MapView) findViewById(getMapViewId());
    }
}
