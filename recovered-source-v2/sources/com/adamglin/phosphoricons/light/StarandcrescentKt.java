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

/* compiled from: Starandcrescent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StarAndCrescent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStarAndCrescent", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_starAndCrescent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StarandcrescentKt {
    private static ImageVector _starAndCrescent;

    public static final ImageVector getStarAndCrescent(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(154.73f, 201.06f);
        pathBuilder.arcToRelative(82.0f, 82.0f, 0.0f, false, true, 0.0f, -146.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.69f);
        pathBuilder.arcTo(93.0f, 93.0f, 0.0f, false, false, 112.0f, 34.0f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, false, 0.0f, 188.0f);
        pathBuilder.arcToRelative(93.0f, 93.0f, 0.0f, false, false, 42.73f, -10.25f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.69f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 210.0f);
        pathBuilder.arcTo(82.0f, 82.0f, 0.0f, true, true, 138.81f, 50.47f);
        pathBuilder.arcToRelative(94.0f, 94.0f, 0.0f, false, false, 0.0f, 155.06f);
        pathBuilder.arcTo(81.4f, 81.4f, 0.0f, false, true, 112.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(250.38f, 122.49f);
        pathBuilder.lineTo(222.77f, 110.58f);
        pathBuilder.lineTo(220.37f, 79.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.61f, -3.36f);
        pathBuilder.lineTo(190.37f, 99.67f);
        pathBuilder.lineToRelative(-28.93f, -7.16f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.61f, 8.87f);
        pathBuilder.lineTo(170.5f, 128.0f);
        pathBuilder.lineToRelative(-15.67f, 26.62f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.61f, 8.87f);
        pathBuilder.lineToRelative(28.93f, -7.16f);
        pathBuilder.lineToRelative(19.39f, 23.49f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.61f, -3.36f);
        pathBuilder.lineToRelative(2.4f, -31.0f);
        pathBuilder.lineToRelative(27.61f, -11.91f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.69f, 135.84f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.61f, 5.0f);
        pathBuilder.lineToRelative(-1.53f, 19.83f);
        pathBuilder.lineToRelative(-12.33f, -14.94f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.63f, -2.18f);
        pathBuilder.arcToRelative(5.92f, 5.92f, 0.0f, false, false, -1.44f, 0.18f);
        pathBuilder.lineToRelative(-18.74f, 4.63f);
        pathBuilder.lineTo(182.64f, 131.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -6.08f);
        pathBuilder.lineToRelative(-10.23f, -17.37f);
        pathBuilder.lineToRelative(18.74f, 4.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.07f, -2.0f);
        pathBuilder.lineToRelative(12.33f, -14.94f);
        pathBuilder.lineToRelative(1.53f, 19.83f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.61f, 5.0f);
        pathBuilder.lineTo(232.86f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _starAndCrescent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
