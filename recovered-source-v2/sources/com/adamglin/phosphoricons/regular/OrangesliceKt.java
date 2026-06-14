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

/* compiled from: Orangeslice.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"OrangeSlice", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getOrangeSlice", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_orangeSlice", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrangesliceKt {
    private static ImageVector _orangeSlice;

    public static final ImageVector getOrangeSlice(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _orangeSlice;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("OrangeSlice", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 80.0f);
        pathBuilder.lineTo(8.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.arcToRelative(128.0f, 128.0f, 0.0f, false, false, 256.0f, 0.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 248.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(77.4f, 149.91f);
        pathBuilder.lineToRelative(42.6f, -42.6f);
        pathBuilder.lineTo(120.0f, 167.6f);
        pathBuilder.arcTo(79.59f, 79.59f, 0.0f, false, true, 77.4f, 149.91f);
        pathBuilder.close();
        pathBuilder.moveTo(66.09f, 138.6f);
        pathBuilder.arcTo(79.59f, 79.59f, 0.0f, false, true, 48.4f, 96.0f);
        pathBuilder.horizontalLineToRelative(60.29f);
        pathBuilder.close();
        pathBuilder.moveTo(136.0f, 107.31f);
        pathBuilder.lineToRelative(42.6f, 42.6f);
        pathBuilder.arcTo(79.59f, 79.59f, 0.0f, false, true, 136.0f, 167.6f);
        pathBuilder.close();
        pathBuilder.moveTo(189.91f, 138.6f);
        pathBuilder.lineTo(147.31f, 96.0f);
        pathBuilder.lineTo(207.6f, 96.0f);
        pathBuilder.arcTo(79.59f, 79.59f, 0.0f, false, true, 189.91f, 138.6f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 200.0f);
        pathBuilder.arcTo(112.15f, 112.15f, 0.0f, false, true, 16.28f, 96.0f);
        pathBuilder.lineTo(32.34f, 96.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 191.32f, 0.0f);
        pathBuilder.horizontalLineToRelative(16.06f);
        pathBuilder.arcTo(112.15f, 112.15f, 0.0f, false, true, 128.0f, 200.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _orangeSlice = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
