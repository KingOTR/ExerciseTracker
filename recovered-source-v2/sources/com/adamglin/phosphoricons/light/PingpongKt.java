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

/* compiled from: Pingpong.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PingPong", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPingPong", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pingPong", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PingpongKt {
    private static ImageVector _pingPong;

    public static final ImageVector getPingPong(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pingPong;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PingPong", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.0f, 196.2f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 232.14f, 186.0f);
        pathBuilder.lineToRelative(-39.93f, -28.52f);
        pathBuilder.lineToRelative(18.62f, -18.62f);
        pathBuilder.arcToRelative(37.65f, 37.65f, 0.0f, false, false, 10.46f, -34.0f);
        pathBuilder.arcTo(97.43f, 97.43f, 0.0f, false, false, 186.6f, 48.12f);
        pathBuilder.arcToRelative(99.82f, 99.82f, 0.0f, false, false, -64.0f, -22.11f);
        pathBuilder.arcTo(98.29f, 98.29f, 0.0f, false, false, 26.0f, 122.61f);
        pathBuilder.arcToRelative(100.09f, 100.09f, 0.0f, false, false, 22.11f, 64.0f);
        pathBuilder.arcToRelative(97.4f, 97.4f, 0.0f, false, false, 56.72f, 34.69f);
        pathBuilder.arcToRelative(37.65f, 37.65f, 0.0f, false, false, 34.0f, -10.46f);
        pathBuilder.lineToRelative(18.62f, -18.62f);
        pathBuilder.lineTo(186.0f, 232.14f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 196.2f, 238.0f);
        pathBuilder.curveToRelative(0.39f, 0.0f, 0.78f, 0.05f, 1.16f, 0.05f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.89f, -4.1f);
        pathBuilder.lineToRelative(26.65f, -26.64f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 238.0f, 196.2f);
        pathBuilder.close();
        pathBuilder.moveTo(57.47f, 179.08f);
        pathBuilder.arcTo(88.12f, 88.12f, 0.0f, false, true, 38.0f, 122.77f);
        pathBuilder.arcTo(86.29f, 86.29f, 0.0f, false, true, 122.77f, 38.0f);
        pathBuilder.arcToRelative(88.21f, 88.21f, 0.0f, false, true, 56.31f, 19.46f);
        pathBuilder.arcToRelative(87.3f, 87.3f, 0.0f, false, true, 20.0f, 22.93f);
        pathBuilder.lineTo(80.4f, 199.12f);
        pathBuilder.arcTo(87.14f, 87.14f, 0.0f, false, true, 57.47f, 179.08f);
        pathBuilder.close();
        pathBuilder.moveTo(225.41f, 198.77f);
        pathBuilder.lineTo(198.77f, 225.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, -0.25f);
        pathBuilder.lineToRelative(-32.64f, -45.69f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 158.7f, 177.0f);
        pathBuilder.lineToRelative(-0.49f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f);
        pathBuilder.lineToRelative(-23.63f, 23.62f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(25.69f, 25.69f, 0.0f, false, true, -23.17f, 7.17f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, false, true, -15.49f, -4.72f);
        pathBuilder.lineTo(204.8f, 91.68f);
        pathBuilder.arcToRelative(82.19f, 82.19f, 0.0f, false, true, 4.72f, 15.49f);
        pathBuilder.arcToRelative(25.67f, 25.67f, 0.0f, false, true, -7.18f, 23.17f);
        pathBuilder.lineTo(178.72f, 154.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.75f, 9.12f);
        pathBuilder.lineToRelative(45.69f, 32.64f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.25f, 3.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pingPong = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
