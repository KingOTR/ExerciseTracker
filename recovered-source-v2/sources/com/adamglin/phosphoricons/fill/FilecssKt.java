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

/* compiled from: Filecss.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileCss", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFileCss", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileCss", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilecssKt {
    private static ImageVector _fileCss;

    public static final ImageVector getFileCss(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fileCss;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileCss", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(48.0f, 180.0f);
        pathBuilder.curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f);
        pathBuilder.arcToRelative(14.18f, 14.18f, 0.0f, false, false, 10.06f, -4.5f);
        pathBuilder.arcToRelative(8.2f, 8.2f, 0.0f, false, true, 10.9f, -0.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.81f, 11.81f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, true, 64.0f, 216.0f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f);
        pathBuilder.reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.38f, 9.19f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 0.74f, 11.09f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f);
        pathBuilder.arcTo(14.2f, 14.2f, 0.0f, false, false, 64.0f, 160.0f);
        pathBuilder.curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.6f, 171.31f);
        pathBuilder.curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f);
        pathBuilder.curveToRelative(-1.26f, -0.81f, -1.23f, -1.0f, -1.12f, -1.9f);
        pathBuilder.arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f);
        pathBuilder.curveToRelative(4.6f, -3.12f, 15.35f, -1.73f, 19.83f, -0.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.07f, -15.48f);
        pathBuilder.curveToRelative(-2.12f, -0.55f, -21.0f, -5.22f, -32.83f, 2.76f);
        pathBuilder.arcToRelative(20.55f, 20.55f, 0.0f, false, false, -9.0f, 14.95f);
        pathBuilder.curveToRelative(-2.0f, 15.88f, 13.64f, 20.41f, 23.0f, 23.11f);
        pathBuilder.curveToRelative(12.07f, 3.49f, 13.13f, 4.92f, 12.78f, 7.59f);
        pathBuilder.curveToRelative(-0.31f, 2.41f, -1.26f, 3.34f, -2.14f, 3.93f);
        pathBuilder.curveToRelative(-4.6f, 3.06f, -15.17f, 1.56f, -19.55f, 0.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.3f, 15.41f);
        pathBuilder.arcToRelative(61.23f, 61.23f, 0.0f, false, false, 15.18f, 2.0f);
        pathBuilder.curveToRelative(5.83f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f);
        pathBuilder.arcToRelative(20.82f, 20.82f, 0.0f, false, false, 9.19f, -15.23f);
        pathBuilder.curveTo(154.0f, 179.0f, 137.48f, 174.17f, 127.6f, 171.31f);
        pathBuilder.close();
        pathBuilder.moveTo(191.6f, 171.31f);
        pathBuilder.curveToRelative(-4.0f, -1.16f, -8.14f, -2.35f, -10.45f, -3.84f);
        pathBuilder.curveToRelative(-1.25f, -0.81f, -1.23f, -1.0f, -1.12f, -1.9f);
        pathBuilder.arcToRelative(4.54f, 4.54f, 0.0f, false, true, 2.0f, -3.67f);
        pathBuilder.curveToRelative(4.6f, -3.12f, 15.34f, -1.73f, 19.82f, -0.56f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.07f, -15.48f);
        pathBuilder.curveToRelative(-2.11f, -0.55f, -21.0f, -5.22f, -32.83f, 2.76f);
        pathBuilder.arcToRelative(20.58f, 20.58f, 0.0f, false, false, -8.95f, 14.95f);
        pathBuilder.curveToRelative(-2.0f, 15.88f, 13.65f, 20.41f, 23.0f, 23.11f);
        pathBuilder.curveToRelative(12.06f, 3.49f, 13.12f, 4.92f, 12.78f, 7.59f);
        pathBuilder.curveToRelative(-0.31f, 2.41f, -1.26f, 3.34f, -2.15f, 3.93f);
        pathBuilder.curveToRelative(-4.6f, 3.06f, -15.16f, 1.56f, -19.54f, 0.36f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 173.93f, 214.0f);
        pathBuilder.arcToRelative(61.34f, 61.34f, 0.0f, false, false, 15.19f, 2.0f);
        pathBuilder.curveToRelative(5.82f, 0.0f, 12.3f, -1.0f, 17.49f, -4.46f);
        pathBuilder.arcToRelative(20.81f, 20.81f, 0.0f, false, false, 9.18f, -15.23f);
        pathBuilder.curveTo(218.0f, 179.0f, 201.48f, 174.17f, 191.59f, 171.31f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 116.0f);
        pathBuilder.lineTo(40.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(44.0f, 120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 40.0f, 116.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 88.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.lineTo(152.0f, 44.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileCss = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
