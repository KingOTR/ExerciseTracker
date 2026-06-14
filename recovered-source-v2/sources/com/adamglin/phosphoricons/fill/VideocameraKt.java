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

/* compiled from: Videocamera.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VideoCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getVideoCamera", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_videoCamera", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideocameraKt {
    private static ImageVector _videoCamera;

    public static final ImageVector getVideoCamera(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _videoCamera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("VideoCamera", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.0f, 72.0f);
        pathBuilder.lineTo(192.0f, 184.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(32.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f);
        pathBuilder.lineTo(176.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 192.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(250.0f, 72.25f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, -6.63f, 1.22f);
        pathBuilder.lineTo(209.78f, 95.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 208.0f, 99.19f);
        pathBuilder.verticalLineToRelative(57.62f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.78f, 3.33f);
        pathBuilder.lineToRelative(33.78f, 22.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.58f, 0.19f);
        pathBuilder.arcToRelative(8.33f, 8.33f, 0.0f, false, false, 3.86f, -7.17f);
        pathBuilder.lineTo(256.0f, 80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 250.0f, 72.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _videoCamera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
