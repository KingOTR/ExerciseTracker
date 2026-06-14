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

/* compiled from: Currencyeth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CurrencyEth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCurrencyEth", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_currencyEth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CurrencyethKt {
    private static ImageVector _currencyEth;

    public static final ImageVector getCurrencyEth(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(220.72f, 124.29f);
        pathBuilder.lineToRelative(-88.0f, -112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.44f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 7.42f);
        pathBuilder.lineToRelative(88.0f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.44f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -112.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 220.72f, 124.29f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 33.35f);
        pathBuilder.lineToRelative(72.56f, 92.35f);
        pathBuilder.lineToRelative(-72.56f, 33.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 158.68f);
        pathBuilder.lineToRelative(-72.56f, -33.0f);
        pathBuilder.lineTo(122.0f, 33.35f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 171.86f);
        pathBuilder.verticalLineToRelative(50.79f);
        pathBuilder.lineToRelative(-62.08f, -79.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 171.86f);
        pathBuilder.lineTo(196.08f, 143.65f);
        pathBuilder.lineTo(134.0f, 222.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _currencyEth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
