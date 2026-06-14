package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Users.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Users", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getUsers", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_users", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersKt {
    private static ImageVector _users;

    public static final ImageVector getUsers(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(125.18f, 156.94f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, false, -82.36f, 0.0f);
        pathBuilder.arcToRelative(100.23f, 100.23f, 0.0f, false, false, -39.49f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.35f, 14.2f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 122.64f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 19.36f, -14.2f);
        pathBuilder.arcTo(100.33f, 100.33f, 0.0f, false, false, 125.18f, 156.94f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 108.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, 40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 44.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(250.1f, 205.67f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.78f, -2.57f);
        pathBuilder.arcTo(76.31f, 76.31f, 0.0f, false, false, 172.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -10.3f, -78.67f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -6.16f, -23.19f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 57.64f, 110.8f);
        pathBuilder.arcToRelative(100.23f, 100.23f, 0.0f, false, true, 39.49f, 32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 250.1f, 205.67f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _users = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
