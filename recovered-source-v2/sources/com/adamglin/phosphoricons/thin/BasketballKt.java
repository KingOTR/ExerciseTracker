package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Basketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBasketball", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketballKt {
    private static ImageVector _basketball;

    public static final ImageVector getBasketball(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 66.07f);
        pathBuilder.arcTo(91.22f, 91.22f, 0.0f, false, true, 83.9f, 124.0f);
        pathBuilder.lineTo(36.09f, 124.0f);
        pathBuilder.arcTo(91.7f, 91.7f, 0.0f, false, true, 60.0f, 66.07f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 124.0f);
        pathBuilder.lineTo(132.0f, 36.09f);
        pathBuilder.arcToRelative(91.63f, 91.63f, 0.0f, false, true, 58.32f, 24.3f);
        pathBuilder.arcTo(99.24f, 99.24f, 0.0f, false, false, 164.09f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 124.0f);
        pathBuilder.lineTo(91.91f, 124.0f);
        pathBuilder.arcTo(99.24f, 99.24f, 0.0f, false, false, 65.68f, 60.39f);
        pathBuilder.arcTo(91.63f, 91.63f, 0.0f, false, true, 124.0f, 36.09f);
        pathBuilder.close();
        pathBuilder.moveTo(83.9f, 132.0f);
        pathBuilder.arcTo(91.22f, 91.22f, 0.0f, false, true, 60.0f, 189.93f);
        pathBuilder.arcTo(91.7f, 91.7f, 0.0f, false, true, 36.09f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(91.9f, 132.0f);
        pathBuilder.lineTo(124.0f, 132.0f);
        pathBuilder.verticalLineToRelative(87.91f);
        pathBuilder.arcToRelative(91.63f, 91.63f, 0.0f, false, true, -58.32f, -24.3f);
        pathBuilder.arcTo(99.24f, 99.24f, 0.0f, false, false, 91.91f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(32.09f);
        pathBuilder.arcToRelative(99.24f, 99.24f, 0.0f, false, false, 26.23f, 63.61f);
        pathBuilder.arcTo(91.63f, 91.63f, 0.0f, false, true, 132.0f, 219.91f);
        pathBuilder.close();
        pathBuilder.moveTo(172.1f, 132.0f);
        pathBuilder.horizontalLineToRelative(47.81f);
        pathBuilder.arcTo(91.7f, 91.7f, 0.0f, false, true, 196.0f, 189.93f);
        pathBuilder.arcTo(91.22f, 91.22f, 0.0f, false, true, 172.1f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.1f, 124.0f);
        pathBuilder.arcTo(91.22f, 91.22f, 0.0f, false, true, 196.0f, 66.07f);
        pathBuilder.arcTo(91.7f, 91.7f, 0.0f, false, true, 219.91f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
