package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Umbrella.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Umbrella", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getUmbrella", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_umbrella", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.reflectiveCurveTo(88.0f, 64.0f, 88.0f, 136.0f);
        pathBuilder.lineTo(32.0f, 136.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.71f);
        pathBuilder.arcTo(104.21f, 104.21f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 127.29f);
        pathBuilder.arcTo(104.21f, 104.21f, 0.0f, false, false, 128.0f, 32.0f);
        pathBuilder.reflectiveCurveToRelative(40.0f, 32.0f, 40.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 127.29f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 126.63f);
        pathBuilder2.arcTo(112.44f, 112.44f, 0.0f, false, false, 51.75f, 53.75f);
        pathBuilder2.arcToRelative(111.56f, 111.56f, 0.0f, false, false, -35.7f, 72.88f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 144.0f);
        pathBuilder2.horizontalLineToRelative(88.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 144.0f);
        pathBuilder2.horizontalLineToRelative(88.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -17.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(32.0f, 128.0f);
        pathBuilder2.lineToRelative(0.0f, 0.0f);
        pathBuilder2.arcToRelative(96.15f, 96.15f, 0.0f, false, true, 76.2f, -85.89f);
        pathBuilder2.curveTo(96.48f, 58.0f, 81.85f, 86.11f, 80.17f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(96.15f, 128.0f);
        pathBuilder2.curveToRelative(1.39f, -30.77f, 10.53f, -52.81f, 18.3f, -66.24f);
        pathBuilder2.arcTo(106.44f, 106.44f, 0.0f, false, true, 128.0f, 43.16f);
        pathBuilder2.arcToRelative(106.31f, 106.31f, 0.0f, false, true, 13.52f, 18.6f);
        pathBuilder2.curveTo(154.8f, 84.7f, 159.0f, 109.28f, 159.82f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(175.8f, 128.0f);
        pathBuilder2.curveToRelative(-1.68f, -41.89f, -16.31f, -70.0f, -28.0f, -85.94f);
        pathBuilder2.arcTo(96.07f, 96.07f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _umbrella = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
