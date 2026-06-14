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

/* compiled from: Arrowscounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getArrowsCounterClockwise", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowscounterclockwiseKt {
    private static ImageVector _arrowsCounterClockwise;

    public static final ImageVector getArrowsCounterClockwise(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _arrowsCounterClockwise;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowsCounterClockwise", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 104.0f);
        pathBuilder.lineTo(40.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(32.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f);
        pathBuilder.lineTo(64.0f, 60.7f);
        pathBuilder.arcToRelative(95.42f, 95.42f, 0.0f, false, true, 66.0f, -26.76f);
        pathBuilder.horizontalLineToRelative(0.53f);
        pathBuilder.arcToRelative(95.36f, 95.36f, 0.0f, false, true, 67.07f, 27.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.18f, 11.44f);
        pathBuilder.arcToRelative(79.52f, 79.52f, 0.0f, false, false, -55.89f, -22.77f);
        pathBuilder.horizontalLineToRelative(-0.45f);
        pathBuilder.arcTo(79.48f, 79.48f, 0.0f, false, false, 75.35f, 72.0f);
        pathBuilder.lineTo(93.66f, 90.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 152.0f);
        pathBuilder.lineTo(168.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f);
        pathBuilder.lineTo(180.65f, 184.0f);
        pathBuilder.arcToRelative(79.48f, 79.48f, 0.0f, false, true, -54.72f, 22.09f);
        pathBuilder.horizontalLineToRelative(-0.45f);
        pathBuilder.arcToRelative(79.52f, 79.52f, 0.0f, false, true, -55.89f, -22.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.18f, 11.44f);
        pathBuilder.arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, 27.33f);
        pathBuilder.lineTo(126.0f, 222.09f);
        pathBuilder.arcToRelative(95.42f, 95.42f, 0.0f, false, false, 66.0f, -26.76f);
        pathBuilder.lineToRelative(18.36f, 18.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 208.0f);
        pathBuilder.lineTo(224.0f, 160.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 216.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
