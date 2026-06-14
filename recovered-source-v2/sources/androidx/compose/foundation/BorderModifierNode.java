package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.maplibre.android.style.layers.Property;

/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", Values.VECTOR_MAP_VECTORS_KEY, "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", Property.ICON_TEXT_FIT_WIDTH, "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brush, Shape shape) {
        this.width = f;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                DrawResult drawContentWithoutBorder;
                DrawResult m253drawRectBorderNsqcLGU;
                DrawResult m256drawRoundRectBorderJqoCqck;
                DrawResult drawGenericBorder;
                if (cacheDrawScope.mo376toPx0680j_4(BorderModifierNode.this.getWidth()) < 0.0f || Size.m3670getMinDimensionimpl(cacheDrawScope.m3492getSizeNHjbRc()) <= 0.0f) {
                    drawContentWithoutBorder = BorderKt.drawContentWithoutBorder(cacheDrawScope);
                    return drawContentWithoutBorder;
                }
                float f2 = 2;
                float min = Math.min(Dp.m6308equalsimpl0(BorderModifierNode.this.getWidth(), Dp.INSTANCE.m6321getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo376toPx0680j_4(BorderModifierNode.this.getWidth())), (float) Math.ceil(Size.m3670getMinDimensionimpl(cacheDrawScope.m3492getSizeNHjbRc()) / f2));
                float f3 = min / f2;
                long Offset = OffsetKt.Offset(f3, f3);
                long Size = SizeKt.Size(Size.m3671getWidthimpl(cacheDrawScope.m3492getSizeNHjbRc()) - min, Size.m3668getHeightimpl(cacheDrawScope.m3492getSizeNHjbRc()) - min);
                boolean z = f2 * min > Size.m3670getMinDimensionimpl(cacheDrawScope.m3492getSizeNHjbRc());
                Outline mo287createOutlinePq9zytI = BorderModifierNode.this.getShape().mo287createOutlinePq9zytI(cacheDrawScope.m3492getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (mo287createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = BorderModifierNode.this;
                    drawGenericBorder = borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) mo287createOutlinePq9zytI, z, min);
                    return drawGenericBorder;
                }
                if (mo287createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = BorderModifierNode.this;
                    m256drawRoundRectBorderJqoCqck = borderModifierNode2.m256drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) mo287createOutlinePq9zytI, Offset, Size, z, min);
                    return m256drawRoundRectBorderJqoCqck;
                }
                if (!(mo287createOutlinePq9zytI instanceof Outline.Rectangle)) {
                    throw new NoWhenBranchMatchedException();
                }
                m253drawRectBorderNsqcLGU = BorderKt.m253drawRectBorderNsqcLGU(cacheDrawScope, BorderModifierNode.this.getBrush(), Offset, Size, z, min);
                return m253drawRectBorderNsqcLGU;
            }
        }));
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m258setWidth0680j_4(float f) {
        if (Dp.m6308equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00db, code lost:
    
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m4058equalsimpl(r14, r5 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m4056boximpl(r5.mo3710getConfig_sVssgQ()) : null) != false) goto L26;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, final Brush brush, final Outline.Generic generic, boolean z, float f) {
        int m4064getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        ?? r12;
        Canvas canvas;
        float f2;
        float f3;
        long j;
        DrawContext drawContext;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    DrawScope.m4388drawPathGBMwjPU$default(contentDrawScope, Outline.Generic.this.getPath(), brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        if (brush instanceof SolidColor) {
            m4064getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4063getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m3884tintxETnrds$default(ColorFilter.INSTANCE, ((SolidColor) brush).getValue(), 0, 2, null);
        } else {
            m4064getArgb8888_sVssgQ = ImageBitmapConfig.INSTANCE.m4064getArgb8888_sVssgQ();
            colorFilter = null;
        }
        final Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path obtainPath = borderCache.obtainPath();
        obtainPath.reset();
        Path.addRect$default(obtainPath, bounds, null, 2, null);
        obtainPath.mo3735opN5in7k0(obtainPath, generic.getPath(), PathOperation.INSTANCE.m4135getDifferenceb3I0S0c());
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final long IntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmap = borderCache2.imageBitmap;
        Canvas canvas2 = borderCache2.canvas;
        ImageBitmapConfig m4056boximpl = imageBitmap != null ? ImageBitmapConfig.m4056boximpl(imageBitmap.mo3710getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m4056boximpl == null ? false : ImageBitmapConfig.m4059equalsimpl0(m4056boximpl.m4062unboximpl(), ImageBitmapConfig.INSTANCE.m4064getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        if (imageBitmap == null || canvas2 == null || Size.m3671getWidthimpl(cacheDrawScope.m3492getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m3668getHeightimpl(cacheDrawScope.m3492getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap m4069ImageBitmapx__hDU$default = ImageBitmapKt.m4069ImageBitmapx__hDU$default(IntSize.m6473getWidthimpl(IntSize), IntSize.m6472getHeightimpl(IntSize), m4064getArgb8888_sVssgQ, false, null, 24, null);
            borderCache2.imageBitmap = m4069ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m4069ImageBitmapx__hDU$default);
            borderCache2.canvas = Canvas;
            r12 = m4069ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r12 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache2.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long m6485toSizeozmzZPI = IntSizeKt.m6485toSizeozmzZPI(IntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density density = drawParams.getDensity();
        LayoutDirection layoutDirection2 = drawParams.getLayoutDirection();
        Canvas canvas3 = drawParams.getCanvas();
        long size = drawParams.getSize();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m4319setSizeuvyYCjk(m6485toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.m4393drawRectnJ9OG0$default(canvasDrawScope3, Color.INSTANCE.m3869getBlack0d7_KjU(), 0L, m6485toSizeozmzZPI, 0.0f, null, null, BlendMode.INSTANCE.m3758getClear0nO6VwU(), 58, null);
        float f4 = -bounds.getLeft();
        float f5 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f4, f5);
        try {
            try {
                DrawScope.m4388drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
                float f6 = 1;
                float m3671getWidthimpl = (Size.m3671getWidthimpl(canvasDrawScope3.mo4399getSizeNHjbRc()) + f6) / Size.m3671getWidthimpl(canvasDrawScope3.mo4399getSizeNHjbRc());
                float m3668getHeightimpl = (Size.m3668getHeightimpl(canvasDrawScope3.mo4399getSizeNHjbRc()) + f6) / Size.m3668getHeightimpl(canvasDrawScope3.mo4399getSizeNHjbRc());
                long mo4398getCenterF1C5BW0 = canvasDrawScope3.mo4398getCenterF1C5BW0();
                DrawContext drawContext2 = canvasDrawScope3.getDrawContext();
                long mo4320getSizeNHjbRc = drawContext2.mo4320getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    drawContext2.getTransform().mo4327scale0AR0LA0(m3671getWidthimpl, m3668getHeightimpl, mo4398getCenterF1C5BW0);
                    drawContext = drawContext2;
                    try {
                        DrawScope.m4388drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, BlendMode.INSTANCE.m3758getClear0nO6VwU(), 28, null);
                        drawContext.getCanvas().restore();
                        drawContext.mo4321setSizeuvyYCjk(mo4320getSizeNHjbRc);
                        canvasDrawScope3.getDrawContext().getTransform().translate(-f4, -f5);
                        canvas.restore();
                        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
                        drawParams3.setDensity(density);
                        drawParams3.setLayoutDirection(layoutDirection2);
                        drawParams3.setCanvas(canvas3);
                        drawParams3.m4319setSizeuvyYCjk(size);
                        r12.prepareToDraw();
                        objectRef.element = r12;
                        final ColorFilter colorFilter2 = colorFilter;
                        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawGenericBorder$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                float f7;
                                float f8;
                                contentDrawScope.drawContent();
                                ContentDrawScope contentDrawScope2 = contentDrawScope;
                                float left = Rect.this.getLeft();
                                float top = Rect.this.getTop();
                                Ref.ObjectRef<ImageBitmap> objectRef2 = objectRef;
                                long j2 = IntSize;
                                ColorFilter colorFilter3 = colorFilter2;
                                contentDrawScope2.getDrawContext().getTransform().translate(left, top);
                                try {
                                } catch (Throwable th) {
                                    th = th;
                                    f7 = top;
                                    f8 = left;
                                }
                                try {
                                    DrawScope.m4382drawImageAZ2fEMs$default(contentDrawScope2, objectRef2.element, 0L, j2, 0L, 0L, 0.0f, null, colorFilter3, 0, 0, 890, null);
                                    contentDrawScope2.getDrawContext().getTransform().translate(-left, -top);
                                } catch (Throwable th2) {
                                    th = th2;
                                    f7 = top;
                                    f8 = left;
                                    contentDrawScope2.getDrawContext().getTransform().translate(-f8, -f7);
                                    throw th;
                                }
                            }
                        });
                    } catch (Throwable th) {
                        th = th;
                        f2 = f5;
                        f3 = f4;
                        j = mo4320getSizeNHjbRc;
                        try {
                            drawContext.getCanvas().restore();
                            drawContext.mo4321setSizeuvyYCjk(j);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            canvasDrawScope3.getDrawContext().getTransform().translate(-f3, -f2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j = mo4320getSizeNHjbRc;
                    drawContext = drawContext2;
                    f2 = f5;
                    f3 = f4;
                }
            } catch (Throwable th4) {
                th = th4;
                f2 = f5;
                f3 = f4;
            }
        } catch (Throwable th5) {
            th = th5;
            f2 = f5;
            f3 = f4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m256drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j, final long j2, final boolean z, final float f) {
        final Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long m3652getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m3652getTopLeftCornerRadiuskKHJgLs();
            final float f2 = f / 2;
            final Stroke stroke = new Stroke(f, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    long m254shrinkKibmq7A;
                    long j3;
                    contentDrawScope.drawContent();
                    if (z) {
                        DrawScope.m4394drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, m3652getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float m3577getXimpl = CornerRadius.m3577getXimpl(m3652getTopLeftCornerRadiuskKHJgLs);
                    float f3 = f2;
                    if (m3577getXimpl < f3) {
                        ContentDrawScope contentDrawScope2 = contentDrawScope;
                        float f4 = f;
                        float m3671getWidthimpl = Size.m3671getWidthimpl(contentDrawScope.mo4399getSizeNHjbRc()) - f;
                        float m3668getHeightimpl = Size.m3668getHeightimpl(contentDrawScope.mo4399getSizeNHjbRc()) - f;
                        int m3831getDifferencertfAjoo = ClipOp.INSTANCE.m3831getDifferencertfAjoo();
                        Brush brush2 = brush;
                        long j4 = m3652getTopLeftCornerRadiuskKHJgLs;
                        DrawContext drawContext = contentDrawScope2.getDrawContext();
                        long mo4320getSizeNHjbRc = drawContext.mo4320getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo4323clipRectN_I0leg(f4, f4, m3671getWidthimpl, m3668getHeightimpl, m3831getDifferencertfAjoo);
                            try {
                                DrawScope.m4394drawRoundRectZuiqVtQ$default(contentDrawScope2, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                                drawContext.getCanvas().restore();
                                drawContext.mo4321setSizeuvyYCjk(mo4320getSizeNHjbRc);
                            } catch (Throwable th) {
                                th = th;
                                j3 = mo4320getSizeNHjbRc;
                                drawContext.getCanvas().restore();
                                drawContext.mo4321setSizeuvyYCjk(j3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j3 = mo4320getSizeNHjbRc;
                        }
                    } else {
                        Brush brush3 = brush;
                        long j5 = j;
                        long j6 = j2;
                        m254shrinkKibmq7A = BorderKt.m254shrinkKibmq7A(m3652getTopLeftCornerRadiuskKHJgLs, f3);
                        DrawScope.m4394drawRoundRectZuiqVtQ$default(contentDrawScope, brush3, j5, j6, m254shrinkKibmq7A, 0.0f, stroke, null, 0, 208, null);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m4388drawPathGBMwjPU$default(contentDrawScope, Path.this, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }
}
