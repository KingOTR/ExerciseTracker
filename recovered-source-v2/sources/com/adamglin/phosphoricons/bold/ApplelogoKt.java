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

/* compiled from: Applelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AppleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAppleLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_appleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplelogoKt {
    private static ImageVector _appleLogo;

    public static final ImageVector getAppleLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(227.0f, 168.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.21f, -5.09f);
        pathBuilder.curveTo(207.25f, 152.22f, 204.0f, 133.68f, 204.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, -16.17f, 12.68f, -30.6f, 20.25f, -37.76f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.43f);
        pathBuilder.curveTo(210.89f, 52.17f, 188.81f, 44.0f, 168.0f, 44.0f);
        pathBuilder.arcToRelative(76.29f, 76.29f, 0.0f, false, false, -40.0f, 11.37f);
        pathBuilder.arcToRelative(75.59f, 75.59f, 0.0f, false, false, -93.58f, 11.0f);
        pathBuilder.arcTo(78.64f, 78.64f, 0.0f, false, false, 12.0f, 123.51f);
        pathBuilder.arcTo(131.0f, 131.0f, 0.0f, false, false, 53.43f, 216.0f);
        pathBuilder.arcTo(43.81f, 43.81f, 0.0f, false, false, 83.6f, 228.0f);
        pathBuilder.horizontalLineToRelative(87.69f);
        pathBuilder.arcToRelative(43.87f, 43.87f, 0.0f, false, false, 32.05f, -13.85f);
        pathBuilder.arcToRelative(127.63f, 127.63f, 0.0f, false, false, 18.4f, -25.39f);
        pathBuilder.curveToRelative(1.57f, -2.88f, 3.0f, -5.71f, 4.14f, -8.41f);
        pathBuilder.curveTo(227.47f, 176.67f, 229.12f, 172.87f, 227.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.77f, 197.82f);
        pathBuilder.arcTo(19.78f, 19.78f, 0.0f, false, true, 171.29f, 204.0f);
        pathBuilder.lineTo(83.6f, 204.0f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, true, -13.7f, -5.42f);
        pathBuilder.arcTo(107.18f, 107.18f, 0.0f, false, true, 36.0f, 122.88f);
        pathBuilder.arcTo(54.49f, 54.49f, 0.0f, false, true, 51.5f, 83.28f);
        pathBuilder.arcTo(50.86f, 50.86f, 0.0f, false, true, 88.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(0.72f);
        pathBuilder.arcTo(51.5f, 51.5f, 0.0f, false, true, 120.48f, 79.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 15.0f, 0.0f);
        pathBuilder.arcTo(51.41f, 51.41f, 0.0f, false, true, 168.0f, 68.0f);
        pathBuilder.arcToRelative(67.24f, 67.24f, 0.0f, false, true, 29.88f, 7.4f);
        pathBuilder.curveTo(186.26f, 89.66f, 180.0f, 105.13f, 180.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, 23.33f, 7.47f, 42.89f, 21.25f, 56.19f);
        pathBuilder.arcTo(103.3f, 103.3f, 0.0f, false, true, 185.76f, 197.81f);
        pathBuilder.close();
        pathBuilder.moveTo(128.75f, 13.0f);
        pathBuilder.arcTo(43.83f, 43.83f, 0.0f, false, true, 142.17f, 1.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.64f, 21.0f);
        pathBuilder.arcToRelative(19.84f, 19.84f, 0.0f, false, false, -6.11f, 5.24f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.75f, 13.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _appleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
