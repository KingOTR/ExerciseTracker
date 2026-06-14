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

/* compiled from: Filedoc.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileDoc", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileDoc", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileDoc", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiledocKt {
    private static ImageVector _fileDoc;

    public static final ImageVector getFileDoc(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileDoc;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileDoc", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(44.0f, 120.0f);
        pathBuilder.lineTo(212.07f, 120.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(216.07f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.05f, 24.0f);
        pathBuilder.lineTo(56.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 44.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 44.0f);
        pathBuilder.lineTo(196.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(-44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 144.0f);
        pathBuilder.lineTo(36.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.lineTo(51.33f, 216.0f);
        pathBuilder.curveTo(71.0f, 216.0f, 87.55f, 200.52f, 88.0f, 180.87f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(51.51f, 200.0f);
        pathBuilder.lineTo(44.0f, 200.0f);
        pathBuilder.lineTo(44.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.77f);
        pathBuilder.curveTo(71.59f, 191.59f, 62.35f, 200.0f, 51.52f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(222.18f, 195.72f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, -0.73f, 11.09f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, -21.4f, 9.19f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(14.36f, -36.0f, 32.0f, -36.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.4f, 9.19f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 0.73f, 11.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f);
        pathBuilder.arcTo(14.21f, 14.21f, 0.0f, false, false, 200.06f, 160.0f);
        pathBuilder.curveToRelative(-8.82f, 0.0f, -16.0f, 9.0f, -16.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(7.18f, 20.0f, 16.0f, 20.0f);
        pathBuilder.arcToRelative(14.25f, 14.25f, 0.0f, false, false, 10.23f, -4.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 222.19f, 195.72f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 144.0f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, 16.15f, -32.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(14.37f, 36.0f, 32.0f, 36.0f);
        pathBuilder.reflectiveCurveToRelative(32.0f, -16.15f, 32.0f, -36.0f);
        pathBuilder.reflectiveCurveTo(145.69f, 144.0f, 128.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.curveToRelative(-8.83f, 0.0f, -16.0f, -9.0f, -16.0f, -20.0f);
        pathBuilder.reflectiveCurveToRelative(7.18f, -20.0f, 16.0f, -20.0f);
        pathBuilder.reflectiveCurveToRelative(16.0f, 9.0f, 16.0f, 20.0f);
        pathBuilder.reflectiveCurveTo(136.86f, 200.0f, 128.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileDoc = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
