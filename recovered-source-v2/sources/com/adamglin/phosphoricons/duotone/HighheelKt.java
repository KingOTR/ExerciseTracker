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

/* compiled from: Highheel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HighHeel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHighHeel", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_highHeel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HighheelKt {
    private static ImageVector _highHeel;

    public static final ImageVector getHighHeel(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 187.31f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(150.72f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.42f, -4.92f);
        pathBuilder.curveTo(125.51f, 151.28f, 82.38f, 120.0f, 32.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, -31.0f, 12.59f, -58.78f, 32.0f, -80.0f);
        pathBuilder.lineTo(176.0f, 152.0f);
        pathBuilder.lineToRelative(53.21f, 12.0f);
        pathBuilder.arcTo(23.92f, 23.92f, 0.0f, false, true, 248.0f, 187.31f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(231.0f, 156.19f);
        pathBuilder2.lineTo(180.0f, 144.71f);
        pathBuilder2.lineTo(69.66f, 34.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.56f, 0.26f);
        pathBuilder2.curveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(72.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(88.0f, 143.06f);
        pathBuilder2.curveToRelative(2.49f, 1.45f, 4.94f, 3.0f, 7.34f, 4.64f);
        pathBuilder2.arcToRelative(112.45f, 112.45f, 0.0f, false, true, 40.55f, 50.39f);
        pathBuilder2.arcTo(15.9f, 15.9f, 0.0f, false, false, 150.72f, 208.0f);
        pathBuilder2.lineTo(240.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.verticalLineToRelative(-4.73f);
        pathBuilder2.arcTo(31.72f, 31.72f, 0.0f, false, false, 231.0f, 156.19f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 192.0f);
        pathBuilder2.lineTo(40.0f, 192.0f);
        pathBuilder2.lineTo(40.0f, 128.29f);
        pathBuilder2.arcToRelative(110.88f, 110.88f, 0.0f, false, true, 32.0f, 7.12f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 192.0f);
        pathBuilder2.lineTo(150.68f, 192.0f);
        pathBuilder2.arcToRelative(128.36f, 128.36f, 0.0f, false, false, -46.27f, -57.46f);
        pathBuilder2.arcToRelative(126.9f, 126.9f, 0.0f, false, false, -64.12f, -22.26f);
        pathBuilder2.arcTo(110.67f, 110.67f, 0.0f, false, true, 64.46f, 51.78f);
        pathBuilder2.lineTo(170.34f, 157.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.9f, 2.14f);
        pathBuilder2.lineToRelative(53.24f, 12.0f);
        pathBuilder2.arcTo(15.81f, 15.81f, 0.0f, false, true, 240.0f, 187.31f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _highHeel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
