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

/* compiled from: Sunhorizon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SunHorizon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSunHorizon", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunHorizon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunhorizonKt {
    private static ImageVector _sunHorizon;

    public static final ImageVector getSunHorizon(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _sunHorizon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SunHorizon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 154.0f);
        pathBuilder.lineTo(197.28f, 154.0f);
        pathBuilder.arcToRelative(70.91f, 70.91f, 0.0f, false, false, 0.72f, -10.0f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, false, false, -140.0f, 0.0f);
        pathBuilder.arcToRelative(70.91f, 70.91f, 0.0f, false, false, 0.72f, 10.0f);
        pathBuilder.lineTo(16.0f, 154.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(240.0f, 166.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 144.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, true, true, 115.13f, 10.0f);
        pathBuilder.lineTo(70.87f, 154.0f);
        pathBuilder.arcTo(58.63f, 58.63f, 0.0f, false, true, 70.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 200.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(48.0f, 206.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(208.0f, 194.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(74.63f, 42.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, -5.37f);
        pathBuilder.lineToRelative(8.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.74f, 5.36f);
        pathBuilder.close();
        pathBuilder.moveTo(18.63f, 93.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.05f, -2.69f);
        pathBuilder.lineToRelative(16.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, 10.74f);
        pathBuilder.lineToRelative(-16.0f, -8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 18.63f, 93.32f);
        pathBuilder.close();
        pathBuilder.moveTo(210.63f, 106.68f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.69f, -8.05f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 5.36f, 10.74f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.05f, -2.69f);
        pathBuilder.close();
        pathBuilder.moveTo(162.63f, 53.32f);
        pathBuilder.lineTo(170.63f, 37.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.37f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunHorizon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
