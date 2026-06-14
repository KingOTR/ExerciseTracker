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

/* compiled from: Tilde.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tilde", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTilde", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tilde", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TildeKt {
    private static ImageVector _tilde;

    public static final ImageVector getTilde(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tilde;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tilde", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.68f, 129.34f);
        pathBuilder.curveToRelative(-14.17f, 17.62f, -28.06f, 26.92f, -42.46f, 28.44f);
        pathBuilder.arcTo(40.75f, 40.75f, 0.0f, false, true, 174.0f, 158.0f);
        pathBuilder.curveToRelative(-18.64f, 0.0f, -34.44f, -12.87f, -49.76f, -25.35f);
        pathBuilder.reflectiveCurveTo(94.57f, 108.51f, 79.0f, 110.16f);
        pathBuilder.curveToRelative(-11.06f, 1.16f, -22.3f, 9.0f, -34.36f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.36f, -7.52f);
        pathBuilder.curveToRelative(14.17f, -17.61f, 28.06f, -26.92f, 42.46f, -28.43f);
        pathBuilder.curveToRelative(20.52f, -2.18f, 37.54f, 11.7f, 54.0f, 25.12f);
        pathBuilder.curveTo(147.0f, 135.76f, 161.42f, 147.48f, 177.0f, 145.84f);
        pathBuilder.curveToRelative(11.06f, -1.16f, 22.3f, -9.0f, 34.36f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.36f, 7.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tilde = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
