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

/* compiled from: Pokerchip.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PokerChip", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPokerChip", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pokerChip", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PokerchipKt {
    private static ImageVector _pokerChip;

    public static final ImageVector getPokerChip(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.06f, 78.0f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 140.0f, 69.21f);
        pathBuilder.lineTo(140.0f, 44.87f);
        pathBuilder.arcToRelative(83.55f, 83.55f, 0.0f, false, true, 38.28f, 15.88f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 69.21f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 94.94f, 78.0f);
        pathBuilder.lineTo(77.72f, 60.75f);
        pathBuilder.arcTo(83.55f, 83.55f, 0.0f, false, true, 116.0f, 44.87f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 94.94f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 69.21f, 116.0f);
        pathBuilder.lineTo(44.87f, 116.0f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 60.75f, 77.72f);
        pathBuilder.close();
        pathBuilder.moveTo(69.21f, 140.0f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 78.0f, 161.06f);
        pathBuilder.lineTo(60.75f, 178.28f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 44.87f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.94f, 178.0f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 116.0f, 186.79f);
        pathBuilder.verticalLineToRelative(24.34f);
        pathBuilder.arcToRelative(83.55f, 83.55f, 0.0f, false, true, -38.28f, -15.88f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 186.79f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 161.06f, 178.0f);
        pathBuilder.lineToRelative(17.22f, 17.22f);
        pathBuilder.arcTo(83.55f, 83.55f, 0.0f, false, true, 140.0f, 211.13f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 161.06f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 186.79f, 140.0f);
        pathBuilder.horizontalLineToRelative(24.34f);
        pathBuilder.arcToRelative(83.59f, 83.59f, 0.0f, false, true, -15.88f, 38.28f);
        pathBuilder.close();
        pathBuilder.moveTo(186.79f, 116.0f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 178.0f, 94.94f);
        pathBuilder.lineToRelative(17.22f, -17.22f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 211.13f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pokerChip = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
