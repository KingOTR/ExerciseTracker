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

/* compiled from: Avocado.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Avocado", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAvocado", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_avocado", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AvocadoKt {
    private static ImageVector _avocado;

    public static final ImageVector getAvocado(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _avocado;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Avocado", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 108.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, false, 128.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.76f, 129.32f);
        pathBuilder.lineTo(185.0f, 45.17f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 71.42f, 44.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-29.5f, 83.46f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, 172.84f, 1.86f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 228.0f);
        pathBuilder.arcToRelative(68.05f, 68.05f, 0.0f, false, true, -63.59f, -92.15f);
        pathBuilder.curveToRelative(0.0f, -0.09f, 0.07f, -0.18f, 0.1f, -0.26f);
        pathBuilder.lineTo(94.05f, 52.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 68.17f, 0.78f);
        pathBuilder.lineToRelative(0.09f, 0.27f);
        pathBuilder.lineToRelative(29.82f, 84.28f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 128.0f, 228.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _avocado = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
