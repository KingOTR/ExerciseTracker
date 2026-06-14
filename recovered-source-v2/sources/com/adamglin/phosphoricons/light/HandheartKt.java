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

/* compiled from: Handheart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandHeart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandHeart", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handHeart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandheartKt {
    private static ImageVector _handHeart;

    public static final ImageVector getHandHeart(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handHeart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandHeart", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.12f, 142.65f);
        pathBuilder.arcToRelative(22.43f, 22.43f, 0.0f, false, false, -19.55f, -3.88f);
        pathBuilder.lineToRelative(-4.32f, 1.0f);
        pathBuilder.curveTo(227.0f, 119.55f, 238.0f, 99.51f, 238.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, -25.36f, -20.39f, -46.0f, -45.46f, -46.0f);
        pathBuilder.arcTo(45.51f, 45.51f, 0.0f, false, false, 156.0f, 52.0f);
        pathBuilder.arcToRelative(45.51f, 45.51f, 0.0f, false, false, -36.54f, -18.0f);
        pathBuilder.curveTo(94.39f, 34.0f, 74.0f, 54.64f, 74.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 11.38f, 3.63f, 22.49f, 11.29f, 34.36f);
        pathBuilder.arcToRelative(29.73f, 29.73f, 0.0f, false, false, -16.56f, 8.43f);
        pathBuilder.lineTo(45.52f, 146.0f);
        pathBuilder.lineTo(16.0f, 146.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 2.0f, 160.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(120.0f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.46f, -0.18f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcToRelative(7.16f, 7.16f, 0.0f, false, false, 0.89f, -0.3f);
        pathBuilder.lineTo(225.17f, 181.0f);
        pathBuilder.lineToRelative(0.33f, -0.15f);
        pathBuilder.arcToRelative(22.6f, 22.6f, 0.0f, false, false, 3.62f, -38.18f);
        pathBuilder.close();
        pathBuilder.moveTo(119.46f, 46.0f);
        pathBuilder.arcToRelative(33.16f, 33.16f, 0.0f, false, true, 31.0f, 20.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.1f, 0.0f);
        pathBuilder.arcToRelative(33.16f, 33.16f, 0.0f, false, true, 31.0f, -20.28f);
        pathBuilder.curveTo(210.68f, 46.0f, 226.0f, 61.57f, 226.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 20.24f, -16.18f, 43.0f, -46.8f, 65.75f);
        pathBuilder.lineToRelative(-14.87f, 3.42f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 140.0f, 114.0f);
        pathBuilder.lineTo(99.67f, 114.0f);
        pathBuilder.curveTo(90.36f, 101.67f, 86.0f, 90.81f, 86.0f, 80.0f);
        pathBuilder.curveTo(86.0f, 61.57f, 101.32f, 46.0f, 119.46f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(14.0f, 200.0f);
        pathBuilder.lineTo(14.0f, 160.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(42.0f, 158.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.lineTo(16.0f, 202.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.28f, 170.0f);
        pathBuilder.lineTo(182.08f, 186.27f);
        pathBuilder.lineTo(119.26f, 202.0f);
        pathBuilder.lineTo(54.0f, 202.0f);
        pathBuilder.lineTo(54.0f, 154.49f);
        pathBuilder.lineToRelative(23.21f, -23.22f);
        pathBuilder.arcTo(17.88f, 17.88f, 0.0f, false, true, 89.94f, 126.0f);
        pathBuilder.lineTo(140.0f, 126.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, 28.0f);
        pathBuilder.lineTo(112.0f, 154.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.34f, -0.15f);
        pathBuilder.lineToRelative(67.0f, -15.41f);
        pathBuilder.lineToRelative(0.24f, -0.06f);
        pathBuilder.arcTo(10.6f, 10.6f, 0.0f, false, true, 220.28f, 170.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handHeart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
