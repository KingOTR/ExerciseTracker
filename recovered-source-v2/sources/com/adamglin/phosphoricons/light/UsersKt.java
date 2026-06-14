package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Users.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Users", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUsers", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_users", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersKt {
    private static ImageVector _users;

    public static final ImageVector getUsers(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(112.6f, 158.43f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, true, false, -57.2f, 0.0f);
        pathBuilder.arcTo(93.83f, 93.83f, 0.0f, false, false, 5.21f, 196.72f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.05f, 6.56f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, false, true, 137.48f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.0f, -6.56f);
        pathBuilder.arcTo(93.83f, 93.83f, 0.0f, false, false, 112.6f, 158.43f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 108.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, 46.0f, 46.0f);
        pathBuilder.arcTo(46.06f, 46.06f, 0.0f, false, true, 38.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(249.0f, 205.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.3f, -1.74f);
        pathBuilder.arcTo(81.8f, 81.8f, 0.0f, false, false, 172.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, -17.08f, -88.73f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -4.46f, -11.14f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, true, 50.14f, 104.3f);
        pathBuilder.arcToRelative(93.83f, 93.83f, 0.0f, false, true, 50.19f, 38.29f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 249.0f, 205.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _users = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
