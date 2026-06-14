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

/* compiled from: Globe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Globe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGlobe", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobeKt {
    private static ImageVector _globe;

    public static final ImageVector getGlobe(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _globe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Globe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 207.0f);
        pathBuilder.arcToRelative(113.4f, 113.4f, 0.0f, false, true, -20.39f, -35.0f);
        pathBuilder.horizontalLineToRelative(40.82f);
        pathBuilder.arcToRelative(116.94f, 116.94f, 0.0f, false, true, -10.0f, 20.77f);
        pathBuilder.arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 207.0f);
        pathBuilder.close();
        pathBuilder.moveTo(101.51f, 148.0f);
        pathBuilder.arcToRelative(135.42f, 135.42f, 0.0f, false, true, 0.0f, -40.0f);
        pathBuilder.horizontalLineToRelative(53.0f);
        pathBuilder.arcToRelative(135.42f, 135.42f, 0.0f, false, true, 0.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 128.0f);
        pathBuilder.arcToRelative(83.49f, 83.49f, 0.0f, false, true, 2.43f, -20.0f);
        pathBuilder.lineTo(77.25f, 108.0f);
        pathBuilder.arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, 40.0f);
        pathBuilder.lineTo(46.43f, 148.0f);
        pathBuilder.arcTo(83.49f, 83.49f, 0.0f, false, true, 44.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 49.0f);
        pathBuilder.arcToRelative(113.4f, 113.4f, 0.0f, false, true, 20.39f, 35.0f);
        pathBuilder.lineTo(107.59f, 84.0f);
        pathBuilder.arcToRelative(116.94f, 116.94f, 0.0f, false, true, 10.0f, -20.77f);
        pathBuilder.arcTo(108.61f, 108.61f, 0.0f, false, true, 128.0f, 49.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.73f, 108.0f);
        pathBuilder.horizontalLineToRelative(30.82f);
        pathBuilder.arcToRelative(83.52f, 83.52f, 0.0f, false, true, 0.0f, 40.0f);
        pathBuilder.lineTo(178.75f, 148.0f);
        pathBuilder.arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, -40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(199.5f, 84.0f);
        pathBuilder.lineTo(173.71f, 84.0f);
        pathBuilder.arcToRelative(140.82f, 140.82f, 0.0f, false, false, -15.5f, -34.36f);
        pathBuilder.arcTo(84.51f, 84.51f, 0.0f, false, true, 199.52f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.79f, 49.64f);
        pathBuilder.arcTo(140.82f, 140.82f, 0.0f, false, false, 82.29f, 84.0f);
        pathBuilder.lineTo(56.48f, 84.0f);
        pathBuilder.arcTo(84.51f, 84.51f, 0.0f, false, true, 97.79f, 49.64f);
        pathBuilder.close();
        pathBuilder.moveTo(56.48f, 172.0f);
        pathBuilder.lineTo(82.29f, 172.0f);
        pathBuilder.arcToRelative(140.82f, 140.82f, 0.0f, false, false, 15.5f, 34.36f);
        pathBuilder.arcTo(84.51f, 84.51f, 0.0f, false, true, 56.48f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.21f, 206.36f);
        pathBuilder.arcTo(140.82f, 140.82f, 0.0f, false, false, 173.71f, 172.0f);
        pathBuilder.horizontalLineToRelative(25.81f);
        pathBuilder.arcTo(84.51f, 84.51f, 0.0f, false, true, 158.21f, 206.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
