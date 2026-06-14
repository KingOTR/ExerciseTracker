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

/* compiled from: Baseball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Baseball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBaseball", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballKt {
    private static ImageVector _baseball;

    public static final ImageVector getBaseball(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _baseball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Baseball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.31f, 190.64f);
        pathBuilder.curveToRelative(-1.55f, -1.66f, -3.05f, -3.38f, -4.46f, -5.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.24f, 5.0f);
        pathBuilder.curveToRelative(1.58f, 2.0f, 3.26f, 3.9f, 5.0f, 5.76f);
        pathBuilder.arcToRelative(91.82f, 91.82f, 0.0f, false, true, -123.22f, 0.0f);
        pathBuilder.curveToRelative(1.74f, -1.86f, 3.42f, -3.78f, 5.0f, -5.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.24f, -5.0f);
        pathBuilder.curveToRelative(-1.41f, 1.76f, -2.91f, 3.48f, -4.46f, 5.14f);
        pathBuilder.arcToRelative(91.81f, 91.81f, 0.0f, false, true, 0.0f, -125.28f);
        pathBuilder.curveToRelative(1.55f, 1.66f, 3.05f, 3.38f, 4.46f, 5.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.24f, -5.0f);
        pathBuilder.curveToRelative(-1.58f, -2.0f, -3.26f, -3.9f, -5.0f, -5.76f);
        pathBuilder.arcToRelative(91.82f, 91.82f, 0.0f, false, true, 123.22f, 0.0f);
        pathBuilder.curveToRelative(-1.74f, 1.86f, -3.42f, 3.78f, -5.0f, 5.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.24f, 5.0f);
        pathBuilder.curveToRelative(1.41f, -1.76f, 2.91f, -3.48f, 4.46f, -5.14f);
        pathBuilder.arcToRelative(91.81f, 91.81f, 0.0f, false, true, 0.0f, 125.28f);
        pathBuilder.close();
        pathBuilder.moveTo(91.94f, 144.64f);
        pathBuilder.arcToRelative(98.57f, 98.57f, 0.0f, false, true, -4.3f, 16.67f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 83.86f, 164.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.33f, -0.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.44f, -5.1f);
        pathBuilder.arcToRelative(92.07f, 92.07f, 0.0f, false, false, 4.0f, -15.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, 1.32f);
        pathBuilder.close();
        pathBuilder.moveTo(91.94f, 111.32f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.28f, 4.6f);
        pathBuilder.arcTo(3.77f, 3.77f, 0.0f, false, true, 88.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.34f);
        pathBuilder.arcToRelative(92.07f, 92.07f, 0.0f, false, false, -4.0f, -15.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.55f, -2.66f);
        pathBuilder.arcTo(98.57f, 98.57f, 0.0f, false, true, 91.94f, 111.34f);
        pathBuilder.close();
        pathBuilder.moveTo(175.94f, 158.65f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.44f, 5.1f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.33f, 0.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.78f, -2.67f);
        pathBuilder.arcToRelative(98.57f, 98.57f, 0.0f, false, true, -4.3f, -16.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.88f, -1.32f);
        pathBuilder.arcTo(92.07f, 92.07f, 0.0f, false, false, 175.91f, 158.67f);
        pathBuilder.close();
        pathBuilder.moveTo(175.94f, 97.31f);
        pathBuilder.arcToRelative(92.07f, 92.07f, 0.0f, false, false, -4.0f, 15.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 168.0f, 116.0f);
        pathBuilder.arcToRelative(3.68f, 3.68f, 0.0f, false, true, -0.66f, -0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.28f, -4.6f);
        pathBuilder.arcToRelative(98.57f, 98.57f, 0.0f, false, true, 4.3f, -16.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.55f, 2.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
