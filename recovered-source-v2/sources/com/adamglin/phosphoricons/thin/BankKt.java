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

/* compiled from: Bank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBank", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BankKt {
    private static ImageVector _bank;

    public static final ImageVector getBank(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(24.0f, 100.0f);
        pathBuilder.lineTo(52.0f, 100.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(32.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(224.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(204.0f, 172.0f);
        pathBuilder.lineTo(204.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, -7.41f);
        pathBuilder.lineToRelative(-104.0f, -64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f);
        pathBuilder.lineToRelative(-104.0f, 64.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(60.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 100.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(108.0f, 172.0f);
        pathBuilder.lineTo(108.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 172.0f);
        pathBuilder.lineTo(156.0f, 172.0f);
        pathBuilder.lineTo(156.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.7f);
        pathBuilder.lineTo(217.87f, 92.0f);
        pathBuilder.lineTo(38.13f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(16.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(240.0f, 204.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
