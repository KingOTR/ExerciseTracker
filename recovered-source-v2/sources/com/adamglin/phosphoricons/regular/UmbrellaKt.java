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

/* compiled from: Umbrella.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getUmbrella", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_umbrella", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Umbrella", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 126.63f);
        pathBuilder.arcTo(112.44f, 112.44f, 0.0f, false, false, 51.75f, 53.75f);
        pathBuilder.arcToRelative(111.56f, 111.56f, 0.0f, false, false, -35.7f, 72.88f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 144.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -17.37f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 128.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(96.15f, 96.15f, 0.0f, false, true, 76.2f, -85.89f);
        pathBuilder.curveTo(96.48f, 58.0f, 81.85f, 86.11f, 80.17f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.15f, 128.0f);
        pathBuilder.curveToRelative(1.39f, -30.77f, 10.53f, -52.81f, 18.3f, -66.24f);
        pathBuilder.arcTo(106.44f, 106.44f, 0.0f, false, true, 128.0f, 43.16f);
        pathBuilder.arcToRelative(106.31f, 106.31f, 0.0f, false, true, 13.52f, 18.6f);
        pathBuilder.curveTo(154.8f, 84.7f, 159.0f, 109.28f, 159.82f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.8f, 128.0f);
        pathBuilder.curveToRelative(-1.68f, -41.89f, -16.31f, -70.0f, -28.0f, -85.94f);
        pathBuilder.arcTo(96.07f, 96.07f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _umbrella = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
