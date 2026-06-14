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

/* compiled from: Usersound.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserSound", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersoundKt {
    private static ImageVector _userSound;

    public static final ImageVector getUserSound(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _userSound;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserSound", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 165.68f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, -71.9f, 0.0f);
        pathBuilder.curveToRelative(-20.65f, 6.76f, -39.23f, 19.39f, -54.17f, 37.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.25f, 10.3f);
        pathBuilder.curveTo(50.25f, 189.19f, 77.91f, 176.0f, 108.0f, 176.0f);
        pathBuilder.reflectiveCurveToRelative(57.75f, 13.19f, 77.88f, 37.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.25f, -10.3f);
        pathBuilder.curveTo(183.18f, 185.07f, 164.6f, 172.44f, 144.0f, 165.68f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 108.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 56.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.36f, 65.6f);
        pathBuilder.arcToRelative(108.36f, 108.36f, 0.0f, false, true, 0.0f, 84.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.36f, 4.86f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.36f, -11.15f);
        pathBuilder.arcToRelative(92.26f, 92.26f, 0.0f, false, false, 0.0f, -72.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.72f, -6.29f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 108.0f);
        pathBuilder.arcToRelative(139.0f, 139.0f, 0.0f, false, true, -11.29f, 55.15f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.7f, -6.3f);
        pathBuilder.arcToRelative(124.43f, 124.43f, 0.0f, false, false, 0.0f, -97.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.7f, -6.3f);
        pathBuilder.arcTo(139.0f, 139.0f, 0.0f, false, true, 248.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
