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

/* compiled from: Filecpp.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileCpp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileCpp", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileCpp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilecppKt {
    private static ImageVector _fileCpp;

    public static final ImageVector getFileCpp(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileCpp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileCpp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(44.0f, 120.0f);
        pathBuilder.lineTo(212.0f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(216.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f);
        pathBuilder.lineTo(56.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 44.0f);
        pathBuilder.lineToRelative(44.0f, 44.0f);
        pathBuilder.lineTo(152.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 180.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f);
        pathBuilder.arcToRelative(14.07f, 14.07f, 0.0f, false, false, 10.07f, -4.51f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, true, 10.88f, -0.9f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.83f, 11.81f);
        pathBuilder.arcTo(30.06f, 30.06f, 0.0f, false, true, 64.0f, 216.0f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.39f, 9.2f);
        pathBuilder.arcToRelative(8.24f, 8.24f, 0.0f, false, true, 0.73f, 11.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f);
        pathBuilder.arcTo(14.18f, 14.18f, 0.0f, false, false, 64.0f, 160.0f);
        pathBuilder.curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 180.53f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, 7.47f);
        pathBuilder.lineTo(136.0f, 188.0f);
        pathBuilder.verticalLineToRelative(11.73f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(120.0f, 188.0f);
        pathBuilder.lineTo(108.27f, 188.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(120.02f, 160.27f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 180.53f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 180.53f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, 7.47f);
        pathBuilder.lineTo(204.0f, 188.0f);
        pathBuilder.verticalLineToRelative(11.73f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(188.0f, 188.0f);
        pathBuilder.lineTo(176.27f, 188.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.25f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.53f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(188.02f, 160.27f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 180.53f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileCpp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
