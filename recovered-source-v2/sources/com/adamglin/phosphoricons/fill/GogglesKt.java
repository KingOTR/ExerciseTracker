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

/* compiled from: Goggles.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Goggles", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGoggles", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_goggles", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GogglesKt {
    private static ImageVector _goggles;

    public static final ImageVector getGoggles(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _goggles;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Goggles", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 64.0f);
        pathBuilder.lineTo(72.0f, 64.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, false, 0.0f, 136.0f);
        pathBuilder.arcToRelative(24.06f, 24.06f, 0.0f, false, false, 17.0f, 23.0f);
        pathBuilder.curveToRelative(6.06f, 20.37f, 37.63f, 33.0f, 55.0f, 33.0f);
        pathBuilder.arcToRelative(40.07f, 40.07f, 0.0f, false, false, 39.2f, -32.0f);
        pathBuilder.horizontalLineToRelative(33.6f);
        pathBuilder.arcTo(40.07f, 40.07f, 0.0f, false, false, 184.0f, 192.0f);
        pathBuilder.curveToRelative(17.33f, 0.0f, 48.9f, -12.66f, 55.0f, -33.0f);
        pathBuilder.arcToRelative(24.06f, 24.06f, 0.0f, false, false, 17.0f, -23.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, false, 184.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.0f, 169.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f);
        pathBuilder.lineTo(53.14f, 144.45f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f);
        pathBuilder.lineTo(89.0f, 157.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 89.0f, 169.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.52f, 168.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f);
        pathBuilder.lineToRelative(-25.41f, -25.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineToRelative(25.4f, 25.41f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 208.48f, 168.48f);
        pathBuilder.close();
        pathBuilder.moveTo(237.72f, 141.65f);
        pathBuilder.curveTo(229.34f, 123.25f, 200.34f, 112.0f, 184.0f, 112.0f);
        pathBuilder.arcToRelative(40.07f, 40.07f, 0.0f, false, false, -39.2f, 32.0f);
        pathBuilder.lineTo(111.2f, 144.0f);
        pathBuilder.arcTo(40.07f, 40.07f, 0.0f, false, false, 72.0f, 112.0f);
        pathBuilder.curveToRelative(-16.34f, 0.0f, -45.34f, 11.25f, -53.68f, 29.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 16.0f, 136.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 72.0f, 80.0f);
        pathBuilder.lineTo(184.0f, 80.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, true, 56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 237.68f, 141.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _goggles = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
