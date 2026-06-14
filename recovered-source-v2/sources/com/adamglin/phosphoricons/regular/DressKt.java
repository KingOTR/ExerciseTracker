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

/* compiled from: Dress.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dress", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDress", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dress", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DressKt {
    private static ImageVector _dress;

    public static final ImageVector getDress(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(214.7f, 209.7f);
        pathBuilder.arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, -0.25f);
        pathBuilder.lineToRelative(-45.48f, -96.86f);
        pathBuilder.lineToRelative(20.5f, -32.18f);
        pathBuilder.arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.11f, -0.18f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -16.46f);
        pathBuilder.curveToRelative(-0.09f, -0.16f, -0.2f, -0.32f, -0.3f, -0.47f);
        pathBuilder.lineTo(168.0f, 32.7f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(32.42f);
        pathBuilder.lineTo(146.74f, 39.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -37.48f, 0.0f);
        pathBuilder.lineTo(104.0f, 32.42f);
        pathBuilder.verticalLineTo(8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 8.0f);
        pathBuilder.verticalLineTo(32.7f);
        pathBuilder.lineTo(66.58f, 63.3f);
        pathBuilder.curveToRelative(-0.1f, 0.15f, -0.21f, 0.31f, -0.3f, 0.47f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 16.46f);
        pathBuilder.arcToRelative(1.74f, 1.74f, 0.0f, false, false, 0.11f, 0.18f);
        pathBuilder.lineToRelative(20.5f, 32.18f);
        pathBuilder.lineTo(41.41f, 209.45f);
        pathBuilder.arcToRelative(1.89f, 1.89f, 0.0f, false, false, -0.11f, 0.25f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 232.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.71f, -22.3f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 72.0f);
        pathBuilder.lineTo(96.43f, 48.57f);
        pathBuilder.lineToRelative(0.33f, 0.42f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 62.48f, 0.0f);
        pathBuilder.lineToRelative(0.33f, -0.42f);
        pathBuilder.lineTo(176.0f, 72.0f);
        pathBuilder.lineToRelative(-20.38f, 32.0f);
        pathBuilder.horizontalLineTo(100.39f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 216.0f);
        pathBuilder.lineToRelative(45.07f, -96.0f);
        pathBuilder.horizontalLineToRelative(53.84f);
        pathBuilder.lineTo(200.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dress = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
