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

/* compiled from: Funnel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Funnel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFunnel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_funnel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FunnelKt {
    private static ImageVector _funnel;

    public static final ImageVector getFunnel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _funnel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Funnel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.77f, 50.34f);
        pathBuilder.arcTo(13.8f, 13.8f, 0.0f, false, false, 216.0f, 42.0f);
        pathBuilder.lineTo(40.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 29.67f, 65.42f);
        pathBuilder.lineToRelative(0.06f, 0.07f);
        pathBuilder.lineTo(98.0f, 138.38f);
        pathBuilder.lineTo(98.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 21.77f, 11.64f);
        pathBuilder.lineToRelative(32.0f, -21.33f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 158.0f, 194.66f);
        pathBuilder.lineTo(158.0f, 138.38f);
        pathBuilder.lineToRelative(68.33f, -73.0f);
        pathBuilder.arcTo(13.82f, 13.82f, 0.0f, false, false, 228.77f, 50.34f);
        pathBuilder.close();
        pathBuilder.moveTo(217.51f, 57.28f);
        pathBuilder.lineTo(147.62f, 131.9f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 146.0f, 136.0f);
        pathBuilder.verticalLineToRelative(58.66f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.89f, 1.67f);
        pathBuilder.lineToRelative(-32.0f, 21.33f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 110.0f, 216.0f);
        pathBuilder.lineTo(110.0f, 136.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.62f, -4.1f);
        pathBuilder.lineTo(38.53f, 57.32f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f);
        pathBuilder.lineTo(216.0f, 54.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.83f, 1.19f);
        pathBuilder.arcTo(1.86f, 1.86f, 0.0f, false, true, 217.51f, 57.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _funnel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
