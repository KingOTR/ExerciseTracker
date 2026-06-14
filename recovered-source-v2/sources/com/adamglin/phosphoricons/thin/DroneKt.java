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

/* compiled from: Drone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDrone", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DroneKt {
    private static ImageVector _drone;

    public static final ImageVector getDrone(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(186.83f, 74.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(150.34f, 100.0f);
        pathBuilder.lineTo(105.66f, 100.0f);
        pathBuilder.lineTo(74.83f, 69.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineTo(100.0f, 105.66f);
        pathBuilder.verticalLineToRelative(44.68f);
        pathBuilder.lineTo(69.17f, 181.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineTo(105.66f, 156.0f);
        pathBuilder.horizontalLineToRelative(44.68f);
        pathBuilder.lineToRelative(30.83f, 30.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.lineTo(156.0f, 150.34f);
        pathBuilder.lineTo(156.0f, 105.66f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.lineTo(108.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(142.28f, 62.67f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 51.05f, 51.05f);
        pathBuilder.arcTo(3.88f, 3.88f, 0.0f, false, true, 192.0f, 114.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.33f, -7.77f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -40.85f, -40.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.54f, -2.66f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 180.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -77.72f, 13.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.54f, -2.66f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 40.85f, -40.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.66f, -7.54f);
        pathBuilder.arcTo(40.06f, 40.06f, 0.0f, false, true, 220.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(113.72f, 193.33f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -51.0f, -51.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.66f, 7.54f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 40.85f, 40.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.54f, 2.66f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 76.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 77.72f, -13.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.54f, 2.66f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -40.85f, 40.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 64.0f, 114.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.33f, -0.23f);
        pathBuilder.arcTo(40.06f, 40.06f, 0.0f, false, true, 36.0f, 76.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
