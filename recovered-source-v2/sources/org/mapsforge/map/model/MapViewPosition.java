package org.mapsforge.map.model;

import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.model.common.Observable;
import org.mapsforge.map.model.common.Persistable;
import org.mapsforge.map.model.common.PreferencesFacade;
import org.mapsforge.map.util.PausableThread;

/* loaded from: classes5.dex */
public class MapViewPosition extends Observable implements IMapViewPosition, Persistable {
    private static final String LATITUDE = "latitude";
    private static final String LATITUDE_MAX = "latitudeMax";
    private static final String LATITUDE_MIN = "latitudeMin";
    private static final String LONGITUDE = "longitude";
    private static final String LONGITUDE_MAX = "longitudeMax";
    private static final String LONGITUDE_MIN = "longitudeMin";
    private static final String ZOOM_LEVEL = "zoomLevel";
    private static final String ZOOM_LEVEL_MAX = "zoomLevelMax";
    private static final String ZOOM_LEVEL_MIN = "zoomLevelMin";
    private final Animator animator;
    private final DisplayModel displayModel;
    private double latitude;
    private double longitude;
    private BoundingBox mapLimit;
    private LatLong pivot;
    private double scaleFactor;
    private byte zoomLevel;
    private byte zoomLevelMax = Byte.MAX_VALUE;
    private byte zoomLevelMin;

    private class Animator extends PausableThread {
        private static final int DEFAULT_DURATION = 250;
        private static final int DEFAULT_MOVE_STEPS = 25;
        private static final int FRAME_LENGTH_IN_MS = 15;
        private long mapSize;
        private int moveSteps;
        private double scaleDifference;
        private double startScaleFactor;
        private double targetPixelX;
        private double targetPixelY;
        private long timeEnd;
        private long timeStart;
        private boolean zoomAnimation;

        private Animator() {
        }

        private double calculateScaleFactor(float f) {
            return this.startScaleFactor + (this.scaleDifference * f);
        }

        @Override // org.mapsforge.map.util.PausableThread
        protected void doWork() throws InterruptedException {
            doWorkMove();
            doWorkZoom();
            sleep(15L);
        }

        private void doWorkMove() {
            if (this.moveSteps == 0) {
                return;
            }
            double longitudeToPixelX = MercatorProjection.longitudeToPixelX(MapViewPosition.this.longitude, this.mapSize);
            double latitudeToPixelY = MercatorProjection.latitudeToPixelY(MapViewPosition.this.latitude, this.mapSize);
            double abs = Math.abs(this.targetPixelX - longitudeToPixelX) / this.moveSteps;
            double abs2 = Math.abs(this.targetPixelY - latitudeToPixelY) / this.moveSteps;
            this.moveSteps--;
            MapViewPosition.this.moveCenter(abs * Math.signum(longitudeToPixelX - this.targetPixelX), abs2 * Math.signum(latitudeToPixelY - this.targetPixelY));
        }

        private void doWorkZoom() throws InterruptedException {
            if (this.zoomAnimation) {
                if (System.currentTimeMillis() >= this.timeEnd) {
                    this.zoomAnimation = false;
                    MapViewPosition.this.setScaleFactor(calculateScaleFactor(1.0f));
                    MapViewPosition.this.setPivot(null);
                } else {
                    MapViewPosition.this.setScaleFactor(calculateScaleFactor((System.currentTimeMillis() - this.timeStart) / 250.0f));
                }
            }
        }

        @Override // org.mapsforge.map.util.PausableThread
        protected PausableThread.ThreadPriority getThreadPriority() {
            return PausableThread.ThreadPriority.ABOVE_NORMAL;
        }

        @Override // org.mapsforge.map.util.PausableThread
        protected boolean hasWork() {
            return this.moveSteps > 0 || this.zoomAnimation;
        }

        void startAnimationMove(LatLong latLong) {
            this.mapSize = MercatorProjection.getMapSize(MapViewPosition.this.zoomLevel, MapViewPosition.this.displayModel.getTileSize());
            this.targetPixelX = MercatorProjection.longitudeToPixelX(latLong.longitude, this.mapSize);
            this.targetPixelY = MercatorProjection.latitudeToPixelY(latLong.latitude, this.mapSize);
            this.moveSteps = 25;
            synchronized (this) {
                notify();
            }
        }

        void startAnimationZoom(double d, double d2) {
            this.startScaleFactor = d;
            this.scaleDifference = d2 - d;
            this.zoomAnimation = true;
            long currentTimeMillis = System.currentTimeMillis();
            this.timeStart = currentTimeMillis;
            this.timeEnd = currentTimeMillis + 250;
            synchronized (this) {
                notify();
            }
        }
    }

