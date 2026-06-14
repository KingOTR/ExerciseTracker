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

/* compiled from: Sunhorizon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SunHorizon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSunHorizon", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunHorizon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunhorizonKt {
    private static ImageVector _sunHorizon;

    public static final ImageVector getSunHorizon(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _sunHorizon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SunHorizon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 148.0f);
        pathBuilder.lineTo(203.89f, 148.0f);
        pathBuilder.curveToRelative(0.07f, -1.33f, 0.11f, -2.66f, 0.11f, -4.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 1.34f, 0.0f, 2.67f, 0.11f, 4.0f);
        pathBuilder.lineTo(16.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(240.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 144.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 104.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 1.34f, -0.07f, 2.67f, -0.17f, 4.0f);
        pathBuilder.lineTo(76.17f, 148.0f);
        pathBuilder.curveTo(76.07f, 146.67f, 76.0f, 145.34f, 76.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(48.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(208.0f, 188.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.62f, 92.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.17f, -7.59f);
        pathBuilder.lineToRelative(12.0f, 4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -7.58f, 22.77f);
        pathBuilder.lineToRelative(-12.0f, -4.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 12.62f, 92.21f);
        pathBuilder.close();
        pathBuilder.moveTo(68.62f, 43.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.76f, -7.59f);
        pathBuilder.lineToRelative(4.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 72.62f, 55.8f);
        pathBuilder.close();
        pathBuilder.moveTo(208.62f, 103.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.59f, -15.18f);
        pathBuilder.lineToRelative(12.0f, -4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.58f, 22.77f);
        pathBuilder.lineToRelative(-12.0f, 4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.17f, -7.59f);
        pathBuilder.close();
        pathBuilder.moveTo(160.62f, 48.21f);
        pathBuilder.lineTo(164.62f, 36.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.76f, 7.59f);
        pathBuilder.lineToRelative(-4.0f, 12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -22.76f, -7.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunHorizon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
