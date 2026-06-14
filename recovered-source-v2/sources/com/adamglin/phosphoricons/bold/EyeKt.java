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

/* compiled from: Eye.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eye", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEye", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eye", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeKt {
    private static ImageVector _eye;

    public static final ImageVector getEye(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eye;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eye", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.0f, 123.13f);
        pathBuilder.curveToRelative(-0.37f, -0.81f, -9.13f, -20.26f, -28.48f, -39.61f);
        pathBuilder.curveTo(196.63f, 57.67f, 164.0f, 44.0f, 128.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(59.37f, 57.67f, 33.51f, 83.52f);
        pathBuilder.curveTo(14.16f, 102.87f, 5.4f, 122.32f, 5.0f, 123.13f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 0.0f, 9.75f);
        pathBuilder.curveToRelative(0.37f, 0.82f, 9.13f, 20.26f, 28.49f, 39.61f);
        pathBuilder.curveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(68.63f, -13.66f, 94.48f, -39.51f);
        pathBuilder.curveToRelative(19.36f, -19.35f, 28.12f, -38.79f, 28.49f, -39.61f);
        pathBuilder.arcTo(12.08f, 12.08f, 0.0f, false, false, 251.0f, 123.13f);
        pathBuilder.close();
        pathBuilder.moveTo(204.94f, 156.13f);
        pathBuilder.curveTo(183.47f, 177.27f, 157.59f, 188.0f, 128.0f, 188.0f);
        pathBuilder.reflectiveCurveToRelative(-55.47f, -10.73f, -76.91f, -31.88f);
        pathBuilder.arcTo(130.36f, 130.36f, 0.0f, false, true, 29.52f, 128.0f);
        pathBuilder.arcTo(130.45f, 130.45f, 0.0f, false, true, 51.09f, 99.89f);
        pathBuilder.curveTo(72.54f, 78.73f, 98.41f, 68.0f, 128.0f, 68.0f);
        pathBuilder.reflectiveCurveToRelative(55.46f, 10.73f, 76.91f, 31.89f);
        pathBuilder.arcTo(130.36f, 130.36f, 0.0f, false, true, 226.48f, 128.0f);
        pathBuilder.arcTo(130.45f, 130.45f, 0.0f, false, true, 204.91f, 156.12f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eye = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
