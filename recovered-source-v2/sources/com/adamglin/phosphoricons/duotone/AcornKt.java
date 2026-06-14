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

/* compiled from: Acorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Acorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getAcorn", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_acorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AcornKt {
    private static ImageVector _acorn;

    public static final ImageVector getAcorn(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _acorn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Acorn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 112.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.curveToRelative(0.0f, 53.0f, -88.0f, 88.0f, -88.0f, 112.0f);
        pathBuilder.curveToRelative(0.0f, -24.0f, -88.0f, -59.0f, -88.0f, -112.0f);
        pathBuilder.verticalLineTo(112.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(232.0f, 104.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f);
        pathBuilder2.lineTo(136.0f, 48.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder2.lineTo(80.0f, 48.0f);
        pathBuilder2.arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.0f, 13.83f);
        pathBuilder2.lineTo(32.0f, 128.0f);
        pathBuilder2.curveToRelative(0.0f, 35.53f, 33.12f, 62.12f, 59.74f, 83.49f);
        pathBuilder2.curveTo(103.66f, 221.07f, 120.0f, 234.18f, 120.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -5.82f, 16.34f, -18.93f, 28.26f, -28.51f);
        pathBuilder2.curveTo(190.88f, 190.12f, 224.0f, 163.53f, 224.0f, 128.0f);
        pathBuilder2.lineTo(224.0f, 117.83f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(80.0f, 64.0f);
        pathBuilder2.horizontalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(40.06f, 40.06f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder2.lineTo(40.0f, 104.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 80.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(154.25f, 199.0f);
        pathBuilder2.curveToRelative(-10.62f, 8.52f, -20.0f, 16.0f, -26.25f, 23.37f);
        pathBuilder2.curveToRelative(-6.25f, -7.32f, -15.63f, -14.85f, -26.25f, -23.37f);
        pathBuilder2.curveTo(77.8f, 179.79f, 48.0f, 155.86f, 48.0f, 128.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.lineTo(208.0f, 120.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.curveTo(208.0f, 155.86f, 178.2f, 179.79f, 154.25f, 199.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _acorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
