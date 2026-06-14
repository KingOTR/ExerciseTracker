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

/* compiled from: Handswiperight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandSwipeRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandSwipeRight", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handSwipeRight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandswiperightKt {
    private static ImageVector _handSwipeRight;

    public static final ImageVector getHandSwipeRight(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handSwipeRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandSwipeRight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.0f, 140.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.curveToRelative(0.0f, 25.13f, -8.28f, 42.0f, -8.64f, 42.68f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 200.0f, 222.0f);
        pathBuilder.arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.68f, -0.64f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.68f, -8.0f);
        pathBuilder.curveToRelative(0.07f, -0.14f, 7.37f, -15.19f, 7.37f, -37.32f);
        pathBuilder.lineTo(202.01f, 140.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(162.01f, 124.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.01f, 68.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.lineTo(94.01f, 176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.09f, 3.17f);
        pathBuilder.lineToRelative(-18.68f, -30.0f);
        pathBuilder.arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, -0.17f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.25f, 14.0f);
        pathBuilder.lineToRelative(29.29f, 50.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 58.81f, 219.0f);
        pathBuilder.lineTo(29.49f, 169.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 45.0f, -26.13f);
        pathBuilder.lineTo(82.0f, 155.0f);
        pathBuilder.lineTo(82.0f, 68.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.1f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 39.42f, 16.39f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 214.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.24f, 51.76f);
        pathBuilder.lineTo(220.24f, 19.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(233.51f, 50.0f);
        pathBuilder.lineTo(176.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(57.51f);
        pathBuilder.lineTo(211.76f, 83.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 252.24f, 51.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handSwipeRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
