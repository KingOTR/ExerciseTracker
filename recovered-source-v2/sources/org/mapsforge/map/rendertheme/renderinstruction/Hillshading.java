package org.mapsforge.map.rendertheme.renderinstruction;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.HillshadingBitmap;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.model.Tile;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.hills.HillsRenderConfig;
import org.mapsforge.map.layer.renderer.HillshadingContainer;
import org.mapsforge.map.layer.renderer.ShapePaintContainer;
import org.mapsforge.map.rendertheme.RenderContext;

/* loaded from: classes5.dex */
public class Hillshading {
    private static final Logger LOGGER = Logger.getLogger(Hillshading.class.getName());
    private boolean always;
    private final byte layer;
    private final int level;
    private final float magnitude;
    private final byte maxZoom;
    private final byte minZoom;

    public Hillshading(byte b, byte b2, short s, byte b3, boolean z, int i, GraphicFactory graphicFactory) {
        this.always = z;
        this.level = i;
        this.layer = b3;
        this.minZoom = b;
        this.maxZoom = b2;
        this.magnitude = s;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(RenderContext renderContext, HillsRenderConfig hillsRenderConfig) {
        HillshadingBitmap hillshadingBitmap;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        double d;
        double d2;
        double latitudeToPixelY;
        double longitudeToPixelX;
        double d3;
        double d4;
        float f;
        RenderContext renderContext2;
        Hillshading hillshading = this;
        RenderContext renderContext3 = renderContext;
        if (hillsRenderConfig == null) {
            if (hillshading.always) {
                renderContext3.setDrawingLayers(hillshading.layer);
                renderContext3.addToCurrentDrawingLayer(hillshading.level, new ShapePaintContainer(new HillshadingContainer(null, hillshading.magnitude, null, null), null));
                return;
            }
            return;
        }
        float min = Math.min(Math.max(0.0f, hillshading.magnitude * hillsRenderConfig.getMaginuteScaleFactor()), 255.0f) / 255.0f;
        Tile tile = renderContext3.rendererJob.tile;
        byte b = tile.zoomLevel;
        if (b > hillshading.maxZoom || b < hillshading.minZoom) {
            return;
        }
        Point origin = tile.getOrigin();
        double pixelYToLatitude = MercatorProjection.pixelYToLatitude((long) origin.y, tile.mapSize);
        double pixelXToLongitude = MercatorProjection.pixelXToLongitude((long) origin.x, tile.mapSize);
        double pixelYToLatitude2 = MercatorProjection.pixelYToLatitude(((long) origin.y) + tile.tileSize, tile.mapSize);
        double pixelXToLongitude2 = MercatorProjection.pixelXToLongitude(((long) origin.x) + tile.tileSize, tile.mapSize);
        double d5 = pixelXToLongitude2;
        double d6 = tile.tileSize / (pixelYToLatitude - pixelYToLatitude2);
        double d7 = tile.tileSize / (pixelXToLongitude2 - pixelXToLongitude);
        if (d5 < pixelXToLongitude) {
            d5 += tile.mapSize;
        }
        int floor = (int) Math.floor(pixelXToLongitude);
        while (true) {
            int i6 = floor;
            double d8 = i6;
            if (d8 > d5) {
                return;
            }
            int floor2 = (int) Math.floor(pixelYToLatitude2);
            while (true) {
                double d9 = floor2;
                if (d9 <= pixelYToLatitude) {
                    int i7 = i6 + 1;
                    int i8 = floor2 + 1;
                    float f2 = min;
                    double d10 = d8;
                    try {
                        hillshadingBitmap = hillsRenderConfig.getShadingTile(floor2, i6, d6, d7);
                    } catch (Exception e) {
                        LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
                        hillshadingBitmap = null;
                    }
                    if (hillshadingBitmap != null || hillshading.always) {
                        if (hillshadingBitmap != null) {
                            i = hillshadingBitmap.getPadding();
                            int i9 = i * 2;
                            i2 = hillshadingBitmap.getWidth() - i9;
                            i3 = hillshadingBitmap.getHeight() - i9;
                        } else {
                            i = 0;
                            i2 = 1;
                            i3 = 1;
                        }
                        double d11 = i;
                        int i10 = i;
                        double d12 = i2;
                        double d13 = d11 + d12;
                        HillshadingBitmap hillshadingBitmap2 = hillshadingBitmap;
                        double d14 = i3;
                        double d15 = d11 + d14;
                        int i11 = i2;
                        double d16 = tile.tileSize;
                        double d17 = tile.tileSize;
                        double d18 = i8;
                        if (d18 > pixelYToLatitude) {
                            i4 = i8;
                            i5 = i6;
                            d = d12;
                            d2 = (((d18 - pixelYToLatitude) / 1) * d14) + d11;
                        } else {
                            i4 = i8;
                            i5 = i6;
                            d = d12;
                            if (pixelYToLatitude > d18) {
                                latitudeToPixelY = MercatorProjection.latitudeToPixelY(d18 + (0.0d / d14), tile.mapSize) - origin.y;
                                d2 = d11;
                                if (d9 >= pixelYToLatitude2) {
                                    d15 = (i10 + i3) - (((pixelYToLatitude2 - d9) / 1) * d14);
                                } else if (pixelYToLatitude2 < d9) {
                                    d17 = MercatorProjection.latitudeToPixelY(d9 + (0.0d / d14), tile.mapSize) - origin.y;
                                }
                                double d19 = d15;
                                if (d10 >= pixelXToLongitude) {
                                    d11 += d * ((pixelXToLongitude - d10) / 1);
                                } else if (pixelXToLongitude < d10) {
                                    longitudeToPixelX = MercatorProjection.longitudeToPixelX(d10 + (0.0d / d), tile.mapSize) - origin.x;
                                    d3 = d11;
                                    d4 = i7;
                                    if (d4 > d5) {
                                        d13 = (i10 + i11) - (d * ((d4 - d5) / 1));
                                    } else if (d5 > d4) {
                                        d16 = MercatorProjection.longitudeToPixelX(d4 + (0.0d / d14), tile.mapSize) - origin.x;
                                    }
                                    f = f2;
                                    HillshadingContainer hillshadingContainer = new HillshadingContainer(hillshadingBitmap2, f, hillshadingBitmap2 == null ? null : new Rectangle(d3, d2, d13, d19), new Rectangle(longitudeToPixelX, latitudeToPixelY, d16, d17));
                                    hillshading = this;
                                    renderContext2 = renderContext;
                                    floor2 = i4;
                                    renderContext2.setDrawingLayers(hillshading.layer);
                                    renderContext2.addToCurrentDrawingLayer(hillshading.level, new ShapePaintContainer(hillshadingContainer, null));
                                }
                                d3 = d11;
                                longitudeToPixelX = 0.0d;
                                d4 = i7;
                                if (d4 > d5) {
                                }
                                f = f2;
                                HillshadingContainer hillshadingContainer2 = new HillshadingContainer(hillshadingBitmap2, f, hillshadingBitmap2 == null ? null : new Rectangle(d3, d2, d13, d19), new Rectangle(longitudeToPixelX, latitudeToPixelY, d16, d17));
                                hillshading = this;
                                renderContext2 = renderContext;
                                floor2 = i4;
                                renderContext2.setDrawingLayers(hillshading.layer);
                                renderContext2.addToCurrentDrawingLayer(hillshading.level, new ShapePaintContainer(hillshadingContainer2, null));
                            } else {
                                d2 = d11;
                            }
                        }
                        latitudeToPixelY = 0.0d;
                        if (d9 >= pixelYToLatitude2) {
                        }
                        double d192 = d15;
                        if (d10 >= pixelXToLongitude) {
                        }
                        d3 = d11;
                        longitudeToPixelX = 0.0d;
                        d4 = i7;
                        if (d4 > d5) {
                        }
                        f = f2;
                        HillshadingContainer hillshadingContainer22 = new HillshadingContainer(hillshadingBitmap2, f, hillshadingBitmap2 == null ? null : new Rectangle(d3, d2, d13, d192), new Rectangle(longitudeToPixelX, latitudeToPixelY, d16, d17));
                        hillshading = this;
                        renderContext2 = renderContext;
                        floor2 = i4;
                        renderContext2.setDrawingLayers(hillshading.layer);
                        renderContext2.addToCurrentDrawingLayer(hillshading.level, new ShapePaintContainer(hillshadingContainer22, null));
                    } else {
                        renderContext2 = renderContext;
                        floor2 = i8;
                        i5 = i6;
                        f = f2;
                    }
                    min = f;
                    renderContext3 = renderContext2;
                    d8 = d10;
                    i6 = i5;
                }
            }
            floor = i6 + 1;
        }
    }
}
