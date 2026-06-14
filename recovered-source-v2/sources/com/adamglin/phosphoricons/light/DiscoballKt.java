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

/* compiled from: Discoball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscoBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getDiscoBall", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discoBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscoballKt {
    private static ImageVector _discoBall;

    public static final ImageVector getDiscoBall(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _discoBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DiscoBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(118.0f, 66.23f);
        pathBuilder.lineTo(118.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(106.0f, 66.23f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.74f, 146.0f);
        pathBuilder.lineTo(149.87f, 146.0f);
        pathBuilder.curveToRelative(-1.3f, -32.59f, -13.0f, -54.15f, -22.36f, -66.35f);
        pathBuilder.arcTo(74.15f, 74.15f, 0.0f, false, true, 185.74f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.14f, 158.0f);
        pathBuilder.horizontalLineToRelative(51.72f);
        pathBuilder.curveToRelative(-1.63f, 37.69f, -18.33f, 58.46f, -25.86f, 66.0f);
        pathBuilder.curveTo(104.46f, 216.45f, 87.77f, 195.67f, 86.14f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.14f, 146.0f);
        pathBuilder.curveToRelative(1.63f, -37.69f, 18.33f, -58.46f, 25.86f, -66.0f);
        pathBuilder.curveToRelative(7.54f, 7.51f, 24.23f, 28.29f, 25.86f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.49f, 79.65f);
        pathBuilder.curveTo(87.11f, 91.85f, 75.43f, 113.41f, 74.13f, 146.0f);
        pathBuilder.lineTo(38.26f, 146.0f);
        pathBuilder.arcTo(74.15f, 74.15f, 0.0f, false, true, 96.49f, 79.65f);
        pathBuilder.close();
        pathBuilder.moveTo(38.26f, 158.0f);
        pathBuilder.lineTo(74.13f, 158.0f);
        pathBuilder.curveToRelative(1.3f, 32.59f, 13.0f, 54.15f, 22.36f, 66.35f);
        pathBuilder.arcTo(74.15f, 74.15f, 0.0f, false, true, 38.26f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.51f, 224.35f);
        pathBuilder.curveToRelative(9.38f, -12.2f, 21.06f, -33.76f, 22.36f, -66.35f);
        pathBuilder.horizontalLineToRelative(35.87f);
        pathBuilder.arcTo(74.15f, 74.15f, 0.0f, false, true, 127.51f, 224.35f);
        pathBuilder.close();
        pathBuilder.moveTo(254.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(238.0f, 94.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(226.0f, 94.0f);
        pathBuilder.lineTo(216.0f, 94.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.lineTo(226.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(238.0f, 82.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 254.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 46.0f);
        pathBuilder.lineTo(190.0f, 46.0f);
        pathBuilder.lineTo(190.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(178.0f, 46.0f);
        pathBuilder.lineTo(160.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(178.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(190.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discoBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
