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

/* compiled from: Usercircledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getUserCircleDashed", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercircledashedKt {
    private static ImageVector _userCircleDashed;

    public static final ImageVector getUserCircleDashed(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _userCircleDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(96.26f, 37.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 102.0f, 27.29f);
        pathBuilder.arcToRelative(104.11f, 104.11f, 0.0f, false, true, 52.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, 15.75f);
        pathBuilder.arcToRelative(8.15f, 8.15f, 0.0f, false, true, -2.0f, -0.26f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -44.0f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.26f, 37.0f);
        pathBuilder.close();
        pathBuilder.moveTo(33.35f, 110.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.85f, -5.57f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 22.0f, -38.09f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 53.79f, 55.14f);
        pathBuilder.arcToRelative(104.05f, 104.05f, 0.0f, false, false, -26.0f, 45.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 33.35f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.79f, 104.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.42f, -4.28f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, false, -26.0f, -45.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.41f, 11.22f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 212.79f, 104.45f);
        pathBuilder.close();
        pathBuilder.moveTo(222.66f, 146.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.85f, 5.58f);
        pathBuilder.arcToRelative(87.61f, 87.61f, 0.0f, false, true, -19.0f, 34.83f);
        pathBuilder.arcTo(79.75f, 79.75f, 0.0f, false, false, 172.0f, 165.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.83f, 0.31f);
        pathBuilder.arcToRelative(59.81f, 59.81f, 0.0f, false, true, -78.27f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.84f, -0.31f);
        pathBuilder.arcToRelative(79.52f, 79.52f, 0.0f, false, false, -22.0f, 21.12f);
        pathBuilder.arcToRelative(87.7f, 87.7f, 0.0f, false, true, -18.83f, -34.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.42f, 4.28f);
        pathBuilder.arcToRelative(104.07f, 104.07f, 0.0f, false, false, 200.46f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 222.66f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 164.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -44.0f, -44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
