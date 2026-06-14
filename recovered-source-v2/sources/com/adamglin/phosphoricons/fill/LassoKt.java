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

/* compiled from: Lasso.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lasso", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLasso", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lasso", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LassoKt {
    private static ImageVector _lasso;

    public static final ImageVector getLasso(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _lasso;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lasso", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(93.43f, 136.11f);
        pathBuilder.arcToRelative(17.14f, 17.14f, 0.0f, false, false, -15.35f, 6.1f);
        pathBuilder.curveToRelative(9.31f, 6.56f, 22.51f, 11.33f, 37.43f, 13.07f);
        pathBuilder.curveTo(110.41f, 143.33f, 101.72f, 137.0f, 93.43f, 136.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 48.0f);
        pathBuilder2.lineTo(224.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder2.lineTo(127.65f, 224.0f);
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.23f, -6.34f);
        pathBuilder2.curveToRelative(7.5f, -10.23f, 11.58f, -23.24f, 11.58f, -37.84f);
        pathBuilder2.curveToRelative(0.0f, -2.79f, -0.13f, -5.46f, -0.35f, -8.05f);
        pathBuilder2.curveTo(176.79f, 169.33f, 208.0f, 147.47f, 208.0f, 120.0f);
        pathBuilder2.curveToRelative(0.0f, -29.15f, -35.14f, -52.0f, -80.0f, -52.0f);
        pathBuilder2.reflectiveCurveTo(48.0f, 90.84f, 48.0f, 120.0f);
        pathBuilder2.curveToRelative(0.0f, 27.31f, 30.82f, 49.07f, 71.58f, 51.73f);
        pathBuilder2.arcToRelative(77.0f, 77.0f, 0.0f, false, true, 0.42f, 8.09f);
        pathBuilder2.curveToRelative(0.0f, 17.62f, -7.65f, 31.95f, -21.0f, 39.32f);
        pathBuilder2.arcTo(38.77f, 38.77f, 0.0f, false, true, 79.27f, 224.0f);
        pathBuilder2.lineTo(48.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder2.lineTo(32.0f, 48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 32.0f);
        pathBuilder2.lineTo(208.0f, 32.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 120.0f);
        pathBuilder2.curveToRelative(0.0f, -19.51f, -29.31f, -36.0f, -64.0f, -36.0f);
        pathBuilder2.reflectiveCurveToRelative(-64.0f, 16.48f, -64.0f, 36.0f);
        pathBuilder2.arcToRelative(21.29f, 21.29f, 0.0f, false, false, 3.0f, 10.63f);
        pathBuilder2.arcTo(33.65f, 33.65f, 0.0f, false, true, 95.16f, 120.2f);
        pathBuilder2.curveToRelative(15.0f, 1.63f, 30.84f, 13.4f, 37.54f, 35.68f);
        pathBuilder2.curveTo(165.3f, 154.47f, 192.0f, 138.62f, 192.0f, 120.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lasso = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
