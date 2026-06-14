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

/* compiled from: Heartbeat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Heartbeat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHeartbeat", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartbeat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbeatKt {
    private static ImageVector _heartbeat;

    public static final ImageVector getHeartbeat(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 102.0f);
        pathBuilder.curveToRelative(0.0f, 66.0f, -104.0f, 122.0f, -104.0f, 122.0f);
        pathBuilder.reflectiveCurveTo(24.0f, 168.0f, 24.0f, 102.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 78.0f, 48.0f);
        pathBuilder.curveToRelative(22.59f, 0.0f, 41.94f, 12.31f, 50.0f, 32.0f);
        pathBuilder.curveToRelative(8.06f, -19.69f, 27.41f, -32.0f, 50.0f, -32.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 232.0f, 102.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(72.0f, 144.0f);
        pathBuilder2.horizontalLineTo(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(67.72f);
        pathBuilder2.lineToRelative(13.62f, -20.44f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.32f, 0.0f);
        pathBuilder2.lineToRelative(25.34f, 38.0f);
        pathBuilder2.lineToRelative(9.34f, -14.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 128.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.horizontalLineTo(140.28f);
        pathBuilder2.lineToRelative(-13.62f, 20.44f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.32f, 0.0f);
        pathBuilder2.lineTo(88.0f, 126.42f);
        pathBuilder2.lineToRelative(-9.34f, 14.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(178.0f, 40.0f);
        pathBuilder2.curveToRelative(-20.65f, 0.0f, -38.73f, 8.88f, -50.0f, 23.89f);
        pathBuilder2.curveTo(116.73f, 48.88f, 98.65f, 40.0f, 78.0f, 40.0f);
        pathBuilder2.arcToRelative(62.07f, 62.07f, 0.0f, false, false, -62.0f, 62.0f);
        pathBuilder2.curveToRelative(0.0f, 0.75f, 0.0f, 1.5f, 0.0f, 2.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 16.0f, -0.5f);
        pathBuilder2.curveToRelative(0.0f, -0.58f, 0.0f, -1.17f, 0.0f, -1.75f);
        pathBuilder2.arcTo(46.06f, 46.06f, 0.0f, false, true, 78.0f, 56.0f);
        pathBuilder2.curveToRelative(19.45f, 0.0f, 35.78f, 10.36f, 42.6f, 27.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f);
        pathBuilder2.curveToRelative(6.82f, -16.67f, 23.15f, -27.0f, 42.6f, -27.0f);
        pathBuilder2.arcToRelative(46.06f, 46.06f, 0.0f, false, true, 46.0f, 46.0f);
        pathBuilder2.curveToRelative(0.0f, 53.61f, -77.76f, 102.15f, -96.0f, 112.8f);
        pathBuilder2.curveToRelative(-10.83f, -6.31f, -42.63f, -26.0f, -66.68f, -52.21f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.8f, 10.82f);
        pathBuilder2.curveToRelative(31.17f, 34.0f, 72.93f, 56.68f, 74.69f, 57.63f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, 0.0f);
        pathBuilder2.curveTo(136.21f, 228.66f, 240.0f, 172.0f, 240.0f, 102.0f);
        pathBuilder2.arcTo(62.07f, 62.07f, 0.0f, false, false, 178.0f, 40.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartbeat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
