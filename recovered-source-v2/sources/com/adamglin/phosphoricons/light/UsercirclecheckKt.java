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

/* compiled from: Usercirclecheck.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleCheck", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUserCircleCheck", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleCheck", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclecheckKt {
    private static ImageVector _userCircleCheck;

    public static final ImageVector getUserCircleCheck(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(221.68f, 106.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.92f, 6.91f);
        pathBuilder.arcTo(91.66f, 91.66f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.arcToRelative(89.65f, 89.65f, 0.0f, false, true, -24.49f, 61.64f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, -31.38f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, 31.38f);
        pathBuilder.arcTo(89.95f, 89.95f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.arcToRelative(91.57f, 91.57f, 0.0f, false, true, 15.0f, 1.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 2.0f, -11.83f);
        pathBuilder.arcToRelative(101.9f, 101.9f, 0.0f, true, false, 83.6f, 83.6f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 221.68f, 106.08f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 120.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(71.44f, 198.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, true, 113.12f, 0.0f);
        pathBuilder.arcToRelative(89.8f, 89.8f, 0.0f, false, true, -113.12f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.24f, 44.24f);
        pathBuilder.lineToRelative(-32.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.lineTo(200.0f, 63.51f);
        pathBuilder.lineToRelative(27.76f, -27.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 8.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleCheck = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
