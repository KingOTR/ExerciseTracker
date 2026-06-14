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

/* compiled from: Guitar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Guitar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGuitar", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_guitar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GuitarKt {
    private static ImageVector _guitar;

    public static final ImageVector getGuitar(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _guitar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Guitar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(249.66f, 46.34f);
        pathBuilder.lineToRelative(-40.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder.lineTo(200.69f, 20.0f);
        pathBuilder.lineTo(140.52f, 80.16f);
        pathBuilder.curveTo(117.73f, 68.3f, 92.21f, 69.29f, 76.75f, 84.74f);
        pathBuilder.arcToRelative(42.27f, 42.27f, 0.0f, false, false, -9.39f, 14.37f);
        pathBuilder.arcTo(8.24f, 8.24f, 0.0f, false, true, 59.81f, 104.0f);
        pathBuilder.curveToRelative(-14.59f, 0.49f, -27.26f, 5.72f, -36.65f, 15.11f);
        pathBuilder.curveTo(11.08f, 131.22f, 6.0f, 148.6f, 8.74f, 168.07f);
        pathBuilder.curveTo(11.4f, 186.7f, 21.07f, 205.15f, 36.0f, 220.0f);
        pathBuilder.reflectiveCurveToRelative(33.34f, 24.56f, 52.0f, 27.22f);
        pathBuilder.arcTo(71.13f, 71.13f, 0.0f, false, false, 98.1f, 248.0f);
        pathBuilder.curveToRelative(15.32f, 0.0f, 28.83f, -5.23f, 38.76f, -15.16f);
        pathBuilder.curveToRelative(9.39f, -9.39f, 14.62f, -22.06f, 15.11f, -36.65f);
        pathBuilder.arcToRelative(8.24f, 8.24f, 0.0f, false, true, 4.92f, -7.55f);
        pathBuilder.arcToRelative(42.22f, 42.22f, 0.0f, false, false, 14.37f, -9.39f);
        pathBuilder.curveToRelative(15.45f, -15.46f, 16.44f, -41.0f, 4.58f, -63.77f);
        pathBuilder.lineTo(236.0f, 55.31f);
        pathBuilder.lineToRelative(2.34f, 2.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder.close();
        pathBuilder.moveTo(93.66f, 205.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.31f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 93.66f, 205.65f);
        pathBuilder.close();
        pathBuilder.moveTo(135.8f, 159.79f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 0.0f, -39.59f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 135.8f, 159.79f);
        pathBuilder.close();
        pathBuilder.moveTo(166.86f, 101.79f);
        pathBuilder.arcToRelative(86.94f, 86.94f, 0.0f, false, false, -6.0f, -6.68f);
        pathBuilder.arcToRelative(85.23f, 85.23f, 0.0f, false, false, -6.69f, -6.0f);
        pathBuilder.lineTo(176.0f, 67.31f);
        pathBuilder.lineTo(188.69f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 68.68f);
        pathBuilder.lineTo(187.32f, 56.0f);
        pathBuilder.lineTo(212.0f, 31.31f);
        pathBuilder.lineTo(224.69f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _guitar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
