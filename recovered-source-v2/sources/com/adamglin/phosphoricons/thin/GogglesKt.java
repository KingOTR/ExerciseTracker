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

/* compiled from: Goggles.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Goggles", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGoggles", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_goggles", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GogglesKt {
    private static ImageVector _goggles;

    public static final ImageVector getGoggles(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(252.0f, 136.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f);
        pathBuilder.lineTo(72.0f, 68.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, false, 4.0f, 136.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.35f, 19.65f);
        pathBuilder.curveTo(23.91f, 174.84f, 54.81f, 188.0f, 72.0f, 188.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 35.77f, -32.0f);
        pathBuilder.horizontalLineToRelative(40.46f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 188.0f);
        pathBuilder.curveToRelative(17.19f, 0.0f, 48.09f, -13.16f, 51.65f, -32.35f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 252.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -7.75f, 7.92f, -15.25f, 17.81f, -20.53f);
        pathBuilder.lineToRelative(43.0f, 42.95f);
        pathBuilder.arcTo(27.89f, 27.89f, 0.0f, false, true, 72.0f, 180.0f);
        pathBuilder.curveTo(55.45f, 180.0f, 28.0f, 166.44f, 28.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.42f, 168.76f);
        pathBuilder.lineTo(53.58f, 127.92f);
        pathBuilder.curveTo(60.0f, 125.46f, 66.58f, 124.0f, 72.0f, 124.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 22.42f, 44.76f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 152.0f);
        pathBuilder.arcToRelative(27.94f, 27.94f, 0.0f, false, true, 9.42f, -20.92f);
        pathBuilder.lineTo(208.0f, 173.65f);
        pathBuilder.curveToRelative(-8.0f, 3.91f, -17.0f, 6.35f, -24.0f, 6.35f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 156.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.2f, 169.55f);
        pathBuilder.lineTo(172.25f, 126.55f);
        pathBuilder.arcTo(27.86f, 27.86f, 0.0f, false, true, 184.0f, 124.0f);
        pathBuilder.curveToRelative(16.55f, 0.0f, 44.0f, 13.56f, 44.0f, 28.0f);
        pathBuilder.curveTo(228.0f, 158.39f, 222.62f, 164.6f, 215.2f, 169.55f);
        pathBuilder.close();
        pathBuilder.moveTo(235.46f, 147.49f);
        pathBuilder.curveTo(231.15f, 128.77f, 200.93f, 116.0f, 184.0f, 116.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -35.77f, 32.0f);
        pathBuilder.lineTo(107.77f, 148.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 72.0f, 116.0f);
        pathBuilder.curveToRelative(-16.93f, 0.0f, -47.15f, 12.77f, -51.46f, 31.49f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 12.0f, 136.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 72.0f, 76.0f);
        pathBuilder.lineTo(184.0f, 76.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, true, 60.0f, 60.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 235.46f, 147.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _goggles = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
