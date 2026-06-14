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

/* compiled from: Clockcounterclockwise.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ClockCounterClockwise", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getClockCounterClockwise", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_clockCounterClockwise", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClockcounterclockwiseKt {
    private static ImageVector _clockCounterClockwise;

    public static final ImageVector getClockCounterClockwise(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _clockCounterClockwise;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ClockCounterClockwise", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.0f, 80.0f);
        pathBuilder.verticalLineToRelative(44.6f);
        pathBuilder.lineToRelative(37.09f, 22.25f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.18f, 10.3f);
        pathBuilder.lineToRelative(-40.0f, -24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 128.0f);
        pathBuilder.lineTo(122.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 34.0f);
        pathBuilder.arcTo(93.4f, 93.4f, 0.0f, false, false, 61.51f, 61.56f);
        pathBuilder.curveToRelative(-8.58f, 8.68f, -16.0f, 17.0f, -23.51f, 25.8f);
        pathBuilder.lineTo(38.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.lineTo(72.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(44.73f, 98.0f);
        pathBuilder.curveTo(52.86f, 88.29f, 60.79f, 79.35f, 70.0f, 70.0f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, true, true, 1.7f, 117.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.24f, 8.72f);
        pathBuilder.arcTo(94.0f, 94.0f, 0.0f, true, false, 128.0f, 34.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _clockCounterClockwise = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
