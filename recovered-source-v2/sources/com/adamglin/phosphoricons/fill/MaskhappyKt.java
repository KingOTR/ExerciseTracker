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

/* compiled from: Maskhappy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MaskHappy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMaskHappy", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_maskHappy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaskhappyKt {
    private static ImageVector _maskHappy;

    public static final ImageVector getMaskHappy(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(217.0f, 34.8f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -14.82f, -1.71f);
        pathBuilder.curveTo(188.15f, 38.55f, 159.82f, 47.71f, 128.0f, 47.71f);
        pathBuilder.reflectiveCurveTo(67.84f, 38.55f, 53.79f, 33.09f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.verticalLineToRelative(55.77f);
        pathBuilder.curveToRelative(0.0f, 35.84f, 9.65f, 69.65f, 27.18f, 95.18f);
        pathBuilder.curveToRelative(18.16f, 26.46f, 42.6f, 41.0f, 68.82f, 41.0f);
        pathBuilder.reflectiveCurveToRelative(50.66f, -14.57f, 68.82f, -41.0f);
        pathBuilder.curveTo(214.35f, 173.44f, 224.0f, 139.63f, 224.0f, 103.79f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 217.0f, 34.8f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 133.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 66.0f, 122.66f);
        pathBuilder.curveTo(71.75f, 116.28f, 82.18f, 112.0f, 92.0f, 112.0f);
        pathBuilder.reflectiveCurveToRelative(20.25f, 4.28f, 26.0f, 10.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 106.0f, 133.33f);
        pathBuilder.curveToRelative(-2.68f, -3.0f, -8.85f, -5.33f, -14.0f, -5.33f);
        pathBuilder.reflectiveCurveTo(80.64f, 130.34f, 78.0f, 133.33f);
        pathBuilder.close();
        pathBuilder.moveTo(168.49f, 181.19f);
        pathBuilder.arcToRelative(52.9f, 52.9f, 0.0f, false, true, -80.9f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 99.72f, 170.8f);
        pathBuilder.arcToRelative(36.89f, 36.89f, 0.0f, false, false, 56.56f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.17f, 10.39f);
        pathBuilder.close();
        pathBuilder.moveTo(189.34f, 134.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.63f);
        pathBuilder.curveToRelative(-2.68f, -3.0f, -8.85f, -5.33f, -14.0f, -5.33f);
        pathBuilder.reflectiveCurveToRelative(-11.36f, 2.34f, -14.0f, 5.33f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 138.0f, 122.66f);
        pathBuilder.curveToRelative(5.71f, -6.38f, 16.14f, -10.66f, 26.0f, -10.66f);
        pathBuilder.reflectiveCurveToRelative(20.25f, 4.28f, 26.0f, 10.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 189.34f, 134.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _maskHappy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
