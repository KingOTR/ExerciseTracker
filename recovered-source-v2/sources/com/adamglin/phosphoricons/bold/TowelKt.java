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

/* compiled from: Towel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Towel", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTowel", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_towel", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TowelKt {
    private static ImageVector _towel;

    public static final ImageVector getTowel(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _towel;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Towel", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(197.16f, 20.0f);
        pathBuilder.curveToRelative(-0.47f, 0.0f, -0.93f, 0.0f, -1.39f, 0.0f);
        pathBuilder.horizontalLineTo(72.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 48.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineTo(168.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.verticalLineTo(52.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 196.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(0.35f);
        pathBuilder.arcToRelative(8.33f, 8.33f, 0.0f, false, true, 7.7f, 8.48f);
        pathBuilder.verticalLineTo(148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(52.48f);
        pathBuilder.arcTo(32.13f, 32.13f, 0.0f, false, false, 197.16f, 20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(93.0f);
        pathBuilder.arcToRelative(32.24f, 32.24f, 0.0f, false, false, -1.0f, 8.0f);
        pathBuilder.verticalLineTo(172.0f);
        pathBuilder.horizontalLineTo(68.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 212.0f);
        pathBuilder.verticalLineTo(196.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _towel = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
