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

/* compiled from: Fish.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fish", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFish", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fish", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishKt {
    private static ImageVector _fish;

    public static final ImageVector getFish(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _fish;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fish", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(166.0f, 76.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 166.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.0f, 142.67f);
        pathBuilder.curveToRelative(-19.17f, 34.54f, -55.11f, 53.08f, -106.85f, 55.14f);
        pathBuilder.lineTo(85.62f, 250.36f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 80.1f, 254.0f);
        pathBuilder.horizontalLineToRelative(-0.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.39f, -4.34f);
        pathBuilder.lineTo(59.22f, 196.77f);
        pathBuilder.lineTo(6.35f, 181.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.71f, -11.29f);
        pathBuilder.lineTo(58.2f, 147.85f);
        pathBuilder.curveTo(60.28f, 96.13f, 78.81f, 60.2f, 113.33f, 41.0f);
        pathBuilder.curveTo(159.56f, 15.34f, 219.0f, 30.0f, 222.09f, 31.78f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.12f, 2.11f);
        pathBuilder.curveTo(226.0f, 36.94f, 240.67f, 96.38f, 215.0f, 142.65f);
        pathBuilder.close();
        pathBuilder.moveTo(167.0f, 172.31f);
        pathBuilder.arcTo(50.06f, 50.06f, 0.0f, false, true, 130.0f, 126.0f);
        pathBuilder.arcTo(50.09f, 50.09f, 0.0f, false, true, 83.71f, 89.0f);
        pathBuilder.curveToRelative(-8.46f, 16.93f, -13.0f, 38.0f, -13.63f, 63.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.64f, 5.38f);
        pathBuilder.lineTo(25.88f, 174.74f);
        pathBuilder.lineToRelative(39.85f, 11.41f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.12f, 4.12f);
        pathBuilder.lineToRelative(11.38f, 39.85f);
        pathBuilder.lineToRelative(17.39f, -40.56f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.37f, -3.64f);
        pathBuilder.curveTo(129.0f, 185.33f, 150.05f, 180.76f, 167.0f, 172.29f);
        pathBuilder.close();
        pathBuilder.moveTo(218.0f, 77.78f);
        pathBuilder.arcToRelative(171.1f, 171.1f, 0.0f, false, false, -3.86f, -35.92f);
        pathBuilder.arcTo(170.78f, 170.78f, 0.0f, false, false, 178.25f, 38.0f);
        pathBuilder.lineTo(178.0f, 38.0f);
        pathBuilder.curveToRelative(-18.52f, 0.0f, -45.0f, 3.22f, -66.67f, 18.47f);
        pathBuilder.arcTo(83.53f, 83.53f, 0.0f, false, false, 94.17f, 72.56f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 41.47f, 41.25f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.54f, 6.55f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 41.28f, 41.46f);
        pathBuilder.arcToRelative(83.13f, 83.13f, 0.0f, false, false, 16.07f, -17.07f);
        pathBuilder.curveTo(214.87f, 123.0f, 218.05f, 96.31f, 218.0f, 77.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fish = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
