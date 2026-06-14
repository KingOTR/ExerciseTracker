package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Approximateequals.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ApproximateEquals", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getApproximateEquals", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_approximateEquals", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApproximateequalsKt {
    private static ImageVector _approximateEquals;

    public static final ImageVector getApproximateEquals(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(225.24f, 150.73f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.58f, 16.9f);
        pathBuilder.curveTo(205.49f, 182.7f, 189.06f, 188.0f, 174.15f, 188.0f);
        pathBuilder.curveToRelative(-19.76f, 0.0f, -36.86f, -9.29f, -51.88f, -17.44f);
        pathBuilder.curveToRelative(-25.06f, -13.62f, -44.86f, -24.37f, -74.61f, 0.3f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.32f, -18.48f);
        pathBuilder.curveToRelative(42.25f, -35.0f, 75.0f, -17.23f, 101.39f, -2.92f);
        pathBuilder.curveToRelative(25.06f, 13.61f, 44.86f, 24.37f, 74.61f, -0.31f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 225.24f, 150.73f);
        pathBuilder.close();
        pathBuilder.moveTo(47.66f, 106.85f);
        pathBuilder.curveToRelative(29.75f, -24.68f, 49.55f, -13.92f, 74.61f, -0.31f);
        pathBuilder.curveToRelative(15.0f, 8.16f, 32.12f, 17.45f, 51.88f, 17.45f);
        pathBuilder.curveToRelative(14.91f, 0.0f, 31.34f, -5.3f, 49.51f, -20.37f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.32f, -18.48f);
        pathBuilder.curveToRelative(-29.75f, 24.67f, -49.55f, 13.92f, -74.61f, 0.3f);
        pathBuilder.curveToRelative(-26.35f, -14.3f, -59.14f, -32.11f, -101.39f, 2.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.32f, 18.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _approximateEquals = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
