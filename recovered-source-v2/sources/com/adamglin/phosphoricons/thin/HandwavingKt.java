package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handwaving.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandWaving", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandWaving", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handWaving", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandwavingKt {
    private static ImageVector _handWaving;

    public static final ImageVector getHandWaving(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handWaving;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandWaving", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.71f, 102.0f);
        pathBuilder.lineTo(199.4f, 72.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -43.57f, 4.52f);
        pathBuilder.lineTo(134.74f, 40.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -43.69f, 4.9f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 51.61f, 72.0f);
        pathBuilder.lineToRelative(5.31f, 9.19f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -25.71f, 35.47f);
        pathBuilder.lineToRelative(40.0f, 69.32f);
        pathBuilder.arcToRelative(83.4f, 83.4f, 0.0f, false, false, 51.0f, 39.14f);
        pathBuilder.arcToRelative(84.45f, 84.45f, 0.0f, false, false, 21.88f, 2.9f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 72.6f, -126.0f);
        pathBuilder.close();
        pathBuilder.moveTo(217.38f, 163.67f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 78.16f, 182.0f);
        pathBuilder.lineToRelative(-40.0f, -69.32f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f);
        pathBuilder.lineTo(85.09f, 130.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 126.0f);
        pathBuilder.lineTo(58.54f, 68.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 86.25f, 52.0f);
        pathBuilder.lineToRelative(31.17f, 54.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.93f, -4.0f);
        pathBuilder.lineTo(100.1f, 60.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.72f, -16.0f);
        pathBuilder.lineToRelative(35.0f, 60.63f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -7.28f, 57.61f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.62f, -4.49f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 8.22f, -49.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.07f, -5.2f);
        pathBuilder.lineTo(164.76f, 92.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 27.71f, -16.0f);
        pathBuilder.lineToRelative(17.31f, 30.0f);
        pathBuilder.arcTo(75.52f, 75.52f, 0.0f, false, true, 217.38f, 163.65f);
        pathBuilder.close();
        pathBuilder.moveTo(188.12f, 32.74f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 193.0f, 29.9f);
        pathBuilder.arcTo(55.65f, 55.65f, 0.0f, false, true, 227.11f, 56.0f);
        pathBuilder.lineToRelative(0.33f, 0.58f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 226.0f, 62.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.47f, -1.46f);
        pathBuilder.lineToRelative(-0.33f, -0.57f);
        pathBuilder.arcTo(47.62f, 47.62f, 0.0f, false, false, 191.0f, 37.63f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 188.12f, 32.74f);
        pathBuilder.close();
        pathBuilder.moveTo(77.75f, 234.48f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 74.61f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.47f, -0.86f);
        pathBuilder.arcTo(115.55f, 115.55f, 0.0f, false, true, 43.53f, 202.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.92f, -4.0f);
        pathBuilder.arcToRelative(107.72f, 107.72f, 0.0f, false, false, 26.64f, 30.86f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 77.75f, 234.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handWaving = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
