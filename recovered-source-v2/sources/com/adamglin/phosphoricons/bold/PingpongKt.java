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

/* compiled from: Pingpong.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PingPong", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPingPong", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pingPong", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PingpongKt {
    private static ImageVector _pingPong;

    public static final ImageVector getPingPong(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pingPong;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PingPong", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.93f, 195.71f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, -14.41f);
        pathBuilder.lineTo(203.0f, 155.17f);
        pathBuilder.lineToRelative(12.1f, -12.1f);
        pathBuilder.arcToRelative(43.66f, 43.66f, 0.0f, false, false, 12.11f, -39.4f);
        pathBuilder.arcToRelative(103.52f, 103.52f, 0.0f, false, false, -36.81f, -60.23f);
        pathBuilder.arcTo(106.19f, 106.19f, 0.0f, false, false, 122.52f, 20.0f);
        pathBuilder.arcTo(104.29f, 104.29f, 0.0f, false, false, 20.0f, 122.52f);
        pathBuilder.arcToRelative(106.17f, 106.17f, 0.0f, false, false, 23.43f, 67.85f);
        pathBuilder.arcToRelative(103.52f, 103.52f, 0.0f, false, false, 60.23f, 36.81f);
        pathBuilder.arcToRelative(43.64f, 43.64f, 0.0f, false, false, 39.39f, -12.11f);
        pathBuilder.lineTo(155.17f, 203.0f);
        pathBuilder.lineToRelative(26.13f, 32.95f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.41f, 8.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.1f, 0.07f, 1.66f, 0.07f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 14.13f, -5.86f);
        pathBuilder.lineToRelative(26.64f, -26.64f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 243.93f, 195.71f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 122.86f);
        pathBuilder.curveTo(44.6f, 80.0f, 80.0f, 44.6f, 122.86f, 44.0f);
        pathBuilder.arcToRelative(81.92f, 81.92f, 0.0f, false, true, 65.2f, 31.0f);
        pathBuilder.lineTo(75.0f, 188.06f);
        pathBuilder.arcToRelative(81.92f, 81.92f, 0.0f, false, true, -31.0f, -65.2f);
        pathBuilder.close();
        pathBuilder.moveTo(197.71f, 218.0f);
        pathBuilder.lineToRelative(-32.1f, -40.49f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 156.9f, 173.0f);
        pathBuilder.lineToRelative(-0.69f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f);
        pathBuilder.lineTo(126.09f, 198.1f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(19.72f, 19.72f, 0.0f, false, true, -17.75f, 5.54f);
        pathBuilder.arcToRelative(76.28f, 76.28f, 0.0f, false, true, -11.68f, -3.33f);
        pathBuilder.lineTo(200.31f, 96.66f);
        pathBuilder.arcToRelative(76.28f, 76.28f, 0.0f, false, true, 3.33f, 11.68f);
        pathBuilder.arcToRelative(19.72f, 19.72f, 0.0f, false, true, -5.54f, 17.75f);
        pathBuilder.lineToRelative(-21.63f, 21.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.0f, 17.89f);
        pathBuilder.lineTo(218.0f, 197.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pingPong = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
