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

/* compiled from: Trafficsign.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrafficSign", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTrafficSign", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trafficSign", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrafficsignKt {
    private static ImageVector _trafficSign;

    public static final ImageVector getTrafficSign(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(246.0f, 113.46f);
        pathBuilder.lineTo(142.54f, 10.0f);
        pathBuilder.arcToRelative(20.57f, 20.57f, 0.0f, false, false, -29.08f, 0.0f);
        pathBuilder.lineTo(10.0f, 113.46f);
        pathBuilder.arcToRelative(20.57f, 20.57f, 0.0f, false, false, 0.0f, 29.08f);
        pathBuilder.lineTo(113.46f, 246.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(20.57f, 20.57f, 0.0f, false, false, 29.08f, 0.0f);
        pathBuilder.lineTo(246.0f, 142.54f);
        pathBuilder.arcToRelative(20.57f, 20.57f, 0.0f, false, false, 0.0f, -29.08f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.57f);
        pathBuilder.lineTo(29.43f, 128.0f);
        pathBuilder.lineTo(128.0f, 29.43f);
        pathBuilder.lineTo(226.57f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(135.51f, 104.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(139.0f, 132.0f);
        pathBuilder.lineTo(112.0f, 132.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f);
        pathBuilder.horizontalLineToRelative(27.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trafficSign = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
