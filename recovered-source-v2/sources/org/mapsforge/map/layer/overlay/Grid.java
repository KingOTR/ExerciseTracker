package org.mapsforge.map.layer.overlay;

import java.text.DecimalFormat;
import java.util.Map;
import kotlin.text.Typography;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.FontFamily;
import org.mapsforge.core.graphics.FontStyle;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.Layer;
import org.mapsforge.map.model.DisplayModel;

/* loaded from: classes5.dex */
public class Grid extends Layer {
    private final Paint lineBack;
    private final Paint lineFront;
    private final Map<Byte, Double> spacingConfig;
    private final Paint textBack;
    private final Paint textFront;

    private static String convertCoordinate(double d) {
        StringBuilder sb = new StringBuilder();
        if (d < 0.0d) {
            sb.append('-');
            d = -d;
        }
        DecimalFormat decimalFormat = new DecimalFormat("00");
        int floor = (int) Math.floor(d);
        sb.append(decimalFormat.format(floor));
        sb.append(Typography.degree);
        double d2 = (d - floor) * 60.0d;
        int floor2 = (int) Math.floor(d2);
        sb.append(decimalFormat.format(floor2));
        sb.append(Typography.prime);
        sb.append(decimalFormat.format((d2 - floor2) * 60.0d));
        sb.append(Typography.doublePrime);
        return sb.toString();
    }

    private static Paint createLineFront(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.BLUE);
        createPaint.setStrokeWidth(displayModel.getScaleFactor() * 2.0f);
        createPaint.setStyle(Style.STROKE);
        return createPaint;
    }

    private static Paint createLineBack(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.WHITE);
        createPaint.setStrokeWidth(displayModel.getScaleFactor() * 4.0f);
        createPaint.setStyle(Style.STROKE);
        return createPaint;
    }

    private static Paint createTextFront(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.BLUE);
        createPaint.setTypeface(FontFamily.DEFAULT, FontStyle.BOLD);
        createPaint.setTextSize(displayModel.getScaleFactor() * 12.0f);
        return createPaint;
    }

    private static Paint createTextBack(GraphicFactory graphicFactory, DisplayModel displayModel) {
        Paint createPaint = graphicFactory.createPaint();
        createPaint.setColor(Color.WHITE);
        createPaint.setTypeface(FontFamily.DEFAULT, FontStyle.BOLD);
        createPaint.setTextSize(displayModel.getScaleFactor() * 12.0f);
        createPaint.setStrokeWidth(displayModel.getScaleFactor() * 4.0f);
        createPaint.setStyle(Style.STROKE);
        return createPaint;
    }

    public Grid(GraphicFactory graphicFactory, DisplayModel displayModel, Map<Byte, Double> map) {
        this.displayModel = displayModel;
        this.spacingConfig = map;
        this.lineBack = createLineBack(graphicFactory, displayModel);
        this.lineFront = createLineFront(graphicFactory, displayModel);
        this.textBack = createTextBack(graphicFactory, displayModel);
        this.textFront = createTextFront(graphicFactory, displayModel);
    }

    public Grid(DisplayModel displayModel, Map<Byte, Double> map, Paint paint, Paint paint2, Paint paint3, Paint paint4) {
        this.displayModel = displayModel;
        this.spacingConfig = map;
        this.lineBack = paint;
        this.lineFront = paint2;
        this.textBack = paint3;
        this.textFront = paint4;
    }

    @Override // org.mapsforge.map.layer.Layer
    public void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point) {
        Point point2 = point;
        if (this.spacingConfig.containsKey(Byte.valueOf(b))) {
            double doubleValue = this.spacingConfig.get(Byte.valueOf(b)).doubleValue();
            double floor = doubleValue * Math.floor(boundingBox.minLongitude / doubleValue);
            double ceil = doubleValue * Math.ceil(boundingBox.maxLongitude / doubleValue);
            double floor2 = doubleValue * Math.floor(boundingBox.minLatitude / doubleValue);
            double ceil2 = doubleValue * Math.ceil(boundingBox.maxLatitude / doubleValue);
            long mapSize = MercatorProjection.getMapSize(b, this.displayModel.getTileSize());
            int latitudeToPixelY = (int) (MercatorProjection.latitudeToPixelY(floor2, mapSize) - point2.y);
            int latitudeToPixelY2 = (int) (MercatorProjection.latitudeToPixelY(ceil2, mapSize) - point2.y);
            int longitudeToPixelX = (int) (MercatorProjection.longitudeToPixelX(floor, mapSize) - point2.x);
            int longitudeToPixelX2 = (int) (MercatorProjection.longitudeToPixelX(ceil, mapSize) - point2.x);
            double d = floor2;
            while (d <= ceil2) {
                int latitudeToPixelY3 = (int) (MercatorProjection.latitudeToPixelY(d, mapSize) - point2.y);
                canvas.drawLine(longitudeToPixelX, latitudeToPixelY3, longitudeToPixelX2, latitudeToPixelY3, this.lineBack);
                d += doubleValue;
                mapSize = mapSize;
                ceil2 = ceil2;
                point2 = point;
            }
            long j = mapSize;
            double d2 = ceil2;
            double d3 = floor;
            while (d3 <= ceil) {
                int longitudeToPixelX3 = (int) (MercatorProjection.longitudeToPixelX(d3, j) - point.x);
                canvas.drawLine(longitudeToPixelX3, latitudeToPixelY, longitudeToPixelX3, latitudeToPixelY2, this.lineBack);
                d3 += doubleValue;
                j = j;
                ceil = ceil;
            }
            double d4 = ceil;
            long j2 = j;
            for (double d5 = floor2; d5 <= d2; d5 += doubleValue) {
                int latitudeToPixelY4 = (int) (MercatorProjection.latitudeToPixelY(d5, j2) - point.y);
                canvas.drawLine(longitudeToPixelX, latitudeToPixelY4, longitudeToPixelX2, latitudeToPixelY4, this.lineFront);
            }
            for (double d6 = floor; d6 <= d4; d6 += doubleValue) {
                int longitudeToPixelX4 = (int) (MercatorProjection.longitudeToPixelX(d6, j2) - point.x);
                canvas.drawLine(longitudeToPixelX4, latitudeToPixelY, longitudeToPixelX4, latitudeToPixelY2, this.lineFront);
            }
            for (double d7 = floor2; d7 <= d2; d7 += doubleValue) {
                String convertCoordinate = convertCoordinate(d7);
                int width = (canvas.getWidth() - this.textFront.getTextWidth(convertCoordinate)) / 2;
                int latitudeToPixelY5 = ((int) (MercatorProjection.latitudeToPixelY(d7, j2) - point.y)) + (this.textFront.getTextHeight(convertCoordinate) / 2);
                canvas.drawText(convertCoordinate, width, latitudeToPixelY5, this.textBack);
                canvas.drawText(convertCoordinate, width, latitudeToPixelY5, this.textFront);
            }
            for (double d8 = floor; d8 <= d4; d8 += doubleValue) {
                String convertCoordinate2 = convertCoordinate(d8);
                int longitudeToPixelX5 = ((int) (MercatorProjection.longitudeToPixelX(d8, j2) - point.x)) - (this.textFront.getTextWidth(convertCoordinate2) / 2);
                int height = (canvas.getHeight() + this.textFront.getTextHeight(convertCoordinate2)) / 2;
                canvas.drawText(convertCoordinate2, longitudeToPixelX5, height, this.textBack);
                canvas.drawText(convertCoordinate2, longitudeToPixelX5, height, this.textFront);
            }
        }
    }
}
