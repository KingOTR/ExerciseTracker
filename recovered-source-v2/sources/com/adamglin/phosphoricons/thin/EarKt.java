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

/* compiled from: Ear.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Ear", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_ear", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EarKt {
    private static ImageVector _ear;

    public static final ImageVector getEar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _ear;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Ear", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -152.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 28.4f, 9.55f, 37.61f, 18.79f, 46.52f);
        pathBuilder.curveTo(79.25f, 158.67f, 88.0f, 167.11f, 88.0f, 188.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.curveToRelative(11.37f, 0.0f, 20.83f, -4.76f, 28.92f, -14.55f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.16f, 5.1f);
        pathBuilder.curveTo(153.52f, 230.13f, 141.71f, 236.0f, 128.0f, 236.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder.curveToRelative(0.0f, -17.49f, -6.84f, -24.09f, -14.76f, -31.72f);
        pathBuilder.curveTo(55.28f, 146.68f, 44.0f, 135.79f, 44.0f, 104.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.86f, 164.54f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 170.4f, 166.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.4f, -6.0f);
        pathBuilder.curveToRelative(0.0f, -10.67f, 5.44f, -17.92f, 11.2f, -25.6f);
        pathBuilder.curveTo(165.49f, 126.0f, 172.0f, 117.33f, 172.0f, 104.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 10.67f, -5.44f, 17.92f, -11.2f, 25.6f);
        pathBuilder.curveTo(146.51f, 138.0f, 140.0f, 146.67f, 140.0f, 160.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 37.32f, 10.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 175.86f, 164.54f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _ear = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
