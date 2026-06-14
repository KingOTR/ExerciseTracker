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

/* compiled from: Gamecontroller.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GameController", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGameController", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_gameController", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GamecontrollerKt {
    private static ImageVector _gameController;

    public static final ImageVector getGameController(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.86f, 207.57f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -24.66f, -7.77f);
        pathBuilder.lineTo(150.09f, 152.0f);
        pathBuilder.horizontalLineTo(172.0f);
        pathBuilder.arcToRelative(51.94f, 51.94f, 0.0f, false, false, 51.2f, -61.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(16.36f, 84.17f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 216.86f, 207.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(176.0f, 112.0f);
        pathBuilder2.lineTo(152.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 96.0f);
        pathBuilder2.lineTo(96.0f, 96.0f);
        pathBuilder2.lineTo(96.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.lineTo(72.0f, 96.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(241.48f, 200.65f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -54.94f, 4.81f);
        pathBuilder2.curveToRelative(-0.12f, -0.12f, -0.24f, -0.24f, -0.35f, -0.37f);
        pathBuilder2.lineTo(146.48f, 160.0f);
        pathBuilder2.horizontalLineToRelative(-37.0f);
        pathBuilder2.lineTo(69.81f, 205.09f);
        pathBuilder2.lineToRelative(-0.35f, 0.37f);
        pathBuilder2.arcTo(36.08f, 36.08f, 0.0f, false, true, 44.0f, 216.0f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, false, true, 8.56f, 173.75f);
        pathBuilder2.arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.0f, -0.14f);
        pathBuilder2.lineTo(24.93f, 89.52f);
        pathBuilder2.arcTo(59.88f, 59.88f, 0.0f, false, true, 83.89f, 40.0f);
        pathBuilder2.lineTo(172.0f, 40.0f);
        pathBuilder2.arcToRelative(60.08f, 60.08f, 0.0f, false, true, 59.0f, 49.25f);
        pathBuilder2.curveToRelative(0.0f, 0.06f, 0.0f, 0.12f, 0.0f, 0.18f);
        pathBuilder2.lineToRelative(16.37f, 84.17f);
        pathBuilder2.arcToRelative(0.68f, 0.68f, 0.0f, false, true, 0.0f, 0.14f);
        pathBuilder2.arcTo(35.74f, 35.74f, 0.0f, false, true, 241.48f, 200.65f);
        pathBuilder2.close();
        pathBuilder2.moveTo(172.0f, 144.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f);
        pathBuilder2.lineTo(83.89f, 56.0f);
        pathBuilder2.arcTo(43.9f, 43.9f, 0.0f, false, false, 40.68f, 92.37f);
        pathBuilder2.lineToRelative(0.0f, 0.13f);
        pathBuilder2.lineTo(24.3f, 176.59f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, false, false, 58.0f, 194.3f);
        pathBuilder2.lineToRelative(41.92f, -47.59f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, -2.71f);
        pathBuilder2.close();
        pathBuilder2.moveTo(231.7f, 176.59f);
        pathBuilder2.lineTo(222.96f, 131.59f);
        pathBuilder2.arcTo(60.0f, 60.0f, 0.0f, false, true, 172.0f, 160.0f);
        pathBuilder2.horizontalLineToRelative(-4.2f);
        pathBuilder2.lineTo(198.0f, 194.31f);
        pathBuilder2.arcToRelative(20.09f, 20.09f, 0.0f, false, false, 17.46f, 5.39f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.23f, -23.11f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _gameController = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
