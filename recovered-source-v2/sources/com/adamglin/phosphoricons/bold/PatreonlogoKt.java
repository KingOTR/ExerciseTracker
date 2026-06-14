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

/* compiled from: Patreonlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PatreonLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPatreonLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_patreonLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatreonlogoKt {
    private static ImageVector _patreonLogo;

    public static final ImageVector getPatreonLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _patreonLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PatreonLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(188.88f, 28.29f);
        pathBuilder.curveToRelative(-19.47f, -8.0f, -42.59f, -10.29f, -65.11f, -6.54f);
        pathBuilder.curveToRelative(-24.28f, 4.0f, -45.33f, 14.53f, -60.88f, 30.34f);
        pathBuilder.curveTo(25.47f, 90.15f, 33.05f, 167.56f, 50.0f, 207.88f);
        pathBuilder.curveTo(56.87f, 224.36f, 69.0f, 244.0f, 87.51f, 244.0f);
        pathBuilder.curveToRelative(25.38f, 0.0f, 36.72f, -22.14f, 46.73f, -41.68f);
        pathBuilder.curveToRelative(6.73f, -13.14f, 13.69f, -26.74f, 24.23f, -33.89f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(5.49f, -3.72f, 13.22f, -6.7f, 21.41f, -9.86f);
        pathBuilder.curveToRelative(23.69f, -9.13f, 56.12f, -21.64f, 56.12f, -65.4f);
        pathBuilder.curveTo(236.0f, 64.19f, 218.82f, 40.54f, 188.88f, 28.29f);
        pathBuilder.close();
        pathBuilder.moveTo(171.24f, 136.18f);
        pathBuilder.curveToRelative(-9.08f, 3.5f, -18.48f, 7.13f, -26.24f, 12.39f);
        pathBuilder.curveToRelative(-15.63f, 10.6f, -24.39f, 27.71f, -32.13f, 42.81f);
        pathBuilder.curveTo(103.79f, 209.13f, 97.7f, 220.0f, 87.51f, 220.0f);
        pathBuilder.curveToRelative(-1.28f, 0.0f, -8.0f, -3.81f, -15.41f, -21.4f);
        pathBuilder.curveTo(57.48f, 163.75f, 51.89f, 97.51f, 80.0f, 68.91f);
        pathBuilder.curveToRelative(11.79f, -12.0f, 28.73f, -20.34f, 47.69f, -23.49f);
        pathBuilder.arcToRelative(104.37f, 104.37f, 0.0f, false, true, 17.0f, -1.39f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, true, 35.08f, 6.47f);
        pathBuilder.curveToRelative(12.0f, 4.92f, 32.21f, 17.0f, 32.21f, 42.67f);
        pathBuilder.curveTo(212.0f, 119.14f, 196.51f, 126.43f, 171.24f, 136.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _patreonLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
