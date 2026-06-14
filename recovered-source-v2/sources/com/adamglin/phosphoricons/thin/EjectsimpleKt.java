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

/* compiled from: Ejectsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EjectSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEjectSimple", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ejectSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EjectsimpleKt {
    private static ImageVector _ejectSimple;

    public static final ImageVector getEjectSimple(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(228.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(32.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(224.0f, 196.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(29.2f, 149.12f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 1.51f, -12.83f);
        pathBuilder.lineTo(112.37f, 35.46f);
        pathBuilder.arcToRelative(20.1f, 20.1f, 0.0f, false, true, 31.26f, 0.0f);
        pathBuilder.lineToRelative(81.66f, 100.83f);
        pathBuilder.arcTo(12.1f, 12.1f, 0.0f, false, true, 215.92f, 156.0f);
        pathBuilder.lineTo(40.08f, 156.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 29.2f, 149.12f);
        pathBuilder.close();
        pathBuilder.moveTo(36.42f, 145.68f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.08f, 148.0f);
        pathBuilder.lineTo(215.92f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.66f, -2.32f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.51f, -4.36f);
        pathBuilder.lineTo(137.41f, 40.5f);
        pathBuilder.arcToRelative(12.09f, 12.09f, 0.0f, false, false, -18.82f, 0.0f);
        pathBuilder.lineTo(36.93f, 141.32f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 36.42f, 145.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ejectSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
