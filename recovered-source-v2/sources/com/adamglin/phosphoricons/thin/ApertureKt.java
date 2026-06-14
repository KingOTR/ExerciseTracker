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

/* compiled from: Aperture.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Aperture", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAperture", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_aperture", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApertureKt {
    private static ImageVector _aperture;

    public static final ImageVector getAperture(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _aperture;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Aperture", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(198.71f, 57.29f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 57.29f, 198.71f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 198.71f, 57.29f);
        pathBuilder.close();
        pathBuilder.moveTo(209.08f, 171.56f);
        pathBuilder.lineTo(148.08f, 160.42f);
        pathBuilder.lineTo(210.4f, 87.0f);
        pathBuilder.arcToRelative(92.26f, 92.26f, 0.0f, false, true, -1.32f, 84.52f);
        pathBuilder.close();
        pathBuilder.moveTo(95.87f, 122.13f);
        pathBuilder.lineTo(117.0f, 97.24f);
        pathBuilder.lineToRelative(32.14f, 5.86f);
        pathBuilder.lineToRelative(11.0f, 30.77f);
        pathBuilder.lineTo(139.0f, 158.76f);
        pathBuilder.lineToRelative(-32.14f, -5.86f);
        pathBuilder.close();
        pathBuilder.moveTo(206.24f, 79.58f);
        pathBuilder.lineToRelative(-40.13f, 47.25f);
        pathBuilder.lineTo(133.75f, 36.2f);
        pathBuilder.arcToRelative(92.09f, 92.09f, 0.0f, false, true, 72.49f, 43.38f);
        pathBuilder.close();
        pathBuilder.moveTo(63.0f, 63.0f);
        pathBuilder.arcToRelative(91.31f, 91.31f, 0.0f, false, true, 62.26f, -26.88f);
        pathBuilder.lineTo(146.0f, 94.41f);
        pathBuilder.lineTo(51.32f, 77.11f);
        pathBuilder.arcTo(92.94f, 92.94f, 0.0f, false, true, 63.0f, 63.0f);
        pathBuilder.close();
        pathBuilder.moveTo(47.0f, 84.49f);
        pathBuilder.lineTo(108.0f, 95.63f);
        pathBuilder.lineTo(45.6f, 169.0f);
        pathBuilder.arcToRelative(92.26f, 92.26f, 0.0f, false, true, 1.32f, -84.52f);
        pathBuilder.close();
        pathBuilder.moveTo(49.84f, 176.49f);
        pathBuilder.lineTo(89.97f, 129.24f);
        pathBuilder.lineTo(122.33f, 219.87f);
        pathBuilder.arcToRelative(92.09f, 92.09f, 0.0f, false, true, -72.49f, -43.38f);
        pathBuilder.close();
        pathBuilder.moveTo(193.13f, 193.12f);
        pathBuilder.arcToRelative(91.31f, 91.31f, 0.0f, false, true, -62.26f, 26.88f);
        pathBuilder.lineTo(110.0f, 161.59f);
        pathBuilder.lineToRelative(94.72f, 17.3f);
        pathBuilder.arcTo(92.94f, 92.94f, 0.0f, false, true, 193.05f, 193.05f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _aperture = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
