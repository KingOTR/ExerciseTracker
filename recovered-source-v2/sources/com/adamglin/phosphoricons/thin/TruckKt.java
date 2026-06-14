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

/* compiled from: Truck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Truck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTruck", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_truck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TruckKt {
    private static ImageVector _truck;

    public static final ImageVector getTruck(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _truck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Truck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.71f, 118.52f);
        pathBuilder.lineToRelative(-14.0f, -35.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 226.58f, 76.0f);
        pathBuilder.lineTo(188.0f, 76.0f);
        pathBuilder.lineTo(188.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(32.0f, 60.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 72.0f);
        pathBuilder.lineTo(20.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(52.29f, 196.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f);
        pathBuilder.horizontalLineToRelative(56.58f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f);
        pathBuilder.lineTo(240.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(252.0f, 120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 251.71f, 118.52f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(38.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.72f, 2.51f);
        pathBuilder.lineTo(242.09f, 116.0f);
        pathBuilder.lineTo(188.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(180.0f, 68.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(28.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.29f, 188.0f);
        pathBuilder.lineTo(107.71f, 188.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f);
        pathBuilder.lineTo(32.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(28.0f, 148.0f);
        pathBuilder.lineTo(180.0f, 148.0f);
        pathBuilder.verticalLineToRelative(18.71f);
        pathBuilder.arcTo(28.05f, 28.05f, 0.0f, false, false, 164.29f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(219.71f, 188.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 188.0f, 164.29f);
        pathBuilder.lineTo(188.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _truck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
