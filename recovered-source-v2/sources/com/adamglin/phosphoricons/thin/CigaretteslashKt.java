package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cigaretteslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CigaretteSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCigaretteSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cigaretteSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CigaretteslashKt {
    private static ImageVector _cigaretteSlash;

    public static final ImageVector getCigaretteSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(204.51f, 62.0f);
        pathBuilder.curveToRelative(8.22f, -14.61f, 8.21f, -23.23f, 6.75f, -27.9f);
        pathBuilder.arcToRelative(10.82f, 10.82f, 0.0f, false, false, -4.94f, -6.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.3f, -2.0f);
        pathBuilder.curveToRelative(0.66f, 0.29f, 6.52f, 3.09f, 9.16f, 11.0f);
        pathBuilder.curveToRelative(3.0f, 9.0f, 0.53f, 20.66f, -7.29f, 34.57f);
        pathBuilder.curveToRelative(-8.22f, 14.61f, -8.21f, 23.24f, -6.75f, 27.91f);
        pathBuilder.arcToRelative(10.74f, 10.74f, 0.0f, false, false, 4.94f, 6.5f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 108.0f);
        pathBuilder.arcToRelative(4.09f, 4.09f, 0.0f, false, true, -1.63f, -0.35f);
        pathBuilder.curveToRelative(-0.66f, -0.3f, -6.52f, -3.09f, -9.16f, -11.0f);
        pathBuilder.curveTo(194.23f, 87.59f, 196.69f, 76.0f, 204.51f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(157.22f, 96.61f);
        pathBuilder.curveToRelative(2.64f, 8.0f, 8.5f, 10.75f, 9.16f, 11.0f);
        pathBuilder.arcTo(4.09f, 4.09f, 0.0f, false, false, 168.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.67f, -7.64f);
        pathBuilder.arcToRelative(10.74f, 10.74f, 0.0f, false, true, -4.94f, -6.5f);
        pathBuilder.curveToRelative(-1.46f, -4.67f, -1.47f, -13.3f, 6.75f, -27.91f);
        pathBuilder.curveToRelative(7.82f, -13.91f, 10.28f, -25.54f, 7.29f, -34.57f);
        pathBuilder.curveToRelative(-2.64f, -7.95f, -8.5f, -10.75f, -9.16f, -11.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.3f, 2.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 5.27f);
        pathBuilder.arcToRelative(10.82f, 10.82f, 0.0f, false, true, 4.94f, 6.51f);
        pathBuilder.curveToRelative(1.46f, 4.67f, 1.47f, 13.29f, -6.75f, 27.9f);
        pathBuilder.curveTo(156.69f, 76.0f, 154.23f, 87.59f, 157.22f, 96.61f);
        pathBuilder.close();
        pathBuilder.moveTo(211.0f, 213.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.92f, 5.38f);
        pathBuilder.lineTo(177.14f, 188.0f);
        pathBuilder.lineTo(32.0f, 188.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(20.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(94.23f);
        pathBuilder.lineTo(45.0f, 42.69f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 180.0f);
        pathBuilder.lineTo(84.0f, 180.0f);
        pathBuilder.lineTo(84.0f, 140.0f);
        pathBuilder.lineTo(32.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(169.87f, 180.0f);
        pathBuilder.lineTo(133.5f, 140.0f);
        pathBuilder.lineTo(92.0f, 140.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 132.0f);
        pathBuilder.lineTo(178.52f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f);
        pathBuilder.lineTo(224.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-1.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f);
        pathBuilder.lineTo(224.0f, 188.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(236.0f, 144.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cigaretteSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
