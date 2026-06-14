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

/* compiled from: Standarddefinition.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StandardDefinition", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getStandardDefinition", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_standardDefinition", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandarddefinitionKt {
    private static ImageVector _standardDefinition;

    public static final ImageVector getStandardDefinition(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(144.0f, 74.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(54.0f, 54.0f, 0.0f, false, false, 0.0f, -108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 128.0f);
        pathBuilder.arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f);
        pathBuilder.lineTo(150.0f, 170.0f);
        pathBuilder.lineTo(150.0f, 86.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.arcTo(42.0f, 42.0f, 0.0f, false, true, 210.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(26.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.lineTo(224.0f, 42.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f);
        pathBuilder.lineTo(32.0f, 54.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.0f, 208.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(32.0f, 214.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.lineTo(224.0f, 202.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, -11.21f, -10.7f, -15.1f, -28.33f, -20.18f);
        pathBuilder.curveToRelative(-15.89f, -4.58f, -33.89f, -9.77f, -33.89f, -27.82f);
        pathBuilder.curveToRelative(0.0f, -17.1f, 15.57f, -30.0f, 36.22f, -30.0f);
        pathBuilder.curveToRelative(15.0f, 0.0f, 27.74f, 6.88f, 33.34f, 18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.71f, 5.42f);
        pathBuilder.curveTo(99.08f, 90.36f, 90.41f, 86.0f, 80.0f, 86.0f);
        pathBuilder.curveToRelative(-13.81f, 0.0f, -24.22f, 7.74f, -24.22f, 18.0f);
        pathBuilder.curveToRelative(0.0f, 8.41f, 9.52f, 11.76f, 25.21f, 16.29f);
        pathBuilder.curveTo(97.48f, 125.0f, 118.0f, 131.0f, 118.0f, 152.0f);
        pathBuilder.curveToRelative(0.0f, 16.54f, -17.0f, 30.0f, -38.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-38.0f, -13.46f, -38.0f, -30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 9.76f, 11.91f, 18.0f, 26.0f, 18.0f);
        pathBuilder.reflectiveCurveTo(106.0f, 161.76f, 106.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _standardDefinition = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
