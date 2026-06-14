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

/* compiled from: Camerarotate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CameraRotate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCameraRotate", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cameraRotate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CamerarotateKt {
    private static ImageVector _cameraRotate;

    public static final ImageVector getCameraRotate(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _cameraRotate;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CameraRotate", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 56.0f);
        pathBuilder.horizontalLineTo(180.28f);
        pathBuilder.lineTo(166.65f, 35.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.65f, 3.56f);
        pathBuilder.lineTo(75.71f, 56.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.81f, 166.4f);
        pathBuilder.arcTo(48.21f, 48.21f, 0.0f, false, true, 96.0f, 163.77f);
        pathBuilder.verticalLineTo(168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-5.15f);
        pathBuilder.arcToRelative(32.12f, 32.12f, 0.0f, false, false, 40.34f, 1.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.62f, 12.79f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(5.15f);
        pathBuilder.arcToRelative(32.12f, 32.12f, 0.0f, false, false, -40.34f, -1.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 99.19f, 97.6f);
        pathBuilder.arcTo(48.21f, 48.21f, 0.0f, false, true, 160.0f, 100.23f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cameraRotate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
