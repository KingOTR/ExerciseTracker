package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handtap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandTap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHandTap", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handTap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandtapKt {
    private static ImageVector _handTap;

    public static final ImageVector getHandTap(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(56.0f, 76.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 120.0f);
        pathBuilder.arcToRelative(27.9f, 27.9f, 0.0f, false, false, -13.36f, 3.39f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 144.0f, 106.7f);
        pathBuilder.lineTo(144.0f, 76.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.lineToRelative(-3.82f, -6.13f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -48.41f, 28.17f);
        pathBuilder.lineToRelative(29.32f, 50.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 78.89f, 220.0f);
        pathBuilder.lineTo(49.6f, 170.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.78f, -12.0f);
        pathBuilder.lineToRelative(0.14f, 0.23f);
        pathBuilder.lineToRelative(18.68f, 30.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 184.0f);
        pathBuilder.lineTo(104.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 16.0f, 0.0f);
        pathBuilder.lineTo(144.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.curveToRelative(0.0f, 21.61f, -7.1f, 36.3f, -7.16f, 36.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.58f, 10.73f);
        pathBuilder.arcTo(7.9f, 7.9f, 0.0f, false, false, 208.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, -4.42f);
        pathBuilder.curveToRelative(0.37f, -0.73f, 8.85f, -18.0f, 8.85f, -43.58f);
        pathBuilder.lineTo(224.01f, 148.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handTap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
