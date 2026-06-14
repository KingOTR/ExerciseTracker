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

/* compiled from: Champagne.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Champagne", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getChampagne", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_champagne", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChampagneKt {
    private static ImageVector _champagne;

    public static final ImageVector getChampagne(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _champagne;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Champagne", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(149.91f, 13.53f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 142.3f, 8.0f);
        pathBuilder.lineTo(97.71f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.61f, 5.53f);
        pathBuilder.arcToRelative(451.0f, 451.0f, 0.0f, false, false, -14.21f, 59.7f);
        pathBuilder.curveToRelative(-7.26f, 44.25f, -4.35f, 75.76f, 8.65f, 93.66f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 112.0f, 183.42f);
        pathBuilder.lineTo(112.0f, 232.0f);
        pathBuilder.lineTo(96.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(128.0f, 232.0f);
        pathBuilder.lineTo(128.0f, 183.42f);
        pathBuilder.arcToRelative(39.94f, 39.94f, 0.0f, false, false, 27.46f, -16.53f);
        pathBuilder.curveToRelative(13.0f, -17.9f, 15.92f, -49.41f, 8.66f, -93.66f);
        pathBuilder.arcTo(451.0f, 451.0f, 0.0f, false, false, 149.91f, 13.53f);
        pathBuilder.close();
        pathBuilder.moveTo(93.8f, 64.0f);
        pathBuilder.curveToRelative(3.0f, -15.58f, 6.73f, -29.81f, 9.79f, -40.0f);
        pathBuilder.horizontalLineToRelative(32.83f);
        pathBuilder.curveToRelative(3.06f, 10.19f, 6.77f, 24.42f, 9.8f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 100.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _champagne = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
