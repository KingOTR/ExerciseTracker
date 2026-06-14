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

/* compiled from: Heart.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Heart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getHeart", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_heart", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HeartKt {
    private static ImageVector _heart;

    public static final ImageVector getHeart(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _heart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Heart", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(178.0f, 44.0f);
        pathBuilder.curveToRelative(-21.44f, 0.0f, -39.92f, 10.19f, -50.0f, 27.07f);
        pathBuilder.curveTo(117.92f, 54.19f, 99.44f, 44.0f, 78.0f, 44.0f);
        pathBuilder.arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f);
        pathBuilder.curveToRelative(0.0f, 28.59f, 18.0f, 58.47f, 53.4f, 88.79f);
        pathBuilder.arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, 36.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f);
        pathBuilder.arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, -36.73f);
        pathBuilder.curveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, false, 178.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 219.42f);
        pathBuilder.curveToRelative(-14.0f, -8.0f, -100.0f, -59.35f, -100.0f, -117.42f);
        pathBuilder.arcTo(50.06f, 50.06f, 0.0f, false, true, 78.0f, 52.0f);
        pathBuilder.curveToRelative(21.11f, 0.0f, 38.85f, 11.31f, 46.3f, 29.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f);
        pathBuilder.curveTo(139.15f, 63.31f, 156.89f, 52.0f, 178.0f, 52.0f);
        pathBuilder.arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, 50.0f);
        pathBuilder.curveTo(228.0f, 160.0f, 142.0f, 211.46f, 128.0f, 219.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _heart = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
