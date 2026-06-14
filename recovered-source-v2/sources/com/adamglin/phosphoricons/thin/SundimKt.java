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

/* compiled from: Sundim.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SunDim", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSunDim", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunDim", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SundimKt {
    private static ImageVector _sunDim;

    public static final ImageVector getSunDim(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sunDim;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SunDim", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.0f, 40.0f);
        pathBuilder.lineTo(124.0f, 32.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 128.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, -60.0f, -60.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 188.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 128.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, -52.0f, 52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 180.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(61.17f, 66.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(61.17f, 189.17f);
        pathBuilder.lineTo(53.17f, 197.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(197.17f, 53.17f);
        pathBuilder.lineTo(189.17f, 61.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(194.83f, 189.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineToRelative(8.0f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 124.0f);
        pathBuilder.lineTo(32.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunDim = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
