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

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _campfire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Campfire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.72f, 225.82f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.54f, 3.9f);
        pathBuilder.lineTo(128.0f, 202.3f);
        pathBuilder.lineTo(41.82f, 229.72f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -3.64f, -11.44f);
        pathBuilder.lineToRelative(70.0f, -22.28f);
        pathBuilder.lineToRelative(-70.0f, -22.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.64f, -11.44f);
        pathBuilder.lineTo(128.0f, 189.7f);
        pathBuilder.lineToRelative(86.18f, -27.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.64f, 11.44f);
        pathBuilder.lineToRelative(-70.0f, 22.28f);
        pathBuilder.lineToRelative(70.0f, 22.28f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 221.72f, 225.82f);
        pathBuilder.close();
        pathBuilder.moveTo(70.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -46.81f, 52.62f, -79.73f, 54.86f, -81.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.28f, 0.0f);
        pathBuilder.curveTo(133.38f, 28.27f, 186.0f, 61.19f, 186.0f, 108.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, false, true, -116.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 154.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, false, 18.0f, -18.0f);
        pathBuilder.curveToRelative(0.0f, -15.48f, -12.0f, -27.43f, -18.0f, -32.44f);
        pathBuilder.curveToRelative(-6.0f, 5.0f, -18.0f, 17.0f, -18.0f, 32.44f);
        pathBuilder.arcTo(18.0f, 18.0f, 0.0f, false, false, 128.0f, 154.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 108.0f);
        pathBuilder.arcToRelative(45.93f, 45.93f, 0.0f, false, false, 17.0f, 35.67f);
        pathBuilder.arcTo(29.87f, 29.87f, 0.0f, false, true, 98.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, -26.9f, 25.58f, -44.27f, 26.67f, -45.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.66f, 0.0f);
        pathBuilder.curveToRelative(1.09f, 0.72f, 26.67f, 18.09f, 26.67f, 45.0f);
        pathBuilder.arcToRelative(29.87f, 29.87f, 0.0f, false, true, -1.0f, 7.67f);
        pathBuilder.arcTo(45.93f, 45.93f, 0.0f, false, false, 174.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -34.06f, -35.15f, -61.22f, -46.0f, -68.78f);
        pathBuilder.curveTo(117.15f, 46.78f, 82.0f, 73.93f, 82.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
