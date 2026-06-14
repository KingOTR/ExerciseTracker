package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Highheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighHeel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getHighHeel", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highHeel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighheelKt {
    private static ImageVector _highHeel;

    public static final ImageVector getHighHeel(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _highHeel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HighHeel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(231.0f, 156.19f);
        pathBuilder.lineTo(180.0f, 144.7f);
        pathBuilder.lineTo(69.66f, 34.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.56f, 0.26f);
        pathBuilder.curveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(72.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(88.0f, 143.06f);
        pathBuilder.curveToRelative(2.49f, 1.45f, 4.94f, 3.0f, 7.34f, 4.64f);
        pathBuilder.arcToRelative(112.45f, 112.45f, 0.0f, false, true, 40.55f, 50.39f);
        pathBuilder.arcTo(15.9f, 15.9f, 0.0f, false, false, 150.72f, 208.0f);
        pathBuilder.lineTo(240.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-4.73f);
        pathBuilder.arcTo(31.72f, 31.72f, 0.0f, false, false, 231.0f, 156.19f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 192.0f);
        pathBuilder.lineTo(40.0f, 192.0f);
        pathBuilder.lineTo(40.0f, 128.29f);
        pathBuilder.arcToRelative(110.88f, 110.88f, 0.0f, false, true, 32.0f, 7.12f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 192.0f);
        pathBuilder.lineTo(150.68f, 192.0f);
        pathBuilder.arcToRelative(128.36f, 128.36f, 0.0f, false, false, -46.27f, -57.46f);
        pathBuilder.arcToRelative(126.9f, 126.9f, 0.0f, false, false, -64.12f, -22.26f);
        pathBuilder.arcTo(110.67f, 110.67f, 0.0f, false, true, 64.46f, 51.78f);
        pathBuilder.lineTo(170.34f, 157.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.9f, 2.14f);
        pathBuilder.lineToRelative(53.24f, 12.0f);
        pathBuilder.arcTo(15.81f, 15.81f, 0.0f, false, true, 240.0f, 187.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highHeel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
