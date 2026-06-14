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

/* compiled from: Maptrifold.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapTrifold", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMapTrifold", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapTrifold", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MaptrifoldKt {
    private static ImageVector _mapTrifold;

    public static final ImageVector getMapTrifold(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _mapTrifold;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapTrifold", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.38f, 46.54f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.29f, -2.18f);
        pathBuilder.lineTo(161.4f, 59.28f);
        pathBuilder.lineToRelative(-60.0f, -30.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.28f, -0.91f);
        pathBuilder.lineToRelative(-64.0f, 16.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f);
        pathBuilder.lineTo(20.0f, 200.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.91f, 11.64f);
        pathBuilder.lineTo(94.6f, 196.72f);
        pathBuilder.lineToRelative(60.0f, 30.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.28f, 0.91f);
        pathBuilder.lineToRelative(64.0f, -16.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 200.0f);
        pathBuilder.lineTo(236.0f, 56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 231.38f, 46.54f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 59.42f);
        pathBuilder.lineToRelative(40.0f, 20.0f);
        pathBuilder.lineTo(148.0f, 196.58f);
        pathBuilder.lineToRelative(-40.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 65.42f);
        pathBuilder.lineTo(84.0f, 55.42f);
        pathBuilder.lineTo(84.0f, 174.63f);
        pathBuilder.lineToRelative(-40.0f, 10.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 190.63f);
        pathBuilder.lineToRelative(-40.0f, 10.0f);
        pathBuilder.lineTo(172.0f, 81.37f);
        pathBuilder.lineToRelative(40.0f, -10.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapTrifold = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
