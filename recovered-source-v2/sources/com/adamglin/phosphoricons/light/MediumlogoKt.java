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

/* compiled from: Mediumlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MediumLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMediumLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mediumLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediumlogoKt {
    private static ImageVector _mediumLogo;

    public static final ImageVector getMediumLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _mediumLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MediumLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(72.0f, 66.0f);
        pathBuilder.arcToRelative(62.0f, 62.0f, 0.0f, true, false, 62.0f, 62.0f);
        pathBuilder.arcTo(62.07f, 62.07f, 0.0f, false, false, 72.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 178.0f);
        pathBuilder.arcToRelative(50.0f, 50.0f, 0.0f, true, true, 50.0f, -50.0f);
        pathBuilder.arcTo(50.06f, 50.06f, 0.0f, false, true, 72.0f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 66.0f);
        pathBuilder.curveToRelative(-17.1f, 0.0f, -30.0f, 26.65f, -30.0f, 62.0f);
        pathBuilder.reflectiveCurveToRelative(12.9f, 62.0f, 30.0f, 62.0f);
        pathBuilder.reflectiveCurveToRelative(30.0f, -26.65f, 30.0f, -62.0f);
        pathBuilder.reflectiveCurveTo(201.1f, 66.0f, 184.0f, 66.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 178.0f);
        pathBuilder.curveToRelative(-7.34f, 0.0f, -18.0f, -19.48f, -18.0f, -50.0f);
        pathBuilder.reflectiveCurveToRelative(10.66f, -50.0f, 18.0f, -50.0f);
        pathBuilder.reflectiveCurveToRelative(18.0f, 19.48f, 18.0f, 50.0f);
        pathBuilder.reflectiveCurveTo(191.34f, 178.0f, 184.0f, 178.0f);
        pathBuilder.close();
        pathBuilder.moveTo(246.0f, 72.0f);
        pathBuilder.lineTo(246.0f, 184.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(234.0f, 72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mediumLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
