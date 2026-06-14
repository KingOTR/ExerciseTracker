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

/* compiled from: Cablecar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CableCar", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCableCar", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cableCar", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CablecarKt {
    private static ImageVector _cableCar;

    public static final ImageVector getCableCar(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cableCar;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CableCar", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(243.94f, 31.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.64f, -3.24f);
        pathBuilder.lineToRelative(-224.0f, 40.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 76.0f);
        pathBuilder.arcToRelative(4.14f, 4.14f, 0.0f, false, false, 0.7f, -0.06f);
        pathBuilder.lineTo(124.0f, 56.78f);
        pathBuilder.lineTo(124.0f, 100.0f);
        pathBuilder.lineTo(64.0f, 100.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, 28.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f);
        pathBuilder.lineTo(192.0f, 220.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f);
        pathBuilder.lineTo(220.0f, 128.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f);
        pathBuilder.lineTo(132.0f, 100.0f);
        pathBuilder.lineTo(132.0f, 55.35f);
        pathBuilder.lineTo(240.7f, 35.94f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 243.94f, 31.3f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 164.0f);
        pathBuilder.lineTo(100.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 108.0f);
        pathBuilder.lineTo(92.0f, 108.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(44.0f, 164.0f);
        pathBuilder.lineTo(44.0f, 128.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 212.0f);
        pathBuilder.lineTo(64.0f, 212.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(44.0f, 172.0f);
        pathBuilder.lineTo(212.0f, 172.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 212.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.lineTo(164.0f, 164.0f);
        pathBuilder.lineTo(164.0f, 108.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cableCar = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
