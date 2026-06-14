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

/* compiled from: Tipi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tipi", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTipi", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tipi", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TipiKt {
    private static ImageVector _tipi;

    public static final ImageVector getTipi(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _tipi;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tipi", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.37f, 213.84f);
        pathBuilder.lineTo(132.75f, 53.5f);
        pathBuilder.lineToRelative(22.62f, -35.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.74f, -4.32f);
        pathBuilder.lineTo(128.0f, 46.08f);
        pathBuilder.lineTo(107.37f, 13.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.74f, 4.32f);
        pathBuilder.lineTo(123.25f, 53.5f);
        pathBuilder.lineTo(20.63f, 213.84f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 24.0f, 220.0f);
        pathBuilder.lineTo(232.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.37f, -6.16f);
        pathBuilder.close();
        pathBuilder.moveTo(79.0f, 212.0f);
        pathBuilder.lineToRelative(49.0f, -76.58f);
        pathBuilder.lineTo(177.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(186.52f, 212.0f);
        pathBuilder.lineTo(131.38f, 125.84f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.74f, 0.0f);
        pathBuilder.lineTo(69.49f, 212.0f);
        pathBuilder.lineTo(31.31f, 212.0f);
        pathBuilder.lineTo(128.0f, 60.92f);
        pathBuilder.lineTo(224.69f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tipi = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
