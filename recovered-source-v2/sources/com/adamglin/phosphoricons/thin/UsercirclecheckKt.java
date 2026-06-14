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

/* compiled from: Usercirclecheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getUserCircleCheck", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclecheckKt {
    private static ImageVector _userCircleCheck;

    public static final ImageVector getUserCircleCheck(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _userCircleCheck;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleCheck", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(222.0f, 108.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.28f, 4.61f);
        pathBuilder.arcTo(93.4f, 93.4f, 0.0f, false, true, 220.0f, 128.0f);
        pathBuilder.arcToRelative(91.71f, 91.71f, 0.0f, false, true, -26.83f, 64.87f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, -34.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, -41.32f, 0.0f);
        pathBuilder.arcToRelative(75.61f, 75.61f, 0.0f, false, false, -44.51f, 34.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 36.0f);
        pathBuilder.arcToRelative(93.4f, 93.4f, 0.0f, false, true, 15.34f, 1.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.32f, -7.89f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcToRelative(101.78f, 101.78f, 0.0f, false, false, -1.38f, -16.66f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 222.0f, 108.05f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 120.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 92.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.87f, 198.42f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 118.26f, 0.0f);
        pathBuilder.arcToRelative(91.8f, 91.8f, 0.0f, false, true, -118.26f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.87f, 42.83f);
        pathBuilder.lineTo(202.87f, 74.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(200.0f, 66.34f);
        pathBuilder.lineToRelative(29.17f, -29.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
