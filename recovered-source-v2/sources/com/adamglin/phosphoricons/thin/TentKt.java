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

/* compiled from: Tent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tent", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTent", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tent", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TentKt {
    private static ImageVector _tent;

    public static final ImageVector getTent(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _tent;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tent", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(251.66f, 190.38f);
        pathBuilder.lineToRelative(-64.0f, -144.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 184.0f, 44.0f);
        pathBuilder.lineTo(72.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.63f, 2.35f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.lineToRelative(0.0f, 0.06f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-64.0f, 143.93f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 196.0f);
        pathBuilder.lineTo(248.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -5.62f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 66.85f);
        pathBuilder.lineTo(68.0f, 188.0f);
        pathBuilder.lineTo(14.16f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 188.0f);
        pathBuilder.lineTo(76.0f, 66.85f);
        pathBuilder.lineTo(129.84f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.6f, 188.0f);
        pathBuilder.lineTo(78.16f, 52.0f);
        pathBuilder.lineTo(181.4f, 52.0f);
        pathBuilder.lineToRelative(60.44f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tent = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
