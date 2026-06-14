package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Baseballcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BaseballCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBaseballCap", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseballCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballcapKt {
    private static ImageVector _baseballCap;

    public static final ImageVector getBaseballCap(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _baseballCap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BaseballCap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 26.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 35.0f, 17.74f);
        pathBuilder.curveToRelative(12.38f, -9.0f, 34.06f, -19.74f, 67.0f, -19.74f);
        pathBuilder.reflectiveCurveToRelative(54.61f, 10.73f, 67.0f, 19.73f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 230.0f, 184.0f);
        pathBuilder.lineTo(230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 128.0f);
        pathBuilder.verticalLineToRelative(12.5f);
        pathBuilder.arcToRelative(164.29f, 164.29f, 0.0f, false, false, -44.8f, -20.3f);
        pathBuilder.arcTo(165.07f, 165.07f, 0.0f, false, false, 141.69f, 39.0f);
        pathBuilder.arcTo(90.15f, 90.15f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.79f, 117.22f);
        pathBuilder.arcToRelative(168.56f, 168.56f, 0.0f, false, false, -65.58f, 0.0f);
        pathBuilder.curveToRelative(5.0f, -38.38f, 24.16f, -65.59f, 32.79f, -76.14f);
        pathBuilder.curveTo(136.63f, 51.65f, 155.8f, 78.85f, 160.79f, 117.23f);
        pathBuilder.close();
        pathBuilder.moveTo(114.31f, 39.0f);
        pathBuilder.arcTo(165.07f, 165.07f, 0.0f, false, false, 82.8f, 120.21f);
        pathBuilder.arcTo(164.29f, 164.29f, 0.0f, false, false, 38.0f, 140.51f);
        pathBuilder.lineTo(38.0f, 128.0f);
        pathBuilder.arcTo(90.15f, 90.15f, 0.0f, false, true, 114.31f, 39.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.57f, 192.85f);
        pathBuilder.arcTo(9.94f, 9.94f, 0.0f, false, true, 202.0f, 192.0f);
        pathBuilder.curveToRelative(-13.82f, -10.0f, -37.88f, -22.0f, -74.0f, -22.0f);
        pathBuilder.reflectiveCurveToRelative(-60.22f, 12.0f, -74.0f, 22.0f);
        pathBuilder.arcToRelative(9.92f, 9.92f, 0.0f, false, true, -10.53f, 0.85f);
        pathBuilder.arcTo(9.79f, 9.79f, 0.0f, false, true, 38.0f, 184.0f);
        pathBuilder.lineTo(38.0f, 155.0f);
        pathBuilder.arcToRelative(154.0f, 154.0f, 0.0f, false, true, 180.0f, 0.0f);
        pathBuilder.verticalLineToRelative(29.0f);
        pathBuilder.arcTo(9.79f, 9.79f, 0.0f, false, true, 212.57f, 192.89f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseballCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
