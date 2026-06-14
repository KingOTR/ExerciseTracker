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

/* compiled from: Toiletpaper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ToiletPaper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getToiletPaper", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_toiletPaper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToiletpaperKt {
    private static ImageVector _toiletPaper;

    public static final ImageVector getToiletPaper(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _toiletPaper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ToiletPaper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(72.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 120.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(112.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(100.0f, 168.86f);
        pathBuilder.curveToRelative(-7.9f, 21.4f, -21.0f, 35.14f, -36.0f, 35.14f);
        pathBuilder.curveToRelative(-24.67f, 0.0f, -44.0f, -36.9f, -44.0f, -84.0f);
        pathBuilder.reflectiveCurveTo(39.33f, 36.0f, 64.0f, 36.0f);
        pathBuilder.lineTo(192.0f, 36.0f);
        pathBuilder.curveTo(216.67f, 36.0f, 236.0f, 72.9f, 236.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 120.0f);
        pathBuilder.curveToRelative(0.0f, -41.2f, -16.49f, -76.0f, -36.0f, -76.0f);
        pathBuilder.reflectiveCurveTo(28.0f, 78.8f, 28.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(16.49f, 76.0f, 36.0f, 76.0f);
        pathBuilder.reflectiveCurveTo(100.0f, 161.2f, 100.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 208.0f);
        pathBuilder.lineTo(228.0f, 124.0f);
        pathBuilder.lineTo(208.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.lineTo(228.0f, 116.0f);
        pathBuilder.curveToRelative(-1.0f, -39.42f, -17.07f, -72.0f, -35.95f, -72.0f);
        pathBuilder.lineTo(83.05f, 44.0f);
        pathBuilder.curveToRelative(14.29f, 12.8f, 24.14f, 39.76f, 24.9f, 72.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f);
        pathBuilder.lineTo(108.0f, 124.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(224.0f, 212.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 116.0f);
        pathBuilder.lineTo(160.0f, 116.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _toiletPaper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
