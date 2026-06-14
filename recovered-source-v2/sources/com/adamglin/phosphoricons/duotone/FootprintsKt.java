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

/* compiled from: Footprints.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Footprints", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFootprints", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footprints", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootprintsKt {
    private static ImageVector _footprints;

    public static final ImageVector getFootprints(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _footprints;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Footprints", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 180.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 24.0f);
        pathBuilder.curveToRelative(-24.52f, 0.0f, -51.46f, 80.0f, -25.26f, 112.0f);
        pathBuilder.horizontalLineToRelative(50.52f);
        pathBuilder.curveTo(127.46f, 104.0f, 100.52f, 24.0f, 76.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.26f, 160.0f);
        pathBuilder.curveToRelative(26.2f, -32.0f, -0.74f, -112.0f, -25.26f, -112.0f);
        pathBuilder.reflectiveCurveToRelative(-51.46f, 80.0f, -25.26f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.06f, 184.0f);
        pathBuilder2.lineTo(152.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.05f, 0.0f);
        pathBuilder2.lineTo(216.05f, 192.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.06f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.06f, 204.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 160.0f);
        pathBuilder2.horizontalLineToRelative(-56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, false, false, 112.0f, 180.0f);
        pathBuilder2.lineTo(112.0f, 168.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.0f, 180.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.lineTo(96.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.0f, 16.0f);
        pathBuilder2.curveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f);
        pathBuilder2.curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, 2.93f);
        pathBuilder2.horizontalLineToRelative(50.55f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f);
        pathBuilder2.curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f);
        pathBuilder2.curveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(97.15f, 128.0f);
        pathBuilder2.lineTo(54.78f, 128.0f);
        pathBuilder2.curveToRelative(-11.4f, -18.1f, -7.21f, -52.7f, 3.89f, -76.11f);
        pathBuilder2.curveTo(65.14f, 38.22f, 72.17f, 32.0f, 76.0f, 32.0f);
        pathBuilder2.reflectiveCurveToRelative(10.82f, 6.22f, 17.3f, 19.89f);
        pathBuilder2.curveTo(104.36f, 75.3f, 108.55f, 109.9f, 97.15f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(154.76f, 168.0f);
        pathBuilder2.horizontalLineToRelative(50.55f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f);
        pathBuilder2.curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f);
        pathBuilder2.curveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f);
        pathBuilder2.reflectiveCurveToRelative(-22.89f, 10.31f, -31.77f, 29.0f);
        pathBuilder2.curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 154.76f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(162.76f, 75.89f);
        pathBuilder2.curveTo(169.22f, 62.22f, 176.25f, 56.0f, 180.0f, 56.0f);
        pathBuilder2.reflectiveCurveToRelative(10.81f, 6.22f, 17.29f, 19.89f);
        pathBuilder2.curveToRelative(11.1f, 23.41f, 15.29f, 58.0f, 3.89f, 76.11f);
        pathBuilder2.lineTo(158.85f, 152.0f);
        pathBuilder2.curveTo(147.45f, 133.9f, 151.64f, 99.3f, 162.74f, 75.89f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footprints = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
