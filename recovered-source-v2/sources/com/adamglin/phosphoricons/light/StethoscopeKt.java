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

/* compiled from: Stethoscope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Stethoscope", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStethoscope", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_stethoscope", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StethoscopeKt {
    private static ImageVector _stethoscope;

    public static final ImageVector getStethoscope(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _stethoscope;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Stethoscope", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.0f, 160.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 218.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.65f, 197.58f);
        pathBuilder.arcTo(46.05f, 46.05f, 0.0f, false, true, 168.0f, 238.0f);
        pathBuilder.lineTo(144.0f, 238.0f);
        pathBuilder.arcToRelative(46.06f, 46.06f, 0.0f, false, true, -46.0f, -46.0f);
        pathBuilder.lineTo(98.0f, 149.71f);
        pathBuilder.arcTo(62.0f, 62.0f, 0.0f, false, true, 42.0f, 88.0f);
        pathBuilder.lineTo(42.0f, 40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(72.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(54.0f, 46.0f);
        pathBuilder.lineTo(54.0f, 88.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, false, 50.0f, 50.0f);
        pathBuilder.horizontalLineToRelative(0.67f);
        pathBuilder.curveToRelative(27.2f, -0.36f, 49.33f, -23.16f, 49.33f, -50.83f);
        pathBuilder.lineTo(154.0f, 46.0f);
        pathBuilder.lineTo(136.0f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f);
        pathBuilder.lineTo(166.0f, 87.17f);
        pathBuilder.curveToRelative(0.0f, 32.43f, -24.68f, 59.44f, -56.0f, 62.52f);
        pathBuilder.lineTo(110.0f, 192.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 34.0f, 34.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(34.05f, 34.05f, 0.0f, false, false, 33.56f, -28.56f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, true, true, 12.09f, 0.14f);
        pathBuilder.close();
        pathBuilder.moveTo(234.0f, 160.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 26.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 234.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _stethoscope = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
