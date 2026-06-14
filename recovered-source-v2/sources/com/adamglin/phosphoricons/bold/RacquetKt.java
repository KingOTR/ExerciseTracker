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

/* compiled from: Racquet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Racquet", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getRacquet", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_racquet", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RacquetKt {
    private static ImageVector _racquet;

    public static final ImageVector getRacquet(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _racquet;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Racquet", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.7f, 23.3f);
        pathBuilder.curveTo(218.05f, 8.66f, 197.43f, 2.0f, 174.62f, 4.53f);
        pathBuilder.curveToRelative(-21.81f, 2.42f, -43.15f, 13.08f, -60.09f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(-27.59f, 38.27f, -30.0f, 60.09f);
        pathBuilder.curveToRelative(-2.0f, 18.33f, 1.89f, 35.24f, 11.1f, 48.78f);
        pathBuilder.lineToRelative(-20.3f, 20.31f);
        pathBuilder.lineToRelative(-1.86f, -1.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f);
        pathBuilder.lineTo(13.86f, 193.18f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f);
        pathBuilder.lineToRelative(20.68f, 20.68f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(31.31f, -31.31f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.29f);
        pathBuilder.lineToRelative(-1.86f, -1.85f);
        pathBuilder.lineToRelative(20.31f, -20.31f);
        pathBuilder.curveTo(123.78f, 168.0f, 137.28f, 172.0f, 152.0f, 172.0f);
        pathBuilder.arcToRelative(83.09f, 83.09f, 0.0f, false, false, 9.38f, -0.53f);
        pathBuilder.curveToRelative(21.81f, -2.42f, 43.15f, -13.08f, 60.08f, -30.0f);
        pathBuilder.reflectiveCurveToRelative(27.6f, -38.27f, 30.0f, -60.09f);
        pathBuilder.curveTo(254.0f, 58.57f, 247.34f, 38.0f, 232.7f, 23.3f);
        pathBuilder.close();
        pathBuilder.moveTo(48.7f, 222.3f);
        pathBuilder.lineTo(33.7f, 207.3f);
        pathBuilder.lineTo(59.35f, 181.65f);
        pathBuilder.lineTo(74.35f, 196.65f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 141.76f);
        pathBuilder.arcTo(39.33f, 39.33f, 0.0f, false, true, 114.25f, 128.0f);
        pathBuilder.lineTo(128.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 104.01f);
        pathBuilder.arcToRelative(68.85f, 68.85f, 0.0f, false, true, 8.38f, -32.0f);
        pathBuilder.lineTo(128.0f, 72.01f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.lineTo(152.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 104.0f);
        pathBuilder.lineTo(208.0f, 72.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(68.68f, 68.68f, 0.0f, false, true, -8.37f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.75f, 48.0f);
        pathBuilder.lineTo(208.0f, 48.0f);
        pathBuilder.lineTo(208.0f, 34.26f);
        pathBuilder.arcTo(39.47f, 39.47f, 0.0f, false, true, 221.74f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(183.82f, 28.0f);
        pathBuilder.lineTo(184.0f, 28.0f);
        pathBuilder.lineTo(184.0f, 48.0f);
        pathBuilder.lineTo(152.0f, 48.0f);
        pathBuilder.lineTo(152.0f, 36.34f);
        pathBuilder.curveTo(162.47f, 30.82f, 173.48f, 28.0f, 183.82f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 148.06f);
        pathBuilder.lineTo(152.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.verticalLineToRelative(11.67f);
        pathBuilder.arcTo(68.7f, 68.7f, 0.0f, false, true, 152.0f, 148.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _racquet = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
