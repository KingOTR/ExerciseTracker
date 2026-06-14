package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Currencyinr.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyInr", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCurrencyInr", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyInr", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyinrKt {
    private static ImageVector _currencyInr;

    public static final ImageVector getCurrencyInr(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _currencyInr;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CurrencyInr", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 92.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 160.0f, 92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineTo(167.85f);
        pathBuilder2.curveToRelative(0.09f, 1.32f, 0.15f, 2.65f, 0.15f, 4.0f);
        pathBuilder2.arcToRelative(60.07f, 60.07f, 0.0f, false, true, -60.0f, 60.0f);
        pathBuilder2.horizontalLineTo(92.69f);
        pathBuilder2.lineToRelative(72.69f, 66.08f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.76f, 11.84f);
        pathBuilder2.lineToRelative(-88.0f, -80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 136.0f);
        pathBuilder2.horizontalLineToRelative(36.0f);
        pathBuilder2.arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f);
        pathBuilder2.curveToRelative(0.0f, -1.35f, -0.07f, -2.68f, -0.19f, -4.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(75.17f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, false, 108.0f, 48.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineTo(148.74f);
        pathBuilder2.arcToRelative(60.13f, 60.13f, 0.0f, false, true, 15.82f, 24.0f);
        pathBuilder2.horizontalLineTo(200.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyInr = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
