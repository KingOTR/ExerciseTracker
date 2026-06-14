package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Basketball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Basketball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBasketball", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_basketball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BasketballKt {
    private static ImageVector _basketball;

    public static final ImageVector getBasketball(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 177.28f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 44.87f, 140.0f);
        pathBuilder.lineTo(75.14f, 140.0f);
        pathBuilder.arcTo(83.1f, 83.1f, 0.0f, false, true, 60.0f, 177.28f);
        pathBuilder.close();
        pathBuilder.moveTo(44.87f, 116.0f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 60.0f, 78.72f);
        pathBuilder.arcTo(83.1f, 83.1f, 0.0f, false, true, 75.14f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 211.13f);
        pathBuilder.arcToRelative(83.63f, 83.63f, 0.0f, false, true, -39.0f, -16.46f);
        pathBuilder.arcTo(106.94f, 106.94f, 0.0f, false, false, 99.34f, 140.0f);
        pathBuilder.lineTo(116.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 116.0f);
        pathBuilder.lineTo(99.34f, 116.0f);
        pathBuilder.arcTo(106.94f, 106.94f, 0.0f, false, false, 77.0f, 61.33f);
        pathBuilder.arcToRelative(83.63f, 83.63f, 0.0f, false, true, 39.0f, -16.46f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 78.72f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 211.13f, 116.0f);
        pathBuilder.lineTo(180.86f, 116.0f);
        pathBuilder.arcTo(83.1f, 83.1f, 0.0f, false, true, 196.0f, 78.72f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 211.13f);
        pathBuilder.lineTo(140.0f, 140.0f);
        pathBuilder.horizontalLineToRelative(16.66f);
        pathBuilder.arcTo(106.94f, 106.94f, 0.0f, false, false, 179.0f, 194.67f);
        pathBuilder.arcTo(83.63f, 83.63f, 0.0f, false, true, 140.0f, 211.13f);
        pathBuilder.close();
        pathBuilder.moveTo(156.66f, 116.0f);
        pathBuilder.lineTo(140.0f, 116.0f);
        pathBuilder.lineTo(140.0f, 44.87f);
        pathBuilder.arcToRelative(83.63f, 83.63f, 0.0f, false, true, 39.0f, 16.46f);
        pathBuilder.arcTo(106.94f, 106.94f, 0.0f, false, false, 156.66f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 177.28f);
        pathBuilder.arcTo(83.1f, 83.1f, 0.0f, false, true, 180.86f, 140.0f);
        pathBuilder.horizontalLineToRelative(30.27f);
        pathBuilder.arcTo(83.59f, 83.59f, 0.0f, false, true, 196.0f, 177.28f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _basketball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
