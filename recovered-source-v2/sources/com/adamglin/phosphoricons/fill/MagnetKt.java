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

/* compiled from: Magnet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Magnet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMagnet", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_magnet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagnetKt {
    private static ImageVector _magnet;

    public static final ImageVector getMagnet(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _magnet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Magnet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(207.0f, 50.25f);
        pathBuilder.arcTo(87.46f, 87.46f, 0.0f, false, false, 144.6f, 24.0f);
        pathBuilder.horizontalLineToRelative(-0.33f);
        pathBuilder.arcTo(87.48f, 87.48f, 0.0f, false, false, 82.0f, 49.81f);
        pathBuilder.lineTo(20.61f, 112.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.06f, 22.56f);
        pathBuilder.lineToRelative(28.66f, 28.66f);
        pathBuilder.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 11.32f, 4.69f);
        pathBuilder.horizontalLineToRelative(0.09f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.36f, -4.82f);
        pathBuilder.lineTo(133.0f, 100.69f);
        pathBuilder.arcToRelative(16.08f, 16.08f, 0.0f, false, true, 22.41f, -0.21f);
        pathBuilder.arcToRelative(15.6f, 15.6f, 0.0f, false, true, 4.73f, 11.19f);
        pathBuilder.arcToRelative(16.89f, 16.89f, 0.0f, false, true, -4.85f, 12.0f);
        pathBuilder.lineTo(93.0f, 183.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.17f, 22.79f);
        pathBuilder.lineToRelative(28.66f, 28.66f);
        pathBuilder.arcToRelative(16.06f, 16.06f, 0.0f, false, false, 22.52f, 0.12f);
        pathBuilder.lineTo(205.81f, 175.0f);
        pathBuilder.curveTo(240.26f, 140.5f, 240.79f, 84.56f, 207.0f, 50.25f);
        pathBuilder.close();
        pathBuilder.moveTo(60.65f, 151.89f);
        pathBuilder.lineTo(32.0f, 123.24f);
        pathBuilder.lineTo(61.42f, 93.43f);
        pathBuilder.lineTo(89.9f, 121.91f);
        pathBuilder.close();
        pathBuilder.moveTo(132.79f, 224.0f);
        pathBuilder.lineToRelative(-28.68f, -28.65f);
        pathBuilder.lineToRelative(30.13f, -29.13f);
        pathBuilder.lineToRelative(28.49f, 28.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _magnet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
