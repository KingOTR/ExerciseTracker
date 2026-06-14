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

/* compiled from: Images.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Images", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getImages", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_images", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImagesKt {
    private static ImageVector _images;

    public static final ImageVector getImages(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _images;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Images", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 56.0f);
        pathBuilder.lineTo(236.0f, 160.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(204.0f, 180.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(40.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(20.0f, 88.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 68.0f);
        pathBuilder.lineTo(60.0f, 68.0f);
        pathBuilder.lineTo(60.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 36.0f);
        pathBuilder.lineTo(216.0f, 36.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 180.0f);
        pathBuilder.lineTo(80.0f, 180.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(60.0f, 92.0f);
        pathBuilder.lineTo(44.0f, 92.0f);
        pathBuilder.lineTo(44.0f, 196.0f);
        pathBuilder.lineTo(180.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.34f, 156.0f);
        pathBuilder.lineTo(124.0f, 121.66f);
        pathBuilder.lineTo(89.66f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 60.0f);
        pathBuilder.lineTo(84.0f, 60.0f);
        pathBuilder.verticalLineToRelative(67.72f);
        pathBuilder.lineToRelative(25.86f, -25.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f);
        pathBuilder.lineTo(192.28f, 156.0f);
        pathBuilder.lineTo(212.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _images = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
