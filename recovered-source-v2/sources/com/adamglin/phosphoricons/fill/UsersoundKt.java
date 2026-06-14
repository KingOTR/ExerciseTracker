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

/* compiled from: Usersound.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUserSound", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersoundKt {
    private static ImageVector _userSound;

    public static final ImageVector getUserSound(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(198.13f, 202.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 216.0f);
        pathBuilder.lineTo(24.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.12f, -13.15f);
        pathBuilder.curveToRelative(14.94f, -17.78f, 33.52f, -30.41f, 54.17f, -37.17f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 71.9f, 0.0f);
        pathBuilder.curveTo(164.6f, 172.44f, 183.18f, 185.07f, 198.13f, 202.85f);
        pathBuilder.close();
        pathBuilder.moveTo(196.86f, 61.39f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.22f, 10.5f);
        pathBuilder.arcToRelative(92.26f, 92.26f, 0.0f, false, true, 0.0f, 72.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.72f, 6.29f);
        pathBuilder.arcToRelative(108.36f, 108.36f, 0.0f, false, false, 0.0f, -84.8f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 196.86f, 61.39f);
        pathBuilder.close();
        pathBuilder.moveTo(236.71f, 52.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.7f, 6.3f);
        pathBuilder.arcToRelative(124.43f, 124.43f, 0.0f, false, true, 0.0f, 97.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.7f, 6.3f);
        pathBuilder.arcToRelative(140.34f, 140.34f, 0.0f, false, false, 0.0f, -110.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
