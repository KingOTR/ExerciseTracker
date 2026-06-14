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

/* compiled from: Spade.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Spade", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSpade", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_spade", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpadeKt {
    private static ImageVector _spade;

    public static final ImageVector getSpade(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(179.84f, 51.39f);
        pathBuilder.arcToRelative(284.14f, 284.14f, 0.0f, false, false, -49.16f, -32.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f);
        pathBuilder.arcTo(284.14f, 284.14f, 0.0f, false, false, 76.16f, 51.39f);
        pathBuilder.curveTo(42.88f, 79.13f, 26.0f, 107.59f, 26.0f, 136.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 75.24f, 49.65f);
        pathBuilder.lineToRelative(-11.0f, 36.63f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 230.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.75f, -7.72f);
        pathBuilder.lineToRelative(-11.0f, -36.63f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 230.0f, 136.0f);
        pathBuilder.curveTo(230.0f, 107.59f, 213.12f, 79.13f, 179.84f, 51.39f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 178.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -27.6f, -10.34f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.69f, 6.24f);
        pathBuilder.lineTo(151.94f, 218.0f);
        pathBuilder.horizontalLineTo(104.06f);
        pathBuilder.lineToRelative(13.23f, -44.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.69f, -6.24f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 38.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -53.73f, 74.77f, -97.0f, 90.0f, -105.22f);
        pathBuilder.curveTo(143.24f, 39.0f, 218.0f, 82.2f, 218.0f, 136.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 176.0f, 178.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _spade = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
