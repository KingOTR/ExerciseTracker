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

/* compiled from: Scooter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Scooter", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getScooter", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_scooter", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScooterKt {
    private static ImageVector _scooter;

    public static final ImageVector getScooter(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _scooter;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Scooter", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(72.0f, 172.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 144.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 28.0f, 28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 212.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(212.0f, 136.0f);
        pathBuilder2.curveToRelative(-1.18f, 0.0f, -2.35f, 0.06f, -3.51f, 0.17f);
        pathBuilder2.lineToRelative(-32.9f, -98.7f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 32.0f);
        pathBuilder2.lineTo(136.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(26.23f);
        pathBuilder2.lineToRelative(17.44f, 52.31f);
        pathBuilder2.lineTo(124.21f, 168.0f);
        pathBuilder2.lineTo(79.77f, 168.0f);
        pathBuilder2.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -1.83f, 16.0f);
        pathBuilder2.lineTo(128.0f, 184.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.19f, -2.93f);
        pathBuilder2.lineToRelative(51.46f, -62.81f);
        pathBuilder2.lineToRelative(7.66f, 23.0f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, true, false, 212.0f, 136.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(44.0f, 192.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, false, true, 44.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(212.0f, 192.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder2.arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 192.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _scooter = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
