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

/* compiled from: Unite.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Unite", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUnite", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_unite", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UniteKt {
    private static ImageVector _unite;

    public static final ImageVector getUnite(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _unite;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Unite", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(171.17f, 84.83f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, -86.34f, 86.34f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, 86.34f, -86.34f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 160.0f);
        pathBuilder.arcToRelative(68.63f, 68.63f, 0.0f, false, true, -1.27f, 13.07f);
        pathBuilder.lineToRelative(-57.34f, -57.34f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 172.0f, 96.0f);
        pathBuilder.curveToRelative(0.0f, -1.0f, 0.0f, -2.0f, -0.07f, -2.93f);
        pathBuilder.arcTo(68.1f, 68.1f, 0.0f, false, true, 228.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(45.2f, 50.86f);
        pathBuilder.lineToRelative(58.34f, 58.33f);
        pathBuilder.arcToRelative(76.35f, 76.35f, 0.0f, false, false, -14.09f, 22.6f);
        pathBuilder.lineTo(31.67f, 74.0f);
        pathBuilder.arcTo(68.14f, 68.14f, 0.0f, false, true, 45.2f, 50.86f);
        pathBuilder.close();
        pathBuilder.moveTo(74.0f, 31.67f);
        pathBuilder.lineToRelative(57.78f, 57.78f);
        pathBuilder.arcToRelative(76.35f, 76.35f, 0.0f, false, false, -22.6f, 14.09f);
        pathBuilder.lineTo(50.86f, 45.2f);
        pathBuilder.arcTo(68.14f, 68.14f, 0.0f, false, true, 74.0f, 31.67f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 96.0f);
        pathBuilder.arcToRelative(67.59f, 67.59f, 0.0f, false, true, -7.45f, 30.89f);
        pathBuilder.lineTo(129.11f, 99.45f);
        pathBuilder.arcTo(67.59f, 67.59f, 0.0f, false, true, 160.0f, 92.0f);
        pathBuilder.curveToRelative(1.3f, 0.0f, 2.6f, 0.0f, 3.88f, 0.12f);
        pathBuilder.curveTo(164.0f, 93.4f, 164.0f, 94.7f, 164.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 152.36f);
        pathBuilder.lineTo(103.64f, 122.0f);
        pathBuilder.arcTo(68.74f, 68.74f, 0.0f, false, true, 122.0f, 103.64f);
        pathBuilder.lineTo(152.36f, 134.0f);
        pathBuilder.arcTo(68.74f, 68.74f, 0.0f, false, true, 134.0f, 152.36f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 160.0f);
        pathBuilder.arcToRelative(67.59f, 67.59f, 0.0f, false, true, 7.45f, -30.89f);
        pathBuilder.lineToRelative(27.44f, 27.44f);
        pathBuilder.arcTo(67.59f, 67.59f, 0.0f, false, true, 96.0f, 164.0f);
        pathBuilder.curveToRelative(-1.3f, 0.0f, -2.6f, -0.05f, -3.88f, -0.12f);
        pathBuilder.curveTo(92.05f, 162.6f, 92.0f, 161.3f, 92.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.81f, 152.46f);
        pathBuilder.lineTo(205.14f, 210.8f);
        pathBuilder.arcTo(68.14f, 68.14f, 0.0f, false, true, 182.0f, 224.33f);
        pathBuilder.lineToRelative(-57.78f, -57.78f);
        pathBuilder.arcTo(76.35f, 76.35f, 0.0f, false, false, 146.81f, 152.46f);
        pathBuilder.close();
        pathBuilder.moveTo(152.46f, 146.81f);
        pathBuilder.arcToRelative(76.35f, 76.35f, 0.0f, false, false, 14.09f, -22.6f);
        pathBuilder.lineTo(224.33f, 182.0f);
        pathBuilder.arcToRelative(68.14f, 68.14f, 0.0f, false, true, -13.53f, 23.15f);
        pathBuilder.close();
        pathBuilder.moveTo(162.93f, 84.07f);
        pathBuilder.curveToRelative(-1.0f, 0.0f, -2.0f, -0.07f, -2.93f, -0.07f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -19.73f, 2.61f);
        pathBuilder.lineTo(82.93f, 29.27f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 80.0f, 54.8f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 96.0f);
        pathBuilder.arcToRelative(68.63f, 68.63f, 0.0f, false, true, 1.27f, -13.07f);
        pathBuilder.lineToRelative(57.34f, 57.34f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 84.0f, 160.0f);
        pathBuilder.curveToRelative(0.0f, 1.0f, 0.0f, 2.0f, 0.07f, 2.93f);
        pathBuilder.arcTo(68.1f, 68.1f, 0.0f, false, true, 28.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(93.07f, 171.93f);
        pathBuilder.curveToRelative(1.0f, 0.0f, 2.0f, 0.07f, 2.93f, 0.07f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 19.73f, -2.61f);
        pathBuilder.lineToRelative(57.34f, 57.34f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, -80.0f, -54.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _unite = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
