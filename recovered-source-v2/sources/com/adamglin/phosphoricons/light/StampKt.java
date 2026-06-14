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

/* compiled from: Stamp.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Stamp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStamp", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stamp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StampKt {
    private static ImageVector _stamp;

    public static final ImageVector getStamp(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _stamp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Stamp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(40.0f, 230.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(216.0f, 218.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.0f, 144.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(48.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f);
        pathBuilder.lineTo(34.0f, 144.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f);
        pathBuilder.horizontalLineToRelative(58.9f);
        pathBuilder.lineTo(90.68f, 54.29f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 120.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 29.33f, 36.29f);
        pathBuilder.lineTo(149.1f, 130.0f);
        pathBuilder.lineTo(208.0f, 130.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(119.17f, 130.0f);
        pathBuilder.horizontalLineToRelative(17.66f);
        pathBuilder.lineToRelative(16.76f, -78.23f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 136.0f, 30.0f);
        pathBuilder.lineTo(120.0f, 30.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, -17.6f, 21.77f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 144.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f);
        pathBuilder.lineTo(48.0f, 142.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f);
        pathBuilder.lineTo(208.0f, 186.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stamp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
