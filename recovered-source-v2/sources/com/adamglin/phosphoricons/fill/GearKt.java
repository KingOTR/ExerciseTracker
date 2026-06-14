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

/* compiled from: Gear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Gear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGear", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GearKt {
    private static ImageVector _gear;

    public static final ImageVector getGear(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _gear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Gear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 130.16f);
        pathBuilder.quadToRelative(0.06f, -2.16f, 0.0f, -4.32f);
        pathBuilder.lineToRelative(14.92f, -18.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.48f, -7.06f);
        pathBuilder.arcToRelative(107.6f, 107.6f, 0.0f, false, false, -10.88f, -26.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, -3.93f);
        pathBuilder.lineToRelative(-23.72f, -2.64f);
        pathBuilder.quadToRelative(-1.48f, -1.56f, -3.0f, -3.0f);
        pathBuilder.lineTo(186.0f, 40.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.94f, -6.0f);
        pathBuilder.arcToRelative(107.29f, 107.29f, 0.0f, false, false, -26.25f, -10.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.06f, 1.48f);
        pathBuilder.lineTo(130.16f, 40.0f);
        pathBuilder.quadTo(128.0f, 40.0f, 125.84f, 40.0f);
        pathBuilder.lineTo(107.2f, 25.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.06f, -1.48f);
        pathBuilder.arcTo(107.6f, 107.6f, 0.0f, false, false, 73.89f, 34.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.93f, 6.0f);
        pathBuilder.lineTo(67.32f, 64.27f);
        pathBuilder.quadToRelative(-1.56f, 1.49f, -3.0f, 3.0f);
        pathBuilder.lineTo(40.54f, 70.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 3.94f);
        pathBuilder.arcToRelative(107.71f, 107.71f, 0.0f, false, false, -10.87f, 26.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.49f, 7.06f);
        pathBuilder.lineTo(40.0f, 125.84f);
        pathBuilder.quadTo(40.0f, 128.0f, 40.0f, 130.16f);
        pathBuilder.lineTo(25.11f, 148.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.48f, 7.06f);
        pathBuilder.arcToRelative(107.6f, 107.6f, 0.0f, false, false, 10.88f, 26.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 3.93f);
        pathBuilder.lineToRelative(23.72f, 2.64f);
        pathBuilder.quadToRelative(1.49f, 1.56f, 3.0f, 3.0f);
        pathBuilder.lineTo(70.0f, 215.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.94f, 6.0f);
        pathBuilder.arcToRelative(107.71f, 107.71f, 0.0f, false, false, 26.25f, 10.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.06f, -1.49f);
        pathBuilder.lineTo(125.84f, 216.0f);
        pathBuilder.quadToRelative(2.16f, 0.06f, 4.32f, 0.0f);
        pathBuilder.lineToRelative(18.64f, 14.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.06f, 1.48f);
        pathBuilder.arcToRelative(107.21f, 107.21f, 0.0f, false, false, 26.25f, -10.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.93f, -6.0f);
        pathBuilder.lineToRelative(2.64f, -23.72f);
        pathBuilder.quadToRelative(1.56f, -1.48f, 3.0f, -3.0f);
        pathBuilder.lineTo(215.46f, 186.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -3.94f);
        pathBuilder.arcToRelative(107.71f, 107.71f, 0.0f, false, false, 10.87f, -26.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.49f, -7.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
