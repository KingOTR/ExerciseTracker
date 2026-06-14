package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Steamlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteamLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSteamLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steamLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteamlogoKt {
    private static ImageVector _steamLogo;

    public static final ImageVector getSteamLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(231.92f, 132.11f);
        pathBuilder.curveToRelative(-2.09f, 54.0f, -45.83f, 97.72f, -99.81f, 99.81f);
        pathBuilder.arcTo(104.06f, 104.06f, 0.0f, false, true, 25.6f, 109.76f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.77f, -2.08f);
        pathBuilder.lineToRelative(43.0f, 43.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 42.42f, 34.92f);
        pathBuilder.lineToRelative(61.1f, -49.84f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -50.71f, -50.65f);
        pathBuilder.lineToRelative(-43.0f, 52.74f);
        pathBuilder.lineTo(35.0f, 87.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.76f, -4.6f);
        pathBuilder.arcToRelative(104.0f, 104.0f, 0.0f, false, true, 197.7f, 49.0f);
        pathBuilder.close();
        pathBuilder.moveTo(121.58f, 118.55f);
        pathBuilder.lineTo(90.77f, 156.33f);
        pathBuilder.arcTo(11.83f, 11.83f, 0.0f, false, false, 88.0f, 163.19f);
        pathBuilder.arcTo(12.19f, 12.19f, 0.0f, false, false, 99.85f, 176.0f);
        pathBuilder.arcToRelative(11.84f, 11.84f, 0.0f, false, false, 7.78f, -2.74f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineToRelative(37.78f, -30.81f);
        pathBuilder.arcTo(36.18f, 36.18f, 0.0f, false, true, 121.58f, 118.55f);
        pathBuilder.close();
        pathBuilder.moveTo(175.9f, 110.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, true, false, 158.0f, 127.9f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 175.9f, 110.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steamLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
