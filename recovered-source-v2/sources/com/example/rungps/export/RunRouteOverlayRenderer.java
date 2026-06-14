package com.example.rungps.export;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.net.Uri;
import androidx.compose.material3.MenuKt;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RunRouteOverlayRenderer.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0005J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\"\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J0\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000b2\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002JB\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001f2\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010 \u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0002J \u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002JB\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J4\u0010*\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0\u00182\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020&H\u0002J\"\u0010.\u001a\u00020/2\u0018\u00100\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0\u00180\u0017H\u0002J0\u00101\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u00102\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00103\u001a\u00020(H\u0002J<\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u00105\u001a\u00020\u0005H\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/example/rungps/export/RunRouteOverlayRenderer;", "", "<init>", "()V", "MAX_DECODE_SIDE", "", "ROUTE_SUPERSAMPLE", "routeColor", "routeOutline", "barFill", "decodeSampledBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "maxSide", "ensureMutableArgb8888", "bitmap", "decodeLegacyBitmap", "render", "base", "latLon", "", "Lkotlin/Pair;", "", "stats", "Lcom/example/rungps/export/RunRouteOverlayRenderer$RunStats;", "drawBottomScrim", "", "canvas", "Landroid/graphics/Canvas;", "w", "", "h", "drawRouteLayer", "dest", "portrait", "", "routeBounds", "Landroid/graphics/RectF;", "drawRoute", "drawEndpoint", "pt", "stroke", "isStart", "buildSmoothPath", "Landroid/graphics/Path;", "points", "drawStatsOverlay", "drawStatBar", "rect", "decimate", "maxPoints", "formatDuration", "", "ms", "", "formatPace", "secondsPerKm", "RunStats", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunRouteOverlayRenderer {
    public static final int $stable = 0;
    private static final int MAX_DECODE_SIDE = 16384;
    private static final int ROUTE_SUPERSAMPLE = 2;
    public static final RunRouteOverlayRenderer INSTANCE = new RunRouteOverlayRenderer();
    private static final int routeColor = Color.parseColor("#00E676");
    private static final int routeOutline = Color.argb(200, 0, 0, 0);
    private static final int barFill = Color.argb(210, 18, 22, 28);

    private RunRouteOverlayRenderer() {
    }

    /* compiled from: RunRouteOverlayRenderer.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/export/RunRouteOverlayRenderer$RunStats;", "", "distanceKm", "", "durationMs", "", "<init>", "(DJ)V", "getDistanceKm", "()D", "getDurationMs", "()J", "paceSecPerKm", "getPaceSecPerKm", "()Ljava/lang/Double;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RunStats {
        public static final int $stable = 0;
        private final double distanceKm;
        private final long durationMs;

        public static /* synthetic */ RunStats copy$default(RunStats runStats, double d, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                d = runStats.distanceKm;
            }
            if ((i & 2) != 0) {
                j = runStats.durationMs;
            }
            return runStats.copy(d, j);
        }

        /* renamed from: component1, reason: from getter */
        public final double getDistanceKm() {
            return this.distanceKm;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        public final RunStats copy(double distanceKm, long durationMs) {
            return new RunStats(distanceKm, durationMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RunStats)) {
                return false;
            }
            RunStats runStats = (RunStats) other;
            return Double.compare(this.distanceKm, runStats.distanceKm) == 0 && this.durationMs == runStats.durationMs;
        }

        public int hashCode() {
            return (Double.hashCode(this.distanceKm) * 31) + Long.hashCode(this.durationMs);
        }

        public String toString() {
            return "RunStats(distanceKm=" + this.distanceKm + ", durationMs=" + this.durationMs + ")";
        }

        public RunStats(double d, long j) {
            this.distanceKm = d;
            this.durationMs = j;
        }

        public final double getDistanceKm() {
            return this.distanceKm;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final Double getPaceSecPerKm() {
            double d = this.distanceKm;
            if (d >= 0.01d) {
                return Double.valueOf((this.durationMs / 1000.0d) / d);
            }
            return null;
        }
    }

    public static /* synthetic */ Bitmap decodeSampledBitmap$default(RunRouteOverlayRenderer runRouteOverlayRenderer, Context context, Uri uri, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 16384;
        }
        return runRouteOverlayRenderer.decodeSampledBitmap(context, uri, i);
    }

    public final Bitmap decodeSampledBitmap(Context context, Uri uri, final int maxSide) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            RunRouteOverlayRenderer runRouteOverlayRenderer = this;
            ImageDecoder.Source createSource = ImageDecoder.createSource(context.getContentResolver(), uri);
            Intrinsics.checkNotNullExpressionValue(createSource, "createSource(...)");
            Bitmap decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: com.example.rungps.export.RunRouteOverlayRenderer$$ExternalSyntheticLambda0
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    RunRouteOverlayRenderer.decodeSampledBitmap$lambda$1$lambda$0(maxSide, imageDecoder, imageInfo, source);
                }
            });
            Intrinsics.checkNotNullExpressionValue(decodeBitmap, "decodeBitmap(...)");
            return ensureMutableArgb8888(decodeBitmap);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = null;
            }
            Object obj = (Void) m7905constructorimpl;
            return obj != null ? (Bitmap) obj : this.decodeLegacyBitmap(context, uri, maxSide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decodeSampledBitmap$lambda$1$lambda$0(int i, ImageDecoder decoder, ImageDecoder.ImageInfo info, ImageDecoder.Source source) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(source, "<unused var>");
        decoder.setAllocator(0);
        int width = info.getSize().getWidth();
        int height = info.getSize().getHeight();
        int max = Math.max(width, height);
        if (max > i) {
            float f = i / max;
            decoder.setTargetSize(RangesKt.coerceAtLeast(MathKt.roundToInt(width * f), 1), RangesKt.coerceAtLeast(MathKt.roundToInt(height * f), 1));
        }
        ColorSpace colorSpace = info.getColorSpace();
        if (colorSpace != null) {
            decoder.setTargetColorSpace(colorSpace);
        }
    }

    private final Bitmap ensureMutableArgb8888(Bitmap bitmap) {
        Bitmap copy;
        if ((bitmap.isMutable() && bitmap.getConfig() == Bitmap.Config.ARGB_8888) || (copy = bitmap.copy(Bitmap.Config.ARGB_8888, true)) == null) {
            return bitmap;
        }
        if (copy != bitmap) {
            bitmap.recycle();
        }
        return copy;
    }

    private final Bitmap decodeLegacyBitmap(Context context, Uri uri, int maxSide) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            InputStream inputStream = openInputStream;
            try {
                byte[] readBytes = ByteStreamsKt.readBytes(inputStream);
                CloseableKt.closeFinally(inputStream, null);
                if (readBytes == null || readBytes.length == 0) {
                    return null;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = 1;
                options.inJustDecodeBounds = true;
                options.inScaled = false;
                BitmapFactory.decodeByteArray(readBytes, 0, readBytes.length, options);
                if (options.outWidth <= 0 || options.outHeight <= 0) {
                    return null;
                }
                while (Math.max(options.outWidth, options.outHeight) / i > maxSide) {
                    i *= 2;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i;
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options2.inScaled = false;
                options2.inPremultiplied = false;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(readBytes, 0, readBytes.length, options2);
                if (decodeByteArray == null) {
                    return null;
                }
                return ensureMutableArgb8888(decodeByteArray);
            } finally {
            }
        }
        return null;
    }

    public final Bitmap render(Bitmap base, List<Pair<Double, Double>> latLon, RunStats stats) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(latLon, "latLon");
        Intrinsics.checkNotNullParameter(stats, "stats");
        int width = base.getWidth();
        int height = base.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        paint.setFilterBitmap(false);
        paint.setDither(false);
        canvas.drawBitmap(base, 0.0f, 0.0f, paint);
        float f = width;
        float f2 = height;
        boolean z = f2 >= f;
        drawBottomScrim(canvas, f, f2);
        if (latLon.size() >= 2) {
            drawRouteLayer(canvas, decimate(latLon, 600), width, height, z);
        }
        drawStatsOverlay(canvas, stats, f, f2, z);
        return createBitmap;
    }

    private final void drawBottomScrim(Canvas canvas, float w, float h) {
        Paint paint = new Paint(1);
        float f = h - (0.22f * h);
        paint.setShader(new LinearGradient(0.0f, f, 0.0f, h, new int[]{0, Color.argb(100, 0, 0, 0)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, f, w, h, paint);
    }

    private final void drawRouteLayer(Canvas dest, List<Pair<Double, Double>> latLon, int w, int h, boolean portrait) {
        int i = w * 2;
        int i2 = h * 2;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        drawRoute(new Canvas(createBitmap), latLon, i, i2, portrait);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, w, h, true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        createBitmap.recycle();
        Paint paint = new Paint(3);
        paint.setFilterBitmap(true);
        dest.drawBitmap(createScaledBitmap, 0.0f, 0.0f, paint);
        createScaledBitmap.recycle();
    }

    private final RectF routeBounds(float w, float h, boolean portrait) {
        float f = 0.04f * w;
        return new RectF(f, 0.06f * h, w - f, (h - (0.13f * h)) - (h * 0.03f));
    }

    private final void drawRoute(Canvas canvas, List<Pair<Double, Double>> latLon, float w, float h, boolean portrait) {
        RectF routeBounds = routeBounds(w, h, portrait);
        float width = routeBounds.width();
        float height = routeBounds.height();
        List<Pair<Double, Double>> list = latLon;
        Iterator<T> it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue = ((Number) ((Pair) it.next()).getFirst()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, ((Number) ((Pair) it.next()).getFirst()).doubleValue());
        }
        Iterator<T> it2 = list.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue2 = ((Number) ((Pair) it2.next()).getFirst()).doubleValue();
        while (it2.hasNext()) {
            doubleValue2 = Math.max(doubleValue2, ((Number) ((Pair) it2.next()).getFirst()).doubleValue());
        }
        Iterator<T> it3 = list.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue3 = ((Number) ((Pair) it3.next()).getSecond()).doubleValue();
        while (it3.hasNext()) {
            doubleValue3 = Math.min(doubleValue3, ((Number) ((Pair) it3.next()).getSecond()).doubleValue());
        }
        Iterator it4 = list.iterator();
        if (!it4.hasNext()) {
            throw new NoSuchElementException();
        }
        double doubleValue4 = ((Number) ((Pair) it4.next()).getSecond()).doubleValue();
        while (it4.hasNext()) {
            doubleValue4 = Math.max(doubleValue4, ((Number) ((Pair) it4.next()).getSecond()).doubleValue());
            it4 = it4;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(doubleValue2 - doubleValue, 1.0E-5d);
        double coerceAtLeast2 = RangesKt.coerceAtLeast(doubleValue4 - doubleValue3, 1.0E-5d);
        double d = coerceAtLeast2 / coerceAtLeast;
        float f = width * 0.98f;
        float f2 = 0.98f * height;
        if (d > width / height) {
            f2 = f / ((float) d);
        } else {
            f = f2 * ((float) d);
        }
        float f3 = f;
        float f4 = routeBounds.left + ((width - f3) / 2.0f);
        float f5 = routeBounds.top + ((height - f2) / 2.0f);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it5 = list.iterator();
        while (it5.hasNext()) {
            Pair pair = (Pair) it5.next();
            arrayList.add(TuplesKt.to(Float.valueOf(((float) (f3 * ((((Number) pair.component2()).doubleValue() - doubleValue3) / coerceAtLeast2))) + f4), Float.valueOf(((float) (((doubleValue2 - ((Number) pair.component1()).doubleValue()) / coerceAtLeast) * f2)) + f5)));
            coerceAtLeast2 = coerceAtLeast2;
        }
        ArrayList arrayList2 = arrayList;
        Path buildSmoothPath = buildSmoothPath(arrayList2);
        float coerceAtMost = RangesKt.coerceAtMost(Math.max(5.0f, Math.min(w, h) * 0.014f * 2), 32.0f);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f + coerceAtMost);
        paint.setColor(routeOutline);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(coerceAtMost);
        paint2.setColor(routeColor);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        canvas.drawPath(buildSmoothPath, paint);
        canvas.drawPath(buildSmoothPath, paint2);
        drawEndpoint(canvas, (Pair) CollectionsKt.first((List) arrayList2), coerceAtMost, true);
        drawEndpoint(canvas, (Pair) CollectionsKt.last((List) arrayList2), coerceAtMost, false);
    }

    private final void drawEndpoint(Canvas canvas, Pair<Float, Float> pt, float stroke, boolean isStart) {
        float floatValue = pt.component1().floatValue();
        float floatValue2 = pt.component2().floatValue();
        float f = 0.55f * stroke;
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(MenuKt.InTransitionDuration, 0, 0, 0));
        canvas.drawCircle(floatValue, floatValue2, f + 2.0f, paint);
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor(isStart ? "#43A047" : "#E53935"));
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(Math.max(2.0f, stroke * 0.2f));
        paint3.setColor(-1);
        canvas.drawCircle(floatValue, floatValue2, f, paint2);
        canvas.drawCircle(floatValue, floatValue2, f, paint3);
    }

    private final Path buildSmoothPath(List<Pair<Float, Float>> points) {
        Path path = new Path();
        if (points.isEmpty()) {
            return path;
        }
        if (points.size() == 1) {
            path.moveTo(points.get(0).getFirst().floatValue(), points.get(0).getSecond().floatValue());
            return path;
        }
        path.moveTo(points.get(0).getFirst().floatValue(), points.get(0).getSecond().floatValue());
        if (points.size() == 2) {
            path.lineTo(points.get(1).getFirst().floatValue(), points.get(1).getSecond().floatValue());
            return path;
        }
        int size = points.size();
        for (int i = 1; i < size; i++) {
            Pair<Float, Float> pair = points.get(i - 1);
            Pair<Float, Float> pair2 = points.get(i);
            float floatValue = (pair.getFirst().floatValue() + pair2.getFirst().floatValue()) * 0.5f;
            float floatValue2 = (pair.getSecond().floatValue() + pair2.getSecond().floatValue()) * 0.5f;
            if (i == 1) {
                path.lineTo(floatValue, floatValue2);
            } else {
                path.quadTo(pair.getFirst().floatValue(), pair.getSecond().floatValue(), floatValue, floatValue2);
            }
        }
        Pair pair3 = (Pair) CollectionsKt.last((List) points);
        path.lineTo(((Number) pair3.getFirst()).floatValue(), ((Number) pair3.getSecond()).floatValue());
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void drawStatsOverlay(Canvas canvas, RunStats stats, float w, float h, boolean portrait) {
        String str;
        float min = Math.min(w, h) * 0.04f;
        Pair[] pairArr = new Pair[3];
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.2f km", Arrays.copyOf(new Object[]{Double.valueOf(stats.getDistanceKm())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        pairArr[0] = TuplesKt.to("DISTANCE", format);
        pairArr[1] = TuplesKt.to("TIME", formatDuration(stats.getDurationMs()));
        Double paceSecPerKm = stats.getPaceSecPerKm();
        if (paceSecPerKm != null) {
            str = INSTANCE.formatPace(paceSecPerKm.doubleValue());
        }
        str = "—";
        pairArr[2] = TuplesKt.to("PACE", str);
        List listOf = CollectionsKt.listOf((Object[]) pairArr);
        float min2 = Math.min(w, h) * (portrait ? 0.038f : 0.042f);
        float f = 0.42f * min2;
        float f2 = 1.15f * min;
        float f3 = 0.65f * min;
        Paint paint = new Paint(1);
        paint.setColor(Color.argb(170, 200, 210, 220));
        paint.setTextSize(f);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setLetterSpacing(0.1f);
        Paint paint2 = new Paint(1);
        paint2.setColor(-1);
        paint2.setTextSize(min2);
        paint2.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD, 1));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        Paint.FontMetrics fontMetrics2 = paint2.getFontMetrics();
        float f4 = fontMetrics.descent - fontMetrics.ascent;
        float f5 = fontMetrics2.descent - fontMetrics2.ascent;
        float f6 = f * 0.45f;
        float f7 = f4 + f6 + f5;
        float f8 = (f3 * 2.0f) + f7;
        if (portrait) {
            float f9 = h - min;
            RectF rectF = new RectF(min, f9 - f8, w - min, f9);
            drawStatBar(canvas, rectF);
            float width = rectF.width() / 3.0f;
            float f10 = (rectF.bottom - f3) - fontMetrics2.descent;
            float f11 = ((f10 - f5) - f6) - fontMetrics.descent;
            int i = 0;
            for (Object obj : listOf) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str2 = (String) pair.component1();
                String str3 = (String) pair.component2();
                float f12 = rectF.left + (i * width) + (0.5f * width);
                canvas.drawText(str2, f12 - (paint.measureText(str2) / 2.0f), f11, paint);
                canvas.drawText(str3, f12 - (paint2.measureText(str3) / 2.0f), f10, paint2);
                i = i2;
            }
            return;
        }
        List<Pair> list = listOf;
        float f13 = 0.0f;
        for (Iterator it = list.iterator(); it.hasNext(); it = it) {
            f13 = Math.max(f13, paint2.measureText((String) ((Pair) it.next()).component2()));
        }
        float f14 = h - min;
        RectF rectF2 = new RectF(min, f14 - f8, f13 + (2.0f * f2) + min, f14);
        drawStatBar(canvas, rectF2);
        float f15 = (rectF2.bottom - f3) - fontMetrics2.descent;
        for (Pair pair2 : list) {
            String str4 = (String) pair2.component1();
            String str5 = (String) pair2.component2();
            canvas.drawText(str4, rectF2.left + f2, ((f15 - f5) - f6) - fontMetrics.descent, paint);
            canvas.drawText(str5, rectF2.left + f2, f15, paint2);
            f15 -= f7 + (0.35f * f3);
        }
    }

    private final void drawStatBar(Canvas canvas, RectF rect) {
        float coerceIn = RangesKt.coerceIn(rect.height() * 0.28f, 14.0f, 28.0f);
        Paint paint = new Paint(1);
        paint.setColor(barFill);
        canvas.drawRoundRect(rect, coerceIn, coerceIn, paint);
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.0f);
        paint2.setColor(Color.argb(40, 255, 255, 255));
        Unit unit = Unit.INSTANCE;
        canvas.drawRoundRect(rect, coerceIn, coerceIn, paint2);
    }

    private final List<Pair<Double, Double>> decimate(List<Pair<Double, Double>> latLon, int maxPoints) {
        if (latLon.size() <= maxPoints) {
            return latLon;
        }
        float size = latLon.size() / maxPoints;
        ArrayList arrayList = new ArrayList(maxPoints + 2);
        arrayList.add(CollectionsKt.first((List) latLon));
        for (float f = size; f < latLon.size() - 1; f += size) {
            arrayList.add(latLon.get(RangesKt.coerceIn((int) f, 0, CollectionsKt.getLastIndex(latLon))));
        }
        arrayList.add(CollectionsKt.last((List) latLon));
        return arrayList;
    }

    private final String formatDuration(long ms) {
        long coerceAtLeast = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 3600;
        long j2 = coerceAtLeast / j;
        long j3 = 60;
        long j4 = (coerceAtLeast % j) / j3;
        long j5 = coerceAtLeast % j3;
        if (j2 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j5)}, 3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.US, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    private final String formatPace(double secondsPerKm) {
        int roundToInt = MathKt.roundToInt(RangesKt.coerceAtLeast(secondsPerKm, 0.0d));
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%d:%02d /km", Arrays.copyOf(new Object[]{Integer.valueOf(roundToInt / 60), Integer.valueOf(roundToInt % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
