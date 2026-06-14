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

/* compiled from: Bellsimpleringing.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleRinging", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBellSimpleRinging", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleRinging", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimpleringingKt {
    private static ImageVector _bellSimpleRinging;

    public static final ImageVector getBellSimpleRinging(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _bellSimpleRinging;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSimpleRinging", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(165.92f, 224.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(-64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 165.92f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(225.61f, 61.23f);
        pathBuilder.arcToRelative(109.23f, 109.23f, 0.0f, false, false, -38.41f, -42.3f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, 10.14f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 215.0f, 66.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.65f, -5.53f);
        pathBuilder.close();
        pathBuilder.moveTo(41.0f, 66.76f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 75.2f, 29.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, -10.14f);
        pathBuilder.arcToRelative(109.23f, 109.23f, 0.0f, false, false, -38.41f, 42.3f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 41.0f, 66.76f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 176.93f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 208.0f, 198.0f);
        pathBuilder.lineTo(48.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, true, -12.06f, -21.0f);
        pathBuilder.curveTo(45.13f, 161.08f, 50.0f, 138.62f, 50.0f, 112.0f);
        pathBuilder.arcToRelative(78.0f, 78.0f, 0.0f, false, true, 156.0f, 0.0f);
        pathBuilder.curveTo(206.0f, 139.0f, 210.74f, 160.84f, 220.08f, 176.93f);
        pathBuilder.close();
        pathBuilder.moveTo(209.63f, 182.93f);
        pathBuilder.curveTo(199.29f, 165.0f, 194.0f, 141.14f, 194.0f, 112.0f);
        pathBuilder.arcToRelative(66.0f, 66.0f, 0.0f, false, false, -132.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 29.16f, -5.29f, 53.0f, -15.71f, 71.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, 1.0f);
        pathBuilder.lineTo(208.0f, 186.0f);
        pathBuilder.arcToRelative(1.9f, 1.9f, 0.0f, false, false, 1.7f, -1.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, false, 209.71f, 183.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleRinging = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
