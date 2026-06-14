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

/* compiled from: Parachute.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Parachute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getParachute", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_parachute", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParachuteKt {
    private static ImageVector _parachute;

    public static final ImageVector getParachute(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _parachute;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Parachute", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(236.0f, 120.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(108.12f, 108.12f, 0.0f, false, false, 20.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 3.85f, 8.79f);
        pathBuilder.lineToRelative(0.22f, 0.2f);
        pathBuilder.curveToRelative(0.17f, 0.15f, 0.35f, 0.31f, 0.54f, 0.45f);
        pathBuilder.lineToRelative(0.19f, 0.16f);
        pathBuilder.lineTo(116.0f, 198.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.lineTo(140.0f, 198.0f);
        pathBuilder.lineToRelative(91.2f, -68.4f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.15f, 108.0f);
        pathBuilder.lineTo(179.63f, 108.0f);
        pathBuilder.curveToRelative(-1.79f, -29.27f, -10.0f, -50.53f, -18.93f, -65.36f);
        pathBuilder.arcTo(84.27f, 84.27f, 0.0f, false, true, 211.15f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.42f, 108.0f);
        pathBuilder.curveTo(103.15f, 68.76f, 119.0f, 48.11f, 128.0f, 39.38f);
        pathBuilder.curveToRelative(9.0f, 8.73f, 24.85f, 29.38f, 27.58f, 68.62f);
        pathBuilder.close();
        pathBuilder.moveTo(95.3f, 42.64f);
        pathBuilder.curveToRelative(-9.0f, 14.83f, -17.14f, 36.09f, -18.93f, 65.36f);
        pathBuilder.lineTo(44.85f, 108.0f);
        pathBuilder.arcTo(84.27f, 84.27f, 0.0f, false, true, 95.3f, 42.64f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(140.0f, 132.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.lineToRelative(-48.0f, 36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _parachute = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
