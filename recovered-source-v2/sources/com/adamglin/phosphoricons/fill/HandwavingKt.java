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

/* compiled from: Handwaving.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandWaving", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandWaving", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handWaving", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandwavingKt {
    private static ImageVector _handWaving;

    public static final ImageVector getHandWaving(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(219.31f, 98.46f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, true, true, 67.08f, 186.77f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(26.15f, 115.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.69f, -16.0f);
        pathBuilder.lineTo(72.4f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f);
        pathBuilder.lineTo(47.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 74.69f, 40.0f);
        pathBuilder.lineTo(114.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.85f, -8.0f);
        pathBuilder.lineToRelative(-30.0f, -52.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f);
        pathBuilder.lineTo(166.0f, 102.12f);
        pathBuilder.arcTo(48.25f, 48.25f, 0.0f, false, false, 152.0f, 136.0f);
        pathBuilder.arcToRelative(47.59f, 47.59f, 0.0f, false, false, 9.6f, 28.8f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 12.79f, -9.61f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 181.0f, 110.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.17f, -10.43f);
        pathBuilder.lineTo(171.71f, 80.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f);
        pathBuilder.lineToRelative(19.89f, 34.46f);
        pathBuilder.close();
        pathBuilder.moveTo(189.94f, 41.46f);
        pathBuilder.arcTo(43.74f, 43.74f, 0.0f, false, true, 216.74f, 62.0f);
        pathBuilder.lineToRelative(0.33f, 0.57f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f);
        pathBuilder.lineTo(230.6f, 54.0f);
        pathBuilder.arcToRelative(59.64f, 59.64f, 0.0f, false, false, -36.54f, -28.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.12f, 15.46f);
        pathBuilder.close();
        pathBuilder.moveTo(79.58f, 225.72f);
        pathBuilder.arcTo(103.58f, 103.58f, 0.0f, false, true, 53.93f, 196.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder.arcToRelative(119.56f, 119.56f, 0.0f, false, false, 29.6f, 34.28f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.91f, -12.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handWaving = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
