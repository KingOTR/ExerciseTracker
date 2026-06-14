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

/* compiled from: Headset.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Headset", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeadset", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_headset", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeadsetKt {
    private static ImageVector _headset;

    public static final ImageVector getHeadset(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _headset;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Headset", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.47f, 56.07f);
        pathBuilder.arcTo(101.37f, 101.37f, 0.0f, false, false, 128.77f, 26.0f);
        pathBuilder.lineTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 26.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f);
        pathBuilder.lineTo(64.0f, 206.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f);
        pathBuilder.lineTo(86.0f, 144.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f);
        pathBuilder.lineTo(38.2f, 122.0f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(0.68f);
        pathBuilder.arcToRelative(89.71f, 89.71f, 0.0f, false, true, 89.13f, 84.0f);
        pathBuilder.lineTo(192.0f, 122.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f);
        pathBuilder.lineTo(136.0f, 234.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f);
        pathBuilder.lineTo(230.0f, 128.0f);
        pathBuilder.arcTo(101.44f, 101.44f, 0.0f, false, false, 200.47f, 56.07f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 134.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f);
        pathBuilder.lineTo(48.0f, 194.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.lineTo(38.0f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 184.0f);
        pathBuilder.lineTo(182.0f, 144.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.verticalLineToRelative(60.0f);
        pathBuilder.lineTo(192.0f, 194.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 182.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _headset = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
