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

/* compiled from: Trafficsign.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficSign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getTrafficSign", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficSign", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficsignKt {
    private static ImageVector _trafficSign;

    public static final ImageVector getTrafficSign(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(243.15f, 116.29f);
        pathBuilder.lineTo(139.71f, 12.85f);
        pathBuilder.arcToRelative(16.56f, 16.56f, 0.0f, false, false, -23.42f, 0.0f);
        pathBuilder.lineTo(12.85f, 116.29f);
        pathBuilder.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, 23.42f);
        pathBuilder.lineTo(116.29f, 243.15f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 23.42f, 0.0f);
        pathBuilder.lineTo(243.15f, 139.71f);
        pathBuilder.arcToRelative(16.56f, 16.56f, 0.0f, false, false, 0.0f, -23.42f);
        pathBuilder.close();
        pathBuilder.moveTo(173.66f, 125.66f);
        pathBuilder.lineTo(149.66f, 149.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineTo(148.69f, 128.0f);
        pathBuilder.lineTo(112.0f, 128.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f);
        pathBuilder.horizontalLineToRelative(36.69f);
        pathBuilder.lineToRelative(-10.35f, -10.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 173.66f, 125.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficSign = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
