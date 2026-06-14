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

/* compiled from: Barricade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Barricade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBarricade", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_barricade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BarricadeKt {
    private static ImageVector _barricade;

    public static final ImageVector getBarricade(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _barricade;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Barricade", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 68.0f);
        pathBuilder.lineTo(32.0f, 68.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 80.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(60.0f, 164.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 164.0f);
        pathBuilder.lineTo(188.0f, 164.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(196.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(236.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 80.0f);
        pathBuilder.verticalLineToRelative(58.34f);
        pathBuilder.lineTo(165.66f, 76.0f);
        pathBuilder.lineTo(224.0f, 76.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 76.0f);
        pathBuilder.lineTo(82.34f, 76.0f);
        pathBuilder.lineToRelative(80.0f, 80.0f);
        pathBuilder.lineTo(101.66f, 156.0f);
        pathBuilder.lineTo(28.0f, 82.34f);
        pathBuilder.lineTo(28.0f, 80.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 152.0f);
        pathBuilder.lineTo(28.0f, 93.66f);
        pathBuilder.lineTo(90.34f, 156.0f);
        pathBuilder.lineTo(32.0f, 156.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 156.0f);
        pathBuilder.lineTo(173.66f, 156.0f);
        pathBuilder.lineToRelative(-80.0f, -80.0f);
        pathBuilder.horizontalLineToRelative(60.68f);
        pathBuilder.lineTo(228.0f, 149.66f);
        pathBuilder.lineTo(228.0f, 152.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 224.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _barricade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
