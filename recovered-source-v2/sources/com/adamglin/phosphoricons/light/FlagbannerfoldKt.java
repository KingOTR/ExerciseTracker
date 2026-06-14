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

/* compiled from: Flagbannerfold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBannerFold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlagBannerFold", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBannerFold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerfoldKt {
    private static ImageVector _flagBannerFold;

    public static final ImageVector getFlagBannerFold(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(237.0f, 44.75f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 42.0f);
        pathBuilder.lineTo(152.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.46f, 3.52f);
        pathBuilder.lineTo(137.23f, 66.0f);
        pathBuilder.lineTo(28.0f, 66.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.44f, 10.0f);
        pathBuilder.lineToRelative(36.33f, 40.0f);
        pathBuilder.lineTo(23.56f, 156.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 28.0f, 166.0f);
        pathBuilder.horizontalLineToRelative(73.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.46f, -3.52f);
        pathBuilder.lineTo(115.86f, 142.0f);
        pathBuilder.horizontalLineToRelative(66.82f);
        pathBuilder.lineToRelative(-36.14f, 79.52f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 7.94f);
        pathBuilder.arcTo(5.9f, 5.9f, 0.0f, false, false, 152.0f, 230.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.46f, -3.52f);
        pathBuilder.lineToRelative(80.0f, -176.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 237.0f, 44.75f);
        pathBuilder.close();
        pathBuilder.moveTo(97.23f, 154.0f);
        pathBuilder.lineTo(41.56f, 154.0f);
        pathBuilder.lineToRelative(30.88f, -34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.08f);
        pathBuilder.lineTo(41.56f, 78.0f);
        pathBuilder.horizontalLineToRelative(90.21f);
        pathBuilder.close();
        pathBuilder.moveTo(188.14f, 130.0f);
        pathBuilder.lineTo(121.32f, 130.0f);
        pathBuilder.lineToRelative(34.54f, -76.0f);
        pathBuilder.horizontalLineToRelative(66.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBannerFold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
