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

/* compiled from: Imagessquare.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ImagesSquare", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getImagesSquare", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_imagesSquare", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagessquareKt {
    private static ImageVector _imagesSquare;

    public static final ImageVector getImagesSquare(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _imagesSquare;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ImagesSquare", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 34.0f);
        pathBuilder.lineTo(80.0f, 34.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 66.0f, 48.0f);
        pathBuilder.lineTo(66.0f, 66.0f);
        pathBuilder.lineTo(48.0f, 66.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 80.0f);
        pathBuilder.lineTo(34.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(176.0f, 222.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(190.0f, 190.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(222.0f, 48.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.0f, 48.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(208.0f, 46.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(74.2f);
        pathBuilder.lineToRelative(-20.1f, -20.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(94.2f, 178.0f);
        pathBuilder.lineTo(80.0f, 178.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 208.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(48.0f, 210.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(46.0f, 80.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(66.0f, 78.0f);
        pathBuilder.verticalLineToRelative(98.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 178.0f);
        pathBuilder.lineTo(111.17f, 178.0f);
        pathBuilder.lineToRelative(67.41f, -67.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineTo(210.0f, 139.17f);
        pathBuilder.lineTo(210.0f, 176.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 110.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, true, false, 98.0f, 88.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 120.0f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 78.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 120.0f, 78.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _imagesSquare = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
