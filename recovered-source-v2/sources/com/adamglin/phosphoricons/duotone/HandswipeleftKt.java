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

/* compiled from: Handswipeleft.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandSwipeLeft", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHandSwipeLeft", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handSwipeLeft", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandswipeleftKt {
    private static ImageVector _handSwipeLeft;

    public static final ImageVector getHandSwipeLeft(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _handSwipeLeft;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandSwipeLeft", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 140.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.curveToRelative(0.0f, 24.0f, -8.0f, 40.0f, -8.0f, 40.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.lineTo(34.68f, 166.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 34.64f, -20.0f);
        pathBuilder.lineTo(88.0f, 176.0f);
        pathBuilder.verticalLineTo(68.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(216.0f, 140.0f);
        pathBuilder2.verticalLineToRelative(36.0f);
        pathBuilder2.curveToRelative(0.0f, 25.59f, -8.49f, 42.85f, -8.85f, 43.58f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 224.0f);
        pathBuilder2.arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.57f, -0.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.58f, -10.73f);
        pathBuilder2.curveToRelative(0.06f, -0.12f, 7.16f, -14.81f, 7.16f, -36.42f);
        pathBuilder2.lineTo(200.01f, 140.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(4.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(160.01f, 124.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(12.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.01f, 68.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder2.lineTo(96.01f, 176.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.79f, 4.23f);
        pathBuilder2.lineToRelative(-18.68f, -30.0f);
        pathBuilder2.lineToRelative(-0.14f, -0.23f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, true, false, 41.6f, 162.0f);
        pathBuilder2.lineTo(70.89f, 212.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 57.08f, 220.0f);
        pathBuilder2.lineToRelative(-29.32f, -50.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 48.41f, -28.17f);
        pathBuilder2.lineTo(80.0f, 148.0f);
        pathBuilder2.lineTo(80.0f, 68.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 98.7f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 38.65f, 16.69f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 216.0f, 140.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(248.0f, 48.0f);
        pathBuilder2.lineTo(195.31f, 48.0f);
        pathBuilder2.lineToRelative(18.34f, -18.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f);
        pathBuilder2.lineToRelative(-32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, -11.32f);
        pathBuilder2.lineTo(195.31f, 64.0f);
        pathBuilder2.lineTo(248.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handSwipeLeft = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
