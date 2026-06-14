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

/* compiled from: Skull.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Skull", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSkull", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skull", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkullKt {
    private static ImageVector _skull;

    public static final ImageVector getSkull(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _skull;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Skull", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 132.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 116.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 108.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, 29.85f, -13.05f, 57.78f, -36.0f, 77.52f);
        pathBuilder.lineTo(200.0f, 216.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(76.0f, 236.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(56.0f, 193.52f);
        pathBuilder.curveToRelative(-23.0f, -19.74f, -36.0f, -47.67f, -36.0f, -77.52f);
        pathBuilder.curveTo(20.0f, 58.65f, 68.45f, 12.0f, 128.0f, 12.0f);
        pathBuilder.reflectiveCurveTo(236.0f, 58.65f, 236.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, -44.11f, -37.68f, -80.0f, -84.0f, -80.0f);
        pathBuilder.reflectiveCurveTo(44.0f, 71.89f, 44.0f, 116.0f);
        pathBuilder.curveToRelative(0.0f, 24.31f, 11.41f, 47.0f, 31.31f, 62.3f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 187.82f);
        pathBuilder.lineTo(80.0f, 212.0f);
        pathBuilder.lineTo(96.0f, 212.0f);
        pathBuilder.lineTo(96.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(136.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.lineTo(176.0f, 187.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.69f, -9.51f);
        pathBuilder.curveTo(200.59f, 163.0f, 212.0f, 140.31f, 212.0f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skull = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
