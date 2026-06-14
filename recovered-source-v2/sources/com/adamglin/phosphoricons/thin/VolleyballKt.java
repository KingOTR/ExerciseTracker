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

/* compiled from: Volleyball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Volleyball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getVolleyball", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_volleyball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VolleyballKt {
    private static ImageVector _volleyball;

    public static final ImageVector getVolleyball(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _volleyball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Volleyball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(213.0f, 163.19f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, -102.18f, 2.57f);
        pathBuilder.lineTo(130.31f, 132.0f);
        pathBuilder.horizontalLineToRelative(89.6f);
        pathBuilder.arcTo(91.61f, 91.61f, 0.0f, false, true, 213.0f, 163.19f);
        pathBuilder.close();
        pathBuilder.moveTo(85.52f, 46.42f);
        pathBuilder.arcTo(91.11f, 91.11f, 0.0f, false, true, 116.0f, 36.79f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 169.29f, 124.0f);
        pathBuilder.horizontalLineToRelative(-39.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.91f, 124.0f);
        pathBuilder.lineTo(177.29f, 124.0f);
        pathBuilder.arcToRelative(100.06f, 100.06f, 0.0f, false, false, -46.0f, -87.93f);
        pathBuilder.arcTo(92.11f, 92.11f, 0.0f, false, true, 219.91f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(78.59f, 50.42f);
        pathBuilder.lineToRelative(21.3f, 36.89f);
        pathBuilder.arcToRelative(100.09f, 100.09f, 0.0f, false, false, -53.16f, 83.77f);
        pathBuilder.arcTo(91.92f, 91.92f, 0.0f, false, true, 78.59f, 50.42f);
        pathBuilder.close();
        pathBuilder.moveTo(55.0f, 183.94f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 48.87f, -89.7f);
        pathBuilder.lineTo(123.38f, 128.0f);
        pathBuilder.lineTo(78.59f, 205.58f);
        pathBuilder.arcTo(92.75f, 92.75f, 0.0f, false, true, 55.0f, 183.94f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(91.37f, 91.37f, 0.0f, false, true, -42.48f, -10.42f);
        pathBuilder.lineToRelative(21.3f, -36.89f);
        pathBuilder.arcToRelative(100.07f, 100.07f, 0.0f, false, false, 99.1f, 4.16f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _volleyball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
