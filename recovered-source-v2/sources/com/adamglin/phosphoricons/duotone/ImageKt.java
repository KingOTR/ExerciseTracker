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

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getImage", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_image", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageKt {
    private static ImageVector _image;

    public static final ImageVector getImage(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 56.0f);
        pathBuilder.verticalLineTo(178.06f);
        pathBuilder.lineToRelative(-39.72f, -39.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f);
        pathBuilder.lineTo(147.31f, 164.0f);
        pathBuilder.lineTo(97.66f, 114.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f);
        pathBuilder.lineTo(32.0f, 168.69f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 40.0f);
        pathBuilder2.lineTo(40.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder2.lineTo(24.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(216.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(232.0f, 56.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 56.0f);
        pathBuilder2.lineTo(216.0f, 158.75f);
        pathBuilder2.lineToRelative(-26.07f, -26.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder2.lineToRelative(-20.0f, 20.0f);
        pathBuilder2.lineToRelative(-44.0f, -44.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f);
        pathBuilder2.lineTo(40.0f, 149.37f);
        pathBuilder2.lineTo(40.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 172.0f);
        pathBuilder2.lineToRelative(52.0f, -52.0f);
        pathBuilder2.lineToRelative(80.0f, 80.0f);
        pathBuilder2.lineTo(40.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 200.0f);
        pathBuilder2.lineTo(194.63f, 200.0f);
        pathBuilder2.lineToRelative(-36.0f, -36.0f);
        pathBuilder2.lineToRelative(20.0f, -20.0f);
        pathBuilder2.lineTo(216.0f, 181.38f);
        pathBuilder2.lineTo(216.0f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 100.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 144.0f, 100.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _image = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
