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

/* compiled from: Wheelchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wheelchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWheelchair", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairKt {
    private static ImageVector _wheelchair;

    public static final ImageVector getWheelchair(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _wheelchair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wheelchair", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.79f, 190.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.06f, -2.52f);
        pathBuilder.lineToRelative(-20.7f, 6.9f);
        pathBuilder.lineToRelative(-30.45f, -60.9f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 132.0f);
        pathBuilder.horizontalLineTo(108.0f);
        pathBuilder.verticalLineTo(100.15f);
        pathBuilder.curveToRelative(1.32f, -0.09f, 2.65f, -0.15f, 4.0f, -0.15f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.curveToRelative(-1.34f, 0.0f, -2.68f, 0.0f, -4.0f, 0.13f);
        pathBuilder.verticalLineTo(75.71f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f);
        pathBuilder.verticalLineTo(93.08f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 112.0f, 228.0f);
        pathBuilder.curveToRelative(31.72f, 0.0f, 60.27f, -21.45f, 67.87f, -51.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.74f, -2.0f);
        pathBuilder.curveToRelative(-6.71f, 26.08f, -32.0f, 45.0f, -60.13f, 45.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -12.0f, -118.79f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(85.53f);
        pathBuilder.lineToRelative(30.89f, 61.79f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 204.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.26f, -0.21f);
        pathBuilder.lineToRelative(24.0f, -8.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 251.79f, 190.73f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 48.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 84.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
