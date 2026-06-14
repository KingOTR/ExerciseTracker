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

/* compiled from: Wind.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wind", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWind", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wind", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindKt {
    private static ImageVector _wind;

    public static final ImageVector getWind(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _wind;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wind", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 96.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 120.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 80.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 160.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 152.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(184.0f, 184.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder2.curveToRelative(-13.7f, 0.0f, -26.95f, -8.93f, -31.5f, -21.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.0f, -5.56f);
        pathBuilder2.curveTo(137.74f, 195.27f, 145.0f, 200.0f, 152.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f);
        pathBuilder2.lineTo(40.0f, 168.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder2.lineTo(152.0f, 152.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 184.0f, 184.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 104.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f);
        pathBuilder2.curveToRelative(-13.7f, 0.0f, -26.95f, 8.93f, -31.5f, 21.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, 5.56f);
        pathBuilder2.curveTo(105.74f, 60.73f, 113.0f, 56.0f, 120.0f, 56.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f);
        pathBuilder2.lineTo(24.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 72.0f);
        pathBuilder2.curveToRelative(-13.7f, 0.0f, -26.95f, 8.93f, -31.5f, 21.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, 5.56f);
        pathBuilder2.curveTo(193.74f, 92.73f, 201.0f, 88.0f, 208.0f, 88.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f);
        pathBuilder2.lineTo(32.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(208.0f, 136.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wind = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
