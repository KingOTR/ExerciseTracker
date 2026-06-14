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

/* compiled from: Handsclapping.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsClapping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHandsClapping", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsClapping", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsclappingKt {
    private static ImageVector _handsClapping;

    public static final ImageVector getHandsClapping(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _handsClapping;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsClapping", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.22f, 24.0f);
        pathBuilder.lineTo(160.22f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.lineTo(176.22f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.1f, 41.0f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 4.17f, 1.17f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.84f, -3.83f);
        pathBuilder.lineToRelative(8.0f, -13.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.68f, -8.33f);
        pathBuilder.lineToRelative(-8.0f, 13.1f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 196.1f, 41.0f);
        pathBuilder.close();
        pathBuilder.moveTo(243.61f, 53.59f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.08f, -5.16f);
        pathBuilder.lineToRelative(-15.06f, 4.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.46f, 15.62f);
        pathBuilder.arcToRelative(8.15f, 8.15f, 0.0f, false, false, 2.46f, -0.39f);
        pathBuilder.lineToRelative(15.05f, -4.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 243.61f, 53.55f);
        pathBuilder.close();
        pathBuilder.moveTo(217.0f, 97.58f);
        pathBuilder.arcToRelative(80.22f, 80.22f, 0.0f, false, true, -10.22f, 94.0f);
        pathBuilder.curveToRelative(-0.34f, 1.73f, -0.72f, 3.46f, -1.19f, 5.18f);
        pathBuilder.arcTo(80.17f, 80.17f, 0.0f, false, true, 58.77f, 216.0f);
        pathBuilder.lineTo(23.5f, 155.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 19.24f, -38.79f);
        pathBuilder.lineToRelative(-3.0f, -5.2f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 19.2f, -38.78f);
        pathBuilder.lineTo(58.24f, 71.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 95.47f, 36.53f);
        pathBuilder.arcTo(26.06f, 26.06f, 0.0f, false, true, 140.3f, 37.0f);
        pathBuilder.lineToRelative(12.26f, 21.2f);
        pathBuilder.arcTo(26.07f, 26.07f, 0.0f, false, true, 195.81f, 61.0f);
        pathBuilder.close();
        pathBuilder.moveTo(109.07f, 55.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(25.0f, 43.17f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 17.33f, -10.0f);
        pathBuilder.lineTo(126.42f, 45.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, false, -17.35f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.12f, 63.0f);
        pathBuilder.lineToRelative(6.46f, 11.17f);
        pathBuilder.arcToRelative(26.05f, 26.05f, 0.0f, false, true, 17.32f, -10.0f);
        pathBuilder.lineTo(89.45f, 53.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, true, false, 72.12f, 63.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.66f, 144.0f);
        pathBuilder.lineTo(163.44f, 109.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.74f, 9.25f);
        pathBuilder.lineTo(158.3f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.87f, 8.0f);
        pathBuilder.lineToRelative(-36.5f, -63.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, true, false, 90.58f, 95.0f);
        pathBuilder.lineToRelative(26.05f, 45.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.87f, 8.0f);
        pathBuilder.lineTo(71.0f, 93.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.33f, 10.0f);
        pathBuilder.lineToRelative(35.22f, 61.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 75.0f, 172.0f);
        pathBuilder.lineTo(54.72f, 137.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, false, false, -17.34f, 10.0f);
        pathBuilder.lineToRelative(35.27f, 61.0f);
        pathBuilder.arcToRelative(64.12f, 64.12f, 0.0f, false, false, 117.42f, -15.44f);
        pathBuilder.arcTo(63.52f, 63.52f, 0.0f, false, false, 183.66f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(203.07f, 105.58f);
        pathBuilder.lineTo(181.93f, 69.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, false, 164.55f, 79.0f);
        pathBuilder.lineToRelative(33.0f, 57.05f);
        pathBuilder.arcTo(80.2f, 80.2f, 0.0f, false, true, 207.0f, 161.51f);
        pathBuilder.arcTo(64.23f, 64.23f, 0.0f, false, false, 203.07f, 105.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsClapping = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
