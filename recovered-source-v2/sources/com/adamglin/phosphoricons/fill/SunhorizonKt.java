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

/* compiled from: Sunhorizon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SunHorizon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSunHorizon", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunHorizon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunhorizonKt {
    private static ImageVector _sunHorizon;

    public static final ImageVector getSunHorizon(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(16.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(56.45f, 152.0f);
        pathBuilder.arcToRelative(73.54f, 73.54f, 0.0f, false, true, -0.45f, -8.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f);
        pathBuilder.arcToRelative(73.54f, 73.54f, 0.0f, false, true, -0.45f, 8.0f);
        pathBuilder.lineTo(240.0f, 152.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 192.0f);
        pathBuilder.lineTo(48.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.84f, 59.58f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, -7.16f);
        pathBuilder.lineToRelative(-8.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, 7.16f);
        pathBuilder.close();
        pathBuilder.moveTo(20.42f, 103.16f);
        pathBuilder.lineToRelative(16.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 7.16f, -14.31f);
        pathBuilder.lineToRelative(-16.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, 14.31f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.57f, -0.84f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.16f, -14.31f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.42f, 63.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.74f, -3.58f);
        pathBuilder.lineToRelative(8.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.32f, -7.16f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 164.42f, 63.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunHorizon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
