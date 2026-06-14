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

/* compiled from: Users.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Users", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUsers", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_users", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersKt {
    private static ImageVector _users;

    public static final ImageVector getUsers(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(164.47f, 195.63f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, 12.37f);
        pathBuilder.lineTo(10.23f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.7f, -12.37f);
        pathBuilder.arcToRelative(95.83f, 95.83f, 0.0f, false, true, 47.22f, -37.71f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, 66.5f, 0.0f);
        pathBuilder.arcTo(95.83f, 95.83f, 0.0f, false, true, 164.47f, 195.63f);
        pathBuilder.close();
        pathBuilder.moveTo(252.38f, 195.48f);
        pathBuilder.arcToRelative(95.87f, 95.87f, 0.0f, false, false, -47.13f, -37.56f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 144.7f, 54.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.33f, 6.0f);
        pathBuilder.arcTo(75.83f, 75.83f, 0.0f, false, true, 147.0f, 150.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.07f, 5.53f);
        pathBuilder.arcToRelative(112.32f, 112.32f, 0.0f, false, true, 29.85f, 30.83f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, true, 3.65f, 16.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.95f, 4.64f);
        pathBuilder.horizontalLineToRelative(60.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.73f, -5.93f);
        pathBuilder.arcTo(8.22f, 8.22f, 0.0f, false, false, 252.38f, 195.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _users = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
