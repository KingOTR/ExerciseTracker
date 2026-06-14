package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dropslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DropSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDropSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dropSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DropslashKt {
    private static ImageVector _dropSlash;

    public static final ImageVector getDropSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _dropSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DropSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(69.81f, 69.93f);
        pathBuilder.curveTo(52.7f, 94.85f, 44.0f, 119.75f, 44.0f, 144.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, false, 145.32f, 57.4f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, -76.0f);
        pathBuilder.curveToRelative(0.0f, -22.1f, 7.85f, -44.95f, 23.33f, -68.0f);
        pathBuilder.lineTo(183.92f, 195.46f);
        pathBuilder.arcTo(75.83f, 75.83f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.78f, 47.62f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 92.65f, 42.0f);
        pathBuilder.arcToRelative(244.78f, 244.78f, 0.0f, false, true, 33.06f, -29.24f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.58f, 0.0f);
        pathBuilder.arcTo(250.18f, 250.18f, 0.0f, false, true, 171.0f, 50.37f);
        pathBuilder.curveToRelative(26.81f, 30.84f, 41.0f, 63.21f, 41.0f, 93.63f);
        pathBuilder.arcToRelative(84.32f, 84.32f, 0.0f, false, true, -3.0f, 22.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.86f, 2.94f);
        pathBuilder.arcToRelative(3.86f, 3.86f, 0.0f, false, true, -1.06f, -0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.8f, -4.92f);
        pathBuilder.arcTo(75.89f, 75.89f, 0.0f, false, false, 204.0f, 144.0f);
        pathBuilder.curveToRelative(0.0f, -62.29f, -63.08f, -113.25f, -76.0f, -123.0f);
        pathBuilder.arcTo(251.38f, 251.38f, 0.0f, false, false, 98.44f, 47.48f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 92.78f, 47.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dropSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
