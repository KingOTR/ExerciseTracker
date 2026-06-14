package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Handeye.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HandEye", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHandEye", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_handEye", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HandeyeKt {
    private static ImageVector _handEye;

    public static final ImageVector getHandEye(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _handEye;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HandEye", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(138.0f, 168.0f);
        pathBuilder.arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f);
        pathBuilder.arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(214.0f, 116.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(86.0f, 86.0f, 0.0f, false, true, -172.0f, 0.0f);
        pathBuilder.lineTo(42.0f, 76.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 82.0f, 54.11f);
        pathBuilder.lineTo(82.0f, 44.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 51.41f, -5.51f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 174.0f, 60.0f);
        pathBuilder.lineTo(174.0f, 94.11f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, true, 214.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 116.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(162.0f, 60.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 44.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(82.0f, 76.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -28.0f, 0.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(74.0f, 74.0f, 0.0f, false, false, 148.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.37f, 165.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 5.36f);
        pathBuilder.curveTo(180.65f, 172.12f, 163.3f, 206.0f, 128.0f, 206.0f);
        pathBuilder.reflectiveCurveToRelative(-52.65f, -33.88f, -53.37f, -35.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -5.36f);
        pathBuilder.curveTo(75.35f, 163.88f, 92.7f, 130.0f, 128.0f, 130.0f);
        pathBuilder.reflectiveCurveTo(180.65f, 163.88f, 181.37f, 165.32f);
        pathBuilder.close();
        pathBuilder.moveTo(169.08f, 168.0f);
        pathBuilder.curveToRelative(-4.46f, -7.12f, -18.41f, -26.0f, -41.08f, -26.0f);
        pathBuilder.reflectiveCurveToRelative(-36.65f, 18.85f, -41.08f, 26.0f);
        pathBuilder.curveToRelative(4.46f, 7.13f, 18.41f, 26.0f, 41.08f, 26.0f);
        pathBuilder.reflectiveCurveTo(164.65f, 175.15f, 169.08f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _handEye = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
