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

/* compiled from: Acorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Acorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAcorn", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_acorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AcornKt {
    private static ImageVector _acorn;

    public static final ImageVector getAcorn(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(228.0f, 104.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f);
        pathBuilder.lineTo(132.0f, 52.0f);
        pathBuilder.lineTo(132.0f, 48.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.lineTo(80.0f, 52.0f);
        pathBuilder.arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, 11.3f);
        pathBuilder.lineTo(36.0f, 128.0f);
        pathBuilder.curveToRelative(0.0f, 33.61f, 32.29f, 59.54f, 58.24f, 80.37f);
        pathBuilder.curveTo(109.54f, 220.66f, 124.0f, 232.27f, 124.0f, 240.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -7.73f, 14.46f, -19.34f, 29.76f, -31.63f);
        pathBuilder.curveTo(187.71f, 187.54f, 220.0f, 161.61f, 220.0f, 128.0f);
        pathBuilder.lineTo(220.0f, 115.3f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.75f, 202.13f);
        pathBuilder.curveToRelative(-12.51f, 10.05f, -23.23f, 18.65f, -28.75f, 26.79f);
        pathBuilder.curveToRelative(-5.52f, -8.14f, -16.24f, -16.74f, -28.75f, -26.79f);
        pathBuilder.curveTo(74.63f, 182.37f, 44.0f, 157.78f, 44.0f, 128.0f);
        pathBuilder.lineTo(44.0f, 116.0f);
        pathBuilder.lineTo(212.0f, 116.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.curveTo(212.0f, 157.78f, 181.37f, 182.37f, 156.75f, 202.13f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 108.0f);
        pathBuilder.lineTo(40.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 80.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _acorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
