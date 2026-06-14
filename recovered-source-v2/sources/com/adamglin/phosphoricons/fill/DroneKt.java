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

/* compiled from: Drone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDrone", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DroneKt {
    private static ImageVector _drone;

    public static final ImageVector getDrone(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _drone;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Drone", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(189.66f, 77.66f);
        pathBuilder.lineTo(160.0f, 107.31f);
        pathBuilder.verticalLineToRelative(41.38f);
        pathBuilder.lineToRelative(29.66f, 29.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(148.69f, 160.0f);
        pathBuilder.lineTo(107.31f, 160.0f);
        pathBuilder.lineTo(77.66f, 189.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineTo(96.0f, 148.69f);
        pathBuilder.lineTo(96.0f, 107.31f);
        pathBuilder.lineTo(66.34f, 77.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 77.66f, 66.34f);
        pathBuilder.lineTo(107.31f, 96.0f);
        pathBuilder.horizontalLineToRelative(41.38f);
        pathBuilder.lineToRelative(29.65f, -29.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(143.38f, 71.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.21f, -4.87f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 35.74f, 35.74f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 118.0f);
        pathBuilder.arcToRelative(7.86f, 7.86f, 0.0f, false, false, 2.67f, -0.46f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -56.16f, -56.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 143.38f, 71.54f);
        pathBuilder.close();
        pathBuilder.moveTo(194.67f, 138.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.34f, 15.08f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -35.74f, 35.74f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.08f, 5.34f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 56.16f, -56.16f);
        pathBuilder.close();
        pathBuilder.moveTo(112.67f, 184.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.21f, 4.87f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -35.74f, -35.74f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.34f, -15.08f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 56.16f, 56.16f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.62f, 184.46f);
        pathBuilder.close();
        pathBuilder.moveTo(61.38f, 117.54f);
        pathBuilder.arcTo(7.86f, 7.86f, 0.0f, false, false, 64.0f, 118.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.67f, -15.54f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 35.74f, -35.74f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 15.08f, -5.34f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -56.16f, 56.16f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
