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

/* compiled from: Applelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getAppleLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplelogoKt {
    private static ImageVector _appleLogo;

    public static final ImageVector getAppleLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _appleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AppleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(219.4f, 167.84f);
        pathBuilder.curveTo(201.71f, 155.69f, 198.0f, 135.12f, 198.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, -18.42f, 13.86f, -34.29f, 22.12f, -42.12f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.71f);
        pathBuilder.curveTo(208.0f, 57.7f, 187.07f, 50.0f, 168.0f, 50.0f);
        pathBuilder.arcToRelative(70.23f, 70.23f, 0.0f, false, false, -40.0f, 12.55f);
        pathBuilder.arcToRelative(69.6f, 69.6f, 0.0f, false, false, -89.31f, 8.08f);
        pathBuilder.arcTo(72.63f, 72.63f, 0.0f, false, false, 18.0f, 123.35f);
        pathBuilder.arcToRelative(125.11f, 125.11f, 0.0f, false, false, 39.53f, 88.33f);
        pathBuilder.arcTo(37.85f, 37.85f, 0.0f, false, false, 83.6f, 222.0f);
        pathBuilder.horizontalLineToRelative(87.7f);
        pathBuilder.arcTo(37.83f, 37.83f, 0.0f, false, false, 199.0f, 210.07f);
        pathBuilder.arcToRelative(122.6f, 122.6f, 0.0f, false, false, 17.54f, -24.2f);
        pathBuilder.curveToRelative(6.55f, -12.0f, 5.77f, -13.75f, 5.0f, -15.48f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 219.4f, 167.84f);
        pathBuilder.close();
        pathBuilder.moveTo(190.17f, 201.84f);
        pathBuilder.arcTo(25.82f, 25.82f, 0.0f, false, true, 171.3f, 210.0f);
        pathBuilder.lineTo(83.6f, 210.0f);
        pathBuilder.arcTo(25.85f, 25.85f, 0.0f, false, true, 65.78f, 203.0f);
        pathBuilder.arcTo(113.21f, 113.21f, 0.0f, false, true, 30.0f, 123.0f);
        pathBuilder.arcToRelative(60.55f, 60.55f, 0.0f, false, true, 17.21f, -44.0f);
        pathBuilder.arcTo(56.82f, 56.82f, 0.0f, false, true, 88.0f, 62.0f);
        pathBuilder.horizontalLineToRelative(0.81f);
        pathBuilder.arcToRelative(57.35f, 57.35f, 0.0f, false, true, 35.44f, 12.71f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.5f, 0.0f);
        pathBuilder.arcTo(57.39f, 57.39f, 0.0f, false, true, 168.0f, 62.0f);
        pathBuilder.curveToRelative(13.89f, 0.0f, 28.81f, 4.68f, 39.11f, 12.0f);
        pathBuilder.curveToRelative(-9.44f, 10.14f, -21.1f, 26.59f, -21.1f, 46.0f);
        pathBuilder.curveToRelative(0.0f, 23.78f, 7.81f, 42.6f, 22.66f, 54.77f);
        pathBuilder.arcTo(107.33f, 107.33f, 0.0f, false, true, 190.17f, 201.89f);
        pathBuilder.close();
        pathBuilder.moveTo(130.17f, 30.45f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, true, 167.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(1.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-1.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -25.18f, 19.5f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.62f, -3.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
