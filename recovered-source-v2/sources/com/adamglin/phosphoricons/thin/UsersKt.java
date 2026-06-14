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

/* compiled from: Users.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Users", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUsers", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_users", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersKt {
    private static ImageVector _users;

    public static final ImageVector getUsers(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _users;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Users", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(107.19f, 159.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, false, -46.38f, 0.0f);
        pathBuilder.arcTo(91.83f, 91.83f, 0.0f, false, false, 6.88f, 197.81f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.7f, 4.37f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 140.84f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.7f, -4.37f);
        pathBuilder.arcTo(91.83f, 91.83f, 0.0f, false, false, 107.19f, 159.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 108.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 36.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 203.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.53f, -1.17f);
        pathBuilder.arcTo(83.81f, 83.81f, 0.0f, false, false, 172.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -17.82f, -92.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -3.0f, -7.43f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 44.0f, 103.0f);
        pathBuilder.arcToRelative(91.83f, 91.83f, 0.0f, false, true, 53.93f, 38.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 248.0f, 203.35f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _users = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
