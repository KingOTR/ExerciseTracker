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

/* compiled from: Bus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBus", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BusKt {
    private static ImageVector _bus;

    public static final ImageVector getBus(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(184.0f, 34.0f);
        pathBuilder.lineTo(72.0f, 34.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 42.0f, 64.0f);
        pathBuilder.lineTo(42.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(80.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(94.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(214.0f, 64.0f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 184.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 178.0f);
        pathBuilder.lineTo(54.0f, 118.0f);
        pathBuilder.lineTo(202.0f, 118.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 78.0f);
        pathBuilder.lineTo(202.0f, 78.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.lineTo(54.0f, 106.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 46.0f);
        pathBuilder.lineTo(184.0f, 46.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(54.0f, 66.0f);
        pathBuilder.lineTo(54.0f, 64.0f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, true, 72.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(56.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(54.0f, 190.0f);
        pathBuilder.lineTo(82.0f, 190.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 210.0f);
        pathBuilder.lineTo(176.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(174.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 200.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 148.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 102.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 148.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 80.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(234.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 80.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(10.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
