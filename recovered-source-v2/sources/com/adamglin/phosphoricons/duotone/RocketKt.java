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

/* compiled from: Rocket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Rocket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRocket", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rocket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RocketKt {
    private static ImageVector _rocket;

    public static final ImageVector getRocket(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _rocket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Rocket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(94.81f, 192.0f);
        pathBuilder.lineTo(65.36f, 214.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.81f, -4.51f);
        pathBuilder.lineTo(40.19f, 154.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.66f, -6.86f);
        pathBuilder.lineToRelative(30.31f, -36.33f);
        pathBuilder.curveTo(71.0f, 134.25f, 76.7f, 161.43f, 94.81f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.15f, 147.24f);
        pathBuilder.lineTo(183.84f, 110.91f);
        pathBuilder.curveToRelative(1.21f, 23.34f, -4.54f, 50.52f, -22.65f, 81.09f);
        pathBuilder.lineToRelative(29.45f, 22.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.81f, -4.51f);
        pathBuilder.lineToRelative(12.36f, -55.63f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 214.15f, 147.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(152.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder2.lineTo(112.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 224.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 112.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(223.62f, 155.83f);
        pathBuilder2.lineTo(211.26f, 211.46f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, 9.11f);
        pathBuilder2.lineTo(158.51f, 200.0f);
        pathBuilder2.horizontalLineToRelative(-61.0f);
        pathBuilder2.lineTo(70.25f, 220.57f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -25.51f, -9.11f);
        pathBuilder2.lineTo(32.38f, 155.83f);
        pathBuilder2.arcToRelative(16.09f, 16.09f, 0.0f, false, true, 3.32f, -13.71f);
        pathBuilder2.lineToRelative(28.56f, -34.26f);
        pathBuilder2.arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, -36.67f);
        pathBuilder2.curveToRelative(12.9f, -32.34f, 36.0f, -52.63f, 45.37f, -59.85f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.6f, 0.0f);
        pathBuilder2.curveToRelative(9.34f, 7.22f, 32.47f, 27.51f, 45.37f, 59.85f);
        pathBuilder2.arcToRelative(123.07f, 123.07f, 0.0f, false, true, 8.57f, 36.67f);
        pathBuilder2.lineToRelative(28.56f, 34.26f);
        pathBuilder2.arcTo(16.09f, 16.09f, 0.0f, false, true, 223.62f, 155.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(99.43f, 184.0f);
        pathBuilder2.horizontalLineToRelative(57.14f);
        pathBuilder2.curveToRelative(21.12f, -37.54f, 25.07f, -73.48f, 11.74f, -106.88f);
        pathBuilder2.curveTo(156.55f, 47.64f, 134.49f, 29.0f, 128.0f, 24.0f);
        pathBuilder2.curveToRelative(-6.51f, 5.0f, -28.57f, 23.64f, -40.33f, 53.12f);
        pathBuilder2.curveTo(74.36f, 110.52f, 78.31f, 146.46f, 99.43f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(84.43f, 189.85f);
        pathBuilder2.quadTo(68.28f, 160.5f, 64.83f, 132.16f);
        pathBuilder2.lineTo(48.0f, 152.36f);
        pathBuilder2.lineTo(60.36f, 208.0f);
        pathBuilder2.lineToRelative(0.18f, -0.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 152.36f);
        pathBuilder2.lineToRelative(-16.83f, -20.2f);
        pathBuilder2.quadToRelative(-3.42f, 28.28f, -19.56f, 57.69f);
        pathBuilder2.lineToRelative(23.85f, 18.0f);
        pathBuilder2.lineToRelative(0.18f, 0.13f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rocket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
