package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Steamlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SteamLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSteamLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_steamLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SteamlogoKt {
    private static ImageVector _steamLogo;

    public static final ImageVector getSteamLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.81f, 129.61f);
        pathBuilder.lineTo(112.72f, 179.43f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.15f, -28.15f);
        pathBuilder.lineToRelative(49.82f, -61.09f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 39.42f, 39.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(117.39f, 185.92f);
        pathBuilder2.lineToRelative(62.0f, -50.55f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -51.14f, -50.23f);
        pathBuilder2.lineToRelative(-43.0f, 52.73f);
        pathBuilder2.lineTo(45.28f, 98.0f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, true, true, 40.0f, 128.0f);
        pathBuilder2.arcToRelative(89.56f, 89.56f, 0.0f, false, true, 0.8f, -11.88f);
        pathBuilder2.lineToRelative(34.57f, 34.57f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 42.0f, 35.23f);
        pathBuilder2.close();
        pathBuilder2.moveTo(121.58f, 118.55f);
        pathBuilder2.arcToRelative(36.18f, 36.18f, 0.0f, false, false, 23.87f, 23.87f);
        pathBuilder2.lineToRelative(-18.26f, 14.89f);
        pathBuilder2.arcToRelative(28.11f, 28.11f, 0.0f, false, false, -20.5f, -20.5f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.0f, 128.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, false, true, 156.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(100.0f, 152.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 152.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _steamLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
