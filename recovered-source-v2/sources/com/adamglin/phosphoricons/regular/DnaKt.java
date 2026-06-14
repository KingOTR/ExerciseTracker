package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Dna.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Dna", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getDna", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_dna", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DnaKt {
    private static ImageVector _dna;

    public static final ImageVector getDna(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(160.0f, 200.0f);
        pathBuilder.horizontalLineTo(72.17f);
        pathBuilder.arcToRelative(63.59f, 63.59f, 0.0f, false, true, 3.23f, -16.0f);
        pathBuilder.horizontalLineToRelative(72.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineTo(83.46f);
        pathBuilder.arcToRelative(63.71f, 63.71f, 0.0f, false, true, 14.65f, -15.08f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 88.64f, 140.0f);
        pathBuilder.arcTo(80.27f, 80.27f, 0.0f, false, false, 56.0f, 204.5f);
        pathBuilder.verticalLineTo(232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(87.83f);
        pathBuilder.arcToRelative(63.59f, 63.59f, 0.0f, false, true, -3.23f, 16.0f);
        pathBuilder.horizontalLineTo(107.89f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.65f);
        pathBuilder.arcToRelative(63.71f, 63.71f, 0.0f, false, true, -14.65f, 15.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.47f, 12.9f);
        pathBuilder.arcTo(80.27f, 80.27f, 0.0f, false, false, 200.0f, 51.5f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _dna = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
