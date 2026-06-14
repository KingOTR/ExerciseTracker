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

/* compiled from: Usercirclegear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"UserCircleGear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getUserCircleGear", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_userCircleGear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UsercirclegearKt {
    private static ImageVector _userCircleGear;

    public static final ImageVector getUserCircleGear(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _userCircleGear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("UserCircleGear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.25f, 64.8f);
        pathBuilder.lineToRelative(-5.92f, -3.41f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -10.78f);
        pathBuilder.lineToRelative(5.92f, -3.41f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.4f);
        pathBuilder.lineToRelative(-5.93f, 3.43f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 206.0f, 34.84f);
        pathBuilder.lineTo(206.0f, 28.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(6.84f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, -9.32f, 5.39f);
        pathBuilder.lineToRelative(-5.93f, -3.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.4f);
        pathBuilder.lineToRelative(5.92f, 3.41f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, 10.78f);
        pathBuilder.lineToRelative(-5.92f, 3.41f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 10.4f);
        pathBuilder.lineToRelative(5.93f, -3.43f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, false, 194.0f, 77.16f);
        pathBuilder.lineTo(194.0f, 84.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(206.0f, 77.16f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 9.32f, -5.39f);
        pathBuilder.lineToRelative(5.93f, 3.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -10.4f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 66.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.68f, 106.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.92f, 6.91f);
        pathBuilder.arcTo(91.76f, 91.76f, 0.0f, false, true, 218.0f, 128.0f);
        pathBuilder.arcToRelative(89.65f, 89.65f, 0.0f, false, true, -24.49f, 61.64f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, -31.38f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, false, -51.0f, 0.0f);
        pathBuilder.arcToRelative(77.53f, 77.53f, 0.0f, false, false, -40.0f, 31.38f);
        pathBuilder.arcTo(89.95f, 89.95f, 0.0f, false, true, 128.0f, 38.0f);
        pathBuilder.arcToRelative(91.66f, 91.66f, 0.0f, false, true, 15.0f, 1.24f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 2.0f, -11.83f);
        pathBuilder.arcToRelative(102.0f, 102.0f, 0.0f, true, false, 50.0f, 177.44f);
        pathBuilder.curveToRelative(0.65f, 1.36f, 1.68f, 0.0f, 2.34f, -2.11f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, false, false, 228.59f, 111.0f);
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
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _userCircleGear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
