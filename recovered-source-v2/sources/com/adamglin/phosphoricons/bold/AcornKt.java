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

/* compiled from: Acorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Acorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getAcorn", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_acorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AcornKt {
    private static ImageVector _acorn;

    public static final ImageVector getAcorn(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(236.0f, 104.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f);
        pathBuilder.lineTo(140.4f, 44.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 160.0f, 28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.arcToRelative(44.06f, 44.06f, 0.0f, false, false, -43.81f, 40.0f);
        pathBuilder.lineTo(80.0f, 44.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.0f, 16.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.curveToRelative(0.0f, 37.45f, 34.0f, 64.71f, 61.23f, 86.61f);
        pathBuilder.curveToRelative(10.22f, 8.2f, 25.63f, 20.58f, 26.77f, 25.56f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.curveToRelative(1.14f, -5.0f, 16.55f, -17.36f, 26.77f, -25.56f);
        pathBuilder.curveTo(194.05f, 192.71f, 228.0f, 165.45f, 228.0f, 128.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(36.06f, 36.06f, 0.0f, false, true, 35.78f, 32.0f);
        pathBuilder.lineTo(44.22f, 100.0f);
        pathBuilder.arcTo(36.06f, 36.06f, 0.0f, false, true, 80.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(151.74f, 195.9f);
        pathBuilder.curveToRelative(-9.17f, 7.36f, -17.46f, 14.0f, -23.74f, 20.55f);
        pathBuilder.curveToRelative(-6.28f, -6.53f, -14.57f, -13.19f, -23.74f, -20.55f);
        pathBuilder.curveTo(81.0f, 177.2f, 52.0f, 153.94f, 52.0f, 128.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(204.0f, 124.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.curveTo(204.0f, 153.94f, 175.0f, 177.2f, 151.74f, 195.9f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _acorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
