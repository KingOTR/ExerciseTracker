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

/* compiled from: Clockcounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getClockCounterClockwise", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockcounterclockwiseKt {
    private static ImageVector _clockCounterClockwise;

    public static final ImageVector getClockCounterClockwise(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _clockCounterClockwise;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ClockCounterClockwise", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 62.11f, 197.82f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.0f, -11.64f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, true, false, 71.43f, 71.43f);
        pathBuilder.curveTo(67.9f, 75.0f, 64.58f, 78.51f, 61.35f, 82.0f);
        pathBuilder.lineTo(77.66f, 98.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 112.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f);
        pathBuilder.lineTo(50.0f, 70.7f);
        pathBuilder.curveToRelative(3.22f, -3.49f, 6.54f, -7.0f, 10.06f, -10.55f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.88f, 6.86f);
        pathBuilder.lineToRelative(40.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.24f, -13.72f);
        pathBuilder.lineTo(136.0f, 123.47f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
