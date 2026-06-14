package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pingpong.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PingPong", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPingPong", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pingPong", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PingpongKt {
    private static ImageVector _pingPong;

    public static final ImageVector getPingPong(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 196.36f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.0f, -8.77f);
        pathBuilder.lineTo(189.13f, 157.7f);
        pathBuilder.lineToRelative(20.29f, -20.29f);
        pathBuilder.arcToRelative(35.68f, 35.68f, 0.0f, false, false, 9.91f, -32.18f);
        pathBuilder.arcToRelative(95.43f, 95.43f, 0.0f, false, false, -34.0f, -55.55f);
        pathBuilder.arcTo(98.33f, 98.33f, 0.0f, false, false, 122.63f, 28.0f);
        pathBuilder.arcTo(96.3f, 96.3f, 0.0f, false, false, 28.0f, 122.63f);
        pathBuilder.arcToRelative(98.09f, 98.09f, 0.0f, false, false, 21.67f, 62.72f);
        pathBuilder.arcToRelative(95.43f, 95.43f, 0.0f, false, false, 55.55f, 34.0f);
        pathBuilder.arcToRelative(35.66f, 35.66f, 0.0f, false, false, 32.18f, -9.92f);
        pathBuilder.lineToRelative(20.29f, -20.28f);
        pathBuilder.lineTo(187.59f, 231.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.78f, 5.0f);
        pathBuilder.curveToRelative(0.33f, 0.0f, 0.66f, 0.0f, 1.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.52f);
        pathBuilder.lineToRelative(26.64f, -26.64f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 196.36f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 180.36f);
        pathBuilder.arcTo(90.11f, 90.11f, 0.0f, false, true, 36.0f, 122.74f);
        pathBuilder.arcTo(88.27f, 88.27f, 0.0f, false, true, 122.75f, 36.0f);
        pathBuilder.arcToRelative(90.13f, 90.13f, 0.0f, false, true, 57.59f, 19.9f);
        pathBuilder.arcToRelative(89.13f, 89.13f, 0.0f, false, true, 21.28f, 24.81f);
        pathBuilder.lineTo(80.72f, 201.62f);
        pathBuilder.arcTo(89.0f, 89.0f, 0.0f, false, true, 55.91f, 180.33f);
        pathBuilder.close();
        pathBuilder.moveTo(226.92f, 200.21f);
        pathBuilder.lineTo(200.27f, 226.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 197.0f, 228.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.93f, -1.67f);
        pathBuilder.lineToRelative(-32.64f, -45.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.92f, -1.66f);
        pathBuilder.horizontalLineToRelative(-0.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f);
        pathBuilder.lineToRelative(-23.63f, 23.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(27.66f, 27.66f, 0.0f, false, true, -25.0f, 7.72f);
        pathBuilder.arcToRelative(84.36f, 84.36f, 0.0f, false, true, -18.6f, -6.0f);
        pathBuilder.lineTo(205.47f, 88.18f);
        pathBuilder.arcToRelative(84.36f, 84.36f, 0.0f, false, true, 6.0f, 18.6f);
        pathBuilder.arcToRelative(27.69f, 27.69f, 0.0f, false, true, -7.72f, 25.0f);
        pathBuilder.lineToRelative(-23.63f, 23.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.5f, 6.08f);
        pathBuilder.lineToRelative(45.69f, 32.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.51f, 6.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pingPong = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
