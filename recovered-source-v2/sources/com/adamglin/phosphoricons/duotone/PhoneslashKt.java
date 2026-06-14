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

/* compiled from: Phoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPhoneSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneslashKt {
    private static ImageVector _phoneSlash;

    public static final ImageVector getPhoneSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _phoneSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 173.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.26f, 2.47f);
        pathBuilder.lineTo(171.58f, 158.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.86f, -5.8f);
        pathBuilder.lineToRelative(-6.21f, -29.74f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, false, -5.14f, -5.9f);
        pathBuilder.arcToRelative(84.39f, 84.39f, 0.0f, false, false, -55.1f, 0.13f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, -5.12f, 6.0f);
        pathBuilder.lineToRelative(-5.9f, 29.51f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 84.38f, 158.0f);
        pathBuilder.lineTo(35.29f, 175.42f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 26.0f, 173.0f);
        pathBuilder.curveToRelative(-14.6f, -18.83f, -13.26f, -43.83f, 4.0f, -61.12f);
        pathBuilder.curveToRelative(53.11f, -53.11f, 142.77f, -53.11f, 195.88f, 0.0f);
        pathBuilder.curveTo(243.23f, 129.12f, 244.57f, 154.12f, 230.0f, 173.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.93f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.09f, 45.38f);
        pathBuilder2.lineTo(69.68f, 75.74f);
        pathBuilder2.arcToRelative(141.26f, 141.26f, 0.0f, false, false, -45.27f, 30.44f);
        pathBuilder2.curveToRelative(-20.0f, 20.0f, -21.92f, 49.46f, -4.69f, 71.67f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, 5.07f);
        pathBuilder2.lineToRelative(49.0f, -17.37f);
        pathBuilder2.lineToRelative(0.29f, -0.11f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.72f);
        pathBuilder2.lineToRelative(5.9f, -29.51f);
        pathBuilder2.arcToRelative(75.89f, 75.89f, 0.0f, false, true, 8.56f, -2.4f);
        pathBuilder2.lineToRelative(90.51f, 99.57f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(97.63f, 109.14f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.32f, 11.94f);
        pathBuilder2.lineToRelative(-5.9f, 29.5f);
        pathBuilder2.lineToRelative(-48.78f, 17.3f);
        pathBuilder2.curveToRelative(-0.1f, 0.0f, -0.17f, 0.13f, -0.27f, 0.17f);
        pathBuilder2.curveToRelative(-12.33f, -15.9f, -11.0f, -36.22f, 3.36f, -50.56f);
        pathBuilder2.arcToRelative(125.79f, 125.79f, 0.0f, false, true, 45.47f, -29.1f);
        pathBuilder2.lineToRelative(18.3f, 20.14f);
        pathBuilder2.curveTo(98.87f, 108.73f, 98.25f, 108.92f, 97.63f, 109.14f);
        pathBuilder2.close();
        pathBuilder2.moveTo(236.28f, 177.85f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.07f);
        pathBuilder2.lineToRelative(-9.25f, -3.28f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 214.0f, 164.56f);
        pathBuilder2.lineToRelative(9.37f, 3.32f);
        pathBuilder2.lineToRelative(0.3f, 0.12f);
        pathBuilder2.curveToRelative(12.3f, -15.85f, 11.0f, -36.17f, -3.39f, -50.51f);
        pathBuilder2.curveToRelative(-25.66f, -25.66f, -61.88f, -39.27f, -99.35f, -37.31f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -0.83f, -16.0f);
        pathBuilder2.curveToRelative(42.0f, -2.19f, 82.63f, 13.1f, 111.49f, 42.0f);
        pathBuilder2.curveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
