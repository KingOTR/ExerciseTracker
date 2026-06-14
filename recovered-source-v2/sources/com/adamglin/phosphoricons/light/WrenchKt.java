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

/* compiled from: Wrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWrench", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrenchKt {
    private static ImageVector _wrench;

    public static final ImageVector getWrench(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.91f, 69.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.63f, -2.16f);
        pathBuilder.lineToRelative(-41.07f, 37.9f);
        pathBuilder.lineTo(154.7f, 101.3f);
        pathBuilder.lineToRelative(-4.19f, -19.51f);
        pathBuilder.lineToRelative(37.9f, -41.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.16f, -9.63f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, -89.77f, 94.39f);
        pathBuilder.lineToRelative(-61.39f, 53.0f);
        pathBuilder.curveToRelative(-0.11f, 0.09f, -0.21f, 0.19f, -0.32f, 0.3f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 77.2f, 221.23f);
        pathBuilder.curveToRelative(0.11f, -0.11f, 0.21f, -0.21f, 0.3f, -0.32f);
        pathBuilder.lineToRelative(53.0f, -61.39f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, 94.39f, -89.77f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 154.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, true, -28.0f, -7.22f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.45f, 1.33f);
        pathBuilder.lineTo(68.57f, 212.88f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -25.45f, -25.45f);
        pathBuilder.lineToRelative(64.76f, -55.94f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 109.2f, 124.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, true, 64.0f, -84.53f);
        pathBuilder.lineTo(139.58f, 75.93f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.45f, 5.33f);
        pathBuilder.lineToRelative(5.65f, 26.35f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.61f, 4.61f);
        pathBuilder.lineToRelative(26.35f, 5.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.33f, -1.45f);
        pathBuilder.lineTo(216.49f, 82.8f);
        pathBuilder.arcTo(58.06f, 58.06f, 0.0f, false, true, 160.0f, 154.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
