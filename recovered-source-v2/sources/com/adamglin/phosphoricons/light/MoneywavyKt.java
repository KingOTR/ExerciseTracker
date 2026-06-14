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

/* compiled from: Moneywavy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MoneyWavy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMoneyWavy", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moneyWavy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoneywavyKt {
    private static ImageVector _moneyWavy;

    public static final ImageVector getMoneyWavy(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(243.18f, 61.72f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.81f, -0.3f);
        pathBuilder.curveToRelative(-43.66f, 21.32f, -74.69f, 11.39f, -107.54f, 0.88f);
        pathBuilder.curveTo(96.16f, 51.53f, 61.35f, 40.4f, 13.37f, 63.84f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 69.23f);
        pathBuilder.verticalLineToRelative(120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.63f, 5.39f);
        pathBuilder.curveToRelative(43.66f, -21.32f, 74.69f, -11.39f, 107.54f, -0.88f);
        pathBuilder.curveToRelative(19.0f, 6.09f, 38.46f, 12.3f, 60.42f, 12.3f);
        pathBuilder.curveToRelative(16.85f, 0.0f, 35.21f, -3.66f, 56.0f, -13.84f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.37f, -5.39f);
        pathBuilder.verticalLineToRelative(-120.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 243.18f, 61.72f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 183.0f);
        pathBuilder.curveToRelative(-41.9f, 19.21f, -72.17f, 9.53f, -104.17f, -0.71f);
        pathBuilder.curveTo(110.78f, 176.18f, 91.37f, 170.0f, 69.41f, 170.0f);
        pathBuilder.curveToRelative(-14.49f, 0.0f, -30.08f, 2.7f, -47.41f, 9.92f);
        pathBuilder.lineTo(22.0f, 73.0f);
        pathBuilder.curveToRelative(41.9f, -19.21f, 72.17f, -9.53f, 104.17f, 0.71f);
        pathBuilder.curveTo(157.78f, 83.84f, 190.41f, 94.28f, 234.0f, 76.11f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 98.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, true, false, 30.0f, 30.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 146.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 96.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(42.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 160.0f);
        pathBuilder.lineTo(202.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moneyWavy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
