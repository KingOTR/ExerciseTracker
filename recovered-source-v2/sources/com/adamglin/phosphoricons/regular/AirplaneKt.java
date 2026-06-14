package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Airplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Airplane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAirplane", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplaneKt {
    private static ImageVector _airplane;

    public static final ImageVector getAirplane(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(235.58f, 128.84f);
        pathBuilder.lineTo(160.0f, 91.06f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f);
        pathBuilder.verticalLineTo(91.06f);
        pathBuilder.lineTo(20.42f, 128.84f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 136.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.57f, 7.84f);
        pathBuilder.lineTo(96.0f, 161.76f);
        pathBuilder.verticalLineToRelative(18.93f);
        pathBuilder.lineTo(82.34f, 194.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 200.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 7.43f);
        pathBuilder.lineToRelative(37.0f, -14.81f);
        pathBuilder.lineToRelative(37.0f, 14.81f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 232.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder.lineTo(160.0f, 180.69f);
        pathBuilder.verticalLineTo(161.76f);
        pathBuilder.lineToRelative(70.43f, 14.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 168.0f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 235.58f, 128.84f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 158.24f);
        pathBuilder.lineToRelative(-70.43f, -14.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 152.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.34f, 5.66f);
        pathBuilder.lineTo(160.0f, 203.31f);
        pathBuilder.verticalLineToRelative(16.87f);
        pathBuilder.lineToRelative(-29.0f, -11.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, 0.0f);
        pathBuilder.lineTo(96.0f, 220.18f);
        pathBuilder.verticalLineTo(203.31f);
        pathBuilder.lineToRelative(13.66f, -13.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 184.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.57f, -7.84f);
        pathBuilder.lineTo(32.0f, 158.24f);
        pathBuilder.verticalLineToRelative(-17.3f);
        pathBuilder.lineToRelative(75.58f, -37.78f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 96.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.42f, 7.16f);
        pathBuilder.lineTo(224.0f, 140.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
