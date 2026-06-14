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

/* compiled from: Hearthalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HeartHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHeartHalf", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HearthalfKt {
    private static ImageVector _heartHalf;

    public static final ImageVector getHeartHalf(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _heartHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HeartHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.74f, 52.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 167.26f, 45.0f);
        pathBuilder.curveTo(150.09f, 48.21f, 136.19f, 57.57f, 128.0f, 71.12f);
        pathBuilder.curveTo(118.0f, 54.21f, 99.46f, 44.0f, 78.0f, 44.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f);
        pathBuilder.curveToRelative(0.0f, 28.59f, 18.0f, 58.47f, 53.4f, 88.79f);
        pathBuilder.arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, 36.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.9f, 0.48f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, -0.49f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(328.8f, 328.8f, 0.0f, false, false, 40.54f, -26.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.88f, -6.33f);
        pathBuilder.arcTo(343.7f, 343.7f, 0.0f, false, true, 132.0f, 217.09f);
        pathBuilder.lineTo(132.0f, 80.85f);
        pathBuilder.curveTo(138.24f, 66.26f, 151.58f, 56.07f, 168.74f, 52.86f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 217.08f);
        pathBuilder.curveToRelative(-21.73f, -13.0f, -96.0f, -61.16f, -96.0f, -115.08f);
        pathBuilder.arcTo(50.06f, 50.06f, 0.0f, false, true, 78.0f, 52.0f);
        pathBuilder.curveToRelative(20.83f, 0.0f, 38.39f, 11.0f, 46.0f, 28.8f);
        pathBuilder.close();
        pathBuilder.moveTo(232.11f, 100.0f);
        pathBuilder.lineToRelative(-0.44f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.56f);
        pathBuilder.arcToRelative(49.88f, 49.88f, 0.0f, false, false, -21.92f, -36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, -6.65f);
        pathBuilder.arcToRelative(57.88f, 57.88f, 0.0f, false, true, 25.43f, 41.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 232.11f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.88f, 137.81f);
        pathBuilder.curveToRelative(-5.5f, 11.0f, -13.55f, 22.32f, -23.94f, 33.56f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.88f, -5.43f);
        pathBuilder.curveToRelative(9.88f, -10.68f, 17.5f, -21.35f, 22.66f, -31.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
