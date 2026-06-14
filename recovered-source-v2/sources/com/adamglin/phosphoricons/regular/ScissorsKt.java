package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(157.73f, 113.13f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 159.82f, 102.0f);
        pathBuilder.lineTo(227.48f, 55.7f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.0f, 13.21f);
        pathBuilder.lineToRelative(-67.67f, 46.3f);
        pathBuilder.arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.51f, 1.4f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 157.73f, 113.13f);
        pathBuilder.close();
        pathBuilder.moveTo(238.6f, 198.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.12f, 2.08f);
        pathBuilder.lineTo(136.0f, 137.7f);
        pathBuilder.lineTo(93.49f, 166.78f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, true, -9.0f, -13.19f);
        pathBuilder.lineTo(121.83f, 128.0f);
        pathBuilder.lineTo(84.44f, 102.41f);
        pathBuilder.arcToRelative(35.86f, 35.86f, 0.0f, true, true, 9.0f, -13.19f);
        pathBuilder.lineToRelative(143.0f, 97.87f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 238.6f, 198.22f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 180.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -5.86f, 14.14f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 80.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(74.14f, 90.13f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -28.28f, 0.0f);
        pathBuilder.arcTo(19.85f, 19.85f, 0.0f, false, false, 74.14f, 90.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
