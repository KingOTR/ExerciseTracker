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

/* compiled from: Solarroof.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SolarRoof", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSolarRoof", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_solarRoof", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SolarroofKt {
    private static ImageVector _solarRoof;

    public static final ImageVector getSolarRoof(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(247.16f, 124.42f);
        pathBuilder.lineToRelative(-40.0f, -80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 40.0f);
        pathBuilder.lineTo(56.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 4.42f);
        pathBuilder.lineToRelative(-40.0f, 80.0f);
        pathBuilder.arcTo(8.08f, 8.08f, 0.0f, false, false, 8.0f, 128.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(232.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(248.0f, 128.0f);
        pathBuilder.arcTo(8.08f, 8.08f, 0.0f, false, false, 247.16f, 124.42f);
        pathBuilder.close();
        pathBuilder.moveTo(99.06f, 56.0f);
        pathBuilder.lineToRelative(12.0f, 24.0f);
        pathBuilder.lineTo(80.94f, 80.0f);
        pathBuilder.lineToRelative(-12.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.06f, 56.0f);
        pathBuilder.lineTo(159.06f, 80.0f);
        pathBuilder.lineTo(128.94f, 80.0f);
        pathBuilder.lineToRelative(-12.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.94f, 120.0f);
        pathBuilder.lineTo(88.94f, 96.0f);
        pathBuilder.horizontalLineToRelative(30.12f);
        pathBuilder.lineToRelative(12.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.94f, 120.0f);
        pathBuilder.lineTo(136.94f, 96.0f);
        pathBuilder.horizontalLineToRelative(30.12f);
        pathBuilder.lineToRelative(12.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.94f, 120.0f);
        pathBuilder.lineTo(184.94f, 96.0f);
        pathBuilder.horizontalLineToRelative(30.12f);
        pathBuilder.lineToRelative(12.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.06f, 80.0f);
        pathBuilder.lineTo(176.94f, 80.0f);
        pathBuilder.lineToRelative(-12.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(30.12f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 184.0f);
        pathBuilder.lineTo(104.0f, 136.0f);
        pathBuilder.lineTo(232.0f, 136.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _solarRoof = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
