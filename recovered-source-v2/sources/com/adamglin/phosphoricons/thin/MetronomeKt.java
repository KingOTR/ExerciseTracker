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

/* compiled from: Metronome.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Metronome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMetronome", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metronome", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetronomeKt {
    private static ImageVector _metronome;

    public static final ImageVector getMetronome(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(182.63f, 113.85f);
        pathBuilder.lineTo(211.0f, 82.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, false, 205.0f, 77.31f);
        pathBuilder.lineTo(179.82f, 105.0f);
        pathBuilder.lineToRelative(-19.3f, -60.68f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 149.08f, 36.0f);
        pathBuilder.horizontalLineTo(106.92f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.44f, 8.36f);
        pathBuilder.lineToRelative(-50.9f, 160.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 56.0f, 220.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.43f, -15.64f);
        pathBuilder.close();
        pathBuilder.moveTo(190.19f, 164.0f);
        pathBuilder.horizontalLineTo(137.0f);
        pathBuilder.lineToRelative(39.37f, -43.31f);
        pathBuilder.close();
        pathBuilder.moveTo(103.1f, 46.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 106.92f, 44.0f);
        pathBuilder.horizontalLineToRelative(42.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.82f, 2.79f);
        pathBuilder.lineToRelative(20.71f, 65.09f);
        pathBuilder.lineTo(126.23f, 164.0f);
        pathBuilder.horizontalLineTo(65.81f);
        pathBuilder.close();
        pathBuilder.moveTo(203.22f, 210.36f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 212.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.81f, -5.21f);
        pathBuilder.lineTo(63.27f, 172.0f);
        pathBuilder.horizontalLineTo(192.73f);
        pathBuilder.lineToRelative(11.07f, 34.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 203.22f, 210.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metronome = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
