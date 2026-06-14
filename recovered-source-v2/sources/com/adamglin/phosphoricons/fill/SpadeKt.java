package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Spade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSpade", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpadeKt {
    private static ImageVector _spade;

    public static final ImageVector getSpade(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _spade;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Spade", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 136.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, true, -83.4f, 48.82f);
        pathBuilder.lineToRelative(11.06f, 36.88f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 232.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.66f, -10.3f);
        pathBuilder.lineToRelative(11.06f, -36.88f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, true, 24.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -32.0f, 17.65f, -62.84f, 51.0f, -89.27f);
        pathBuilder.arcToRelative(234.14f, 234.14f, 0.0f, false, true, 49.89f, -30.11f);
        pathBuilder.arcToRelative(7.93f, 7.93f, 0.0f, false, true, 6.16f, 0.0f);
        pathBuilder.arcTo(234.14f, 234.14f, 0.0f, false, true, 181.0f, 46.73f);
        pathBuilder.curveTo(214.35f, 73.16f, 232.0f, 104.0f, 232.0f, 136.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
