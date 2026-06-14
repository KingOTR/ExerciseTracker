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

/* compiled from: Solarpanel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SolarPanel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSolarPanel", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_solarPanel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SolarpanelKt {
    private static ImageVector _solarPanel;

    public static final ImageVector getSolarPanel(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _solarPanel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SolarPanel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(34.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(56.0f, 98.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 110.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 34.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.84f, 57.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, -8.48f);
        pathBuilder.lineTo(70.0f, 37.53f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 61.53f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.lineTo(134.0f, 16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.lineTo(122.0f, 32.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 38.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.91f, 59.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.25f, -1.76f);
        pathBuilder.lineTo(194.47f, 46.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 186.0f, 37.53f);
        pathBuilder.lineTo(174.67f, 48.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.24f, 10.24f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.lineTo(200.0f, 98.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 194.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, true, 68.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, -92.0f, 0.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 88.0f, 110.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.18f, 219.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.18f, 3.0f);
        pathBuilder.lineTo(24.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.22f, -8.95f);
        pathBuilder.lineToRelative(40.69f, -72.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 64.7f, 138.0f);
        pathBuilder.lineTo(191.3f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.23f, 3.05f);
        pathBuilder.lineToRelative(40.69f, 72.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 237.18f, 219.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.8f, 150.0f);
        pathBuilder.horizontalLineToRelative(-28.0f);
        pathBuilder.lineToRelative(4.35f, 20.0f);
        pathBuilder.horizontalLineToRelative(35.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.86f, 170.0f);
        pathBuilder.lineTo(147.51f, 150.0f);
        pathBuilder.horizontalLineToRelative(-39.0f);
        pathBuilder.lineToRelative(-4.35f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(101.53f, 182.0f);
        pathBuilder.lineTo(95.44f, 210.0f);
        pathBuilder.horizontalLineToRelative(65.12f);
        pathBuilder.lineToRelative(-6.09f, -28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.89f, 170.0f);
        pathBuilder.horizontalLineToRelative(35.0f);
        pathBuilder.lineToRelative(4.35f, -20.0f);
        pathBuilder.horizontalLineToRelative(-28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(34.28f, 210.0f);
        pathBuilder.lineTo(83.16f, 210.0f);
        pathBuilder.lineToRelative(6.09f, -28.0f);
        pathBuilder.lineTo(50.11f, 182.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.72f, 210.0f);
        pathBuilder.lineTo(205.89f, 182.0f);
        pathBuilder.lineTo(166.75f, 182.0f);
        pathBuilder.lineToRelative(6.09f, 28.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _solarPanel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
