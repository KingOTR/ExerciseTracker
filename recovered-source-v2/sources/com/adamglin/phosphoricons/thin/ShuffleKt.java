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

/* compiled from: Shuffle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shuffle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getShuffle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shuffle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShuffleKt {
    private static ImageVector _shuffle;

    public static final ImageVector getShuffle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(234.83f, 181.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(222.34f, 188.0f);
        pathBuilder.horizontalLineToRelative(-21.4f);
        pathBuilder.arcToRelative(68.15f, 68.15f, 0.0f, false, true, -55.34f, -28.48f);
        pathBuilder.lineToRelative(-41.71f, -58.39f);
        pathBuilder.arcTo(60.11f, 60.11f, 0.0f, false, false, 55.06f, 76.0f);
        pathBuilder.lineTo(32.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(55.06f, 68.0f);
        pathBuilder.arcTo(68.15f, 68.15f, 0.0f, false, true, 110.4f, 96.48f);
        pathBuilder.lineToRelative(41.71f, 58.39f);
        pathBuilder.arcTo(60.11f, 60.11f, 0.0f, false, false, 200.94f, 180.0f);
        pathBuilder.horizontalLineToRelative(21.4f);
        pathBuilder.lineToRelative(-17.17f, -17.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(145.34f, 103.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.58f, -0.93f);
        pathBuilder.lineToRelative(1.19f, -1.67f);
        pathBuilder.arcTo(60.11f, 60.11f, 0.0f, false, true, 200.94f, 76.0f);
        pathBuilder.horizontalLineToRelative(21.4f);
        pathBuilder.lineTo(205.17f, 93.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineTo(222.34f, 68.0f);
        pathBuilder.horizontalLineToRelative(-21.4f);
        pathBuilder.arcTo(68.15f, 68.15f, 0.0f, false, false, 145.6f, 96.48f);
        pathBuilder.lineToRelative(-1.19f, 1.67f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 145.34f, 103.73f);
        pathBuilder.close();
        pathBuilder.moveTo(110.66f, 152.27f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.58f, 0.93f);
        pathBuilder.lineToRelative(-1.19f, 1.67f);
        pathBuilder.arcTo(60.11f, 60.11f, 0.0f, false, true, 55.06f, 180.0f);
        pathBuilder.lineTo(32.0f, 180.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(55.06f, 188.0f);
        pathBuilder.arcToRelative(68.15f, 68.15f, 0.0f, false, false, 55.34f, -28.48f);
        pathBuilder.lineToRelative(1.19f, -1.67f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 110.66f, 152.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shuffle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
