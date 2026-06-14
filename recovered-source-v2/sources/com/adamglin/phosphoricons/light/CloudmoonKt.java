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

/* compiled from: Cloudmoon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudMoon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCloudMoon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudMoon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudmoonKt {
    private static ImageVector _cloudMoon;

    public static final ImageVector getCloudMoon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cloudMoon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudMoon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 74.0f);
        pathBuilder.arcToRelative(74.41f, 74.41f, 0.0f, false, false, -14.17f, 1.36f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, -54.11f, -63.59f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.53f, 19.0f);
        pathBuilder.arcTo(58.06f, 58.06f, 0.0f, false, true, 27.0f, 88.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.19f, 7.19f);
        pathBuilder.arcToRelative(70.22f, 70.22f, 0.0f, false, false, 33.3f, 44.95f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, false, 92.0f, 222.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(34.22f, 101.76f);
        pathBuilder.quadTo(37.1f, 102.0f, 40.0f, 102.0f);
        pathBuilder.arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f);
        pathBuilder.curveToRelative(0.0f, -1.94f, -0.08f, -3.88f, -0.24f, -5.8f);
        pathBuilder.arcTo(57.64f, 57.64f, 0.0f, false, true, 146.0f, 78.71f);
        pathBuilder.arcTo(74.32f, 74.32f, 0.0f, false, false, 102.2f, 123.0f);
        pathBuilder.arcTo(50.36f, 50.36f, 0.0f, false, false, 92.0f, 122.0f);
        pathBuilder.arcToRelative(49.74f, 49.74f, 0.0f, false, false, -29.86f, 9.92f);
        pathBuilder.arcTo(58.24f, 58.24f, 0.0f, false, true, 34.22f, 101.76f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 210.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 7.08f, -75.34f);
        pathBuilder.arcToRelative(75.84f, 75.84f, 0.0f, false, false, -1.07f, 9.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f);
        pathBuilder.arcToRelative(61.54f, 61.54f, 0.0f, false, true, 2.0f, -12.24f);
        pathBuilder.curveToRelative(0.0f, -0.15f, 0.08f, -0.29f, 0.11f, -0.43f);
        pathBuilder.arcTo(62.06f, 62.06f, 0.0f, true, true, 172.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudMoon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
