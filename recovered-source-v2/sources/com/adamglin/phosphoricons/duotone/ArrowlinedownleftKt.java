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

/* compiled from: Arrowlinedownleft.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ArrowLineDownLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getArrowLineDownLeft", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_arrowLineDownLeft", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrowlinedownleftKt {
    private static ImageVector _arrowLineDownLeft;

    public static final ImageVector getArrowLineDownLeft(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _arrowLineDownLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ArrowLineDownLeft", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 208.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(224.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(189.66f, 90.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineTo(131.31f, 160.0f);
        pathBuilder2.lineToRelative(42.35f, 42.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 216.0f);
        pathBuilder2.horizontalLineTo(72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.verticalLineTo(112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f);
        pathBuilder2.lineTo(120.0f, 148.69f);
        pathBuilder2.lineToRelative(58.34f, -58.35f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 189.66f, 90.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(148.69f, 200.0f);
        pathBuilder2.lineToRelative(-34.34f, -34.34f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineTo(80.0f, 131.31f);
        pathBuilder2.verticalLineTo(200.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _arrowLineDownLeft = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
