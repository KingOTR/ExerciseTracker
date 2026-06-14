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

/* compiled from: Plug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPlug", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlugKt {
    private static ImageVector _plug;

    public static final ImageVector getPlug(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _plug;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Plug", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(234.83f, 69.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f);
        pathBuilder.lineTo(192.0f, 106.34f);
        pathBuilder.lineTo(149.66f, 64.0f);
        pathBuilder.lineToRelative(37.17f, -37.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(144.0f, 58.34f);
        pathBuilder.lineTo(114.83f, 29.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.lineTo(118.34f, 44.0f);
        pathBuilder.lineTo(62.54f, 99.8f);
        pathBuilder.arcToRelative(36.05f, 36.05f, 0.0f, false, false, 0.0f, 50.91f);
        pathBuilder.lineToRelative(18.55f, 18.54f);
        pathBuilder.lineTo(29.17f, 221.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f);
        pathBuilder.lineToRelative(51.92f, -51.92f);
        pathBuilder.lineToRelative(18.54f, 18.55f);
        pathBuilder.arcToRelative(36.06f, 36.06f, 0.0f, false, false, 50.91f, 0.0f);
        pathBuilder.lineToRelative(55.8f, -55.8f);
        pathBuilder.lineToRelative(9.17f, 9.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.lineTo(197.66f, 112.0f);
        pathBuilder.lineToRelative(37.17f, -37.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 69.17f);
        pathBuilder.close();
        pathBuilder.moveTo(150.54f, 187.8f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -39.59f, 0.0f);
        pathBuilder.lineTo(68.2f, 145.05f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, -39.59f);
        pathBuilder.lineTo(124.0f, 49.66f);
        pathBuilder.lineTo(206.34f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
