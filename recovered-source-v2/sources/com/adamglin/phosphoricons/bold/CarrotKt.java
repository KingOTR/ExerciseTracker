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

/* compiled from: Carrot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Carrot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCarrot", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carrot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarrotKt {
    private static ImageVector _carrot;

    public static final ImageVector getCarrot(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _carrot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Carrot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 60.0f);
        pathBuilder.lineTo(213.0f, 60.0f);
        pathBuilder.lineToRelative(19.51f, -19.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f);
        pathBuilder.lineTo(196.0f, 43.0f);
        pathBuilder.lineTo(196.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(172.0f, 50.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 96.0f, 63.87f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.curveTo(55.45f, 103.68f, 25.18f, 197.0f, 21.78f, 207.77f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 236.0f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, false, false, 8.24f, -1.78f);
        pathBuilder.curveToRelative(7.64f, -2.42f, 56.79f, -18.34f, 98.91f, -41.82f);
        pathBuilder.lineToRelative(0.54f, -0.3f);
        pathBuilder.curveToRelative(17.1f, -9.57f, 33.0f, -20.39f, 44.44f, -32.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, false, 206.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.11f, 143.12f);
        pathBuilder.lineTo(175.02f, 143.21f);
        pathBuilder.curveToRelative(-8.11f, 8.28f, -19.11f, 16.2f, -31.33f, 23.52f);
        pathBuilder.lineToRelative(-23.21f, -23.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f);
        pathBuilder.lineToRelative(18.22f, 18.22f);
        pathBuilder.curveToRelative(-30.29f, 15.17f, -62.13f, 26.42f, -75.26f, 30.82f);
        pathBuilder.curveToRelative(6.77f, -20.22f, 29.79f, -84.8f, 58.34f, -119.74f);
        pathBuilder.lineToRelative(30.7f, 30.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f);
        pathBuilder.lineTo(122.54f, 73.58f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 52.57f, 69.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carrot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
