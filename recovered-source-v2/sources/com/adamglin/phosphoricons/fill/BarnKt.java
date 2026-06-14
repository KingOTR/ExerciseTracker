package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Barn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Barn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBarn", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_barn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarnKt {
    private static ImageVector _barn;

    public static final ImageVector getBarn(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _barn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Barn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineTo(232.0f, 130.57f);
        pathBuilder.lineToRelative(1.49f, 2.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, -9.3f);
        pathBuilder.lineToRelative(-40.0f, -56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, -1.94f);
        pathBuilder.lineTo(137.0f, 18.77f);
        pathBuilder.lineToRelative(-0.1f, -0.07f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -17.76f, 0.0f);
        pathBuilder.lineToRelative(-0.1f, 0.07f);
        pathBuilder.lineTo(51.45f, 65.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 1.94f);
        pathBuilder.lineToRelative(-40.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.0f, 9.3f);
        pathBuilder.lineTo(24.0f, 130.57f);
        pathBuilder.lineTo(24.0f, 192.0f);
        pathBuilder.lineTo(16.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(240.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f);
        pathBuilder.lineTo(112.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.64f, 120.0f);
        pathBuilder.lineTo(128.0f, 146.17f);
        pathBuilder.lineTo(91.36f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 125.83f);
        pathBuilder.lineTo(114.24f, 156.0f);
        pathBuilder.lineTo(72.0f, 186.17f);
        pathBuilder.close();
        pathBuilder.moveTo(91.36f, 192.0f);
        pathBuilder.lineTo(128.0f, 165.83f);
        pathBuilder.lineTo(164.64f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 186.17f);
        pathBuilder.lineTo(141.76f, 156.0f);
        pathBuilder.lineTo(184.0f, 125.83f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _barn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
