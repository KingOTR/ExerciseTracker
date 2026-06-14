package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Cigaretteslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CigaretteSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCigaretteSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cigaretteSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CigaretteslashKt {
    private static ImageVector _cigaretteSlash;

    public static final ImageVector getCigaretteSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(201.0f, 60.08f);
        pathBuilder.curveToRelative(8.0f, -14.23f, 7.42f, -21.71f, 6.36f, -24.91f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, false, -2.64f, -3.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.5f, -14.62f);
        pathBuilder.arcToRelative(22.57f, 22.57f, 0.0f, false, true, 11.32f, 13.44f);
        pathBuilder.curveToRelative(3.36f, 10.14f, 0.81f, 22.85f, -7.6f, 37.79f);
        pathBuilder.curveToRelative(-8.0f, 14.23f, -7.42f, 21.72f, -6.36f, 24.92f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, false, 2.64f, 3.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -6.5f, 14.62f);
        pathBuilder.arcToRelative(22.53f, 22.53f, 0.0f, false, true, -11.32f, -13.44f);
        pathBuilder.curveTo(190.07f, 87.73f, 192.62f, 75.0f, 201.0f, 60.08f);
        pathBuilder.close();
        pathBuilder.moveTo(153.4f, 97.87f);
        pathBuilder.arcToRelative(22.53f, 22.53f, 0.0f, false, false, 11.32f, 13.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 6.5f, -14.62f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, true, -2.64f, -3.85f);
        pathBuilder.curveToRelative(-1.06f, -3.2f, -1.64f, -10.69f, 6.36f, -24.92f);
        pathBuilder.curveToRelative(8.41f, -14.94f, 11.0f, -27.65f, 7.6f, -37.79f);
        pathBuilder.arcToRelative(22.57f, 22.57f, 0.0f, false, false, -11.32f, -13.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -6.5f, 14.62f);
        pathBuilder.arcToRelative(7.79f, 7.79f, 0.0f, false, true, 2.64f, 3.86f);
        pathBuilder.curveToRelative(1.06f, 3.2f, 1.64f, 10.68f, -6.36f, 24.91f);
        pathBuilder.curveTo(152.62f, 75.0f, 150.07f, 87.73f, 153.43f, 97.87f);
        pathBuilder.close();
        pathBuilder.moveTo(213.89f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(175.37f, 192.0f);
        pathBuilder.lineTo(32.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 144.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(85.19f);
        pathBuilder.lineTo(42.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 176.0f);
        pathBuilder.lineTo(80.0f, 176.0f);
        pathBuilder.lineTo(80.0f, 144.0f);
        pathBuilder.lineTo(32.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.82f, 176.0f);
        pathBuilder.lineTo(131.73f, 144.0f);
        pathBuilder.lineTo(96.0f, 144.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.lineTo(178.52f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.lineTo(224.0f, 144.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.horizontalLineToRelative(-1.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.lineTo(224.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(240.0f, 144.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cigaretteSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
