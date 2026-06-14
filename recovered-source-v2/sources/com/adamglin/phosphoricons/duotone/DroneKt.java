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

/* compiled from: Drone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDrone", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DroneKt {
    private static ImageVector _drone;

    public static final ImageVector getDrone(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(112.0f, 76.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, true, 76.0f, 40.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 112.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 112.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 180.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 144.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 76.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 144.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 180.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(189.66f, 66.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder2.lineTo(148.69f, 96.0f);
        pathBuilder2.lineTo(107.31f, 96.0f);
        pathBuilder2.lineTo(77.66f, 66.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 66.34f, 77.66f);
        pathBuilder2.lineTo(96.0f, 107.31f);
        pathBuilder2.verticalLineToRelative(41.38f);
        pathBuilder2.lineTo(66.34f, 178.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder2.lineTo(107.31f, 160.0f);
        pathBuilder2.horizontalLineToRelative(41.38f);
        pathBuilder2.lineToRelative(29.65f, 29.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder2.lineTo(160.0f, 148.69f);
        pathBuilder2.lineTo(160.0f, 107.31f);
        pathBuilder2.lineToRelative(29.66f, -29.65f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 189.66f, 66.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 112.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.lineTo(112.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(138.51f, 61.33f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 56.16f, 56.16f);
        pathBuilder2.arcTo(7.86f, 7.86f, 0.0f, false, true, 192.0f, 118.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.67f, -15.54f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -35.74f, -35.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.08f, -5.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 180.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -85.49f, 14.67f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.08f, -5.34f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 35.74f, -35.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.34f, -15.08f);
        pathBuilder2.arcTo(44.07f, 44.07f, 0.0f, false, true, 224.0f, 180.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(117.49f, 194.67f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, true, true, -56.16f, -56.16f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.34f, 15.08f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 35.74f, 35.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.08f, 5.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 76.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 85.49f, -14.67f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -15.08f, 5.34f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -35.74f, 35.74f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 118.0f);
        pathBuilder2.arcToRelative(7.86f, 7.86f, 0.0f, false, true, -2.67f, -0.46f);
        pathBuilder2.arcTo(44.07f, 44.07f, 0.0f, false, true, 32.0f, 76.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
