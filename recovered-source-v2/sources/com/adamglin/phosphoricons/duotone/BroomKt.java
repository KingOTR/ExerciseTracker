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

/* compiled from: Broom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Broom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBroom", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_broom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BroomKt {
    private static ImageVector _broom;

    public static final ImageVector getBroom(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _broom;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Broom", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(192.8f, 165.12f);
        pathBuilder.lineTo(43.93f, 105.57f);
        pathBuilder.arcTo(110.88f, 110.88f, 0.0f, false, true, 61.47f, 82.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.67f, -1.81f);
        pathBuilder.lineTo(95.52f, 90.85f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 20.82f, -9.0f);
        pathBuilder.lineToRelative(21.0f, -53.1f);
        pathBuilder.curveToRelative(4.15f, -10.0f, 15.47f, -15.33f, 25.63f, -11.53f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 11.51f, 26.39f);
        pathBuilder.lineTo(153.13f, 96.71f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.93f, 20.75f);
        pathBuilder.lineTo(187.0f, 127.3f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.0f, 7.43f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcTo(104.58f, 104.58f, 0.0f, false, false, 192.8f, 165.12f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(235.5f, 216.81f);
        pathBuilder2.curveToRelative(-22.56f, -11.0f, -35.5f, -34.58f, -35.5f, -64.8f);
        pathBuilder2.lineTo(200.0f, 134.73f);
        pathBuilder2.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -10.09f, -14.87f);
        pathBuilder2.lineTo(165.0f, 110.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.48f, -10.34f);
        pathBuilder2.lineToRelative(21.32f, -53.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -16.1f, -37.0f);
        pathBuilder2.arcToRelative(28.14f, 28.14f, 0.0f, false, false, -35.82f, 16.0f);
        pathBuilder2.arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.0f, 0.12f);
        pathBuilder2.lineTo(108.9f, 79.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.37f, 4.49f);
        pathBuilder2.lineTo(73.11f, 73.14f);
        pathBuilder2.arcTo(15.89f, 15.89f, 0.0f, false, false, 55.74f, 76.8f);
        pathBuilder2.curveTo(34.68f, 98.45f, 24.0f, 123.75f, 24.0f, 152.0f);
        pathBuilder2.arcToRelative(111.45f, 111.45f, 0.0f, false, false, 31.18f, 77.53f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 61.0f, 232.0f);
        pathBuilder2.lineTo(232.0f, 232.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.5f, -15.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(67.14f, 88.0f);
        pathBuilder2.lineToRelative(25.41f, 10.3f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 31.23f, -13.45f);
        pathBuilder2.lineToRelative(21.0f, -53.0f);
        pathBuilder2.curveToRelative(2.56f, -6.11f, 9.47f, -9.27f, 15.43f, -7.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.88f, 15.92f);
        pathBuilder2.lineTo(145.69f, 93.76f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 13.43f, 31.14f);
        pathBuilder2.lineTo(184.0f, 134.73f);
        pathBuilder2.lineTo(184.0f, 152.0f);
        pathBuilder2.curveToRelative(0.0f, 0.33f, 0.0f, 0.66f, 0.0f, 1.0f);
        pathBuilder2.lineTo(55.77f, 101.71f);
        pathBuilder2.arcTo(108.84f, 108.84f, 0.0f, false, true, 67.14f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(115.14f, 216.0f);
        pathBuilder2.arcToRelative(87.53f, 87.53f, 0.0f, false, true, -24.34f, -42.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.49f, 4.0f);
        pathBuilder2.arcToRelative(105.16f, 105.16f, 0.0f, false, false, 18.36f, 38.0f);
        pathBuilder2.lineTo(64.44f, 216.0f);
        pathBuilder2.arcTo(95.54f, 95.54f, 0.0f, false, true, 40.0f, 152.0f);
        pathBuilder2.arcToRelative(85.9f, 85.9f, 0.0f, false, true, 7.73f, -36.29f);
        pathBuilder2.lineToRelative(137.8f, 55.12f);
        pathBuilder2.curveToRelative(3.0f, 18.0f, 10.56f, 33.48f, 21.89f, 45.16f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _broom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
