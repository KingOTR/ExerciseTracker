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

/* compiled from: Skull.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Skull", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSkull", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_skull", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SkullKt {
    private static ImageVector _skull;

    public static final ImageVector getSkull(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _skull;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Skull", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.curveToRelative(-53.0f, 0.0f, -96.0f, 41.19f, -96.0f, 92.0f);
        pathBuilder.curveToRelative(0.0f, 34.05f, 19.31f, 63.78f, 48.0f, 79.69f);
        pathBuilder.lineTo(80.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.lineTo(176.0f, 195.69f);
        pathBuilder.curveToRelative(28.69f, -15.91f, 48.0f, -45.64f, 48.0f, -79.69f);
        pathBuilder.curveTo(224.0f, 65.19f, 181.0f, 24.0f, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 152.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 152.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 164.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(92.0f, 104.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 92.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(92.0f, 144.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(164.0f, 104.0f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, false, 164.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(164.0f, 144.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 16.0f);
        pathBuilder2.curveTo(70.65f, 16.0f, 24.0f, 60.86f, 24.0f, 116.0f);
        pathBuilder2.curveToRelative(0.0f, 34.1f, 18.27f, 66.0f, 48.0f, 84.28f);
        pathBuilder2.lineTo(72.0f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(184.0f, 200.28f);
        pathBuilder2.curveTo(213.73f, 182.0f, 232.0f, 150.1f, 232.0f, 116.0f);
        pathBuilder2.curveTo(232.0f, 60.86f, 185.35f, 16.0f, 128.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(172.12f, 188.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.12f, 7.0f);
        pathBuilder2.lineTo(168.0f, 216.0f);
        pathBuilder2.lineTo(152.0f, 216.0f);
        pathBuilder2.lineTo(152.0f, 192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(120.0f, 216.0f);
        pathBuilder2.lineTo(120.0f, 192.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.lineTo(88.0f, 216.0f);
        pathBuilder2.lineTo(88.0f, 195.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.12f, -7.0f);
        pathBuilder2.curveTo(56.81f, 173.69f, 40.0f, 145.84f, 40.0f, 116.0f);
        pathBuilder2.curveToRelative(0.0f, -46.32f, 39.48f, -84.0f, 88.0f, -84.0f);
        pathBuilder2.reflectiveCurveToRelative(88.0f, 37.68f, 88.0f, 84.0f);
        pathBuilder2.curveTo(216.0f, 145.83f, 199.19f, 173.69f, 172.12f, 188.69f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _skull = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
