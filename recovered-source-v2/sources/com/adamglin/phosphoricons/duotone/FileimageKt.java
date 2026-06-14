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

/* compiled from: Fileimage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileImage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFileImage", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileImage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileimageKt {
    private static ImageVector _fileImage;

    public static final ImageVector getFileImage(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(104.0f, 152.0f);
        pathBuilder.lineToRelative(48.0f, 72.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.lineToRelative(36.0f, -56.0f);
        pathBuilder.lineToRelative(16.36f, 25.45f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 32.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(110.66f, 147.56f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.32f, 0.0f);
        pathBuilder2.lineTo(76.49f, 178.85f);
        pathBuilder2.lineToRelative(-9.76f, -15.18f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.46f, 0.0f);
        pathBuilder2.lineToRelative(-36.0f, 56.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 232.0f);
        pathBuilder2.lineTo(152.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.66f, -12.44f);
        pathBuilder2.close();
        pathBuilder2.moveTo(38.65f, 216.0f);
        pathBuilder2.lineTo(60.0f, 182.79f);
        pathBuilder2.lineToRelative(9.63f, 15.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.39f, 0.11f);
        pathBuilder2.lineToRelative(21.0f, -31.47f);
        pathBuilder2.lineTo(137.05f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(213.65f, 82.34f);
        pathBuilder2.lineTo(157.65f, 26.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder2.lineTo(56.0f, 24.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(56.0f, 40.0f);
        pathBuilder2.horizontalLineToRelative(88.0f);
        pathBuilder2.lineTo(144.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.lineTo(200.0f, 216.0f);
        pathBuilder2.horizontalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 88.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 213.66f, 82.34f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 51.31f);
        pathBuilder2.lineTo(188.69f, 80.0f);
        pathBuilder2.lineTo(160.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileImage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
