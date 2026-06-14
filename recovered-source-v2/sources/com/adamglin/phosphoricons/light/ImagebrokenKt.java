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

/* compiled from: Imagebroken.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ImageBroken", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getImageBroken", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_imageBroken", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagebrokenKt {
    private static ImageVector _imageBroken;

    public static final ImageVector getImageBroken(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 42.0f);
        pathBuilder.lineTo(40.0f, 42.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 56.0f);
        pathBuilder.lineTo(26.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, -4.1f);
        pathBuilder.lineToRelative(15.12f, -45.36f);
        pathBuilder.lineToRelative(37.42f, -15.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.34f, -3.34f);
        pathBuilder.lineToRelative(15.0f, -37.42f);
        pathBuilder.lineTo(225.9f, 93.69f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 88.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(117.77f, 154.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.46f, 3.67f);
        pathBuilder.lineTo(99.68f, 202.0f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(38.0f, 171.17f);
        pathBuilder.lineToRelative(52.58f, -52.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineTo(126.0f, 151.15f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 83.68f);
        pathBuilder.lineTo(174.1f, 98.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.67f, 3.46f);
        pathBuilder.lineToRelative(-15.05f, 37.61f);
        pathBuilder.lineTo(138.1f, 146.3f);
        pathBuilder.lineToRelative(-36.2f, -36.2f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(38.0f, 154.2f);
        pathBuilder.lineTo(38.0f, 56.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(216.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.51f, 116.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.41f, -0.82f);
        pathBuilder.lineTo(198.3f, 124.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.67f, 3.47f);
        pathBuilder.lineTo(180.0f, 164.0f);
        pathBuilder.lineToRelative(-36.56f, 14.63f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 140.0f, 182.3f);
        pathBuilder.lineTo(132.0f, 206.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, 7.9f);
        pathBuilder.lineTo(216.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 121.73f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 227.51f, 116.86f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(146.06f, 202.0f);
        pathBuilder.lineToRelative(4.42f, -13.26f);
        pathBuilder.lineToRelative(36.37f, -14.55f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.34f, -3.34f);
        pathBuilder.lineToRelative(14.55f, -36.37f);
        pathBuilder.lineTo(218.0f, 130.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _imageBroken = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
