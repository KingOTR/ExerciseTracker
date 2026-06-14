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

/* compiled from: Infinity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Infinity", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getInfinity", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_infinity", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InfinityKt {
    private static ImageVector _infinity;

    public static final ImageVector getInfinity(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _infinity;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Infinity", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.28f, 156.28f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -56.4f, 0.17f);
        pathBuilder.lineTo(97.29f, 111.34f);
        pathBuilder.lineTo(97.0f, 111.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 97.0f, 145.0f);
        pathBuilder.curveToRelative(0.36f, -0.36f, 0.71f, -0.73f, 1.0f, -1.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.0f, 10.6f);
        pathBuilder.curveToRelative(-0.55f, 0.62f, -1.13f, 1.23f, -1.71f, 1.81f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, -0.17f, -56.73f);
        pathBuilder.lineToRelative(50.58f, 45.11f);
        pathBuilder.lineToRelative(0.33f, 0.31f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 159.0f, 111.0f);
        pathBuilder.curveToRelative(-0.36f, 0.36f, -0.7f, 0.72f, -1.0f, 1.1f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.59f);
        pathBuilder.curveToRelative(0.54f, -0.62f, 1.12f, -1.24f, 1.71f, -1.82f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.57f, 56.56f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _infinity = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
