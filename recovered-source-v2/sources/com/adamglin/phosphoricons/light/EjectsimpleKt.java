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

/* compiled from: Ejectsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EjectSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEjectSimple", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ejectSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EjectsimpleKt {
    private static ImageVector _ejectSimple;

    public static final ImageVector getEjectSimple(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _ejectSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EjectSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(230.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(32.0f, 206.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(224.0f, 194.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(27.39f, 150.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 29.16f, 135.0f);
        pathBuilder.lineTo(110.82f, 34.2f);
        pathBuilder.arcToRelative(22.1f, 22.1f, 0.0f, false, true, 34.36f, 0.0f);
        pathBuilder.lineTo(226.84f, 135.0f);
        pathBuilder.arcToRelative(14.09f, 14.09f, 0.0f, false, true, -10.93f, 23.0f);
        pathBuilder.lineTo(40.09f, 158.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 27.39f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(38.22f, 144.84f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 40.09f, 146.0f);
        pathBuilder.lineTo(215.91f, 146.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.87f, -1.18f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.27f, -2.24f);
        pathBuilder.lineTo(135.86f, 41.76f);
        pathBuilder.arcToRelative(10.1f, 10.1f, 0.0f, false, false, -15.72f, 0.0f);
        pathBuilder.lineTo(38.49f, 142.58f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 38.22f, 144.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ejectSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
