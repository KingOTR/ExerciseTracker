package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cloudmoon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudMoon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCloudMoon", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudMoon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudmoonKt {
    private static ImageVector _cloudMoon;

    public static final ImageVector getCloudMoon(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(172.0f, 72.0f);
        pathBuilder.arcToRelative(76.35f, 76.35f, 0.0f, false, false, -12.36f, 1.0f);
        pathBuilder.arcTo(71.93f, 71.93f, 0.0f, false, false, 104.17f, 9.83f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.58f);
        pathBuilder.arcTo(56.05f, 56.05f, 0.0f, false, true, 40.0f, 88.0f);
        pathBuilder.arcToRelative(56.45f, 56.45f, 0.0f, false, true, -12.59f, -1.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.59f, 9.59f);
        pathBuilder.arcToRelative(72.22f, 72.22f, 0.0f, false, false, 32.29f, 45.06f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, false, 92.0f, 224.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 0.0f, -152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(37.37f, 104.0f);
        pathBuilder.curveToRelative(0.87f, 0.0f, 1.75f, 0.0f, 2.63f, 0.0f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, false, false, 72.0f, -72.0f);
        pathBuilder.curveToRelative(0.0f, -0.89f, 0.0f, -1.78f, 0.0f, -2.67f);
        pathBuilder.arcToRelative(55.64f, 55.64f, 0.0f, false, true, 32.0f, 48.05f);
        pathBuilder.arcTo(76.4f, 76.4f, 0.0f, false, false, 101.0f, 120.78f);
        pathBuilder.arcToRelative(52.38f, 52.38f, 0.0f, false, false, -9.0f, -0.78f);
        pathBuilder.arcToRelative(51.69f, 51.69f, 0.0f, false, false, -30.0f, 9.59f);
        pathBuilder.arcTo(56.22f, 56.22f, 0.0f, false, true, 37.37f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudMoon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
