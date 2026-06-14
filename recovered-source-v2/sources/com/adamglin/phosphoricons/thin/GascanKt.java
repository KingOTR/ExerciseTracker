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

/* compiled from: Gascan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GasCan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGasCan", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gasCan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GascanKt {
    private static ImageVector _gasCan;

    public static final ImageVector getGasCan(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 28.0f);
        pathBuilder.lineTo(123.31f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 3.51f);
        pathBuilder.lineTo(101.66f, 44.69f);
        pathBuilder.lineTo(88.49f, 31.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f);
        pathBuilder.lineTo(60.69f, 85.66f);
        pathBuilder.lineTo(47.52f, 98.83f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 44.0f, 107.31f);
        pathBuilder.lineTo(44.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(200.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(212.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.17f, 66.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineTo(96.0f, 50.34f);
        pathBuilder.lineTo(66.34f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 216.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(56.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(52.0f, 107.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.82f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(35.31f, -35.31f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 123.31f, 36.0f);
        pathBuilder.lineTo(200.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(136.0f, 68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.4f, 123.2f);
        pathBuilder.lineTo(134.67f, 156.0f);
        pathBuilder.lineToRelative(43.73f, 32.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.8f, 6.4f);
        pathBuilder.lineTo(128.0f, 161.0f);
        pathBuilder.lineTo(82.4f, 195.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.8f, -6.4f);
        pathBuilder.lineTo(121.33f, 156.0f);
        pathBuilder.lineTo(77.6f, 123.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.8f, -6.4f);
        pathBuilder.lineTo(128.0f, 151.0f);
        pathBuilder.lineToRelative(45.6f, -34.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.8f, 6.4f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gasCan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
