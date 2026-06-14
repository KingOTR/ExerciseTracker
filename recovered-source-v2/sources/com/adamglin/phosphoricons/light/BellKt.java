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

/* compiled from: Bell.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Bell", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBell", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bell", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellKt {
    private static ImageVector _bell;

    public static final ImageVector getBell(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bell;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Bell", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(220.07f, 176.94f);
        pathBuilder.curveTo(214.41f, 167.2f, 206.0f, 139.73f, 206.0f, 104.0f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, true, false, -156.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.74f, -8.42f, 63.2f, -14.08f, 72.94f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 48.0f, 198.0f);
        pathBuilder.lineTo(90.48f, 198.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, 75.0f, 0.0f);
        pathBuilder.lineTo(208.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.06f, -21.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 218.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, -25.29f, -20.0f);
        pathBuilder.horizontalLineToRelative(50.58f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 218.0f);
        pathBuilder.close();
        pathBuilder.moveTo(209.71f, 185.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, 1.0f);
        pathBuilder.lineTo(48.0f, 186.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.7f, -1.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f);
        pathBuilder.curveTo(53.87f, 170.0f, 62.0f, 139.69f, 62.0f, 104.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, true, true, 132.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.68f, 8.14f, 65.95f, 15.71f, 79.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 209.71f, 185.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bell = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
