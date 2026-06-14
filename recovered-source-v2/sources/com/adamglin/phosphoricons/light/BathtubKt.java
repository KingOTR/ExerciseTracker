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

/* compiled from: Bathtub.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bathtub", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBathtub", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bathtub", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BathtubKt {
    private static ImageVector _bathtub;

    public static final ImageVector getBathtub(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bathtub;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bathtub", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 98.0f);
        pathBuilder.lineTo(206.0f, 98.0f);
        pathBuilder.lineTo(206.0f, 96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.lineTo(136.0f, 90.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(62.0f, 98.0f);
        pathBuilder.lineTo(62.0f, 52.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 76.0f, 38.0f);
        pathBuilder.arcTo(14.47f, 14.47f, 0.0f, false, true, 90.12f, 49.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.76f, -2.38f);
        pathBuilder.arcTo(26.32f, 26.32f, 0.0f, false, false, 76.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 50.0f, 52.0f);
        pathBuilder.lineTo(50.0f, 98.0f);
        pathBuilder.lineTo(16.0f, 98.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, 54.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(78.0f, 198.0f);
        pathBuilder.lineTo(178.0f, 198.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(190.0f, 198.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.arcToRelative(54.06f, 54.06f, 0.0f, false, false, 54.0f, -54.0f);
        pathBuilder.lineTo(246.0f, 104.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(142.0f, 102.0f);
        pathBuilder.horizontalLineToRelative(52.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(142.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 144.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f);
        pathBuilder.lineTo(64.0f, 186.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, -42.0f);
        pathBuilder.lineTo(22.0f, 110.0f);
        pathBuilder.lineTo(130.0f, 110.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(206.0f, 110.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bathtub = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
