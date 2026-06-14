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

/* compiled from: Receiptx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ReceiptX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getReceiptX", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_receiptX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiptxKt {
    private static ImageVector _receiptX;

    public static final ImageVector getReceiptX(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _receiptX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ReceiptX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 44.0f);
        pathBuilder.lineTo(40.0f, 44.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.79f, 3.58f);
        pathBuilder.lineTo(64.0f, 196.47f);
        pathBuilder.lineToRelative(30.21f, 15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f);
        pathBuilder.lineTo(128.0f, 196.47f);
        pathBuilder.lineToRelative(30.21f, 15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.58f, 0.0f);
        pathBuilder.lineTo(192.0f, 196.47f);
        pathBuilder.lineToRelative(30.21f, 15.11f);
        pathBuilder.arcTo(4.05f, 4.05f, 0.0f, false, false, 224.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(228.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 201.53f);
        pathBuilder.lineTo(193.79f, 188.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.lineTo(160.0f, 203.53f);
        pathBuilder.lineToRelative(-30.21f, -15.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.lineTo(96.0f, 203.53f);
        pathBuilder.lineTo(65.79f, 188.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.58f, 0.0f);
        pathBuilder.lineTo(36.0f, 201.53f);
        pathBuilder.lineTo(36.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(216.0f, 52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.83f, 98.83f);
        pathBuilder.lineTo(133.66f, 120.0f);
        pathBuilder.lineToRelative(21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(128.0f, 125.66f);
        pathBuilder.lineToRelative(-21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(122.34f, 120.0f);
        pathBuilder.lineTo(101.17f, 98.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(128.0f, 114.34f);
        pathBuilder.lineToRelative(21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _receiptX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
