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

/* compiled from: Mappinplus.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MapPinPlus", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMapPinPlus", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mapPinPlus", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MappinplusKt {
    private static ImageVector _mapPinPlus;

    public static final ImageVector getMapPinPlus(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _mapPinPlus;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MapPinPlus", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(140.0f, 116.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 116.0f);
        pathBuilder.lineTo(96.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(116.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 92.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, 32.38f, -14.85f, 66.57f, -42.94f, 98.87f);
        pathBuilder.arcToRelative(259.0f, 259.0f, 0.0f, false, true, -42.18f, 39.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.76f, 0.0f);
        pathBuilder.curveTo(117.64f, 239.4f, 36.0f, 181.36f, 36.0f, 104.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -136.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 33.31f, 20.0f, 63.37f, 36.7f, 82.71f);
        pathBuilder.arcTo(249.35f, 249.35f, 0.0f, false, false, 128.0f, 216.89f);
        pathBuilder.arcToRelative(249.35f, 249.35f, 0.0f, false, false, 31.3f, -30.18f);
        pathBuilder.curveTo(176.0f, 167.37f, 196.0f, 137.31f, 196.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mapPinPlus = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
