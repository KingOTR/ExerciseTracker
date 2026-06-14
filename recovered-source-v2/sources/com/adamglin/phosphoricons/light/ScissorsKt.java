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

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _scissors;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scissors", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(159.38f, 112.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.57f, -8.34f);
        pathBuilder.lineToRelative(67.66f, -46.31f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.78f, 9.91f);
        pathBuilder.lineToRelative(-67.67f, 46.3f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.34f, -1.56f);
        pathBuilder.close();
        pathBuilder.moveTo(237.0f, 197.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.34f, 1.56f);
        pathBuilder.lineTo(136.0f, 135.27f);
        pathBuilder.lineTo(91.0f, 166.06f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, true, true, 84.0f, 156.0f);
        pathBuilder.arcToRelative(1.8f, 1.8f, 0.0f, false, false, 0.19f, 0.2f);
        pathBuilder.lineTo(125.37f, 128.0f);
        pathBuilder.lineTo(84.23f, 99.84f);
        pathBuilder.lineTo(84.0f, 100.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 7.0f, -10.1f);
        pathBuilder.lineToRelative(144.38f, 98.8f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 237.0f, 197.09f);
        pathBuilder.close();
        pathBuilder.moveTo(75.56f, 91.55f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, -31.12f, 0.0f);
        pathBuilder.arcToRelative(21.88f, 21.88f, 0.0f, false, false, 31.12f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 180.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, true, false, -6.44f, 15.56f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(21.88f, 21.88f, 0.0f, false, false, 82.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
