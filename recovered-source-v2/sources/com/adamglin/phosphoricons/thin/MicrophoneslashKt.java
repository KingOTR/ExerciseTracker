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

/* compiled from: Microphoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMicrophoneSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophoneslashKt {
    private static ImageVector _microphoneSlash;

    public static final ImageVector getMicrophoneSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(211.0f, 221.31f);
        pathBuilder.lineTo(51.0f, 45.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 50.69f);
        pathBuilder.lineTo(84.0f, 93.55f);
        pathBuilder.lineTo(84.0f, 128.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 66.0f, 38.12f);
        pathBuilder.lineToRelative(16.38f, 18.0f);
        pathBuilder.arcTo(67.21f, 67.21f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.arcToRelative(76.09f, 76.09f, 0.0f, false, false, 72.0f, 75.89f);
        pathBuilder.lineTo(124.0f, 240.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 203.89f);
        pathBuilder.arcToRelative(75.1f, 75.1f, 0.0f, false, false, 39.79f, -13.77f);
        pathBuilder.lineTo(205.0f, 226.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f);
        pathBuilder.lineTo(92.0f, 102.35f);
        pathBuilder.lineTo(144.43f, 160.0f);
        pathBuilder.arcTo(35.83f, 35.83f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.12f, 157.85f);
        pathBuilder.arcTo(67.44f, 67.44f, 0.0f, false, false, 196.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.arcToRelative(75.28f, 75.28f, 0.0f, false, true, -7.7f, 33.37f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.18f, -3.52f);
        pathBuilder.close();
        pathBuilder.moveTo(87.63f, 46.46f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 64.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(44.2f, 44.2f, 0.0f, false, true, -0.24f, 4.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 3.58f);
        pathBuilder.lineToRelative(-0.42f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.57f, -4.39f);
        pathBuilder.arcTo(36.67f, 36.67f, 0.0f, false, false, 164.0f, 128.0f);
        pathBuilder.lineTo(164.0f, 64.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 95.0f, 49.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.34f, -3.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
