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

/* compiled from: Lighthouse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lighthouse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getLighthouse", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lighthouse", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LighthouseKt {
    private static ImageVector _lighthouse;

    public static final ImageVector getLighthouse(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _lighthouse;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lighthouse", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(188.85f);
        pathBuilder.lineTo(184.0f, 55.2f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 181.31f, 50.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(138.44f, 11.88f);
        pathBuilder.lineToRelative(-0.2f, -0.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.48f, 0.0f);
        pathBuilder.lineToRelative(-0.2f, 0.17f);
        pathBuilder.lineTo(74.68f, 50.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcTo(7.93f, 7.93f, 0.0f, false, false, 72.0f, 55.2f);
        pathBuilder.lineTo(67.15f, 104.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder.horizontalLineTo(65.54f);
        pathBuilder.lineToRelative(-9.47f, 94.48f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 232.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.92f, -17.56f);
        pathBuilder.lineTo(190.46f, 120.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(87.24f, 64.0f);
        pathBuilder.horizontalLineToRelative(81.52f);
        pathBuilder.lineToRelative(4.0f, 40.0f);
        pathBuilder.horizontalLineTo(136.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.horizontalLineTo(83.23f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 216.0f);
        pathBuilder.lineToRelative(4.81f, -48.0f);
        pathBuilder.horizontalLineTo(179.19f);
        pathBuilder.lineTo(184.0f, 216.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lighthouse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
