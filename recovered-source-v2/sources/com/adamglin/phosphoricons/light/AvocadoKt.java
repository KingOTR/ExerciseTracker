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

/* compiled from: Avocado.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Avocado", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAvocado", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_avocado", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AvocadoKt {
    private static ImageVector _avocado;

    public static final ImageVector getAvocado(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _avocado;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Avocado", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 114.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f);
        pathBuilder.arcTo(46.06f, 46.06f, 0.0f, false, false, 128.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 194.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.1f, 131.32f);
        pathBuilder.lineTo(179.3f, 47.11f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 77.08f, 46.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(47.56f, 129.52f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, true, false, 161.54f, 1.8f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 234.0f);
        pathBuilder.arcTo(74.05f, 74.05f, 0.0f, false, true, 58.8f, 133.72f);
        pathBuilder.curveToRelative(0.0f, -0.05f, 0.0f, -0.09f, 0.05f, -0.13f);
        pathBuilder.lineTo(88.39f, 50.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 79.53f, 0.92f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.08f, 0.05f, 0.13f);
        pathBuilder.lineToRelative(29.82f, 84.28f);
        pathBuilder.arcTo(74.06f, 74.06f, 0.0f, false, true, 128.0f, 234.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _avocado = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
