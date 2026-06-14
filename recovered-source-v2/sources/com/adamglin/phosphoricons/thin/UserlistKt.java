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

/* compiled from: Userlist.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserList", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserList", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userList", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UserlistKt {
    private static ImageVector _userList;

    public static final ImageVector getUserList(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(156.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(160.0f, 84.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 124.0f);
        pathBuilder.lineTo(160.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 172.0f);
        pathBuilder.lineTo(184.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.87f, 191.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.87f, 4.87f);
        pathBuilder.arcToRelative(3.87f, 3.87f, 0.0f, false, true, -1.0f, 0.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.87f, -3.0f);
        pathBuilder.curveToRelative(-6.71f, -26.08f, -32.0f, -45.0f, -60.13f, -45.0f);
        pathBuilder.reflectiveCurveToRelative(-53.41f, 18.92f, -60.13f, 45.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.74f, -2.0f);
        pathBuilder.curveToRelative(5.92f, -23.0f, 24.57f, -41.14f, 47.52f, -48.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 40.7f, 0.0f);
        pathBuilder.curveTo(123.3f, 149.86f, 142.0f, 168.0f, 147.87f, 191.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 140.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 80.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userList = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
