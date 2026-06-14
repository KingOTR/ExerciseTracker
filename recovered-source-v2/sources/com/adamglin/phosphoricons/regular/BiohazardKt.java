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

/* compiled from: Biohazard.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Biohazard", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBiohazard", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_biohazard", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BiohazardKt {
    private static ImageVector _biohazard;

    public static final ImageVector getBiohazard(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _biohazard;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Biohazard", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(185.68f, 104.28f);
        pathBuilder.quadToRelative(-1.4f, -2.88f, -3.06f, -5.6f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -26.92f, -78.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.4f, 14.19f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 170.72f, 84.4f);
        pathBuilder.arcToRelative(63.85f, 63.85f, 0.0f, false, false, -85.46f, 0.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 107.7f, 34.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.4f, -14.19f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -26.93f, 78.0f);
        pathBuilder.arcToRelative(62.59f, 62.59f, 0.0f, false, false, -3.05f, 5.58f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 16.0f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(44.09f, 44.09f, 0.0f, false, true, 32.89f, -42.58f);
        pathBuilder.arcTo(63.94f, 63.94f, 0.0f, false, false, 109.0f, 193.11f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -56.65f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.62f, 13.47f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 126.74f, 196.0f);
        pathBuilder.lineToRelative(1.26f, 0.0f);
        pathBuilder.lineToRelative(1.26f, 0.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 83.05f, 18.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.62f, -13.47f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -56.65f, -8.0f);
        pathBuilder.arcToRelative(63.94f, 63.94f, 0.0f, false, false, 44.07f, -71.69f);
        pathBuilder.arcTo(44.09f, 44.09f, 0.0f, false, true, 224.0f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 185.68f, 104.28f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 84.0f);
        pathBuilder.arcToRelative(47.91f, 47.91f, 0.0f, false, true, 35.56f, 15.79f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -71.13f, 0.0f);
        pathBuilder.arcTo(47.89f, 47.89f, 0.0f, false, true, 128.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.12f, 133.92f);
        pathBuilder.lineTo(128.0f, 134.12f);
        pathBuilder.lineTo(127.88f, 133.92f);
        pathBuilder.horizontalLineToRelative(0.24f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 132.0f);
        pathBuilder.arcToRelative(47.6f, 47.6f, 0.0f, false, true, 1.44f, -11.65f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 36.0f, 58.46f);
        pathBuilder.arcTo(48.07f, 48.07f, 0.0f, false, true, 80.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.57f, 178.81f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 36.0f, -58.46f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -36.0f, 58.46f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _biohazard = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
