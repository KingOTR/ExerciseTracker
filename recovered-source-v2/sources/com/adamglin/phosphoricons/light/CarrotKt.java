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

/* compiled from: Carrot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Carrot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCarrot", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carrot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarrotKt {
    private static ImageVector _carrot;

    public static final ImageVector getCarrot(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _carrot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Carrot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 66.0f);
        pathBuilder.lineTo(198.48f, 66.0f);
        pathBuilder.lineToRelative(29.76f, -29.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, -8.48f);
        pathBuilder.lineTo(190.0f, 57.52f);
        pathBuilder.lineTo(190.0f, 24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(178.0f, 60.15f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, -77.8f, 8.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(60.17f, 107.4f, 30.05f, 201.45f, 27.38f, 210.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 18.67f, 18.67f);
        pathBuilder.curveToRelative(8.5f, -2.67f, 102.62f, -32.81f, 141.79f, -72.77f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, false, false, 8.0f, -77.84f);
        pathBuilder.lineTo(232.0f, 78.06f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(179.31f, 147.41f);
        pathBuilder.curveTo(170.0f, 157.0f, 157.0f, 166.0f, 142.69f, 174.24f);
        pathBuilder.lineToRelative(-26.46f, -26.47f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, 8.49f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.curveToRelative(-41.69f, 22.0f, -89.0f, 36.82f, -89.73f, 37.0f);
        pathBuilder.arcToRelative(6.57f, 6.57f, 0.0f, false, false, -1.06f, 0.44f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.7f, -2.7f);
        pathBuilder.arcTo(6.57f, 6.57f, 0.0f, false, false, 38.7f, 214.0f);
        pathBuilder.curveTo(39.0f, 213.0f, 67.55f, 121.72f, 104.48f, 81.0f);
        pathBuilder.lineToRelative(35.27f, 35.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f);
        pathBuilder.lineToRelative(-35.1f, -35.1f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, false, true, 66.18f, 74.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carrot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
