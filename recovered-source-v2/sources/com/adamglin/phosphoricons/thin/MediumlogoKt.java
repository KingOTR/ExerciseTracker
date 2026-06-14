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

/* compiled from: Mediumlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MediumLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMediumLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mediumLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediumlogoKt {
    private static ImageVector _mediumLogo;

    public static final ImageVector getMediumLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(72.0f, 68.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, false, 60.0f, 60.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 72.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 180.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 72.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 68.0f);
        pathBuilder.curveToRelative(-16.0f, 0.0f, -28.0f, 25.79f, -28.0f, 60.0f);
        pathBuilder.reflectiveCurveToRelative(12.0f, 60.0f, 28.0f, 60.0f);
        pathBuilder.reflectiveCurveToRelative(28.0f, -25.79f, 28.0f, -60.0f);
        pathBuilder.reflectiveCurveTo(200.0f, 68.0f, 184.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 180.0f);
        pathBuilder.curveToRelative(-9.46f, 0.0f, -20.0f, -21.36f, -20.0f, -52.0f);
        pathBuilder.reflectiveCurveToRelative(10.54f, -52.0f, 20.0f, -52.0f);
        pathBuilder.reflectiveCurveToRelative(20.0f, 21.36f, 20.0f, 52.0f);
        pathBuilder.reflectiveCurveTo(193.46f, 180.0f, 184.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 72.0f);
        pathBuilder.lineTo(244.0f, 184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mediumLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
