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

/* compiled from: Wine.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getWine", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WineKt {
    private static ImageVector _wine;

    public static final ImageVector getWine(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _wine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(201.5f, 104.8f);
        pathBuilder.lineTo(179.72f, 30.87f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 175.89f, 28.0f);
        pathBuilder.lineTo(80.11f, 28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.83f, 2.87f);
        pathBuilder.lineTo(54.5f, 104.8f);
        pathBuilder.arcToRelative(59.51f, 59.51f, 0.0f, false, false, 16.32f, 60.62f);
        pathBuilder.arcTo(83.39f, 83.39f, 0.0f, false, false, 124.0f, 187.91f);
        pathBuilder.lineTo(124.0f, 236.0f);
        pathBuilder.lineTo(88.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f);
        pathBuilder.lineTo(132.0f, 236.0f);
        pathBuilder.lineTo(132.0f, 187.91f);
        pathBuilder.arcToRelative(83.39f, 83.39f, 0.0f, false, false, 53.18f, -22.49f);
        pathBuilder.arcTo(59.51f, 59.51f, 0.0f, false, false, 201.5f, 104.8f);
        pathBuilder.close();
        pathBuilder.moveTo(83.1f, 36.0f);
        pathBuilder.horizontalLineToRelative(89.8f);
        pathBuilder.lineToRelative(20.93f, 71.06f);
        pathBuilder.curveToRelative(0.43f, 1.49f, 0.8f, 3.0f, 1.1f, 4.47f);
        pathBuilder.curveToRelative(-23.64f, 10.47f, -50.76f, 0.18f, -65.12f, -7.1f);
        pathBuilder.curveToRelative(-28.22f, -14.29f, -49.48f, -14.1f, -63.88f, -10.14f);
        pathBuilder.close();
        pathBuilder.moveTo(179.72f, 159.57f);
        pathBuilder.arcToRelative(75.68f, 75.68f, 0.0f, false, true, -103.44f, 0.0f);
        pathBuilder.arcToRelative(51.53f, 51.53f, 0.0f, false, true, -14.11f, -52.51f);
        pathBuilder.lineToRelative(1.0f, -3.46f);
        pathBuilder.curveToRelative(12.66f, -4.87f, 33.45f, -7.0f, 63.0f, 8.0f);
        pathBuilder.curveTo(137.0f, 117.0f, 154.33f, 124.0f, 172.8f, 124.0f);
        pathBuilder.arcTo(62.78f, 62.78f, 0.0f, false, false, 196.0f, 119.78f);
        pathBuilder.arcTo(51.26f, 51.26f, 0.0f, false, true, 179.72f, 159.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
