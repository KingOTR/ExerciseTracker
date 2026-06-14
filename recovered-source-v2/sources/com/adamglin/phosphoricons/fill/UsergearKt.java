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

/* compiled from: Usergear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUserGear", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsergearKt {
    private static ImageVector _userGear;

    public static final ImageVector getUserGear(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(198.13f, 194.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 208.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.12f, -13.15f);
        pathBuilder.curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f);
        pathBuilder.curveTo(164.6f, 164.44f, 183.18f, 177.07f, 198.13f, 194.85f);
        pathBuilder.close();
        pathBuilder.moveTo(255.18f, 154.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.94f, 4.0f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.0f, -1.07f);
        pathBuilder.lineToRelative(-4.67f, -2.7f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, true, -7.58f, 4.39f);
        pathBuilder.verticalLineTo(164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-5.38f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, true, -7.58f, -4.39f);
        pathBuilder.lineToRelative(-4.67f, 2.7f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.0f, 1.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -14.93f);
        pathBuilder.lineToRelative(4.66f, -2.69f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, true, 0.0f, -8.76f);
        pathBuilder.lineToRelative(-4.66f, -2.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -13.86f);
        pathBuilder.lineToRelative(4.67f, 2.7f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, true, 7.58f, -4.39f);
        pathBuilder.verticalLineTo(108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(5.38f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, true, 7.58f, 4.39f);
        pathBuilder.lineToRelative(4.67f, -2.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 13.86f);
        pathBuilder.lineToRelative(-4.66f, 2.69f);
        pathBuilder.arcToRelative(23.6f, 23.6f, 0.0f, false, true, 0.0f, 8.76f);
        pathBuilder.lineToRelative(4.66f, 2.69f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 255.18f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
