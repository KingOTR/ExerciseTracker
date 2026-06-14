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

/* compiled from: Magnet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Magnet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMagnet", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_magnet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MagnetKt {
    private static ImageVector _magnet;

    public static final ImageVector getMagnet(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _magnet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Magnet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.36f, 200.36f);
        pathBuilder.lineToRelative(-30.0f, 29.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.26f, -0.05f);
        pathBuilder.lineTo(98.46f, 201.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.08f, -11.4f);
        pathBuilder.lineToRelative(30.0f, -29.0f);
        pathBuilder.close();
        pathBuilder.moveTo(26.36f, 117.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.28f);
        pathBuilder.lineTo(55.0f, 157.54f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.38f, -0.06f);
        pathBuilder.lineToRelative(29.18f, -29.92f);
        pathBuilder.lineTo(55.77f, 87.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(207.0f, 50.25f);
        pathBuilder2.arcTo(87.46f, 87.46f, 0.0f, false, false, 144.6f, 24.0f);
        pathBuilder2.horizontalLineToRelative(-0.33f);
        pathBuilder2.arcTo(87.48f, 87.48f, 0.0f, false, false, 82.0f, 49.81f);
        pathBuilder2.lineTo(50.11f, 82.11f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineTo(20.61f, 112.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.06f, 22.56f);
        pathBuilder2.lineToRelative(28.66f, 28.66f);
        pathBuilder2.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 11.32f, 4.69f);
        pathBuilder2.horizontalLineToRelative(0.09f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.36f, -4.82f);
        pathBuilder2.lineTo(133.0f, 100.69f);
        pathBuilder2.arcToRelative(16.08f, 16.08f, 0.0f, false, true, 22.41f, -0.21f);
        pathBuilder2.arcToRelative(15.6f, 15.6f, 0.0f, false, true, 4.73f, 11.19f);
        pathBuilder2.arcToRelative(16.89f, 16.89f, 0.0f, false, true, -4.85f, 12.0f);
        pathBuilder2.lineTo(93.0f, 183.88f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.17f, 22.79f);
        pathBuilder2.lineToRelative(28.66f, 28.66f);
        pathBuilder2.arcToRelative(16.06f, 16.06f, 0.0f, false, false, 22.52f, 0.12f);
        pathBuilder2.lineTo(205.81f, 175.0f);
        pathBuilder2.curveTo(240.26f, 140.5f, 240.79f, 84.56f, 207.0f, 50.25f);
        pathBuilder2.close();
        pathBuilder2.moveTo(60.65f, 151.89f);
        pathBuilder2.lineTo(32.0f, 123.24f);
        pathBuilder2.lineTo(55.8f, 99.12f);
        pathBuilder2.lineToRelative(28.52f, 28.52f);
        pathBuilder2.close();
        pathBuilder2.moveTo(132.79f, 224.0f);
        pathBuilder2.lineToRelative(-28.68f, -28.65f);
        pathBuilder2.lineToRelative(24.38f, -23.57f);
        pathBuilder2.lineTo(157.0f, 200.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(194.55f, 163.56f);
        pathBuilder2.lineTo(168.44f, 189.1f);
        pathBuilder2.lineTo(140.0f, 160.68f);
        pathBuilder2.lineToRelative(26.44f, -25.57f);
        pathBuilder2.lineToRelative(0.1f, -0.09f);
        pathBuilder2.arcToRelative(33.0f, 33.0f, 0.0f, false, false, 9.57f, -23.5f);
        pathBuilder2.arcTo(31.44f, 31.44f, 0.0f, false, false, 166.47f, 89.0f);
        pathBuilder2.arcToRelative(32.2f, 32.2f, 0.0f, false, false, -44.9f, 0.5f);
        pathBuilder2.lineTo(95.49f, 116.18f);
        pathBuilder2.lineTo(67.0f, 87.74f);
        pathBuilder2.lineTo(93.35f, 61.09f);
        pathBuilder2.arcTo(71.51f, 71.51f, 0.0f, false, true, 144.27f, 40.0f);
        pathBuilder2.horizontalLineToRelative(0.27f);
        pathBuilder2.arcToRelative(71.55f, 71.55f, 0.0f, false, true, 51.05f, 21.48f);
        pathBuilder2.curveTo(223.25f, 89.55f, 222.75f, 135.38f, 194.55f, 163.58f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _magnet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
