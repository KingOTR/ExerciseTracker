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

/* compiled from: Treepalm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TreePalm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTreePalm", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_treePalm", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreepalmKt {
    private static ImageVector _treePalm;

    public static final ImageVector getTreePalm(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _treePalm;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TreePalm", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.35f, 54.61f);
        pathBuilder.arcToRelative(64.87f, 64.87f, 0.0f, false, false, -94.85f, 0.0f);
        pathBuilder.arcTo(70.0f, 70.0f, 0.0f, false, false, 128.0f, 75.0f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, -13.5f, -20.37f);
        pathBuilder.arcToRelative(64.87f, 64.87f, 0.0f, false, false, -94.85f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, 9.64f);
        pathBuilder.lineToRelative(61.83f, 26.9f);
        pathBuilder.curveToRelative(-1.85f, 0.34f, -3.7f, 0.74f, -5.54f, 1.23f);
        pathBuilder.arcToRelative(69.42f, 69.42f, 0.0f, false, false, -42.5f, 32.39f);
        pathBuilder.arcToRelative(68.65f, 68.65f, 0.0f, false, false, -7.0f, 52.79f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.86f, 4.12f);
        pathBuilder.arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.93f, 0.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.64f, -1.23f);
        pathBuilder.lineTo(122.0f, 116.64f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(116.64f);
        pathBuilder.lineToRelative(84.17f, 64.13f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.64f, 1.23f);
        pathBuilder.arcToRelative(6.1f, 6.1f, 0.0f, false, false, 1.93f, -0.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.86f, -4.12f);
        pathBuilder.arcToRelative(68.65f, 68.65f, 0.0f, false, false, -7.0f, -52.79f);
        pathBuilder.arcToRelative(69.42f, 69.42f, 0.0f, false, false, -42.5f, -32.39f);
        pathBuilder.curveToRelative(-1.84f, -0.49f, -3.69f, -0.89f, -5.54f, -1.23f);
        pathBuilder.lineToRelative(61.83f, -26.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.0f, -9.64f);
        pathBuilder.close();
        pathBuilder.moveTo(67.08f, 46.0f);
        pathBuilder.arcToRelative(53.16f, 53.16f, 0.0f, false, true, 38.73f, 16.88f);
        pathBuilder.arcToRelative(58.77f, 58.77f, 0.0f, false, true, 15.47f, 31.65f);
        pathBuilder.lineTo(34.93f, 57.0f);
        pathBuilder.arcTo(52.59f, 52.59f, 0.0f, false, true, 67.08f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.29f, 165.33f);
        pathBuilder.arcToRelative(56.77f, 56.77f, 0.0f, false, true, 7.48f, -34.53f);
        pathBuilder.arcTo(57.58f, 57.58f, 0.0f, false, true, 81.0f, 104.0f);
        pathBuilder.arcToRelative(58.79f, 58.79f, 0.0f, false, true, 15.12f, -2.0f);
        pathBuilder.arcToRelative(57.67f, 57.67f, 0.0f, false, true, 20.43f, 3.73f);
        pathBuilder.close();
        pathBuilder.moveTo(210.23f, 130.8f);
        pathBuilder.arcToRelative(56.77f, 56.77f, 0.0f, false, true, 7.48f, 34.53f);
        pathBuilder.lineToRelative(-78.24f, -59.61f);
        pathBuilder.arcToRelative(58.24f, 58.24f, 0.0f, false, true, 70.76f, 25.08f);
        pathBuilder.close();
        pathBuilder.moveTo(134.72f, 94.53f);
        pathBuilder.arcToRelative(58.77f, 58.77f, 0.0f, false, true, 15.47f, -31.65f);
        pathBuilder.arcTo(53.16f, 53.16f, 0.0f, false, true, 188.92f, 46.0f);
        pathBuilder.arcToRelative(52.59f, 52.59f, 0.0f, false, true, 32.15f, 11.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _treePalm = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
