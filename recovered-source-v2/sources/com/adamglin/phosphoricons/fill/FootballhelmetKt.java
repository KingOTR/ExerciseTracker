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

/* compiled from: Footballhelmet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FootballHelmet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFootballHelmet", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footballHelmet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootballhelmetKt {
    private static ImageVector _footballHelmet;

    public static final ImageVector getFootballHelmet(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 160.0f);
        pathBuilder.lineTo(165.8f, 160.0f);
        pathBuilder.lineToRelative(-7.09f, -24.0f);
        pathBuilder.lineTo(216.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, false, 122.58f, 24.0f);
        pathBuilder.curveTo(68.24f, 24.77f, 24.0f, 69.61f, 24.0f, 124.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, false, 67.62f, 206.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.52f, 1.4f);
        pathBuilder.lineTo(120.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.62f, -19.47f);
        pathBuilder.arcToRelative(5.44f, 5.44f, 0.0f, false, false, -0.15f, -0.54f);
        pathBuilder.lineToRelative(-3.56f, -12.0f);
        pathBuilder.horizontalLineToRelative(21.93f);
        pathBuilder.lineToRelative(10.79f, 36.53f);
        pathBuilder.arcTo(16.1f, 16.1f, 0.0f, false, false, 180.0f, 224.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(232.0f, 176.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.16f, 160.0f);
        pathBuilder.lineTo(120.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(22.0f);
        pathBuilder.lineToRelative(7.09f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 208.0f);
        pathBuilder.lineTo(180.0f, 208.0f);
        pathBuilder.lineToRelative(-9.46f, -32.0f);
        pathBuilder.lineTo(216.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footballHelmet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
