package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Arrowsclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getArrowsClockwise", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowsclockwiseKt {
    private static ImageVector _arrowsClockwise;

    public static final ImageVector getArrowsClockwise(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, true, true, -88.0f, -88.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 48.0f);
        pathBuilder2.verticalLineTo(96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineTo(168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(28.69f);
        pathBuilder2.lineTo(182.06f, 73.37f);
        pathBuilder2.arcToRelative(79.56f, 79.56f, 0.0f, false, false, -56.13f, -23.43f);
        pathBuilder2.horizontalLineToRelative(-0.45f);
        pathBuilder2.arcTo(79.52f, 79.52f, 0.0f, false, false, 69.59f, 72.71f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 58.41f, 61.27f);
        pathBuilder2.arcToRelative(96.0f, 96.0f, 0.0f, false, true, 135.0f, 0.79f);
        pathBuilder2.lineTo(208.0f, 76.69f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(186.41f, 183.29f);
        pathBuilder2.arcToRelative(80.0f, 80.0f, 0.0f, false, true, -112.47f, -0.66f);
        pathBuilder2.lineTo(59.31f, 168.0f);
        pathBuilder2.horizontalLineTo(88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(179.31f);
        pathBuilder2.lineToRelative(14.63f, 14.63f);
        pathBuilder2.arcTo(95.43f, 95.43f, 0.0f, false, false, 130.0f, 222.06f);
        pathBuilder2.horizontalLineToRelative(0.53f);
        pathBuilder2.arcToRelative(95.36f, 95.36f, 0.0f, false, false, 67.07f, -27.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.18f, -11.44f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
