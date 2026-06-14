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

/* compiled from: Metronome.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Metronome", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMetronome", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metronome", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetronomeKt {
    private static ImageVector _metronome;

    public static final ImageVector getMetronome(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(219.05f, 201.94f);
        pathBuilder.lineToRelative(-27.4f, -86.12f);
        pathBuilder.lineToRelative(25.23f, -27.75f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.76f, -16.14f);
        pathBuilder.lineTo(183.24f, 89.39f);
        pathBuilder.lineToRelative(-15.1f, -47.45f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, false, 149.08f, 28.0f);
        pathBuilder.horizontalLineTo(106.91f);
        pathBuilder.arcTo(19.93f, 19.93f, 0.0f, false, false, 87.85f, 41.94f);
        pathBuilder.lineToRelative(-50.91f, 160.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 56.0f, 228.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.06f, -26.06f);
        pathBuilder.close();
        pathBuilder.moveTo(179.25f, 156.0f);
        pathBuilder.horizontalLineTo(155.12f);
        pathBuilder.lineTo(173.0f, 136.34f);
        pathBuilder.close();
        pathBuilder.moveTo(109.83f, 52.0f);
        pathBuilder.horizontalLineToRelative(36.33f);
        pathBuilder.lineToRelative(18.42f, 57.91f);
        pathBuilder.lineTo(122.69f, 156.0f);
        pathBuilder.horizontalLineTo(76.74f);
        pathBuilder.close();
        pathBuilder.moveTo(61.47f, 204.0f);
        pathBuilder.lineToRelative(7.63f, -24.0f);
        pathBuilder.horizontalLineTo(186.89f);
        pathBuilder.lineToRelative(7.63f, 24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metronome = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
