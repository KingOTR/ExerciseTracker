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

/* compiled from: Approximateequals.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ApproximateEquals", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getApproximateEquals", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_approximateEquals", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApproximateequalsKt {
    private static ImageVector _approximateEquals;

    public static final ImageVector getApproximateEquals(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _approximateEquals;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ApproximateEquals", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.2f, 160.87f);
        pathBuilder.curveToRelative(-13.07f, 11.18f, -24.9f, 15.1f, -35.64f, 15.1f);
        pathBuilder.curveToRelative(-14.26f, 0.0f, -26.62f, -6.92f, -37.47f, -13.0f);
        pathBuilder.curveToRelative(-18.41f, -10.31f, -32.95f, -18.45f, -54.89f, 0.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.4f, -12.16f);
        pathBuilder.curveToRelative(30.42f, -26.0f, 54.09f, -12.76f, 73.11f, -2.11f);
        pathBuilder.curveToRelative(18.41f, 10.31f, 33.0f, 18.45f, 54.89f, -0.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.4f, 12.16f);
        pathBuilder.close();
        pathBuilder.moveTo(197.2f, 104.87f);
        pathBuilder.curveToRelative(-13.07f, 11.18f, -24.9f, 15.1f, -35.64f, 15.1f);
        pathBuilder.curveToRelative(-14.26f, 0.0f, -26.62f, -6.92f, -37.47f, -13.0f);
        pathBuilder.curveToRelative(-18.41f, -10.31f, -32.95f, -18.45f, -54.89f, 0.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 58.8f, 95.13f);
        pathBuilder.curveToRelative(30.42f, -26.0f, 54.09f, -12.76f, 73.11f, -2.11f);
        pathBuilder.curveToRelative(18.41f, 10.31f, 33.0f, 18.45f, 54.89f, -0.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.4f, 12.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _approximateEquals = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
