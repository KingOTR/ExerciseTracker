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

/* compiled from: Paintbrush.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrush", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPaintBrush", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrush", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushKt {
    private static ImageVector _paintBrush;

    public static final ImageVector getPaintBrush(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _paintBrush;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBrush", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.curveToRelative(-44.08f, 0.0f, -89.31f, 49.71f, -114.43f, 82.63f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 32.0f, 164.0f);
        pathBuilder.curveToRelative(0.0f, 30.88f, -19.54f, 44.73f, -20.47f, 45.37f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 16.0f, 224.0f);
        pathBuilder.lineTo(92.0f, 224.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 57.37f, -77.57f);
        pathBuilder.curveTo(182.3f, 121.31f, 232.0f, 76.08f, 232.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 208.0f);
        pathBuilder.lineTo(34.63f, 208.0f);
        pathBuilder.curveTo(41.38f, 198.41f, 48.0f, 183.92f, 48.0f, 164.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.42f, 113.55f);
        pathBuilder.quadToRelative(5.14f, -6.66f, 10.09f, -12.55f);
        pathBuilder.arcTo(76.23f, 76.23f, 0.0f, false, true, 155.0f, 121.49f);
        pathBuilder.quadToRelative(-5.9f, 4.94f, -12.55f, 10.09f);
        pathBuilder.arcTo(60.54f, 60.54f, 0.0f, false, false, 124.42f, 113.55f);
        pathBuilder.close();
        pathBuilder.moveTo(167.12f, 110.87f);
        pathBuilder.arcToRelative(92.57f, 92.57f, 0.0f, false, false, -22.0f, -22.0f);
        pathBuilder.curveToRelative(31.78f, -34.53f, 55.75f, -45.0f, 69.9f, -47.91f);
        pathBuilder.curveTo(212.17f, 55.12f, 201.65f, 79.09f, 167.12f, 110.87f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrush = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
