package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Solarpanel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SolarPanel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSolarPanel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_solarPanel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SolarpanelKt {
    private static ImageVector _solarPanel;

    public static final ImageVector getSolarPanel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(32.0f, 100.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 44.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.lineTo(44.0f, 112.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(140.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(65.77f, 54.74f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, -17.0f);
        pathBuilder.lineToRelative(-5.66f, -5.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(181.77f, 58.26f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.52f);
        pathBuilder.lineToRelative(5.65f, -5.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(-5.66f, 5.65f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 20.49f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 112.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, -104.0f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(242.36f, 222.05f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 228.0f);
        pathBuilder.lineTo(24.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.45f, -17.9f);
        pathBuilder.lineToRelative(43.0f, -76.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 67.0f, 128.0f);
        pathBuilder.lineTo(189.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.45f, 6.1f);
        pathBuilder.lineToRelative(43.0f, 76.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 242.36f, 222.05f);
        pathBuilder.close();
        pathBuilder.moveTo(182.0f, 152.0f);
        pathBuilder.lineTo(140.0f, 152.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(48.82f);
        pathBuilder.close();
        pathBuilder.moveTo(74.0f, 152.0f);
        pathBuilder.lineToRelative(-6.78f, 12.0f);
        pathBuilder.lineTo(116.0f, 164.0f);
        pathBuilder.lineTo(116.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(44.57f, 204.0f);
        pathBuilder.lineTo(116.0f, 204.0f);
        pathBuilder.lineTo(116.0f, 188.0f);
        pathBuilder.lineTo(53.61f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(211.43f, 204.0f);
        pathBuilder.lineTo(202.43f, 188.0f);
        pathBuilder.lineTo(140.0f, 188.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _solarPanel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
