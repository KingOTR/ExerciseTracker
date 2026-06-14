package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Camerarotate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CameraRotate", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCameraRotate", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cameraRotate", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CamerarotateKt {
    private static ImageVector _cameraRotate;

    public static final ImageVector getCameraRotate(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.lineTo(180.28f, 56.0f);
        pathBuilder.lineTo(166.65f, 35.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 32.0f);
        pathBuilder.lineTo(96.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.65f, 3.56f);
        pathBuilder.lineTo(75.71f, 56.0f);
        pathBuilder.lineTo(48.0f, 56.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder.lineTo(24.0f, 192.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder.lineTo(208.0f, 216.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder.lineTo(232.0f, 80.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(48.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(40.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.lineTo(80.0f, 72.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.66f, -3.56f);
        pathBuilder.lineTo(100.28f, 48.0f);
        pathBuilder.horizontalLineToRelative(55.43f);
        pathBuilder.lineToRelative(13.63f, 20.44f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 96.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(144.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(5.15f);
        pathBuilder.arcToRelative(32.12f, 32.12f, 0.0f, false, false, -40.34f, -1.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 99.19f, 97.6f);
        pathBuilder.arcTo(48.21f, 48.21f, 0.0f, false, true, 160.0f, 100.23f);
        pathBuilder.lineTo(160.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.39f, 155.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.58f, 11.2f);
        pathBuilder.arcTo(48.21f, 48.21f, 0.0f, false, true, 96.0f, 163.77f);
        pathBuilder.lineTo(96.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(80.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-5.15f);
        pathBuilder.arcToRelative(32.12f, 32.12f, 0.0f, false, false, 40.34f, 1.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 158.39f, 155.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cameraRotate = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
