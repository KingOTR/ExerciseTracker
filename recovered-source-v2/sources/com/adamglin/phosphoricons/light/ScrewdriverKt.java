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

/* compiled from: Screwdriver.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Screwdriver", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getScrewdriver", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_screwdriver", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrewdriverKt {
    private static ImageVector _screwdriver;

    public static final ImageVector getScrewdriver(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _screwdriver;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Screwdriver", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.24f, 51.74f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.49f);
        pathBuilder.lineToRelative(56.0f, -56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 204.24f, 51.74f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 58.41f);
        pathBuilder.arcToRelative(48.12f, 48.12f, 0.0f, false, true, -14.18f, 34.24f);
        pathBuilder.lineToRelative(-53.24f, 53.24f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, true, -9.89f, 4.1f);
        pathBuilder.lineTo(152.0f, 149.99f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(16.83f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, true, -2.84f, 8.45f);
        pathBuilder.arcToRelative(6.48f, 6.48f, 0.0f, false, true, -0.54f, 0.62f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -19.8f, 0.0f);
        pathBuilder.lineTo(98.7f, 165.77f);
        pathBuilder.lineTo(20.24f, 244.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineToRelative(78.46f, -78.47f);
        pathBuilder.lineTo(70.1f, 137.17f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -19.8f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(4.53f, 4.53f, 0.0f, false, true, 0.62f, -0.54f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 87.17f, 106.0f);
        pathBuilder.lineTo(104.0f, 106.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f);
        pathBuilder.lineTo(106.0f, 87.3f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, true, 4.1f, -9.9f);
        pathBuilder.lineToRelative(53.23f, -53.24f);
        pathBuilder.arcTo(48.43f, 48.43f, 0.0f, false, true, 246.0f, 58.41f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 58.41f);
        pathBuilder.arcToRelative(36.43f, 36.43f, 0.0f, false, false, -62.18f, -25.76f);
        pathBuilder.lineTo(118.58f, 85.88f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 118.0f, 87.3f);
        pathBuilder.lineTo(118.0f, 104.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f);
        pathBuilder.lineTo(87.17f, 118.0f);
        pathBuilder.arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.0f, 0.25f);
        pathBuilder.lineToRelative(-7.61f, 7.61f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.83f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(48.73f, 48.73f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.82f, 0.0f);
        pathBuilder.lineToRelative(7.62f, -7.61f);
        pathBuilder.arcToRelative(2.1f, 2.1f, 0.0f, false, false, 0.25f, -1.0f);
        pathBuilder.lineTo(137.98f, 152.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f);
        pathBuilder.horizontalLineToRelative(16.69f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.41f, -0.59f);
        pathBuilder.lineToRelative(53.23f, -53.23f);
        pathBuilder.arcTo(36.19f, 36.19f, 0.0f, false, false, 234.0f, 58.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _screwdriver = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
