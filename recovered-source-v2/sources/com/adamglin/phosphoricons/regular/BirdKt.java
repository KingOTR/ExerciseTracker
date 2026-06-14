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

/* compiled from: Bird.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bird", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBird", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bird", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BirdKt {
    private static ImageVector _bird;

    public static final ImageVector getBird(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _bird;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bird", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.56f, 6.66f);
        pathBuilder.lineTo(216.0f, 100.28f);
        pathBuilder.lineTo(216.0f, 120.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, true, 112.0f, 224.0f);
        pathBuilder.lineTo(24.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.49f, -26.0f);
        pathBuilder.lineToRelative(0.1f, -0.12f);
        pathBuilder.lineTo(96.0f, 96.63f);
        pathBuilder.lineTo(96.0f, 76.89f);
        pathBuilder.curveTo(96.0f, 43.47f, 122.79f, 16.16f, 155.71f, 16.0f);
        pathBuilder.lineTo(156.0f, 16.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, 57.21f, 41.86f);
        pathBuilder.lineToRelative(23.23f, 15.48f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.58f, 80.0f);
        pathBuilder.lineTo(201.9f, 69.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.31f, -4.64f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 156.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(-0.22f);
        pathBuilder.curveTo(131.64f, 32.12f, 112.0f, 52.25f, 112.0f, 76.89f);
        pathBuilder.lineTo(112.0f, 99.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.85f, 5.13f);
        pathBuilder.lineTo(24.0f, 208.0f);
        pathBuilder.horizontalLineToRelative(26.9f);
        pathBuilder.lineToRelative(70.94f, -85.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.29f, 10.24f);
        pathBuilder.lineTo(71.75f, 208.0f);
        pathBuilder.lineTo(112.0f, 208.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, -88.0f);
        pathBuilder.lineTo(200.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.56f, -6.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bird = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
