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

/* compiled from: Thermometerhot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerHot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getThermometerHot", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerHot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometerhotKt {
    private static ImageVector _thermometerHot;

    public static final ImageVector getThermometerHot(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _thermometerHot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThermometerHot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 56.0f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder.verticalLineToRelative(94.69f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, false, 104.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 228.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -30.91f, -65.39f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 154.78f);
        pathBuilder.lineTo(80.0f, 56.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(98.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.77f, 7.68f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 108.0f, 228.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 188.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.78f);
        pathBuilder.lineTo(96.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 167.22f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.94f, 83.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.51f, -16.6f);
        pathBuilder.curveToRelative(16.82f, -11.0f, 30.32f, -5.2f, 39.26f, -1.39f);
        pathBuilder.curveToRelative(8.09f, 3.46f, 10.93f, 4.37f, 16.74f, 0.58f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.1f, 20.11f);
        pathBuilder.curveTo(239.28f, 90.38f, 232.64f, 92.0f, 226.71f, 92.0f);
        pathBuilder.curveToRelative(-7.79f, 0.0f, -14.34f, -2.8f, -19.42f, -5.0f);
        pathBuilder.curveToRelative(-8.09f, -3.46f, -10.93f, -4.37f, -16.74f, -0.58f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 173.94f, 83.0f);
        pathBuilder.close();
        pathBuilder.moveTo(250.05f, 109.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.5f, 16.6f);
        pathBuilder.curveToRelative(-7.27f, 4.73f, -13.91f, 6.35f, -19.84f, 6.35f);
        pathBuilder.curveToRelative(-7.79f, 0.0f, -14.34f, -2.8f, -19.42f, -5.0f);
        pathBuilder.curveToRelative(-8.09f, -3.46f, -10.93f, -4.37f, -16.74f, -0.58f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.1f, -20.11f);
        pathBuilder.curveToRelative(16.82f, -11.0f, 30.32f, -5.2f, 39.26f, -1.39f);
        pathBuilder.curveToRelative(8.09f, 3.46f, 10.93f, 4.37f, 16.74f, 0.58f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 250.05f, 109.05f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerHot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
