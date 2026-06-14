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

/* compiled from: Asclepius.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Asclepius", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getAsclepius", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_asclepius", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AsclepiusKt {
    private static ImageVector _asclepius;

    public static final ImageVector getAsclepius(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _asclepius;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Asclepius", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(136.0f, 128.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.horizontalLineToRelative(11.62f);
        pathBuilder.arcTo(12.25f, 12.25f, 0.0f, false, false, 160.0f, 188.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.93f, -10.87f);
        pathBuilder.arcToRelative(4.08f, 4.08f, 0.0f, false, true, -2.06f, -3.49f);
        pathBuilder.verticalLineToRelative(-8.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.25f, -3.81f);
        pathBuilder.arcTo(28.06f, 28.06f, 0.0f, false, true, 176.0f, 187.71f);
        pathBuilder.curveToRelative(0.16f, 15.56f, -13.0f, 28.29f, -28.59f, 28.29f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineTo(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.53f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, true, 96.27f, 200.0f);
        pathBuilder.horizontalLineTo(120.0f);
        pathBuilder.verticalLineTo(128.0f);
        pathBuilder.horizontalLineTo(104.46f);
        pathBuilder.curveToRelative(-8.6f, 0.0f, -16.0f, 6.6f, -16.44f, 15.19f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 12.87f, 16.51f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.11f, 3.89f);
        pathBuilder.verticalLineTo(172.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.87f);
        pathBuilder.curveTo(64.47f, 119.48f, 81.0f, 104.0f, 100.68f, 104.0f);
        pathBuilder.horizontalLineTo(120.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.81f);
        pathBuilder.curveTo(183.56f, 78.6f, 176.14f, 72.0f, 167.54f, 72.0f);
        pathBuilder.horizontalLineTo(156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(15.22f);
        pathBuilder.curveToRelative(24.62f, 0.0f, 45.2f, 20.15f, 44.77f, 44.76f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 172.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.66f, 72.0f);
        pathBuilder.horizontalLineTo(100.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.verticalLineTo(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 92.66f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _asclepius = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
