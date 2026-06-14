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

/* compiled from: Airtrafficcontrol.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AirTrafficControl", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAirTrafficControl", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_airTrafficControl", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AirtrafficcontrolKt {
    private static ImageVector _airTrafficControl;

    public static final ImageVector getAirTrafficControl(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _airTrafficControl;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AirTrafficControl", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.11f, 70.82f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 64.0f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 25.0f, 85.47f);
        pathBuilder.lineToRelative(26.19f, 72.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, 10.53f);
        pathBuilder.horizontalLineTo(189.82f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.0f, -10.53f);
        pathBuilder.lineToRelative(26.19f, -72.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 229.11f, 70.82f);
        pathBuilder.close();
        pathBuilder.moveTo(102.52f, 151.87f);
        pathBuilder.arcToRelative(7.87f, 7.87f, 0.0f, false, true, -1.44f, 0.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, -6.57f);
        pathBuilder.lineTo(83.0f, 89.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.75f, -2.86f);
        pathBuilder.lineToRelative(10.18f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 102.52f, 151.87f);
        pathBuilder.close();
        pathBuilder.moveTo(173.0f, 89.43f);
        pathBuilder.lineToRelative(-10.19f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.86f, 6.57f);
        pathBuilder.arcToRelative(7.87f, 7.87f, 0.0f, false, true, -1.44f, -0.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.44f, -9.3f);
        pathBuilder.lineToRelative(10.18f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 173.0f, 89.43f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 188.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 188.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _airTrafficControl = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
