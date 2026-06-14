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

/* compiled from: Gpsslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GpsSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGpsSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gpsSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GpsslashKt {
    private static ImageVector _gpsSlash;

    public static final ImageVector getGpsSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _gpsSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GpsSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(219.21f, 140.0f);
        pathBuilder.arcToRelative(91.65f, 91.65f, 0.0f, false, true, -3.56f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.43f, 8.35f);
        pathBuilder.arcToRelative(12.19f, 12.19f, 0.0f, false, true, -3.65f, -0.57f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.78f, -15.09f);
        pathBuilder.arcTo(68.06f, 68.06f, 0.0f, false, false, 128.0f, 60.0f);
        pathBuilder.arcToRelative(68.73f, 68.73f, 0.0f, false, false, -14.48f, 1.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -5.08f, -23.45f);
        pathBuilder.curveToRelative(2.49f, -0.54f, 5.0f, -1.0f, 7.56f, -1.31f);
        pathBuilder.lineTo(116.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 36.78f);
        pathBuilder.arcTo(92.21f, 92.21f, 0.0f, false, true, 219.22f, 116.0f);
        pathBuilder.lineTo(240.0f, 116.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.88f, 207.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f);
        pathBuilder.lineToRelative(-18.65f, -20.51f);
        pathBuilder.arcTo(91.6f, 91.6f, 0.0f, false, true, 140.0f, 219.2f);
        pathBuilder.lineTo(140.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 219.22f);
        pathBuilder.arcTo(92.21f, 92.21f, 0.0f, false, true, 36.78f, 140.0f);
        pathBuilder.lineTo(16.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.lineTo(36.79f, 116.0f);
        pathBuilder.arcToRelative(92.36f, 92.36f, 0.0f, false, true, 21.0f, -47.42f);
        pathBuilder.lineTo(39.12f, 48.07f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f);
        pathBuilder.lineTo(190.69f, 179.11f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.14f, 185.6f);
        pathBuilder.lineToRelative(-90.0f, -99.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 90.0f, 99.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gpsSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
