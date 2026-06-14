package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sphere.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sphere", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSphere", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sphere", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SphereKt {
    private static ImageVector _sphere;

    public static final ImageVector getSphere(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _sphere;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sphere", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 127.86f);
        pathBuilder.curveToRelative(-0.56f, 1.41f, -5.7f, 7.11f, -22.88f, 12.33f);
        pathBuilder.arcToRelative(157.26f, 157.26f, 0.0f, false, true, -17.57f, 4.15f);
        pathBuilder.curveToRelative(0.3f, -5.44f, 0.45f, -10.91f, 0.45f, -16.34f);
        pathBuilder.curveToRelative(0.0f, -27.85f, -3.95f, -56.83f, -12.25f, -77.75f);
        pathBuilder.arcTo(84.13f, 84.13f, 0.0f, false, true, 212.0f, 127.86f);
        pathBuilder.close();
        pathBuilder.moveTo(127.86f, 44.0f);
        pathBuilder.curveToRelative(1.41f, 0.56f, 7.11f, 5.7f, 12.33f, 22.88f);
        pathBuilder.curveToRelative(5.0f, 16.6f, 7.81f, 38.31f, 7.81f, 61.12f);
        pathBuilder.curveToRelative(0.0f, 6.56f, -0.24f, 13.0f, -0.68f, 19.32f);
        pathBuilder.curveToRelative(-6.29f, 0.44f, -12.76f, 0.68f, -19.32f, 0.68f);
        pathBuilder.curveToRelative(-22.81f, 0.0f, -44.52f, -2.78f, -61.12f, -7.81f);
        pathBuilder.curveTo(49.7f, 135.0f, 44.56f, 129.27f, 44.0f, 127.86f);
        pathBuilder.arcTo(84.1f, 84.1f, 0.0f, false, true, 127.86f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(50.25f, 159.75f);
        pathBuilder.curveTo(71.17f, 168.05f, 100.15f, 172.0f, 128.0f, 172.0f);
        pathBuilder.curveToRelative(5.43f, 0.0f, 10.9f, -0.15f, 16.34f, -0.46f);
        pathBuilder.arcToRelative(156.93f, 156.93f, 0.0f, false, true, -4.15f, 17.58f);
        pathBuilder.curveTo(135.0f, 206.3f, 129.27f, 211.44f, 127.86f, 212.0f);
        pathBuilder.arcTo(84.13f, 84.13f, 0.0f, false, true, 50.25f, 159.75f);
        pathBuilder.close();
        pathBuilder.moveTo(159.75f, 205.75f);
        pathBuilder.curveToRelative(4.19f, -10.57f, 7.28f, -23.2f, 9.3f, -36.7f);
        pathBuilder.curveToRelative(13.5f, -2.0f, 26.13f, -5.11f, 36.7f, -9.3f);
        pathBuilder.arcTo(84.42f, 84.42f, 0.0f, false, true, 159.75f, 205.75f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sphere = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
