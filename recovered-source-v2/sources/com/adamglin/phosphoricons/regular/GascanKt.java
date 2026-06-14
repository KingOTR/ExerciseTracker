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

/* compiled from: Gascan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GasCan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGasCan", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gasCan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GascanKt {
    private static ImageVector _gasCan;

    public static final ImageVector getGasCan(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 24.0f);
        pathBuilder.lineTo(123.31f, 24.0f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 112.0f, 28.69f);
        pathBuilder.lineTo(101.66f, 39.0f);
        pathBuilder.lineTo(91.31f, 28.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f);
        pathBuilder.lineTo(55.0f, 85.66f);
        pathBuilder.lineTo(44.69f, 96.0f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 40.0f, 107.31f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(200.0f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 64.0f);
        pathBuilder.lineTo(80.0f, 40.0f);
        pathBuilder.lineTo(90.34f, 50.34f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 216.0f);
        pathBuilder.lineTo(56.0f, 216.0f);
        pathBuilder.lineTo(56.0f, 107.31f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(123.31f, 40.0f);
        pathBuilder.lineTo(200.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(136.0f, 72.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.8f, 126.4f);
        pathBuilder.lineTo(141.33f, 156.0f);
        pathBuilder.lineToRelative(39.47f, 29.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.6f, 12.8f);
        pathBuilder.lineTo(128.0f, 166.0f);
        pathBuilder.lineTo(84.8f, 198.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f);
        pathBuilder.lineTo(114.67f, 156.0f);
        pathBuilder.lineTo(75.2f, 126.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, -12.8f);
        pathBuilder.lineTo(128.0f, 146.0f);
        pathBuilder.lineToRelative(43.2f, -32.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 12.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gasCan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
