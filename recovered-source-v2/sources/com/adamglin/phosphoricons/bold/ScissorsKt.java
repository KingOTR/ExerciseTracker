package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(238.78f, 183.79f);
        pathBuilder.lineTo(98.28f, 87.65f);
        pathBuilder.arcTo(40.18f, 40.18f, 0.0f, false, false, 100.0f, 76.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -15.29f, 31.45f);
        pathBuilder.lineToRelative(30.0f, 20.56f);
        pathBuilder.lineToRelative(-30.0f, 20.56f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 3.57f, 59.74f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(39.73f, 39.73f, 0.0f, false, false, 100.0f, 180.0f);
        pathBuilder.arcToRelative(40.18f, 40.18f, 0.0f, false, false, -1.72f, -11.66f);
        pathBuilder.lineTo(136.0f, 142.54f);
        pathBuilder.lineToRelative(89.22f, 61.06f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.56f, -19.81f);
        pathBuilder.close();
        pathBuilder.moveTo(71.31f, 191.33f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, true, true, 76.0f, 180.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 71.31f, 191.33f);
        pathBuilder.close();
        pathBuilder.moveTo(48.69f, 87.3f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 22.62f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 48.69f, 87.3f);
        pathBuilder.close();
        pathBuilder.moveTo(161.51f, 110.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.13f, -16.68f);
        pathBuilder.lineTo(225.22f, 52.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 13.56f, 19.81f);
        pathBuilder.lineToRelative(-60.59f, 41.46f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.68f, -3.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
