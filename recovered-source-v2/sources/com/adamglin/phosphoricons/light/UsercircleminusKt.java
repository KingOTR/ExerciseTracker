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

/* compiled from: Usercircleminus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleMinus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUserCircleMinus", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleMinus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercircleminusKt {
    private static ImageVector _userCircleMinus;

    public static final ImageVector getUserCircleMinus(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _userCircleMinus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleMinus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(170.0f, 56.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(176.0f, 62.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 170.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.19f, 94.0f);
        pathBuilder.arcTo(101.9f, 101.9f, 0.0f, true, true, 145.0f, 27.41f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.0f, 11.83f);
        pathBuilder.arcTo(91.66f, 91.66f, 0.0f, false, false, 128.0f, 38.0f);
        pathBuilder.arcTo(89.95f, 89.95f, 0.0f, false, false, 62.49f, 189.64f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, true, 40.0f, -31.38f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, 51.0f, 0.0f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, true, 40.0f, 31.38f);
        pathBuilder.arcTo(90.0f, 90.0f, 0.0f, false, false, 212.88f, 98.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.31f, -4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 154.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, false, -34.0f, -34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, false, 128.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcTo(89.58f, 89.58f, 0.0f, false, false, 184.56f, 198.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, false, -113.12f, 0.0f);
        pathBuilder.arcTo(89.58f, 89.58f, 0.0f, false, false, 128.0f, 218.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleMinus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
