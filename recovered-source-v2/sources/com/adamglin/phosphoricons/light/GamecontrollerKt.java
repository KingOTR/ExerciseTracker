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

/* compiled from: Gamecontroller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GameController", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGameController", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gameController", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamecontrollerKt {
    private static ImageVector _gameController;

    public static final ImageVector getGameController(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _gameController;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GameController", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(176.0f, 110.0f);
        pathBuilder.lineTo(152.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 98.0f);
        pathBuilder.lineTo(94.0f, 98.0f);
        pathBuilder.lineTo(94.0f, 88.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(82.0f, 98.0f);
        pathBuilder.lineTo(72.0f, 98.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(82.0f, 110.0f);
        pathBuilder.verticalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(94.0f, 110.0f);
        pathBuilder.horizontalLineToRelative(10.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(239.84f, 199.5f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 212.0f, 214.0f);
        pathBuilder.arcTo(34.11f, 34.11f, 0.0f, false, true, 188.0f, 204.05f);
        pathBuilder.lineToRelative(-0.26f, -0.28f);
        pathBuilder.lineTo(147.38f, 158.0f);
        pathBuilder.lineTo(108.62f, 158.0f);
        pathBuilder.lineTo(68.31f, 203.76f);
        pathBuilder.lineTo(68.0f, 204.0f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, false, true, 44.0f, 214.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, -33.46f, -39.91f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.06f, 0.0f, -0.1f);
        pathBuilder.lineTo(26.9f, 89.88f);
        pathBuilder.arcTo(57.89f, 57.89f, 0.0f, false, true, 83.89f, 42.0f);
        pathBuilder.lineTo(172.0f, 42.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, true, 57.05f, 47.63f);
        pathBuilder.curveToRelative(0.0f, 0.07f, 0.0f, 0.12f, 0.0f, 0.19f);
        pathBuilder.lineTo(245.46f, 174.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.07f, 0.0f, 0.11f);
        pathBuilder.arcTo(33.75f, 33.75f, 0.0f, false, true, 239.84f, 199.5f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 146.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f);
        pathBuilder.lineTo(83.89f, 54.0f);
        pathBuilder.arcTo(45.9f, 45.9f, 0.0f, false, false, 38.71f, 92.0f);
        pathBuilder.arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.0f, 0.1f);
        pathBuilder.lineTo(22.33f, 176.23f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 37.11f, 19.45f);
        pathBuilder.lineToRelative(42.0f, -47.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.5f, -2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(233.67f, 176.23f);
        pathBuilder.lineTo(223.88f, 125.88f);
        pathBuilder.arcTo(58.06f, 58.06f, 0.0f, false, true, 172.0f, 158.0f);
        pathBuilder.horizontalLineToRelative(-8.63f);
        pathBuilder.lineToRelative(33.19f, 37.68f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 37.11f, -19.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gameController = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
