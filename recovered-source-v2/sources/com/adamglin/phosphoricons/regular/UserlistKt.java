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

/* compiled from: Userlist.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserList", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUserList", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userList", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserlistKt {
    private static ImageVector _userList;

    public static final ImageVector getUserList(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _userList;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserList", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(160.0f, 88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 120.0f);
        pathBuilder.lineTo(160.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 168.0f);
        pathBuilder.lineTo(184.0f, 168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.75f, 190.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.76f, 9.74f);
        pathBuilder.arcToRelative(7.55f, 7.55f, 0.0f, false, true, -2.0f, 0.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, -6.0f);
        pathBuilder.curveToRelative(-6.16f, -23.94f, -30.34f, -42.0f, -56.25f, -42.0f);
        pathBuilder.reflectiveCurveToRelative(-50.09f, 18.05f, -56.25f, 42.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.5f, -4.0f);
        pathBuilder.curveToRelative(5.59f, -21.71f, 21.84f, -39.29f, 42.46f, -48.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, true, 58.58f, 0.0f);
        pathBuilder.curveTo(129.91f, 150.71f, 146.16f, 168.29f, 151.75f, 190.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 136.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 80.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userList = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
