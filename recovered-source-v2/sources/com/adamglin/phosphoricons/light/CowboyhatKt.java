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

/* compiled from: Cowboyhat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CowboyHat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCowboyHat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cowboyHat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CowboyhatKt {
    private static ImageVector _cowboyHat;

    public static final ImageVector getCowboyHat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _cowboyHat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CowboyHat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.09f, 2.82f);
        pathBuilder.arcToRelative(176.66f, 176.66f, 0.0f, false, true, -16.69f, 22.65f);
        pathBuilder.lineToRelative(-17.87f, -94.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.5f, -8.35f);
        pathBuilder.lineToRelative(-0.1f, 0.08f);
        pathBuilder.lineTo(129.22f, 65.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.44f, 0.0f);
        pathBuilder.lineTo(102.25f, 45.16f);
        pathBuilder.lineToRelative(-0.1f, -0.08f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -22.5f, 8.34f);
        pathBuilder.lineTo(61.77f, 147.49f);
        pathBuilder.arcToRelative(178.33f, 178.33f, 0.0f, false, true, -16.68f, -22.67f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 122.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 76.0f);
        pathBuilder.lineTo(216.0f, 198.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, -76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.44f, 55.65f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.18f, -1.22f);
        pathBuilder.lineToRelative(24.54f, 20.43f);
        pathBuilder.lineToRelative(0.09f, 0.08f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 17.5f, 0.0f);
        pathBuilder.lineToRelative(0.09f, -0.08f);
        pathBuilder.lineToRelative(24.54f, -20.43f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.18f, 1.23f);
        pathBuilder.lineTo(178.69f, 130.0f);
        pathBuilder.lineTo(77.31f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 186.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -3.17f, -51.81f);
        pathBuilder.curveTo(54.5f, 161.44f, 73.53f, 177.05f, 89.62f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 186.0f);
        pathBuilder.curveToRelative(-0.34f, 0.0f, -26.71f, -0.41f, -56.0f, -27.91f);
        pathBuilder.lineTo(75.0f, 142.0f);
        pathBuilder.lineTo(181.0f, 142.0f);
        pathBuilder.lineTo(184.0f, 158.05f);
        pathBuilder.arcToRelative(115.79f, 115.79f, 0.0f, false, true, -28.89f, 20.19f);
        pathBuilder.curveTo(139.38f, 185.81f, 128.08f, 186.0f, 128.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 186.0f);
        pathBuilder.lineTo(166.38f, 186.0f);
        pathBuilder.curveToRelative(16.09f, -8.95f, 35.12f, -24.56f, 52.79f, -51.81f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 216.0f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cowboyHat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
