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

/* compiled from: Island.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Island", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getIsland", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_island", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IslandKt {
    private static ImageVector _island;

    public static final ImageVector getIsland(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(239.55f, 226.65f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 232.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.0f, -14.25f);
        pathBuilder.curveToRelative(1.63f, -1.3f, 38.53f, -30.26f, 98.29f, -33.45f);
        pathBuilder.arcTo(120.0f, 120.0f, 0.0f, false, true, 114.0f, 146.37f);
        pathBuilder.curveToRelative(1.73f, -21.71f, 10.91f, -50.63f, 42.95f, -72.48f);
        pathBuilder.arcToRelative(66.28f, 66.28f, 0.0f, false, false, -15.0f, -1.87f);
        pathBuilder.lineToRelative(-1.67f, 0.0f);
        pathBuilder.curveToRelative(-19.0f, 0.62f, -30.94f, 11.71f, -36.5f, 33.92f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 112.0f);
        pathBuilder.arcToRelative(7.66f, 7.66f, 0.0f, false, true, -2.0f, -0.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, -9.7f);
        pathBuilder.curveToRelative(9.25f, -36.95f, 33.11f, -45.42f, 51.5f, -46.0f);
        pathBuilder.arcToRelative(81.43f, 81.43f, 0.0f, false, true, 21.68f, 2.45f);
        pathBuilder.curveToRelative(-3.82f, -6.33f, -9.42f, -12.93f, -17.21f, -16.25f);
        pathBuilder.curveToRelative(-10.0f, -4.24f, -22.17f, -2.39f, -36.31f, 5.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -14.0f);
        pathBuilder.curveToRelative(18.74f, -10.45f, 35.72f, -12.54f, 50.48f, -6.2f);
        pathBuilder.curveToRelative(12.49f, 5.36f, 20.73f, 15.78f, 25.88f, 25.0f);
        pathBuilder.curveToRelative(6.17f, -9.64f, 13.87f, -16.17f, 22.38f, -18.94f);
        pathBuilder.curveToRelative(11.86f, -3.87f, 24.64f, -0.72f, 38.0f, 9.37f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.64f, 12.76f);
        pathBuilder.curveToRelative(-8.91f, -6.73f, -16.77f, -9.06f, -23.34f, -6.93f);
        pathBuilder.curveToRelative(-7.3f, 2.35f, -12.87f, 10.0f, -16.38f, 16.61f);
        pathBuilder.arcTo(70.46f, 70.46f, 0.0f, false, true, 208.0f, 73.07f);
        pathBuilder.curveToRelative(14.61f, 8.35f, 32.0f, 26.05f, 32.0f, 62.94f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -23.46f, -8.06f, -40.0f, -24.0f, -49.0f);
        pathBuilder.arcToRelative(50.49f, 50.49f, 0.0f, false, false, -5.75f, -2.8f);
        pathBuilder.arcToRelative(55.64f, 55.64f, 0.0f, false, true, 5.06f, 33.06f);
        pathBuilder.arcToRelative(59.41f, 59.41f, 0.0f, false, true, -8.86f, 23.41f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.09f, -9.2f);
        pathBuilder.curveToRelative(0.75f, -1.09f, 16.33f, -24.38f, -3.26f, -49.37f);
        pathBuilder.curveToRelative(-27.0f, 15.21f, -41.89f, 37.25f, -44.16f, 65.59f);
        pathBuilder.arcToRelative(104.27f, 104.27f, 0.0f, false, false, 3.83f, 36.44f);
        pathBuilder.curveToRelative(62.65f, 1.81f, 101.52f, 32.33f, 103.2f, 33.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 239.55f, 226.65f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 168.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 52.0f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _island = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
