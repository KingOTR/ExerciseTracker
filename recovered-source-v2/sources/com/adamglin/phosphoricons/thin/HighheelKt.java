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

/* compiled from: Highheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighHeel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHighHeel", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highHeel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighheelKt {
    private static ImageVector _highHeel;

    public static final ImageVector getHighHeel(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _highHeel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HighHeel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.09f, 160.09f);
        pathBuilder.lineTo(178.0f, 148.35f);
        pathBuilder.lineTo(66.83f, 37.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 63.91f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.86f, 1.3f);
        pathBuilder.curveTo(39.74f, 60.6f, 28.0f, 90.0f, 28.0f, 120.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(72.0f, 204.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(84.0f, 136.36f);
        pathBuilder.arcToRelative(116.73f, 116.73f, 0.0f, false, true, 55.59f, 60.23f);
        pathBuilder.arcTo(11.93f, 11.93f, 0.0f, false, false, 150.72f, 204.0f);
        pathBuilder.lineTo(240.0f, 204.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineToRelative(-4.73f);
        pathBuilder.arcTo(27.74f, 27.74f, 0.0f, false, false, 230.09f, 160.09f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(40.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(36.0f, 124.08f);
        pathBuilder.arcToRelative(114.9f, 114.9f, 0.0f, false, true, 40.0f, 8.62f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(150.72f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.71f, -2.42f);
        pathBuilder.arcToRelative(124.36f, 124.36f, 0.0f, false, false, -44.87f, -55.76f);
        pathBuilder.arcToRelative(123.1f, 123.1f, 0.0f, false, false, -66.07f, -21.75f);
        pathBuilder.curveToRelative(0.93f, -25.33f, 10.8f, -50.0f, 28.11f, -70.23f);
        pathBuilder.lineToRelative(109.0f, 109.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 1.07f);
        pathBuilder.lineToRelative(53.22f, 12.0f);
        pathBuilder.arcTo(19.79f, 19.79f, 0.0f, false, true, 244.0f, 187.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highHeel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
