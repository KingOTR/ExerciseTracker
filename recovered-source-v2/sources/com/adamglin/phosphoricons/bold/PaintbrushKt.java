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

/* compiled from: Paintbrush.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBrush", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPaintBrush", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBrush", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbrushKt {
    private static ImageVector _paintBrush;

    public static final ImageVector getPaintBrush(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.curveToRelative(-44.78f, 0.0f, -90.0f, 48.54f, -115.9f, 82.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, -80.0f, 62.0f);
        pathBuilder.curveToRelative(0.0f, 12.0f, -3.1f, 22.71f, -9.23f, 31.76f);
        pathBuilder.arcTo(43.0f, 43.0f, 0.0f, false, true, 9.4f, 206.05f);
        pathBuilder.arcToRelative(11.88f, 11.88f, 0.0f, false, false, -4.91f, 13.38f);
        pathBuilder.arcTo(12.07f, 12.07f, 0.0f, false, false, 16.11f, 228.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 154.0f, 148.0f);
        pathBuilder.curveTo(187.49f, 122.05f, 236.0f, 76.8f, 236.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.62f, 46.39f);
        pathBuilder.curveToRelative(-4.0f, 12.92f, -13.15f, 27.49f, -26.92f, 42.91f);
        pathBuilder.curveToRelative(-3.0f, 3.39f, -6.16f, 6.7f, -9.35f, 9.89f);
        pathBuilder.arcToRelative(104.31f, 104.31f, 0.0f, false, false, -16.5f, -16.51f);
        pathBuilder.curveToRelative(3.19f, -3.19f, 6.49f, -6.32f, 9.88f, -9.35f);
        pathBuilder.curveTo(182.15f, 59.55f, 196.71f, 50.43f, 209.62f, 46.39f);
        pathBuilder.close();
        pathBuilder.moveTo(92.07f, 204.0f);
        pathBuilder.lineTo(42.0f, 204.0f);
        pathBuilder.arcToRelative(80.17f, 80.17f, 0.0f, false, false, 10.14f, -40.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(130.25f, 112.68f);
        pathBuilder.curveToRelative(3.12f, -3.93f, 6.55f, -8.09f, 10.23f, -12.35f);
        pathBuilder.arcToRelative(80.52f, 80.52f, 0.0f, false, true, 15.23f, 15.24f);
        pathBuilder.curveToRelative(-4.26f, 3.68f, -8.42f, 7.11f, -12.35f, 10.23f);
        pathBuilder.arcTo(64.43f, 64.43f, 0.0f, false, false, 130.25f, 112.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBrush = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
