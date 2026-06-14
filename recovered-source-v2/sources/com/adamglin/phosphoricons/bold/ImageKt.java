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

/* compiled from: Image.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Image", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getImage", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_image", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageKt {
    private static ImageVector _image;

    public static final ImageVector getImage(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(144.0f, 96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 56.0f);
        pathBuilder.lineTo(236.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(40.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(20.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 36.0f);
        pathBuilder.lineTo(216.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 60.0f);
        pathBuilder.verticalLineToRelative(79.72f);
        pathBuilder.lineToRelative(33.86f, -33.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f);
        pathBuilder.lineTo(147.31f, 147.0f);
        pathBuilder.lineToRelative(17.18f, -17.17f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f);
        pathBuilder.lineTo(212.0f, 149.09f);
        pathBuilder.lineTo(212.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 196.0f);
        pathBuilder.lineTo(162.34f, 196.0f);
        pathBuilder.lineTo(92.0f, 125.66f);
        pathBuilder.lineToRelative(-48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 196.0f);
        pathBuilder.lineTo(212.0f, 183.0f);
        pathBuilder.lineToRelative(-33.37f, -33.37f);
        pathBuilder.lineTo(164.28f, 164.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _image = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
