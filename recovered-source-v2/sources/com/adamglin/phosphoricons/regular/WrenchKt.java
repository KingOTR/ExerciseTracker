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

/* compiled from: Wrench.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wrench", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWrench", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wrench", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrenchKt {
    private static ImageVector _wrench;

    public static final ImageVector getWrench(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _wrench;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wrench", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.76f, 69.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.84f, -2.88f);
        pathBuilder.lineToRelative(-40.3f, 37.19f);
        pathBuilder.lineToRelative(-17.23f, -3.7f);
        pathBuilder.lineToRelative(-3.7f, -17.23f);
        pathBuilder.lineToRelative(37.19f, -40.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 187.0f, 29.24f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 96.0f);
        pathBuilder.arcTo(72.34f, 72.34f, 0.0f, false, false, 94.0f, 124.94f);
        pathBuilder.lineTo(33.79f, 177.0f);
        pathBuilder.curveToRelative(-0.15f, 0.12f, -0.29f, 0.26f, -0.43f, 0.39f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 45.26f, 45.26f);
        pathBuilder.curveToRelative(0.13f, -0.13f, 0.27f, -0.28f, 0.39f, -0.42f);
        pathBuilder.lineTo(131.06f, 162.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 232.0f, 96.0f);
        pathBuilder.arcTo(71.56f, 71.56f, 0.0f, false, false, 226.76f, 69.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 152.0f);
        pathBuilder.arcToRelative(56.14f, 56.14f, 0.0f, false, true, -27.07f, -7.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.92f, 1.77f);
        pathBuilder.lineTo(67.11f, 211.51f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.62f, -22.62f);
        pathBuilder.lineTo(109.18f, 133.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.77f, -9.93f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, 58.36f, -82.31f);
        pathBuilder.lineToRelative(-31.2f, 33.81f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.94f, 7.1f);
        pathBuilder.lineTo(141.83f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.14f, 6.14f);
        pathBuilder.lineToRelative(26.35f, 5.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.1f, -1.94f);
        pathBuilder.lineToRelative(33.81f, -31.2f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 160.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wrench = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
