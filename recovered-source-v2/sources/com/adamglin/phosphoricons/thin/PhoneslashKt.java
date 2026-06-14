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

/* compiled from: Phoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPhoneSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneslashKt {
    private static ImageVector _phoneSlash;

    public static final ImageVector getPhoneSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, false, 45.0f, 42.69f);
        pathBuilder.lineTo(76.52f, 77.32f);
        pathBuilder.arcTo(137.72f, 137.72f, 0.0f, false, false, 27.21f, 109.0f);
        pathBuilder.curveTo(8.69f, 127.53f, 6.9f, 154.83f, 22.85f, 175.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, 3.77f);
        pathBuilder.lineToRelative(49.0f, -17.39f);
        pathBuilder.lineToRelative(0.15f, -0.05f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.31f, -8.79f);
        pathBuilder.lineToRelative(5.9f, -29.51f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 2.51f, -3.0f);
        pathBuilder.arcToRelative(79.44f, 79.44f, 0.0f, false, true, 11.4f, -3.0f);
        pathBuilder.lineToRelative(92.07f, 101.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(99.0f, 112.91f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.72f, 9.0f);
        pathBuilder.lineToRelative(-5.9f, 29.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.37f, 2.9f);
        pathBuilder.lineToRelative(-49.0f, 17.38f);
        pathBuilder.lineToRelative(-0.15f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, -1.21f);
        pathBuilder.curveToRelative(-13.42f, -17.29f, -11.9f, -40.25f, 3.69f, -55.84f);
        pathBuilder.arcTo(130.06f, 130.06f, 0.0f, false, true, 82.33f, 83.72f);
        pathBuilder.lineToRelative(24.44f, 26.88f);
        pathBuilder.quadTo(102.8f, 111.58f, 98.94f, 112.91f);
        pathBuilder.close();
        pathBuilder.moveTo(233.15f, 175.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.83f, 3.77f);
        pathBuilder.lineToRelative(-9.31f, -3.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.68f, -7.54f);
        pathBuilder.lineToRelative(9.37f, 3.32f);
        pathBuilder.lineToRelative(0.15f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.61f, -1.21f);
        pathBuilder.curveToRelative(13.42f, -17.29f, 11.9f, -40.25f, -3.69f, -55.84f);
        pathBuilder.curveTo(196.66f, 88.2f, 159.34f, 74.18f, 120.72f, 76.19f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.41f, -8.0f);
        pathBuilder.curveToRelative(40.86f, -2.12f, 80.41f, 12.74f, 108.48f, 40.8f);
        pathBuilder.curveTo(247.31f, 127.53f, 249.1f, 154.83f, 233.15f, 175.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
