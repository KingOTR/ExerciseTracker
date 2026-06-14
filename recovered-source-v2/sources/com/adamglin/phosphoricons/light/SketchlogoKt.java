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

/* compiled from: Sketchlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SketchLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSketchLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sketchLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SketchlogoKt {
    private static ImageVector _sketchLogo;

    public static final ImageVector getSketchLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _sketchLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SketchLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(244.52f, 100.05f);
        pathBuilder.lineToRelative(-56.0f, -64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 184.0f, 34.0f);
        pathBuilder.lineTo(72.0f, 34.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.52f, 2.0f);
        pathBuilder.lineToRelative(-56.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.13f, 8.0f);
        pathBuilder.lineToRelative(112.0f, 120.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.78f, 0.0f);
        pathBuilder.lineToRelative(112.0f, -120.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 244.52f, 100.05f);
        pathBuilder.close();
        pathBuilder.moveTo(75.94f, 110.0f);
        pathBuilder.lineToRelative(34.6f, 86.49f);
        pathBuilder.lineTo(29.81f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(167.14f, 110.0f);
        pathBuilder.lineTo(128.0f, 207.84f);
        pathBuilder.lineTo(88.86f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 98.0f);
        pathBuilder.lineToRelative(36.0f, -48.0f);
        pathBuilder.lineToRelative(36.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.06f, 110.0f);
        pathBuilder.horizontalLineToRelative(46.13f);
        pathBuilder.lineToRelative(-80.73f, 86.49f);
        pathBuilder.close();
        pathBuilder.moveTo(226.78f, 98.0f);
        pathBuilder.lineTo(179.0f, 98.0f);
        pathBuilder.lineTo(140.0f, 46.0f);
        pathBuilder.horizontalLineToRelative(41.28f);
        pathBuilder.close();
        pathBuilder.moveTo(74.72f, 46.0f);
        pathBuilder.lineTo(116.0f, 46.0f);
        pathBuilder.lineTo(77.0f, 98.0f);
        pathBuilder.lineTo(29.22f, 98.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sketchLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
