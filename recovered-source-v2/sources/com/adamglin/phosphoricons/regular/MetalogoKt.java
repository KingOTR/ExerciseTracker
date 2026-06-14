package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Metalogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MetaLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMetaLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_metaLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetalogoKt {
    private static ImageVector _metaLogo;

    public static final ImageVector getMetaLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _metaLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MetaLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 16.11f, -3.17f, 29.89f, -9.17f, 39.84f);
        pathBuilder.curveToRelative(-7.43f, 12.33f, -19.0f, 18.85f, -33.39f, 18.85f);
        pathBuilder.curveToRelative(-27.94f, 0.0f, -47.78f, -37.0f, -68.78f, -76.22f);
        pathBuilder.curveTo(111.64f, 100.0f, 92.35f, 64.0f, 74.0f, 64.0f);
        pathBuilder.curveToRelative(-9.38f, 0.0f, -19.94f, 10.0f, -28.25f, 26.67f);
        pathBuilder.arcTo(138.18f, 138.18f, 0.0f, false, false, 32.0f, 149.31f);
        pathBuilder.curveToRelative(0.0f, 13.2f, 2.38f, 24.12f, 6.88f, 31.58f);
        pathBuilder.reflectiveCurveTo(49.82f, 192.0f, 58.56f, 192.0f);
        pathBuilder.curveToRelative(15.12f, 0.0f, 30.85f, -24.54f, 44.23f, -48.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.0f, 7.8f);
        pathBuilder.curveTo(101.46f, 178.71f, 83.07f, 208.0f, 58.56f, 208.0f);
        pathBuilder.curveToRelative(-14.41f, 0.0f, -26.0f, -6.52f, -33.39f, -18.85f);
        pathBuilder.curveToRelative(-6.0f, -10.0f, -9.17f, -23.73f, -9.17f, -39.84f);
        pathBuilder.arcTo(154.81f, 154.81f, 0.0f, false, true, 31.42f, 83.54f);
        pathBuilder.curveTo(42.82f, 60.62f, 57.94f, 48.0f, 74.0f, 48.0f);
        pathBuilder.curveToRelative(27.94f, 0.0f, 47.77f, 37.0f, 68.78f, 76.22f);
        pathBuilder.curveTo(159.79f, 156.0f, 179.08f, 192.0f, 197.44f, 192.0f);
        pathBuilder.curveToRelative(8.74f, 0.0f, 15.18f, -3.63f, 19.68f, -11.11f);
        pathBuilder.reflectiveCurveTo(224.0f, 162.51f, 224.0f, 149.31f);
        pathBuilder.arcToRelative(138.18f, 138.18f, 0.0f, false, false, -13.74f, -58.64f);
        pathBuilder.curveTo(202.0f, 74.0f, 191.39f, 64.0f, 182.0f, 64.0f);
        pathBuilder.curveToRelative(-8.36f, 0.0f, -17.68f, 7.48f, -28.51f, 22.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.08f, -9.21f);
        pathBuilder.curveToRelative(9.0f, -12.74f, 23.0f, -29.67f, 41.59f, -29.67f);
        pathBuilder.curveToRelative(16.05f, 0.0f, 31.17f, 12.62f, 42.57f, 35.54f);
        pathBuilder.arcTo(154.81f, 154.81f, 0.0f, false, true, 240.0f, 149.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _metaLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
