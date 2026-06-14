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

/* compiled from: Shuffle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shuffle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getShuffle", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shuffle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShuffleKt {
    private static ImageVector _shuffle;

    public static final ImageVector getShuffle(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _shuffle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Shuffle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(237.66f, 178.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 208.0f);
        pathBuilder.lineTo(200.0f, 192.0f);
        pathBuilder.arcToRelative(72.15f, 72.15f, 0.0f, false, true, -57.65f, -30.14f);
        pathBuilder.lineToRelative(-41.72f, -58.4f);
        pathBuilder.arcTo(56.1f, 56.1f, 0.0f, false, false, 55.06f, 80.0f);
        pathBuilder.lineTo(32.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.lineTo(55.06f, 64.0f);
        pathBuilder.arcToRelative(72.12f, 72.12f, 0.0f, false, true, 58.59f, 30.15f);
        pathBuilder.lineToRelative(41.72f, 58.4f);
        pathBuilder.arcTo(56.08f, 56.08f, 0.0f, false, false, 200.0f, 176.0f);
        pathBuilder.lineTo(200.0f, 160.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(143.0f, 107.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.16f, -1.86f);
        pathBuilder.lineToRelative(1.2f, -1.67f);
        pathBuilder.arcTo(56.08f, 56.08f, 0.0f, false, true, 200.0f, 80.0f);
        pathBuilder.lineTo(200.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f);
        pathBuilder.lineTo(200.0f, 64.0f);
        pathBuilder.arcToRelative(72.15f, 72.15f, 0.0f, false, false, -57.65f, 30.14f);
        pathBuilder.lineToRelative(-1.2f, 1.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 143.0f, 107.0f);
        pathBuilder.close();
        pathBuilder.moveTo(113.0f, 149.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.16f, 1.86f);
        pathBuilder.lineToRelative(-1.2f, 1.67f);
        pathBuilder.arcTo(56.1f, 56.1f, 0.0f, false, true, 55.06f, 176.0f);
        pathBuilder.lineTo(32.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(55.06f, 192.0f);
        pathBuilder.arcToRelative(72.12f, 72.12f, 0.0f, false, false, 58.59f, -30.15f);
        pathBuilder.lineToRelative(1.2f, -1.67f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 113.0f, 149.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shuffle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
