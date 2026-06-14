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

/* compiled from: Starfour.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarFour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStarFour", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starFour", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarfourKt {
    private static ImageVector _starFour;

    public static final ImageVector getStarFour(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _starFour;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarFour", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.81f, 114.89f);
        pathBuilder.lineTo(164.5f, 91.5f);
        pathBuilder.lineTo(141.11f, 27.19f);
        pathBuilder.arcToRelative(13.95f, 13.95f, 0.0f, false, false, -26.22f, 0.0f);
        pathBuilder.lineTo(91.5f, 91.5f);
        pathBuilder.lineTo(27.19f, 114.89f);
        pathBuilder.arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, 26.22f);
        pathBuilder.lineTo(91.5f, 164.5f);
        pathBuilder.lineToRelative(23.39f, 64.31f);
        pathBuilder.arcToRelative(13.95f, 13.95f, 0.0f, false, false, 26.22f, 0.0f);
        pathBuilder.lineTo(164.5f, 164.5f);
        pathBuilder.lineToRelative(64.31f, -23.39f);
        pathBuilder.arcToRelative(13.95f, 13.95f, 0.0f, false, false, 0.0f, -26.22f);
        pathBuilder.close();
        pathBuilder.moveTo(224.71f, 129.89f);
        pathBuilder.lineTo(157.77f, 154.23f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.59f, 3.59f);
        pathBuilder.lineToRelative(-24.34f, 66.94f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.68f, 0.0f);
        pathBuilder.lineToRelative(-24.34f, -66.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.59f, -3.59f);
        pathBuilder.lineTo(31.29f, 129.84f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.68f);
        pathBuilder.lineToRelative(66.94f, -24.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, -3.59f);
        pathBuilder.lineToRelative(24.34f, -66.94f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.68f, 0.0f);
        pathBuilder.lineToRelative(24.34f, 66.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.59f, 3.59f);
        pathBuilder.lineToRelative(66.94f, 24.34f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starFour = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
