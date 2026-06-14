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

/* compiled from: Flagcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlagCheckered", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagcheckeredKt {
    private static ImageVector _flagCheckered;

    public static final ImageVector getFlagCheckered(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _flagCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.0f, 45.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.85f, 1.84f);
        pathBuilder.curveToRelative(-24.71f, 21.41f, -44.53f, 13.31f, -74.82f, -1.68f);
        pathBuilder.curveTo(113.19f, 31.27f, 78.17f, 13.94f, 40.14f, 46.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f);
        pathBuilder.lineTo(36.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(60.0f, 181.71f);
        pathBuilder.curveToRelative(22.84f, -17.13f, 42.1f, -9.11f, 70.68f, 5.0f);
        pathBuilder.curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f);
        pathBuilder.curveToRelative(14.72f, 0.0f, 30.28f, -4.94f, 46.38f, -18.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 176.0f);
        pathBuilder.lineTo(236.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 229.0f, 45.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.48f, 83.91f);
        pathBuilder.arcTo(63.0f, 63.0f, 0.0f, false, false, 212.0f, 78.08f);
        pathBuilder.verticalLineToRelative(32.15f);
        pathBuilder.curveToRelative(-11.0f, 8.26f, -21.2f, 10.67f, -32.0f, 9.37f);
        pathBuilder.lineTo(180.0f, 83.66f);
        pathBuilder.curveTo(181.81f, 83.81f, 183.64f, 83.91f, 185.48f, 83.91f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 78.08f);
        pathBuilder.verticalLineToRelative(34.09f);
        pathBuilder.curveToRelative(-4.64f, -2.0f, -9.5f, -4.4f, -14.68f, -7.0f);
        pathBuilder.arcTo(255.21f, 255.21f, 0.0f, false, false, 116.0f, 93.83f);
        pathBuilder.lineTo(116.0f, 59.75f);
        pathBuilder.curveToRelative(4.64f, 2.0f, 9.5f, 4.4f, 14.68f, 7.0f);
        pathBuilder.arcTo(252.91f, 252.91f, 0.0f, false, false, 156.0f, 78.08f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 52.32f);
        pathBuilder.lineTo(92.0f, 88.24f);
        pathBuilder.arcToRelative(63.33f, 63.33f, 0.0f, false, false, -32.0f, 5.61f);
        pathBuilder.lineTo(60.0f, 61.68f);
        pathBuilder.curveTo(71.0f, 53.42f, 81.2f, 51.0f, 92.0f, 52.32f);
        pathBuilder.close();
        pathBuilder.moveTo(86.52f, 148.0f);
        pathBuilder.arcTo(63.0f, 63.0f, 0.0f, false, false, 60.0f, 153.86f);
        pathBuilder.lineTo(60.0f, 121.7f);
        pathBuilder.curveToRelative(11.0f, -8.25f, 21.2f, -10.66f, 32.0f, -9.36f);
        pathBuilder.verticalLineToRelative(35.94f);
        pathBuilder.curveTo(90.19f, 148.13f, 88.36f, 148.0f, 86.52f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 153.86f);
        pathBuilder.lineTo(116.0f, 119.77f);
        pathBuilder.curveToRelative(4.64f, 2.0f, 9.5f, 4.4f, 14.68f, 7.0f);
        pathBuilder.arcTo(252.91f, 252.91f, 0.0f, false, false, 156.0f, 138.1f);
        pathBuilder.verticalLineToRelative(34.09f);
        pathBuilder.curveToRelative(-4.64f, -2.05f, -9.5f, -4.4f, -14.68f, -7.0f);
        pathBuilder.arcTo(250.66f, 250.66f, 0.0f, false, false, 116.0f, 153.86f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 179.62f);
        pathBuilder.lineTo(180.0f, 143.68f);
        pathBuilder.curveToRelative(1.81f, 0.14f, 3.64f, 0.24f, 5.48f, 0.24f);
        pathBuilder.arcTo(62.85f, 62.85f, 0.0f, false, false, 212.0f, 138.07f);
        pathBuilder.verticalLineToRelative(32.19f);
        pathBuilder.curveTo(201.0f, 178.52f, 190.8f, 180.92f, 180.0f, 179.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
