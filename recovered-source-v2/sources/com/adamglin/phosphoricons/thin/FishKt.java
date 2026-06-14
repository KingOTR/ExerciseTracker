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

/* compiled from: Fish.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fish", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFish", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fish", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FishKt {
    private static ImageVector _fish;

    public static final ImageVector getFish(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(164.0f, 76.05f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 164.0f, 76.05f);
        pathBuilder.close();
        pathBuilder.moveTo(213.23f, 141.73f);
        pathBuilder.curveToRelative(-19.0f, 34.15f, -54.76f, 52.35f, -106.43f, 54.13f);
        pathBuilder.lineToRelative(-23.0f, 53.72f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 80.1f, 252.0f);
        pathBuilder.horizontalLineToRelative(-0.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.59f, -2.89f);
        pathBuilder.lineTo(60.84f, 195.17f);
        pathBuilder.lineTo(6.9f, 179.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.47f, -7.52f);
        pathBuilder.lineToRelative(53.72f, -23.0f);
        pathBuilder.curveTo(62.0f, 97.6f, 80.16f, 61.81f, 114.3f, 42.85f);
        pathBuilder.curveToRelative(45.5f, -25.27f, 103.78f, -11.0f, 106.76f, -9.27f);
        pathBuilder.arcTo(4.08f, 4.08f, 0.0f, false, true, 222.48f, 35.0f);
        pathBuilder.curveToRelative(0.87f, 1.48f, 4.72f, 16.94f, 5.42f, 36.95f);
        pathBuilder.curveTo(228.54f, 90.57f, 226.52f, 117.79f, 213.23f, 141.73f);
        pathBuilder.close();
        pathBuilder.moveTo(172.77f, 171.5f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 132.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, true, 84.53f, 83.29f);
        pathBuilder.curveToRelative(-10.27f, 18.0f, -15.79f, 40.95f, -16.46f, 68.71f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.42f, 3.58f);
        pathBuilder.lineTo(19.92f, 175.14f);
        pathBuilder.lineToRelative(45.26f, 13.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.74f, 2.74f);
        pathBuilder.lineToRelative(12.93f, 45.25f);
        pathBuilder.lineToRelative(19.6f, -45.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.58f, -2.43f);
        pathBuilder.curveTo(131.81f, 187.28f, 154.78f, 181.77f, 172.77f, 171.5f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 77.25f);
        pathBuilder.arcToRelative(169.58f, 169.58f, 0.0f, false, false, -4.2f, -37.0f);
        pathBuilder.arcToRelative(169.46f, 169.46f, 0.0f, false, false, -37.0f, -4.2f);
        pathBuilder.curveToRelative(-18.81f, -0.12f, -45.93f, 3.0f, -68.2f, 18.49f);
        pathBuilder.arcTo(85.22f, 85.22f, 0.0f, false, false, 92.24f, 71.84f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 43.58f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.36f, 4.36f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 44.06f, 43.56f);
        pathBuilder.arcToRelative(85.31f, 85.31f, 0.0f, false, false, 17.26f, -18.33f);
        pathBuilder.curveTo(210.0f, 133.16f, 220.18f, 111.35f, 220.0f, 77.25f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fish = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
