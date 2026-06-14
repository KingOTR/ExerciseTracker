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

/* compiled from: Bank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBank", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BankKt {
    private static ImageVector _bank;

    public static final ImageVector getBank(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bank", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(24.0f, 102.0f);
        pathBuilder.lineTo(50.0f, 102.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(32.0f, 170.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(224.0f, 182.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(206.0f, 170.0f);
        pathBuilder.lineTo(206.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, -11.11f);
        pathBuilder.lineToRelative(-104.0f, -64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.28f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 24.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 102.0f);
        pathBuilder.lineTo(98.0f, 102.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(62.0f, 170.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 102.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(110.0f, 170.0f);
        pathBuilder.lineTo(110.0f, 102.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 170.0f);
        pathBuilder.lineTo(158.0f, 170.0f);
        pathBuilder.lineTo(158.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 39.0f);
        pathBuilder.lineToRelative(82.8f, 51.0f);
        pathBuilder.lineTo(45.2f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(16.0f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(240.0f, 202.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
