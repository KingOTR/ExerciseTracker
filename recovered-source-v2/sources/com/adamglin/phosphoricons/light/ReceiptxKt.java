package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Receiptx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ReceiptX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getReceiptX", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_receiptX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReceiptxKt {
    private static ImageVector _receiptX;

    public static final ImageVector getReceiptX(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 42.0f);
        pathBuilder.lineTo(40.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f);
        pathBuilder.lineTo(26.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, 5.37f);
        pathBuilder.lineTo(64.0f, 198.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineTo(128.0f, 198.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineTo(192.0f, 198.71f);
        pathBuilder.lineToRelative(29.32f, 14.66f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 214.0f);
        pathBuilder.arcToRelative(5.93f, 5.93f, 0.0f, false, false, 3.15f, -0.9f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 208.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 198.29f);
        pathBuilder.lineTo(194.68f, 186.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(160.0f, 201.29f);
        pathBuilder.lineToRelative(-29.32f, -14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(96.0f, 201.29f);
        pathBuilder.lineTo(66.68f, 186.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.lineTo(38.0f, 198.29f);
        pathBuilder.lineTo(38.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(216.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.24f, 100.29f);
        pathBuilder.lineTo(136.48f, 120.0f);
        pathBuilder.lineToRelative(19.76f, 19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f);
        pathBuilder.lineTo(128.0f, 128.48f);
        pathBuilder.lineToRelative(-19.76f, 19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(119.52f, 120.0f);
        pathBuilder.lineTo(99.76f, 100.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(128.0f, 111.52f);
        pathBuilder.lineToRelative(19.76f, -19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _receiptX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
