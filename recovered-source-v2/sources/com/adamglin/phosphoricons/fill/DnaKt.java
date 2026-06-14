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

/* compiled from: Dna.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dna", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getDna", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dna", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DnaKt {
    private static ImageVector _dna;

    public static final ImageVector getDna(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _dna;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Dna", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 204.5f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(204.5f);
        pathBuilder.arcToRelative(63.67f, 63.67f, 0.0f, false, false, -35.38f, -57.25f);
        pathBuilder.lineToRelative(-48.4f, -24.19f);
        pathBuilder.arcTo(79.58f, 79.58f, 0.0f, false, true, 56.0f, 51.5f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(51.5f);
        pathBuilder.arcToRelative(63.67f, 63.67f, 0.0f, false, false, 35.38f, 57.25f);
        pathBuilder.lineToRelative(48.4f, 24.19f);
        pathBuilder.arcTo(79.58f, 79.58f, 0.0f, false, true, 200.0f, 204.5f);
        pathBuilder.close();
        pathBuilder.moveTo(163.18f, 192.0f);
        pathBuilder.horizontalLineTo(83.91f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 84.18f, 176.0f);
        pathBuilder.horizontalLineTo(149.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.75f, -6.9f);
        pathBuilder.arcToRelative(48.24f, 48.24f, 0.0f, false, false, -11.0f, -7.53f);
        pathBuilder.lineTo(94.8f, 138.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.08f, 0.3f);
        pathBuilder.arcTo(79.51f, 79.51f, 0.0f, false, false, 56.0f, 204.5f);
        pathBuilder.verticalLineToRelative(27.23f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 63.47f, 240.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 232.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineToRelative(92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineToRelative(-7.5f);
        pathBuilder.arcToRelative(48.76f, 48.76f, 0.0f, false, false, -0.9f, -9.32f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 163.18f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(191.47f, 16.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 184.0f, 24.27f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.horizontalLineTo(92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(7.5f);
        pathBuilder.arcToRelative(48.76f, 48.76f, 0.0f, false, false, 0.9f, 9.32f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 92.82f, 64.0f);
        pathBuilder.horizontalLineToRelative(79.0f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, true, 8.25f, 7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.53f);
        pathBuilder.horizontalLineTo(106.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.75f, 6.9f);
        pathBuilder.arcToRelative(48.24f, 48.24f, 0.0f, false, false, 11.0f, 7.53f);
        pathBuilder.lineToRelative(46.67f, 23.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.08f, -0.3f);
        pathBuilder.arcTo(79.51f, 79.51f, 0.0f, false, false, 200.0f, 51.5f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 191.47f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dna = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
