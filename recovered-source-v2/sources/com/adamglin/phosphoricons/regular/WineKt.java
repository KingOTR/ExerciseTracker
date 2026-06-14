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

/* compiled from: Wine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWine", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WineKt {
    private static ImageVector _wine;

    public static final ImageVector getWine(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _wine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(205.33f, 103.67f);
        pathBuilder.lineTo(183.56f, 29.74f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 175.89f, 24.0f);
        pathBuilder.horizontalLineTo(80.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.67f, 5.74f);
        pathBuilder.lineTo(50.67f, 103.67f);
        pathBuilder.arcToRelative(63.46f, 63.46f, 0.0f, false, false, 17.42f, 64.67f);
        pathBuilder.arcTo(87.39f, 87.39f, 0.0f, false, false, 120.0f, 191.63f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineTo(191.63f);
        pathBuilder.arcToRelative(87.41f, 87.41f, 0.0f, false, false, 51.91f, -23.29f);
        pathBuilder.arcTo(63.46f, 63.46f, 0.0f, false, false, 205.33f, 103.67f);
        pathBuilder.close();
        pathBuilder.moveTo(86.09f, 40.0f);
        pathBuilder.horizontalLineToRelative(83.82f);
        pathBuilder.lineTo(190.0f, 108.19f);
        pathBuilder.curveToRelative(0.09f, 0.3f, 0.17f, 0.6f, 0.25f, 0.9f);
        pathBuilder.curveToRelative(-21.42f, 7.68f, -45.54f, -1.6f, -58.63f, -8.23f);
        pathBuilder.curveTo(106.43f, 88.11f, 86.43f, 86.49f, 71.68f, 88.93f);
        pathBuilder.close();
        pathBuilder.moveTo(177.0f, 156.65f);
        pathBuilder.arcToRelative(71.69f, 71.69f, 0.0f, false, true, -98.0f, 0.0f);
        pathBuilder.arcToRelative(47.55f, 47.55f, 0.0f, false, true, -13.0f, -48.46f);
        pathBuilder.lineToRelative(0.45f, -1.52f);
        pathBuilder.curveToRelative(12.0f, -4.06f, 31.07f, -5.14f, 57.93f, 8.47f);
        pathBuilder.curveToRelative(11.15f, 5.65f, 29.16f, 12.85f, 48.43f, 12.85f);
        pathBuilder.arcToRelative(68.64f, 68.64f, 0.0f, false, false, 19.05f, -2.6f);
        pathBuilder.arcTo(47.2f, 47.2f, 0.0f, false, true, 177.0f, 156.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
