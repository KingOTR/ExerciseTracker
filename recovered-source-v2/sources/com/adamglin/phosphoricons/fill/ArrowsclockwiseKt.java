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

/* compiled from: Arrowsclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getArrowsClockwise", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowsclockwiseKt {
    private static ImageVector _arrowsClockwise;

    public static final ImageVector getArrowsClockwise(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _arrowsClockwise;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowsClockwise", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 48.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f);
        pathBuilder.lineTo(180.65f, 72.0f);
        pathBuilder.arcToRelative(79.48f, 79.48f, 0.0f, false, false, -54.72f, -22.09f);
        pathBuilder.horizontalLineToRelative(-0.45f);
        pathBuilder.arcTo(79.52f, 79.52f, 0.0f, false, false, 69.59f, 72.71f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 58.41f, 61.27f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 192.0f, 60.7f);
        pathBuilder.lineToRelative(18.36f, -18.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.41f, 183.29f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 75.35f, 184.0f);
        pathBuilder.lineToRelative(18.31f, -18.31f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 152.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f);
        pathBuilder.lineTo(64.0f, 195.3f);
        pathBuilder.arcToRelative(95.42f, 95.42f, 0.0f, false, false, 66.0f, 26.76f);
        pathBuilder.horizontalLineToRelative(0.53f);
        pathBuilder.arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, -27.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.18f, -11.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
