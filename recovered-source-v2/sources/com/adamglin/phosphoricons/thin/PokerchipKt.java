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

/* compiled from: Pokerchip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PokerChip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPokerChip", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pokerChip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PokerchipKt {
    private static ImageVector _pokerChip;

    public static final ImageVector getPokerChip(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 180.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.47f, 82.87f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, false, 132.0f, 68.15f);
        pathBuilder.lineTo(132.0f, 36.09f);
        pathBuilder.arcToRelative(91.64f, 91.64f, 0.0f, false, true, 58.13f, 24.12f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 68.15f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, false, 88.53f, 82.87f);
        pathBuilder.lineTo(65.87f, 60.21f);
        pathBuilder.arcTo(91.64f, 91.64f, 0.0f, false, true, 124.0f, 36.09f);
        pathBuilder.close();
        pathBuilder.moveTo(82.87f, 88.53f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, false, 68.15f, 124.0f);
        pathBuilder.lineTo(36.09f, 124.0f);
        pathBuilder.arcTo(91.64f, 91.64f, 0.0f, false, true, 60.21f, 65.87f);
        pathBuilder.close();
        pathBuilder.moveTo(68.15f, 132.0f);
        pathBuilder.arcToRelative(59.7f, 59.7f, 0.0f, false, false, 14.72f, 35.47f);
        pathBuilder.lineTo(60.21f, 190.13f);
        pathBuilder.arcTo(91.64f, 91.64f, 0.0f, false, true, 36.09f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.53f, 173.13f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, false, 124.0f, 187.85f);
        pathBuilder.verticalLineToRelative(32.06f);
        pathBuilder.arcToRelative(91.64f, 91.64f, 0.0f, false, true, -58.13f, -24.12f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 187.85f);
        pathBuilder.arcToRelative(59.7f, 59.7f, 0.0f, false, false, 35.47f, -14.72f);
        pathBuilder.lineToRelative(22.66f, 22.66f);
        pathBuilder.arcTo(91.64f, 91.64f, 0.0f, false, true, 132.0f, 219.91f);
        pathBuilder.close();
        pathBuilder.moveTo(173.13f, 167.47f);
        pathBuilder.arcTo(59.7f, 59.7f, 0.0f, false, false, 187.85f, 132.0f);
        pathBuilder.horizontalLineToRelative(32.06f);
        pathBuilder.arcToRelative(91.64f, 91.64f, 0.0f, false, true, -24.12f, 58.13f);
        pathBuilder.close();
        pathBuilder.moveTo(187.85f, 124.0f);
        pathBuilder.arcToRelative(59.7f, 59.7f, 0.0f, false, false, -14.72f, -35.47f);
        pathBuilder.lineToRelative(22.66f, -22.66f);
        pathBuilder.arcTo(91.64f, 91.64f, 0.0f, false, true, 219.91f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pokerChip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
