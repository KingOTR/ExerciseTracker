package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Starhalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStarHalf", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarhalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(239.18f, 97.26f);
        pathBuilder.arcTo(16.38f, 16.38f, 0.0f, false, false, 224.92f, 86.0f);
        pathBuilder.lineToRelative(-59.0f, -4.76f);
        pathBuilder.lineTo(143.14f, 26.15f);
        pathBuilder.arcToRelative(16.36f, 16.36f, 0.0f, false, false, -30.27f, 0.0f);
        pathBuilder.lineTo(90.11f, 81.23f);
        pathBuilder.lineTo(31.08f, 86.0f);
        pathBuilder.arcToRelative(16.46f, 16.46f, 0.0f, false, false, -9.37f, 28.86f);
        pathBuilder.lineToRelative(45.0f, 38.83f);
        pathBuilder.lineTo(53.0f, 211.75f);
        pathBuilder.arcToRelative(16.4f, 16.4f, 0.0f, false, false, 24.5f, 17.82f);
        pathBuilder.lineTo(128.0f, 198.49f);
        pathBuilder.lineToRelative(50.53f, 31.08f);
        pathBuilder.arcTo(16.4f, 16.4f, 0.0f, false, false, 203.0f, 211.75f);
        pathBuilder.lineToRelative(-13.76f, -58.07f);
        pathBuilder.lineToRelative(45.0f, -38.83f);
        pathBuilder.arcTo(16.43f, 16.43f, 0.0f, false, false, 239.18f, 97.26f);
        pathBuilder.close();
        pathBuilder.moveTo(223.84f, 102.73f);
        pathBuilder.lineTo(175.14f, 144.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.56f, 7.91f);
        pathBuilder.lineToRelative(14.88f, 62.8f);
        pathBuilder.arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.17f, 0.48f);
        pathBuilder.curveToRelative(-0.18f, 0.14f, -0.23f, 0.11f, -0.38f, 0.0f);
        pathBuilder.lineToRelative(-54.72f, -33.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 181.1f);
        pathBuilder.lineTo(128.0f, 32.0f);
        pathBuilder.curveToRelative(0.24f, 0.0f, 0.27f, 0.08f, 0.35f, 0.26f);
        pathBuilder.lineTo(153.0f, 91.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.75f, 4.92f);
        pathBuilder.lineToRelative(63.91f, 5.16f);
        pathBuilder.curveToRelative(0.16f, 0.0f, 0.25f, 0.0f, 0.34f, 0.29f);
        pathBuilder.reflectiveCurveTo(224.0f, 102.63f, 223.84f, 102.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
