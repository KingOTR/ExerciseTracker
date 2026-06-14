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

/* compiled from: Treepalm.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TreePalm", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTreePalm", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_treePalm", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TreepalmKt {
    private static ImageVector _treePalm;

    public static final ImageVector getTreePalm(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _treePalm;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TreePalm", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 58.75f);
        pathBuilder.lineTo(128.0f, 104.0f);
        pathBuilder.arcToRelative(65.47f, 65.47f, 0.0f, false, true, 17.84f, -45.25f);
        pathBuilder.arcToRelative(58.87f, 58.87f, 0.0f, false, true, 86.16f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.56f, 98.18f);
        pathBuilder.arcTo(64.2f, 64.2f, 0.0f, false, false, 128.0f, 104.52f);
        pathBuilder.lineTo(221.81f, 176.0f);
        pathBuilder.arcToRelative(63.0f, 63.0f, 0.0f, false, false, -6.39f, -48.22f);
        pathBuilder.arcTo(63.73f, 63.73f, 0.0f, false, false, 176.56f, 98.18f);
        pathBuilder.close();
        pathBuilder.moveTo(110.16f, 58.75f);
        pathBuilder.arcToRelative(58.87f, 58.87f, 0.0f, false, false, -86.16f, 0.0f);
        pathBuilder.lineTo(128.0f, 104.0f);
        pathBuilder.arcTo(65.47f, 65.47f, 0.0f, false, false, 110.16f, 58.75f);
        pathBuilder.close();
        pathBuilder.moveTo(79.44f, 98.18f);
        pathBuilder.arcToRelative(63.73f, 63.73f, 0.0f, false, false, -38.86f, 29.6f);
        pathBuilder.arcTo(63.0f, 63.0f, 0.0f, false, false, 34.19f, 176.0f);
        pathBuilder.lineTo(128.0f, 104.52f);
        pathBuilder.arcTo(64.2f, 64.2f, 0.0f, false, false, 79.44f, 98.18f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.79f, 53.23f);
        pathBuilder2.arcToRelative(66.86f, 66.86f, 0.0f, false, false, -97.74f, 0.0f);
        pathBuilder2.arcToRelative(72.21f, 72.21f, 0.0f, false, false, -12.05f, 17.0f);
        pathBuilder2.arcToRelative(72.21f, 72.21f, 0.0f, false, false, -12.0f, -17.0f);
        pathBuilder2.arcToRelative(66.86f, 66.86f, 0.0f, false, false, -97.74f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.6f, 12.85f);
        pathBuilder2.lineTo(77.0f, 90.55f);
        pathBuilder2.arcToRelative(71.42f, 71.42f, 0.0f, false, false, -43.36f, 33.21f);
        pathBuilder2.arcToRelative(70.64f, 70.64f, 0.0f, false, false, -7.2f, 54.32f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 39.0f, 182.36f);
        pathBuilder2.lineToRelative(81.0f, -61.68f);
        pathBuilder2.verticalLineTo(224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineTo(120.68f);
        pathBuilder2.lineToRelative(81.0f, 61.68f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.57f, -4.28f);
        pathBuilder2.arcToRelative(70.64f, 70.64f, 0.0f, false, false, -7.2f, -54.32f);
        pathBuilder2.arcTo(71.42f, 71.42f, 0.0f, false, false, 179.0f, 90.55f);
        pathBuilder2.lineToRelative(56.22f, -24.47f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.6f, -12.85f);
        pathBuilder2.close();
        pathBuilder2.moveTo(67.08f, 48.0f);
        pathBuilder2.arcToRelative(51.13f, 51.13f, 0.0f, false, true, 37.28f, 16.26f);
        pathBuilder2.arcToRelative(56.53f, 56.53f, 0.0f, false, true, 14.26f, 26.93f);
        pathBuilder2.lineTo(39.0f, 56.53f);
        pathBuilder2.arcTo(50.5f, 50.5f, 0.0f, false, true, 67.08f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 161.5f);
        pathBuilder2.arcToRelative(54.82f, 54.82f, 0.0f, false, true, 7.47f, -29.7f);
        pathBuilder2.arcToRelative(55.55f, 55.55f, 0.0f, false, true, 34.0f, -25.89f);
        pathBuilder2.arcTo(56.52f, 56.52f, 0.0f, false, true, 96.1f, 104.0f);
        pathBuilder2.arcToRelative(55.82f, 55.82f, 0.0f, false, true, 16.23f, 2.41f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.5f, 131.8f);
        pathBuilder2.arcTo(54.82f, 54.82f, 0.0f, false, true, 216.0f, 161.5f);
        pathBuilder2.lineToRelative(-72.3f, -55.1f);
        pathBuilder2.arcToRelative(56.3f, 56.3f, 0.0f, false, true, 64.83f, 25.4f);
        pathBuilder2.close();
        pathBuilder2.moveTo(137.38f, 91.19f);
        pathBuilder2.arcToRelative(56.53f, 56.53f, 0.0f, false, true, 14.26f, -26.93f);
        pathBuilder2.arcTo(51.13f, 51.13f, 0.0f, false, true, 188.92f, 48.0f);
        pathBuilder2.arcTo(50.5f, 50.5f, 0.0f, false, true, 217.0f, 56.53f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _treePalm = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
