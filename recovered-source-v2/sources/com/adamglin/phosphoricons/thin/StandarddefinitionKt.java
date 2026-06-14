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

/* compiled from: Standarddefinition.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StandardDefinition", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getStandardDefinition", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_standardDefinition", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandarddefinitionKt {
    private static ImageVector _standardDefinition;

    public static final ImageVector getStandardDefinition(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _standardDefinition;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("StandardDefinition", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(144.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 128.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f);
        pathBuilder.lineTo(148.0f, 172.0f);
        pathBuilder.lineTo(148.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 212.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(224.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(32.0f, 52.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 208.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(32.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(224.0f, 204.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -12.58f, -11.79f, -16.92f, -29.78f, -22.11f);
        pathBuilder.curveTo(63.0f, 125.51f, 45.78f, 120.54f, 45.78f, 104.0f);
        pathBuilder.curveToRelative(0.0f, -16.0f, 14.71f, -28.0f, 34.22f, -28.0f);
        pathBuilder.curveToRelative(14.21f, 0.0f, 26.3f, 6.46f, 31.55f, 16.85f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.13f, 3.61f);
        pathBuilder.curveTo(100.53f, 88.78f, 91.17f, 84.0f, 80.0f, 84.0f);
        pathBuilder.curveToRelative(-15.0f, 0.0f, -26.22f, 8.6f, -26.22f, 20.0f);
        pathBuilder.curveToRelative(0.0f, 9.81f, 10.07f, 13.43f, 26.66f, 18.21f);
        pathBuilder.reflectiveCurveTo(116.0f, 132.46f, 116.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 15.44f, -16.15f, 28.0f, -36.0f, 28.0f);
        pathBuilder.reflectiveCurveToRelative(-36.0f, -12.56f, -36.0f, -28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 12.56f, 20.0f, 28.0f, 20.0f);
        pathBuilder.reflectiveCurveTo(108.0f, 163.0f, 108.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _standardDefinition = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
