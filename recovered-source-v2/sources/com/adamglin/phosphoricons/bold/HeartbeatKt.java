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

/* compiled from: Heartbeat.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Heartbeat", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHeartbeat", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heartbeat", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartbeatKt {
    private static ImageVector _heartbeat;

    public static final ImageVector getHeartbeat(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(71.76f, 148.0f);
        pathBuilder.horizontalLineTo(31.7f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineTo(65.33f);
        pathBuilder.lineToRelative(12.45f, -18.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.0f, 0.0f);
        pathBuilder.lineToRelative(22.0f, 33.0f);
        pathBuilder.lineToRelative(6.0f, -9.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, -5.34f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(-17.6f);
        pathBuilder.lineToRelative(-12.46f, 18.66f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.0f, 0.0f);
        pathBuilder.lineToRelative(-22.0f, -33.0f);
        pathBuilder.lineToRelative(-6.0f, 9.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 71.76f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(177.91f, 36.0f);
        pathBuilder.curveToRelative(-20.12f, 0.0f, -38.0f, 7.93f, -50.07f, 21.56f);
        pathBuilder.curveTo(115.74f, 43.93f, 97.89f, 36.0f, 77.76f, 36.0f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 12.07f, 94.68f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 97.32f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 77.76f, 60.0f);
        pathBuilder.curveToRelative(17.83f, 0.0f, 32.75f, 9.4f, 38.95f, 24.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.25f, 0.0f);
        pathBuilder.curveTo(145.16f, 69.4f, 160.08f, 60.0f, 177.91f, 60.0f);
        pathBuilder.arcTo(42.08f, 42.08f, 0.0f, false, true, 220.0f, 102.0f);
        pathBuilder.curveToRelative(0.0f, 29.42f, -25.86f, 57.77f, -47.56f, 76.36f);
        pathBuilder.arcToRelative(329.0f, 329.0f, 0.0f, false, true, -44.58f, 31.81f);
        pathBuilder.curveToRelative(-10.87f, -6.45f, -35.37f, -22.0f, -56.51f, -42.73f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -16.84f, 17.12f);
        pathBuilder.curveToRelative(30.39f, 29.81f, 66.15f, 49.2f, 67.66f, 50.0f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, 11.39f, 0.0f);
        pathBuilder.curveTo(138.0f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f);
        pathBuilder.arcTo(66.12f, 66.12f, 0.0f, false, false, 177.91f, 36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heartbeat = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
