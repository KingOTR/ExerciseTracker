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

/* compiled from: Onigiri.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Onigiri", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getOnigiri", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_onigiri", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnigiriKt {
    private static ImageVector _onigiri;

    public static final ImageVector getOnigiri(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _onigiri;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Onigiri", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.82f, 147.6f);
        pathBuilder.lineTo(174.0f, 51.67f);
        pathBuilder.lineToRelative(-0.09f, -0.15f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, -91.74f, 0.0f);
        pathBuilder.lineToRelative(-0.09f, 0.15f);
        pathBuilder.lineTo(26.18f, 147.6f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, false, 72.09f, 230.0f);
        pathBuilder.lineTo(183.91f, 230.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 45.91f, -82.4f);
        pathBuilder.close();
        pathBuilder.moveTo(162.0f, 218.0f);
        pathBuilder.lineTo(94.0f, 218.0f);
        pathBuilder.lineTo(94.0f, 168.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.61f, 196.42f);
        pathBuilder.arcTo(41.47f, 41.47f, 0.0f, false, true, 183.91f, 218.0f);
        pathBuilder.lineTo(174.0f, 218.0f);
        pathBuilder.lineTo(174.0f, 168.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f);
        pathBuilder.lineTo(96.0f, 154.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.lineTo(72.09f, 218.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -35.67f, -64.15f);
        pathBuilder.lineToRelative(0.08f, -0.14f);
        pathBuilder.lineTo(92.37f, 57.78f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, 71.26f, 0.0f);
        pathBuilder.lineToRelative(55.87f, 95.93f);
        pathBuilder.lineToRelative(0.08f, 0.14f);
        pathBuilder.arcTo(41.48f, 41.48f, 0.0f, false, true, 220.6f, 196.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _onigiri = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
