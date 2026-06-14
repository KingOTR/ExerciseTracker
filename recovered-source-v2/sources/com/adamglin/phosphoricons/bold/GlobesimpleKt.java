package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Globesimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGlobeSimple", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimpleKt {
    private static ImageVector _globeSimple;

    public static final ImageVector getGlobeSimple(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _globeSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.13f, 116.0f);
        pathBuilder.lineTo(179.56f, 116.0f);
        pathBuilder.arcToRelative(144.3f, 144.3f, 0.0f, false, false, -21.35f, -66.36f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, true, 211.13f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 207.0f);
        pathBuilder.curveToRelative(-9.36f, -10.81f, -24.46f, -33.13f, -27.45f, -67.0f);
        pathBuilder.horizontalLineToRelative(54.94f);
        pathBuilder.arcToRelative(119.74f, 119.74f, 0.0f, false, true, -17.11f, 52.77f);
        pathBuilder.arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 207.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.55f, 116.0f);
        pathBuilder.arcToRelative(119.74f, 119.74f, 0.0f, false, true, 17.11f, -52.77f);
        pathBuilder.arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 49.0f);
        pathBuilder.curveToRelative(9.36f, 10.81f, 24.46f, 33.13f, 27.45f, 67.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.79f, 49.64f);
        pathBuilder.arcTo(144.3f, 144.3f, 0.0f, false, false, 76.44f, 116.0f);
        pathBuilder.lineTo(44.87f, 116.0f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, true, 97.79f, 49.64f);
        pathBuilder.close();
        pathBuilder.moveTo(44.87f, 140.0f);
        pathBuilder.lineTo(76.44f, 140.0f);
        pathBuilder.arcToRelative(144.3f, 144.3f, 0.0f, false, false, 21.35f, 66.36f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, true, 44.87f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.21f, 206.36f);
        pathBuilder.arcTo(144.3f, 144.3f, 0.0f, false, false, 179.56f, 140.0f);
        pathBuilder.horizontalLineToRelative(31.57f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, true, 158.21f, 206.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
