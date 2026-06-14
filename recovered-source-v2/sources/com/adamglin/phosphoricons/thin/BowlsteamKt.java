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

/* compiled from: Bowlsteam.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlSteam", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBowlSteam", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlSteam", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlsteamKt {
    private static ImageVector _bowlSteam;

    public static final ImageVector getBowlSteam(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _bowlSteam;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BowlSteam", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 116.0f);
        pathBuilder.lineTo(32.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.arcToRelative(100.32f, 100.32f, 0.0f, false, false, 56.0f, 89.82f);
        pathBuilder.lineTo(84.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineToRelative(-6.18f);
        pathBuilder.arcTo(100.32f, 100.32f, 0.0f, false, false, 228.0f, 120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(166.33f, 203.66f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 164.0f, 207.3f);
        pathBuilder.lineTo(164.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(96.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(-8.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.33f, -3.64f);
        pathBuilder.arcTo(92.31f, 92.31f, 0.0f, false, true, 36.09f, 124.0f);
        pathBuilder.lineTo(219.91f, 124.0f);
        pathBuilder.arcTo(92.31f, 92.31f, 0.0f, false, true, 166.33f, 203.66f);
        pathBuilder.close();
        pathBuilder.moveTo(164.88f, 57.5f);
        pathBuilder.curveToRelative(5.56f, -6.92f, 8.0f, -12.89f, 6.83f, -16.81f);
        pathBuilder.curveToRelative(-1.0f, -3.54f, -4.9f, -4.87f, -4.94f, -4.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, -7.63f);
        pathBuilder.curveToRelative(0.32f, 0.1f, 7.84f, 2.52f, 10.16f, 10.11f);
        pathBuilder.curveToRelative(2.05f, 6.72f, -0.72f, 14.87f, -8.23f, 24.22f);
        pathBuilder.curveToRelative(-5.56f, 6.91f, -8.0f, 12.88f, -6.83f, 16.8f);
        pathBuilder.curveToRelative(1.0f, 3.54f, 4.9f, 4.87f, 4.94f, 4.88f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 92.0f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.19f, -0.18f);
        pathBuilder.curveToRelative(-0.32f, -0.1f, -7.84f, -2.52f, -10.16f, -10.11f);
        pathBuilder.curveTo(154.6f, 75.0f, 157.37f, 66.84f, 164.88f, 57.5f);
        pathBuilder.close();
        pathBuilder.moveTo(124.88f, 57.5f);
        pathBuilder.curveToRelative(5.56f, -6.92f, 8.0f, -12.89f, 6.83f, -16.81f);
        pathBuilder.curveToRelative(-1.0f, -3.54f, -4.9f, -4.87f, -4.94f, -4.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, -7.63f);
        pathBuilder.curveToRelative(0.32f, 0.1f, 7.84f, 2.52f, 10.16f, 10.11f);
        pathBuilder.curveToRelative(2.05f, 6.72f, -0.72f, 14.87f, -8.23f, 24.22f);
        pathBuilder.curveToRelative(-5.56f, 6.91f, -8.0f, 12.88f, -6.83f, 16.8f);
        pathBuilder.curveToRelative(1.0f, 3.54f, 4.9f, 4.87f, 4.94f, 4.88f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 92.0f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.19f, -0.18f);
        pathBuilder.curveToRelative(-0.32f, -0.1f, -7.84f, -2.52f, -10.16f, -10.11f);
        pathBuilder.curveTo(114.6f, 75.0f, 117.37f, 66.84f, 124.88f, 57.5f);
        pathBuilder.close();
        pathBuilder.moveTo(84.88f, 57.5f);
        pathBuilder.curveToRelative(5.56f, -6.92f, 8.0f, -12.89f, 6.83f, -16.81f);
        pathBuilder.curveToRelative(-1.0f, -3.54f, -4.9f, -4.87f, -4.94f, -4.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, -7.63f);
        pathBuilder.curveToRelative(0.32f, 0.1f, 7.84f, 2.52f, 10.16f, 10.11f);
        pathBuilder.curveToRelative(2.05f, 6.72f, -0.72f, 14.87f, -8.23f, 24.22f);
        pathBuilder.curveToRelative(-5.56f, 6.91f, -8.0f, 12.88f, -6.83f, 16.8f);
        pathBuilder.curveToRelative(1.0f, 3.54f, 4.9f, 4.87f, 4.94f, 4.88f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 88.0f, 92.0f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.19f, -0.18f);
        pathBuilder.curveToRelative(-0.32f, -0.1f, -7.84f, -2.52f, -10.16f, -10.11f);
        pathBuilder.curveTo(74.6f, 75.0f, 77.37f, 66.84f, 84.88f, 57.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlSteam = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
