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

/* compiled from: Lightningslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LightningSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLightningSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightningSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightningslashKt {
    private static ImageVector _lightningSlash;

    public static final ImageVector getLightningSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lightningSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LightningSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(84.05f, 88.58f);
        pathBuilder.lineTo(43.61f, 131.91f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.28f, 9.71f);
        pathBuilder.lineToRelative(59.23f, 22.21f);
        pathBuilder.lineToRelative(-15.0f, 75.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.14f, 6.52f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 96.0f, 246.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.39f, -1.91f);
        pathBuilder.lineToRelative(63.34f, -67.87f);
        pathBuilder.lineTo(203.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 220.46f);
        pathBuilder.lineToRelative(11.85f, -59.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.77f, -6.8f);
        pathBuilder.lineToRelative(-55.6f, -20.85f);
        pathBuilder.lineToRelative(33.64f, -36.0f);
        pathBuilder.lineToRelative(63.48f, 69.83f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 69.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.29f, -8.48f);
        pathBuilder.lineToRelative(45.88f, -49.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.27f, 5.27f);
        pathBuilder.lineToRelative(-15.0f, 75.0f);
        pathBuilder.lineToRelative(59.23f, 22.21f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.28f, 9.71f);
        pathBuilder.lineTo(190.08f, 148.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.77f, -8.19f);
        pathBuilder.lineToRelative(16.18f, -17.33f);
        pathBuilder.lineToRelative(-55.6f, -20.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.77f, -6.8f);
        pathBuilder.lineTo(150.0f, 35.54f);
        pathBuilder.lineTo(118.5f, 69.25f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 110.0f, 69.55f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightningSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
