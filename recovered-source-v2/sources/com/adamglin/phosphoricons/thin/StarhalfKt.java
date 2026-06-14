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

/* compiled from: Starhalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStarHalf", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarhalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(231.66f, 111.81f);
        pathBuilder.lineToRelative(-5.06f, 4.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.22f, -6.06f);
        pathBuilder.lineToRelative(5.05f, -4.36f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, false, 1.32f, -4.77f);
        pathBuilder.arcToRelative(4.29f, 4.29f, 0.0f, false, false, -3.81f, -3.0f);
        pathBuilder.lineToRelative(-8.27f, -0.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.64f, -8.0f);
        pathBuilder.lineToRelative(8.28f, 0.67f);
        pathBuilder.arcToRelative(12.45f, 12.45f, 0.0f, false, true, 7.07f, 21.84f);
        pathBuilder.close();
        pathBuilder.moveTo(176.47f, 151.7f);
        pathBuilder.lineToRelative(4.08f, 17.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.88f, 3.08f);
        pathBuilder.arcToRelative(3.69f, 3.69f, 0.0f, false, false, 0.93f, -0.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -4.81f);
        pathBuilder.lineToRelative(-3.52f, -14.85f);
        pathBuilder.lineToRelative(9.79f, -8.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.22f, -6.06f);
        pathBuilder.lineToRelative(-11.63f, 10.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 176.47f, 151.7f);
        pathBuilder.close();
        pathBuilder.moveTo(197.81f, 207.07f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.79f, 1.84f);
        pathBuilder.lineToRelative(1.32f, 5.58f);
        pathBuilder.arcToRelative(4.38f, 4.38f, 0.0f, false, true, -1.71f, 4.65f);
        pathBuilder.arcToRelative(4.26f, 4.26f, 0.0f, false, true, -4.82f, 0.18f);
        pathBuilder.lineToRelative(-6.72f, -4.13f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, false, 173.9f, 222.0f);
        pathBuilder.lineToRelative(6.72f, 4.13f);
        pathBuilder.arcToRelative(12.4f, 12.4f, 0.0f, false, false, 18.51f, -13.49f);
        pathBuilder.close();
        pathBuilder.moveTo(175.67f, 94.07f);
        pathBuilder.lineTo(160.0f, 92.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.38f, -2.46f);
        pathBuilder.lineTo(132.0f, 30.73f);
        pathBuilder.lineToRelative(0.0f, -0.09f);
        pathBuilder.verticalLineToRelative(156.2f);
        pathBuilder.lineToRelative(9.34f, 5.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.2f, 6.82f);
        pathBuilder.lineTo(128.0f, 193.77f);
        pathBuilder.lineTo(75.38f, 226.13f);
        pathBuilder.arcToRelative(12.4f, 12.4f, 0.0f, false, true, -18.51f, -13.49f);
        pathBuilder.lineToRelative(14.32f, -60.42f);
        pathBuilder.lineTo(24.34f, 111.81f);
        pathBuilder.arcTo(12.45f, 12.45f, 0.0f, false, true, 31.41f, 90.0f);
        pathBuilder.lineToRelative(61.47f, -5.0f);
        pathBuilder.lineToRelative(23.68f, -57.34f);
        pathBuilder.arcToRelative(12.37f, 12.37f, 0.0f, false, true, 22.88f, 0.0f);
        pathBuilder.lineTo(163.12f, 85.0f);
        pathBuilder.lineToRelative(13.2f, 1.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.65f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 186.84f);
        pathBuilder.lineTo(124.0f, 30.64f);
        pathBuilder.lineToRelative(0.0f, 0.09f);
        pathBuilder.lineTo(99.34f, 90.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 92.79f);
        pathBuilder.lineTo(32.06f, 98.0f);
        pathBuilder.arcToRelative(4.29f, 4.29f, 0.0f, false, false, -3.81f, 3.0f);
        pathBuilder.arcToRelative(4.37f, 4.37f, 0.0f, false, false, 1.32f, 4.77f);
        pathBuilder.lineToRelative(48.68f, 42.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.28f, 3.95f);
        pathBuilder.lineTo(64.66f, 214.49f);
        pathBuilder.arcToRelative(4.38f, 4.38f, 0.0f, false, false, 1.71f, 4.65f);
        pathBuilder.arcToRelative(4.28f, 4.28f, 0.0f, false, false, 4.82f, 0.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
