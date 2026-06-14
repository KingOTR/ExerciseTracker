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

/* compiled from: Pushpinslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPinSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPushPinSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPinSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinslashKt {
    private static ImageVector _pushPinSlash;

    public static final ImageVector getPushPinSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pushPinSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPinSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(67.37f, 73.2f);
        pathBuilder.arcTo(69.82f, 69.82f, 0.0f, false, false, 38.0f, 87.63f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.29f, 23.78f);
        pathBuilder.lineTo(85.0f, 159.71f);
        pathBuilder.lineTo(42.34f, 202.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineTo(96.29f, 171.0f);
        pathBuilder.lineToRelative(48.29f, 48.29f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 155.9f, 224.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.75f, 0.0f, 1.13f, 0.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 11.64f, -6.33f);
        pathBuilder.arcToRelative(89.75f, 89.75f, 0.0f, false, false, 11.58f, -20.27f);
        pathBuilder.lineToRelative(21.84f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(155.9f, 208.0f);
        pathBuilder.lineTo(48.0f, 100.08f);
        pathBuilder.curveTo(58.23f, 91.83f, 69.2f, 87.72f, 80.66f, 87.81f);
        pathBuilder.lineToRelative(87.16f, 95.88f);
        pathBuilder.curveTo(165.59f, 193.56f, 160.24f, 202.23f, 155.9f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.32f, 104.0f);
        pathBuilder.lineTo(190.68f, 148.79f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.33f, -11.3f);
        pathBuilder.lineTo(224.0f, 92.7f);
        pathBuilder.lineTo(163.32f, 32.0f);
        pathBuilder.lineTo(122.1f, 73.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.33f, -11.29f);
        pathBuilder.lineTo(152.0f, 20.7f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f);
        pathBuilder.lineToRelative(60.69f, 60.68f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 235.32f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPinSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
