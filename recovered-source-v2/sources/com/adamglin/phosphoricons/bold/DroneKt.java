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

/* compiled from: Drone.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Drone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDrone", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_drone", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DroneKt {
    private static ImageVector _drone;

    public static final ImageVector getDrone(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(42.06f, 109.94f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 67.88f, -67.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 93.0f, 59.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 59.0f, 93.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.0f, 59.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 197.0f, 93.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -67.88f, -67.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.94f, 146.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 163.0f, 197.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 67.88f, -67.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 197.0f, 146.06f);
        pathBuilder.close();
        pathBuilder.moveTo(93.0f, 197.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, true, 59.0f, 163.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 67.88f, 67.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 109.0f);
        pathBuilder.lineTo(164.0f, 147.0f);
        pathBuilder.lineToRelative(24.49f, 24.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(147.0f, 164.0f);
        pathBuilder.lineTo(109.0f, 164.0f);
        pathBuilder.lineTo(84.49f, 188.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(92.0f, 147.0f);
        pathBuilder.lineTo(92.0f, 109.0f);
        pathBuilder.lineTo(67.51f, 84.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(109.0f, 92.0f);
        pathBuilder.lineTo(147.0f, 92.0f);
        pathBuilder.lineToRelative(24.48f, -24.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.lineTo(140.0f, 116.0f);
        pathBuilder.lineTo(116.0f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _drone = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
