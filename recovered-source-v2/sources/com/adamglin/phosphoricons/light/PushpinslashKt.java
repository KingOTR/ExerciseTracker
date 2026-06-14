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

/* compiled from: Pushpinslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPushPinSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinslashKt {
    private static ImageVector _pushPinSlash;

    public static final ImageVector getPushPinSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pushPinSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPinSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(71.27f, 74.51f);
        pathBuilder.curveTo(61.78f, 76.0f, 50.6f, 80.0f, 39.22f, 89.18f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 38.1f, 110.0f);
        pathBuilder.lineToRelative(49.71f, 49.71f);
        pathBuilder.lineToRelative(-44.05f, 44.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(44.05f, -44.05f);
        pathBuilder.lineTo(146.0f, 217.89f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.11f);
        pathBuilder.quadToRelative(0.49f, 0.0f, 1.0f, 0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.19f, -5.54f);
        pathBuilder.arcToRelative(85.51f, 85.51f, 0.0f, false, false, 12.44f, -22.84f);
        pathBuilder.lineToRelative(24.0f, 26.45f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.87f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(157.49f, 209.21f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.2f);
        pathBuilder.lineTo(46.58f, 101.51f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.18f, -3.0f);
        pathBuilder.curveToRelative(13.18f, -10.64f, 25.84f, -12.9f, 34.79f, -12.7f);
        pathBuilder.lineTo(170.0f, 183.11f);
        pathBuilder.curveTo(167.83f, 193.74f, 162.11f, 203.07f, 157.49f, 209.21f);
        pathBuilder.close();
        pathBuilder.moveTo(233.91f, 102.59f);
        pathBuilder.lineTo(189.26f, 147.37f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.5f, -8.47f);
        pathBuilder.lineToRelative(44.65f, -44.79f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -2.84f);
        pathBuilder.lineTo(164.73f, 30.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.83f, 0.0f);
        pathBuilder.lineTo(120.68f, 71.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.5f, -8.47f);
        pathBuilder.lineToRelative(41.23f, -41.36f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, 19.81f, 0.0f);
        pathBuilder.lineToRelative(60.69f, 60.69f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 233.91f, 102.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
