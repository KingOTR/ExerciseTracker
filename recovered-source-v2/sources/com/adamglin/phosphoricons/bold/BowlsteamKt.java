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

/* compiled from: Bowlsteam.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlSteam", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBowlSteam", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlSteam", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlsteamKt {
    private static ImageVector _bowlSteam;

    public static final ImageVector getBowlSteam(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bowlSteam;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BowlSteam", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 108.0f);
        pathBuilder.lineTo(32.0f, 108.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.arcToRelative(108.38f, 108.38f, 0.0f, false, false, 56.0f, 94.68f);
        pathBuilder.lineTo(76.0f, 216.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineToRelative(-1.32f);
        pathBuilder.arcTo(108.38f, 108.38f, 0.0f, false, false, 236.0f, 120.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.0f, 196.39f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, 10.9f);
        pathBuilder.lineTo(156.0f, 212.0f);
        pathBuilder.lineTo(100.0f, 212.0f);
        pathBuilder.verticalLineToRelative(-4.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.0f, -10.9f);
        pathBuilder.arcTo(84.32f, 84.32f, 0.0f, false, true, 44.87f, 132.0f);
        pathBuilder.lineTo(211.13f, 132.0f);
        pathBuilder.arcTo(84.32f, 84.32f, 0.0f, false, true, 163.0f, 196.39f);
        pathBuilder.close();
        pathBuilder.moveTo(74.93f, 50.15f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, 4.71f, -7.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.7f, -22.7f);
        pathBuilder.curveToRelative(5.67f, 1.64f, 13.2f, 6.63f, 15.77f, 15.3f);
        pathBuilder.curveToRelative(2.71f, 9.14f, -0.67f, 19.26f, -10.0f, 30.08f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, -4.71f, 7.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 96.0f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, true, -3.33f, -0.47f);
        pathBuilder.curveTo(75.0f, 93.89f, 67.46f, 88.9f, 64.89f, 80.23f);
        pathBuilder.curveTo(62.18f, 71.09f, 65.56f, 61.0f, 74.93f, 50.15f);
        pathBuilder.close();
        pathBuilder.moveTo(118.93f, 50.15f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, 4.71f, -7.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.7f, -22.7f);
        pathBuilder.curveToRelative(5.67f, 1.64f, 13.2f, 6.63f, 15.77f, 15.3f);
        pathBuilder.curveToRelative(2.71f, 9.14f, -0.67f, 19.26f, -10.0f, 30.08f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, -4.71f, 7.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 96.0f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, true, -3.33f, -0.47f);
        pathBuilder.curveToRelative(-5.67f, -1.64f, -13.21f, -6.63f, -15.78f, -15.3f);
        pathBuilder.curveTo(106.18f, 71.09f, 109.56f, 61.0f, 118.93f, 50.15f);
        pathBuilder.close();
        pathBuilder.moveTo(162.93f, 50.15f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, 4.71f, -7.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.7f, -22.7f);
        pathBuilder.curveToRelative(5.67f, 1.64f, 13.2f, 6.63f, 15.77f, 15.3f);
        pathBuilder.curveToRelative(2.71f, 9.14f, -0.67f, 19.26f, -10.0f, 30.08f);
        pathBuilder.arcToRelative(26.32f, 26.32f, 0.0f, false, false, -4.71f, 7.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 96.0f);
        pathBuilder.arcToRelative(11.81f, 11.81f, 0.0f, false, true, -3.33f, -0.47f);
        pathBuilder.curveToRelative(-5.67f, -1.64f, -13.21f, -6.63f, -15.78f, -15.3f);
        pathBuilder.curveTo(150.18f, 71.09f, 153.56f, 61.0f, 162.93f, 50.15f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlSteam = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
