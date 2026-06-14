package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Island.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Island", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getIsland", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_island", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IslandKt {
    private static ImageVector _island;

    public static final ImageVector getIsland(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _island;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Island", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(32.0f, 140.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 32.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 192.0f);
        pathBuilder.curveToRelative(-64.0f, 0.0f, -104.0f, 32.0f, -104.0f, 32.0f);
        pathBuilder.lineTo(232.0f, 224.0f);
        pathBuilder.reflectiveCurveTo(192.0f, 192.0f, 128.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(238.25f, 229.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 227.0f, 230.25f);
        pathBuilder2.curveToRelative(-0.37f, -0.3f, -38.82f, -30.25f, -99.0f, -30.25f);
        pathBuilder2.reflectiveCurveTo(29.36f, 230.0f, 29.0f, 230.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.0f, -12.51f);
        pathBuilder2.curveToRelative(1.63f, -1.3f, 38.52f, -30.26f, 98.29f, -33.45f);
        pathBuilder2.arcTo(119.94f, 119.94f, 0.0f, false, true, 114.0f, 146.37f);
        pathBuilder2.curveToRelative(1.74f, -21.71f, 10.92f, -50.63f, 43.0f, -72.48f);
        pathBuilder2.arcToRelative(66.19f, 66.19f, 0.0f, false, false, -15.0f, -1.87f);
        pathBuilder2.lineToRelative(-1.67f, 0.0f);
        pathBuilder2.curveToRelative(-19.0f, 0.62f, -30.94f, 11.71f, -36.5f, 33.92f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 112.0f);
        pathBuilder2.arcToRelative(7.64f, 7.64f, 0.0f, false, true, -1.94f, -0.24f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, -9.7f);
        pathBuilder2.curveToRelative(9.25f, -36.95f, 33.11f, -45.42f, 51.5f, -46.0f);
        pathBuilder2.arcToRelative(81.48f, 81.48f, 0.0f, false, true, 21.68f, 2.45f);
        pathBuilder2.curveToRelative(-3.83f, -6.33f, -9.43f, -12.93f, -17.21f, -16.25f);
        pathBuilder2.curveToRelative(-10.0f, -4.24f, -22.17f, -2.39f, -36.31f, 5.51f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -14.0f);
        pathBuilder2.curveToRelative(18.74f, -10.45f, 35.72f, -12.54f, 50.48f, -6.2f);
        pathBuilder2.curveToRelative(12.49f, 5.36f, 20.73f, 15.78f, 25.87f, 25.0f);
        pathBuilder2.curveToRelative(6.18f, -9.64f, 13.88f, -16.17f, 22.39f, -18.94f);
        pathBuilder2.curveToRelative(11.86f, -3.87f, 24.64f, -0.72f, 38.0f, 9.37f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.64f, 12.76f);
        pathBuilder2.curveToRelative(-8.91f, -6.73f, -16.77f, -9.06f, -23.35f, -6.93f);
        pathBuilder2.curveToRelative(-7.29f, 2.35f, -12.87f, 10.0f, -16.37f, 16.61f);
        pathBuilder2.arcTo(70.46f, 70.46f, 0.0f, false, true, 208.0f, 73.07f);
        pathBuilder2.curveToRelative(14.61f, 8.35f, 32.0f, 26.05f, 32.0f, 62.94f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -23.46f, -8.07f, -40.0f, -24.0f, -49.0f);
        pathBuilder2.arcToRelative(50.49f, 50.49f, 0.0f, false, false, -5.75f, -2.8f);
        pathBuilder2.arcToRelative(55.64f, 55.64f, 0.0f, false, true, 5.06f, 33.06f);
        pathBuilder2.arcToRelative(59.41f, 59.41f, 0.0f, false, true, -8.86f, 23.41f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, -9.2f);
        pathBuilder2.curveToRelative(0.74f, -1.09f, 16.33f, -24.38f, -3.26f, -49.37f);
        pathBuilder2.curveToRelative(-27.0f, 15.21f, -41.89f, 37.25f, -44.16f, 65.59f);
        pathBuilder2.arcToRelative(104.27f, 104.27f, 0.0f, false, false, 3.83f, 36.44f);
        pathBuilder2.curveToRelative(62.65f, 1.81f, 101.52f, 32.33f, 103.2f, 33.66f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 238.25f, 229.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(24.0f, 140.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 24.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 140.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _island = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
