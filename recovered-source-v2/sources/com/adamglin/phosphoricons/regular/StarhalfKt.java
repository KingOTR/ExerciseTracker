package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Starhalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getStarHalf", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarhalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _starHalf;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarHalf", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.29f, 114.85f);
        pathBuilder.lineToRelative(-5.06f, 4.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.45f, -12.12f);
        pathBuilder.lineToRelative(5.06f, -4.37f);
        pathBuilder.curveToRelative(0.12f, -0.1f, 0.23f, -0.19f, 0.13f, -0.5f);
        pathBuilder.reflectiveCurveToRelative(-0.18f, -0.27f, -0.34f, -0.29f);
        pathBuilder.lineToRelative(-8.27f, -0.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 1.29f, -15.94f);
        pathBuilder.lineToRelative(8.27f, 0.66f);
        pathBuilder.arcToRelative(16.46f, 16.46f, 0.0f, false, true, 9.37f, 28.86f);
        pathBuilder.close();
        pathBuilder.moveTo(172.58f, 152.64f);
        pathBuilder.lineTo(176.66f, 169.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.78f, 6.16f);
        pathBuilder.arcToRelative(7.86f, 7.86f, 0.0f, false, false, 1.85f, -0.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.94f, -9.63f);
        pathBuilder.lineToRelative(-3.0f, -12.49f);
        pathBuilder.lineToRelative(8.0f, -6.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.45f, -12.12f);
        pathBuilder.lineToRelative(-11.64f, 10.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 172.58f, 152.64f);
        pathBuilder.close();
        pathBuilder.moveTo(201.71f, 206.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.57f, 3.69f);
        pathBuilder.lineToRelative(1.32f, 5.58f);
        pathBuilder.arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, 0.48f);
        pathBuilder.curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0.0f);
        pathBuilder.lineToRelative(-6.72f, -4.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 13.63f);
        pathBuilder.lineToRelative(6.72f, 4.13f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, false, 203.0f, 211.75f);
        pathBuilder.close();
        pathBuilder.moveTo(175.36f, 98.05f);
        pathBuilder.lineToRelative(-15.64f, -1.27f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 153.0f, 91.86f);
        pathBuilder.lineTo(136.0f, 50.78f);
        pathBuilder.lineTo(136.0f, 184.63f);
        pathBuilder.lineToRelative(7.43f, 4.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.38f, 13.63f);
        pathBuilder.lineTo(128.0f, 198.49f);
        pathBuilder.lineTo(77.47f, 229.57f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, true, 53.0f, 211.75f);
        pathBuilder.lineToRelative(13.76f, -58.07f);
        pathBuilder.lineToRelative(-45.0f, -38.83f);
        pathBuilder.arcTo(16.46f, 16.46f, 0.0f, false, true, 31.08f, 86.0f);
        pathBuilder.lineToRelative(59.0f, -4.76f);
        pathBuilder.lineToRelative(22.76f, -55.08f);
        pathBuilder.arcToRelative(16.36f, 16.36f, 0.0f, false, true, 30.27f, 0.0f);
        pathBuilder.lineToRelative(22.75f, 55.08f);
        pathBuilder.lineToRelative(10.76f, 0.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -1.29f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 184.63f);
        pathBuilder.lineTo(120.0f, 50.78f);
        pathBuilder.lineTo(103.0f, 91.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.75f, 4.92f);
        pathBuilder.lineToRelative(-63.92f, 5.16f);
        pathBuilder.curveToRelative(-0.15f, 0.0f, -0.24f, 0.0f, -0.33f, 0.29f);
        pathBuilder.arcToRelative(0.39f, 0.39f, 0.0f, false, false, 0.13f, 0.51f);
        pathBuilder.lineToRelative(48.7f, 42.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.56f, 7.91f);
        pathBuilder.lineToRelative(-14.88f, 62.8f);
        pathBuilder.arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.17f, 0.48f);
        pathBuilder.curveToRelative(0.18f, 0.14f, 0.23f, 0.11f, 0.38f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
