package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cherries.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Cherries", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCherries", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cherries", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CherriesKt {
    private static ImageVector _cherries;

    public static final ImageVector getCherries(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 144.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, -99.78f, 53.07f);
        pathBuilder.lineToRelative(0.0f, -0.07f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, true, -16.39f, -90.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 240.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 72.0f);
        pathBuilder2.arcToRelative(71.5f, 71.5f, 0.0f, false, false, -7.76f, 0.43f);
        pathBuilder2.arcToRelative(91.77f, 91.77f, 0.0f, false, false, -21.62f, -25.11f);
        pathBuilder2.curveTo(108.78f, 16.79f, 57.05f, 23.77f, 54.87f, 24.08f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.31f, 14.58f);
        pathBuilder2.curveToRelative(17.5f, 11.66f, 25.51f, 31.0f, 28.85f, 49.74f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, true, false, 142.0f, 207.5f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, true, false, 176.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.0f, 39.37f);
        pathBuilder2.curveToRelative(16.67f, 0.72f, 41.24f, 4.78f, 60.64f, 20.48f);
        pathBuilder2.arcToRelative(75.28f, 75.28f, 0.0f, false, true, 15.0f, 16.4f);
        pathBuilder2.arcTo(72.2f, 72.2f, 0.0f, false, false, 121.9f, 96.5f);
        pathBuilder2.arcToRelative(71.46f, 71.46f, 0.0f, false, false, -25.23f, -8.0f);
        pathBuilder2.curveTo(93.54f, 68.59f, 86.56f, 52.0f, 76.0f, 39.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 216.0f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -5.76f, -111.7f);
        pathBuilder2.arcToRelative(176.49f, 176.49f, 0.0f, false, true, -1.0f, 31.08f);
        pathBuilder2.curveToRelative(-7.58f, -1.43f, -11.35f, -4.85f, -11.55f, -5.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f);
        pathBuilder2.curveTo(59.4f, 142.71f, 69.2f, 152.0f, 87.92f, 152.0f);
        pathBuilder2.horizontalLineToRelative(0.25f);
        pathBuilder2.curveToRelative(18.66f, -0.05f, 28.43f, -9.28f, 29.49f, -10.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder2.arcToRelative(22.31f, 22.31f, 0.0f, false, true, -8.93f, 4.44f);
        pathBuilder2.arcTo(190.36f, 190.36f, 0.0f, false, false, 98.34f, 105.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 88.0f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(145.0f, 116.11f);
        pathBuilder2.arcToRelative(72.27f, 72.27f, 0.0f, false, false, -9.82f, -10.42f);
        pathBuilder2.arcToRelative(56.15f, 56.15f, 0.0f, false, true, 24.22f, -15.16f);
        pathBuilder2.arcTo(110.84f, 110.84f, 0.0f, false, true, 167.0f, 118.88f);
        pathBuilder2.curveToRelative(-6.09f, -1.6f, -9.16f, -4.37f, -9.33f, -4.54f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 145.0f, 116.11f);
        pathBuilder2.close();
        pathBuilder2.moveTo(176.0f, 200.0f);
        pathBuilder2.arcToRelative(55.76f, 55.76f, 0.0f, false, true, -24.69f, -5.73f);
        pathBuilder2.arcToRelative(71.83f, 71.83f, 0.0f, false, false, 2.5f, -63.42f);
        pathBuilder2.arcTo(47.47f, 47.47f, 0.0f, false, false, 175.67f, 136.0f);
        pathBuilder2.lineTo(176.0f, 136.0f);
        pathBuilder2.curveToRelative(18.77f, 0.0f, 28.6f, -9.28f, 29.66f, -10.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder2.curveToRelative(-0.19f, 0.19f, -3.84f, 3.49f, -11.15f, 5.0f);
        pathBuilder2.arcTo(131.66f, 131.66f, 0.0f, false, false, 175.7f, 88.0f);
        pathBuilder2.horizontalLineToRelative(0.3f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cherries = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
