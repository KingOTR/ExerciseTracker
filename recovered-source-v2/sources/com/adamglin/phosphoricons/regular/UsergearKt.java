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

/* compiled from: Usergear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserGear", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsergearKt {
    private static ImageVector _userGear;

    public static final ImageVector getUserGear(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _userGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 157.68f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f);
        pathBuilder.curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.24f, 10.3f);
        pathBuilder.curveTo(50.25f, 181.19f, 77.91f, 168.0f, 108.0f, 168.0f);
        pathBuilder.reflectiveCurveToRelative(57.75f, 13.19f, 77.87f, 37.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.26f, -10.3f);
        pathBuilder.curveTo(183.18f, 177.07f, 164.6f, 164.44f, 144.0f, 157.68f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 100.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 56.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.25f, 143.07f);
        pathBuilder.lineTo(247.59f, 140.38f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, -8.76f);
        pathBuilder.lineToRelative(4.66f, -2.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -13.86f);
        pathBuilder.lineToRelative(-4.67f, 2.7f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, -4.39f);
        pathBuilder.lineTo(232.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(5.38f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, -7.58f, 4.39f);
        pathBuilder.lineToRelative(-4.67f, -2.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 13.86f);
        pathBuilder.lineToRelative(4.66f, 2.69f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, false, 0.0f, 8.76f);
        pathBuilder.lineToRelative(-4.66f, 2.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 13.86f);
        pathBuilder.lineToRelative(4.67f, -2.7f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, 4.39f);
        pathBuilder.lineTo(216.0f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-5.38f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.58f, -4.39f);
        pathBuilder.lineToRelative(4.67f, 2.7f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, 1.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, -14.93f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
