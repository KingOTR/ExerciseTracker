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

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getImage", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_image", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageKt {
    private static ImageVector _image;

    public static final ImageVector getImage(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _image;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Image", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.lineTo(216.0f, 214.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 54.0f);
        pathBuilder.lineTo(216.0f, 54.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.lineTo(218.0f, 163.57f);
        pathBuilder.lineTo(188.53f, 134.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineToRelative(-21.42f, 21.42f);
        pathBuilder.lineTo(101.9f, 110.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(38.0f, 154.2f);
        pathBuilder.lineTo(38.0f, 56.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 40.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 200.0f);
        pathBuilder.lineTo(38.0f, 171.17f);
        pathBuilder.lineToRelative(52.58f, -52.58f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f);
        pathBuilder.lineTo(176.83f, 202.0f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 202.0f);
        pathBuilder.lineTo(193.8f, 202.0f);
        pathBuilder.lineToRelative(-38.0f, -38.0f);
        pathBuilder.lineToRelative(21.41f, -21.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.83f, 0.0f);
        pathBuilder.lineToRelative(38.0f, 38.0f);
        pathBuilder.lineTo(218.04f, 200.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 100.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, 10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 146.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _image = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
