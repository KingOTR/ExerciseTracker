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

/* compiled from: Globesimplex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeSimpleX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGlobeSimpleX", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeSimpleX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobesimplexKt {
    private static ImageVector _globeSimpleX;

    public static final ImageVector getGlobeSimpleX(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _globeSimpleX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeSimpleX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.49f, 176.49f);
        pathBuilder.lineTo(209.0f, 192.0f);
        pathBuilder.lineToRelative(15.52f, 15.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(192.0f, 209.0f);
        pathBuilder.lineToRelative(-15.51f, 15.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.lineTo(175.0f, 192.0f);
        pathBuilder.lineToRelative(-15.52f, -15.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f);
        pathBuilder.lineTo(192.0f, 175.0f);
        pathBuilder.lineToRelative(15.51f, -15.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(100.54f, 140.0f);
        pathBuilder.curveToRelative(4.37f, 49.56f, 34.63f, 74.37f, 35.0f, 74.63f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 236.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.21f, 49.64f);
        pathBuilder.arcTo(144.3f, 144.3f, 0.0f, false, true, 179.56f, 116.0f);
        pathBuilder.horizontalLineToRelative(31.57f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, false, 158.21f, 49.64f);
        pathBuilder.close();
        pathBuilder.moveTo(117.64f, 63.23f);
        pathBuilder.arcTo(119.74f, 119.74f, 0.0f, false, false, 100.53f, 116.0f);
        pathBuilder.horizontalLineToRelative(54.94f);
        pathBuilder.curveToRelative(-3.0f, -33.9f, -18.09f, -56.22f, -27.45f, -67.0f);
        pathBuilder.arcTo(107.75f, 107.75f, 0.0f, false, false, 117.64f, 63.23f);
        pathBuilder.close();
        pathBuilder.moveTo(44.87f, 116.0f);
        pathBuilder.lineTo(76.44f, 116.0f);
        pathBuilder.arcTo(144.3f, 144.3f, 0.0f, false, true, 97.79f, 49.64f);
        pathBuilder.arcTo(84.22f, 84.22f, 0.0f, false, false, 44.87f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.44f, 140.0f);
        pathBuilder.lineTo(44.87f, 140.0f);
        pathBuilder.arcToRelative(84.22f, 84.22f, 0.0f, false, false, 52.92f, 66.36f);
        pathBuilder.arcTo(144.3f, 144.3f, 0.0f, false, true, 76.44f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeSimpleX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
