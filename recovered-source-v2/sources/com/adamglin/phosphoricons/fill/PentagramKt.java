package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pentagram.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagram", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPentagram", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagram", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagramKt {
    private static ImageVector _pentagram;

    public static final ImageVector getPentagram(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pentagram;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagram", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(60.18f, 129.52f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.15f, 2.0f);
        pathBuilder.lineTo(22.66f, 109.0f);
        pathBuilder.arcToRelative(15.78f, 15.78f, 0.0f, false, true, -5.82f, -18.0f);
        pathBuilder.arcTo(16.33f, 16.33f, 0.0f, false, true, 32.43f, 80.0f);
        pathBuilder.lineTo(70.74f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.81f, 5.24f);
        pathBuilder.close();
        pathBuilder.moveTo(53.18f, 203.0f);
        pathBuilder.arcTo(15.75f, 15.75f, 0.0f, false, false, 59.0f, 220.88f);
        pathBuilder.arcToRelative(15.74f, 15.74f, 0.0f, false, false, 18.77f, 0.0f);
        pathBuilder.lineToRelative(32.05f, -23.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.5f);
        pathBuilder.lineTo(71.38f, 163.72f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.14f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.23f, 19.26f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -30.45f, -0.05f);
        pathBuilder.lineTo(100.0f, 58.76f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 103.76f, 64.0f);
        pathBuilder.horizontalLineToRelative(48.48f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.81f, -5.23f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 80.0f);
        pathBuilder.lineTo(96.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 2.77f);
        pathBuilder.lineTo(73.0f, 141.77f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.47f, 4.48f);
        pathBuilder.lineToRelative(51.17f, 36.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.68f, 0.0f);
        pathBuilder.lineToRelative(51.17f, -36.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.47f, -4.48f);
        pathBuilder.lineToRelative(-19.15f, -59.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(239.13f, 91.0f);
        pathBuilder.arcToRelative(16.33f, 16.33f, 0.0f, false, false, -15.59f, -11.0f);
        pathBuilder.lineTo(185.26f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.81f, 5.24f);
        pathBuilder.lineToRelative(14.37f, 44.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.14f, 2.0f);
        pathBuilder.lineToRelative(31.41f, -22.6f);
        pathBuilder.arcTo(15.75f, 15.75f, 0.0f, false, false, 239.16f, 91.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.58f, 163.75f);
        pathBuilder.lineTo(146.18f, 191.38f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 6.5f);
        pathBuilder.lineToRelative(32.0f, 23.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 202.85f, 203.0f);
        pathBuilder.lineToRelative(-12.09f, -37.27f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 184.61f, 163.72f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagram = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
