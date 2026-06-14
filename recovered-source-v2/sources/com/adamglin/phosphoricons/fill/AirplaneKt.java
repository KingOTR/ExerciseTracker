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

/* compiled from: Airplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Airplane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAirplane", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplaneKt {
    private static ImageVector _airplane;

    public static final ImageVector getAirplane(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _airplane;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Airplane", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 136.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.arcToRelative(7.61f, 7.61f, 0.0f, false, true, -1.57f, -0.16f);
        pathBuilder.lineTo(156.0f, 161.0f);
        pathBuilder.verticalLineToRelative(23.73f);
        pathBuilder.lineToRelative(17.66f, 17.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 208.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.0f, 7.43f);
        pathBuilder.lineToRelative(-37.0f, -14.81f);
        pathBuilder.lineTo(91.0f, 239.43f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 232.0f);
        pathBuilder.verticalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.34f, -5.66f);
        pathBuilder.lineTo(100.0f, 184.69f);
        pathBuilder.verticalLineTo(161.0f);
        pathBuilder.lineTo(25.57f, 175.84f);
        pathBuilder.arcTo(7.61f, 7.61f, 0.0f, false, true, 24.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.42f, -7.16f);
        pathBuilder.lineTo(100.0f, 89.06f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.verticalLineTo(89.06f);
        pathBuilder.lineToRelative(79.58f, 39.78f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
