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

/* compiled from: Dress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dress", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getDress", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dress", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DressKt {
    private static ImageVector _dress;

    public static final ImageVector getDress(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _dress;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dress", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 224.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.35f, -11.15f);
        pathBuilder.lineTo(96.0f, 112.0f);
        pathBuilder.lineTo(73.14f, 76.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -8.24f);
        pathBuilder.lineTo(96.0f, 35.23f);
        pathBuilder.lineTo(103.0f, 44.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 50.0f, 0.0f);
        pathBuilder.lineToRelative(7.0f, -8.76f);
        pathBuilder.lineToRelative(22.86f, 32.65f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.24f);
        pathBuilder.lineTo(160.0f, 112.0f);
        pathBuilder.lineToRelative(47.34f, 100.85f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(214.7f, 209.7f);
        pathBuilder2.arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, -0.25f);
        pathBuilder2.lineToRelative(-45.48f, -96.86f);
        pathBuilder2.lineToRelative(20.5f, -32.18f);
        pathBuilder2.lineToRelative(0.11f, -0.18f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -16.46f);
        pathBuilder2.curveToRelative(-0.09f, -0.16f, -0.2f, -0.32f, -0.3f, -0.47f);
        pathBuilder2.lineTo(168.0f, 32.7f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineTo(32.42f);
        pathBuilder2.lineTo(146.74f, 39.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -37.48f, 0.0f);
        pathBuilder2.lineTo(104.0f, 32.42f);
        pathBuilder2.verticalLineTo(8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 8.0f);
        pathBuilder2.verticalLineTo(32.7f);
        pathBuilder2.lineTo(66.58f, 63.3f);
        pathBuilder2.curveToRelative(-0.1f, 0.15f, -0.21f, 0.31f, -0.3f, 0.47f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 16.46f);
        pathBuilder2.lineToRelative(0.11f, 0.18f);
        pathBuilder2.lineToRelative(20.5f, 32.18f);
        pathBuilder2.lineTo(41.41f, 209.45f);
        pathBuilder2.arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, 0.25f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 232.0f);
        pathBuilder2.horizontalLineTo(200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.71f, -22.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 72.0f);
        pathBuilder2.lineTo(96.43f, 48.57f);
        pathBuilder2.lineToRelative(0.33f, 0.42f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 62.48f, 0.0f);
        pathBuilder2.lineToRelative(0.33f, -0.42f);
        pathBuilder2.lineTo(176.0f, 72.0f);
        pathBuilder2.lineToRelative(-20.38f, 32.0f);
        pathBuilder2.horizontalLineTo(100.39f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 216.0f);
        pathBuilder2.lineToRelative(45.07f, -96.0f);
        pathBuilder2.horizontalLineToRelative(53.84f);
        pathBuilder2.lineTo(200.0f, 216.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dress = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
