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

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pentagram;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagram", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.29f, 91.67f);
        pathBuilder.arcTo(13.8f, 13.8f, 0.0f, false, false, 224.0f, 82.0f);
        pathBuilder.lineTo(161.48f, 82.0f);
        pathBuilder.lineTo(141.33f, 19.87f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, -26.64f, -0.05f);
        pathBuilder.lineTo(94.51f, 82.0f);
        pathBuilder.lineTo(32.0f, 82.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.21f, 25.35f);
        pathBuilder.lineToRelative(50.65f, 36.44f);
        pathBuilder.lineTo(55.05f, 203.63f);
        pathBuilder.arcToRelative(13.78f, 13.78f, 0.0f, false, false, 5.09f, 15.64f);
        pathBuilder.arcToRelative(13.77f, 13.77f, 0.0f, false, false, 16.43f, 0.0f);
        pathBuilder.lineToRelative(51.43f, -37.0f);
        pathBuilder.lineToRelative(51.41f, 37.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 201.0f, 203.63f);
        pathBuilder.lineToRelative(-19.42f, -59.85f);
        pathBuilder.lineToRelative(50.67f, -36.46f);
        pathBuilder.arcTo(13.79f, 13.79f, 0.0f, false, false, 237.29f, 91.67f);
        pathBuilder.close();
        pathBuilder.moveTo(126.11f, 23.49f);
        pathBuilder.arcToRelative(1.94f, 1.94f, 0.0f, false, true, 3.79f, 0.0f);
        pathBuilder.lineToRelative(19.0f, 58.46f);
        pathBuilder.lineTo(107.13f, 81.95f);
        pathBuilder.close();
        pathBuilder.moveTo(30.85f, 97.61f);
        pathBuilder.arcToRelative(1.86f, 1.86f, 0.0f, false, true, -0.73f, -2.23f);
        pathBuilder.arcTo(1.88f, 1.88f, 0.0f, false, true, 32.0f, 94.0f);
        pathBuilder.lineTo(90.62f, 94.0f);
        pathBuilder.lineToRelative(-12.26f, 37.8f);
        pathBuilder.close();
        pathBuilder.moveTo(69.54f, 209.61f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.08f, -2.24f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(18.23f, -56.2f);
        pathBuilder.lineToRelative(33.0f, 23.77f);
        pathBuilder.close();
        pathBuilder.moveTo(88.54f, 139.19f);
        pathBuilder.lineTo(103.24f, 94.0f);
        pathBuilder.horizontalLineToRelative(49.52f);
        pathBuilder.lineToRelative(14.65f, 45.16f);
        pathBuilder.lineTo(128.0f, 167.51f);
        pathBuilder.close();
        pathBuilder.moveTo(189.49f, 207.37f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.1f, 2.22f);
        pathBuilder.lineTo(138.27f, 174.9f);
        pathBuilder.lineToRelative(33.0f, -23.77f);
        pathBuilder.close();
        pathBuilder.moveTo(225.17f, 97.59f);
        pathBuilder.lineToRelative(-47.53f, 34.2f);
        pathBuilder.lineTo(165.38f, 94.0f);
        pathBuilder.lineTo(224.0f, 94.0f);
        pathBuilder.arcToRelative(1.86f, 1.86f, 0.0f, false, true, 1.9f, 1.39f);
        pathBuilder.arcTo(1.83f, 1.83f, 0.0f, false, true, 225.17f, 97.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
