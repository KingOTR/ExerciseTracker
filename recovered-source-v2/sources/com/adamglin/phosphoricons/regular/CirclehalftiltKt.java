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

/* compiled from: Circlehalftilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleHalfTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCircleHalfTilt", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleHalfTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclehalftiltKt {
    private static ImageVector _circleHalfTilt;

    public static final ImageVector getCircleHalfTilt(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _circleHalfTilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CircleHalfTilt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(201.54f, 54.46f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 195.87f);
        pathBuilder.arcToRelative(87.16f, 87.16f, 0.0f, false, true, -16.0f, 10.5f);
        pathBuilder.lineTo(168.0f, 99.31f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 163.31f);
        pathBuilder.lineTo(120.0f, 147.31f);
        pathBuilder.verticalLineToRelative(68.28f);
        pathBuilder.arcToRelative(88.37f, 88.37f, 0.0f, false, true, -16.0f, -3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 206.37f);
        pathBuilder.arcToRelative(87.0f, 87.0f, 0.0f, false, true, -16.3f, -10.76f);
        pathBuilder.lineTo(88.0f, 179.31f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 131.31f);
        pathBuilder.lineTo(152.0f, 115.31f);
        pathBuilder.verticalLineToRelative(97.32f);
        pathBuilder.arcToRelative(88.37f, 88.37f, 0.0f, false, true, -16.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 184.3f, 60.39f);
        pathBuilder.lineTo(60.38f, 184.31f);
        pathBuilder.arcTo(87.34f, 87.34f, 0.0f, false, true, 40.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 178.59f);
        pathBuilder.lineTo(200.0f, 77.41f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 0.0f, 101.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleHalfTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
