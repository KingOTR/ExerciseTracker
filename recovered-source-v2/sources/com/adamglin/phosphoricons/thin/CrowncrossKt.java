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

/* compiled from: Crowncross.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CrownCross", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCrownCross", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_crownCross", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CrowncrossKt {
    private static ImageVector _crownCross;

    public static final ImageVector getCrownCross(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _crownCross;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CrownCross", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.0f, 60.0f);
        pathBuilder.curveToRelative(-15.15f, 0.0f, -29.15f, 5.06f, -39.43f, 14.25f);
        pathBuilder.arcToRelative(49.31f, 49.31f, 0.0f, false, false, -8.57f, 10.0f);
        pathBuilder.lineTo(132.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(132.0f, 28.0f);
        pathBuilder.lineTo(132.0f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(124.0f, 28.0f);
        pathBuilder.lineTo(104.0f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(124.0f, 84.26f);
        pathBuilder.arcToRelative(49.31f, 49.31f, 0.0f, false, false, -8.57f, -10.0f);
        pathBuilder.curveTo(105.15f, 65.06f, 91.15f, 60.0f, 76.0f, 60.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f);
        pathBuilder.curveToRelative(0.0f, 28.36f, 13.79f, 46.38f, 25.37f, 56.51f);
        pathBuilder.arcTo(85.57f, 85.57f, 0.0f, false, false, 68.0f, 186.74f);
        pathBuilder.lineTo(68.0f, 208.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(188.0f, 186.74f);
        pathBuilder.arcToRelative(85.57f, 85.57f, 0.0f, false, false, 22.63f, -14.23f);
        pathBuilder.curveTo(222.21f, 162.38f, 236.0f, 144.36f, 236.0f, 116.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 180.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(205.59f, 166.29f);
        pathBuilder.arcToRelative(75.53f, 75.53f, 0.0f, false, true, -22.85f, 13.92f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 184.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(80.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(76.0f, 184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.73f, -3.79f);
        pathBuilder.arcToRelative(75.38f, 75.38f, 0.0f, false, true, -22.86f, -13.92f);
        pathBuilder.curveTo(35.54f, 153.17f, 28.0f, 136.25f, 28.0f, 116.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 76.0f, 68.0f);
        pathBuilder.curveToRelative(27.81f, 0.0f, 48.0f, 18.5f, 48.0f, 44.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -25.5f, 20.19f, -44.0f, 48.0f, -44.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f);
        pathBuilder.curveTo(228.0f, 136.25f, 220.46f, 153.17f, 205.59f, 166.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _crownCross = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
