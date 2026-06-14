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

/* compiled from: Hand.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hand", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHand", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hand", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandKt {
    private static ImageVector _hand;

    public static final ImageVector getHand(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hand;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hand", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.0f, 44.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -8.0f, 1.0f);
        pathBuilder.lineTo(180.0f, 44.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -60.79f, -14.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 76.0f, 60.0f);
        pathBuilder.verticalLineToRelative(50.83f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.0f, 36.7f);
        pathBuilder.curveTo(55.82f, 214.6f, 75.35f, 244.0f, 128.0f, 244.0f);
        pathBuilder.arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f);
        pathBuilder.lineTo(220.0f, 76.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 188.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 152.0f);
        pathBuilder.arcToRelative(68.08f, 68.08f, 0.0f, false, true, -68.0f, 68.0f);
        pathBuilder.curveToRelative(-35.83f, 0.0f, -49.71f, -14.0f, -82.48f, -83.14f);
        pathBuilder.curveToRelative(-0.14f, -0.29f, -0.29f, -0.58f, -0.45f, -0.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.85f, -8.0f);
        pathBuilder.lineToRelative(0.21f, 0.35f);
        pathBuilder.lineToRelative(18.68f, 30.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 152.0f);
        pathBuilder.lineTo(100.0f, 60.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 44.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(180.0f, 76.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hand = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