    private static boolean isNan(double... dArr) {
        for (double d : dArr) {
            if (Double.isNaN(d)) {
                return true;
            }
        }
        return false;
    }

    public MapViewPosition(DisplayModel displayModel) {
        this.displayModel = displayModel;
        Animator animator = new Animator();
        this.animator = animator;
        animator.start();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void animateTo(LatLong latLong) {
        this.animator.startAnimationMove(latLong);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public boolean animationInProgress() {
        return this.scaleFactor != MercatorProjection.zoomLevelToScaleFactor(this.zoomLevel);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void destroy() {
        this.animator.finish();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized LatLong getCenter() {
        return new LatLong(this.latitude, this.longitude);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized BoundingBox getMapLimit() {
        return this.mapLimit;
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized MapPosition getMapPosition() {
        return new MapPosition(getCenter(), this.zoomLevel);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized LatLong getPivot() {
        return this.pivot;
    }

    public synchronized Point getPivotXY(byte b) {
        LatLong latLong = this.pivot;
        if (latLong == null) {
            return null;
        }
        return MercatorProjection.getPixel(latLong, MercatorProjection.getMapSize(b, this.displayModel.getTileSize()));
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized double getScaleFactor() {
        return this.scaleFactor;
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized byte getZoomLevel() {
        return this.zoomLevel;
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized byte getZoomLevelMax() {
        return this.zoomLevelMax;
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public synchronized byte getZoomLevelMin() {
        return this.zoomLevelMin;
    }

    @Override // org.mapsforge.map.model.IMapViewPosition, org.mapsforge.map.model.common.Persistable
    public synchronized void init(PreferencesFacade preferencesFacade) {
        this.latitude = preferencesFacade.getDouble(LATITUDE, 0.0d);
        this.longitude = preferencesFacade.getDouble(LONGITUDE, 0.0d);
        double d = preferencesFacade.getDouble(LATITUDE_MAX, Double.NaN);
        double d2 = preferencesFacade.getDouble(LATITUDE_MIN, Double.NaN);
        double d3 = preferencesFacade.getDouble(LONGITUDE_MAX, Double.NaN);
        double d4 = preferencesFacade.getDouble(LONGITUDE_MIN, Double.NaN);
        if (isNan(d, d2, d3, d4)) {
            this.mapLimit = null;
        } else {
            this.mapLimit = new BoundingBox(d2, d4, d, d3);
        }
        this.zoomLevel = preferencesFacade.getByte(ZOOM_LEVEL, (byte) 0);
        this.zoomLevelMax = preferencesFacade.getByte(ZOOM_LEVEL_MAX, Byte.MAX_VALUE);
        this.zoomLevelMin = preferencesFacade.getByte(ZOOM_LEVEL_MIN, (byte) 0);
        this.scaleFactor = Math.pow(2.0d, this.zoomLevel);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void moveCenter(double d, double d2) {
        moveCenterAndZoom(d, d2, (byte) 0, true);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void moveCenter(double d, double d2, boolean z) {
        moveCenterAndZoom(d, d2, (byte) 0, z);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void moveCenterAndZoom(double d, double d2, byte b) {
        moveCenterAndZoom(d, d2, b, true);
    }

    public void moveCenterAndZoom(double d, double d2, byte b, boolean z) {
        synchronized (this) {
            long mapSize = MercatorProjection.getMapSize(this.zoomLevel, this.displayModel.getTileSize());
            double d3 = mapSize;
            setCenterInternal(MercatorProjection.pixelYToLatitude(Math.min(Math.max(0.0d, MercatorProjection.latitudeToPixelY(this.latitude, mapSize) - d2), d3), mapSize), MercatorProjection.pixelXToLongitude(Math.min(Math.max(0.0d, MercatorProjection.longitudeToPixelX(this.longitude, mapSize) - d), d3), mapSize));
            setZoomLevelInternal(this.zoomLevel + b, z);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition, org.mapsforge.map.model.common.Persistable
    public synchronized void save(PreferencesFacade preferencesFacade) {
        preferencesFacade.putDouble(LATITUDE, this.latitude);
        preferencesFacade.putDouble(LONGITUDE, this.longitude);
        BoundingBox boundingBox = this.mapLimit;
        if (boundingBox == null) {
            preferencesFacade.putDouble(LATITUDE_MAX, Double.NaN);
            preferencesFacade.putDouble(LATITUDE_MIN, Double.NaN);
            preferencesFacade.putDouble(LONGITUDE_MAX, Double.NaN);
            preferencesFacade.putDouble(LONGITUDE_MIN, Double.NaN);
        } else {
            preferencesFacade.putDouble(LATITUDE_MAX, boundingBox.maxLatitude);
            preferencesFacade.putDouble(LATITUDE_MIN, this.mapLimit.minLatitude);
            preferencesFacade.putDouble(LONGITUDE_MAX, this.mapLimit.maxLongitude);
            preferencesFacade.putDouble(LONGITUDE_MIN, this.mapLimit.minLongitude);
        }
        preferencesFacade.putByte(ZOOM_LEVEL, this.zoomLevel);
        preferencesFacade.putByte(ZOOM_LEVEL_MAX, this.zoomLevelMax);
        preferencesFacade.putByte(ZOOM_LEVEL_MIN, this.zoomLevelMin);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setCenter(LatLong latLong) {
        synchronized (this) {
            setCenterInternal(latLong.latitude, latLong.longitude);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setMapLimit(BoundingBox boundingBox) {
        synchronized (this) {
            this.mapLimit = boundingBox;
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setMapPosition(MapPosition mapPosition) {
        setMapPosition(mapPosition, true);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setMapPosition(MapPosition mapPosition, boolean z) {
        synchronized (this) {
            setCenterInternal(mapPosition.latLong.latitude, mapPosition.latLong.longitude);
            setZoomLevelInternal(mapPosition.zoomLevel, z);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setPivot(LatLong latLong) {
        synchronized (this) {
            this.pivot = latLong;
        }
    }

    public void setScaleFactor(double d) {
        synchronized (this) {
            this.scaleFactor = d;
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setScaleFactorAdjustment(double d) {
        synchronized (this) {
            setScaleFactor(Math.pow(2.0d, this.zoomLevel) * d);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setZoomLevel(byte b) {
        setZoomLevel(b, true);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setZoomLevel(byte b, boolean z) {
        if (b < 0) {
            throw new IllegalArgumentException("zoomLevel must not be negative: " + ((int) b));
        }
        synchronized (this) {
            setZoomLevelInternal(b, z);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setZoomLevelMax(byte b) {
        if (b < 0) {
            throw new IllegalArgumentException("zoomLevelMax must not be negative: " + ((int) b));
        }
        synchronized (this) {
            if (b < this.zoomLevelMin) {
                throw new IllegalArgumentException("zoomLevelMax must be >= zoomLevelMin: " + ((int) b));
            }
            this.zoomLevelMax = b;
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void setZoomLevelMin(byte b) {
        if (b < 0) {
            throw new IllegalArgumentException("zoomLevelMin must not be negative: " + ((int) b));
        }
        synchronized (this) {
            if (b > this.zoomLevelMax) {
                throw new IllegalArgumentException("zoomLevelMin must be <= zoomLevelMax: " + ((int) b));
            }
            this.zoomLevelMin = b;
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void zoom(byte b) {
        zoom(b, true);
    }

    public void zoom(byte b, boolean z) {
        synchronized (this) {
            setZoomLevelInternal(this.zoomLevel + b, z);
        }
        notifyObservers();
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void zoomIn() {
        zoomIn(true);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void zoomIn(boolean z) {
        zoom((byte) 1, z);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void zoomOut() {
        zoomOut(true);
    }

    @Override // org.mapsforge.map.model.IMapViewPosition
    public void zoomOut(boolean z) {
        zoom((byte) -1, z);
    }

    private void setCenterInternal(double d, double d2) {
        BoundingBox boundingBox = this.mapLimit;
        if (boundingBox == null) {
            this.latitude = d;
            this.longitude = d2;
        } else {
            this.latitude = Math.max(Math.min(d, boundingBox.maxLatitude), this.mapLimit.minLatitude);
            this.longitude = Math.max(Math.min(d2, this.mapLimit.maxLongitude), this.mapLimit.minLongitude);
        }
    }

    private void setZoomLevelInternal(int i, boolean z) {
        byte max = (byte) Math.max(Math.min(i, (int) this.zoomLevelMax), (int) this.zoomLevelMin);
        this.zoomLevel = max;
        if (z) {
            this.animator.startAnimationZoom(getScaleFactor(), Math.pow(2.0d, this.zoomLevel));
        } else {
            setScaleFactor(Math.pow(2.0d, max));
            setPivot(null);
        }
    }
}
