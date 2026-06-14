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

/* compiled from: Stethoscope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Stethoscope", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStethoscope", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stethoscope", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StethoscopeKt {
    private static ImageVector _stethoscope;

    public static final ImageVector getStethoscope(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _stethoscope;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Stethoscope", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.83f, 195.79f);
        pathBuilder.arcTo(44.06f, 44.06f, 0.0f, false, true, 168.0f, 236.0f);
        pathBuilder.lineTo(144.0f, 236.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f);
        pathBuilder.lineTo(100.0f, 147.85f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 44.0f, 88.0f);
        pathBuilder.lineTo(44.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(72.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(52.0f, 44.0f);
        pathBuilder.lineTo(52.0f, 88.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 52.69f, 52.0f);
        pathBuilder.curveTo(133.0f, 139.63f, 156.0f, 115.93f, 156.0f, 87.17f);
        pathBuilder.lineTo(156.0f, 44.0f);
        pathBuilder.lineTo(136.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.lineTo(164.0f, 87.17f);
        pathBuilder.curveToRelative(0.0f, 32.0f, -24.84f, 58.59f, -56.0f, 60.69f);
        pathBuilder.lineTo(108.0f, 192.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(36.05f, 36.05f, 0.0f, false, false, 35.8f, -32.25f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 160.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 236.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stethoscope = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
