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

/* compiled from: Arrowsclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowsClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getArrowsClockwise", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowsClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowsclockwiseKt {
    private static ImageVector _arrowsClockwise;

    public static final ImageVector getArrowsClockwise(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(228.0f, 48.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(19.0f);
        pathBuilder.lineToRelative(-7.8f, -7.8f);
        pathBuilder.arcToRelative(75.55f, 75.55f, 0.0f, false, false, -53.32f, -22.26f);
        pathBuilder.horizontalLineToRelative(-0.43f);
        pathBuilder.arcTo(75.49f, 75.49f, 0.0f, false, false, 72.39f, 75.57f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 55.61f, 58.41f);
        pathBuilder.arcToRelative(99.38f, 99.38f, 0.0f, false, true, 69.87f, -28.47f);
        pathBuilder.horizontalLineTo(126.0f);
        pathBuilder.arcTo(99.42f, 99.42f, 0.0f, false, true, 196.2f, 59.23f);
        pathBuilder.lineTo(204.0f, 67.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.61f, 180.43f);
        pathBuilder.arcToRelative(75.49f, 75.49f, 0.0f, false, true, -53.09f, 21.63f);
        pathBuilder.horizontalLineToRelative(-0.43f);
        pathBuilder.arcTo(75.55f, 75.55f, 0.0f, false, true, 76.77f, 179.8f);
        pathBuilder.lineTo(69.0f, 172.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(189.0f);
        pathBuilder.lineToRelative(7.8f, 7.8f);
        pathBuilder.arcTo(99.42f, 99.42f, 0.0f, false, false, 130.0f, 226.06f);
        pathBuilder.horizontalLineToRelative(0.56f);
        pathBuilder.arcToRelative(99.38f, 99.38f, 0.0f, false, false, 69.87f, -28.47f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.78f, -17.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowsClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
