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

/* compiled from: Onigiri.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Onigiri", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getOnigiri", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_onigiri", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnigiriKt {
    private static ImageVector _onigiri;

    public static final ImageVector getOnigiri(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _onigiri;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Onigiri", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.53f, 146.57f);
        pathBuilder.lineTo(175.68f, 50.66f);
        pathBuilder.lineToRelative(-0.11f, -0.19f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -95.14f, 0.0f);
        pathBuilder.lineToRelative(-0.11f, 0.19f);
        pathBuilder.lineTo(24.47f, 146.57f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 72.09f, 232.0f);
        pathBuilder.lineTo(183.91f, 232.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 47.62f, -85.43f);
        pathBuilder.close();
        pathBuilder.moveTo(218.85f, 195.45f);
        pathBuilder.arcTo(39.49f, 39.49f, 0.0f, false, true, 183.91f, 216.0f);
        pathBuilder.lineTo(176.0f, 216.0f);
        pathBuilder.lineTo(176.0f, 168.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(96.0f, 152.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(72.09f, 216.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -34.0f, -61.09f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.11f, -0.2f);
        pathBuilder.lineToRelative(55.85f, -95.9f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 67.84f, 0.0f);
        pathBuilder.lineToRelative(55.85f, 95.9f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.11f, 0.2f);
        pathBuilder.arcTo(39.5f, 39.5f, 0.0f, false, true, 218.85f, 195.45f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _onigiri = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
