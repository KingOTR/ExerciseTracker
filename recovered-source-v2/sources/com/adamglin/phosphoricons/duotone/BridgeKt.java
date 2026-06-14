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

/* compiled from: Bridge.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bridge", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBridge", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bridge", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BridgeKt {
    private static ImageVector _bridge;

    public static final ImageVector getBridge(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bridge;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bridge", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 168.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.verticalLineTo(115.35f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 64.0f, 56.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 128.0f, 0.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 40.0f, 59.35f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 160.0f);
        pathBuilder2.lineTo(200.0f, 160.0f);
        pathBuilder2.lineTo(200.0f, 101.34f);
        pathBuilder2.arcToRelative(71.89f, 71.89f, 0.0f, false, false, 29.0f, 21.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, -14.83f);
        pathBuilder2.arcTo(55.78f, 55.78f, 0.0f, false, true, 200.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(55.78f, 55.78f, 0.0f, false, true, -35.0f, 51.93f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 14.83f);
        pathBuilder2.arcToRelative(71.89f, 71.89f, 0.0f, false, false, 29.0f, -21.42f);
        pathBuilder2.lineTo(56.0f, 160.0f);
        pathBuilder2.lineTo(24.0f, 160.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(56.0f, 176.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(72.0f, 176.0f);
        pathBuilder2.lineTo(184.0f, 176.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(200.0f, 176.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 126.2f);
        pathBuilder2.lineTo(144.0f, 160.0f);
        pathBuilder2.lineTo(112.0f, 160.0f);
        pathBuilder2.lineTo(112.0f, 126.2f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, false, 32.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 101.2f);
        pathBuilder2.arcToRelative(72.47f, 72.47f, 0.0f, false, false, 24.0f, 19.27f);
        pathBuilder2.lineTo(96.0f, 160.0f);
        pathBuilder2.lineTo(72.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 160.0f);
        pathBuilder2.lineTo(160.0f, 120.48f);
        pathBuilder2.arcToRelative(72.47f, 72.47f, 0.0f, false, false, 24.0f, -19.27f);
        pathBuilder2.lineTo(184.0f, 160.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bridge = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
