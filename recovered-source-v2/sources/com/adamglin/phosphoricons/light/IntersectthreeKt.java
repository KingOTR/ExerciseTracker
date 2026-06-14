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

/* compiled from: Intersectthree.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"IntersectThree", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getIntersectThree", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_intersectThree", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersectthreeKt {
    private static ImageVector _intersectThree;

    public static final ImageVector getIntersectThree(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _intersectThree;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("IntersectThree", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(193.78f, 97.13f);
        pathBuilder.curveToRelative(0.13f, -1.69f, 0.22f, -3.4f, 0.22f, -5.13f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 62.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 1.73f, 0.09f, 3.44f, 0.22f, 5.13f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, true, false, 128.0f, 211.27f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, true, false, 193.78f, 97.13f);
        pathBuilder.close();
        pathBuilder.moveTo(74.0f, 92.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, true, 108.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 0.17f, 0.0f, 0.34f, 0.0f, 0.51f);
        pathBuilder.arcToRelative(65.75f, 65.75f, 0.0f, false, false, -54.0f, 8.22f);
        pathBuilder.arcToRelative(65.75f, 65.75f, 0.0f, false, false, -54.0f, -8.22f);
        pathBuilder.curveTo(74.0f, 92.34f, 74.0f, 92.17f, 74.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 156.0f);
        pathBuilder.arcToRelative(53.88f, 53.88f, 0.0f, false, true, -18.0f, 40.21f);
        pathBuilder.arcTo(53.88f, 53.88f, 0.0f, false, true, 110.0f, 156.0f);
        pathBuilder.curveToRelative(0.0f, -0.17f, 0.0f, -0.34f, 0.0f, -0.51f);
        pathBuilder.arcToRelative(65.73f, 65.73f, 0.0f, false, false, 36.0f, 0.0f);
        pathBuilder.curveTo(146.0f, 155.66f, 146.0f, 155.83f, 146.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 146.0f);
        pathBuilder.arcToRelative(53.61f, 53.61f, 0.0f, false, true, -16.5f, -2.59f);
        pathBuilder.arcTo(54.09f, 54.09f, 0.0f, false, true, 128.0f, 115.79f);
        pathBuilder.arcToRelative(54.09f, 54.09f, 0.0f, false, true, 16.5f, 27.62f);
        pathBuilder.arcTo(53.61f, 53.61f, 0.0f, false, true, 128.0f, 146.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.4f, 138.39f);
        pathBuilder.arcToRelative(54.14f, 54.14f, 0.0f, false, true, -24.9f, -33.8f);
        pathBuilder.arcTo(53.85f, 53.85f, 0.0f, false, true, 118.0f, 108.71f);
        pathBuilder.arcTo(66.09f, 66.09f, 0.0f, false, false, 100.4f, 138.39f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 108.71f);
        pathBuilder.arcToRelative(53.85f, 53.85f, 0.0f, false, true, 42.53f, -4.12f);
        pathBuilder.arcToRelative(54.14f, 54.14f, 0.0f, false, true, -24.9f, 33.8f);
        pathBuilder.arcTo(66.09f, 66.09f, 0.0f, false, false, 138.0f, 108.71f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 210.0f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 64.4f, 109.61f);
        pathBuilder.arcToRelative(66.29f, 66.29f, 0.0f, false, false, 33.82f, 41.26f);
        pathBuilder.curveToRelative(-0.13f, 1.69f, -0.22f, 3.4f, -0.22f, 5.13f);
        pathBuilder.arcToRelative(65.8f, 65.8f, 0.0f, false, false, 20.0f, 47.29f);
        pathBuilder.arcTo(53.64f, 53.64f, 0.0f, false, true, 92.0f, 210.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 210.0f);
        pathBuilder.arcToRelative(53.64f, 53.64f, 0.0f, false, true, -26.0f, -6.71f);
        pathBuilder.arcTo(65.8f, 65.8f, 0.0f, false, false, 158.0f, 156.0f);
        pathBuilder.curveToRelative(0.0f, -1.73f, -0.09f, -3.44f, -0.22f, -5.13f);
        pathBuilder.arcToRelative(66.29f, 66.29f, 0.0f, false, false, 33.82f, -41.26f);
        pathBuilder.arcTo(54.0f, 54.0f, 0.0f, false, true, 164.0f, 210.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _intersectThree = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
