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

/* compiled from: Flagbannerfold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBannerFold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlagBannerFold", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBannerFold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerfoldKt {
    private static ImageVector _flagBannerFold;

    public static final ImageVector getFlagBannerFold(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flagBannerFold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagBannerFold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.36f, 45.83f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 44.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.64f, 2.34f);
        pathBuilder.lineTo(138.52f, 68.0f);
        pathBuilder.lineTo(28.0f, 68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.0f, 6.69f);
        pathBuilder.lineTo(62.59f, 116.0f);
        pathBuilder.lineTo(25.0f, 157.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(73.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, -2.35f);
        pathBuilder.lineTo(114.58f, 140.0f);
        pathBuilder.horizontalLineToRelative(71.21f);
        pathBuilder.lineToRelative(-37.43f, 82.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 5.3f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, -2.35f);
        pathBuilder.lineToRelative(80.0f, -176.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 235.36f, 45.83f);
        pathBuilder.close();
        pathBuilder.moveTo(98.52f, 156.0f);
        pathBuilder.lineTo(37.0f, 156.0f);
        pathBuilder.lineTo(71.0f, 118.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.38f);
        pathBuilder.lineTo(37.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(97.84f);
        pathBuilder.close();
        pathBuilder.moveTo(189.42f, 132.0f);
        pathBuilder.lineTo(118.21f, 132.0f);
        pathBuilder.lineToRelative(36.37f, -80.0f);
        pathBuilder.horizontalLineToRelative(71.21f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBannerFold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
