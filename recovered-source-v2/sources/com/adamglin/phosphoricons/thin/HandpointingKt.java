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

/* compiled from: Handpointing.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandPointing", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHandPointing", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handPointing", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandpointingKt {
    private static ImageVector _handPointing;

    public static final ImageVector getHandPointing(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _handPointing;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandPointing", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.0f, 92.0f);
        pathBuilder.arcToRelative(23.88f, 23.88f, 0.0f, false, false, -16.07f, 6.19f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 140.0f, 82.13f);
        pathBuilder.lineTo(140.0f, 44.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f);
        pathBuilder.verticalLineToRelative(94.0f);
        pathBuilder.lineTo(80.75f, 119.94f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 39.2f, 144.0f);
        pathBuilder.lineToRelative(4.68f, 8.25f);
        pathBuilder.curveTo(61.21f, 182.8f, 72.66f, 203.0f, 85.66f, 216.33f);
        pathBuilder.curveTo(99.28f, 230.3f, 113.86f, 236.0f, 136.0f, 236.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, -84.0f);
        pathBuilder.lineTo(220.0f, 116.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 196.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 152.0f);
        pathBuilder.arcToRelative(76.09f, 76.09f, 0.0f, false, true, -76.0f, 76.0f);
        pathBuilder.curveToRelative(-40.0f, 0.0f, -51.35f, -20.08f, -85.16f, -79.71f);
        pathBuilder.lineTo(46.15f, 140.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f);
        pathBuilder.arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.07f, 0.12f);
        pathBuilder.lineToRelative(18.68f, 30.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 100.0f, 152.0f);
        pathBuilder.lineTo(100.0f, 44.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 100.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handPointing = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
