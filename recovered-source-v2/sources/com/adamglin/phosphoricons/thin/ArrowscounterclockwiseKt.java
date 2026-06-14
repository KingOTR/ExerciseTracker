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

/* compiled from: Arrowscounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getArrowsCounterClockwise", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowscounterclockwiseKt {
    private static ImageVector _arrowsCounterClockwise;

    public static final ImageVector getArrowsCounterClockwise(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(88.0f, 100.0f);
        pathBuilder.lineTo(40.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(36.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 86.34f);
        pathBuilder.lineTo(65.46f, 64.89f);
        pathBuilder.arcTo(91.39f, 91.39f, 0.0f, false, true, 130.0f, 37.94f);
        pathBuilder.horizontalLineToRelative(0.51f);
        pathBuilder.arcTo(91.43f, 91.43f, 0.0f, false, true, 194.8f, 64.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 5.72f);
        pathBuilder.arcToRelative(83.44f, 83.44f, 0.0f, false, false, -58.68f, -23.91f);
        pathBuilder.horizontalLineToRelative(-0.47f);
        pathBuilder.arcToRelative(83.52f, 83.52f, 0.0f, false, false, -58.94f, 24.6f);
        pathBuilder.lineTo(49.66f, 92.0f);
        pathBuilder.lineTo(88.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 156.0f);
        pathBuilder.lineTo(168.0f, 156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(38.34f);
        pathBuilder.lineToRelative(-21.45f, 21.46f);
        pathBuilder.arcTo(83.52f, 83.52f, 0.0f, false, true, 126.0f, 210.06f);
        pathBuilder.horizontalLineToRelative(-0.47f);
        pathBuilder.arcTo(83.44f, 83.44f, 0.0f, false, true, 66.8f, 186.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.72f);
        pathBuilder.arcToRelative(91.43f, 91.43f, 0.0f, false, false, 64.28f, 26.19f);
        pathBuilder.lineTo(126.0f, 218.06f);
        pathBuilder.arcToRelative(91.39f, 91.39f, 0.0f, false, false, 64.55f, -26.95f);
        pathBuilder.lineTo(212.0f, 169.66f);
        pathBuilder.lineTo(212.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(220.0f, 160.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
