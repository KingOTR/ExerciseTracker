package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cherries.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cherries", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCherries", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cherries", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CherriesKt {
    private static ImageVector _cherries;

    public static final ImageVector getCherries(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cherries;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cherries", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.42f, 72.0f);
        pathBuilder.arcToRelative(75.24f, 75.24f, 0.0f, false, false, -10.21f, 0.37f);
        pathBuilder.arcToRelative(91.9f, 91.9f, 0.0f, false, false, -21.59f, -25.09f);
        pathBuilder.curveTo(108.78f, 16.79f, 57.05f, 23.77f, 54.87f, 24.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 31.43f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, false, 3.69f, 7.32f);
        pathBuilder.curveToRelative(17.4f, 11.68f, 25.37f, 30.91f, 28.7f, 49.65f);
        pathBuilder.arcToRelative(72.08f, 72.08f, 0.0f, true, false, 16.26f, 0.14f);
        pathBuilder.curveTo(93.54f, 68.59f, 86.56f, 52.0f, 76.0f, 39.37f);
        pathBuilder.curveToRelative(16.67f, 0.72f, 41.24f, 4.78f, 60.64f, 20.48f);
        pathBuilder.arcToRelative(74.76f, 74.76f, 0.0f, false, true, 15.0f, 16.39f);
        pathBuilder.curveToRelative(-1.9f, 0.69f, -3.79f, 1.44f, -5.65f, 2.29f);
        pathBuilder.arcToRelative(8.42f, 8.42f, 0.0f, false, false, -4.49f, 4.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.41f, 9.0f);
        pathBuilder.arcToRelative(88.9f, 88.9f, 0.0f, false, true, 13.59f, 14.0f);
        pathBuilder.arcToRelative(3.64f, 3.64f, 0.0f, false, false, 0.65f, 0.65f);
        pathBuilder.curveTo(160.0f, 108.15f, 165.83f, 112.0f, 176.0f, 112.0f);
        pathBuilder.curveToRelative(12.15f, 0.0f, 18.18f, -5.51f, 18.43f, -5.75f);
        pathBuilder.lineToRelative(-0.09f, 0.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.32f, 11.32f);
        pathBuilder.curveTo(204.6f, 118.72f, 194.77f, 128.0f, 176.0f, 128.0f);
        pathBuilder.lineToRelative(-1.61f, 0.0f);
        pathBuilder.arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 4.0f);
        pathBuilder.arcToRelative(87.91f, 87.91f, 0.0f, false, true, -7.0f, 71.6f);
        pathBuilder.arcToRelative(8.39f, 8.39f, 0.0f, false, false, -1.0f, 6.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 6.0f);
        pathBuilder.curveToRelative(1.78f, 0.13f, 3.59f, 0.2f, 5.37f, 0.2f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 2.42f, -144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.42f, 122.21f);
        pathBuilder.lineTo(106.33f, 122.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.curveTo(116.6f, 134.72f, 106.77f, 144.0f, 88.0f, 144.0f);
        pathBuilder.reflectiveCurveToRelative(-28.6f, -9.28f, -29.66f, -10.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineToRelative(-0.09f, -0.09f);
        pathBuilder.curveToRelative(0.25f, 0.24f, 6.28f, 5.75f, 18.43f, 5.75f);
        pathBuilder.reflectiveCurveTo(106.18f, 122.49f, 106.43f, 122.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cherries = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
