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

/* compiled from: Currencyngn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyNgn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCurrencyNgn", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyNgn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyngnKt {
    private static ImageVector _currencyNgn;

    public static final ImageVector getCurrencyNgn(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _currencyNgn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CurrencyNgn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 138.0f);
        pathBuilder.lineTo(198.0f, 138.0f);
        pathBuilder.lineTo(198.0f, 118.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(198.0f, 106.0f);
        pathBuilder.lineTo(198.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.lineTo(118.44f, 106.0f);
        pathBuilder.lineTo(68.73f, 42.31f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 58.0f, 46.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.lineTo(40.0f, 106.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(58.0f, 118.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(40.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(58.0f, 150.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(70.0f, 150.0f);
        pathBuilder.horizontalLineToRelative(67.56f);
        pathBuilder.lineToRelative(49.71f, 63.69f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 198.0f, 210.0f);
        pathBuilder.lineTo(198.0f, 150.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 118.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.lineTo(143.42f, 138.0f);
        pathBuilder.lineToRelative(-15.61f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 63.44f);
        pathBuilder.lineTo(103.22f, 106.0f);
        pathBuilder.lineTo(70.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 138.0f);
        pathBuilder.lineTo(70.0f, 118.0f);
        pathBuilder.horizontalLineToRelative(42.58f);
        pathBuilder.lineToRelative(15.61f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 192.56f);
        pathBuilder.lineTo(152.78f, 150.0f);
        pathBuilder.lineTo(186.0f, 150.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyNgn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
