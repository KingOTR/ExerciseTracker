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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(237.22f, 151.9f);
        pathBuilder.lineToRelative(0.0f, -0.1f);
        pathBuilder.arcToRelative(1.42f, 1.42f, 0.0f, false, false, -0.07f, -0.22f);
        pathBuilder.arcToRelative(48.46f, 48.46f, 0.0f, false, false, -2.31f, -5.3f);
        pathBuilder.lineTo(193.27f, 51.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.67f, -2.44f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 55.0f);
        pathBuilder.lineTo(144.0f, 80.0f);
        pathBuilder.lineTo(112.0f, 80.0f);
        pathBuilder.lineTo(112.0f, 55.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.67f, 2.44f);
        pathBuilder.lineTo(21.2f, 146.28f);
        pathBuilder.arcToRelative(48.46f, 48.46f, 0.0f, false, false, -2.31f, 5.3f);
        pathBuilder.arcToRelative(1.72f, 1.72f, 0.0f, false, false, -0.07f, 0.21f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.11f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.32f, 32.51f);
        pathBuilder.arcToRelative(47.49f, 47.49f, 0.0f, false, false, 2.9f, -16.59f);
        pathBuilder.lineTo(112.04f, 96.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(71.83f);
        pathBuilder.arcToRelative(47.49f, 47.49f, 0.0f, false, false, 2.9f, 16.59f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 90.32f, -32.51f);
        pathBuilder.close();
        pathBuilder.moveTo(94.07f, 178.9f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -60.2f, -21.71f);
        pathBuilder.lineToRelative(1.81f, -4.13f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 167.88f);
        pathBuilder.lineTo(96.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 94.07f, 178.94f);
        pathBuilder.close();
        pathBuilder.moveTo(203.0f, 198.07f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 160.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.verticalLineToRelative(-0.11f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 60.32f, -14.78f);
        pathBuilder.lineToRelative(1.81f, 4.13f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 203.0f, 198.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
