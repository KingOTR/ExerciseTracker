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

/* compiled from: Trafficsign.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficSign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTrafficSign", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficSign", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficsignKt {
    private static ImageVector _trafficSign;

    public static final ImageVector getTrafficSign(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _trafficSign;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrafficSign", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.49f, 134.05f);
        pathBuilder.lineTo(134.05f, 237.49f);
        pathBuilder.arcToRelative(8.54f, 8.54f, 0.0f, false, true, -12.1f, 0.0f);
        pathBuilder.lineTo(18.51f, 134.05f);
        pathBuilder.arcToRelative(8.54f, 8.54f, 0.0f, false, true, 0.0f, -12.1f);
        pathBuilder.lineTo(122.0f, 18.51f);
        pathBuilder.arcToRelative(8.54f, 8.54f, 0.0f, false, true, 12.1f, 0.0f);
        pathBuilder.lineTo(237.49f, 122.0f);
        pathBuilder.arcTo(8.54f, 8.54f, 0.0f, false, true, 237.49f, 134.05f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(243.15f, 116.29f);
        pathBuilder2.lineTo(139.71f, 12.85f);
        pathBuilder2.arcToRelative(16.56f, 16.56f, 0.0f, false, false, -23.42f, 0.0f);
        pathBuilder2.lineTo(12.85f, 116.29f);
        pathBuilder2.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, 23.42f);
        pathBuilder2.lineTo(116.29f, 243.15f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 23.42f, 0.0f);
        pathBuilder2.lineTo(243.15f, 139.71f);
        pathBuilder2.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, -23.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(231.84f, 128.39f);
        pathBuilder2.lineTo(128.39f, 231.84f);
        pathBuilder2.arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.78f, 0.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineTo(24.16f, 128.39f);
        pathBuilder2.arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, -0.78f);
        pathBuilder2.lineTo(127.61f, 24.16f);
        pathBuilder2.arcTo(0.52f, 0.52f, 0.0f, false, true, 128.0f, 24.0f);
        pathBuilder2.arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.4f, 0.16f);
        pathBuilder2.lineTo(231.84f, 127.61f);
        pathBuilder2.arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.0f, 0.78f);
        pathBuilder2.close();
        pathBuilder2.moveTo(173.66f, 114.39f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(-24.0f, 24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder2.lineTo(148.69f, 128.0f);
        pathBuilder2.lineTo(112.0f, 128.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f);
        pathBuilder2.horizontalLineToRelative(36.69f);
        pathBuilder2.lineToRelative(-10.35f, -10.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficSign = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
