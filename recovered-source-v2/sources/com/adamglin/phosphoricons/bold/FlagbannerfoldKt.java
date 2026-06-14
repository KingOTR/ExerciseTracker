package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flagbannerfold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBannerFold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlagBannerFold", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBannerFold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerfoldKt {
    private static ImageVector _flagBannerFold;

    public static final ImageVector getFlagBannerFold(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(242.09f, 41.5f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 36.0f);
        pathBuilder.lineTo(152.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.92f, 7.0f);
        pathBuilder.lineToRelative(-7.72f, 17.0f);
        pathBuilder.lineTo(28.0f, 60.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.88f, 20.07f);
        pathBuilder.lineTo(51.78f, 116.0f);
        pathBuilder.lineTo(19.12f, 151.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(73.09f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 165.0f);
        pathBuilder.lineToRelative(7.71f, -17.0f);
        pathBuilder.horizontalLineToRelative(53.63f);
        pathBuilder.lineToRelative(-32.28f, 71.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 162.92f, 229.0f);
        pathBuilder.lineToRelative(80.0f, -176.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 242.09f, 41.5f);
        pathBuilder.close();
        pathBuilder.moveTo(55.13f, 148.0f);
        pathBuilder.lineToRelative(21.75f, -23.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -16.14f);
        pathBuilder.lineTo(55.13f, 84.0f);
        pathBuilder.horizontalLineToRelative(67.32f);
        pathBuilder.lineTo(93.36f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.27f, 124.0f);
        pathBuilder.lineTo(130.64f, 124.0f);
        pathBuilder.lineToRelative(29.09f, -64.0f);
        pathBuilder.horizontalLineToRelative(53.63f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBannerFold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
