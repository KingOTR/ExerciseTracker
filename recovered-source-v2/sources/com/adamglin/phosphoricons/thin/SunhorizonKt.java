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

/* compiled from: Sunhorizon.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SunHorizon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSunHorizon", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sunHorizon", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SunhorizonKt {
    private static ImageVector _sunHorizon;

    public static final ImageVector getSunHorizon(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _sunHorizon;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SunHorizon", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 156.0f);
        pathBuilder.lineTo(194.94f, 156.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, true, false, 60.0f, 144.0f);
        pathBuilder.arcToRelative(68.73f, 68.73f, 0.0f, false, false, 1.06f, 12.0f);
        pathBuilder.lineTo(16.0f, 156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(240.0f, 164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 144.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, 118.79f, 12.0f);
        pathBuilder.lineTo(69.21f, 156.0f);
        pathBuilder.arcTo(60.16f, 60.16f, 0.0f, false, true, 68.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(48.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(208.0f, 196.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.42f, 41.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.16f, -3.58f);
        pathBuilder.lineToRelative(8.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.16f, 3.58f);
        pathBuilder.close();
        pathBuilder.moveTo(20.42f, 94.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.37f, -1.79f);
        pathBuilder.lineToRelative(16.0f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 7.16f);
        pathBuilder.lineToRelative(-16.0f, -8.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 20.42f, 94.21f);
        pathBuilder.close();
        pathBuilder.moveTo(212.42f, 105.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.79f, -5.37f);
        pathBuilder.lineToRelative(16.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 3.58f, 7.16f);
        pathBuilder.lineToRelative(-16.0f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.37f, -1.79f);
        pathBuilder.close();
        pathBuilder.moveTo(164.42f, 54.21f);
        pathBuilder.lineTo(172.42f, 38.21f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f);
        pathBuilder.lineToRelative(-8.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.16f, -3.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sunHorizon = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
