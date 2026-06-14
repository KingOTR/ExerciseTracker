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

/* compiled from: Shuffle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shuffle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getShuffle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shuffle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShuffleKt {
    private static ImageVector _shuffle;

    public static final ImageVector getShuffle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(236.24f, 179.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f);
        pathBuilder.lineTo(217.52f, 190.0f);
        pathBuilder.lineTo(200.94f, 190.0f);
        pathBuilder.arcToRelative(70.16f, 70.16f, 0.0f, false, true, -57.0f, -29.31f);
        pathBuilder.lineToRelative(-41.71f, -58.4f);
        pathBuilder.arcTo(58.11f, 58.11f, 0.0f, false, false, 55.06f, 78.0f);
        pathBuilder.lineTo(32.0f, 78.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(55.06f, 66.0f);
        pathBuilder.arcToRelative(70.16f, 70.16f, 0.0f, false, true, 57.0f, 29.31f);
        pathBuilder.lineToRelative(41.71f, 58.4f);
        pathBuilder.arcTo(58.11f, 58.11f, 0.0f, false, false, 200.94f, 178.0f);
        pathBuilder.horizontalLineToRelative(16.58f);
        pathBuilder.lineToRelative(-13.76f, -13.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, -8.48f);
        pathBuilder.close();
        pathBuilder.moveTo(144.18f, 105.35f);
        pathBuilder.arcToRelative(5.91f, 5.91f, 0.0f, false, false, 3.48f, 1.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.89f, -2.51f);
        pathBuilder.lineToRelative(1.19f, -1.67f);
        pathBuilder.arcTo(58.11f, 58.11f, 0.0f, false, true, 200.94f, 78.0f);
        pathBuilder.horizontalLineToRelative(16.58f);
        pathBuilder.lineTo(203.76f, 91.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.48f);
        pathBuilder.lineToRelative(-24.0f, -24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f);
        pathBuilder.lineTo(217.52f, 66.0f);
        pathBuilder.lineTo(200.94f, 66.0f);
        pathBuilder.arcToRelative(70.16f, 70.16f, 0.0f, false, false, -57.0f, 29.31f);
        pathBuilder.lineTo(142.78f, 97.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 144.18f, 105.35f);
        pathBuilder.close();
        pathBuilder.moveTo(111.82f, 150.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.37f, 1.39f);
        pathBuilder.lineToRelative(-1.19f, 1.67f);
        pathBuilder.arcTo(58.11f, 58.11f, 0.0f, false, true, 55.06f, 178.0f);
        pathBuilder.lineTo(32.0f, 178.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(55.06f, 190.0f);
        pathBuilder.arcToRelative(70.16f, 70.16f, 0.0f, false, false, 57.0f, -29.31f);
        pathBuilder.lineToRelative(1.19f, -1.67f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 111.82f, 150.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shuffle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
