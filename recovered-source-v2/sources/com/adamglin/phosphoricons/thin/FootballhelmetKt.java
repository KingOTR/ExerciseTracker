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

/* compiled from: Footballhelmet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FootballHelmet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFootballHelmet", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footballHelmet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballhelmetKt {
    private static ImageVector _footballHelmet;

    public static final ImageVector getFootballHelmet(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _footballHelmet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FootballHelmet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 164.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 176.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(180.0f, 220.0f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, true, -11.51f, -8.6f);
        pathBuilder.lineTo(156.83f, 172.0f);
        pathBuilder.lineTo(126.55f, 172.0f);
        pathBuilder.lineToRelative(5.09f, 17.13f);
        pathBuilder.arcToRelative(2.13f, 2.13f, 0.0f, false, true, 0.07f, 0.27f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 204.0f);
        pathBuilder.lineTo(72.14f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.26f, -0.7f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 28.0f, 124.0f);
        pathBuilder.curveToRelative(0.0f, -52.19f, 42.47f, -95.23f, 94.63f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 220.0f, 124.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(153.35f, 132.0f);
        pathBuilder.lineToRelative(9.46f, 32.0f);
        pathBuilder.lineTo(216.0f, 164.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(123.93f, 191.25f);
        pathBuilder.lineToRelative(-15.57f, -52.37f);
        pathBuilder.arcToRelative(2.86f, 2.86f, 0.0f, false, true, -0.07f, -0.28f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 120.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -89.25f, -88.0f);
        pathBuilder.curveTo(74.93f, 36.67f, 36.0f, 76.13f, 36.0f, 124.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, 37.39f, 72.0f);
        pathBuilder.lineTo(120.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.93f, -4.75f);
        pathBuilder.close();
        pathBuilder.moveTo(154.46f, 164.0f);
        pathBuilder.lineTo(145.0f, 132.0f);
        pathBuilder.lineTo(120.0f, 132.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.93f, 4.75f);
        pathBuilder.lineToRelative(8.1f, 27.25f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(165.17f, 172.0f);
        pathBuilder.lineToRelative(11.0f, 37.13f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 180.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footballHelmet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
