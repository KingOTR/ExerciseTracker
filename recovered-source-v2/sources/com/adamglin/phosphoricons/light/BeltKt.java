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

/* compiled from: Belt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Belt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBelt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_belt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BeltKt {
    private static ImageVector _belt;

    public static final ImageVector getBelt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _belt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Belt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 162.0f);
        pathBuilder.lineTo(190.0f, 162.0f);
        pathBuilder.lineTo(190.0f, 94.0f);
        pathBuilder.horizontalLineToRelative(58.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(188.63f, 82.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 176.0f, 74.0f);
        pathBuilder.lineTo(112.0f, 74.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.63f, 8.0f);
        pathBuilder.lineTo(62.0f, 82.0f);
        pathBuilder.lineTo(62.0f, 80.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(8.0f, 82.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 94.0f);
        pathBuilder.lineTo(50.0f, 94.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(8.0f, 162.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(50.0f, 174.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.lineTo(99.37f, 174.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 112.0f, 182.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.63f, -8.0f);
        pathBuilder.lineTo(248.0f, 174.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 94.0f);
        pathBuilder.lineTo(98.0f, 94.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.lineTo(62.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 170.0f);
        pathBuilder.lineTo(112.0f, 170.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(110.0f, 88.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.lineTo(144.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(34.0f);
        pathBuilder.verticalLineToRelative(34.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 176.0f, 170.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _belt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
