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

/* compiled from: Flower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFlower", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowerKt {
    private static ImageVector _flower;

    public static final ImageVector getFlower(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _flower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(210.35f, 129.36f);
        pathBuilder.curveToRelative(-0.81f, -0.47f, -1.7f, -0.92f, -2.62f, -1.36f);
        pathBuilder.curveToRelative(0.92f, -0.44f, 1.81f, -0.89f, 2.62f, -1.36f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -69.28f);
        pathBuilder.curveToRelative(-0.81f, 0.47f, -1.65f, 1.0f, -2.48f, 1.59f);
        pathBuilder.curveToRelative(0.08f, -1.0f, 0.13f, -2.0f, 0.13f, -3.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 0.94f, 0.0f, 1.94f, 0.13f, 3.0f);
        pathBuilder.curveToRelative(-0.83f, -0.57f, -1.67f, -1.12f, -2.48f, -1.59f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 69.28f);
        pathBuilder.curveToRelative(0.81f, 0.47f, 1.7f, 0.92f, 2.62f, 1.36f);
        pathBuilder.curveToRelative(-0.92f, 0.44f, -1.81f, 0.89f, -2.62f, 1.36f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 69.28f);
        pathBuilder.curveToRelative(0.81f, -0.47f, 1.65f, -1.0f, 2.48f, -1.59f);
        pathBuilder.curveToRelative(-0.08f, 1.0f, -0.13f, 2.0f, -0.13f, 2.95f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 80.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -0.94f, -0.05f, -1.94f, -0.13f, -2.95f);
        pathBuilder.curveToRelative(0.83f, 0.57f, 1.67f, 1.12f, 2.48f, 1.59f);
        pathBuilder.arcTo(39.79f, 39.79f, 0.0f, false, false, 190.29f, 204.0f);
        pathBuilder.arcToRelative(40.43f, 40.43f, 0.0f, false, false, 10.42f, -1.38f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 9.64f, -73.28f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 156.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
