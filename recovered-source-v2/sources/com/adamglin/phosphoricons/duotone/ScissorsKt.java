package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Scissors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scissors", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getScissors", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scissors", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScissorsKt {
    private static ImageVector _scissors;

    public static final ImageVector getScissors(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(40.2f, 95.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 39.6f, 0.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 40.2f, 95.8f);
        pathBuilder.close();
        pathBuilder.moveTo(40.2f, 160.2f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 39.6f, 0.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 40.2f, 160.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(157.73f, 113.13f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 159.82f, 102.0f);
        pathBuilder2.lineTo(227.48f, 55.7f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.0f, 13.21f);
        pathBuilder2.lineToRelative(-67.67f, 46.3f);
        pathBuilder2.arcToRelative(7.92f, 7.92f, 0.0f, false, true, -4.51f, 1.4f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 157.73f, 113.13f);
        pathBuilder2.close();
        pathBuilder2.moveTo(238.6f, 198.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.12f, 2.08f);
        pathBuilder2.lineTo(136.0f, 137.7f);
        pathBuilder2.lineTo(93.49f, 166.78f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, true, -9.0f, -13.19f);
        pathBuilder2.lineTo(121.83f, 128.0f);
        pathBuilder2.lineTo(84.44f, 102.41f);
        pathBuilder2.arcToRelative(35.86f, 35.86f, 0.0f, true, true, 9.0f, -13.19f);
        pathBuilder2.lineToRelative(143.0f, 97.87f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 238.6f, 198.22f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 180.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -5.86f, 14.14f);
        pathBuilder2.arcTo(19.85f, 19.85f, 0.0f, false, false, 80.0f, 180.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(74.14f, 90.13f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -28.28f, 0.0f);
        pathBuilder2.arcTo(19.85f, 19.85f, 0.0f, false, false, 74.14f, 90.13f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scissors = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
