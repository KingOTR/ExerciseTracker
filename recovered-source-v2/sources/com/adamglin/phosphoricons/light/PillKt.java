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

/* compiled from: Pill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPill", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PillKt {
    private static ImageVector _pill;

    public static final ImageVector getPill(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pill", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(215.0f, 41.0f);
        pathBuilder.arcToRelative(51.28f, 51.28f, 0.0f, false, false, -72.5f, 0.0f);
        pathBuilder.lineTo(41.0f, 142.5f);
        pathBuilder.arcTo(51.26f, 51.26f, 0.0f, false, false, 113.49f, 215.0f);
        pathBuilder.lineTo(215.0f, 113.5f);
        pathBuilder.arcTo(51.31f, 51.31f, 0.0f, false, false, 215.0f, 41.0f);
        pathBuilder.close();
        pathBuilder.moveTo(105.0f, 206.5f);
        pathBuilder.arcTo(39.26f, 39.26f, 0.0f, false, true, 49.48f, 151.0f);
        pathBuilder.lineTo(96.0f, 104.49f);
        pathBuilder.lineTo(151.52f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.52f, 105.0f);
        pathBuilder.lineTo(160.0f, 151.51f);
        pathBuilder.lineTo(104.48f, 96.0f);
        pathBuilder.lineTo(151.0f, 49.5f);
        pathBuilder.arcTo(39.26f, 39.26f, 0.0f, false, true, 206.52f, 105.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.26f, 83.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.48f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.49f, -8.48f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 188.26f, 83.76f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
