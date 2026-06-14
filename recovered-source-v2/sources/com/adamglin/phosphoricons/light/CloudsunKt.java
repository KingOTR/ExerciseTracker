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

/* compiled from: Cloudsun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCloudSun", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudsunKt {
    private static ImageVector _cloudSun;

    public static final ImageVector getCloudSun(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cloudSun;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudSun", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(164.0f, 74.0f);
        pathBuilder.arcToRelative(74.15f, 74.15f, 0.0f, false, false, -21.18f, 3.09f);
        pathBuilder.arcToRelative(54.08f, 54.08f, 0.0f, false, false, -11.14f, -13.61f);
        pathBuilder.lineToRelative(10.52f, -15.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.83f, -6.89f);
        pathBuilder.lineToRelative(-10.52f, 15.0f);
        pathBuilder.arcTo(53.9f, 53.9f, 0.0f, false, false, 96.0f, 50.0f);
        pathBuilder.curveToRelative(-1.15f, 0.0f, -2.28f, 0.0f, -3.41f, 0.12f);
        pathBuilder.lineTo(89.4f, 32.05f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.81f, 2.09f);
        pathBuilder.lineTo(80.77f, 52.2f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 55.52f, 68.32f);
        pathBuilder.lineTo(40.47f, 57.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.89f, 9.83f);
        pathBuilder.lineToRelative(15.0f, 10.52f);
        pathBuilder.arcTo(53.7f, 53.7f, 0.0f, false, false, 42.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 1.13f, 0.0f, 2.26f, 0.12f, 3.39f);
        pathBuilder.lineToRelative(-18.07f, 3.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.0f, 11.91f);
        pathBuilder.arcToRelative(6.38f, 6.38f, 0.0f, false, false, 1.05f, -0.09f);
        pathBuilder.lineTo(44.2f, 119.2f);
        pathBuilder.arcToRelative(53.51f, 53.51f, 0.0f, false, false, 7.08f, 15.0f);
        pathBuilder.arcTo(50.0f, 50.0f, 0.0f, false, false, 84.0f, 222.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, 0.0f, -148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.0f, 104.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 77.48f, -22.49f);
        pathBuilder.arcTo(74.29f, 74.29f, 0.0f, false, false, 94.2f, 123.0f);
        pathBuilder.arcTo(50.36f, 50.36f, 0.0f, false, false, 84.0f, 122.0f);
        pathBuilder.arcToRelative(49.65f, 49.65f, 0.0f, false, false, -22.79f, 5.52f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 54.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 210.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 7.08f, -75.34f);
        pathBuilder.arcToRelative(75.84f, 75.84f, 0.0f, false, false, -1.07f, 9.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.7f);
        pathBuilder.arcToRelative(61.54f, 61.54f, 0.0f, false, true, 2.0f, -12.24f);
        pathBuilder.curveToRelative(0.0f, -0.15f, 0.08f, -0.29f, 0.11f, -0.43f);
        pathBuilder.arcTo(62.06f, 62.06f, 0.0f, true, true, 164.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
