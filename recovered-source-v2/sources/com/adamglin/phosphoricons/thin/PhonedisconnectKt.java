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

/* compiled from: Phonedisconnect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PhoneDisconnect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPhoneDisconnect", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_phoneDisconnect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhonedisconnectKt {
    private static ImageVector _phoneDisconnect;

    public static final ImageVector getPhoneDisconnect(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _phoneDisconnect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PhoneDisconnect", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.79f, 93.0f);
        pathBuilder.curveTo(174.15f, 38.34f, 81.85f, 38.34f, 27.21f, 93.0f);
        pathBuilder.curveTo(8.69f, 111.5f, 6.9f, 138.81f, 22.85f, 159.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, 3.77f);
        pathBuilder.lineToRelative(49.0f, -17.39f);
        pathBuilder.lineToRelative(0.15f, -0.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.31f, -8.79f);
        pathBuilder.lineToRelative(5.9f, -29.51f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 2.51f, -3.0f);
        pathBuilder.arcToRelative(80.59f, 80.59f, 0.0f, false, true, 52.5f, -0.12f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, 2.52f, 2.94f);
        pathBuilder.lineTo(162.81f, 137.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.29f, 8.69f);
        pathBuilder.lineToRelative(0.15f, 0.06f);
        pathBuilder.lineToRelative(49.07f, 17.41f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, -3.77f);
        pathBuilder.curveTo(249.1f, 138.81f, 247.31f, 111.5f, 228.79f, 93.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.79f, 154.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, 1.21f);
        pathBuilder.lineToRelative(-0.15f, -0.06f);
        pathBuilder.lineTo(173.0f, 138.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.37f, -2.87f);
        pathBuilder.lineToRelative(-6.21f, -29.75f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.75f, -8.87f);
        pathBuilder.arcToRelative(88.63f, 88.63f, 0.0f, false, false, -57.74f, 0.14f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.72f, 9.0f);
        pathBuilder.lineToRelative(-5.9f, 29.51f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 83.0f, 138.26f);
        pathBuilder.lineToRelative(-49.0f, 17.38f);
        pathBuilder.lineToRelative(-0.15f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, -1.21f);
        pathBuilder.curveToRelative(-13.42f, -17.3f, -11.9f, -40.26f, 3.69f, -55.85f);
        pathBuilder.curveTo(58.65f, 72.85f, 93.33f, 60.0f, 128.0f, 60.0f);
        pathBuilder.reflectiveCurveToRelative(69.35f, 12.89f, 95.13f, 38.68f);
        pathBuilder.curveTo(238.71f, 114.23f, 240.24f, 137.19f, 226.82f, 154.49f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(40.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(216.0f, 196.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _phoneDisconnect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
