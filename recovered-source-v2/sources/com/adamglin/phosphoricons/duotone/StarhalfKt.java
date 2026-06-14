package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Starhalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getStarHalf", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarhalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.verticalLineTo(189.09f);
        pathBuilder.lineTo(73.28f, 222.74f);
        pathBuilder.arcToRelative(8.4f, 8.4f, 0.0f, false, true, -12.52f, -9.17f);
        pathBuilder.lineToRelative(14.88f, -62.79f);
        pathBuilder.lineToRelative(-48.7f, -42.0f);
        pathBuilder.arcTo(8.46f, 8.46f, 0.0f, false, true, 31.73f, 94.0f);
        pathBuilder.lineTo(95.64f, 88.8f);
        pathBuilder.lineToRelative(24.62f, -59.6f);
        pathBuilder.arcTo(8.26f, 8.26f, 0.0f, false, true, 128.0f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.18f, 97.26f);
        pathBuilder2.arcTo(16.38f, 16.38f, 0.0f, false, false, 224.92f, 86.0f);
        pathBuilder2.lineToRelative(-59.0f, -4.76f);
        pathBuilder2.lineTo(143.14f, 26.15f);
        pathBuilder2.arcToRelative(16.36f, 16.36f, 0.0f, false, false, -30.27f, 0.0f);
        pathBuilder2.lineTo(90.11f, 81.23f);
        pathBuilder2.lineTo(31.08f, 86.0f);
        pathBuilder2.arcToRelative(16.46f, 16.46f, 0.0f, false, false, -9.37f, 28.86f);
        pathBuilder2.lineToRelative(45.0f, 38.83f);
        pathBuilder2.lineTo(53.0f, 211.75f);
        pathBuilder2.arcToRelative(16.4f, 16.4f, 0.0f, false, false, 24.5f, 17.82f);
        pathBuilder2.lineTo(128.0f, 198.49f);
        pathBuilder2.lineToRelative(50.53f, 31.08f);
        pathBuilder2.arcTo(16.4f, 16.4f, 0.0f, false, false, 203.0f, 211.75f);
        pathBuilder2.lineToRelative(-13.76f, -58.07f);
        pathBuilder2.lineToRelative(45.0f, -38.83f);
        pathBuilder2.arcTo(16.43f, 16.43f, 0.0f, false, false, 239.18f, 97.26f);
        pathBuilder2.close();
        pathBuilder2.moveTo(69.09f, 215.94f);
        pathBuilder2.curveToRelative(-0.15f, 0.09f, -0.2f, 0.12f, -0.38f, 0.0f);
        pathBuilder2.arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, -0.48f);
        pathBuilder2.lineToRelative(14.88f, -62.8f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, -7.91f);
        pathBuilder2.lineToRelative(-48.7f, -42.0f);
        pathBuilder2.arcToRelative(0.39f, 0.39f, 0.0f, false, true, -0.13f, -0.51f);
        pathBuilder2.curveToRelative(0.09f, -0.27f, 0.18f, -0.27f, 0.33f, -0.29f);
        pathBuilder2.lineToRelative(63.92f, -5.16f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 103.0f, 91.86f);
        pathBuilder2.lineToRelative(17.0f, -41.08f);
        pathBuilder2.verticalLineTo(184.63f);
        pathBuilder2.close();
        pathBuilder2.moveTo(223.84f, 102.73f);
        pathBuilder2.lineToRelative(-48.7f, 42.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, 7.91f);
        pathBuilder2.lineToRelative(14.88f, 62.8f);
        pathBuilder2.arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, 0.48f);
        pathBuilder2.curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0.0f);
        pathBuilder2.lineTo(136.0f, 184.63f);
        pathBuilder2.verticalLineTo(50.78f);
        pathBuilder2.lineToRelative(17.0f, 41.08f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, 4.92f);
        pathBuilder2.lineToRelative(63.91f, 5.16f);
        pathBuilder2.curveToRelative(0.16f, 0.0f, 0.25f, 0.0f, 0.34f, 0.29f);
        pathBuilder2.reflectiveCurveTo(224.0f, 102.63f, 223.84f, 102.73f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
