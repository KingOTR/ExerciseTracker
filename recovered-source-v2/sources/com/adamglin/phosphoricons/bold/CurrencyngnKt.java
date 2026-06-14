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

/* compiled from: Currencyngn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyNgn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCurrencyNgn", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyNgn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyngnKt {
    private static ImageVector _currencyNgn;

    public static final ImageVector getCurrencyNgn(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 116.0f);
        pathBuilder.lineTo(204.0f, 116.0f);
        pathBuilder.lineTo(204.0f, 46.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(70.0f);
        pathBuilder.lineTo(133.86f, 116.0f);
        pathBuilder.lineTo(73.46f, 38.62f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 46.0f);
        pathBuilder.verticalLineToRelative(70.0f);
        pathBuilder.lineTo(40.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(52.0f, 140.0f);
        pathBuilder.verticalLineToRelative(70.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(76.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(46.14f);
        pathBuilder.lineToRelative(60.4f, 77.38f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 210.0f);
        pathBuilder.lineTo(204.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 116.0f);
        pathBuilder.lineTo(76.0f, 80.88f);
        pathBuilder.lineTo(103.41f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 175.12f);
        pathBuilder.lineTo(152.59f, 140.0f);
        pathBuilder.lineTo(180.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyNgn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
