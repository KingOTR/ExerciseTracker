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

/* compiled from: Microphoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMicrophoneSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophoneslashKt {
    private static ImageVector _microphoneSlash;

    public static final ImageVector getMicrophoneSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.88f, 39.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 56.07f);
        pathBuilder.lineTo(76.0f, 96.64f);
        pathBuilder.lineTo(76.0f, 128.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 72.11f, 48.0f);
        pathBuilder.lineToRelative(11.26f, 12.39f);
        pathBuilder.arcTo(67.34f, 67.34f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.arcToRelative(92.14f, 92.14f, 0.0f, false, false, 80.0f, 91.22f);
        pathBuilder.lineTo(116.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 219.23f);
        pathBuilder.arcToRelative(90.39f, 90.39f, 0.0f, false, false, 35.92f, -12.68f);
        pathBuilder.lineToRelative(23.2f, 25.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f);
        pathBuilder.verticalLineToRelative(-5.0f);
        pathBuilder.lineToRelative(29.9f, 32.89f);
        pathBuilder.curveTo(129.27f, 156.0f, 128.64f, 156.0f, 128.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(191.0f, 153.58f);
        pathBuilder.arcTo(67.63f, 67.63f, 0.0f, false, false, 196.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.arcToRelative(91.48f, 91.48f, 0.0f, false, true, -6.74f, 34.61f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.23f, -9.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.7f, 33.75f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 180.0f, 64.0f);
        pathBuilder.verticalLineToRelative(56.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(156.0f, 64.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -50.79f, -16.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.51f, -14.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
