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

/* compiled from: Currencyeth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyEth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCurrencyEth", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyEth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyethKt {
    private static ImageVector _currencyEth;

    public static final ImageVector getCurrencyEth(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _currencyEth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CurrencyEth", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.44f, 120.59f);
        pathBuilder.lineToRelative(-88.0f, -112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -18.88f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 14.82f);
        pathBuilder.lineToRelative(0.6f, 0.76f);
        pathBuilder.arcToRelative(3.72f, 3.72f, 0.0f, false, false, 0.44f, 0.56f);
        pathBuilder.lineToRelative(87.0f, 110.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.88f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -112.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 225.44f, 120.59f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 50.7f);
        pathBuilder.lineToRelative(57.12f, 72.7f);
        pathBuilder.lineToRelative(-57.12f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 149.36f);
        pathBuilder.lineTo(58.88f, 123.36f);
        pathBuilder.lineTo(116.0f, 50.7f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 175.73f);
        pathBuilder.lineTo(116.0f, 205.3f);
        pathBuilder.lineToRelative(-36.15f, -46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 175.73f);
        pathBuilder.lineTo(176.15f, 159.3f);
        pathBuilder.lineTo(140.0f, 205.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyEth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
