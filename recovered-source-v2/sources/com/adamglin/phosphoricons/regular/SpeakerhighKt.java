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

/* compiled from: Speakerhigh.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerHigh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getSpeakerHigh", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerHigh", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakerhighKt {
    private static ImageVector _speakerHigh;

    public static final ImageVector getSpeakerHigh(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _speakerHigh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpeakerHigh", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(155.51f, 24.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.42f, 0.88f);
        pathBuilder.lineTo(77.25f, 80.0f);
        pathBuilder.lineTo(32.0f, 80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(77.25f, 176.0f);
        pathBuilder.lineToRelative(69.84f, 54.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 224.0f);
        pathBuilder.lineTo(160.0f, 32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 155.51f, 24.81f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 96.0f);
        pathBuilder.lineTo(72.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.lineTo(32.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 207.64f);
        pathBuilder.lineTo(88.0f, 164.09f);
        pathBuilder.lineTo(88.0f, 91.91f);
        pathBuilder.lineToRelative(56.0f, -43.55f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 101.56f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 52.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.58f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -31.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, -10.58f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 128.0f);
        pathBuilder.arcToRelative(79.9f, 79.9f, 0.0f, false, true, -20.37f, 53.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.92f, -10.67f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -85.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.92f, -10.67f);
        pathBuilder.arcTo(79.83f, 79.83f, 0.0f, false, true, 248.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerHigh = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
