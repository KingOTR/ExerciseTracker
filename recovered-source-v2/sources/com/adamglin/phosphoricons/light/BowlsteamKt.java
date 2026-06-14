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

/* compiled from: Bowlsteam.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlSteam", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBowlSteam", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlSteam", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlsteamKt {
    private static ImageVector _bowlSteam;

    public static final ImageVector getBowlSteam(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 114.0f);
        pathBuilder.lineTo(32.0f, 114.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.arcToRelative(102.35f, 102.35f, 0.0f, false, false, 56.0f, 91.06f);
        pathBuilder.lineTo(82.0f, 216.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.verticalLineToRelative(-4.94f);
        pathBuilder.arcTo(102.35f, 102.35f, 0.0f, false, false, 230.0f, 120.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 114.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.5f, 201.84f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, 5.45f);
        pathBuilder.lineTo(162.0f, 216.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(96.0f, 218.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.verticalLineToRelative(-8.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.5f, -5.45f);
        pathBuilder.arcTo(90.35f, 90.35f, 0.0f, false, true, 38.2f, 126.0f);
        pathBuilder.lineTo(217.8f, 126.0f);
        pathBuilder.arcTo(90.35f, 90.35f, 0.0f, false, true, 165.5f, 201.84f);
        pathBuilder.close();
        pathBuilder.moveTo(83.32f, 56.24f);
        pathBuilder.curveToRelative(5.05f, -6.28f, 7.41f, -11.73f, 6.48f, -15.0f);
        pathBuilder.curveToRelative(-0.72f, -2.53f, -3.64f, -3.57f, -3.67f, -3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 88.0f, 26.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, 1.78f, 0.27f);
        pathBuilder.curveToRelative(0.91f, 0.28f, 8.9f, 3.0f, 11.48f, 11.44f);
        pathBuilder.curveToRelative(2.26f, 7.39f, -0.63f, 16.15f, -8.58f, 26.05f);
        pathBuilder.curveToRelative(-5.05f, 6.28f, -7.41f, 11.73f, -6.48f, 15.0f);
        pathBuilder.curveToRelative(0.72f, 2.53f, 3.64f, 3.57f, 3.67f, 3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 88.0f, 94.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, -1.78f, -0.27f);
        pathBuilder.curveToRelative(-0.91f, -0.28f, -8.9f, -3.0f, -11.48f, -11.44f);
        pathBuilder.curveTo(72.48f, 74.9f, 75.37f, 66.14f, 83.32f, 56.24f);
        pathBuilder.close();
        pathBuilder.moveTo(123.32f, 56.24f);
        pathBuilder.curveToRelative(5.05f, -6.28f, 7.41f, -11.73f, 6.48f, -15.0f);
        pathBuilder.curveToRelative(-0.72f, -2.53f, -3.64f, -3.57f, -3.67f, -3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 26.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, 1.78f, 0.27f);
        pathBuilder.curveToRelative(0.91f, 0.28f, 8.9f, 3.0f, 11.48f, 11.44f);
        pathBuilder.curveToRelative(2.26f, 7.39f, -0.63f, 16.15f, -8.58f, 26.05f);
        pathBuilder.curveToRelative(-5.05f, 6.28f, -7.41f, 11.73f, -6.48f, 15.0f);
        pathBuilder.curveToRelative(0.72f, 2.53f, 3.64f, 3.57f, 3.67f, 3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 128.0f, 94.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, -1.78f, -0.27f);
        pathBuilder.curveToRelative(-0.91f, -0.28f, -8.9f, -3.0f, -11.48f, -11.44f);
        pathBuilder.curveTo(112.48f, 74.9f, 115.37f, 66.14f, 123.32f, 56.24f);
        pathBuilder.close();
        pathBuilder.moveTo(163.32f, 56.24f);
        pathBuilder.curveToRelative(5.05f, -6.28f, 7.41f, -11.73f, 6.48f, -15.0f);
        pathBuilder.curveToRelative(-0.72f, -2.53f, -3.64f, -3.57f, -3.67f, -3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 168.0f, 26.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, 1.78f, 0.27f);
        pathBuilder.curveToRelative(0.91f, 0.28f, 8.9f, 3.0f, 11.48f, 11.44f);
        pathBuilder.curveToRelative(2.26f, 7.39f, -0.63f, 16.15f, -8.58f, 26.05f);
        pathBuilder.curveToRelative(-5.05f, 6.28f, -7.41f, 11.73f, -6.48f, 15.0f);
        pathBuilder.curveToRelative(0.72f, 2.53f, 3.64f, 3.57f, 3.67f, 3.58f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 168.0f, 94.0f);
        pathBuilder.arcToRelative(5.81f, 5.81f, 0.0f, false, true, -1.78f, -0.27f);
        pathBuilder.curveToRelative(-0.91f, -0.28f, -8.9f, -3.0f, -11.48f, -11.44f);
        pathBuilder.curveTo(152.48f, 74.9f, 155.37f, 66.14f, 163.32f, 56.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlSteam = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
