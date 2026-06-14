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

/* compiled from: Handspraying.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandsPraying", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getHandsPraying", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handsPraying", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandsprayingKt {
    private static ImageVector _handsPraying;

    public static final ImageVector getHandsPraying(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _handsPraying;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandsPraying", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.32f, 180.0f);
        pathBuilder.lineToRelative(-36.24f, -36.25f);
        pathBuilder.lineTo(162.62f, 23.46f);
        pathBuilder.arcTo(21.76f, 21.76f, 0.0f, false, false, 128.0f, 12.93f);
        pathBuilder.arcTo(21.76f, 21.76f, 0.0f, false, false, 93.38f, 23.46f);
        pathBuilder.lineTo(56.92f, 143.76f);
        pathBuilder.lineTo(20.68f, 180.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.62f);
        pathBuilder.lineToRelative(32.69f, 32.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.lineTo(124.28f, 187.0f);
        pathBuilder.arcToRelative(40.68f, 40.68f, 0.0f, false, false, 3.72f, -4.29f);
        pathBuilder.arcToRelative(40.68f, 40.68f, 0.0f, false, false, 3.72f, 4.29f);
        pathBuilder.lineTo(180.0f, 235.32f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f);
        pathBuilder.lineToRelative(32.69f, -32.69f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 158.75f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, true, -7.0f, 17.0f);
        pathBuilder.lineTo(88.68f, 200.0f);
        pathBuilder.lineTo(56.0f, 167.32f);
        pathBuilder.lineToRelative(13.65f, -13.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, -3.34f);
        pathBuilder.lineToRelative(37.0f, -122.22f);
        pathBuilder.arcTo(5.78f, 5.78f, 0.0f, false, true, 120.0f, 29.78f);
        pathBuilder.close();
        pathBuilder.moveTo(167.44f, 200.13f);
        pathBuilder.lineTo(143.0f, 175.72f);
        pathBuilder.arcToRelative(23.85f, 23.85f, 0.0f, false, true, -7.0f, -17.0f);
        pathBuilder.verticalLineToRelative(-129.0f);
        pathBuilder.arcToRelative(5.78f, 5.78f, 0.0f, false, true, 11.31f, -1.68f);
        pathBuilder.lineToRelative(37.0f, 122.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, 3.34f);
        pathBuilder.lineToRelative(14.49f, 14.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handsPraying = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
