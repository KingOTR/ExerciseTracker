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

/* compiled from: Lego.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lego", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getLego", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lego", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegoKt {
    private static ImageVector _lego;

    public static final ImageVector getLego(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _lego;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lego", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(242.68f, 74.63f);
        pathBuilder.lineTo(195.85f, 51.22f);
        pathBuilder.curveTo(190.69f, 41.09f, 176.78f, 34.0f, 160.0f, 34.0f);
        pathBuilder.curveToRelative(-21.31f, 0.0f, -38.0f, 11.42f, -38.0f, 26.0f);
        pathBuilder.arcToRelative(19.06f, 19.06f, 0.0f, false, false, 1.56f, 7.51f);
        pathBuilder.lineToRelative(-22.0f, 11.0f);
        pathBuilder.arcTo(51.47f, 51.47f, 0.0f, false, false, 80.0f, 74.0f);
        pathBuilder.curveToRelative(-21.31f, 0.0f, -38.0f, 11.42f, -38.0f, 26.0f);
        pathBuilder.arcToRelative(19.06f, 19.06f, 0.0f, false, false, 1.56f, 7.51f);
        pathBuilder.lineTo(13.32f, 122.63f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 128.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.32f, 5.37f);
        pathBuilder.lineToRelative(64.0f, 32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 0.0f);
        pathBuilder.lineToRelative(160.0f, -80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 246.0f, 144.0f);
        pathBuilder.lineTo(246.0f, 80.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 242.68f, 74.63f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 153.29f);
        pathBuilder.lineTo(29.42f, 128.0f);
        pathBuilder.lineToRelative(21.77f, -10.88f);
        pathBuilder.curveTo(58.1f, 122.59f, 68.36f, 126.0f, 80.0f, 126.0f);
        pathBuilder.curveToRelative(21.31f, 0.0f, 38.0f, -11.42f, 38.0f, -26.0f);
        pathBuilder.arcToRelative(20.4f, 20.4f, 0.0f, false, false, -5.43f, -13.58f);
        pathBuilder.lineToRelative(18.62f, -9.3f);
        pathBuilder.curveTo(138.1f, 82.59f, 148.36f, 86.0f, 160.0f, 86.0f);
        pathBuilder.curveToRelative(18.63f, 0.0f, 33.74f, -8.73f, 37.23f, -20.67f);
        pathBuilder.lineTo(226.58f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 46.0f);
        pathBuilder.curveToRelative(15.32f, 0.0f, 26.0f, 7.38f, 26.0f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(-10.68f, 14.0f, -26.0f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(-26.0f, -7.38f, -26.0f, -14.0f);
        pathBuilder.reflectiveCurveTo(144.68f, 46.0f, 160.0f, 46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 86.0f);
        pathBuilder.curveToRelative(15.32f, 0.0f, 26.0f, 7.38f, 26.0f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(-10.68f, 14.0f, -26.0f, 14.0f);
        pathBuilder.reflectiveCurveToRelative(-26.0f, -7.38f, -26.0f, -14.0f);
        pathBuilder.reflectiveCurveTo(64.68f, 86.0f, 80.0f, 86.0f);
        pathBuilder.close();
        pathBuilder.moveTo(22.0f, 137.71f);
        pathBuilder.lineToRelative(52.0f, 26.0f);
        pathBuilder.verticalLineToRelative(50.58f);
        pathBuilder.lineToRelative(-52.0f, -26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 214.29f);
        pathBuilder.lineTo(86.0f, 163.71f);
        pathBuilder.lineToRelative(148.0f, -74.0f);
        pathBuilder.verticalLineToRelative(50.58f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lego = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
