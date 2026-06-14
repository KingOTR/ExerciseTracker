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

/* compiled from: Basketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBasketball", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketballKt {
    private static ImageVector _basketball;

    public static final ImageVector getBasketball(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _basketball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Basketball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 72.17f);
        pathBuilder.arcTo(87.2f, 87.2f, 0.0f, false, true, 79.63f, 120.0f);
        pathBuilder.lineTo(40.37f, 120.0f);
        pathBuilder.arcTo(87.54f, 87.54f, 0.0f, false, true, 60.0f, 72.17f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 120.0f);
        pathBuilder.lineTo(136.0f, 40.37f);
        pathBuilder.arcToRelative(87.59f, 87.59f, 0.0f, false, true, 48.68f, 20.37f);
        pathBuilder.arcTo(103.06f, 103.06f, 0.0f, false, false, 160.3f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 120.0f);
        pathBuilder.lineTo(95.7f, 120.0f);
        pathBuilder.arcTo(103.06f, 103.06f, 0.0f, false, false, 71.32f, 60.74f);
        pathBuilder.arcTo(87.59f, 87.59f, 0.0f, false, true, 120.0f, 40.37f);
        pathBuilder.close();
        pathBuilder.moveTo(79.63f, 136.0f);
        pathBuilder.arcTo(87.2f, 87.2f, 0.0f, false, true, 60.0f, 183.83f);
        pathBuilder.arcTo(87.54f, 87.54f, 0.0f, false, true, 40.37f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(95.7f, 136.0f);
        pathBuilder.lineTo(120.0f, 136.0f);
        pathBuilder.verticalLineToRelative(79.63f);
        pathBuilder.arcToRelative(87.59f, 87.59f, 0.0f, false, true, -48.68f, -20.37f);
        pathBuilder.arcTo(103.09f, 103.09f, 0.0f, false, false, 95.7f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(24.3f);
        pathBuilder.arcToRelative(103.09f, 103.09f, 0.0f, false, false, 24.38f, 59.26f);
        pathBuilder.arcTo(87.59f, 87.59f, 0.0f, false, true, 136.0f, 215.63f);
        pathBuilder.close();
        pathBuilder.moveTo(176.37f, 136.0f);
        pathBuilder.horizontalLineToRelative(39.26f);
        pathBuilder.arcTo(87.54f, 87.54f, 0.0f, false, true, 196.0f, 183.83f);
        pathBuilder.arcTo(87.2f, 87.2f, 0.0f, false, true, 176.37f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.37f, 120.0f);
        pathBuilder.arcTo(87.2f, 87.2f, 0.0f, false, true, 196.0f, 72.17f);
        pathBuilder.arcTo(87.54f, 87.54f, 0.0f, false, true, 215.63f, 120.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
