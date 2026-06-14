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

/* compiled from: Lighthouse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lighthouse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLighthouse", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lighthouse", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LighthouseKt {
    private static ImageVector _lighthouse;

    public static final ImageVector getLighthouse(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(220.0f, 84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(192.87f);
        pathBuilder.lineToRelative(-4.93f, -49.2f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 47.0f);
        pathBuilder.lineTo(141.1f, 8.89f);
        pathBuilder.lineToRelative(-0.3f, -0.25f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -25.6f, 0.0f);
        pathBuilder.lineToRelative(-0.3f, 0.25f);
        pathBuilder.lineTo(72.0f, 47.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.0f, 7.76f);
        pathBuilder.lineTo(63.13f, 104.0f);
        pathBuilder.horizontalLineTo(48.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.horizontalLineTo(60.72f);
        pathBuilder.lineToRelative(-8.63f, 86.1f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 236.0f);
        pathBuilder.horizontalLineTo(184.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.9f, -21.95f);
        pathBuilder.lineTo(195.28f, 128.0f);
        pathBuilder.horizontalLineTo(220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 220.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 29.36f);
        pathBuilder.lineTo(144.46f, 44.0f);
        pathBuilder.horizontalLineTo(111.54f);
        pathBuilder.close();
        pathBuilder.moveTo(90.86f, 68.0f);
        pathBuilder.horizontalLineToRelative(74.28f);
        pathBuilder.lineToRelative(3.61f, 36.0f);
        pathBuilder.horizontalLineTo(140.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineTo(87.25f);
        pathBuilder.close();
        pathBuilder.moveTo(76.42f, 212.0f);
        pathBuilder.lineToRelative(3.21f, -32.0f);
        pathBuilder.horizontalLineToRelative(96.74f);
        pathBuilder.lineToRelative(3.21f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(174.0f, 156.0f);
        pathBuilder.horizontalLineTo(82.0f);
        pathBuilder.lineToRelative(2.8f, -28.0f);
        pathBuilder.horizontalLineToRelative(86.32f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lighthouse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
