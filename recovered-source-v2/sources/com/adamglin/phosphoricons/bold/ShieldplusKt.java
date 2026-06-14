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

/* compiled from: Shieldplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ShieldPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getShieldPlus", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shieldPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShieldplusKt {
    private static ImageVector _shieldPlus;

    public static final ImageVector getShieldPlus(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _shieldPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ShieldPlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(84.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(116.0f, 96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(140.0f, 140.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 140.0f);
        pathBuilder.lineTo(96.0f, 140.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.curveToRelative(0.0f, 54.29f, -26.32f, 87.22f, -48.4f, 105.29f);
        pathBuilder.curveToRelative(-23.71f, 19.39f, -47.44f, 26.0f, -48.44f, 26.29f);
        pathBuilder.arcToRelative(12.1f, 12.1f, 0.0f, false, true, -6.32f, 0.0f);
        pathBuilder.curveToRelative(-1.0f, -0.28f, -24.73f, -6.9f, -48.44f, -26.29f);
        pathBuilder.curveTo(54.32f, 199.22f, 28.0f, 166.29f, 28.0f, 112.0f);
        pathBuilder.lineTo(28.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 48.0f, 36.0f);
        pathBuilder.lineTo(208.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 228.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 60.0f);
        pathBuilder.lineTo(52.0f, 60.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.curveToRelative(0.0f, 35.71f, 13.09f, 64.69f, 38.91f, 86.15f);
        pathBuilder.arcTo(126.14f, 126.14f, 0.0f, false, false, 128.0f, 219.38f);
        pathBuilder.arcToRelative(126.28f, 126.28f, 0.0f, false, false, 37.09f, -21.23f);
        pathBuilder.curveTo(190.91f, 176.69f, 204.0f, 147.71f, 204.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shieldPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
