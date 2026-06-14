package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handpointing.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandPointing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandPointing", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handPointing", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandpointingKt {
    private static ImageVector _handPointing;

    public static final ImageVector getHandPointing(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _handPointing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandPointing", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 116.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -80.0f, 80.0f);
        pathBuilder.curveToRelative(-44.18f, 0.0f, -55.81f, -24.0f, -93.32f, -90.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f);
        pathBuilder.lineTo(96.0f, 152.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(196.0f, 88.0f);
        pathBuilder2.arcToRelative(27.86f, 27.86f, 0.0f, false, false, -13.35f, 3.39f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 144.0f, 74.7f);
        pathBuilder2.lineTo(144.0f, 44.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.lineToRelative(-3.82f, -6.13f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 35.73f, 146.0f);
        pathBuilder2.lineToRelative(4.67f, 8.23f);
        pathBuilder2.curveTo(74.81f, 214.89f, 89.05f, 240.0f, 136.0f, 240.0f);
        pathBuilder2.arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f);
        pathBuilder2.lineTo(224.0f, 116.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 152.0f);
        pathBuilder2.arcToRelative(72.08f, 72.08f, 0.0f, false, true, -72.0f, 72.0f);
        pathBuilder2.curveToRelative(-37.63f, 0.0f, -47.84f, -18.0f, -81.68f, -77.68f);
        pathBuilder2.lineToRelative(-4.69f, -8.27f);
        pathBuilder2.lineToRelative(0.0f, -0.05f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 54.0f, 121.61f);
        pathBuilder2.arcToRelative(11.88f, 11.88f, 0.0f, false, true, 6.0f, -1.6f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.41f, 6.0f);
        pathBuilder2.arcToRelative(1.76f, 1.76f, 0.0f, false, false, 0.14f, 0.23f);
        pathBuilder2.lineToRelative(18.67f, 30.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 152.0f);
        pathBuilder2.lineTo(104.0f, 44.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(68.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(144.0f, 100.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(20.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-4.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handPointing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
