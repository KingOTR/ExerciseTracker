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

/* compiled from: Radioactive.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Radioactive", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRadioactive", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_radioactive", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RadioactiveKt {
    private static ImageVector _radioactive;

    public static final ImageVector getRadioactive(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _radioactive;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Radioactive", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(92.0f, 128.0f);
        pathBuilder.lineTo(40.0f, 128.0f);
        pathBuilder.arcToRelative(8.1f, 8.1f, 0.0f, false, true, -8.0f, -8.86f);
        pathBuilder.arcTo(95.94f, 95.94f, 0.0f, false, true, 72.27f, 49.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 83.82f, 52.0f);
        pathBuilder.lineToRelative(26.0f, 44.94f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 92.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 159.18f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 0.0f);
        pathBuilder.lineTo(84.17f, 203.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.56f, 11.26f);
        pathBuilder.arcToRelative(96.24f, 96.24f, 0.0f, false, false, 80.54f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.56f, -11.26f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 119.18f);
        pathBuilder.arcToRelative(95.94f, 95.94f, 0.0f, false, false, -40.24f, -69.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 172.18f, 52.0f);
        pathBuilder.lineTo(146.23f, 97.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 164.0f, 126.12f);
        pathBuilder.curveToRelative(0.0f, 0.62f, 0.05f, 1.23f, 0.05f, 1.85f);
        pathBuilder.lineToRelative(52.0f, 0.0f);
        pathBuilder.arcTo(8.1f, 8.1f, 0.0f, false, false, 224.0f, 119.14f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(116.0f, 128.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(100.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineToRelative(-51.93f, 0.0f);
        pathBuilder2.arcToRelative(0.19f, 0.19f, 0.0f, false, true, -0.07f, -0.16f);
        pathBuilder2.arcTo(87.83f, 87.83f, 0.0f, false, true, 76.89f, 56.0f);
        pathBuilder2.lineToRelative(26.0f, 45.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.86f, -8.0f);
        pathBuilder2.lineTo(90.75f, 48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -23.1f, -5.07f);
        pathBuilder2.arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, 75.49f);
        pathBuilder2.arcToRelative(16.21f, 16.21f, 0.0f, false, false, 4.17f, 12.37f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 136.0f);
        pathBuilder2.lineTo(92.0f, 136.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(231.93f, 118.42f);
        pathBuilder2.arcToRelative(103.83f, 103.83f, 0.0f, false, false, -43.58f, -75.49f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 165.25f, 48.0f);
        pathBuilder2.lineTo(139.3f, 93.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f);
        pathBuilder2.lineToRelative(26.0f, -45.0f);
        pathBuilder2.arcTo(87.87f, 87.87f, 0.0f, false, true, 216.0f, 119.86f);
        pathBuilder2.curveToRelative(0.0f, 0.07f, 0.0f, 0.12f, 0.0f, 0.14f);
        pathBuilder2.lineTo(164.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(52.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.76f, -5.21f);
        pathBuilder2.arcTo(16.21f, 16.21f, 0.0f, false, false, 231.93f, 118.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.93f, 155.18f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.86f, 8.0f);
        pathBuilder2.lineToRelative(25.84f, 44.73f);
        pathBuilder2.arcToRelative(88.22f, 88.22f, 0.0f, false, true, -73.81f, 0.0f);
        pathBuilder2.lineToRelative(25.83f, -44.73f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.86f, -8.0f);
        pathBuilder2.lineTo(77.25f, 199.91f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, 22.52f);
        pathBuilder2.arcToRelative(104.24f, 104.24f, 0.0f, false, false, 87.26f, 0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 7.12f, -22.52f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _radioactive = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
