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

/* compiled from: Binoculars.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Binoculars", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBinoculars", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_binoculars", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BinocularsKt {
    private static ImageVector _binoculars;

    public static final ImageVector getBinoculars(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _binoculars;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Binoculars", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.0f, 150.65f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, -0.05f);
        pathBuilder.arcToRelative(51.33f, 51.33f, 0.0f, false, false, -2.53f, -5.9f);
        pathBuilder.lineTo(196.93f, 50.18f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.5f, -3.65f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 55.0f);
        pathBuilder.verticalLineTo(76.0f);
        pathBuilder.horizontalLineTo(116.0f);
        pathBuilder.verticalLineTo(55.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.48f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.5f, 3.65f);
        pathBuilder.lineTo(17.53f, 144.7f);
        pathBuilder.arcTo(51.33f, 51.33f, 0.0f, false, false, 15.0f, 150.6f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.05f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 116.0f, 168.0f);
        pathBuilder.verticalLineTo(100.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, false, 101.0f, -17.35f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 62.28f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -1.22f);
        pathBuilder.verticalLineToRelative(63.15f);
        pathBuilder.arcToRelative(51.9f, 51.9f, 0.0f, false, false, -35.9f, -7.62f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 196.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 64.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 61.06f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, true, 12.0f, 1.22f);
        pathBuilder.lineToRelative(23.87f, 54.31f);
        pathBuilder.arcToRelative(51.9f, 51.9f, 0.0f, false, false, -35.9f, 7.62f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 196.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 192.0f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _binoculars = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
