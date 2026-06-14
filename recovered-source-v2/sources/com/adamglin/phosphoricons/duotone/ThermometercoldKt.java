package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Thermometercold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ThermometerCold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getThermometerCold", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_thermometerCold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ThermometercoldKt {
    private static ImageVector _thermometerCold;

    public static final ImageVector getThermometerCold(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(152.0f, 138.0f);
        pathBuilder.lineTo(152.0f, 48.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f);
        pathBuilder.verticalLineToRelative(90.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, false, 64.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 120.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(248.91f, 77.72f);
        pathBuilder2.lineToRelative(-20.0f, 6.49f);
        pathBuilder2.lineToRelative(12.34f, 17.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.94f, 9.4f);
        pathBuilder2.lineTo(216.0f, 93.61f);
        pathBuilder2.lineToRelative(-12.34f, 17.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.94f, -9.4f);
        pathBuilder2.lineToRelative(12.34f, -17.0f);
        pathBuilder2.lineToRelative(-20.0f, -6.49f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 62.5f);
        pathBuilder2.lineTo(208.0f, 69.0f);
        pathBuilder2.lineTo(208.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.lineTo(224.0f, 69.0f);
        pathBuilder2.lineToRelative(20.0f, -6.49f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.95f, 15.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 184.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, -40.0f, -31.0f);
        pathBuilder2.lineTo(112.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(33.0f);
        pathBuilder2.arcTo(32.06f, 32.06f, 0.0f, false, true, 152.0f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 184.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.0f, 184.0f);
        pathBuilder2.arcTo(64.0f, 64.0f, 0.0f, true, true, 80.0f, 134.0f);
        pathBuilder2.lineTo(80.0f, 48.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(86.0f);
        pathBuilder2.arcTo(64.08f, 64.08f, 0.0f, false, true, 184.0f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.0f, 184.0f);
        pathBuilder2.arcToRelative(48.08f, 48.08f, 0.0f, false, false, -20.58f, -39.4f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 138.0f);
        pathBuilder2.lineTo(144.0f, 48.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(90.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.42f, 6.56f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, true, false, 168.0f, 184.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _thermometerCold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
