package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Flagbanner.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagBanner", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlagBanner", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagBanner", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagbannerKt {
    private static ImageVector _flagBanner;

    public static final ImageVector getFlagBanner(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(238.76f, 51.73f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 48.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f);
        pathBuilder.lineTo(76.69f, 104.0f);
        pathBuilder.lineTo(34.34f, 146.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 160.0f);
        pathBuilder.horizontalLineTo(173.62f);
        pathBuilder.lineToRelative(-28.84f, 60.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.44f, 6.88f);
        pathBuilder.lineToRelative(80.0f, -168.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 238.76f, 51.73f);
        pathBuilder.close();
        pathBuilder.moveTo(181.23f, 144.0f);
        pathBuilder.horizontalLineTo(59.31f);
        pathBuilder.lineToRelative(34.35f, -34.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f);
        pathBuilder.lineTo(59.31f, 64.0f);
        pathBuilder.horizontalLineToRelative(160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagBanner = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
