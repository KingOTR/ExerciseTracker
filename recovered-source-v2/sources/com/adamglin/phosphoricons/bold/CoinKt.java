package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Coin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Coin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCoin", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoinKt {
    private static ImageVector _coin;

    public static final ImageVector getCoin(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _coin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Coin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(209.37f, 60.27f);
        pathBuilder.curveTo(188.08f, 49.62f, 160.0f, 44.0f, 128.0f, 44.0f);
        pathBuilder.reflectiveCurveTo(67.92f, 49.62f, 46.63f, 60.27f);
        pathBuilder.curveTo(24.62f, 71.27f, 12.0f, 87.21f, 12.0f, 104.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.curveToRelative(0.0f, 16.79f, 12.62f, 32.73f, 34.63f, 43.73f);
        pathBuilder.curveTo(67.92f, 206.38f, 96.05f, 212.0f, 128.0f, 212.0f);
        pathBuilder.reflectiveCurveToRelative(60.08f, -5.62f, 81.37f, -16.27f);
        pathBuilder.curveToRelative(22.0f, -11.0f, 34.63f, -26.94f, 34.63f, -43.73f);
        pathBuilder.lineTo(244.0f, 104.0f);
        pathBuilder.curveTo(244.0f, 87.21f, 231.38f, 71.27f, 209.37f, 60.27f);
        pathBuilder.close();
        pathBuilder.moveTo(57.37f, 81.73f);
        pathBuilder.curveTo(75.08f, 72.88f, 100.16f, 68.0f, 128.0f, 68.0f);
        pathBuilder.reflectiveCurveToRelative(52.92f, 4.88f, 70.63f, 13.73f);
        pathBuilder.curveTo(211.81f, 88.32f, 220.0f, 96.86f, 220.0f, 104.0f);
        pathBuilder.reflectiveCurveToRelative(-8.19f, 15.68f, -21.37f, 22.27f);
        pathBuilder.curveTo(180.92f, 135.12f, 155.84f, 140.0f, 128.0f, 140.0f);
        pathBuilder.reflectiveCurveToRelative(-52.92f, -4.88f, -70.63f, -13.73f);
        pathBuilder.curveTo(44.19f, 119.68f, 36.0f, 111.14f, 36.0f, 104.0f);
        pathBuilder.reflectiveCurveTo(44.19f, 88.32f, 57.37f, 81.73f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 181.38f);
        pathBuilder.arcToRelative(180.38f, 180.38f, 0.0f, false, true, -40.0f, 6.3f);
        pathBuilder.verticalLineToRelative(-24.0f);
        pathBuilder.arcToRelative(210.39f, 210.39f, 0.0f, false, false, 40.0f, -5.51f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 158.22f);
        pathBuilder.arcToRelative(210.39f, 210.39f, 0.0f, false, false, 40.0f, 5.51f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(180.38f, 180.38f, 0.0f, false, true, -40.0f, -6.3f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 152.0f);
        pathBuilder.lineTo(36.0f, 141.54f);
        pathBuilder.arcToRelative(94.54f, 94.54f, 0.0f, false, false, 10.63f, 6.19f);
        pathBuilder.curveToRelative(1.74f, 0.87f, 3.54f, 1.7f, 5.37f, 2.5f);
        pathBuilder.lineTo(52.0f, 171.3f);
        pathBuilder.curveTo(42.0f, 165.24f, 36.0f, 158.11f, 36.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 171.3f);
        pathBuilder.lineTo(204.0f, 150.23f);
        pathBuilder.curveToRelative(1.83f, -0.8f, 3.63f, -1.63f, 5.37f, -2.5f);
        pathBuilder.arcTo(94.54f, 94.54f, 0.0f, false, false, 220.0f, 141.54f);
        pathBuilder.lineTo(220.0f, 152.0f);
        pathBuilder.curveTo(220.0f, 158.11f, 214.0f, 165.24f, 204.0f, 171.3f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
