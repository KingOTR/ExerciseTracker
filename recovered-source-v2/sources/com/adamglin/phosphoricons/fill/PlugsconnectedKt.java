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

/* compiled from: Plugsconnected.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PlugsConnected", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPlugsConnected", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plugsConnected", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlugsconnectedKt {
    private static ImageVector _plugsConnected;

    public static final ImageVector getPlugsConnected(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _plugsConnected;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PlugsConnected", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.57f, 35.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 103.43f, 29.0f);
        pathBuilder.lineToRelative(8.0f, 20.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.57f, 55.0f);
        pathBuilder.close();
        pathBuilder.moveTo(29.0f, 103.43f);
        pathBuilder.lineToRelative(20.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 55.0f, 96.57f);
        pathBuilder.lineToRelative(-20.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 103.43f);
        pathBuilder.close();
        pathBuilder.moveTo(227.0f, 152.57f);
        pathBuilder.lineToRelative(-20.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 201.0f, 159.43f);
        pathBuilder.lineToRelative(20.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 227.0f, 152.57f);
        pathBuilder.close();
        pathBuilder.moveTo(159.43f, 201.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.57f, 207.0f);
        pathBuilder.lineToRelative(8.0f, 20.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 167.43f, 221.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.91f, 18.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.5f, -0.18f);
        pathBuilder.lineTo(174.0f, 70.75f);
        pathBuilder.lineToRelative(-5.38f, -5.38f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.28f, 0.0f);
        pathBuilder.lineTo(106.14f, 82.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.66f);
        pathBuilder.lineToRelative(61.7f, 61.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f);
        pathBuilder.lineToRelative(16.74f, -16.74f);
        pathBuilder.arcToRelative(32.76f, 32.76f, 0.0f, false, false, 9.81f, -22.52f);
        pathBuilder.arcToRelative(31.82f, 31.82f, 0.0f, false, false, -9.37f, -23.17f);
        pathBuilder.lineToRelative(-5.38f, -5.37f);
        pathBuilder.lineToRelative(52.2f, -52.17f);
        pathBuilder.arcTo(8.22f, 8.22f, 0.0f, false, false, 237.91f, 18.52f);
        pathBuilder.close();
        pathBuilder.moveTo(85.64f, 90.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, false, 0.41f, 11.37f);
        pathBuilder.lineTo(80.67f, 108.0f);
        pathBuilder.lineTo(65.34f, 123.31f);
        pathBuilder.arcTo(31.82f, 31.82f, 0.0f, false, false, 56.0f, 146.47f);
        pathBuilder.arcTo(32.75f, 32.75f, 0.0f, false, false, 65.77f, 169.0f);
        pathBuilder.lineToRelative(5.0f, 4.94f);
        pathBuilder.lineTo(18.49f, 226.13f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, false, -0.61f, 11.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.72f, 0.43f);
        pathBuilder.lineTo(82.0f, 185.25f);
        pathBuilder.lineToRelative(5.37f, 5.38f);
        pathBuilder.arcToRelative(32.1f, 32.1f, 0.0f, false, false, 45.29f, 0.0f);
        pathBuilder.lineTo(148.0f, 175.31f);
        pathBuilder.lineToRelative(6.34f, 6.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plugsConnected = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
