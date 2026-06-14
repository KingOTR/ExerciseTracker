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

/* compiled from: Tilde.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tilde", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTilde", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tilde", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TildeKt {
    private static ImageVector _tilde;

    public static final ImageVector getTilde(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(219.12f, 128.09f);
        pathBuilder.curveToRelative(-13.82f, 17.18f, -27.26f, 26.24f, -41.11f, 27.7f);
        pathBuilder.arcToRelative(38.9f, 38.9f, 0.0f, false, true, -4.0f, 0.21f);
        pathBuilder.curveToRelative(-18.0f, 0.0f, -33.48f, -12.64f, -48.53f, -24.9f);
        pathBuilder.curveToRelative(-15.57f, -12.68f, -30.29f, -24.66f, -46.64f, -22.93f);
        pathBuilder.curveToRelative(-11.62f, 1.22f, -23.3f, 9.32f, -35.71f, 24.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.24f, -5.0f);
        pathBuilder.curveTo(50.7f, 110.73f, 64.14f, 101.67f, 78.0f, 100.21f);
        pathBuilder.curveToRelative(19.67f, -2.08f, 36.38f, 11.53f, 52.54f, 24.69f);
        pathBuilder.curveToRelative(15.57f, 12.68f, 30.29f, 24.66f, 46.64f, 22.93f);
        pathBuilder.curveToRelative(11.62f, -1.22f, 23.3f, -9.32f, 35.71f, -24.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.24f, 5.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tilde = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
