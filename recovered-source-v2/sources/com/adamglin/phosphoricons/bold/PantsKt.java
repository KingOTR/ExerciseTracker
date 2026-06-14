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

/* compiled from: Pants.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pants", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPants", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pants", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PantsKt {
    private static ImageVector _pants;

    public static final ImageVector getPants(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pants;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pants", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(227.85f, 213.52f);
        pathBuilder.lineToRelative(-22.0f, -176.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 186.0f, 20.0f);
        pathBuilder.lineTo(70.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 50.15f, 37.52f);
        pathBuilder.lineToRelative(-22.0f, 176.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 48.0f, 236.0f);
        pathBuilder.lineTo(88.69f, 236.0f);
        pathBuilder.arcTo(19.94f, 19.94f, 0.0f, false, false, 108.07f, 221.0f);
        pathBuilder.lineToRelative(19.93f, -77.0f);
        pathBuilder.lineToRelative(19.91f, 76.94f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 167.31f, 236.0f);
        pathBuilder.lineTo(208.0f, 236.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.85f, -22.48f);
        pathBuilder.close();
        pathBuilder.moveTo(182.47f, 44.0f);
        pathBuilder.lineToRelative(2.0f, 16.0f);
        pathBuilder.lineTo(71.53f, 60.0f);
        pathBuilder.lineToRelative(2.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.6f, 212.0f);
        pathBuilder.lineTo(52.53f, 212.0f);
        pathBuilder.lineToRelative(11.2f, -89.6f);
        pathBuilder.arcTo(44.11f, 44.11f, 0.0f, false, false, 95.81f, 84.0f);
        pathBuilder.lineTo(116.0f, 84.0f);
        pathBuilder.lineTo(116.0f, 94.47f);
        pathBuilder.close();
        pathBuilder.moveTo(170.41f, 212.0f);
        pathBuilder.lineTo(140.0f, 94.47f);
        pathBuilder.lineTo(140.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(20.19f);
        pathBuilder.arcToRelative(44.09f, 44.09f, 0.0f, false, false, 32.08f, 38.39f);
        pathBuilder.lineTo(203.47f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pants = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
