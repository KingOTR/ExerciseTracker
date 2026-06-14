package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dribbblelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DribbbleLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDribbbleLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dribbbleLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DribbblelogoKt {
    private static ImageVector _dribbbleLogo;

    public static final ImageVector getDribbbleLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _dribbbleLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DribbbleLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(219.92f, 124.43f);
        pathBuilder.curveTo(216.0f, 124.15f, 212.0f, 124.0f, 208.0f, 124.0f);
        pathBuilder.arcToRelative(164.4f, 164.4f, 0.0f, false, false, -46.55f, 6.74f);
        pathBuilder.arcTo(163.48f, 163.48f, 0.0f, false, false, 146.61f, 97.0f);
        pathBuilder.curveToRelative(-0.49f, -0.82f, -1.0f, -1.64f, -1.5f, -2.46f);
        pathBuilder.arcTo(164.0f, 164.0f, 0.0f, false, false, 188.5f, 58.75f);
        pathBuilder.arcTo(91.8f, 91.8f, 0.0f, false, true, 219.92f, 124.43f);
        pathBuilder.close();
        pathBuilder.moveTo(182.25f, 53.75f);
        pathBuilder.arcToRelative(156.23f, 156.23f, 0.0f, false, true, -41.46f, 34.08f);
        pathBuilder.arcToRelative(165.0f, 165.0f, 0.0f, false, false, -46.3f, -45.51f);
        pathBuilder.arcToRelative(91.86f, 91.86f, 0.0f, false, true, 87.76f, 11.43f);
        pathBuilder.close();
        pathBuilder.moveTo(85.78f, 46.28f);
        pathBuilder.arcToRelative(157.0f, 157.0f, 0.0f, false, true, 47.9f, 45.34f);
        pathBuilder.arcTo(155.67f, 155.67f, 0.0f, false, true, 64.0f, 108.0f);
        pathBuilder.arcToRelative(157.47f, 157.47f, 0.0f, false, true, -25.33f, -2.0f);
        pathBuilder.arcTo(92.35f, 92.35f, 0.0f, false, true, 85.78f, 46.28f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 128.0f);
        pathBuilder.arcToRelative(92.34f, 92.34f, 0.0f, false, true, 1.1f, -14.2f);
        pathBuilder.arcTo(165.6f, 165.6f, 0.0f, false, false, 64.0f, 116.0f);
        pathBuilder.arcToRelative(163.6f, 163.6f, 0.0f, false, false, 74.05f, -17.62f);
        pathBuilder.curveToRelative(0.55f, 0.9f, 1.11f, 1.79f, 1.64f, 2.7f);
        pathBuilder.arcToRelative(155.15f, 155.15f, 0.0f, false, true, 14.14f, 32.11f);
        pathBuilder.arcToRelative(162.7f, 162.7f, 0.0f, false, false, -27.59f, 12.61f);
        pathBuilder.arcTo(164.94f, 164.94f, 0.0f, false, false, 70.0f, 199.36f);
        pathBuilder.arcTo(91.84f, 91.84f, 0.0f, false, true, 36.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.44f, 204.16f);
        pathBuilder.arcToRelative(157.08f, 157.08f, 0.0f, false, true, 53.8f, -51.43f);
        pathBuilder.arcTo(153.87f, 153.87f, 0.0f, false, true, 156.0f, 140.91f);
        pathBuilder.arcToRelative(156.32f, 156.32f, 0.0f, false, true, 4.9f, 38.78f);
        pathBuilder.arcToRelative(157.0f, 157.0f, 0.0f, false, true, -4.11f, 35.69f);
        pathBuilder.arcToRelative(91.94f, 91.94f, 0.0f, false, true, -80.37f, -11.22f);
        pathBuilder.close();
        pathBuilder.moveTo(165.74f, 211.9f);
        pathBuilder.arcToRelative(165.24f, 165.24f, 0.0f, false, false, 3.18f, -32.21f);
        pathBuilder.arcToRelative(164.26f, 164.26f, 0.0f, false, false, -5.28f, -41.26f);
        pathBuilder.arcTo(156.44f, 156.44f, 0.0f, false, true, 208.0f, 132.0f);
        pathBuilder.curveToRelative(4.0f, 0.0f, 7.94f, 0.15f, 11.88f, 0.45f);
        pathBuilder.arcTo(92.17f, 92.17f, 0.0f, false, true, 165.74f, 211.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dribbbleLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
