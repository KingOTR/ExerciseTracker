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

/* compiled from: Clockcounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getClockCounterClockwise", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockcounterclockwiseKt {
    private static ImageVector _clockCounterClockwise;

    public static final ImageVector getClockCounterClockwise(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(140.0f, 80.0f);
        pathBuilder.verticalLineToRelative(41.21f);
        pathBuilder.lineToRelative(34.17f, 20.5f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.34f, 20.58f);
        pathBuilder.lineToRelative(-40.0f, -24.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(99.38f, 99.38f, 0.0f, false, false, 57.24f, 57.34f);
        pathBuilder.curveToRelative(-4.69f, 4.74f, -9.0f, 9.37f, -13.24f, 14.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(57.77f);
        pathBuilder.curveTo(63.0f, 86.0f, 68.37f, 80.22f, 74.26f, 74.26f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, true, 1.58f, 109.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.48f, 17.46f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
