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

/* compiled from: Atom.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Atom", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAtom", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_atom", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AtomKt {
    private static ImageVector _atom;

    public static final ImageVector getAtom(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _atom;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Atom", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(196.12f, 128.0f);
        pathBuilder.curveToRelative(24.65f, -34.61f, 37.22f, -70.38f, 19.74f, -87.86f);
        pathBuilder.reflectiveCurveTo(162.61f, 35.23f, 128.0f, 59.88f);
        pathBuilder.curveTo(93.39f, 35.23f, 57.62f, 22.66f, 40.14f, 40.14f);
        pathBuilder.reflectiveCurveTo(35.23f, 93.39f, 59.88f, 128.0f);
        pathBuilder.curveToRelative(-24.65f, 34.61f, -37.22f, 70.38f, -19.74f, 87.86f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(5.63f, 5.63f, 13.15f, 8.14f, 21.91f, 8.14f);
        pathBuilder.curveToRelative(18.47f, 0.0f, 42.48f, -11.17f, 66.0f, -27.88f);
        pathBuilder.curveTo(151.47f, 212.83f, 175.47f, 224.0f, 194.0f, 224.0f);
        pathBuilder.curveToRelative(8.76f, 0.0f, 16.29f, -2.52f, 21.91f, -8.14f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(233.34f, 198.38f, 220.77f, 162.61f, 196.12f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.55f, 51.45f);
        pathBuilder.curveToRelative(7.64f, 7.64f, 2.48f, 32.4f, -18.52f, 63.28f);
        pathBuilder.arcToRelative(300.33f, 300.33f, 0.0f, false, false, -21.19f, -23.57f);
        pathBuilder.arcTo(302.47f, 302.47f, 0.0f, false, false, 141.27f, 70.0f);
        pathBuilder.curveTo(172.15f, 49.0f, 196.91f, 43.81f, 204.55f, 51.45f);
        pathBuilder.close();
        pathBuilder.moveTo(51.45f, 51.45f);
        pathBuilder.curveToRelative(2.2f, -2.21f, 5.83f, -3.35f, 10.62f, -3.35f);
        pathBuilder.curveTo(73.89f, 48.1f, 92.76f, 55.0f, 114.72f, 70.0f);
        pathBuilder.arcTo(304.0f, 304.0f, 0.0f, false, false, 91.16f, 91.16f);
        pathBuilder.arcTo(300.33f, 300.33f, 0.0f, false, false, 70.0f, 114.73f);
        pathBuilder.curveTo(49.0f, 83.85f, 43.81f, 59.09f, 51.45f, 51.45f);
        pathBuilder.close();
        pathBuilder.moveTo(51.45f, 204.55f);
        pathBuilder.curveTo(43.81f, 196.91f, 49.0f, 172.15f, 70.0f, 141.27f);
        pathBuilder.arcToRelative(300.33f, 300.33f, 0.0f, false, false, 21.19f, 23.57f);
        pathBuilder.arcTo(304.18f, 304.18f, 0.0f, false, false, 114.73f, 186.0f);
        pathBuilder.curveTo(83.85f, 207.0f, 59.09f, 212.19f, 51.45f, 204.55f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.55f, 204.56f);
        pathBuilder.curveToRelative(-7.64f, 7.65f, -32.4f, 2.48f, -63.28f, -18.52f);
        pathBuilder.arcToRelative(304.18f, 304.18f, 0.0f, false, false, 23.57f, -21.19f);
        pathBuilder.arcTo(300.33f, 300.33f, 0.0f, false, false, 186.0f, 141.27f);
        pathBuilder.curveTo(207.0f, 172.15f, 212.19f, 196.91f, 204.55f, 204.55f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _atom = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
