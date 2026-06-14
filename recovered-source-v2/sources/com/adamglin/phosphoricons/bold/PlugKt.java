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

/* compiled from: Plug.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Plug", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPlug", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_plug", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlugKt {
    private static ImageVector _plug;

    public static final ImageVector getPlug(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(240.49f, 63.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(192.0f, 95.0f);
        pathBuilder.lineTo(161.0f, 64.0f);
        pathBuilder.lineToRelative(31.52f, -31.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineTo(144.0f, 47.0f);
        pathBuilder.lineTo(120.49f, 23.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, 17.0f);
        pathBuilder.lineTo(107.0f, 44.0f);
        pathBuilder.lineTo(56.89f, 94.14f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, 62.23f);
        pathBuilder.lineToRelative(12.88f, 12.88f);
        pathBuilder.lineTo(23.51f, 215.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(46.26f, -46.26f);
        pathBuilder.lineToRelative(12.88f, 12.88f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 62.23f, 0.0f);
        pathBuilder.lineTo(212.0f, 149.0f);
        pathBuilder.lineToRelative(3.51f, 3.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, -17.0f);
        pathBuilder.lineTo(209.0f, 112.0f);
        pathBuilder.lineToRelative(31.52f, -31.51f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 240.49f, 63.51f);
        pathBuilder.close();
        pathBuilder.moveTo(144.89f, 182.14f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.29f, 0.0f);
        pathBuilder.lineTo(73.86f, 139.4f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.29f);
        pathBuilder.lineTo(124.0f, 61.0f);
        pathBuilder.lineToRelative(71.0f, 71.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _plug = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
