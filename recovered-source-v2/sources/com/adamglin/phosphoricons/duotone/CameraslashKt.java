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

/* compiled from: Cameraslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CameraSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCameraSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cameraSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraslashKt {
    private static ImageVector _cameraSlash;

    public static final ImageVector getCameraSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _cameraSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CameraSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 64.0f);
        pathBuilder.horizontalLineTo(176.0f);
        pathBuilder.lineTo(160.0f, 40.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.lineTo(80.0f, 64.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 80.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(53.92f, 34.62f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder2.lineTo(51.73f, 56.0f);
        pathBuilder2.lineTo(48.0f, 56.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder2.lineTo(24.0f, 192.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder2.lineTo(197.19f, 216.0f);
        pathBuilder2.lineToRelative(4.89f, 5.38f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(105.58f, 115.23f);
        pathBuilder2.lineTo(142.58f, 155.92f);
        pathBuilder2.arcTo(27.71f, 27.71f, 0.0f, false, true, 128.0f, 160.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -22.42f, -44.77f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.lineTo(40.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.lineTo(66.28f, 72.0f);
        pathBuilder2.lineToRelative(28.41f, 31.26f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 176.0f);
        pathBuilder2.arcToRelative(44.21f, 44.21f, 0.0f, false, false, 25.44f, -8.12f);
        pathBuilder2.lineTo(182.64f, 200.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 80.0f);
        pathBuilder2.lineTo(232.0f, 186.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(216.0f, 80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineTo(176.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.65f, -3.56f);
        pathBuilder2.lineTo(155.71f, 48.0f);
        pathBuilder2.lineTo(100.24f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.91f, -9.42f);
        pathBuilder2.lineToRelative(2.0f, -3.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.66f, 3.56f);
        pathBuilder2.lineTo(180.28f, 56.0f);
        pathBuilder2.lineTo(208.0f, 56.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 80.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cameraSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
