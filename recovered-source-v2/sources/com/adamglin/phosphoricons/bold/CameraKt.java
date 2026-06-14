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

/* compiled from: Camera.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Camera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCamera", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_camera", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraKt {
    private static ImageVector _camera;

    public static final ImageVector getCamera(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _camera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Camera", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 52.0f);
        pathBuilder.lineTo(182.42f, 52.0f);
        pathBuilder.lineTo(170.0f, 33.34f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 28.0f);
        pathBuilder.lineTo(96.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.34f);
        pathBuilder.lineTo(73.57f, 52.0f);
        pathBuilder.lineTo(48.0f, 52.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 20.0f, 80.0f);
        pathBuilder.lineTo(20.0f, 192.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f);
        pathBuilder.lineTo(208.0f, 220.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f);
        pathBuilder.lineTo(236.0f, 80.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 208.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 192.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(48.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(80.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.0f, -5.34f);
        pathBuilder.lineTo(102.42f, 52.0f);
        pathBuilder.horizontalLineToRelative(51.15f);
        pathBuilder.lineTo(166.0f, 70.66f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 176.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _camera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
