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

/* compiled from: Handsclapping.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsClapping", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandsClapping", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsClapping", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsclappingKt {
    private static ImageVector _handsClapping;

    public static final ImageVector getHandsClapping(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(164.22f, 24.0f);
        pathBuilder.lineTo(164.22f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(172.22f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.22f, 37.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.51f, -1.33f);
        pathBuilder.lineToRelative(8.0f, -13.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.84f, -4.17f);
        pathBuilder.lineToRelative(-8.0f, 13.11f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 198.19f, 37.55f);
        pathBuilder.close();
        pathBuilder.moveTo(239.84f, 54.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.05f, -2.58f);
        pathBuilder.lineTo(219.7f, 57.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.23f, 7.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.23f, -0.19f);
        pathBuilder.lineToRelative(15.06f, -4.85f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 239.81f, 54.78f);
        pathBuilder.close();
        pathBuilder.moveTo(203.0f, 189.66f);
        pathBuilder.curveToRelative(-0.37f, 2.0f, -0.81f, 4.0f, -1.34f, 6.0f);
        pathBuilder.arcTo(76.18f, 76.18f, 0.0f, false, true, 62.22f, 214.0f);
        pathBuilder.lineTo(27.0f, 153.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.76f, -32.69f);
        pathBuilder.lineTo(43.19f, 109.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 65.92f, 76.32f);
        pathBuilder.lineTo(61.69f, 69.0f);
        pathBuilder.arcTo(22.0f, 22.0f, 0.0f, false, true, 96.87f, 43.0f);
        pathBuilder.arcTo(21.83f, 21.83f, 0.0f, false, true, 106.72f, 31.0f);
        pathBuilder.arcTo(22.08f, 22.08f, 0.0f, false, true, 136.82f, 39.0f);
        pathBuilder.lineToRelative(15.79f, 27.3f);
        pathBuilder.arcTo(22.05f, 22.05f, 0.0f, false, true, 192.34f, 63.0f);
        pathBuilder.lineToRelative(21.14f, 36.57f);
        pathBuilder.arcTo(76.19f, 76.19f, 0.0f, false, true, 203.0f, 189.66f);
        pathBuilder.close();
        pathBuilder.moveTo(161.08f, 81.0f);
        pathBuilder.lineToRelative(33.0f, 57.05f);
        pathBuilder.arcToRelative(75.49f, 75.49f, 0.0f, false, true, 10.21f, 37.24f);
        pathBuilder.arcToRelative(68.26f, 68.26f, 0.0f, false, false, 2.27f, -71.66f);
        pathBuilder.lineTo(185.4f, 67.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 161.08f, 81.0f);
        pathBuilder.close();
        pathBuilder.moveTo(105.59f, 57.0f);
        pathBuilder.lineToRelative(28.54f, 49.29f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 24.28f, -14.0f);
        pathBuilder.lineTo(129.88f, 43.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, false, -24.29f, 14.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.59f, 65.0f);
        pathBuilder.lineTo(78.59f, 82.27f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, 24.27f, -14.0f);
        pathBuilder.lineTo(92.91f, 51.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, true, false, 68.63f, 65.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.09f, 142.0f);
        pathBuilder.lineTo(166.9f, 107.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.67f, 13.26f);
        pathBuilder.lineTo(154.83f, 142.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.93f, 4.0f);
        pathBuilder.lineTo(111.39f, 83.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.15f, -5.11f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 87.09f, 97.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(26.05f, 45.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.48f, -1.46f);
        pathBuilder.lineTo(74.42f, 91.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.28f, 14.0f);
        pathBuilder.lineToRelative(35.23f, 61.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.94f, 4.0f);
        pathBuilder.lineTo(58.18f, 135.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.29f, 14.0f);
        pathBuilder.lineToRelative(35.27f, 61.0f);
        pathBuilder.arcToRelative(68.09f, 68.09f, 0.0f, false, false, 118.0f, -68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsClapping = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
