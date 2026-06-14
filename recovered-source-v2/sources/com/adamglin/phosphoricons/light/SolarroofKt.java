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

/* compiled from: Solarroof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SolarRoof", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSolarRoof", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_solarRoof", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SolarroofKt {
    private static ImageVector _solarRoof;

    public static final ImageVector getSolarRoof(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _solarRoof;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SolarRoof", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.37f, 125.32f);
        pathBuilder.lineToRelative(-40.0f, -80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 42.0f);
        pathBuilder.lineTo(56.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 3.32f);
        pathBuilder.lineToRelative(-40.0f, 80.0f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 10.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(232.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(246.0f, 128.0f);
        pathBuilder.arcTo(6.07f, 6.07f, 0.0f, false, false, 245.37f, 125.32f);
        pathBuilder.close();
        pathBuilder.moveTo(99.71f, 122.0f);
        pathBuilder.lineToRelative(-14.0f, -28.0f);
        pathBuilder.horizontalLineToRelative(34.58f);
        pathBuilder.lineToRelative(14.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.29f, 54.0f);
        pathBuilder.lineTo(114.29f, 82.0f);
        pathBuilder.lineTo(79.71f, 82.0f);
        pathBuilder.lineToRelative(-14.0f, -28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.29f, 54.0f);
        pathBuilder.lineTo(162.29f, 82.0f);
        pathBuilder.lineTo(127.71f, 82.0f);
        pathBuilder.lineToRelative(-14.0f, -28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.71f, 122.0f);
        pathBuilder.lineTo(133.71f, 94.0f);
        pathBuilder.horizontalLineToRelative(34.58f);
        pathBuilder.lineToRelative(14.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(195.71f, 122.0f);
        pathBuilder.lineTo(181.71f, 94.0f);
        pathBuilder.horizontalLineToRelative(34.58f);
        pathBuilder.lineToRelative(14.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.29f, 82.0f);
        pathBuilder.lineTo(175.71f, 82.0f);
        pathBuilder.lineToRelative(-14.0f, -28.0f);
        pathBuilder.horizontalLineToRelative(34.58f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 184.0f);
        pathBuilder.lineTo(22.0f, 129.42f);
        pathBuilder.lineToRelative(34.0f, -68.0f);
        pathBuilder.lineToRelative(34.0f, 68.0f);
        pathBuilder.lineTo(90.0f, 186.0f);
        pathBuilder.lineTo(24.0f, 186.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 186.0f);
        pathBuilder.lineTo(102.0f, 186.0f);
        pathBuilder.lineTo(102.0f, 134.0f);
        pathBuilder.lineTo(234.0f, 134.0f);
        pathBuilder.verticalLineToRelative(50.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 232.0f, 186.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _solarRoof = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
