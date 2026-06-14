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

/* compiled from: Currencykrw.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyKrw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCurrencyKrw", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyKrw", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencykrwKt {
    private static ImageVector _currencyKrw;

    public static final ImageVector getCurrencyKrw(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _currencyKrw;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CurrencyKrw", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 130.0f);
        pathBuilder.horizontalLineTo(214.91f);
        pathBuilder.lineToRelative(22.65f, -55.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.12f, -4.52f);
        pathBuilder.lineTo(202.0f, 130.0f);
        pathBuilder.horizontalLineTo(158.0f);
        pathBuilder.lineTo(133.56f, 69.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.12f, 0.0f);
        pathBuilder.lineTo(98.0f, 130.0f);
        pathBuilder.horizontalLineTo(54.0f);
        pathBuilder.lineTo(29.56f, 69.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.12f, 4.52f);
        pathBuilder.lineTo(41.09f, 130.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(46.0f);
        pathBuilder.lineToRelative(24.48f, 60.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.12f, 0.0f);
        pathBuilder.lineTo(106.0f, 142.0f);
        pathBuilder.horizontalLineTo(150.0f);
        pathBuilder.lineToRelative(24.48f, 60.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.12f, 0.0f);
        pathBuilder.lineTo(210.0f, 142.0f);
        pathBuilder.horizontalLineToRelative(30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 184.06f);
        pathBuilder.lineTo(58.91f, 142.0f);
        pathBuilder.horizontalLineTo(93.09f);
        pathBuilder.close();
        pathBuilder.moveTo(110.91f, 130.0f);
        pathBuilder.lineTo(128.0f, 87.94f);
        pathBuilder.lineTo(145.09f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 184.06f);
        pathBuilder.lineTo(162.91f, 142.0f);
        pathBuilder.horizontalLineToRelative(34.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyKrw = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
