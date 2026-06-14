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

/* compiled from: Paintbucket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBucket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaintBucket", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBucket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbucketKt {
    private static ImageVector _paintBucket;

    public static final ImageVector getPaintBucket(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _paintBucket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBucket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.0f, 164.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.0f, 0.0f);
        pathBuilder.curveToRelative(-0.7f, 1.0f, -17.0f, 25.72f, -17.0f, 43.33f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 44.0f, 0.0f);
        pathBuilder.curveTo(254.0f, 190.39f, 237.69f, 165.71f, 237.0f, 164.67f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 218.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f);
        pathBuilder.curveToRelative(0.0f, -8.17f, 5.37f, -19.92f, 10.0f, -28.34f);
        pathBuilder.curveToRelative(4.63f, 8.41f, 10.0f, 20.15f, 10.0f, 28.34f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 232.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.9f, 137.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.34f, -9.94f);
        pathBuilder.lineTo(120.76f, 11.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 0.0f);
        pathBuilder.lineToRelative(-42.0f, 42.0f);
        pathBuilder.lineToRelative(-26.0f, -26.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.49f, 8.48f);
        pathBuilder.lineToRelative(26.0f, 26.0f);
        pathBuilder.lineTo(16.44f, 107.59f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 31.11f);
        pathBuilder.lineToRelative(84.86f, 84.86f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 31.11f, 0.0f);
        pathBuilder.lineToRelative(78.83f, -78.83f);
        pathBuilder.close();
        pathBuilder.moveTo(203.76f, 135.24f);
        pathBuilder.lineTo(123.93f, 215.07f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, -14.14f, 0.0f);
        pathBuilder.lineTo(24.93f, 130.21f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, -14.14f);
        pathBuilder.lineTo(70.25f, 70.75f);
        pathBuilder.lineToRelative(31.62f, 31.61f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 3.75f, 32.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 36.76f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -32.0f, -40.51f);
        pathBuilder.lineTo(78.74f, 62.26f);
        pathBuilder.lineToRelative(37.78f, -37.77f);
        pathBuilder.lineTo(220.89f, 128.86f);
        pathBuilder.lineToRelative(-14.79f, 4.93f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 203.76f, 135.24f);
        pathBuilder.close();
        pathBuilder.moveTo(114.1f, 106.11f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 0.0f, 19.82f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, true, 0.0f, -19.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBucket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
