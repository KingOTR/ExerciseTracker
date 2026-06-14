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

/* compiled from: Handheart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandHeart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHandHeart", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handHeart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandheartKt {
    private static ImageVector _handHeart;

    public static final ImageVector getHandHeart(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _handHeart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandHeart", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.33f, 141.06f);
        pathBuilder.arcToRelative(24.34f, 24.34f, 0.0f, false, false, -18.61f, -4.77f);
        pathBuilder.curveTo(230.5f, 117.33f, 240.0f, 98.48f, 240.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, -26.47f, -21.29f, -48.0f, -47.46f, -48.0f);
        pathBuilder.arcTo(47.58f, 47.58f, 0.0f, false, false, 156.0f, 48.75f);
        pathBuilder.arcTo(47.58f, 47.58f, 0.0f, false, false, 119.46f, 32.0f);
        pathBuilder.curveTo(93.29f, 32.0f, 72.0f, 53.53f, 72.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 3.24f, 21.69f, 10.06f, 33.0f);
        pathBuilder.arcToRelative(31.87f, 31.87f, 0.0f, false, false, -14.75f, 8.4f);
        pathBuilder.lineTo(44.69f, 144.0f);
        pathBuilder.lineTo(16.0f, 144.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 160.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(120.0f, 216.0f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, false, 1.94f, -0.24f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcToRelative(6.94f, 6.94f, 0.0f, false, false, 1.19f, -0.4f);
        pathBuilder.lineTo(226.0f, 182.82f);
        pathBuilder.lineToRelative(0.44f, -0.2f);
        pathBuilder.arcToRelative(24.6f, 24.6f, 0.0f, false, false, 3.93f, -41.56f);
        pathBuilder.close();
        pathBuilder.moveTo(119.46f, 48.0f);
        pathBuilder.arcTo(31.15f, 31.15f, 0.0f, false, true, 148.6f, 67.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 0.0f);
        pathBuilder.arcToRelative(31.15f, 31.15f, 0.0f, false, true, 29.14f, -19.0f);
        pathBuilder.curveTo(209.59f, 48.0f, 224.0f, 62.65f, 224.0f, 80.0f);
        pathBuilder.curveToRelative(0.0f, 19.51f, -15.79f, 41.58f, -45.66f, 63.9f);
        pathBuilder.lineToRelative(-11.09f, 2.55f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 140.0f, 112.0f);
        pathBuilder.lineTo(100.68f, 112.0f);
        pathBuilder.curveTo(92.05f, 100.36f, 88.0f, 90.12f, 88.0f, 80.0f);
        pathBuilder.curveTo(88.0f, 62.65f, 102.41f, 48.0f, 119.46f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(16.0f, 160.0f);
        pathBuilder.lineTo(40.0f, 160.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.lineTo(16.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.43f, 168.21f);
        pathBuilder.lineTo(181.43f, 184.39f);
        pathBuilder.lineTo(119.0f, 200.0f);
        pathBuilder.lineTo(56.0f, 200.0f);
        pathBuilder.lineTo(56.0f, 155.31f);
        pathBuilder.lineToRelative(22.63f, -22.62f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, true, 89.94f, 128.0f);
        pathBuilder.lineTo(140.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(112.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.32f, 8.32f, 0.0f, false, false, 1.79f, -0.2f);
        pathBuilder.lineToRelative(67.0f, -15.41f);
        pathBuilder.lineToRelative(0.31f, -0.08f);
        pathBuilder.arcToRelative(8.6f, 8.6f, 0.0f, false, true, 6.3f, 15.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handHeart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
