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

/* compiled from: Lego.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lego", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLego", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lego", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LegoKt {
    private static ImageVector _lego;

    public static final ImageVector getLego(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(247.94f, 79.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.36f, -6.37f);
        pathBuilder.lineTo(197.29f, 49.7f);
        pathBuilder.curveTo(191.54f, 39.24f, 177.21f, 32.0f, 160.0f, 32.0f);
        pathBuilder.curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f);
        pathBuilder.arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f);
        pathBuilder.lineToRelative(-19.52f, 9.76f);
        pathBuilder.arcTo(53.69f, 53.69f, 0.0f, false, false, 80.0f, 72.0f);
        pathBuilder.curveToRelative(-22.43f, 0.0f, -40.0f, 12.3f, -40.0f, 28.0f);
        pathBuilder.arcToRelative(20.77f, 20.77f, 0.0f, false, false, 1.06f, 6.53f);
        pathBuilder.lineTo(12.42f, 120.84f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 128.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.42f, 7.16f);
        pathBuilder.lineToRelative(64.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.16f, 0.0f);
        pathBuilder.lineToRelative(160.0f, -80.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 144.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcTo(4.54f, 4.54f, 0.0f, false, false, 247.94f, 79.21f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 151.06f);
        pathBuilder.lineTo(33.89f, 128.0f);
        pathBuilder.lineTo(51.0f, 119.45f);
        pathBuilder.curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f);
        pathBuilder.curveToRelative(22.43f, 0.0f, 40.0f, -12.3f, 40.0f, -28.0f);
        pathBuilder.arcToRelative(21.77f, 21.77f, 0.0f, false, false, -4.35f, -12.88f);
        pathBuilder.lineTo(131.0f, 79.45f);
        pathBuilder.curveToRelative(7.24f, 5.29f, 17.48f, 8.55f, 29.0f, 8.55f);
        pathBuilder.curveToRelative(18.38f, 0.0f, 33.49f, -8.26f, 38.35f, -19.88f);
        pathBuilder.lineTo(222.11f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 48.0f);
        pathBuilder.curveToRelative(12.23f, 0.0f, 21.69f, 5.0f, 23.63f, 10.12f);
        pathBuilder.curveToRelative(0.0f, 0.09f, 0.07f, 0.18f, 0.11f, 0.28f);
        pathBuilder.arcTo(5.25f, 5.25f, 0.0f, false, true, 184.0f, 60.0f);
        pathBuilder.curveToRelative(0.0f, 5.66f, -10.26f, 12.0f, -24.0f, 12.0f);
        pathBuilder.curveToRelative(-9.66f, 0.0f, -17.6f, -3.14f, -21.46f, -7.0f);
        pathBuilder.arcToRelative(6.92f, 6.92f, 0.0f, false, false, -0.86f, -0.93f);
        pathBuilder.arcTo(6.66f, 6.66f, 0.0f, false, true, 136.0f, 60.0f);
        pathBuilder.curveTo(136.0f, 54.34f, 146.26f, 48.0f, 160.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 88.0f);
        pathBuilder.arcToRelative(37.0f, 37.0f, 0.0f, false, true, 17.13f, 3.87f);
        pathBuilder.arcToRelative(7.52f, 7.52f, 0.0f, false, false, 1.0f, 0.56f);
        pathBuilder.curveToRelative(3.69f, 2.21f, 5.87f, 5.0f, 5.87f, 7.57f);
        pathBuilder.curveToRelative(0.0f, 5.66f, -10.26f, 12.0f, -24.0f, 12.0f);
        pathBuilder.curveToRelative(-9.67f, 0.0f, -17.61f, -3.14f, -21.47f, -7.0f);
        pathBuilder.arcToRelative(7.5f, 7.5f, 0.0f, false, false, -0.84f, -0.93f);
        pathBuilder.arcTo(6.62f, 6.62f, 0.0f, false, true, 56.0f, 100.0f);
        pathBuilder.curveTo(56.0f, 94.34f, 66.26f, 88.0f, 80.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 140.94f);
        pathBuilder.lineToRelative(48.0f, 24.0f);
        pathBuilder.verticalLineToRelative(46.12f);
        pathBuilder.lineToRelative(-48.0f, -24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lego = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
