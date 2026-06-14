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

/* compiled from: Trophy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Trophy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTrophy", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trophy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrophyKt {
    private static ImageVector _trophy;

    public static final ImageVector getTrophy(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _trophy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Trophy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 66.0f);
        pathBuilder.lineTo(206.0f, 66.0f);
        pathBuilder.lineTo(206.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(56.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(50.0f, 66.0f);
        pathBuilder.lineTo(24.0f, 66.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 80.0f);
        pathBuilder.lineTo(10.0f, 96.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f);
        pathBuilder.horizontalLineToRelative(5.14f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 122.0f, 189.75f);
        pathBuilder.lineTo(122.0f, 218.0f);
        pathBuilder.lineTo(96.0f, 218.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(134.0f, 218.0f);
        pathBuilder.lineTo(134.0f, 189.75f);
        pathBuilder.curveToRelative(32.44f, -2.52f, 59.43f, -25.3f, 68.62f, -55.75f);
        pathBuilder.lineTo(208.0f, 134.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f);
        pathBuilder.lineTo(246.0f, 80.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 122.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 22.0f, 96.0f);
        pathBuilder.lineTo(22.0f, 80.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.lineTo(50.0f, 78.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcToRelative(80.87f, 80.87f, 0.0f, false, false, 0.65f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 111.1f);
        pathBuilder.curveToRelative(0.0f, 36.62f, -29.38f, 66.63f, -65.5f, 66.9f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 112.0f);
        pathBuilder.lineTo(62.0f, 54.0f);
        pathBuilder.lineTo(194.0f, 54.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 96.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(-2.77f);
        pathBuilder.arcToRelative(78.45f, 78.45f, 0.0f, false, false, 0.77f, -10.9f);
        pathBuilder.lineTo(206.0f, 78.0f);
        pathBuilder.horizontalLineToRelative(26.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trophy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
