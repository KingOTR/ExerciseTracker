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

/* compiled from: Moneywavy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MoneyWavy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMoneyWavy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moneyWavy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoneywavyKt {
    private static ImageVector _moneyWavy;

    public static final ImageVector getMoneyWavy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(242.12f, 63.39f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.88f, -0.2f);
        pathBuilder.curveToRelative(-44.37f, 21.68f, -75.77f, 11.64f, -109.0f, 1.0f);
        pathBuilder.reflectiveCurveToRelative(-67.71f, -21.67f, -115.0f, 1.42f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 69.21f);
        pathBuilder.verticalLineToRelative(120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.76f, 3.6f);
        pathBuilder.curveToRelative(44.37f, -21.68f, 75.77f, -11.64f, 109.0f, -1.0f);
        pathBuilder.curveToRelative(18.86f, 6.0f, 38.08f, 12.19f, 59.8f, 12.19f);
        pathBuilder.curveToRelative(16.61f, 0.0f, 34.69f, -3.6f, 55.18f, -13.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.24f, -3.6f);
        pathBuilder.verticalLineToRelative(-120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 242.12f, 63.39f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 184.27f);
        pathBuilder.curveToRelative(-43.19f, 20.27f, -74.1f, 10.38f, -106.78f, -0.08f);
        pathBuilder.curveToRelative(-18.86f, -6.0f, -38.08f, -12.18f, -59.8f, -12.18f);
        pathBuilder.curveToRelative(-15.0f, 0.0f, -31.28f, 3.0f, -49.42f, 10.94f);
        pathBuilder.lineTo(20.0f, 71.73f);
        pathBuilder.curveToRelative(43.19f, -20.27f, 74.1f, -10.38f, 106.78f, 0.08f);
        pathBuilder.curveTo(158.7f, 82.0f, 191.67f, 92.57f, 236.0f, 73.05f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 100.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 96.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 160.0f);
        pathBuilder.lineTo(204.0f, 112.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moneyWavy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
