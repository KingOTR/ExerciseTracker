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

/* compiled from: Hockey.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Hockey", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getHockey", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_hockey", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HockeyKt {
    private static ImageVector _hockey;

    public static final ImageVector getHockey(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _hockey;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Hockey", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 148.0f);
        pathBuilder.lineTo(132.75f, 148.0f);
        pathBuilder.lineTo(41.14f, 40.23f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 22.86f, 55.77f);
        pathBuilder.lineToRelative(95.16f, 112.0f);
        pathBuilder.lineToRelative(0.06f, 0.07f);
        pathBuilder.lineTo(156.46f, 213.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 171.7f, 220.0f);
        pathBuilder.lineTo(224.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(244.0f, 168.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 224.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.15f, 172.0f);
        pathBuilder.lineTo(180.0f, 172.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.horizontalLineToRelative(-6.45f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 196.0f);
        pathBuilder.lineTo(204.0f, 196.0f);
        pathBuilder.lineTo(204.0f, 172.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(153.66f, 112.23f);
        pathBuilder.lineTo(214.86f, 40.23f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.28f, 15.54f);
        pathBuilder.lineToRelative(-61.2f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.28f, -15.54f);
        pathBuilder.close();
        pathBuilder.moveTo(109.52f, 182.68f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.91f, 1.37f);
        pathBuilder.lineTo(82.45f, 196.0f);
        pathBuilder.lineTo(76.0f, 196.0f);
        pathBuilder.lineTo(76.0f, 171.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 74.7f, 148.0f);
        pathBuilder.lineTo(32.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, 20.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(84.3f, 220.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 99.54f, 213.0f);
        pathBuilder.lineToRelative(11.35f, -13.36f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 109.52f, 182.68f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 172.0f);
        pathBuilder.lineTo(52.0f, 172.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(36.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _hockey = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
