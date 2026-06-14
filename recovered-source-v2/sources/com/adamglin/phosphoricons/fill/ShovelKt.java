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

/* compiled from: Shovel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Shovel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getShovel", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_shovel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShovelKt {
    private static ImageVector _shovel;

    public static final ImageVector getShovel(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _shovel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Shovel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.66f, 69.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder.lineTo(216.0f, 51.31f);
        pathBuilder.lineToRelative(-71.0f, 71.0f);
        pathBuilder.lineTo(133.66f, 111.0f);
        pathBuilder.lineToRelative(71.0f, -71.0f);
        pathBuilder.lineTo(186.34f, 21.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineToRelative(48.0f, 48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 245.66f, 69.66f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f);
        pathBuilder.lineTo(133.66f, 111.0f);
        pathBuilder.lineTo(99.31f, 76.68f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f);
        pathBuilder.lineToRelative(-56.0f, 56.0f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, false, 16.0f, 144.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(15.86f, 15.86f, 0.0f, false, false, 11.31f, -4.69f);
        pathBuilder.lineToRelative(56.0f, -56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f);
        pathBuilder.lineTo(145.0f, 122.34f);
        pathBuilder.lineTo(93.66f, 173.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 176.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _shovel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
