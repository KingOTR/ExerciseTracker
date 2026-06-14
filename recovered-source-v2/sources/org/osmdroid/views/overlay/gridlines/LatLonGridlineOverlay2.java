package org.osmdroid.views.overlay.gridlines;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import java.text.DecimalFormat;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.LinearRing;
import org.osmdroid.views.overlay.Overlay;

/* loaded from: classes5.dex */
public class LatLonGridlineOverlay2 extends Overlay {
    protected DecimalFormat mDecimalFormatter = new DecimalFormat("#.#####");
    protected float mMultiplier = 1.0f;
    protected Paint mLinePaint = new Paint();
    protected Paint mTextBackgroundPaint = new Paint();
    protected Paint mTextPaint = new Paint();
    protected GeoPoint mOptimizationGeoPoint = new GeoPoint(0.0d, 0.0d);
    protected Point mOptimizationPoint = new Point();

    public LatLonGridlineOverlay2() {
        this.mLinePaint.setAntiAlias(true);
        this.mLinePaint.setStyle(Paint.Style.STROKE);
        this.mTextBackgroundPaint.setStyle(Paint.Style.FILL);
        this.mTextPaint.setAntiAlias(true);
        this.mTextPaint.setStyle(Paint.Style.STROKE);
        this.mTextPaint.setTypeface(Typeface.DEFAULT_BOLD);
        this.mTextPaint.setTextAlign(Paint.Align.CENTER);
        setLineColor(ViewCompat.MEASURED_STATE_MASK);
        setFontColor(-1);
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        setLineWidth(1.0f);
        setFontSizeDp((short) 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0182  */
    @Override // org.osmdroid.views.overlay.Overlay
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, Projection projection) {
        int i;
        float f;
        double d;
        double d2;
        float f2;
        int i2;
        int i3;
        float f3;
        int i4;
        double d3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5;
        if (!isEnabled()) {
            return;
        }
        double incrementor = getIncrementor((int) projection.getZoomLevel());
        double round = incrementor * Math.round(r1.getLongitude() / incrementor);
        double computeStartLatitude = computeStartLatitude(projection.getCurrentCenter().getLatitude(), incrementor);
        double worldMapSize = projection.getWorldMapSize();
        float width = projection.getWidth();
        float height = projection.getHeight();
        float f8 = width / 2.0f;
        float f9 = height / 2.0f;
        float sqrt = (float) Math.sqrt((width * width) + (height * height));
        double d4 = sqrt / 2.0f;
        double d5 = d4 * d4;
        float f10 = width / 5.0f;
        float f11 = height / 5.0f;
        float f12 = (-this.mTextPaint.ascent()) + 0.5f;
        float descent = this.mTextPaint.descent() + 0.5f;
        float f13 = f12 + descent;
        int i6 = 0;
        while (true) {
            if (i6 > 1) {
                return;
            }
            int i7 = 0;
            for (int i8 = 1; i7 <= i8; i8 = 1) {
                float f14 = (i7 == 0 ? 0 : 90) + (-projection.getOrientation());
                int i9 = i6;
                int i10 = 0;
                while (i10 <= 1) {
                    int i11 = i10;
                    double d6 = i10 == 0 ? incrementor : -incrementor;
                    int round2 = i7 == 0 ? Math.round(f9) : Math.round(f8);
                    double d7 = round;
                    double d8 = computeStartLatitude;
                    int i12 = 0;
                    boolean z = true;
                    while (z) {
                        if (i12 > 0) {
                            if (i7 == 1) {
                                d7 += d6;
                                while (d7 < -180.0d) {
                                    d7 += 360.0d;
                                }
                                while (d7 > 180.0d) {
                                    d7 -= 360.0d;
                                }
                            } else {
                                d8 += d6;
                                if (d8 > MapView.getTileSystem().getMaxLatitude()) {
                                    i = round2;
                                    d8 = computeStartLatitude(MapView.getTileSystem().getMinLatitude(), incrementor);
                                } else {
                                    i = round2;
                                    if (d8 < MapView.getTileSystem().getMinLatitude()) {
                                        d8 = computeStartLatitude(MapView.getTileSystem().getMaxLatitude(), incrementor);
                                    }
                                }
                                float f15 = f14;
                                double d9 = d8;
                                double d10 = incrementor;
                                double d11 = d7;
                                this.mOptimizationGeoPoint.setCoords(d9, d11);
                                projection.toPixels(this.mOptimizationGeoPoint, this.mOptimizationPoint);
                                if (i7 != 0) {
                                    int i13 = i;
                                    f3 = height;
                                    d = d11;
                                    i2 = i11;
                                    i3 = i7;
                                    f = sqrt;
                                    d2 = round;
                                    f2 = f15;
                                    this.mOptimizationPoint.y = (int) Math.round(LinearRing.getCloserValue(i13, r4.y, worldMapSize));
                                    if (i12 > 0) {
                                        if (d6 < 0.0d) {
                                            while (this.mOptimizationPoint.y < i13) {
                                                this.mOptimizationPoint.y = (int) (r1.y + worldMapSize);
                                            }
                                        } else {
                                            while (this.mOptimizationPoint.y > i13) {
                                                this.mOptimizationPoint.y = (int) (r1.y - worldMapSize);
                                            }
                                        }
                                    }
                                    i4 = this.mOptimizationPoint.y;
                                } else {
                                    f = sqrt;
                                    d = d11;
                                    d2 = round;
                                    f2 = f15;
                                    i2 = i11;
                                    int i14 = i;
                                    i3 = i7;
                                    f3 = height;
                                    this.mOptimizationPoint.x = (int) Math.round(LinearRing.getCloserValue(i14, r11.x, worldMapSize));
                                    i4 = this.mOptimizationPoint.x;
                                }
                                int i15 = i4;
                                if (i12 == 0 || i2 != 1) {
                                    if (i3 != 0) {
                                        f6 = f8 - f;
                                        f7 = f8 + f;
                                        d3 = (this.mOptimizationPoint.y - f9) * (this.mOptimizationPoint.y - f9);
                                        f4 = this.mOptimizationPoint.y;
                                        f5 = f4;
                                    } else {
                                        d3 = (this.mOptimizationPoint.x - f8) * (this.mOptimizationPoint.x - f8);
                                        f4 = f9 - f;
                                        f5 = f9 + f;
                                        f6 = this.mOptimizationPoint.x;
                                        f7 = f6;
                                    }
                                    z = d3 > d5;
                                    if (z) {
                                        if (i9 == 0) {
                                            canvas.drawLine(f6, f4, f7, f5, this.mLinePaint);
                                        } else {
                                            String formatCoordinate = formatCoordinate(i3 == 0 ? d9 : d, i3 == 0);
                                            float f16 = i3 == 0 ? f10 : f6;
                                            if (i3 != 0) {
                                                f4 = f3 - f11;
                                            }
                                            float measureText = this.mTextPaint.measureText(formatCoordinate) + 0.5f;
                                            if (f2 != 0.0f) {
                                                canvas.save();
                                                canvas.rotate(f2, f16, f4);
                                            }
                                            float f17 = measureText / 2.0f;
                                            float f18 = f13 / 2.0f;
                                            float f19 = f4 + f18;
                                            i5 = i15;
                                            canvas.drawRect(f16 - f17, f4 - f18, f16 + f17, f19, this.mTextBackgroundPaint);
                                            canvas.drawText(formatCoordinate, f16, f19 - descent, this.mTextPaint);
                                            if (f2 != 0.0f) {
                                                canvas.restore();
                                            }
                                            i12++;
                                            f14 = f2;
                                            i7 = i3;
                                            height = f3;
                                            sqrt = f;
                                            round = d2;
                                            round2 = i5;
                                            i11 = i2;
                                            incrementor = d10;
                                            d8 = d9;
                                            d7 = d;
                                        }
                                    }
                                }
                                i5 = i15;
                                i12++;
                                f14 = f2;
                                i7 = i3;
                                height = f3;
                                sqrt = f;
                                round = d2;
                                round2 = i5;
                                i11 = i2;
                                incrementor = d10;
                                d8 = d9;
                                d7 = d;
                            }
                        }
                        i = round2;
                        float f152 = f14;
                        double d92 = d8;
                        double d102 = incrementor;
                        double d112 = d7;
                        this.mOptimizationGeoPoint.setCoords(d92, d112);
                        projection.toPixels(this.mOptimizationGeoPoint, this.mOptimizationPoint);
                        if (i7 != 0) {
                        }
                        int i152 = i4;
                        if (i12 == 0) {
                        }
                        if (i3 != 0) {
                        }
                        if (d3 > d5) {
                        }
                        if (z) {
                        }
                        i5 = i152;
                        i12++;
                        f14 = f2;
                        i7 = i3;
                        height = f3;
                        sqrt = f;
                        round = d2;
                        round2 = i5;
                        i11 = i2;
                        incrementor = d102;
                        d8 = d92;
                        d7 = d;
                    }
                    i10 = i11 + 1;
                    incrementor = incrementor;
                    round = round;
                }
                i7++;
                i6 = i9;
            }
            i6++;
        }
    }

    public void setDecimalFormatter(DecimalFormat decimalFormat) {
        this.mDecimalFormatter = decimalFormat;
    }

    public void setLineColor(int i) {
        this.mLinePaint.setColor(i);
    }

    public void setFontColor(int i) {
        this.mTextPaint.setColor(i);
    }

    public void setFontSizeDp(short s) {
        this.mTextPaint.setTextSize(s);
    }

    public void setTextStyle(Paint.Style style) {
        this.mTextPaint.setStyle(style);
    }

    public void setTextPaint(Paint paint) {
        this.mTextPaint = paint;
    }

    public Paint getTextPaint() {
        return this.mTextPaint;
    }

    public void setBackgroundColor(int i) {
        this.mTextBackgroundPaint.setColor(i);
    }

    public void setLineWidth(float f) {
        this.mLinePaint.setStrokeWidth(f);
    }

    public void setMultiplier(float f) {
        this.mMultiplier = f;
    }

    protected double getIncrementor(int i) {
        double d;
        double d2;
        switch (i) {
            case 0:
            case 1:
                d = this.mMultiplier;
                d2 = 30.0d;
                break;
            case 2:
                d = this.mMultiplier;
                d2 = 15.0d;
                break;
            case 3:
                d = this.mMultiplier;
                d2 = 9.0d;
                break;
            case 4:
                d = this.mMultiplier;
                d2 = 6.0d;
                break;
            case 5:
                d = this.mMultiplier;
                d2 = 3.0d;
                break;
            case 6:
                d = this.mMultiplier;
                d2 = 2.0d;
                break;
            case 7:
                d = this.mMultiplier;
                d2 = 1.0d;
                break;
            case 8:
                d = this.mMultiplier;
                d2 = 0.5d;
                break;
            case 9:
                d = this.mMultiplier;
                d2 = 0.25d;
                break;
            case 10:
                d = this.mMultiplier;
                d2 = 0.1d;
                break;
            case 11:
                d = this.mMultiplier;
                d2 = 0.05d;
                break;
            case 12:
                d = this.mMultiplier;
                d2 = 0.025d;
                break;
            case 13:
                d = this.mMultiplier;
                d2 = 0.0125d;
                break;
            case 14:
                d = this.mMultiplier;
                d2 = 0.00625d;
                break;
            case 15:
                d = this.mMultiplier;
                d2 = 0.003125d;
                break;
            case 16:
                d = this.mMultiplier;
                d2 = 0.0015625d;
                break;
            case 17:
                d = this.mMultiplier;
                d2 = 7.8125E-4d;
                break;
            case 18:
                d = this.mMultiplier;
                d2 = 3.90625E-4d;
                break;
            case 19:
                d = this.mMultiplier;
                d2 = 1.953125E-4d;
                break;
            case 20:
                d = this.mMultiplier;
                d2 = 9.765625E-5d;
                break;
            case 21:
                d = this.mMultiplier;
                d2 = 4.8828125E-5d;
                break;
            case 22:
                d = this.mMultiplier;
                d2 = 2.44140625E-5d;
                break;
            case 23:
                d = this.mMultiplier;
                d2 = 1.220703125E-5d;
                break;
            case 24:
                d = this.mMultiplier;
                d2 = 6.103515625E-6d;
                break;
            case 25:
                d = this.mMultiplier;
                d2 = 3.0517578125E-6d;
                break;
            case 26:
                d = this.mMultiplier;
                d2 = 1.52587890625E-6d;
                break;
            case 27:
                d = this.mMultiplier;
                d2 = 7.62939453125E-7d;
                break;
            case 28:
                d = this.mMultiplier;
                d2 = 3.814697265625E-7d;
                break;
            default:
                d = this.mMultiplier;
                d2 = 1.9073486328125E-7d;
                break;
        }
        return d * d2;
    }

    private double computeStartLatitude(double d, double d2) {
        double round = Math.round(d / d2) * d2;
        while (round > MapView.getTileSystem().getMaxLatitude()) {
            round -= d2;
        }
        while (round < MapView.getTileSystem().getMinLatitude()) {
            round += d2;
        }
        return round;
    }

    private String formatCoordinate(double d, boolean z) {
        String str;
        StringBuilder append = new StringBuilder().append(this.mDecimalFormatter.format(d));
        if (d == 0.0d) {
            str = "";
        } else if (d > 0.0d) {
            str = z ? "N" : ExifInterface.LONGITUDE_EAST;
        } else {
            str = z ? ExifInterface.LATITUDE_SOUTH : ExifInterface.LONGITUDE_WEST;
        }
        return append.append(str).toString();
    }
}
