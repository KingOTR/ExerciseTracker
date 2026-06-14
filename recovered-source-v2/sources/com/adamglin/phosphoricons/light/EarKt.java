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

/* compiled from: Ear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEar", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarKt {
    private static ImageVector _ear;

    public static final ImageVector getEar(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _ear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(214.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, -148.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 27.55f, 8.83f, 36.06f, 18.18f, 45.08f);
        pathBuilder.curveToRelative(4.31f, 4.15f, 8.77f, 8.45f, 12.16f, 14.47f);
        pathBuilder.curveTo(88.15f, 170.31f, 90.0f, 178.3f, 90.0f, 188.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.curveToRelative(10.74f, 0.0f, 19.69f, -4.52f, 27.37f, -13.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.26f, 7.64f);
        pathBuilder.curveTo(154.66f, 231.88f, 142.34f, 238.0f, 128.0f, 238.0f);
        pathBuilder.arcToRelative(50.06f, 50.06f, 0.0f, false, true, -50.0f, -50.0f);
        pathBuilder.curveToRelative(0.0f, -16.64f, -6.24f, -22.66f, -14.15f, -30.29f);
        pathBuilder.curveTo(54.12f, 148.33f, 42.0f, 136.64f, 42.0f, 104.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, true, 172.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.86f, 162.81f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.19f, 2.19f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 150.0f, 160.0f);
        pathBuilder.curveToRelative(0.0f, -10.0f, 5.0f, -16.67f, 10.8f, -24.4f);
        pathBuilder.curveTo(167.0f, 127.35f, 174.0f, 118.0f, 174.0f, 104.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 10.0f, -5.0f, 16.67f, -10.8f, 24.4f);
        pathBuilder.curveTo(145.0f, 136.65f, 138.0f, 146.0f, 138.0f, 160.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 41.05f, 11.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 176.86f, 162.81f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
