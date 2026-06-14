package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tilde.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tilde", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTilde", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tilde", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TildeKt {
    private static ImageVector _tilde;

    public static final ImageVector getTilde(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(222.23f, 130.59f);
        pathBuilder.curveToRelative(-14.51f, 18.0f, -28.84f, 27.6f, -43.8f, 29.17f);
        pathBuilder.arcToRelative(43.0f, 43.0f, 0.0f, false, true, -4.5f, 0.24f);
        pathBuilder.curveToRelative(-19.3f, 0.0f, -35.39f, -13.1f, -51.0f, -25.8f);
        pathBuilder.curveToRelative(-14.91f, -12.14f, -29.0f, -23.61f, -43.7f, -22.0f);
        pathBuilder.curveToRelative(-10.51f, 1.1f, -21.31f, 8.72f, -33.0f, 23.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.46f, -10.0f);
        pathBuilder.curveToRelative(14.51f, -18.0f, 28.84f, -27.6f, 43.8f, -29.17f);
        pathBuilder.curveToRelative(21.32f, -2.25f, 38.69f, 11.89f, 55.48f, 25.56f);
        pathBuilder.curveToRelative(14.91f, 12.14f, 29.0f, 23.62f, 43.7f, 22.0f);
        pathBuilder.curveToRelative(10.51f, -1.1f, 21.31f, -8.72f, 33.0f, -23.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.46f, 10.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tilde = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
