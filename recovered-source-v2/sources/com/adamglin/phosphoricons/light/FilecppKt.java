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

/* compiled from: Filecpp.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileCpp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFileCpp", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileCpp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilecppKt {
    private static ImageVector _fileCpp;

    public static final ImageVector getFileCpp(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(46.0f, 180.0f);
        pathBuilder.curveToRelative(0.0f, 12.13f, 8.07f, 22.0f, 18.0f, 22.0f);
        pathBuilder.arcToRelative(16.23f, 16.23f, 0.0f, false, false, 11.67f, -5.28f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.66f, 8.3f);
        pathBuilder.arcTo(28.06f, 28.06f, 0.0f, false, true, 64.0f, 214.0f);
        pathBuilder.curveToRelative(-16.54f, 0.0f, -30.0f, -15.25f, -30.0f, -34.0f);
        pathBuilder.reflectiveCurveToRelative(13.46f, -34.0f, 30.0f, -34.0f);
        pathBuilder.arcToRelative(28.06f, 28.06f, 0.0f, false, true, 20.33f, 9.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.66f, 8.3f);
        pathBuilder.arcTo(16.23f, 16.23f, 0.0f, false, false, 64.0f, 158.0f);
        pathBuilder.curveTo(54.07f, 158.0f, 46.0f, 167.87f, 46.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(42.0f, 112.0f);
        pathBuilder.lineTo(42.0f, 40.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 26.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.25f, 1.76f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 214.0f, 88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.lineTo(202.0f, 94.0f);
        pathBuilder.lineTo(152.0f, 94.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f);
        pathBuilder.lineTo(146.0f, 38.0f);
        pathBuilder.lineTo(56.0f, 38.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 82.0f);
        pathBuilder.horizontalLineToRelative(35.52f);
        pathBuilder.lineTo(158.0f, 46.48f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 174.0f);
        pathBuilder.lineTo(134.0f, 174.0f);
        pathBuilder.lineTo(134.0f, 160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.lineTo(108.0f, 174.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(134.0f, 186.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 174.0f);
        pathBuilder.lineTo(202.0f, 174.0f);
        pathBuilder.lineTo(202.0f, 160.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.lineTo(176.0f, 174.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(202.0f, 186.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileCpp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
