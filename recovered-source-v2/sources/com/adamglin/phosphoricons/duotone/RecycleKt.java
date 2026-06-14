package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Recycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Recycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRecycle", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_recycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecycleKt {
    private static ImageVector _recycle;

    public static final ImageVector getRecycle(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _recycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Recycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 208.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.84f, -24.0f);
        pathBuilder.lineToRelative(88.0f, -152.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.7f, 0.0f);
        pathBuilder.lineToRelative(88.0f, 152.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(96.0f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(40.0f, 216.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -20.77f, -36.0f);
        pathBuilder2.lineToRelative(34.29f, -59.25f);
        pathBuilder2.lineTo(39.47f, 124.5f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 35.33f, 109.0f);
        pathBuilder2.lineToRelative(32.77f, -8.77f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, 5.66f);
        pathBuilder2.lineToRelative(8.79f, 32.77f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 81.0f, 148.5f);
        pathBuilder2.arcToRelative(8.37f, 8.37f, 0.0f, false, true, -2.08f, 0.27f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.72f, -5.93f);
        pathBuilder2.lineToRelative(-3.8f, -14.15f);
        pathBuilder2.lineTo(33.11f, 188.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 200.0f);
        pathBuilder2.lineTo(88.0f, 200.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(236.73f, 180.0f);
        pathBuilder2.lineTo(213.59f, 140.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 8.0f);
        pathBuilder2.lineToRelative(23.14f, 40.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 200.0f);
        pathBuilder2.lineTo(147.31f, 200.0f);
        pathBuilder2.lineToRelative(10.34f, -10.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, -11.32f);
        pathBuilder2.lineTo(147.31f, 216.0f);
        pathBuilder2.lineTo(216.0f, 216.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 20.77f, -36.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 32.0f);
        pathBuilder2.arcToRelative(7.85f, 7.85f, 0.0f, false, true, 6.92f, 4.0f);
        pathBuilder2.lineToRelative(34.29f, 59.25f);
        pathBuilder2.lineToRelative(-14.08f, -3.78f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 151.0f, 106.92f);
        pathBuilder2.lineToRelative(32.78f, 8.79f);
        pathBuilder2.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, 0.27f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.72f, -5.93f);
        pathBuilder2.lineToRelative(8.79f, -32.79f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.45f, -4.14f);
        pathBuilder2.lineToRelative(-3.8f, 14.17f);
        pathBuilder2.lineTo(148.77f, 28.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.54f, 0.0f);
        pathBuilder2.lineTo(84.07f, 68.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.85f, 8.0f);
        pathBuilder2.lineToRelative(23.16f, -40.0f);
        pathBuilder2.arcTo(7.85f, 7.85f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _recycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
