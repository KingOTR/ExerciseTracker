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

/* compiled from: Dribbblelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DribbbleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDribbbleLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dribbbleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DribbblelogoKt {
    private static ImageVector _dribbbleLogo;

    public static final ImageVector getDribbbleLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _dribbbleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DribbbleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.81f, 122.3f);
        pathBuilder.curveToRelative(-3.26f, -0.19f, -6.54f, -0.3f, -9.8f, -0.3f);
        pathBuilder.arcToRelative(166.44f, 166.44f, 0.0f, false, false, -45.25f, 6.29f);
        pathBuilder.arcTo(164.28f, 164.28f, 0.0f, false, false, 148.33f, 96.0f);
        pathBuilder.curveToRelative(-0.14f, -0.25f, -0.3f, -0.49f, -0.44f, -0.74f);
        pathBuilder.arcToRelative(166.34f, 166.34f, 0.0f, false, false, 40.79f, -33.71f);
        pathBuilder.arcTo(89.79f, 89.79f, 0.0f, false, true, 217.81f, 122.3f);
        pathBuilder.close();
        pathBuilder.moveTo(179.29f, 54.09f);
        pathBuilder.arcToRelative(154.52f, 154.52f, 0.0f, false, true, -37.9f, 31.11f);
        pathBuilder.arcTo(167.0f, 167.0f, 0.0f, false, false, 98.88f, 42.84f);
        pathBuilder.arcToRelative(89.87f, 89.87f, 0.0f, false, true, 80.41f, 11.25f);
        pathBuilder.close();
        pathBuilder.moveTo(85.71f, 48.58f);
        pathBuilder.arcToRelative(155.0f, 155.0f, 0.0f, false, true, 45.0f, 42.27f);
        pathBuilder.arcTo(153.71f, 153.71f, 0.0f, false, true, 64.0f, 106.0f);
        pathBuilder.arcToRelative(156.8f, 156.8f, 0.0f, false, true, -22.84f, -1.69f);
        pathBuilder.arcTo(90.37f, 90.37f, 0.0f, false, true, 85.71f, 48.58f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 128.0f);
        pathBuilder.arcToRelative(90.17f, 90.17f, 0.0f, false, true, 0.79f, -11.92f);
        pathBuilder.arcTo(167.23f, 167.23f, 0.0f, false, false, 64.0f, 118.0f);
        pathBuilder.arcToRelative(165.69f, 165.69f, 0.0f, false, false, 73.29f, -17.0f);
        pathBuilder.curveToRelative(0.22f, 0.37f, 0.46f, 0.73f, 0.67f, 1.1f);
        pathBuilder.arcTo(152.2f, 152.2f, 0.0f, false, true, 151.34f, 132.0f);
        pathBuilder.arcToRelative(164.57f, 164.57f, 0.0f, false, false, -26.09f, 12.11f);
        pathBuilder.arcTo(167.0f, 167.0f, 0.0f, false, false, 69.57f, 196.4f);
        pathBuilder.arcTo(89.84f, 89.84f, 0.0f, false, true, 38.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.19f, 203.58f);
        pathBuilder.arcToRelative(155.24f, 155.24f, 0.0f, false, true, 52.05f, -49.12f);
        pathBuilder.arcToRelative(152.9f, 152.9f, 0.0f, false, true, 23.38f, -10.93f);
        pathBuilder.arcToRelative(154.31f, 154.31f, 0.0f, false, true, 4.3f, 36.16f);
        pathBuilder.arcToRelative(154.78f, 154.78f, 0.0f, false, true, -3.81f, 34.13f);
        pathBuilder.arcToRelative(89.88f, 89.88f, 0.0f, false, true, -75.92f, -10.24f);
        pathBuilder.close();
        pathBuilder.moveTo(168.43f, 208.39f);
        pathBuilder.arcToRelative(166.76f, 166.76f, 0.0f, false, false, 2.49f, -28.7f);
        pathBuilder.arcToRelative(166.67f, 166.67f, 0.0f, false, false, -4.86f, -39.87f);
        pathBuilder.arcTo(154.6f, 154.6f, 0.0f, false, true, 208.0f, 134.0f);
        pathBuilder.curveToRelative(3.25f, 0.0f, 6.52f, 0.11f, 9.77f, 0.32f);
        pathBuilder.arcTo(90.16f, 90.16f, 0.0f, false, true, 168.43f, 208.39f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dribbbleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
