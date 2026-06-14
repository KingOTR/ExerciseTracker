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

/* compiled from: Clockclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getClockClockwise", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockclockwiseKt {
    private static ImageVector _clockClockwise;

    public static final ImageVector getClockClockwise(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _clockClockwise;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ClockClockwise", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 80.0f);
        pathBuilder.verticalLineToRelative(43.47f);
        pathBuilder.lineToRelative(36.12f, 21.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 13.72f);
        pathBuilder.lineToRelative(-40.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f);
        pathBuilder.lineTo(120.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.06f, 56.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f);
        pathBuilder.lineTo(206.0f, 70.71f);
        pathBuilder.curveToRelative(-3.23f, -3.51f, -6.56f, -7.0f, -10.1f, -10.59f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, false, -2.0f, 137.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -11.64f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, true, true, 184.54f, 71.4f);
        pathBuilder.curveToRelative(3.54f, 3.58f, 6.87f, 7.1f, 10.11f, 10.63f);
        pathBuilder.lineTo(178.34f, 98.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(232.0f, 64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 227.06f, 56.61f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
