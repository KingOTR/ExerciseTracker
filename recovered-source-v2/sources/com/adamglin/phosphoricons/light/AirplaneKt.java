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

/* compiled from: Airplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Airplane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAirplane", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplaneKt {
    private static ImageVector _airplane;

    public static final ImageVector getAirplane(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(234.68f, 130.63f);
        pathBuilder.lineTo(158.0f, 92.29f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f);
        pathBuilder.verticalLineTo(92.29f);
        pathBuilder.lineTo(21.32f, 130.63f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 18.0f, 136.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.18f, 5.88f);
        pathBuilder.lineTo(98.0f, 159.32f);
        pathBuilder.verticalLineToRelative(22.19f);
        pathBuilder.lineTo(83.76f, 195.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 82.0f, 200.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.23f, 5.57f);
        pathBuilder.lineTo(128.0f, 222.46f);
        pathBuilder.lineToRelative(37.77f, 15.11f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 174.0f, 232.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.76f, -4.24f);
        pathBuilder.lineTo(158.0f, 181.51f);
        pathBuilder.verticalLineTo(159.32f);
        pathBuilder.lineToRelative(72.82f, 14.56f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 238.0f, 168.0f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 234.68f, 130.63f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 160.68f);
        pathBuilder.lineToRelative(-72.82f, -14.56f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 152.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.76f, 4.24f);
        pathBuilder.lineTo(162.0f, 202.49f);
        pathBuilder.verticalLineToRelative(20.65f);
        pathBuilder.lineToRelative(-31.77f, -12.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.46f, 0.0f);
        pathBuilder.lineTo(94.0f, 223.14f);
        pathBuilder.verticalLineTo(202.49f);
        pathBuilder.lineToRelative(14.24f, -14.25f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 110.0f, 184.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.18f, -5.88f);
        pathBuilder.lineTo(30.0f, 160.68f);
        pathBuilder.verticalLineToRelative(-21.0f);
        pathBuilder.lineToRelative(76.68f, -38.34f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 110.0f, 96.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.32f, 5.37f);
        pathBuilder.lineTo(226.0f, 139.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
