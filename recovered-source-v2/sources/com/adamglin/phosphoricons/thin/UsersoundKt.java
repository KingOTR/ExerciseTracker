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

/* compiled from: Usersound.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserSound", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserSound", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userSound", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsersoundKt {
    private static ImageVector _userSound;

    public static final ImageVector getUserSound(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(133.17f, 166.84f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, true, false, -50.34f, 0.0f);
        pathBuilder.curveToRelative(-23.76f, 5.46f, -45.18f, 18.69f, -61.89f, 38.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.12f, 5.14f);
        pathBuilder.curveTo(48.0f, 185.7f, 76.71f, 172.0f, 108.0f, 172.0f);
        pathBuilder.reflectiveCurveToRelative(60.0f, 13.7f, 80.94f, 38.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.12f, -5.14f);
        pathBuilder.curveTo(178.35f, 185.53f, 156.93f, 172.3f, 133.17f, 166.84f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 108.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, true, 56.0f, 56.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 52.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(203.68f, 67.17f);
        pathBuilder.arcToRelative(104.35f, 104.35f, 0.0f, false, true, 0.0f, 81.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.68f, 2.43f);
        pathBuilder.arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.57f, -0.32f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.11f, -5.25f);
        pathBuilder.arcToRelative(96.32f, 96.32f, 0.0f, false, false, 0.0f, -75.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.36f, -3.14f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 108.0f);
        pathBuilder.arcToRelative(135.2f, 135.2f, 0.0f, false, true, -11.0f, 53.58f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.68f, 2.42f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.57f, -0.32f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.1f, -5.26f);
        pathBuilder.arcToRelative(128.44f, 128.44f, 0.0f, false, false, 0.0f, -100.84f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 233.0f, 54.42f);
        pathBuilder.arcTo(135.2f, 135.2f, 0.0f, false, true, 244.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userSound = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
