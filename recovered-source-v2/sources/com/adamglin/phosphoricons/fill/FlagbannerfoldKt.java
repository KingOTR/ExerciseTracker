package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flagbannerfold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBannerFold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFlagBannerFold", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBannerFold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerfoldKt {
    private static ImageVector _flagBannerFold;

    public static final ImageVector getFlagBannerFold(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(131.79f, 69.65f);
        pathBuilder.lineToRelative(-43.63f, 96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 84.52f, 168.0f);
        pathBuilder.horizontalLineTo(28.23f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.58f, -3.13f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.43f, -10.25f);
        pathBuilder.lineTo(57.19f, 116.0f);
        pathBuilder.lineTo(22.08f, 77.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.43f, -10.26f);
        pathBuilder.arcTo(8.22f, 8.22f, 0.0f, false, true, 28.23f, 64.0f);
        pathBuilder.horizontalLineToRelative(99.92f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 131.79f, 69.65f);
        pathBuilder.close();
        pathBuilder.moveTo(237.56f, 42.24f);
        pathBuilder.arcTo(8.3f, 8.3f, 0.0f, false, false, 231.77f, 40.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.28f, 4.69f);
        pathBuilder.lineToRelative(-42.57f, 93.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, 5.66f);
        pathBuilder.horizontalLineToRelative(57.79f);
        pathBuilder.lineToRelative(-34.86f, 76.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.56f, 6.62f);
        pathBuilder.lineToRelative(80.0f, -176.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.56f, 42.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBannerFold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
