package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Gascan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GasCan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGasCan", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gasCan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GascanKt {
    private static ImageVector _gasCan;

    public static final ImageVector getGasCan(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gasCan;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GasCan", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 26.0f);
        pathBuilder.lineTo(123.31f, 26.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, 4.1f);
        pathBuilder.lineTo(101.66f, 41.86f);
        pathBuilder.lineTo(89.9f, 30.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f);
        pathBuilder.lineTo(57.86f, 85.66f);
        pathBuilder.lineTo(46.1f, 97.41f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, -4.1f, 9.9f);
        pathBuilder.lineTo(42.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(200.0f, 230.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(214.0f, 40.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.59f, 65.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.82f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f);
        pathBuilder.lineTo(93.17f, 50.34f);
        pathBuilder.lineTo(66.34f, 77.17f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 216.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(56.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(54.0f, 107.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.59f, -1.41f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(105.9f, 54.59f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.59f);
        pathBuilder.lineTo(200.0f, 38.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(136.0f, 70.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 182.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.6f, 124.8f);
        pathBuilder.lineTo(138.0f, 156.0f);
        pathBuilder.lineToRelative(41.6f, 31.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.2f, 9.6f);
        pathBuilder.lineTo(128.0f, 163.5f);
        pathBuilder.lineTo(83.6f, 196.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.2f, -9.6f);
        pathBuilder.lineTo(118.0f, 156.0f);
        pathBuilder.lineTo(76.4f, 124.8f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.2f, -9.6f);
        pathBuilder.lineTo(128.0f, 148.5f);
        pathBuilder.lineToRelative(44.4f, -33.3f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 7.2f, 9.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gasCan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
