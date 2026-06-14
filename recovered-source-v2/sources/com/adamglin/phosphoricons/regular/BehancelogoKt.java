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

/* compiled from: Behancelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BehanceLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBehanceLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_behanceLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BehancelogoKt {
    private static ImageVector _behanceLogo;

    public static final ImageVector getBehanceLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _behanceLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BehanceLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(160.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(168.0f, 88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 158.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f);
        pathBuilder.lineTo(32.0f, 200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.lineTo(24.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.lineTo(90.0f, 56.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 25.65f, 66.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 136.0f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 116.0f);
        pathBuilder.lineTo(90.0f, 116.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f);
        pathBuilder.lineTo(40.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 158.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -26.0f, -26.0f);
        pathBuilder.lineTo(40.0f, 132.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.lineTo(94.0f, 184.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 120.0f, 158.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(169.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.59f, 11.2f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, 9.61f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, true, true, 248.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(231.0f, 144.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -62.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _behanceLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
