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

/* compiled from: Printer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Printer", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPrinter", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_printer", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PrinterKt {
    private static ImageVector _printer;

    public static final ImageVector getPrinter(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _printer;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Printer", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.67f, 74.0f);
        pathBuilder.lineTo(198.0f, 74.0f);
        pathBuilder.lineTo(198.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(64.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(58.0f, 74.0f);
        pathBuilder.lineTo(41.33f, 74.0f);
        pathBuilder.curveTo(28.47f, 74.0f, 18.0f, 83.87f, 18.0f, 96.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(58.0f, 182.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(192.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(198.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(238.0f, 96.0f);
        pathBuilder.curveTo(238.0f, 83.87f, 227.53f, 74.0f, 214.67f, 74.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 46.0f);
        pathBuilder.lineTo(186.0f, 46.0f);
        pathBuilder.lineTo(186.0f, 74.0f);
        pathBuilder.lineTo(70.0f, 74.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.0f, 210.0f);
        pathBuilder.lineTo(70.0f, 210.0f);
        pathBuilder.lineTo(70.0f, 158.0f);
        pathBuilder.lineTo(186.0f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 170.0f);
        pathBuilder.lineTo(198.0f, 170.0f);
        pathBuilder.lineTo(198.0f, 152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(64.0f, 146.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.lineTo(30.0f, 170.0f);
        pathBuilder.lineTo(30.0f, 96.0f);
        pathBuilder.curveToRelative(0.0f, -5.51f, 5.08f, -10.0f, 11.33f, -10.0f);
        pathBuilder.lineTo(214.67f, 86.0f);
        pathBuilder.curveTo(220.92f, 86.0f, 226.0f, 90.49f, 226.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 116.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 198.0f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _printer = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
