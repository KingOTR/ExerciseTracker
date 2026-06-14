package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Waveformslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WaveformSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWaveformSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_waveformSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WaveformslashKt {
    private static ImageVector _waveformSlash;

    public static final ImageVector getWaveformSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _waveformSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WaveformSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(80.0f, 87.09f);
        pathBuilder.lineTo(80.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(96.0f, 104.69f);
        pathBuilder.lineToRelative(24.0f, 26.4f);
        pathBuilder.lineTo(120.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 148.69f);
        pathBuilder.lineToRelative(66.08f, 72.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 44.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(96.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 44.43f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 88.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(136.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 80.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 88.43f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 132.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(176.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(28.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 132.43f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(88.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(216.0f, 80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _waveformSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
