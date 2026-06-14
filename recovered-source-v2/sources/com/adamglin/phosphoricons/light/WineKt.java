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

/* compiled from: Wine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWine", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WineKt {
    private static ImageVector _wine;

    public static final ImageVector getWine(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _wine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(203.41f, 104.23f);
        pathBuilder.lineTo(181.64f, 30.3f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.75f, -4.3f);
        pathBuilder.lineTo(80.11f, 26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.75f, 4.3f);
        pathBuilder.lineTo(52.59f, 104.23f);
        pathBuilder.arcToRelative(61.48f, 61.48f, 0.0f, false, false, 16.87f, 62.65f);
        pathBuilder.arcTo(85.35f, 85.35f, 0.0f, false, false, 122.0f, 189.77f);
        pathBuilder.lineTo(122.0f, 234.0f);
        pathBuilder.lineTo(88.0f, 234.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 234.0f);
        pathBuilder.lineTo(134.0f, 189.77f);
        pathBuilder.arcToRelative(85.38f, 85.38f, 0.0f, false, false, 52.54f, -22.89f);
        pathBuilder.arcTo(61.48f, 61.48f, 0.0f, false, false, 203.41f, 104.23f);
        pathBuilder.close();
        pathBuilder.moveTo(84.6f, 38.0f);
        pathBuilder.horizontalLineToRelative(86.8f);
        pathBuilder.lineToRelative(20.51f, 69.63f);
        pathBuilder.curveToRelative(0.26f, 0.9f, 0.5f, 1.8f, 0.71f, 2.7f);
        pathBuilder.curveToRelative(-22.54f, 9.07f, -48.17f, -0.73f, -61.91f, -7.68f);
        pathBuilder.curveTo(104.1f, 89.17f, 83.48f, 88.34f, 68.83f, 91.52f);
        pathBuilder.close();
        pathBuilder.moveTo(178.35f, 158.11f);
        pathBuilder.arcToRelative(73.67f, 73.67f, 0.0f, false, true, -100.7f, 0.0f);
        pathBuilder.arcToRelative(49.53f, 49.53f, 0.0f, false, true, -13.56f, -50.48f);
        pathBuilder.lineToRelative(0.74f, -2.51f);
        pathBuilder.curveToRelative(12.34f, -4.46f, 32.26f, -6.05f, 60.46f, 8.23f);
        pathBuilder.curveToRelative(11.0f, 5.55f, 28.65f, 12.64f, 47.52f, 12.64f);
        pathBuilder.arcTo(65.56f, 65.56f, 0.0f, false, false, 194.0f, 122.62f);
        pathBuilder.arcTo(49.22f, 49.22f, 0.0f, false, true, 178.35f, 158.11f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
