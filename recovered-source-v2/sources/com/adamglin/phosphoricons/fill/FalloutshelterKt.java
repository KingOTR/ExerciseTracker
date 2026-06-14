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

/* compiled from: Falloutshelter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FalloutShelter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFalloutShelter", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_falloutShelter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FalloutshelterKt {
    private static ImageVector _falloutShelter;

    public static final ImageVector getFalloutShelter(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _falloutShelter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FalloutShelter", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.94f, 124.55f);
        pathBuilder.curveToRelative(-1.77f, -54.49f, -46.0f, -98.72f, -100.49f, -100.49f);
        pathBuilder.arcTo(104.09f, 104.09f, 0.0f, false, false, 24.06f, 131.45f);
        pathBuilder.curveToRelative(1.77f, 54.49f, 46.0f, 98.72f, 100.49f, 100.49f);
        pathBuilder.arcTo(104.09f, 104.09f, 0.0f, false, false, 231.94f, 124.55f);
        pathBuilder.close();
        pathBuilder.moveTo(198.38f, 141.47f);
        pathBuilder.lineTo(174.93f, 174.3f);
        pathBuilder.arcToRelative(8.52f, 8.52f, 0.0f, false, true, -13.86f, 0.0f);
        pathBuilder.lineTo(128.0f, 128.0f);
        pathBuilder.lineTo(94.93f, 174.3f);
        pathBuilder.arcToRelative(8.52f, 8.52f, 0.0f, false, true, -13.86f, 0.0f);
        pathBuilder.lineTo(57.62f, 141.47f);
        pathBuilder.arcTo(8.52f, 8.52f, 0.0f, false, true, 64.55f, 128.0f);
        pathBuilder.lineTo(128.0f, 128.0f);
        pathBuilder.lineTo(97.62f, 85.47f);
        pathBuilder.arcTo(8.52f, 8.52f, 0.0f, false, true, 104.55f, 72.0f);
        pathBuilder.horizontalLineToRelative(46.9f);
        pathBuilder.arcToRelative(8.52f, 8.52f, 0.0f, false, true, 6.93f, 13.47f);
        pathBuilder.lineTo(128.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(63.45f);
        pathBuilder.arcTo(8.52f, 8.52f, 0.0f, false, true, 198.38f, 141.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _falloutShelter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
