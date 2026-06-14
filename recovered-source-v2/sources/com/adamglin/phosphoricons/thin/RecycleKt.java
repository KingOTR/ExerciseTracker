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

/* compiled from: Recycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Recycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getRecycle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_recycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecycleKt {
    private static ImageVector _recycle;

    public static final ImageVector getRecycle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _recycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Recycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(40.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -17.31f, -30.0f);
        pathBuilder.lineToRelative(39.14f, -67.62f);
        pathBuilder.lineToRelative(-23.43f, 6.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.07f, -7.72f);
        pathBuilder.lineToRelative(32.77f, -8.77f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 74.0f, 107.0f);
        pathBuilder.lineToRelative(8.79f, 32.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 4.9f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, -1.0f, 0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, -3.0f);
        pathBuilder.lineToRelative(-6.3f, -23.47f);
        pathBuilder.lineTo(29.65f, 186.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 204.0f);
        pathBuilder.lineTo(88.0f, 204.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 92.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.28f, 182.0f);
        pathBuilder.lineTo(210.14f, 142.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.93f, 4.0f);
        pathBuilder.lineToRelative(23.14f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 204.0f);
        pathBuilder.lineTo(137.66f, 204.0f);
        pathBuilder.lineToRelative(17.17f, -17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.lineTo(137.66f, 212.0f);
        pathBuilder.lineTo(216.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 17.31f, -30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.38f, 34.0f);
        pathBuilder.lineToRelative(39.14f, 67.62f);
        pathBuilder.lineToRelative(-23.43f, -6.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.07f, 7.73f);
        pathBuilder.lineToRelative(32.78f, 8.78f);
        pathBuilder.arcToRelative(3.65f, 3.65f, 0.0f, false, false, 1.0f, 0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.86f, -3.0f);
        pathBuilder.lineToRelative(8.79f, -32.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -7.72f, -2.07f);
        pathBuilder.lineToRelative(-6.3f, 23.47f);
        pathBuilder.lineTo(145.31f, 30.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -34.62f, 0.0f);
        pathBuilder.lineTo(87.53f, 70.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.93f, 4.0f);
        pathBuilder.lineToRelative(23.15f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.77f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _recycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
