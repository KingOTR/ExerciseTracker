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

/* compiled from: Siren.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Siren", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSiren", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_siren", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SirenKt {
    private static ImageVector _siren;

    public static final ImageVector getSiren(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _siren;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Siren", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(120.0f, 16.0f);
        pathBuilder.lineTo(120.0f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, -11.32f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(50.34f, 45.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 61.66f, 34.34f);
        pathBuilder.lineToRelative(-8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 42.34f, 37.66f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 176.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(40.0f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(24.0f, 176.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f);
        pathBuilder.lineTo(40.0f, 128.0f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 88.67f, -88.0f);
        pathBuilder.curveToRelative(48.15f, 0.36f, 87.33f, 40.29f, 87.33f, 89.0f);
        pathBuilder.verticalLineToRelative(31.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.68f, 87.89f);
        pathBuilder.curveTo(153.67f, 91.08f, 168.0f, 108.32f, 168.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -27.4f, -20.07f, -51.43f, -46.68f, -55.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -2.64f, 15.78f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 200.0f);
        pathBuilder.lineTo(216.0f, 176.0f);
        pathBuilder.lineTo(40.0f, 176.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(216.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _siren = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
