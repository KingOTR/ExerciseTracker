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

/* compiled from: Microphoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMicrophoneSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophoneslashKt {
    private static ImageVector _microphoneSlash;

    public static final ImageVector getMicrophoneSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _microphoneSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrophoneSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.44f, 220.0f);
        pathBuilder.lineTo(52.44f, 44.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 52.0f);
        pathBuilder.lineTo(82.0f, 94.32f);
        pathBuilder.lineTo(82.0f, 128.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 67.56f, 40.64f);
        pathBuilder.lineToRelative(13.75f, 15.12f);
        pathBuilder.arcTo(65.26f, 65.26f, 0.0f, false, true, 128.0f, 194.0f);
        pathBuilder.arcToRelative(66.08f, 66.08f, 0.0f, false, true, -66.0f, -66.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.arcToRelative(78.09f, 78.09f, 0.0f, false, false, 72.0f, 77.75f);
        pathBuilder.lineTo(122.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 205.77f);
        pathBuilder.arcToRelative(76.93f, 76.93f, 0.0f, false, false, 37.48f, -13.0f);
        pathBuilder.lineTo(203.56f, 228.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 162.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, -34.0f, -34.0f);
        pathBuilder.lineTo(94.0f, 107.52f);
        pathBuilder.lineToRelative(47.12f, 51.84f);
        pathBuilder.arcTo(33.82f, 33.82f, 0.0f, false, true, 128.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.32f, 157.0f);
        pathBuilder.arcTo(65.38f, 65.38f, 0.0f, false, false, 194.0f, 128.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.arcToRelative(77.33f, 77.33f, 0.0f, false, true, -7.9f, 34.25f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, true, 187.32f, 157.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.8f, 45.67f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, false, true, 174.0f, 64.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(45.17f, 45.17f, 0.0f, false, true, -0.25f, 4.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 5.38f);
        pathBuilder.quadToRelative(-0.31f, 0.0f, -0.63f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.34f, -6.59f);
        pathBuilder.arcTo(35.41f, 35.41f, 0.0f, false, false, 162.0f, 128.0f);
        pathBuilder.lineTo(162.0f, 64.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 96.8f, 50.45f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
