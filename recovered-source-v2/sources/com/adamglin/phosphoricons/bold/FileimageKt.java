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

/* compiled from: Fileimage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileImage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFileImage", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileImage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileimageKt {
    private static ImageVector _fileImage;

    public static final ImageVector getFileImage(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _fileImage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileImage", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(114.0f, 145.34f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.0f, 0.0f);
        pathBuilder.lineTo(79.0f, 167.82f);
        pathBuilder.lineTo(72.3f, 157.73f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.07f, 0.17f);
        pathBuilder.lineTo(13.91f, 217.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 24.0f, 236.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -18.66f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 212.0f);
        pathBuilder.lineTo(62.5f, 186.3f);
        pathBuilder.lineToRelative(6.55f, 9.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.0f, 0.0f);
        pathBuilder.lineToRelative(15.0f, -22.48f);
        pathBuilder.lineTo(129.58f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.49f, 79.51f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.verticalLineTo(92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineTo(212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.51f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 57.0f);
        pathBuilder.lineToRelative(23.0f, 23.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileImage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
