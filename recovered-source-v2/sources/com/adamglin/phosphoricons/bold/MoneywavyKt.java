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

/* compiled from: Moneywavy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MoneyWavy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMoneyWavy", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moneyWavy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoneywavyKt {
    private static ImageVector _moneyWavy;

    public static final ImageVector getMoneyWavy(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _moneyWavy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MoneyWavy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(246.36f, 56.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.63f, -0.6f);
        pathBuilder.curveToRelative(-41.48f, 20.29f, -71.4f, 10.71f, -103.07f, 0.56f);
        pathBuilder.curveTo(98.48f, 45.89f, 60.88f, 33.85f, 10.73f, 58.37f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 4.0f, 69.16f);
        pathBuilder.verticalLineToRelative(120.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.27f, 10.79f);
        pathBuilder.curveToRelative(41.48f, -20.29f, 71.4f, -10.71f, 103.07f, -0.56f);
        pathBuilder.curveToRelative(18.83f, 6.0f, 39.08f, 12.51f, 62.24f, 12.51f);
        pathBuilder.curveToRelative(17.66f, 0.0f, 37.0f, -3.77f, 58.69f, -14.37f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 252.0f, 186.84f);
        pathBuilder.lineTo(252.0f, 66.74f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 246.36f, 56.55f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 179.12f);
        pathBuilder.curveToRelative(-38.0f, 16.16f, -66.41f, 7.07f, -96.34f, -2.51f);
        pathBuilder.curveToRelative(-18.83f, -6.0f, -39.08f, -12.52f, -62.24f, -12.52f);
        pathBuilder.arcTo(124.86f, 124.86f, 0.0f, false, false, 28.0f, 171.24f);
        pathBuilder.lineTo(28.0f, 76.88f);
        pathBuilder.curveToRelative(38.0f, -16.16f, 66.41f, -7.08f, 96.34f, 2.51f);
        pathBuilder.curveTo(153.6f, 88.76f, 186.29f, 99.23f, 228.0f, 84.76f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 96.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f);
        pathBuilder.arcTo(32.06f, 32.06f, 0.0f, false, false, 128.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 100.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 156.0f);
        pathBuilder.lineTo(192.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moneyWavy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
