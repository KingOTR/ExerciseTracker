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

/* compiled from: Steamlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteamLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSteamLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steamLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteamlogoKt {
    private static ImageVector _steamLogo;

    public static final ImageVector getSteamLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _steamLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SteamLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(115.12f, 182.62f);
        pathBuilder.lineToRelative(61.21f, -49.93f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -45.0f, -45.0f);
        pathBuilder.lineTo(85.48f, 143.83f);
        pathBuilder.lineTo(40.68f, 99.0f);
        pathBuilder.arcToRelative(91.6f, 91.6f, 0.0f, true, true, -2.46f, 8.86f);
        pathBuilder.lineToRelative(42.23f, 42.23f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 34.67f, 32.51f);
        pathBuilder.close();
        pathBuilder.moveTo(124.03f, 109.22f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, false, 154.78f, 140.0f);
        pathBuilder.lineTo(124.0f, 165.09f);
        pathBuilder.curveToRelative(0.0f, -0.36f, 0.0f, -0.72f, 0.0f, -1.09f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.73f, 0.0f, -1.09f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 132.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 156.0f, 132.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 148.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 148.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steamLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
