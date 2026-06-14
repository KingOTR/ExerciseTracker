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

/* compiled from: Thermometercold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerCold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getThermometerCold", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerCold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometercoldKt {
    private static ImageVector _thermometerCold;

    public static final ImageVector getThermometerCold(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _thermometerCold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ThermometerCold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.verticalLineToRelative(98.77f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.77f, 7.68f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 108.0f, 228.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.14f, 81.52f);
        pathBuilder.lineToRelative(-14.72f, 4.79f);
        pathBuilder.lineToRelative(9.1f, 12.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.42f, 14.11f);
        pathBuilder.lineTo(212.0f, 100.42f);
        pathBuilder.lineToRelative(-9.1f, 12.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.42f, -14.11f);
        pathBuilder.lineToRelative(9.1f, -12.52f);
        pathBuilder.lineToRelative(-14.72f, -4.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, -22.82f);
        pathBuilder.lineTo(200.0f, 63.48f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(63.48f);
        pathBuilder.lineToRelative(14.73f, -4.78f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, 22.82f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 188.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.78f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(35.22f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerCold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
