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

/* compiled from: Flag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlag", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(45.39f, 53.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.39f, 3.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(177.87f);
        pathBuilder.curveToRelative(29.41f, -24.39f, 55.08f, -11.69f, 82.23f, 1.73f);
        pathBuilder.curveToRelative(16.5f, 8.17f, 33.33f, 16.5f, 51.13f, 16.5f);
        pathBuilder.curveToRelative(13.14f, 0.0f, 26.81f, -4.55f, 41.26f, -17.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, -3.0f);
        pathBuilder.verticalLineToRelative(-120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.62f, -3.0f);
        pathBuilder.curveToRelative(-30.0f, 26.0f, -56.0f, 13.07f, -83.61f, -0.57f);
        pathBuilder.curveTo(109.07f, 38.28f, 79.4f, 23.62f, 45.39f, 53.06f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 174.17f);
        pathBuilder.curveToRelative(-29.41f, 24.4f, -55.08f, 11.7f, -82.23f, -1.73f);
        pathBuilder.curveToRelative(-26.82f, -13.27f, -54.5f, -27.0f, -85.77f, -4.66f);
        pathBuilder.verticalLineTo(57.92f);
        pathBuilder.curveToRelative(29.41f, -24.4f, 55.08f, -11.7f, 82.23f, 1.73f);
        pathBuilder.curveToRelative(26.82f, 13.27f, 54.5f, 27.0f, 85.77f, 4.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
