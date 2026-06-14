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

/* compiled from: Grainsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GrainsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGrainsSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grainsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsslashKt {
    private static ImageVector _grainsSlash;

    public static final ImageVector getGrainsSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _grainsSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GrainsSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineToRelative(4.37f, 4.81f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 153.0f, 68.9f);
        pathBuilder.lineToRelative(10.16f, 11.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(60.19f, 149.09f);
        pathBuilder.arcToRelative(68.16f, 68.16f, 0.0f, false, true, 55.62f, 61.82f);
        pathBuilder.arcTo(68.16f, 68.16f, 0.0f, false, true, 60.19f, 149.09f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 170.61f);
        pathBuilder.arcToRelative(92.22f, 92.22f, 0.0f, false, false, -68.0f, -45.83f);
        pathBuilder.lineTo(60.0f, 77.05f);
        pathBuilder.arcToRelative(68.53f, 68.53f, 0.0f, false, true, 6.94f, 1.63f);
        pathBuilder.lineToRelative(70.83f, 77.9f);
        pathBuilder.arcTo(92.45f, 92.45f, 0.0f, false, false, 128.0f, 170.61f);
        pathBuilder.close();
        pathBuilder.moveTo(140.19f, 210.9f);
        pathBuilder.arcToRelative(68.26f, 68.26f, 0.0f, false, true, 13.92f, -36.34f);
        pathBuilder.lineToRelative(18.7f, 20.57f);
        pathBuilder.arcTo(67.74f, 67.74f, 0.0f, false, true, 140.19f, 210.9f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(92.8f, 92.8f, 0.0f, false, true, -1.0f, 13.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.86f, 10.28f);
        pathBuilder.arcToRelative(12.74f, 12.74f, 0.0f, false, true, -1.74f, -0.13f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.15f, -13.6f);
        pathBuilder.curveToRelative(0.23f, -1.59f, 0.4f, -3.19f, 0.52f, -4.8f);
        pathBuilder.curveToRelative(-0.76f, 0.14f, -1.53f, 0.29f, -2.29f, 0.45f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -5.08f, -23.45f);
        pathBuilder.curveToRelative(2.49f, -0.54f, 5.0f, -1.0f, 7.56f, -1.31f);
        pathBuilder.lineTo(195.96f, 77.07f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -38.79f, 21.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.92f, -16.0f);
        pathBuilder.arcTo(91.73f, 91.73f, 0.0f, false, true, 156.62f, 67.7f);
        pathBuilder.curveToRelative(-8.2f, -14.93f, -21.31f, -25.0f, -28.63f, -29.76f);
        pathBuilder.arcToRelative(97.84f, 97.84f, 0.0f, false, false, -15.56f, 12.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -16.95f);
        pathBuilder.arcToRelative(116.0f, 116.0f, 0.0f, false, true, 27.19f, -20.32f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f);
        pathBuilder.curveToRelative(1.33f, 0.66f, 29.36f, 15.0f, 44.74f, 43.74f);
        pathBuilder.arcTo(91.83f, 91.83f, 0.0f, false, true, 208.0f, 52.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grainsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
