package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Phoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPhoneSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneslashKt {
    private static ImageVector _phoneSlash;

    public static final ImageVector getPhoneSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.9f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.15f, 48.07f);
        pathBuilder.lineTo(63.0f, 74.36f);
        pathBuilder.arcToRelative(147.07f, 147.07f, 0.0f, false, false, -41.43f, 29.0f);
        pathBuilder.curveToRelative(-21.45f, 21.46f, -23.52f, 53.1f, -5.0f, 77.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 32.38f, 188.0f);
        pathBuilder.arcToRelative(19.81f, 19.81f, 0.0f, false, false, 7.12f, -1.32f);
        pathBuilder.lineToRelative(48.9f, -17.35f);
        pathBuilder.lineToRelative(0.45f, -0.17f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 101.0f, 154.5f);
        pathBuilder.lineToRelative(5.44f, -27.22f);
        pathBuilder.curveToRelative(1.22f, -0.38f, 2.47f, -0.72f, 3.72f, -1.0f);
        pathBuilder.lineToRelative(88.91f, 97.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.75f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(83.4f, 120.29f);
        pathBuilder.lineTo(78.0f, 147.57f);
        pathBuilder.lineTo(33.84f, 163.22f);
        pathBuilder.curveToRelative(-9.16f, -13.84f, -7.41f, -30.76f, 4.73f, -42.9f);
        pathBuilder.arcTo(121.58f, 121.58f, 0.0f, false, true, 80.07f, 93.1f);
        pathBuilder.lineTo(92.74f, 107.0f);
        pathBuilder.arcTo(20.06f, 20.06f, 0.0f, false, false, 83.4f, 120.29f);
        pathBuilder.close();
        pathBuilder.moveTo(239.4f, 180.29f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, true, -11.24f, 7.19f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.95f, -22.92f);
        pathBuilder.curveToRelative(10.21f, -14.07f, 8.75f, -31.71f, -3.79f, -44.25f);
        pathBuilder.curveTo(194.77f, 97.65f, 164.0f, 84.76f, 130.91f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.27f, -24.0f);
        pathBuilder.horizontalLineToRelative(0.27f);
        pathBuilder.curveToRelative(39.33f, 0.87f, 75.89f, 16.25f, 102.94f, 43.31f);
        pathBuilder.curveTo(255.84f, 124.81f, 257.91f, 156.45f, 239.41f, 180.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
