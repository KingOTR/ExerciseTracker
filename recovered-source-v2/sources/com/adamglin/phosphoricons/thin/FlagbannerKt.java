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

/* compiled from: Flagbanner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBanner", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlagBanner", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBanner", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerKt {
    private static ImageVector _flagBanner;

    public static final ImageVector getFlagBanner(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flagBanner;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagBanner", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.38f, 53.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 52.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f);
        pathBuilder.lineTo(82.34f, 104.0f);
        pathBuilder.lineTo(37.17f, 149.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 156.0f);
        pathBuilder.horizontalLineTo(180.0f);
        pathBuilder.lineToRelative(-31.56f, 66.28f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, 5.33f);
        pathBuilder.arcTo(3.92f, 3.92f, 0.0f, false, false, 152.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.61f, -2.28f);
        pathBuilder.lineToRelative(80.0f, -168.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 235.38f, 53.86f);
        pathBuilder.close();
        pathBuilder.moveTo(183.76f, 148.0f);
        pathBuilder.horizontalLineTo(49.66f);
        pathBuilder.lineToRelative(41.17f, -41.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f);
        pathBuilder.lineTo(49.66f, 60.0f);
        pathBuilder.horizontalLineToRelative(176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBanner = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
