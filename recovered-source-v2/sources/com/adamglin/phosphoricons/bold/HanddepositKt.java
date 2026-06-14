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

/* compiled from: Handdeposit.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandDeposit", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHandDeposit", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handDeposit", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HanddepositKt {
    private static ImageVector _handDeposit;

    public static final ImageVector getHandDeposit(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _handDeposit;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandDeposit", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(108.0f, 45.0f);
        pathBuilder.lineToRelative(-7.51f, 7.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineToRelative(28.0f, -28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineToRelative(28.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f);
        pathBuilder.lineTo(132.0f, 45.0f);
        pathBuilder.verticalLineToRelative(83.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 121.52f);
        pathBuilder.lineTo(196.0f, 96.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(164.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.verticalLineToRelative(68.3f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 128.29f, 212.0f);
        pathBuilder.curveToRelative(0.11f, 0.2f, 0.23f, 0.39f, 0.35f, 0.58f);
        pathBuilder.lineToRelative(22.26f, 34.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 171.0f, 233.43f);
        pathBuilder.lineToRelative(-22.0f, -33.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, -7.77f);
        pathBuilder.curveToRelative(0.11f, 0.2f, 0.23f, 0.39f, 0.36f, 0.58f);
        pathBuilder.lineTo(174.0f, 208.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.0f, -6.57f);
        pathBuilder.lineTo(196.0f, 154.0f);
        pathBuilder.arcToRelative(70.66f, 70.66f, 0.0f, false, true, 16.0f, 44.61f);
        pathBuilder.lineTo(212.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 198.65f);
        pathBuilder.arcTo(94.91f, 94.91f, 0.0f, false, false, 196.0f, 121.52f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 76.0f);
        pathBuilder.lineTo(64.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 96.0f);
        pathBuilder.lineTo(44.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handDeposit = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
