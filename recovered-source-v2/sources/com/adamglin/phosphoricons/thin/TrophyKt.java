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

/* compiled from: Trophy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Trophy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTrophy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trophy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrophyKt {
    private static ImageVector _trophy;

    public static final ImageVector getTrophy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _trophy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Trophy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 68.0f);
        pathBuilder.lineTo(204.0f, 68.0f);
        pathBuilder.lineTo(204.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(56.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.lineTo(52.0f, 68.0f);
        pathBuilder.lineTo(24.0f, 68.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 80.0f);
        pathBuilder.lineTo(12.0f, 96.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(6.66f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 124.0f, 187.89f);
        pathBuilder.lineTo(124.0f, 220.0f);
        pathBuilder.lineTo(96.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.lineTo(132.0f, 220.0f);
        pathBuilder.lineTo(132.0f, 187.88f);
        pathBuilder.curveToRelative(32.93f, -1.74f, 60.41f, -24.91f, 69.11f, -55.88f);
        pathBuilder.lineTo(208.0f, 132.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f);
        pathBuilder.lineTo(244.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 124.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 20.0f, 96.0f);
        pathBuilder.lineTo(20.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(52.0f, 76.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(77.0f, 77.0f, 0.0f, false, false, 1.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 111.1f);
        pathBuilder.curveToRelative(0.0f, 37.71f, -30.79f, 68.62f, -68.0f, 68.9f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, -68.0f, -68.0f);
        pathBuilder.lineTo(60.0f, 52.0f);
        pathBuilder.lineTo(196.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 96.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(-5.1f);
        pathBuilder.arcToRelative(77.35f, 77.35f, 0.0f, false, false, 1.1f, -12.9f);
        pathBuilder.lineTo(204.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trophy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
