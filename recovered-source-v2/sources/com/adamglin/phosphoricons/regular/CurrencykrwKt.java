package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Currencykrw.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyKrw", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCurrencyKrw", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyKrw", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencykrwKt {
    private static ImageVector _currencyKrw;

    public static final ImageVector getCurrencyKrw(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 128.0f);
        pathBuilder.horizontalLineTo(217.89f);
        pathBuilder.lineToRelative(21.52f, -53.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.82f, -6.0f);
        pathBuilder.lineToRelative(-24.0f, 59.0f);
        pathBuilder.horizontalLineTo(159.38f);
        pathBuilder.lineToRelative(-24.0f, -59.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.82f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 59.0f);
        pathBuilder.horizontalLineTo(55.38f);
        pathBuilder.lineToRelative(-24.0f, -59.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.82f, 6.0f);
        pathBuilder.lineToRelative(21.52f, 53.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineTo(44.61f);
        pathBuilder.lineToRelative(24.0f, 59.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.82f, 0.0f);
        pathBuilder.lineToRelative(24.0f, -59.0f);
        pathBuilder.horizontalLineToRelative(41.24f);
        pathBuilder.lineToRelative(24.0f, 59.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.82f, 0.0f);
        pathBuilder.lineToRelative(24.0f, -59.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 178.75f);
        pathBuilder.lineTo(61.88f, 144.0f);
        pathBuilder.horizontalLineTo(90.12f);
        pathBuilder.close();
        pathBuilder.moveTo(113.88f, 128.0f);
        pathBuilder.lineTo(128.0f, 93.26f);
        pathBuilder.lineTo(142.12f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 178.75f);
        pathBuilder.lineTo(165.88f, 144.0f);
        pathBuilder.horizontalLineToRelative(28.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyKrw = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
