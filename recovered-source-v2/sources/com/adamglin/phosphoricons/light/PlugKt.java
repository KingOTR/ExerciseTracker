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

/* compiled from: Plug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPlug", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlugKt {
    private static ImageVector _plug;

    public static final ImageVector getPlug(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(236.24f, 67.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f);
        pathBuilder.lineTo(192.0f, 103.51f);
        pathBuilder.lineTo(152.49f, 64.0f);
        pathBuilder.lineToRelative(35.75f, -35.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, -8.48f);
        pathBuilder.lineTo(144.0f, 55.51f);
        pathBuilder.lineTo(116.24f, 27.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, 8.48f);
        pathBuilder.lineTo(115.51f, 44.0f);
        pathBuilder.lineTo(61.13f, 98.38f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 0.0f, 53.75f);
        pathBuilder.lineToRelative(17.13f, 17.12f);
        pathBuilder.lineToRelative(-50.5f, 50.51f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f);
        pathBuilder.lineToRelative(50.51f, -50.5f);
        pathBuilder.lineToRelative(17.13f, 17.13f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 53.74f, 0.0f);
        pathBuilder.lineTo(212.0f, 140.49f);
        pathBuilder.lineToRelative(7.76f, 7.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f);
        pathBuilder.lineTo(200.49f, 112.0f);
        pathBuilder.lineToRelative(35.75f, -35.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 236.24f, 67.76f);
        pathBuilder.close();
        pathBuilder.moveTo(149.13f, 186.38f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -36.77f, 0.0f);
        pathBuilder.lineTo(69.62f, 143.64f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, -36.77f);
        pathBuilder.lineTo(124.0f, 52.49f);
        pathBuilder.lineTo(203.51f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
