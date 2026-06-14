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

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(236.52f, 187.09f);
        pathBuilder.lineToRelative(-143.0f, -97.87f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -14.38f, 17.27f);
        pathBuilder.lineToRelative(21.39f, 21.69f);
        pathBuilder.lineTo(79.15f, 149.54f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(35.91f, 35.91f, 0.0f, true, false, 14.38f, 17.27f);
        pathBuilder.lineToRelative(26.91f, -18.41f);
        pathBuilder.lineTo(170.0f, 198.64f);
        pathBuilder.arcToRelative(32.26f, 32.26f, 0.0f, false, false, 22.7f, 9.37f);
        pathBuilder.arcToRelative(31.52f, 31.52f, 0.0f, false, false, 4.11f, -0.27f);
        pathBuilder.lineToRelative(0.28f, 0.0f);
        pathBuilder.lineToRelative(36.27f, -6.11f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.19f, -14.5f);
        pathBuilder.close();
        pathBuilder.moveTo(74.14f, 90.09f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 74.14f, 90.13f);
        pathBuilder.close();
        pathBuilder.moveTo(74.14f, 194.09f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, true, 80.0f, 180.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 74.14f, 194.15f);
        pathBuilder.close();
        pathBuilder.moveTo(135.14f, 92.59f);
        pathBuilder.lineTo(169.94f, 57.4f);
        pathBuilder.arcToRelative(32.19f, 32.19f, 0.0f, false, true, 26.84f, -9.14f);
        pathBuilder.lineToRelative(0.28f, 0.0f);
        pathBuilder.lineToRelative(36.0f, 6.07f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, true, 6.09f, 4.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.67f, 10.12f);
        pathBuilder.lineToRelative(-69.93f, 47.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.51f, 0.0f);
        pathBuilder.lineToRelative(-26.31f, -18.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 135.18f, 92.65f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
