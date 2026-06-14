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

/* compiled from: Pipe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pipe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPipe", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pipe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PipeKt {
    private static ImageVector _pipe;

    public static final ImageVector getPipe(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _pipe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pipe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 104.0f);
        pathBuilder.lineTo(208.0f, 104.0f);
        pathBuilder.lineTo(208.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.lineTo(205.83f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 32.0f);
        pathBuilder.lineTo(176.0f, 32.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -13.83f, 8.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.arcTo(104.11f, 104.11f, 0.0f, false, false, 40.0f, 144.0f);
        pathBuilder.verticalLineToRelative(18.16f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 176.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.0f, 13.84f);
        pathBuilder.lineTo(40.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(56.0f, 208.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 205.84f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 192.0f);
        pathBuilder.lineTo(128.0f, 176.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.0f, -13.84f);
        pathBuilder.lineTo(120.0f, 144.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(18.17f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.83f, -8.0f);
        pathBuilder.lineTo(232.0f, 120.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 176.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(48.0f, 192.0f);
        pathBuilder.lineTo(48.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 144.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.lineTo(56.0f, 160.0f);
        pathBuilder.lineTo(56.0f, 144.0f);
        pathBuilder.arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, -88.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(144.0f, 104.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 104.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 112.0f);
        pathBuilder.lineTo(176.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.verticalLineToRelative(63.8f);
        pathBuilder.curveToRelative(0.0f, 0.07f, 0.0f, 0.13f, 0.0f, 0.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pipe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
