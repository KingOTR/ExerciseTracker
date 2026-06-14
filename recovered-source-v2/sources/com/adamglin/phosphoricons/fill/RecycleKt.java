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

/* compiled from: Recycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Recycle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getRecycle", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_recycle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecycleKt {
    private static ImageVector _recycle;

    public static final ImageVector getRecycle(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _recycle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Recycle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(96.0f, 208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -20.77f, -36.0f);
        pathBuilder.lineToRelative(28.0f, -48.3f);
        pathBuilder.lineToRelative(-13.82f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 35.33f, 109.0f);
        pathBuilder.lineToRelative(32.77f, -8.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.8f, 5.66f);
        pathBuilder.lineToRelative(8.79f, 32.77f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.73f, 9.0f);
        pathBuilder.lineToRelative(-13.88f, -8.0f);
        pathBuilder.lineTo(33.11f, 188.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 200.0f);
        pathBuilder.horizontalLineTo(88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.arcToRelative(7.85f, 7.85f, 0.0f, false, true, 6.92f, 4.0f);
        pathBuilder.lineToRelative(28.0f, 48.3f);
        pathBuilder.lineToRelative(-13.82f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 151.0f, 106.92f);
        pathBuilder.lineToRelative(32.78f, 8.79f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 2.07f, 0.27f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.72f, -5.93f);
        pathBuilder.lineToRelative(8.79f, -32.79f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.72f, -9.0f);
        pathBuilder.lineToRelative(-13.89f, 8.0f);
        pathBuilder.lineTo(148.77f, 28.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.54f, 0.0f);
        pathBuilder.lineTo(84.07f, 68.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.85f, 8.0f);
        pathBuilder.lineToRelative(23.16f, -40.0f);
        pathBuilder.arcTo(7.85f, 7.85f, 0.0f, false, true, 128.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.73f, 180.0f);
        pathBuilder.lineToRelative(-23.14f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.84f, 8.0f);
        pathBuilder.lineToRelative(23.14f, 40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 200.0f);
        pathBuilder.horizontalLineTo(160.0f);
        pathBuilder.verticalLineTo(184.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.66f, -5.66f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.32f);
        pathBuilder.lineToRelative(24.0f, 24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 232.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 20.77f, -36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _recycle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
