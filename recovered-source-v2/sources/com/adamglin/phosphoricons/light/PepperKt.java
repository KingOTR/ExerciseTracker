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

/* compiled from: Pepper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pepper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPepper", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pepper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PepperKt {
    private static ImageVector _pepper;

    public static final ImageVector getPepper(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pepper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pepper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(165.57f, 42.26f);
        pathBuilder.arcTo(38.07f, 38.07f, 0.0f, false, false, 128.0f, 10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 25.38f, 20.35f);
        pathBuilder.arcTo(62.08f, 62.08f, 0.0f, false, false, 98.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 47.75f, -26.23f, 79.68f, -78.0f, 94.93f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.56f, 27.24f);
        pathBuilder.arcTo(262.5f, 262.5f, 0.0f, false, false, 66.81f, 230.0f);
        pathBuilder.curveToRelative(40.36f, 0.0f, 85.23f, -9.0f, 116.19f, -35.0f);
        pathBuilder.curveToRelative(25.88f, -21.71f, 39.0f, -52.33f, 39.0f, -91.0f);
        pathBuilder.arcTo(62.06f, 62.06f, 0.0f, false, false, 165.57f, 42.26f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 54.0f);
        pathBuilder.arcToRelative(50.09f, 50.09f, 0.0f, false, true, 47.82f, 35.38f);
        pathBuilder.lineTo(192.0f, 97.28f);
        pathBuilder.lineTo(162.68f, 82.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(128.0f, 97.28f);
        pathBuilder.lineToRelative(-15.81f, -7.91f);
        pathBuilder.arcTo(50.07f, 50.07f, 0.0f, false, true, 160.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.28f, 185.82f);
        pathBuilder.curveTo(150.15f, 206.89f, 95.36f, 227.0f, 23.67f, 214.33f);
        pathBuilder.arcTo(1.88f, 1.88f, 0.0f, false, true, 22.0f, 212.44f);
        pathBuilder.arcToRelative(1.81f, 1.81f, 0.0f, false, true, 1.43f, -2.0f);
        pathBuilder.curveTo(80.06f, 193.73f, 110.0f, 156.92f, 110.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, -0.76f, 0.0f, -1.51f, 0.06f, -2.26f);
        pathBuilder.lineToRelative(15.26f, 7.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineTo(160.0f, 94.69f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineToRelative(15.26f, -7.63f);
        pathBuilder.curveToRelative(0.0f, 0.75f, 0.06f, 1.5f, 0.06f, 2.26f);
        pathBuilder.curveTo(210.0f, 139.0f, 198.32f, 166.49f, 175.28f, 185.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pepper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
