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

/* compiled from: Handtap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandTap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandTap", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handTap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandtapKt {
    private static ImageVector _handTap;

    public static final ImageVector getHandTap(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _handTap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandTap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(64.0f, 64.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.23f, 120.0f);
        pathBuilder.curveToRelative(-8.61f, 0.4f, -15.23f, 7.82f, -15.23f, 16.43f);
        pathBuilder.verticalLineToRelative(7.28f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(176.0f, 120.45f);
        pathBuilder.curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 144.0f, 120.0f);
        pathBuilder.verticalLineToRelative(15.73f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(128.0f, 64.45f);
        pathBuilder.curveToRelative(0.0f, -8.61f, -6.62f, -16.0f, -15.23f, -16.43f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 64.0f);
        pathBuilder.lineTo(96.0f, 183.74f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -6.72f, 8.16f);
        pathBuilder.lineToRelative(-0.12f, 0.0f);
        pathBuilder.arcToRelative(6.09f, 6.09f, 0.0f, false, true, -6.0f, -3.09f);
        pathBuilder.lineToRelative(-21.0f, -36.44f);
        pathBuilder.curveToRelative(-4.3f, -7.46f, -13.74f, -10.57f, -21.4f, -6.62f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 34.15f, 168.0f);
        pathBuilder.lineTo(65.1f, 228.05f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f);
        pathBuilder.lineTo(208.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, -4.42f);
        pathBuilder.curveToRelative(0.36f, -0.72f, 8.84f, -15.06f, 8.84f, -40.65f);
        pathBuilder.lineTo(224.0f, 136.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 207.23f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handTap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
