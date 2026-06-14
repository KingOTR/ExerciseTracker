package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Heartbeat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Heartbeat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHeartbeat", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartbeat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbeatKt {
    private static ImageVector _heartbeat;

    public static final ImageVector getHeartbeat(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _heartbeat;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Heartbeat", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(72.0f, 142.0f);
        pathBuilder.horizontalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineTo(68.79f);
        pathBuilder.lineTo(83.0f, 108.67f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.0f, 0.0f);
        pathBuilder.lineToRelative(27.0f, 40.51f);
        pathBuilder.lineToRelative(11.0f, -16.51f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, -2.67f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(139.21f);
        pathBuilder.lineTo(125.0f, 163.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 122.82f);
        pathBuilder.lineTo(77.0f, 139.33f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 72.0f, 142.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 42.0f);
        pathBuilder.curveToRelative(-21.0f, 0.0f, -39.26f, 9.47f, -50.0f, 25.34f);
        pathBuilder.curveTo(117.26f, 51.47f, 99.0f, 42.0f, 78.0f, 42.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f);
        pathBuilder.quadToRelative(0.0f, 1.09f, 0.0f, 2.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, -0.38f);
        pathBuilder.curveToRelative(0.0f, -0.6f, 0.0f, -1.21f, 0.0f, -1.81f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 78.0f, 54.0f);
        pathBuilder.curveToRelative(20.28f, 0.0f, 37.31f, 10.83f, 44.45f, 28.27f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.1f, 0.0f);
        pathBuilder.curveTo(140.69f, 64.83f, 157.72f, 54.0f, 178.0f, 54.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f);
        pathBuilder.curveToRelative(0.0f, 55.73f, -81.61f, 105.65f, -98.0f, 115.11f);
        pathBuilder.curveToRelative(-9.84f, -5.66f, -43.09f, -25.82f, -68.16f, -53.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.84f, 8.1f);
        pathBuilder.curveToRelative(30.94f, 33.77f, 72.41f, 56.29f, 74.16f, 57.23f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f);
        pathBuilder.arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, -37.0f);
        pathBuilder.curveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 178.0f, 42.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartbeat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
