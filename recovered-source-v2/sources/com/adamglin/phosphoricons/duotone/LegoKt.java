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

/* compiled from: Lego.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lego", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getLego", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lego", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegoKt {
    private static ImageVector _lego;

    public static final ImageVector getLego(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _lego;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lego", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 80.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.lineTo(80.0f, 224.0f);
        pathBuilder.verticalLineTo(160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(243.58f, 72.84f);
        pathBuilder2.lineTo(197.29f, 49.7f);
        pathBuilder2.curveTo(191.54f, 39.24f, 177.21f, 32.0f, 160.0f, 32.0f);
        pathBuilder2.curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f);
        pathBuilder2.arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f);
        pathBuilder2.lineToRelative(-19.52f, 9.76f);
        pathBuilder2.arcTo(53.69f, 53.69f, 0.0f, false, false, 80.0f, 72.0f);
        pathBuilder2.curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f);
        pathBuilder2.arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f);
        pathBuilder2.lineTo(12.42f, 120.84f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.42f, 7.16f);
        pathBuilder2.lineToRelative(64.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f);
        pathBuilder2.lineToRelative(160.0f, -80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 144.0f);
        pathBuilder2.lineTo(248.0f, 80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 243.58f, 72.84f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 151.06f);
        pathBuilder2.lineTo(33.89f, 128.0f);
        pathBuilder2.lineTo(51.0f, 119.45f);
        pathBuilder2.curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f);
        pathBuilder2.curveToRelative(22.43f, 0.0f, 40.0f, -12.3f, 40.0f, -28.0f);
        pathBuilder2.arcToRelative(21.77f, 21.77f, 0.0f, false, false, -4.35f, -12.88f);
        pathBuilder2.lineTo(131.0f, 79.45f);
        pathBuilder2.curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f);
        pathBuilder2.curveToRelative(18.38f, 0.0f, 33.49f, -8.26f, 38.35f, -19.88f);
        pathBuilder2.lineTo(222.11f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 48.0f);
        pathBuilder2.curveToRelative(13.74f, 0.0f, 24.0f, 6.34f, 24.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-10.26f, 12.0f, -24.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-24.0f, -6.34f, -24.0f, -12.0f);
        pathBuilder2.reflectiveCurveTo(146.26f, 48.0f, 160.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 88.0f);
        pathBuilder2.curveToRelative(13.74f, 0.0f, 24.0f, 6.34f, 24.0f, 12.0f);
        pathBuilder2.reflectiveCurveToRelative(-10.26f, 12.0f, -24.0f, 12.0f);
        pathBuilder2.curveToRelative(-9.67f, 0.0f, -17.61f, -3.14f, -21.47f, -7.0f);
        pathBuilder2.arcToRelative(8.29f, 8.29f, 0.0f, false, false, -0.84f, -0.93f);
        pathBuilder2.arcTo(6.62f, 6.62f, 0.0f, false, true, 56.0f, 100.0f);
        pathBuilder2.curveTo(56.0f, 94.34f, 66.26f, 88.0f, 80.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(24.0f, 140.94f);
        pathBuilder2.lineToRelative(48.0f, 24.0f);
        pathBuilder2.verticalLineToRelative(46.12f);
        pathBuilder2.lineToRelative(-48.0f, -24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 211.06f);
        pathBuilder2.lineTo(88.0f, 164.94f);
        pathBuilder2.lineToRelative(144.0f, -72.0f);
        pathBuilder2.verticalLineToRelative(46.12f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lego = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
