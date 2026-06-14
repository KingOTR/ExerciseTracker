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

/* compiled from: Starfour.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarFour", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStarFour", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starFour", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarfourKt {
    private static ImageVector _starFour;

    public static final ImageVector getStarFour(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(228.13f, 116.77f);
        pathBuilder.lineTo(162.94f, 93.06f);
        pathBuilder.lineTo(139.23f, 27.87f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, -22.46f, 0.0f);
        pathBuilder.lineTo(93.06f, 93.06f);
        pathBuilder.lineTo(27.87f, 116.77f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, 22.46f);
        pathBuilder.lineToRelative(65.19f, 23.71f);
        pathBuilder.lineToRelative(23.71f, 65.19f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 22.46f, 0.0f);
        pathBuilder.lineToRelative(23.71f, -65.19f);
        pathBuilder.lineToRelative(65.19f, -23.71f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 0.0f, -22.46f);
        pathBuilder.close();
        pathBuilder.moveTo(225.4f, 131.77f);
        pathBuilder.lineTo(158.4f, 156.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, 2.39f);
        pathBuilder.lineToRelative(-24.34f, 67.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.44f, 0.0f);
        pathBuilder.lineToRelative(-24.34f, -67.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.39f, -2.39f);
        pathBuilder.lineTo(30.6f, 131.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -7.44f);
        pathBuilder.lineTo(97.55f, 99.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, -2.39f);
        pathBuilder.lineTo(124.28f, 30.6f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.44f, 0.0f);
        pathBuilder.lineToRelative(24.34f, 66.95f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.39f, 2.39f);
        pathBuilder.lineToRelative(67.0f, 24.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 7.44f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starFour = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
