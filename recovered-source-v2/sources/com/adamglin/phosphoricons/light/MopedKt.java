package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Moped.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Moped", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMoped", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_moped", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MopedKt {
    private static ImageVector _moped;

    public static final ImageVector getMoped(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _moped;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Moped", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 130.0f);
        pathBuilder.arcToRelative(37.72f, 37.72f, 0.0f, false, false, -7.56f, 0.76f);
        pathBuilder.lineTo(173.62f, 37.89f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 168.0f, 34.0f);
        pathBuilder.lineTo(136.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(27.84f);
        pathBuilder.lineToRelative(33.37f, 89.0f);
        pathBuilder.arcToRelative(38.08f, 38.08f, 0.0f, false, false, -18.73f, 27.0f);
        pathBuilder.lineTo(135.16f, 162.0f);
        pathBuilder.lineTo(109.62f, 93.89f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 90.0f);
        pathBuilder.lineTo(24.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(34.0f, 102.0f);
        pathBuilder.verticalLineToRelative(16.67f);
        pathBuilder.arcTo(54.12f, 54.12f, 0.0f, false, false, 2.0f, 168.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(18.48f, 174.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(85.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, true, false, 216.0f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(42.0f, 128.39f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.0f, -5.66f);
        pathBuilder.lineTo(46.0f, 102.0f);
        pathBuilder.lineTo(99.84f, 102.0f);
        pathBuilder.lineToRelative(22.5f, 60.0f);
        pathBuilder.lineTo(14.43f, 162.0f);
        pathBuilder.arcTo(42.07f, 42.07f, 0.0f, false, true, 42.0f, 128.39f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 194.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -25.29f, -20.0f);
        pathBuilder.lineTo(81.29f, 174.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 56.0f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 194.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -14.5f, -47.57f);
        pathBuilder.lineToRelative(8.88f, 23.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.24f, -4.22f);
        pathBuilder.lineToRelative(-8.88f, -23.68f);
        pathBuilder.arcTo(26.91f, 26.91f, 0.0f, false, true, 216.0f, 142.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _moped = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
