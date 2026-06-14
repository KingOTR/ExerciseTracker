package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Arrowsclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getArrowsClockwise", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowsclockwiseKt {
    private static ImageVector _arrowsClockwise;

    public static final ImageVector getArrowsClockwise(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(222.0f, 48.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(33.52f);
        pathBuilder.lineTo(183.47f, 72.0f);
        pathBuilder.arcToRelative(81.51f, 81.51f, 0.0f, false, false, -57.53f, -24.0f);
        pathBuilder.horizontalLineToRelative(-0.46f);
        pathBuilder.arcTo(81.5f, 81.5f, 0.0f, false, false, 68.19f, 71.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.38f, -8.58f);
        pathBuilder.arcToRelative(93.38f, 93.38f, 0.0f, false, true, 65.67f, -26.76f);
        pathBuilder.horizontalLineTo(126.0f);
        pathBuilder.arcToRelative(93.45f, 93.45f, 0.0f, false, true, 66.0f, 27.53f);
        pathBuilder.lineToRelative(18.0f, 18.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.81f, 184.72f);
        pathBuilder.arcToRelative(81.5f, 81.5f, 0.0f, false, true, -57.29f, 23.34f);
        pathBuilder.horizontalLineToRelative(-0.46f);
        pathBuilder.arcToRelative(81.51f, 81.51f, 0.0f, false, true, -57.53f, -24.0f);
        pathBuilder.lineTo(54.48f, 166.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(174.48f);
        pathBuilder.lineToRelative(18.0f, 18.05f);
        pathBuilder.arcToRelative(93.45f, 93.45f, 0.0f, false, false, 66.0f, 27.53f);
        pathBuilder.horizontalLineToRelative(0.52f);
        pathBuilder.arcToRelative(93.38f, 93.38f, 0.0f, false, false, 65.67f, -26.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.38f, -8.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
