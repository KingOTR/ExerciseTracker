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

/* compiled from: Brandy.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Brandy", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBrandy", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_brandy", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BrandyKt {
    private static ImageVector _brandy;

    public static final ImageVector getBrandy(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _brandy;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Brandy", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(99.63f, 99.63f, 0.0f, false, false, -16.18f, -54.55f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, -5.45f);
        pathBuilder.lineTo(54.23f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.45f);
        pathBuilder.arcTo(99.63f, 99.63f, 0.0f, false, false, 28.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(100.15f, 100.15f, 0.0f, false, false, 88.0f, 99.28f);
        pathBuilder.lineTo(116.0f, 212.0f);
        pathBuilder.lineTo(88.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(140.0f, 212.0f);
        pathBuilder.lineTo(140.0f, 187.28f);
        pathBuilder.arcTo(100.15f, 100.15f, 0.0f, false, false, 228.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(61.05f, 52.0f);
        pathBuilder.lineTo(195.0f, 52.0f);
        pathBuilder.arcToRelative(75.43f, 75.43f, 0.0f, false, true, 8.1f, 24.0f);
        pathBuilder.lineTo(53.0f, 76.0f);
        pathBuilder.arcTo(75.43f, 75.43f, 0.0f, false, true, 61.05f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.05f, 164.0f);
        pathBuilder.arcToRelative(76.12f, 76.12f, 0.0f, false, true, -75.0f, -64.0f);
        pathBuilder.lineTo(203.0f, 100.0f);
        pathBuilder.arcTo(76.12f, 76.12f, 0.0f, false, true, 128.0f, 164.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _brandy = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
