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

/* compiled from: Rocket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRocket", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rocket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Rocket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(156.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(112.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 228.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 116.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(227.53f, 156.7f);
        pathBuilder.lineTo(215.17f, 212.33f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.88f, 14.53f);
        pathBuilder.arcTo(20.16f, 20.16f, 0.0f, false, true, 195.6f, 228.0f);
        pathBuilder.arcToRelative(19.87f, 19.87f, 0.0f, false, true, -12.29f, -4.27f);
        pathBuilder.lineTo(157.17f, 204.0f);
        pathBuilder.lineTo(98.83f, 204.0f);
        pathBuilder.lineTo(72.69f, 223.74f);
        pathBuilder.arcTo(19.87f, 19.87f, 0.0f, false, true, 60.4f, 228.0f);
        pathBuilder.arcToRelative(20.16f, 20.16f, 0.0f, false, true, -6.69f, -1.15f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, true, -12.88f, -14.53f);
        pathBuilder.lineTo(28.47f, 156.7f);
        pathBuilder.arcToRelative(20.1f, 20.1f, 0.0f, false, true, 4.16f, -17.14f);
        pathBuilder.lineToRelative(27.83f, -33.4f);
        pathBuilder.arcTo(127.0f, 127.0f, 0.0f, false, true, 69.11f, 69.7f);
        pathBuilder.curveToRelative(13.27f, -33.25f, 37.0f, -54.1f, 46.64f, -61.52f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 24.5f, 0.0f);
        pathBuilder.curveToRelative(9.6f, 7.42f, 33.37f, 28.27f, 46.64f, 61.52f);
        pathBuilder.arcToRelative(127.0f, 127.0f, 0.0f, false, true, 8.65f, 36.46f);
        pathBuilder.lineToRelative(27.83f, 33.4f);
        pathBuilder.arcTo(20.1f, 20.1f, 0.0f, false, true, 227.53f, 156.7f);
        pathBuilder.close();
        pathBuilder.moveTo(101.79f, 180.0f);
        pathBuilder.horizontalLineToRelative(52.42f);
        pathBuilder.curveToRelative(19.51f, -35.7f, 23.0f, -69.78f, 10.39f, -101.4f);
        pathBuilder.curveTo(154.4f, 53.0f, 136.2f, 35.9f, 128.0f, 29.12f);
        pathBuilder.curveTo(119.8f, 35.9f, 101.6f, 53.0f, 91.4f, 78.6f);
        pathBuilder.curveTo(78.78f, 110.22f, 82.28f, 144.3f, 101.79f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.24f, 188.72f);
        pathBuilder.arcToRelative(168.0f, 168.0f, 0.0f, false, true, -16.92f, -47.3f);
        pathBuilder.lineToRelative(-10.0f, 12.0f);
        pathBuilder.lineToRelative(10.58f, 47.64f);
        pathBuilder.close();
        pathBuilder.moveTo(203.67f, 153.41f);
        pathBuilder.lineTo(193.67f, 141.41f);
        pathBuilder.arcToRelative(168.0f, 168.0f, 0.0f, false, true, -16.92f, 47.3f);
        pathBuilder.lineToRelative(16.33f, 12.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rocket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
