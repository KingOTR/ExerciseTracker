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

/* compiled from: Pokerchip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PokerChip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPokerChip", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pokerChip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PokerchipKt {
    private static ImageVector _pokerChip;

    public static final ImageVector getPokerChip(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pokerChip;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PokerChip", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 176.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 128.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.21f, 77.47f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, -13.0f);
        pathBuilder.lineTo(136.0f, 40.37f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 64.52f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, -31.21f, 13.0f);
        pathBuilder.lineTo(71.72f, 60.4f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, 48.28f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(77.47f, 88.79f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, -13.0f, 31.21f);
        pathBuilder.lineTo(40.37f, 120.0f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, 20.0f, -48.28f);
        pathBuilder.close();
        pathBuilder.moveTo(64.52f, 136.0f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, 13.0f, 31.21f);
        pathBuilder.lineTo(60.4f, 184.28f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, -20.0f, -48.28f);
        pathBuilder.close();
        pathBuilder.moveTo(88.79f, 178.53f);
        pathBuilder.arcTo(63.66f, 63.66f, 0.0f, false, false, 120.0f, 191.48f);
        pathBuilder.verticalLineToRelative(24.15f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, -48.28f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 191.48f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, 31.21f, -12.95f);
        pathBuilder.lineToRelative(17.07f, 17.07f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, -48.28f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.53f, 167.21f);
        pathBuilder.arcTo(63.66f, 63.66f, 0.0f, false, false, 191.48f, 136.0f);
        pathBuilder.horizontalLineToRelative(24.15f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, -20.0f, 48.28f);
        pathBuilder.close();
        pathBuilder.moveTo(191.48f, 120.0f);
        pathBuilder.arcToRelative(63.66f, 63.66f, 0.0f, false, false, -12.95f, -31.21f);
        pathBuilder.lineTo(195.6f, 71.72f);
        pathBuilder.arcToRelative(87.6f, 87.6f, 0.0f, false, true, 20.0f, 48.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pokerChip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
