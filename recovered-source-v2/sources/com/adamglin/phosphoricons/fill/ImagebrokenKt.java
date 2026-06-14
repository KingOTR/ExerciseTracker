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

/* compiled from: Imagebroken.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ImageBroken", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getImageBroken", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_imageBroken", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagebrokenKt {
    private static ImageVector _imageBroken;

    public static final ImageVector getImageBroken(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _imageBroken;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ImageBroken", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.lineTo(24.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.59f, -5.47f);
        pathBuilder.lineToRelative(14.83f, -44.48f);
        pathBuilder.lineTo(163.0f, 151.43f);
        pathBuilder.arcToRelative(8.07f, 8.07f, 0.0f, false, false, 4.46f, -4.46f);
        pathBuilder.lineToRelative(14.62f, -36.55f);
        pathBuilder.lineToRelative(44.48f, -14.83f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 88.0f);
        pathBuilder.lineTo(232.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(117.0f, 152.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.62f, 4.9f);
        pathBuilder.lineTo(98.23f, 200.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 160.69f);
        pathBuilder.lineToRelative(46.34f, -46.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(32.84f, 32.84f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 121.73f);
        pathBuilder.lineTo(232.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(137.73f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.59f, -10.53f);
        pathBuilder.lineToRelative(7.94f, -23.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.61f, -4.9f);
        pathBuilder.lineToRelative(35.77f, -14.31f);
        pathBuilder.lineToRelative(14.31f, -35.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.9f, -4.61f);
        pathBuilder.lineToRelative(23.8f, -7.94f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 121.73f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _imageBroken = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
