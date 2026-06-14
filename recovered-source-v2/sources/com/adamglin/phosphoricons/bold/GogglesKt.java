package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Goggles.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Goggles", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGoggles", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_goggles", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GogglesKt {
    private static ImageVector _goggles;

    public static final ImageVector getGoggles(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _goggles;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Goggles", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.0f, 60.0f);
        pathBuilder.lineTo(76.0f, 60.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, false, 0.0f, 136.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 13.74f, 21.69f);
        pathBuilder.curveToRelative(3.15f, 8.71f, 10.51f, 16.75f, 21.52f, 23.27f);
        pathBuilder.curveToRelative(11.52f, 6.81f, 25.6f, 11.0f, 36.74f, 11.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, false, 42.32f, -32.0f);
        pathBuilder.horizontalLineToRelative(27.36f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 184.0f, 196.0f);
        pathBuilder.curveToRelative(18.53f, 0.0f, 50.62f, -12.81f, 58.31f, -34.33f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 256.0f, 140.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, false, 180.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 84.0f);
        pathBuilder.lineTo(180.0f, 84.0f);
        pathBuilder.arcToRelative(52.07f, 52.07f, 0.0f, false, true, 51.13f, 42.6f);
        pathBuilder.arcTo(65.0f, 65.0f, 0.0f, false, false, 220.74f, 119.0f);
        pathBuilder.curveToRelative(-11.52f, -6.81f, -25.6f, -11.0f, -36.74f, -11.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, false, -42.32f, 32.0f);
        pathBuilder.lineTo(114.32f, 140.0f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, false, 72.0f, 108.0f);
        pathBuilder.curveToRelative(-13.4f, 0.0f, -33.9f, 6.71f, -47.13f, 18.56f);
        pathBuilder.arcTo(52.08f, 52.08f, 0.0f, false, true, 76.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 172.0f);
        pathBuilder.curveToRelative(-14.13f, 0.0f, -36.0f, -12.15f, -36.0f, -20.0f);
        pathBuilder.curveToRelative(0.0f, -2.74f, 3.55f, -7.61f, 11.48f, -12.3f);
        pathBuilder.curveToRelative(9.0f, -5.32f, 18.8f, -7.7f, 24.52f, -7.7f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.52f, 164.3f);
        pathBuilder.curveToRelative(-9.0f, 5.32f, -18.8f, 7.7f, -24.52f, 7.7f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f);
        pathBuilder.curveToRelative(14.13f, 0.0f, 36.0f, 12.15f, 36.0f, 20.0f);
        pathBuilder.curveTo(220.0f, 154.74f, 216.45f, 159.61f, 208.52f, 164.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _goggles = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
