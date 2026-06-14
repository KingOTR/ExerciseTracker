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

/* compiled from: Feather.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Feather", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFeather", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_feather", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FeatherKt {
    private static ImageVector _feather;

    public static final ImageVector getFeather(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _feather;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Feather", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 80.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 133.59f, 37.56f);
        pathBuilder.lineTo(63.52f, 106.83f);
        pathBuilder.arcTo(11.9f, 11.9f, 0.0f, false, false, 60.0f, 115.31f);
        pathBuilder.verticalLineToRelative(75.0f);
        pathBuilder.lineTo(29.17f, 221.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineTo(65.66f, 196.0f);
        pathBuilder.horizontalLineToRelative(75.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(218.0f, 122.83f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.4f, -0.4f);
        pathBuilder.arcTo(59.63f, 59.63f, 0.0f, false, false, 236.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(139.23f, 43.23f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 213.5f, 116.0f);
        pathBuilder.lineTo(145.66f, 116.0f);
        pathBuilder.lineToRelative(41.17f, -41.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(116.0f, 134.34f);
        pathBuilder.lineTo(116.0f, 66.19f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 115.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.16f, -2.81f);
        pathBuilder.lineTo(108.0f, 74.1f);
        pathBuilder.verticalLineToRelative(68.24f);
        pathBuilder.lineToRelative(-40.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.51f, 186.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f);
        pathBuilder.horizontalLineToRelative(-67.0f);
        pathBuilder.lineToRelative(64.0f, -64.0f);
        pathBuilder.horizontalLineToRelative(68.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _feather = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
