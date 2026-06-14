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

/* compiled from: Tooth.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Tooth", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTooth", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tooth", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ToothKt {
    private static ImageVector _tooth;

    public static final ImageVector getTooth(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _tooth;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Tooth", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.46f, 83.15f);
        pathBuilder.lineTo(160.31f, 88.0f);
        pathBuilder.lineToRelative(12.15f, 4.85f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -8.92f, 22.29f);
        pathBuilder.lineTo(128.0f, 100.93f);
        pathBuilder.lineTo(92.46f, 115.15f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.92f, -22.29f);
        pathBuilder.lineTo(95.69f, 88.0f);
        pathBuilder.lineTo(83.54f, 83.15f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, -22.29f);
        pathBuilder.lineTo(128.0f, 75.08f);
        pathBuilder.lineToRelative(35.54f, -14.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.92f, 22.29f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 79.75f);
        pathBuilder.curveToRelative(0.08f, 76.45f, -25.2f, 135.68f, -49.0f, 152.59f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -31.44f, -14.92f);
        pathBuilder.curveToRelative(-0.67f, -9.06f, -2.33f, -22.0f, -6.46f, -32.23f);
        pathBuilder.curveTo(135.76f, 172.0f, 129.92f, 172.0f, 128.0f, 172.0f);
        pathBuilder.curveToRelative(-7.76f, 0.0f, -11.77f, 9.92f, -13.08f, 13.18f);
        pathBuilder.curveToRelative(-4.13f, 10.22f, -5.79f, 23.17f, -6.46f, 32.23f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 88.51f, 236.0f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, true, 77.0f, 232.34f);
        pathBuilder.curveTo(53.2f, 215.43f, 27.92f, 156.2f, 28.0f, 79.75f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 88.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 228.0f, 79.75f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 79.75f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 168.0f, 44.0f);
        pathBuilder.lineTo(88.0f, 44.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 52.0f, 79.78f);
        pathBuilder.curveToRelative(-0.06f, 61.09f, 17.83f, 109.52f, 33.3f, 127.66f);
        pathBuilder.curveTo(91.24f, 156.0f, 114.32f, 148.0f, 128.0f, 148.0f);
        pathBuilder.reflectiveCurveToRelative(36.76f, 8.0f, 42.7f, 59.43f);
        pathBuilder.curveTo(186.17f, 189.31f, 204.06f, 140.88f, 204.0f, 79.78f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tooth = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
