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

/* compiled from: Bell.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bell", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBell", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bell", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellKt {
    private static ImageVector _bell;

    public static final ImageVector getBell(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bell;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bell", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.29f, 165.93f);
        pathBuilder.curveTo(216.61f, 151.0f, 212.0f, 129.57f, 212.0f, 104.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 25.58f, -4.59f, 47.0f, -13.27f, 61.93f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, false, 30.66f, 186.0f);
        pathBuilder.arcTo(19.77f, 19.77f, 0.0f, false, false, 48.0f, 196.0f);
        pathBuilder.horizontalLineTo(84.18f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 87.64f, 0.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(19.77f, 19.77f, 0.0f, false, false, 17.31f, -10.0f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, false, 225.29f, 165.93f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -19.6f, -16.0f);
        pathBuilder.horizontalLineToRelative(39.2f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.66f, 172.0f);
        pathBuilder.curveTo(63.51f, 154.0f, 68.0f, 131.14f, 68.0f, 104.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 120.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 27.13f, 4.48f, 50.0f, 13.33f, 68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bell = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
