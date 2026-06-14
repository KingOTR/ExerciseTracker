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

/* compiled from: Brandy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Brandy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBrandy", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_brandy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandyKt {
    private static ImageVector _brandy;

    public static final ImageVector getBrandy(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _brandy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Brandy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(95.63f, 95.63f, 0.0f, false, false, -15.53f, -52.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.7f, -3.63f);
        pathBuilder.horizontalLineTo(54.23f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.7f, 3.63f);
        pathBuilder.arcTo(95.63f, 95.63f, 0.0f, false, false, 32.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(96.12f, 96.12f, 0.0f, false, false, 88.0f, 95.66f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineTo(183.66f);
        pathBuilder.arcTo(96.12f, 96.12f, 0.0f, false, false, 224.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(58.7f, 48.0f);
        pathBuilder.horizontalLineTo(197.3f);
        pathBuilder.arcToRelative(79.52f, 79.52f, 0.0f, false, true, 10.3f, 32.0f);
        pathBuilder.horizontalLineTo(48.4f);
        pathBuilder.arcTo(79.52f, 79.52f, 0.0f, false, true, 58.7f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 168.0f);
        pathBuilder.arcTo(80.11f, 80.11f, 0.0f, false, true, 48.4f, 96.0f);
        pathBuilder.horizontalLineTo(207.6f);
        pathBuilder.arcTo(80.11f, 80.11f, 0.0f, false, true, 128.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _brandy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
