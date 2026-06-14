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

/* compiled from: Cigaretteslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CigaretteSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCigaretteSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cigaretteSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CigaretteslashKt {
    private static ImageVector _cigaretteSlash;

    public static final ImageVector getCigaretteSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _cigaretteSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CigaretteSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(201.67f, 55.89f);
        pathBuilder.curveToRelative(7.53f, -12.71f, 7.12f, -19.63f, 5.07f, -21.1f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 216.67f, 13.0f);
        pathBuilder.arcToRelative(25.9f, 25.9f, 0.0f, false, true, 13.8f, 15.79f);
        pathBuilder.curveToRelative(3.6f, 10.92f, 0.86f, 24.17f, -8.14f, 39.38f);
        pathBuilder.curveToRelative(-7.53f, 12.7f, -7.12f, 19.63f, -5.07f, 21.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.93f, 21.84f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -13.8f, -15.79f);
        pathBuilder.curveTo(189.93f, 84.34f, 192.67f, 71.09f, 201.67f, 55.89f);
        pathBuilder.close();
        pathBuilder.moveTo(145.53f, 95.27f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 13.8f, 15.79f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.93f, -21.84f);
        pathBuilder.curveToRelative(-2.0f, -1.47f, -2.46f, -8.4f, 5.07f, -21.1f);
        pathBuilder.curveToRelative(9.0f, -15.21f, 11.74f, -28.46f, 8.14f, -39.38f);
        pathBuilder.arcTo(25.9f, 25.9f, 0.0f, false, false, 168.67f, 13.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.93f, 21.84f);
        pathBuilder.curveToRelative(2.0f, 1.47f, 2.46f, 8.39f, -5.07f, 21.1f);
        pathBuilder.curveTo(144.67f, 71.09f, 141.93f, 84.34f, 145.53f, 95.27f);
        pathBuilder.close();
        pathBuilder.moveTo(216.88f, 207.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f);
        pathBuilder.lineTo(173.6f, 196.0f);
        pathBuilder.lineTo(32.0f, 196.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(12.0f, 144.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f);
        pathBuilder.horizontalLineToRelative(76.15f);
        pathBuilder.lineToRelative(-69.0f, -75.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 56.88f, 31.93f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 172.0f);
        pathBuilder.lineTo(76.0f, 172.0f);
        pathBuilder.lineTo(76.0f, 148.0f);
        pathBuilder.lineTo(36.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.78f, 172.0f);
        pathBuilder.lineTo(130.0f, 148.0f);
        pathBuilder.lineTo(100.0f, 148.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 124.0f);
        pathBuilder.lineTo(189.33f, 124.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.lineTo(220.0f, 148.0f);
        pathBuilder.verticalLineToRelative(34.94f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(244.0f, 144.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cigaretteSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
