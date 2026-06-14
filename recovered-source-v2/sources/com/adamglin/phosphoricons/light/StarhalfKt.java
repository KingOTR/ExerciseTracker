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

/* compiled from: Starhalf.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarHalf", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStarHalf", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starHalf", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarhalfKt {
    private static ImageVector _starHalf;

    public static final ImageVector getStarHalf(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(233.0f, 113.32f);
        pathBuilder.lineToRelative(-5.06f, 4.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.83f, -9.08f);
        pathBuilder.lineToRelative(5.06f, -4.36f);
        pathBuilder.arcToRelative(2.38f, 2.38f, 0.0f, false, false, 0.72f, -2.65f);
        pathBuilder.arcToRelative(2.28f, 2.28f, 0.0f, false, false, -2.07f, -1.65f);
        pathBuilder.lineToRelative(-8.28f, -0.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 1.0f, -12.0f);
        pathBuilder.lineToRelative(8.27f, 0.67f);
        pathBuilder.arcToRelative(14.17f, 14.17f, 0.0f, false, true, 12.52f, 9.89f);
        pathBuilder.arcTo(14.43f, 14.43f, 0.0f, false, true, 233.0f, 113.32f);
        pathBuilder.close();
        pathBuilder.moveTo(174.55f, 152.15f);
        pathBuilder.lineTo(178.63f, 169.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.83f, 4.62f);
        pathBuilder.arcToRelative(5.51f, 5.51f, 0.0f, false, false, 1.39f, -0.17f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.46f, -7.22f);
        pathBuilder.lineToRelative(-3.24f, -13.67f);
        pathBuilder.lineToRelative(8.87f, -7.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -7.84f, -9.09f);
        pathBuilder.lineToRelative(-11.63f, 10.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 174.53f, 152.15f);
        pathBuilder.close();
        pathBuilder.moveTo(199.78f, 206.6f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.67f, 2.77f);
        pathBuilder.lineToRelative(1.32f, 5.57f);
        pathBuilder.arcToRelative(2.35f, 2.35f, 0.0f, false, true, -0.95f, 2.57f);
        pathBuilder.arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.6f, 0.1f);
        pathBuilder.lineToRelative(-6.71f, -4.13f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.29f, 10.22f);
        pathBuilder.lineToRelative(6.72f, 4.13f);
        pathBuilder.arcToRelative(14.39f, 14.39f, 0.0f, false, false, 21.5f, -15.65f);
        pathBuilder.close();
        pathBuilder.moveTo(175.52f, 96.0f);
        pathBuilder.lineToRelative(-15.64f, -1.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.06f, -3.69f);
        pathBuilder.lineTo(134.0f, 40.7f);
        pathBuilder.verticalLineToRelative(145.0f);
        pathBuilder.lineToRelative(8.39f, 5.15f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.29f, 10.23f);
        pathBuilder.lineToRelative(-8.1f, -5.0f);
        pathBuilder.lineTo(76.42f, 227.83f);
        pathBuilder.arcToRelative(14.39f, 14.39f, 0.0f, false, true, -21.5f, -15.65f);
        pathBuilder.lineToRelative(14.0f, -59.25f);
        pathBuilder.lineTo(23.0f, 113.32f);
        pathBuilder.arcToRelative(14.43f, 14.43f, 0.0f, false, true, -4.3f, -15.45f);
        pathBuilder.arcTo(14.17f, 14.17f, 0.0f, false, true, 31.24f, 88.0f);
        pathBuilder.lineToRelative(60.25f, -4.87f);
        pathBuilder.lineToRelative(23.22f, -56.2f);
        pathBuilder.arcToRelative(14.37f, 14.37f, 0.0f, false, true, 26.58f, 0.0f);
        pathBuilder.lineToRelative(23.22f, 56.2f);
        pathBuilder.lineToRelative(12.0f, 1.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 185.72f);
        pathBuilder.lineTo(122.0f, 40.7f);
        pathBuilder.lineTo(101.18f, 91.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.06f, 3.69f);
        pathBuilder.lineTo(32.2f, 99.94f);
        pathBuilder.arcToRelative(2.28f, 2.28f, 0.0f, false, false, -2.07f, 1.65f);
        pathBuilder.arcToRelative(2.38f, 2.38f, 0.0f, false, false, 0.72f, 2.65f);
        pathBuilder.lineToRelative(48.7f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.92f, 5.92f);
        pathBuilder.lineTo(66.59f, 214.94f);
        pathBuilder.arcToRelative(2.35f, 2.35f, 0.0f, false, false, 1.0f, 2.57f);
        pathBuilder.arcToRelative(2.24f, 2.24f, 0.0f, false, false, 2.6f, 0.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starHalf = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
