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

/* compiled from: Videocamera.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VideoCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getVideoCamera", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_videoCamera", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideocameraKt {
    private static ImageVector _videoCamera;

    public static final ImageVector getVideoCamera(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(249.45f, 69.31f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.51f, 1.0f);
        pathBuilder.lineTo(212.0f, 88.43f);
        pathBuilder.lineTo(212.0f, 72.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(32.0f, 52.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 72.0f);
        pathBuilder.lineTo(12.0f, 184.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(192.0f, 204.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(212.0f, 167.57f);
        pathBuilder.lineToRelative(24.94f, 18.14f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 256.0f, 176.0f);
        pathBuilder.lineTo(256.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 249.45f, 69.31f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 180.0f);
        pathBuilder.lineTo(36.0f, 180.0f);
        pathBuilder.lineTo(36.0f, 76.0f);
        pathBuilder.lineTo(188.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 152.43f);
        pathBuilder.lineTo(212.0f, 137.89f);
        pathBuilder.lineTo(212.0f, 118.11f);
        pathBuilder.lineToRelative(20.0f, -14.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _videoCamera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
