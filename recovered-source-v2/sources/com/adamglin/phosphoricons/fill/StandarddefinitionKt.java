package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Standarddefinition.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"StandardDefinition", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getStandardDefinition", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_standardDefinition", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StandarddefinitionKt {
    private static ImageVector _standardDefinition;

    public static final ImageVector getStandardDefinition(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 128.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.lineTo(152.0f, 96.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 56.0f);
        pathBuilder.lineTo(232.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(24.0f, 56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.lineTo(216.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 148.0f);
        pathBuilder.curveToRelative(0.0f, -19.88f, -19.92f, -25.35f, -34.47f, -29.34f);
        pathBuilder.curveToRelative(-12.06f, -3.31f, -20.0f, -5.84f, -20.0f, -10.66f);
        pathBuilder.curveToRelative(0.0f, -6.73f, 8.1f, -12.0f, 18.44f, -12.0f);
        pathBuilder.curveToRelative(8.0f, 0.0f, 14.85f, 3.13f, 17.42f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.13f, -7.51f);
        pathBuilder.curveTo(110.16f, 86.31f, 98.07f, 80.0f, 84.0f, 80.0f);
        pathBuilder.curveToRelative(-19.64f, 0.0f, -34.44f, 12.0f, -34.44f, 28.0f);
        pathBuilder.curveToRelative(0.0f, 17.38f, 17.6f, 22.21f, 31.74f, 26.09f);
        pathBuilder.curveToRelative(16.0f, 4.39f, 22.7f, 7.3f, 22.7f, 13.91f);
        pathBuilder.curveToRelative(0.0f, 5.68f, -8.21f, 12.0f, -20.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(-20.0f, -6.32f, -20.0f, -12.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 15.7f, 15.81f, 28.0f, 36.0f, 28.0f);
        pathBuilder.reflectiveCurveTo(120.0f, 163.7f, 120.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, false, -48.0f, -48.0f);
        pathBuilder.lineTo(144.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, false, 208.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _standardDefinition = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
