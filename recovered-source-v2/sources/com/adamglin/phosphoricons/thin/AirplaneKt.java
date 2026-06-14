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

/* compiled from: Airplane.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Airplane", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAirplane", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airplane", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirplaneKt {
    private static ImageVector _airplane;

    public static final ImageVector getAirplane(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(233.79f, 132.42f);
        pathBuilder.lineTo(156.0f, 93.53f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -56.0f, 0.0f);
        pathBuilder.verticalLineTo(93.53f);
        pathBuilder.lineTo(22.21f, 132.42f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 136.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.78f, 3.92f);
        pathBuilder.lineToRelative(75.22f, -15.0f);
        pathBuilder.verticalLineToRelative(25.46f);
        pathBuilder.lineTo(85.17f, 197.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 200.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.49f, 3.71f);
        pathBuilder.lineTo(128.0f, 220.31f);
        pathBuilder.lineToRelative(38.51f, 15.4f);
        pathBuilder.arcTo(3.87f, 3.87f, 0.0f, false, false, 168.0f, 236.0f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, 2.24f, -0.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 232.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.17f, -2.83f);
        pathBuilder.lineTo(156.0f, 182.34f);
        pathBuilder.verticalLineTo(156.88f);
        pathBuilder.lineToRelative(75.22f, 15.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 236.0f, 168.0f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 233.79f, 132.42f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 163.12f);
        pathBuilder.lineToRelative(-75.22f, -15.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 148.0f, 152.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.17f, 2.83f);
        pathBuilder.lineTo(164.0f, 201.66f);
        pathBuilder.verticalLineToRelative(24.43f);
        pathBuilder.lineToRelative(-34.51f, -13.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 0.0f);
        pathBuilder.lineTo(92.0f, 226.09f);
        pathBuilder.verticalLineTo(201.66f);
        pathBuilder.lineToRelative(14.83f, -14.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 184.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.78f, -3.92f);
        pathBuilder.lineTo(28.0f, 163.12f);
        pathBuilder.verticalLineTo(138.47f);
        pathBuilder.lineToRelative(77.79f, -38.89f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 96.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f);
        pathBuilder.lineTo(228.0f, 138.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airplane = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
