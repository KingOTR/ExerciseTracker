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

/* compiled from: Maskhappy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MaskHappy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMaskHappy", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_maskHappy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaskhappyKt {
    private static ImageVector _maskHappy;

    public static final ImageVector getMaskHappy(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _maskHappy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MaskHappy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(187.0f, 125.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, 5.33f);
        pathBuilder.curveToRelative(-3.4f, -3.8f, -10.72f, -6.66f, -17.0f, -6.66f);
        pathBuilder.reflectiveCurveToRelative(-13.62f, 2.86f, -17.0f, 6.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, -6.67f);
        pathBuilder.curveToRelative(4.92f, -5.5f, 14.37f, -9.33f, 23.0f, -9.33f);
        pathBuilder.reflectiveCurveTo(182.06f, 119.83f, 187.0f, 125.33f);
        pathBuilder.close();
        pathBuilder.moveTo(109.0f, 130.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.0f, -5.33f);
        pathBuilder.curveToRelative(-4.92f, -5.5f, -14.37f, -9.33f, -23.0f, -9.33f);
        pathBuilder.reflectiveCurveToRelative(-18.06f, 3.83f, -23.0f, 9.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 72.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -1.34f);
        pathBuilder.curveToRelative(3.4f, -3.8f, 10.72f, -6.66f, 17.0f, -6.66f);
        pathBuilder.reflectiveCurveTo(105.62f, 126.86f, 109.0f, 130.66f);
        pathBuilder.close();
        pathBuilder.moveTo(159.3f, 165.4f);
        pathBuilder.arcToRelative(40.89f, 40.89f, 0.0f, false, true, -62.64f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.09f, 5.2f);
        pathBuilder.arcToRelative(48.92f, 48.92f, 0.0f, false, false, 74.82f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.09f, -5.2f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.78f);
        pathBuilder.curveToRelative(0.0f, 35.0f, -9.4f, 68.0f, -26.48f, 92.92f);
        pathBuilder.curveTo(176.13f, 222.05f, 152.86f, 236.0f, 128.0f, 236.0f);
        pathBuilder.reflectiveCurveToRelative(-48.13f, -13.95f, -65.52f, -39.29f);
        pathBuilder.curveTo(45.4f, 171.83f, 36.0f, 138.83f, 36.0f, 103.79f);
        pathBuilder.lineTo(36.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.34f, -11.2f);
        pathBuilder.curveTo(66.66f, 42.38f, 95.53f, 51.7f, 128.0f, 51.7f);
        pathBuilder.reflectiveCurveToRelative(61.34f, -9.32f, 75.66f, -14.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.44f, -3.74f);
        pathBuilder.curveTo(191.72f, 50.0f, 161.77f, 59.7f, 128.0f, 59.7f);
        pathBuilder.reflectiveCurveTo(64.28f, 50.0f, 49.44f, 44.27f);
        pathBuilder.arcTo(4.14f, 4.14f, 0.0f, false, false, 48.0f, 44.0f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, false, -2.23f, 0.7f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.77f);
        pathBuilder.curveTo(44.0f, 172.28f, 81.68f, 228.0f, 128.0f, 228.0f);
        pathBuilder.reflectiveCurveToRelative(84.0f, -55.72f, 84.0f, -124.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _maskHappy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
