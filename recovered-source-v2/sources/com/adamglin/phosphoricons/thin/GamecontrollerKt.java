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

/* compiled from: Gamecontroller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GameController", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGameController", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gameController", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamecontrollerKt {
    private static ImageVector _gameController;

    public static final ImageVector getGameController(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(176.0f, 108.0f);
        pathBuilder.lineTo(152.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 100.0f);
        pathBuilder.lineTo(92.0f, 100.0f);
        pathBuilder.lineTo(92.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.lineTo(72.0f, 100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(84.0f, 108.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(92.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(238.21f, 198.36f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -48.84f, 4.27f);
        pathBuilder.lineToRelative(-0.17f, -0.18f);
        pathBuilder.lineTo(148.29f, 156.0f);
        pathBuilder.lineTo(107.72f, 156.0f);
        pathBuilder.lineTo(66.81f, 202.44f);
        pathBuilder.lineToRelative(-0.18f, 0.19f);
        pathBuilder.arcTo(32.08f, 32.08f, 0.0f, false, true, 44.0f, 212.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -31.5f, -37.56f);
        pathBuilder.lineTo(28.87f, 90.21f);
        pathBuilder.arcTo(55.87f, 55.87f, 0.0f, false, true, 83.89f, 44.0f);
        pathBuilder.lineTo(172.0f, 44.0f);
        pathBuilder.arcToRelative(56.07f, 56.07f, 0.0f, false, true, 55.1f, 46.1f);
        pathBuilder.arcToRelative(0.29f, 0.29f, 0.0f, false, true, 0.0f, 0.1f);
        pathBuilder.lineToRelative(16.37f, 84.16f);
        pathBuilder.arcTo(31.86f, 31.86f, 0.0f, false, true, 238.21f, 198.36f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 148.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f);
        pathBuilder.lineTo(83.9f, 52.0f);
        pathBuilder.arcTo(47.9f, 47.9f, 0.0f, false, false, 36.74f, 91.67f);
        pathBuilder.lineTo(20.36f, 175.9f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 19.48f, 27.73f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 21.0f, -6.58f);
        pathBuilder.lineToRelative(42.0f, -47.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.0f, -1.36f);
        pathBuilder.close();
        pathBuilder.moveTo(235.63f, 175.83f);
        pathBuilder.lineTo(224.63f, 119.17f);
        pathBuilder.arcTo(56.09f, 56.09f, 0.0f, false, true, 172.0f, 156.0f);
        pathBuilder.lineTo(159.0f, 156.0f);
        pathBuilder.lineToRelative(36.16f, 41.06f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 40.52f, -21.23f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gameController = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
