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

/* compiled from: Globex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GlobeX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGlobeX", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globeX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobexKt {
    private static ImageVector _globeX;

    public static final ImageVector getGlobeX(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _globeX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GlobeX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 20.0f);
        pathBuilder.arcToRelative(108.0f, 108.0f, 0.0f, false, false, 0.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.49f, -21.37f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-0.25f, -0.2f, -17.55f, -14.39f, -27.9f, -42.63f);
        pathBuilder.lineTo(128.0f, 172.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(101.48f, 148.0f);
        pathBuilder.arcToRelative(135.88f, 135.88f, 0.0f, false, true, 0.0f, -40.0f);
        pathBuilder.horizontalLineToRelative(53.0f);
        pathBuilder.arcTo(133.77f, 133.77f, 0.0f, false, true, 156.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(159.0f, 159.0f, 0.0f, false, false, -1.25f, -20.0f);
        pathBuilder.horizontalLineToRelative(30.82f);
        pathBuilder.arcTo(83.49f, 83.49f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(97.79f, 49.64f);
        pathBuilder.arcTo(140.82f, 140.82f, 0.0f, false, false, 82.29f, 84.0f);
        pathBuilder.lineTo(56.48f, 84.0f);
        pathBuilder.arcTo(84.46f, 84.46f, 0.0f, false, true, 97.79f, 49.64f);
        pathBuilder.close();
        pathBuilder.moveTo(97.79f, 206.36f);
        pathBuilder.arcTo(84.46f, 84.46f, 0.0f, false, true, 56.48f, 172.0f);
        pathBuilder.lineTo(82.29f, 172.0f);
        pathBuilder.arcTo(140.82f, 140.82f, 0.0f, false, false, 97.79f, 206.36f);
        pathBuilder.close();
        pathBuilder.moveTo(77.25f, 148.0f);
        pathBuilder.lineTo(46.43f, 148.0f);
        pathBuilder.arcToRelative(83.52f, 83.52f, 0.0f, false, true, 0.0f, -40.0f);
        pathBuilder.lineTo(77.25f, 108.0f);
        pathBuilder.arcToRelative(160.63f, 160.63f, 0.0f, false, false, 0.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(107.59f, 84.0f);
        pathBuilder.arcToRelative(116.61f, 116.61f, 0.0f, false, true, 10.0f, -20.77f);
        pathBuilder.arcTo(107.75f, 107.75f, 0.0f, false, true, 128.0f, 49.0f);
        pathBuilder.arcToRelative(113.2f, 113.2f, 0.0f, false, true, 20.39f, 35.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.71f, 84.0f);
        pathBuilder.arcToRelative(140.82f, 140.82f, 0.0f, false, false, -15.5f, -34.36f);
        pathBuilder.arcTo(84.46f, 84.46f, 0.0f, false, true, 199.52f, 84.0f);
        pathBuilder.close();
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
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globeX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
