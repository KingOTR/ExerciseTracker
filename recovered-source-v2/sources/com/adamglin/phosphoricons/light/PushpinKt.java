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

/* compiled from: Pushpin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPushPin", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pushPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(233.91f, 82.79f);
        pathBuilder.lineTo(173.22f, 22.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.81f, 0.0f);
        pathBuilder.lineTo(98.93f, 76.77f);
        pathBuilder.curveToRelative(-9.52f, -3.25f, -34.0f, -8.34f, -59.71f, 12.41f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 38.1f, 110.0f);
        pathBuilder.lineToRelative(49.71f, 49.71f);
        pathBuilder.lineToRelative(-44.05f, 44.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(44.05f, -44.05f);
        pathBuilder.lineTo(146.0f, 217.89f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.9f, 4.11f);
        pathBuilder.quadToRelative(0.49f, 0.0f, 1.0f, 0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.19f, -5.54f);
        pathBuilder.curveToRelative(19.72f, -26.21f, 17.15f, -47.23f, 12.46f, -59.3f);
        pathBuilder.lineToRelative(54.37f, -54.55f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 233.91f, 82.79f);
        pathBuilder.close();
        pathBuilder.moveTo(225.42f, 94.1f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-57.27f, 57.46f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.11f, 6.92f);
        pathBuilder.curveToRelative(9.94f, 19.88f, -1.71f, 40.32f, -9.54f, 50.72f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, 0.2f);
        pathBuilder.lineTo(46.58f, 101.51f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.18f, -3.0f);
        pathBuilder.curveToRelative(12.5f, -10.09f, 24.5f, -12.76f, 33.7f, -12.76f);
        pathBuilder.arcToRelative(42.13f, 42.13f, 0.0f, false, true, 17.25f, 3.41f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.64f, 88.0f);
        pathBuilder.lineTo(161.9f, 30.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(60.69f, 60.68f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 225.42f, 94.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
