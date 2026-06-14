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

/* compiled from: Handsclapping.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsClapping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandsClapping", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsClapping", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsclappingKt {
    private static ImageVector _handsClapping;

    public static final ImageVector getHandsClapping(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(162.21f, 24.0f);
        pathBuilder.lineTo(162.21f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.lineTo(174.21f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(197.14f, 39.25f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.26f, -2.0f);
        pathBuilder.lineToRelative(8.0f, -13.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.26f, -6.25f);
        pathBuilder.lineToRelative(-8.0f, 13.11f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 197.14f, 39.25f);
        pathBuilder.close();
        pathBuilder.moveTo(241.71f, 54.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.57f, -3.87f);
        pathBuilder.lineToRelative(-15.0f, 4.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.84f, 11.72f);
        pathBuilder.arcToRelative(5.91f, 5.91f, 0.0f, false, false, 1.84f, -0.3f);
        pathBuilder.lineToRelative(15.06f, -4.84f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 241.71f, 54.16f);
        pathBuilder.close();
        pathBuilder.moveTo(215.22f, 98.58f);
        pathBuilder.arcToRelative(78.2f, 78.2f, 0.0f, false, true, -10.35f, 92.0f);
        pathBuilder.curveToRelative(-0.36f, 1.87f, -0.76f, 3.74f, -1.26f, 5.6f);
        pathBuilder.arcTo(78.18f, 78.18f, 0.0f, false, true, 60.49f, 215.0f);
        pathBuilder.lineTo(25.22f, 154.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 20.85f, -36.0f);
        pathBuilder.lineToRelative(-4.61f, -8.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 62.28f, 74.0f);
        pathBuilder.lineTo(60.0f, 70.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 96.11f, 39.54f);
        pathBuilder.arcTo(24.05f, 24.05f, 0.0f, false, true, 138.56f, 38.0f);
        pathBuilder.lineToRelative(13.89f, 24.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 41.62f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(107.33f, 56.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(134.0f, 102.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 20.8f, -12.0f);
        pathBuilder.lineTo(128.15f, 44.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.82f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.33f, 64.0f);
        pathBuilder.lineTo(78.41f, 78.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 99.23f, 66.0f);
        pathBuilder.lineTo(91.17f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -22.0f, 2.91f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 70.37f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.33f, 143.0f);
        pathBuilder.lineTo(165.1f, 108.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 119.27f);
        pathBuilder.lineTo(156.56f, 141.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.4f, 6.0f);
        pathBuilder.lineTo(109.65f, 84.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.83f, 96.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(26.0f, 45.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.4f, 6.0f);
        pathBuilder.lineTo(72.68f, 92.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.81f, 12.0f);
        pathBuilder.lineTo(87.1f, 165.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.41f, 6.0f);
        pathBuilder.lineTo(56.44f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.81f, 12.0f);
        pathBuilder.lineTo(70.9f, 209.0f);
        pathBuilder.arcTo(66.13f, 66.13f, 0.0f, false, false, 192.0f, 193.09f);
        pathBuilder.arcTo(65.53f, 65.53f, 0.0f, false, false, 185.4f, 143.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.74f, 104.58f);
        pathBuilder.lineTo(183.66f, 68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.42f, -4.39f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 162.82f, 80.0f);
        pathBuilder.lineToRelative(33.0f, 57.0f);
        pathBuilder.arcToRelative(77.7f, 77.7f, 0.0f, false, true, 10.14f, 31.54f);
        pathBuilder.arcTo(66.25f, 66.25f, 0.0f, false, false, 204.81f, 104.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsClapping = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
