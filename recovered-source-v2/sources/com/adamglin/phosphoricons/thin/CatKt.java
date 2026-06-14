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

/* compiled from: Cat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCat", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatKt {
    private static ImageVector _cat;

    public static final ImageVector getCat(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Cat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.59f, 36.94f);
        pathBuilder.arcToRelative(11.83f, 11.83f, 0.0f, false, false, -13.08f, 2.61f);
        pathBuilder.lineToRelative(-0.19f, 0.2f);
        pathBuilder.lineTo(187.77f, 62.24f);
        pathBuilder.arcToRelative(107.1f, 107.1f, 0.0f, false, false, -119.54f, 0.0f);
        pathBuilder.lineTo(48.68f, 39.75f);
        pathBuilder.lineToRelative(-0.19f, -0.2f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 48.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.curveToRelative(0.0f, 50.72f, 44.86f, 92.0f, 100.0f, 92.0f);
        pathBuilder.reflectiveCurveToRelative(100.0f, -41.27f, 100.0f, -92.0f);
        pathBuilder.lineTo(228.0f, 48.0f);
        pathBuilder.arcTo(11.82f, 11.82f, 0.0f, false, false, 220.59f, 36.94f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 45.09f, -39.12f, 82.0f, -88.0f, 83.91f);
        pathBuilder.lineTo(132.0f, 193.66f);
        pathBuilder.lineToRelative(14.83f, -14.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.65f);
        pathBuilder.lineTo(128.0f, 186.35f);
        pathBuilder.lineToRelative(-13.17f, -13.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, 5.65f);
        pathBuilder.lineTo(124.0f, 193.66f);
        pathBuilder.verticalLineToRelative(26.26f);
        pathBuilder.curveTo(75.12f, 218.0f, 36.0f, 181.1f, 36.0f, 136.0f);
        pathBuilder.lineTo(36.0f, 48.0f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 2.47f, -3.7f);
        pathBuilder.arcToRelative(4.39f, 4.39f, 0.0f, false, true, 1.6f, -0.31f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, 2.67f, 1.1f);
        pathBuilder.lineTo(64.58f, 70.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, 0.59f);
        pathBuilder.arcTo(94.0f, 94.0f, 0.0f, false, true, 92.0f, 58.74f);
        pathBuilder.lineTo(92.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(100.0f, 56.0f);
        pathBuilder.arcToRelative(100.07f, 100.07f, 0.0f, false, true, 24.0f, -3.93f);
        pathBuilder.lineTo(124.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(132.0f, 52.09f);
        pathBuilder.arcTo(100.07f, 100.07f, 0.0f, false, true, 156.0f, 56.0f);
        pathBuilder.lineTo(156.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(164.0f, 58.74f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, true, 22.0f, 12.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.4f, -0.59f);
        pathBuilder.lineToRelative(21.84f, -25.11f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
