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

/* compiled from: Lightbulb.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightbulb", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getLightbulb", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightbulb", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightbulbKt {
    private static ImageVector _lightbulb;

    public static final ImageVector getLightbulb(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _lightbulb;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lightbulb", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 232.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(88.0f, 236.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 104.0f);
        pathBuilder.arcToRelative(83.59f, 83.59f, 0.0f, false, true, -32.11f, 66.06f);
        pathBuilder.arcTo(20.2f, 20.2f, 0.0f, false, false, 172.0f, 186.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(96.0f, 204.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -7.76f, -15.81f);
        pathBuilder.arcTo(83.58f, 83.58f, 0.0f, false, true, 44.0f, 104.47f);
        pathBuilder.curveTo(43.75f, 59.0f, 80.52f, 21.09f, 126.0f, 20.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 86.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 104.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, false, -77.83f, -76.0f);
        pathBuilder.curveTo(85.0f, 29.0f, 51.77f, 63.27f, 52.0f, 104.43f);
        pathBuilder.arcToRelative(75.62f, 75.62f, 0.0f, false, false, 29.17f, 59.43f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 92.0f, 186.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.arcToRelative(28.14f, 28.14f, 0.0f, false, true, 10.94f, -22.2f);
        pathBuilder.arcTo(75.62f, 75.62f, 0.0f, false, false, 204.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(136.66f, 52.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, 7.88f);
        pathBuilder.curveTo(153.53f, 63.0f, 169.0f, 78.45f, 172.06f, 96.67f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 100.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, false, 0.67f, -0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.27f, -4.61f);
        pathBuilder.arcTo(53.51f, 53.51f, 0.0f, false, false, 136.66f, 52.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightbulb = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
