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

/* compiled from: Starandcrescent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarAndCrescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStarAndCrescent", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starAndCrescent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarandcrescentKt {
    private static ImageVector _starAndCrescent;

    public static final ImageVector getStarAndCrescent(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _starAndCrescent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StarAndCrescent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 206.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.36f, 7.13f);
        pathBuilder.arcTo(94.93f, 94.93f, 0.0f, false, true, 112.0f, 224.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -192.0f);
        pathBuilder.arcToRelative(94.93f, 94.93f, 0.0f, false, true, 43.64f, 10.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 14.25f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, 142.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 206.4f);
        pathBuilder.close();
        pathBuilder.moveTo(251.17f, 120.65f);
        pathBuilder.lineTo(224.67f, 109.22f);
        pathBuilder.lineTo(222.36f, 79.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.14f, -4.47f);
        pathBuilder.lineTo(189.63f, 97.42f);
        pathBuilder.lineToRelative(-27.71f, -6.85f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.81f, 11.82f);
        pathBuilder.lineTo(168.18f, 128.0f);
        pathBuilder.lineToRelative(-15.07f, 25.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.81f, 11.82f);
        pathBuilder.lineToRelative(27.71f, -6.85f);
        pathBuilder.lineToRelative(18.59f, 22.51f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.14f, -4.47f);
        pathBuilder.lineToRelative(2.31f, -29.84f);
        pathBuilder.lineToRelative(26.5f, -11.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -14.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starAndCrescent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
