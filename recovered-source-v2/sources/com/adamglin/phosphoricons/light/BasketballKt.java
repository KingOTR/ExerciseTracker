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

/* compiled from: Basketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBasketball", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketballKt {
    private static ImageVector _basketball;

    public static final ImageVector getBasketball(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 69.09f);
        pathBuilder.arcTo(89.23f, 89.23f, 0.0f, false, true, 81.78f, 122.0f);
        pathBuilder.lineTo(38.2f, 122.0f);
        pathBuilder.arcTo(89.65f, 89.65f, 0.0f, false, true, 60.0f, 69.09f);
        pathBuilder.close();
        pathBuilder.moveTo(38.2f, 134.0f);
        pathBuilder.lineTo(81.78f, 134.0f);
        pathBuilder.arcTo(89.23f, 89.23f, 0.0f, false, true, 60.0f, 186.91f);
        pathBuilder.arcTo(89.65f, 89.65f, 0.0f, false, true, 38.2f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 217.8f);
        pathBuilder.arcToRelative(89.66f, 89.66f, 0.0f, false, true, -53.5f, -22.34f);
        pathBuilder.arcTo(101.18f, 101.18f, 0.0f, false, false, 93.82f, 134.0f);
        pathBuilder.lineTo(122.0f, 134.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 122.0f);
        pathBuilder.lineTo(93.82f, 122.0f);
        pathBuilder.arcTo(101.18f, 101.18f, 0.0f, false, false, 68.5f, 60.54f);
        pathBuilder.arcTo(89.66f, 89.66f, 0.0f, false, true, 122.0f, 38.2f);
        pathBuilder.close();
        pathBuilder.moveTo(217.8f, 122.0f);
        pathBuilder.lineTo(174.22f, 122.0f);
        pathBuilder.arcTo(89.23f, 89.23f, 0.0f, false, true, 196.0f, 69.09f);
        pathBuilder.arcTo(89.65f, 89.65f, 0.0f, false, true, 217.8f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 38.2f);
        pathBuilder.arcToRelative(89.66f, 89.66f, 0.0f, false, true, 53.5f, 22.34f);
        pathBuilder.arcTo(101.18f, 101.18f, 0.0f, false, false, 162.18f, 122.0f);
        pathBuilder.lineTo(134.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 217.8f);
        pathBuilder.lineTo(134.0f, 134.0f);
        pathBuilder.horizontalLineToRelative(28.18f);
        pathBuilder.arcToRelative(101.18f, 101.18f, 0.0f, false, false, 25.32f, 61.46f);
        pathBuilder.arcTo(89.66f, 89.66f, 0.0f, false, true, 134.0f, 217.8f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 186.91f);
        pathBuilder.arcTo(89.23f, 89.23f, 0.0f, false, true, 174.22f, 134.0f);
        pathBuilder.lineTo(217.8f, 134.0f);
        pathBuilder.arcTo(89.65f, 89.65f, 0.0f, false, true, 196.0f, 186.91f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
