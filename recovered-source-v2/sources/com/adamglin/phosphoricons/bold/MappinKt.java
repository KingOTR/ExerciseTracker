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

/* compiled from: Mappin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMapPin", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinKt {
    private static ImageVector _mapPin;

    public static final ImageVector getMapPin(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _mapPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 60.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 124.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 12.0f);
        pathBuilder.arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 77.36f, 81.64f, 135.4f, 85.12f, 137.83f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.76f, 0.0f);
        pathBuilder.arcToRelative(259.0f, 259.0f, 0.0f, false, false, 42.18f, -39.0f);
        pathBuilder.curveTo(205.15f, 170.57f, 220.0f, 136.37f, 220.0f, 104.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(159.3f, 186.71f);
        pathBuilder.arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 216.89f);
        pathBuilder.arcToRelative(249.35f, 249.35f, 0.0f, false, true, -31.3f, -30.18f);
        pathBuilder.curveTo(80.0f, 167.37f, 60.0f, 137.31f, 60.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f);
        pathBuilder.curveTo(196.0f, 137.31f, 176.0f, 167.37f, 159.3f, 186.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
