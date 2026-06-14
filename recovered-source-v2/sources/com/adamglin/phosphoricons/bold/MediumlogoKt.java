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

/* compiled from: Mediumlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MediumLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMediumLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_mediumLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MediumlogoKt {
    private static ImageVector _mediumLogo;

    public static final ImageVector getMediumLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(68.0f, 60.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, false, 68.0f, 68.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, false, 68.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 172.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 68.0f, 172.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 60.0f);
        pathBuilder.curveToRelative(-23.63f, 0.0f, -36.0f, 34.21f, -36.0f, 68.0f);
        pathBuilder.reflectiveCurveToRelative(12.37f, 68.0f, 36.0f, 68.0f);
        pathBuilder.reflectiveCurveToRelative(36.0f, -34.21f, 36.0f, -68.0f);
        pathBuilder.reflectiveCurveTo(207.63f, 60.0f, 184.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.0f, 171.87f);
        pathBuilder.curveToRelative(-3.74f, -2.16f, -12.0f, -17.09f, -12.0f, -43.87f);
        pathBuilder.reflectiveCurveToRelative(8.26f, -41.71f, 12.0f, -43.87f);
        pathBuilder.curveToRelative(3.74f, 2.16f, 12.0f, 17.09f, 12.0f, 43.87f);
        pathBuilder.reflectiveCurveTo(187.74f, 169.71f, 184.0f, 171.87f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 72.0f);
        pathBuilder.lineTo(256.0f, 184.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(232.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _mediumLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
