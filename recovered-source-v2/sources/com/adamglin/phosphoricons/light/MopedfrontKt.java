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

/* compiled from: Mopedfront.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MopedFront", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMopedFront", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mopedFront", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MopedfrontKt {
    private static ImageVector _mopedFront;

    public static final ImageVector getMopedFront(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mopedFront;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MopedFront", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 42.0f);
        pathBuilder.lineTo(165.52f, 42.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -75.0f, 0.0f);
        pathBuilder.lineTo(48.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(90.48f, 54.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 14.71f, 24.37f);
        pathBuilder.arcTo(62.09f, 62.09f, 0.0f, false, false, 66.0f, 136.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(98.0f, 214.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(190.0f, 136.0f);
        pathBuilder.arcToRelative(62.09f, 62.09f, 0.0f, false, false, -39.19f, -57.63f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 165.52f, 54.0f);
        pathBuilder.lineTo(208.0f, 54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 216.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.lineTo(110.0f, 168.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.0f, 136.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(158.0f, 202.0f);
        pathBuilder.lineTo(158.0f, 168.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -60.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.lineTo(80.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(78.0f, 136.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, 100.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 74.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 74.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mopedFront = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
