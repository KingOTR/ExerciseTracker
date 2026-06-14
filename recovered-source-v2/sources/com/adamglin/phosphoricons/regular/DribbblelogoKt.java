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

/* compiled from: Dribbblelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DribbbleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDribbbleLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dribbbleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DribbblelogoKt {
    private static ImageVector _dribbbleLogo;

    public static final ImageVector getDribbbleLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _dribbbleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DribbbleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.65f, 120.18f);
        pathBuilder.quadTo(211.83f, 120.0f, 208.0f, 120.0f);
        pathBuilder.arcToRelative(168.58f, 168.58f, 0.0f, false, false, -43.94f, 5.84f);
        pathBuilder.arcTo(166.52f, 166.52f, 0.0f, false, false, 150.61f, 96.0f);
        pathBuilder.arcToRelative(168.32f, 168.32f, 0.0f, false, false, 38.2f, -31.55f);
        pathBuilder.arcTo(87.78f, 87.78f, 0.0f, false, true, 215.65f, 120.18f);
        pathBuilder.close();
        pathBuilder.moveTo(176.28f, 54.46f);
        pathBuilder.arcTo(151.75f, 151.75f, 0.0f, false, true, 142.0f, 82.52f);
        pathBuilder.arcToRelative(169.22f, 169.22f, 0.0f, false, false, -38.63f, -39.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 73.0f, 10.94f);
        pathBuilder.close();
        pathBuilder.moveTo(85.65f, 50.88f);
        pathBuilder.arcToRelative(153.13f, 153.13f, 0.0f, false, true, 42.0f, 39.18f);
        pathBuilder.arcTo(151.82f, 151.82f, 0.0f, false, true, 64.0f, 104.0f);
        pathBuilder.arcToRelative(154.19f, 154.19f, 0.0f, false, true, -20.28f, -1.35f);
        pathBuilder.arcTo(88.39f, 88.39f, 0.0f, false, true, 85.65f, 50.88f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 128.0f);
        pathBuilder.arcToRelative(87.73f, 87.73f, 0.0f, false, true, 0.53f, -9.64f);
        pathBuilder.arcTo(168.85f, 168.85f, 0.0f, false, false, 64.0f, 120.0f);
        pathBuilder.arcToRelative(167.84f, 167.84f, 0.0f, false, false, 72.52f, -16.4f);
        pathBuilder.arcToRelative(150.82f, 150.82f, 0.0f, false, true, 12.31f, 27.13f);
        pathBuilder.arcToRelative(167.11f, 167.11f, 0.0f, false, false, -24.59f, 11.6f);
        pathBuilder.arcToRelative(169.22f, 169.22f, 0.0f, false, false, -55.07f, 51.06f);
        pathBuilder.arcTo(87.8f, 87.8f, 0.0f, false, true, 40.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 203.0f);
        pathBuilder.arcToRelative(152.91f, 152.91f, 0.0f, false, true, 50.24f, -46.79f);
        pathBuilder.arcToRelative(148.81f, 148.81f, 0.0f, false, true, 20.95f, -10.0f);
        pathBuilder.arcToRelative(152.48f, 152.48f, 0.0f, false, true, 3.73f, 33.47f);
        pathBuilder.arcToRelative(152.93f, 152.93f, 0.0f, false, true, -3.49f, 32.56f);
        pathBuilder.arcTo(87.92f, 87.92f, 0.0f, false, true, 82.0f, 203.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.06f, 204.73f);
        pathBuilder.arcToRelative(170.0f, 170.0f, 0.0f, false, false, 1.86f, -25.0f);
        pathBuilder.arcToRelative(168.69f, 168.69f, 0.0f, false, false, -4.45f, -38.47f);
        pathBuilder.arcTo(152.31f, 152.31f, 0.0f, false, true, 208.0f, 136.0f);
        pathBuilder.quadToRelative(3.8f, 0.0f, 7.61f, 0.19f);
        pathBuilder.arcTo(88.13f, 88.13f, 0.0f, false, true, 171.06f, 204.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dribbbleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
