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

/* compiled from: Toiletpaper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ToiletPaper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getToiletPaper", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_toiletPaper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToiletpaperKt {
    private static ImageVector _toiletPaper;

    public static final ImageVector getToiletPaper(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(184.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(160.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 120.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(112.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(96.0f, 186.35f);
        pathBuilder.curveTo(87.37f, 200.37f, 76.18f, 208.0f, 64.0f, 208.0f);
        pathBuilder.curveToRelative(-13.87f, 0.0f, -26.46f, -9.89f, -35.44f, -27.85f);
        pathBuilder.curveTo(20.46f, 164.0f, 16.0f, 142.59f, 16.0f, 120.0f);
        pathBuilder.reflectiveCurveToRelative(4.46f, -43.95f, 12.56f, -60.15f);
        pathBuilder.curveTo(37.54f, 41.89f, 50.13f, 32.0f, 64.0f, 32.0f);
        pathBuilder.lineTo(192.0f, 32.0f);
        pathBuilder.curveToRelative(13.87f, 0.0f, 26.46f, 9.89f, 35.44f, 27.85f);
        pathBuilder.curveTo(235.54f, 76.05f, 240.0f, 97.41f, 240.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 120.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.lineTo(208.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(15.79f);
        pathBuilder.curveTo(221.84f, 73.9f, 206.16f, 48.0f, 192.0f, 48.0f);
        pathBuilder.lineTo(92.12f, 48.0f);
        pathBuilder.arcToRelative(73.6f, 73.6f, 0.0f, false, true, 7.32f, 11.85f);
        pathBuilder.curveToRelative(7.14f, 14.28f, 11.44f, 32.56f, 12.37f, 52.15f);
        pathBuilder.lineTo(128.0f, 112.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f);
        pathBuilder.lineTo(112.0f, 128.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.lineTo(224.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _toiletPaper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
