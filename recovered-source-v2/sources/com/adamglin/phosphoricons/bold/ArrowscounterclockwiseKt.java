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

/* compiled from: Arrowscounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getArrowsCounterClockwise", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowscounterclockwiseKt {
    private static ImageVector _arrowsCounterClockwise;

    public static final ImageVector getArrowsCounterClockwise(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(88.0f, 108.0f);
        pathBuilder.lineTo(40.0f, 108.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 96.0f);
        pathBuilder.lineTo(28.0f, 48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineTo(52.0f, 67.0f);
        pathBuilder.lineToRelative(7.8f, -7.8f);
        pathBuilder.arcTo(99.42f, 99.42f, 0.0f, false, true, 130.0f, 29.94f);
        pathBuilder.horizontalLineToRelative(0.56f);
        pathBuilder.arcToRelative(99.38f, 99.38f, 0.0f, false, true, 69.87f, 28.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, 17.16f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -106.84f, 0.63f);
        pathBuilder.lineTo(69.0f, 84.0f);
        pathBuilder.lineTo(88.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 148.0f);
        pathBuilder.lineTo(168.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.lineToRelative(-7.8f, 7.8f);
        pathBuilder.arcToRelative(75.55f, 75.55f, 0.0f, false, true, -53.32f, 22.26f);
        pathBuilder.horizontalLineToRelative(-0.43f);
        pathBuilder.arcToRelative(75.49f, 75.49f, 0.0f, false, true, -53.09f, -21.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.78f, 17.16f);
        pathBuilder.arcToRelative(99.38f, 99.38f, 0.0f, false, false, 69.87f, 28.47f);
        pathBuilder.lineTo(126.0f, 226.06f);
        pathBuilder.arcToRelative(99.42f, 99.42f, 0.0f, false, false, 70.16f, -29.29f);
        pathBuilder.lineTo(204.0f, 189.0f);
        pathBuilder.verticalLineToRelative(19.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(228.0f, 160.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
