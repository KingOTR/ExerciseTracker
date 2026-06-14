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

/* compiled from: Phoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPhoneSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneslashKt {
    private static ImageVector _phoneSlash;

    public static final ImageVector getPhoneSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(236.28f, 177.85f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -18.38f, 5.07f);
        pathBuilder.lineToRelative(-24.76f, -19.0f);
        pathBuilder.arcToRelative(3.43f, 3.43f, 0.0f, false, true, -0.53f, -0.48f);
        pathBuilder.lineTo(109.18f, 71.62f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.55f, -6.68f);
        pathBuilder.curveToRelative(43.0f, -4.62f, 87.74f, 9.12f, 119.86f, 41.24f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(251.58f, 126.17f, 253.51f, 155.64f, 236.28f, 177.85f);
        pathBuilder.close();
        pathBuilder.moveTo(53.93f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.09f, 45.38f);
        pathBuilder.lineTo(69.71f, 75.77f);
        pathBuilder.arcToRelative(142.0f, 142.0f, 0.0f, false, false, -45.3f, 30.41f);
        pathBuilder.curveToRelative(-20.0f, 20.0f, -21.92f, 49.46f, -4.69f, 71.67f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.38f, 5.07f);
        pathBuilder.lineToRelative(49.0f, -17.37f);
        pathBuilder.lineToRelative(0.29f, -0.11f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.75f, -11.72f);
        pathBuilder.lineToRelative(5.9f, -29.51f);
        pathBuilder.arcToRelative(73.64f, 73.64f, 0.0f, false, true, 8.57f, -2.39f);
        pathBuilder.lineToRelative(90.5f, 99.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
