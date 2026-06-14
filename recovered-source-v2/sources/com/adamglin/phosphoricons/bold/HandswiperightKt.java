package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handswiperight.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandSwipeRight", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHandSwipeRight", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handSwipeRight", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandswiperightKt {
    private static ImageVector _handSwipeRight;

    public static final ImageVector getHandSwipeRight(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _handSwipeRight;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandSwipeRight", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.0f, 148.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.curveToRelative(0.0f, 13.85f, -1.63f, 26.52f, -4.58f, 35.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.84f, -7.36f);
        pathBuilder.curveToRelative(2.14f, -6.65f, 3.42f, -17.24f, 3.42f, -28.32f);
        pathBuilder.verticalLineTo(148.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.18f, 6.34f);
        pathBuilder.lineToRelative(-18.68f, -30.0f);
        pathBuilder.lineToRelative(-0.21f, -0.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 45.0f, 167.92f);
        pathBuilder.lineTo(70.27f, 209.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.56f, 12.39f);
        pathBuilder.lineToRelative(-25.31f, -42.0f);
        pathBuilder.lineToRelative(-0.12f, -0.2f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 76.0f, 142.83f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f);
        pathBuilder.verticalLineToRelative(25.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, 36.78f, 17.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 220.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(252.48f, 47.51f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(215.0f, 44.0f);
        pathBuilder.horizontalLineTo(172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(43.0f);
        pathBuilder.lineTo(203.51f, 79.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 252.48f, 47.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handSwipeRight = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
