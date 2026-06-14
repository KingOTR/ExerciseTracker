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

/* compiled from: Wrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWrench", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrenchKt {
    private static ImageVector _wrench;

    public static final ImageVector getWrench(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _wrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 96.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, -94.94f, 56.0f);
        pathBuilder.lineTo(73.0f, 217.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 39.0f, 183.0f);
        pathBuilder.lineTo(104.0f, 126.94f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 80.0f, -90.29f);
        pathBuilder.lineTo(144.0f, 80.0f);
        pathBuilder.lineToRelative(5.66f, 26.34f);
        pathBuilder.lineTo(176.0f, 112.0f);
        pathBuilder.lineToRelative(43.35f, -40.0f);
        pathBuilder.arcTo(63.8f, 63.8f, 0.0f, false, true, 224.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(226.76f, 69.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.84f, -2.88f);
        pathBuilder2.lineToRelative(-40.3f, 37.19f);
        pathBuilder2.lineToRelative(-17.23f, -3.7f);
        pathBuilder2.lineToRelative(-3.7f, -17.23f);
        pathBuilder2.lineToRelative(37.19f, -40.3f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 187.0f, 29.24f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 96.0f);
        pathBuilder2.arcTo(72.34f, 72.34f, 0.0f, false, false, 94.0f, 124.94f);
        pathBuilder2.lineTo(33.79f, 177.0f);
        pathBuilder2.curveToRelative(-0.15f, 0.12f, -0.29f, 0.26f, -0.43f, 0.39f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f);
        pathBuilder2.curveToRelative(0.13f, -0.13f, 0.27f, -0.28f, 0.39f, -0.42f);
        pathBuilder2.lineTo(131.06f, 162.0f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 232.0f, 96.0f);
        pathBuilder2.arcTo(71.56f, 71.56f, 0.0f, false, false, 226.76f, 69.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 152.0f);
        pathBuilder2.arcToRelative(56.14f, 56.14f, 0.0f, false, true, -27.07f, -7.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.92f, 1.77f);
        pathBuilder2.lineTo(67.11f, 211.51f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f);
        pathBuilder2.lineTo(109.18f, 133.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.77f, -9.93f);
        pathBuilder2.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 58.36f, -82.31f);
        pathBuilder2.lineToRelative(-31.2f, 33.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.94f, 7.1f);
        pathBuilder2.lineTo(141.83f, 108.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.14f, 6.14f);
        pathBuilder2.lineToRelative(26.35f, 5.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -1.94f);
        pathBuilder2.lineToRelative(33.81f, -31.2f);
        pathBuilder2.arcTo(56.06f, 56.06f, 0.0f, false, true, 160.0f, 152.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
