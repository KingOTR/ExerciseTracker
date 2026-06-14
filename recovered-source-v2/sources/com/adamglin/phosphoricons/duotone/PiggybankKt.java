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

/* compiled from: Piggybank.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PiggyBank", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPiggyBank", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_piggyBank", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PiggybankKt {
    private static ImageVector _piggyBank;

    public static final ImageVector getPiggyBank(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _piggyBank;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PiggyBank", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 112.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineToRelative(-18.1f, 50.69f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.54f, 5.31f);
        pathBuilder.horizontalLineTo(177.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.54f, -5.31f);
        pathBuilder.lineTo(166.29f, 200.0f);
        pathBuilder.horizontalLineTo(97.71f);
        pathBuilder.lineTo(93.9f, 210.69f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 86.36f, 216.0f);
        pathBuilder.horizontalLineTo(73.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.54f, -5.31f);
        pathBuilder.lineTo(53.0f, 174.0f);
        pathBuilder.arcToRelative(79.7f, 79.7f, 0.0f, false, true, -21.0f, -54.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 80.0f, -80.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, true, 73.44f, 48.22f);
        pathBuilder.arcToRelative(82.22f, 82.22f, 0.0f, false, true, 2.9f, 7.78f);
        pathBuilder.horizontalLineTo(224.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(192.0f, 116.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 116.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 64.0f);
        pathBuilder2.lineTo(112.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(248.0f, 112.0f);
        pathBuilder2.verticalLineToRelative(32.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(-2.36f);
        pathBuilder2.lineToRelative(-16.21f, 45.38f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 190.36f, 224.0f);
        pathBuilder2.lineTo(177.64f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.07f, -10.62f);
        pathBuilder2.lineTo(160.65f, 208.0f);
        pathBuilder2.horizontalLineToRelative(-57.3f);
        pathBuilder2.lineToRelative(-1.92f, 5.38f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 86.36f, 224.0f);
        pathBuilder2.lineTo(73.64f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.07f, -10.62f);
        pathBuilder2.lineTo(46.0f, 178.22f);
        pathBuilder2.arcToRelative(87.69f, 87.69f, 0.0f, false, true, -21.44f, -48.38f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 144.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 24.28f, -31.0f);
        pathBuilder2.arcTo(88.12f, 88.12f, 0.0f, false, true, 112.0f, 32.0f);
        pathBuilder2.lineTo(216.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder2.lineTo(194.61f, 48.0f);
        pathBuilder2.arcToRelative(87.93f, 87.93f, 0.0f, false, true, 30.17f, 37.0f);
        pathBuilder2.curveToRelative(0.43f, 1.0f, 0.85f, 2.0f, 1.25f, 3.0f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 248.0f, 112.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 112.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(-3.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.64f, -5.6f);
        pathBuilder2.arcTo(71.9f, 71.9f, 0.0f, false, false, 144.0f, 48.0f);
        pathBuilder2.lineTo(112.0f, 48.0f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 58.91f, 168.64f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.64f, 2.71f);
        pathBuilder2.lineTo(73.64f, 208.0f);
        pathBuilder2.lineTo(86.36f, 208.0f);
        pathBuilder2.lineToRelative(3.82f, -10.69f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 97.71f, 192.0f);
        pathBuilder2.horizontalLineToRelative(68.58f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.53f, 5.31f);
        pathBuilder2.lineTo(177.64f, 208.0f);
        pathBuilder2.horizontalLineToRelative(12.72f);
        pathBuilder2.lineToRelative(18.11f, -50.69f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 152.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _piggyBank = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
