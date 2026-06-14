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

/* compiled from: Siren.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Siren", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSiren", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_siren", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SirenKt {
    private static ImageVector _siren;

    public static final ImageVector getSiren(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _siren;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Siren", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.0f, 16.0f);
        pathBuilder.lineTo(124.0f, 8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -1.17f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 200.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(53.17f, 42.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f);
        pathBuilder.close();
        pathBuilder.moveTo(136.66f, 76.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.32f, 7.9f);
        pathBuilder.curveTo(156.24f, 87.45f, 172.0f, 106.39f, 172.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.curveTo(180.0f, 102.53f, 161.37f, 80.2f, 136.66f, 76.05f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 176.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(40.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(28.0f, 176.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(44.0f, 128.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 84.0f, -84.0f);
        pathBuilder.horizontalLineToRelative(0.64f);
        pathBuilder.curveToRelative(46.0f, 0.34f, 83.36f, 38.47f, 83.36f, 85.0f);
        pathBuilder.verticalLineToRelative(35.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 164.0f);
        pathBuilder.lineTo(204.0f, 164.0f);
        pathBuilder.lineTo(204.0f, 129.0f);
        pathBuilder.curveToRelative(0.0f, -42.15f, -33.83f, -76.69f, -75.42f, -77.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 52.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(40.0f, 172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(216.0f, 204.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _siren = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
