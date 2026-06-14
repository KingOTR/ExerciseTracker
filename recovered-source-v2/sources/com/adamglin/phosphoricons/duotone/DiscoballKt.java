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

/* compiled from: Discoball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscoBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDiscoBall", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discoBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscoballKt {
    private static ImageVector _discoBall;

    public static final ImageVector getDiscoBall(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _discoBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DiscoBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 152.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f);
        pathBuilder.reflectiveCurveToRelative(32.0f, -24.0f, 32.0f, -80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 72.0f);
        pathBuilder.reflectiveCurveTo(80.0f, 96.0f, 80.0f, 152.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.curveTo(144.0f, 96.0f, 112.0f, 72.0f, 112.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(120.0f, 64.37f);
        pathBuilder2.lineTo(120.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.lineTo(104.0f, 64.37f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, false, 16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(183.54f, 144.0f);
        pathBuilder2.lineTo(151.77f, 144.0f);
        pathBuilder2.curveToRelative(-1.51f, -28.36f, -10.79f, -48.36f, -19.44f, -61.06f);
        pathBuilder2.arcTo(72.16f, 72.16f, 0.0f, false, true, 183.54f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.24f, 160.0f);
        pathBuilder2.horizontalLineToRelative(47.52f);
        pathBuilder2.curveToRelative(-2.0f, 33.52f, -16.13f, 52.95f, -23.76f, 61.08f);
        pathBuilder2.curveTo(104.36f, 212.93f, 90.23f, 193.51f, 88.24f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.24f, 144.0f);
        pathBuilder2.curveToRelative(2.0f, -33.52f, 16.13f, -52.95f, 23.76f, -61.08f);
        pathBuilder2.curveToRelative(7.64f, 8.15f, 21.77f, 27.57f, 23.76f, 61.08f);
        pathBuilder2.close();
        pathBuilder2.moveTo(91.67f, 82.94f);
        pathBuilder2.curveTo(83.0f, 95.64f, 73.74f, 115.64f, 72.23f, 144.0f);
        pathBuilder2.lineTo(40.46f, 144.0f);
        pathBuilder2.arcTo(72.16f, 72.16f, 0.0f, false, true, 91.67f, 82.94f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.46f, 160.0f);
        pathBuilder2.lineTo(72.23f, 160.0f);
        pathBuilder2.curveToRelative(1.51f, 28.36f, 10.79f, 48.36f, 19.44f, 61.06f);
        pathBuilder2.arcTo(72.16f, 72.16f, 0.0f, false, true, 40.46f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(132.33f, 221.06f);
        pathBuilder2.curveToRelative(8.65f, -12.7f, 17.93f, -32.7f, 19.44f, -61.06f);
        pathBuilder2.horizontalLineToRelative(31.77f);
        pathBuilder2.arcTo(72.16f, 72.16f, 0.0f, false, true, 132.33f, 221.06f);
        pathBuilder2.close();
        pathBuilder2.moveTo(256.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(224.0f, 96.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.lineTo(224.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 256.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.lineTo(176.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.lineTo(192.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(192.0f, 48.0f);
        pathBuilder2.lineTo(192.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(176.0f, 48.0f);
        pathBuilder2.lineTo(160.0f, 48.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 40.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discoBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
