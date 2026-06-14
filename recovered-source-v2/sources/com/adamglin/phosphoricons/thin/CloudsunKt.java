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

/* compiled from: Cloudsun.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSun", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCloudSun", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSun", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudsunKt {
    private static ImageVector _cloudSun;

    public static final ImageVector getCloudSun(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(164.0f, 76.0f);
        pathBuilder.arcToRelative(71.85f, 71.85f, 0.0f, false, false, -22.14f, 3.48f);
        pathBuilder.arcTo(51.78f, 51.78f, 0.0f, false, false, 129.0f, 63.83f);
        pathBuilder.lineToRelative(11.56f, -16.51f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 134.0f, 42.73f);
        pathBuilder.lineTo(122.45f, 59.24f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 96.0f, 52.0f);
        pathBuilder.curveToRelative(-1.71f, 0.0f, -3.4f, 0.09f, -5.06f, 0.25f);
        pathBuilder.lineTo(87.44f, 32.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.88f, 1.39f);
        pathBuilder.lineToRelative(3.5f, 19.84f);
        pathBuilder.arcTo(52.19f, 52.19f, 0.0f, false, false, 55.85f, 71.0f);
        pathBuilder.lineTo(39.32f, 59.42f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 34.73f, 66.0f);
        pathBuilder.lineTo(51.26f, 77.54f);
        pathBuilder.arcTo(51.63f, 51.63f, 0.0f, false, false, 44.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 1.69f, 0.09f, 3.37f, 0.25f, 5.0f);
        pathBuilder.lineToRelative(-19.85f, 3.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.69f, 7.94f);
        pathBuilder.arcToRelative(4.23f, 4.23f, 0.0f, false, false, 0.7f, -0.06f);
        pathBuilder.lineToRelative(19.85f, -3.5f);
        pathBuilder.arcTo(52.07f, 52.07f, 0.0f, false, false, 54.0f, 134.6f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, false, 84.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 0.0f, -144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 104.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 82.33f, -21.61f);
        pathBuilder.arcToRelative(72.23f, 72.23f, 0.0f, false, false, -38.82f, 43.0f);
        pathBuilder.arcTo(48.28f, 48.28f, 0.0f, false, false, 84.0f, 124.0f);
        pathBuilder.arcToRelative(47.76f, 47.76f, 0.0f, false, false, -23.4f, 6.11f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 52.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 212.0f);
        pathBuilder.horizontalLineTo(84.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 9.43f, -78.88f);
        pathBuilder.arcTo(71.63f, 71.63f, 0.0f, false, false, 92.0f, 143.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.46f);
        pathBuilder.arcToRelative(64.3f, 64.3f, 0.0f, false, true, 2.0f, -12.67f);
        pathBuilder.curveToRelative(0.0f, -0.12f, 0.07f, -0.24f, 0.09f, -0.36f);
        pathBuilder.arcTo(64.06f, 64.06f, 0.0f, true, true, 164.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSun = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
