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

/* compiled from: Pentagon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pentagon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPentagon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pentagon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PentagonKt {
    private static ImageVector _pentagon;

    public static final ImageVector getPentagon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pentagon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pentagon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.35f, 89.15f);
        pathBuilder.lineTo(136.41f, 20.82f);
        pathBuilder.lineToRelative(-0.13f, -0.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -16.56f, 0.0f);
        pathBuilder.lineToRelative(-0.13f, 0.1f);
        pathBuilder.lineTo(31.65f, 89.15f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -5.0f, 15.45f);
        pathBuilder.lineToRelative(32.0f, 107.56f);
        pathBuilder.curveToRelative(0.0f, 0.05f, 0.0f, 0.09f, 0.0f, 0.13f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 72.0f, 222.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.33f, -9.71f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.13f);
        pathBuilder.lineToRelative(32.0f, -107.56f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 224.35f, 89.15f);
        pathBuilder.close();
        pathBuilder.moveTo(217.9f, 101.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.12f);
        pathBuilder.lineToRelative(-32.0f, 107.54f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 184.0f, 210.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.89f, -1.34f);
        pathBuilder.lineToRelative(-32.0f, -107.54f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.12f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.72f, -2.23f);
        pathBuilder.lineToRelative(0.13f, -0.1f);
        pathBuilder.lineToRelative(87.91f, -68.3f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.28f, 0.0f);
        pathBuilder.lineToRelative(87.91f, 68.3f);
        pathBuilder.lineToRelative(0.13f, 0.1f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 217.9f, 101.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pentagon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
