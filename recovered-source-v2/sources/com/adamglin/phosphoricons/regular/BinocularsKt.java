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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _binoculars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binoculars", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.2f, 151.87f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, -5.45f);
        pathBuilder.lineTo(193.26f, 51.8f);
        pathBuilder.arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, -2.44f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 55.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.verticalLineTo(55.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.arcToRelative(7.82f, 7.82f, 0.0f, false, false, -1.66f, 2.44f);
        pathBuilder.lineTo(21.15f, 146.4f);
        pathBuilder.arcToRelative(47.1f, 47.1f, 0.0f, false, false, -2.35f, 5.45f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, false, 112.0f, 168.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 93.2f, -16.13f);
        pathBuilder.close();
        pathBuilder.moveTo(76.71f, 59.75f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, -1.0f);
        pathBuilder.verticalLineToRelative(73.51f);
        pathBuilder.arcToRelative(47.9f, 47.9f, 0.0f, false, false, -46.79f, -9.92f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 200.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 64.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 58.74f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.29f, 1.0f);
        pathBuilder.lineToRelative(27.5f, 62.58f);
        pathBuilder.arcTo(47.9f, 47.9f, 0.0f, false, false, 160.0f, 132.25f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 200.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
