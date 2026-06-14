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

/* compiled from: Piggybank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PiggyBank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPiggyBank", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_piggyBank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PiggybankKt {
    private static ImageVector _piggyBank;

    public static final ImageVector getPiggyBank(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _piggyBank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PiggyBank", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 120.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 64.0f);
        pathBuilder.lineTo(116.0f, 64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 112.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -27.54f, 28.0f);
        pathBuilder.lineTo(213.2f, 214.73f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 194.36f, 228.0f);
        pathBuilder.lineTo(181.64f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -18.84f, -13.27f);
        pathBuilder.lineToRelative(-1.0f, -2.73f);
        pathBuilder.lineTo(110.17f, 212.0f);
        pathBuilder.lineToRelative(-1.0f, 2.73f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 90.36f, 228.0f);
        pathBuilder.lineTo(77.64f, 228.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 58.8f, 214.73f);
        pathBuilder.lineTo(46.5f, 180.28f);
        pathBuilder.arcTo(91.63f, 91.63f, 0.0f, false, true, 25.75f, 137.8f);
        pathBuilder.arcTo(11.91f, 11.91f, 0.0f, false, false, 24.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.arcToRelative(36.07f, 36.07f, 0.0f, false, true, 24.56f, -34.13f);
        pathBuilder.arcTo(92.13f, 92.13f, 0.0f, false, true, 116.0f, 28.0f);
        pathBuilder.lineTo(220.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(210.0f, 52.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 22.48f, 31.45f);
        pathBuilder.lineToRelative(0.42f, 1.0f);
        pathBuilder.arcTo(28.05f, 28.05f, 0.0f, false, true, 256.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(-3.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.45f, -8.41f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 148.0f, 52.0f);
        pathBuilder.lineTo(116.0f, 52.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 65.86f, 165.94f);
        pathBuilder.arcTo(11.85f, 11.85f, 0.0f, false, true, 68.31f, 170.0f);
        pathBuilder.lineToRelative(12.15f, 34.0f);
        pathBuilder.horizontalLineToRelative(7.08f);
        pathBuilder.lineToRelative(2.87f, -8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, -8.0f);
        pathBuilder.horizontalLineToRelative(68.58f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, 8.0f);
        pathBuilder.lineToRelative(2.87f, 8.0f);
        pathBuilder.horizontalLineToRelative(7.08f);
        pathBuilder.lineToRelative(17.16f, -48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.3f, -8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _piggyBank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
