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

/* compiled from: Filepng.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FilePng", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFilePng", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_filePng", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilepngKt {
    private static ImageVector _filePng;

    public static final ImageVector getFilePng(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _filePng;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FilePng", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
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
        pathBuilder.moveTo(60.0f, 144.0f);
        pathBuilder.lineTo(44.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(55.72f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 43.47f, 216.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 52.0f, 208.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(7.4f);
        pathBuilder.curveToRelative(15.24f, 0.0f, 28.14f, -11.92f, 28.59f, -27.15f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 60.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(59.65f, 184.0f);
        pathBuilder.lineTo(52.0f, 184.0f);
        pathBuilder.lineTo(52.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 13.16f);
        pathBuilder.arcTo(12.25f, 12.25f, 0.0f, false, true, 59.65f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 200.87f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.26f, 5.57f);
        pathBuilder.arcTo(30.07f, 30.07f, 0.0f, false, true, 200.0f, 216.0f);
        pathBuilder.curveToRelative(-17.64f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(14.36f, -36.0f, 32.0f, -36.0f);
        pathBuilder.arcToRelative(29.36f, 29.36f, 0.0f, false, true, 16.09f, 4.86f);
        pathBuilder.arcToRelative(8.21f, 8.21f, 0.0f, false, true, 3.0f, 10.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.55f, 2.88f);
        pathBuilder.arcTo(13.21f, 13.21f, 0.0f, false, false, 200.0f, 160.0f);
        pathBuilder.curveToRelative(-8.82f, 0.0f, -16.0f, 9.0f, -16.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(7.18f, 20.0f, 16.0f, 20.0f);
        pathBuilder.arcToRelative(13.57f, 13.57f, 0.0f, false, false, 8.0f, -2.72f);
        pathBuilder.lineTo(208.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 8.25f, -7.47f);
        pathBuilder.lineTo(216.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 152.0f);
        pathBuilder.verticalLineToRelative(55.76f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, -4.12f, 7.24f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.39f, -2.35f);
        pathBuilder.lineTo(116.0f, 177.0f);
        pathBuilder.verticalLineToRelative(30.76f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, -7.47f, 8.26f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, -8.0f);
        pathBuilder.lineTo(100.0f, 152.31f);
        pathBuilder.arcToRelative(8.27f, 8.27f, 0.0f, false, true, 4.53f, -7.52f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 2.56f);
        pathBuilder.lineTo(140.0f, 183.0f);
        pathBuilder.lineTo(140.0f, 152.27f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, true, 7.47f, -8.25f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _filePng = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
