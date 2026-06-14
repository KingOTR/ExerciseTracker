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

/* compiled from: Forkknife.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ForkKnife", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getForkKnife", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_forkKnife", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ForkknifeKt {
    private static ImageVector _forkKnife;

    public static final ImageVector getForkKnife(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _forkKnife;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ForkKnife", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(68.0f, 88.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 40.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineTo(180.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.arcToRelative(273.23f, 273.23f, 0.0f, false, true, 7.33f, -57.82f);
        pathBuilder.curveTo(157.42f, 68.42f, 176.76f, 40.33f, 203.27f, 29.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 62.92f);
        pathBuilder.curveTo(182.6f, 77.0f, 175.0f, 98.0f, 170.77f, 115.38f);
        pathBuilder.arcTo(254.41f, 254.41f, 0.0f, false, false, 164.55f, 156.0f);
        pathBuilder.horizontalLineTo(196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 39.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 104.0f, 41.0f);
        pathBuilder.lineToRelative(4.0f, 47.46f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f);
        pathBuilder.lineTo(56.0f, 41.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 32.0f, 39.0f);
        pathBuilder.lineTo(28.0f, 87.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.0f, 0.67f, 0.0f, 1.0f);
        pathBuilder.arcToRelative(52.1f, 52.1f, 0.0f, false, false, 40.0f, 50.59f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(138.59f);
        pathBuilder.arcTo(52.1f, 52.1f, 0.0f, false, false, 132.0f, 88.0f);
        pathBuilder.curveToRelative(0.0f, -0.33f, 0.0f, -0.66f, 0.0f, -1.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _forkKnife = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
