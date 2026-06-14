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

/* compiled from: Metronome.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Metronome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMetronome", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metronome", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetronomeKt {
    private static ImageVector _metronome;

    public static final ImageVector getMetronome(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _metronome;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Metronome", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(187.14f, 114.84f);
        pathBuilder.lineToRelative(26.78f, -29.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.84f, -10.76f);
        pathBuilder.lineToRelative(-20.55f, 22.6f);
        pathBuilder.lineToRelative(-17.2f, -54.07f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, false, 149.08f, 32.0f);
        pathBuilder.horizontalLineTo(106.91f);
        pathBuilder.arcTo(15.94f, 15.94f, 0.0f, false, false, 91.66f, 43.15f);
        pathBuilder.lineToRelative(-50.91f, 160.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 224.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.25f, -20.85f);
        pathBuilder.close();
        pathBuilder.moveTo(184.72f, 160.0f);
        pathBuilder.horizontalLineTo(146.08f);
        pathBuilder.lineToRelative(28.62f, -31.48f);
        pathBuilder.close();
        pathBuilder.moveTo(106.91f, 48.0f);
        pathBuilder.horizontalLineToRelative(42.17f);
        pathBuilder.lineToRelative(20.0f, 62.9f);
        pathBuilder.lineTo(124.46f, 160.0f);
        pathBuilder.horizontalLineTo(71.27f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 208.0f);
        pathBuilder.lineToRelative(10.18f, -32.0f);
        pathBuilder.horizontalLineTo(189.81f);
        pathBuilder.lineTo(200.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metronome = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
