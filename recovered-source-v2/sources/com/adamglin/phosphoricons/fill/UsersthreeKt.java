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

/* compiled from: Usersthree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UsersThree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUsersThree", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_usersThree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersthreeKt {
    private static ImageVector _usersThree;

    public static final ImageVector getUsersThree(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _usersThree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UsersThree", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(64.12f, 147.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.2f);
        pathBuilder.lineTo(16.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -6.17f);
        pathBuilder.arcToRelative(8.35f, 8.35f, 0.0f, false, true, 1.62f, -6.93f);
        pathBuilder.arcTo(67.79f, 67.79f, 0.0f, false, true, 37.0f, 117.51f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 66.46f, -35.8f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -2.27f, 4.18f);
        pathBuilder.arcTo(64.08f, 64.08f, 0.0f, false, false, 64.0f, 144.0f);
        pathBuilder.curveTo(64.0f, 145.28f, 64.0f, 146.54f, 64.12f, 147.8f);
        pathBuilder.close();
        pathBuilder.moveTo(246.12f, 138.89f);
        pathBuilder.arcTo(67.76f, 67.76f, 0.0f, false, false, 219.0f, 117.51f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -66.46f, -35.8f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, false, 2.27f, 4.18f);
        pathBuilder.arcTo(64.08f, 64.08f, 0.0f, false, true, 192.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, 1.28f, 0.0f, 2.54f, -0.12f, 3.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.2f);
        pathBuilder.lineTo(240.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, -6.17f);
        pathBuilder.arcTo(8.33f, 8.33f, 0.0f, false, false, 246.17f, 138.89f);
        pathBuilder.close();
        pathBuilder.moveTo(157.12f, 182.07f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -58.37f, 0.0f);
        pathBuilder.arcTo(72.13f, 72.13f, 0.0f, false, false, 65.07f, 212.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 224.0f);
        pathBuilder.lineTo(184.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.93f, -12.0f);
        pathBuilder.arcTo(72.15f, 72.15f, 0.0f, false, false, 157.19f, 182.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _usersThree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
