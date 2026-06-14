package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Parachute.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Parachute", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getParachute", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_parachute", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParachuteKt {
    private static ImageVector _parachute;

    public static final ImageVector getParachute(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 120.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 24.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.21f, 6.39f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(120.0f, 196.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineTo(136.0f, 196.0f);
        pathBuilder.lineToRelative(92.8f, -69.6f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.64f, 112.0f);
        pathBuilder.lineTo(175.83f, 112.0f);
        pathBuilder.curveToRelative(-1.54f, -37.95f, -13.91f, -62.43f, -25.11f, -77.0f);
        pathBuilder.arcTo(88.2f, 88.2f, 0.0f, false, true, 215.64f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.4f, 128.0f);
        pathBuilder.lineTo(128.0f, 175.53f);
        pathBuilder.lineTo(101.6f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(83.29f, 128.0f);
        pathBuilder.lineTo(102.79f, 163.09f);
        pathBuilder.lineTo(56.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.71f, 128.0f);
        pathBuilder.lineTo(200.0f, 128.0f);
        pathBuilder.lineToRelative(-46.79f, 35.09f);
        pathBuilder.close();
        pathBuilder.moveTo(105.28f, 35.0f);
        pathBuilder.curveToRelative(-11.2f, 14.57f, -23.57f, 39.05f, -25.11f, 77.0f);
        pathBuilder.lineTo(40.36f, 112.0f);
        pathBuilder.arcTo(88.2f, 88.2f, 0.0f, false, true, 105.28f, 35.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _parachute = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
