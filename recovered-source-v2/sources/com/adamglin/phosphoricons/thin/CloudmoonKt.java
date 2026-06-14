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

/* compiled from: Cloudmoon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudMoon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCloudMoon", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudMoon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudmoonKt {
    private static ImageVector _cloudMoon;

    public static final ImageVector getCloudMoon(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(172.0f, 76.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 156.0f, 77.81f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -52.68f, -64.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.79f, 4.8f);
        pathBuilder.arcToRelative(60.05f, 60.05f, 0.0f, false, true, -72.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 4.8f);
        pathBuilder.arcTo(68.2f, 68.2f, 0.0f, false, false, 56.17f, 140.1f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 92.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(31.22f, 99.44f);
        pathBuilder.arcTo(69.46f, 69.46f, 0.0f, false, false, 40.0f, 100.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, false, 68.0f, -68.0f);
        pathBuilder.arcToRelative(69.74f, 69.74f, 0.0f, false, false, -0.56f, -8.79f);
        pathBuilder.arcTo(59.66f, 59.66f, 0.0f, false, true, 148.0f, 80.0f);
        pathBuilder.verticalLineToRelative(0.11f);
        pathBuilder.arcToRelative(72.27f, 72.27f, 0.0f, false, false, -44.49f, 45.28f);
        pathBuilder.arcTo(48.28f, 48.28f, 0.0f, false, false, 92.0f, 124.0f);
        pathBuilder.arcToRelative(47.75f, 47.75f, 0.0f, false, false, -29.61f, 10.26f);
        pathBuilder.arcTo(60.21f, 60.21f, 0.0f, false, true, 31.22f, 99.44f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 212.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f);
        pathBuilder.arcTo(71.63f, 71.63f, 0.0f, false, false, 100.0f, 143.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f);
        pathBuilder.arcToRelative(64.3f, 64.3f, 0.0f, false, true, 2.0f, -12.67f);
        pathBuilder.curveToRelative(0.0f, -0.12f, 0.07f, -0.24f, 0.09f, -0.36f);
        pathBuilder.arcTo(64.06f, 64.06f, 0.0f, true, true, 172.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudMoon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
