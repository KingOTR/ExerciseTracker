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

/* compiled from: Usercircleplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCirclePlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserCirclePlus", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCirclePlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercircleplusKt {
    private static ImageVector _userCirclePlus;

    public static final ImageVector getUserCirclePlus(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userCirclePlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCirclePlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 56.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(196.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(204.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(204.0f, 60.0f);
        pathBuilder.lineTo(204.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(196.0f, 60.0f);
        pathBuilder.lineTo(176.0f, 60.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.62f, 111.34f);
        pathBuilder.arcToRelative(99.89f, 99.89f, 0.0f, true, true, -82.0f, -82.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.32f, 7.89f);
        pathBuilder.arcTo(93.4f, 93.4f, 0.0f, false, false, 128.0f, 36.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 62.83f, 192.87f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, -34.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.32f, 0.0f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, true, 44.51f, 34.0f);
        pathBuilder.arcTo(91.69f, 91.69f, 0.0f, false, false, 220.0f, 128.0f);
        pathBuilder.arcToRelative(93.58f, 93.58f, 0.0f, false, false, -1.27f, -15.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.89f, -1.32f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(91.61f, 91.61f, 0.0f, false, false, 59.14f, -21.58f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.27f, 0.0f);
        pathBuilder.arcTo(91.56f, 91.56f, 0.0f, false, false, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCirclePlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
