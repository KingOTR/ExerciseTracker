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

/* compiled from: Fliphorizontal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFlipHorizontal", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipHorizontal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FliphorizontalKt {
    private static ImageVector _flipHorizontal;

    public static final ImageVector getFlipHorizontal(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _flipHorizontal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlipHorizontal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(107.18f, 24.33f);
        pathBuilder.arcToRelative(15.86f, 15.86f, 0.0f, false, false, -17.92f, 9.45f);
        pathBuilder.lineToRelative(-0.06f, 0.14f);
        pathBuilder.lineToRelative(-64.0f, 159.93f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(120.0f, 40.0f);
        pathBuilder.arcTo(15.85f, 15.85f, 0.0f, false, false, 107.18f, 24.33f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 200.0f);
        pathBuilder.lineTo(40.0f, 200.0f);
        pathBuilder.lineToRelative(0.06f, -0.15f);
        pathBuilder.lineTo(104.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(230.77f, 193.85f);
        pathBuilder.lineTo(166.77f, 33.92f);
        pathBuilder.lineTo(166.71f, 33.78f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 40.0f);
        pathBuilder.lineTo(136.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.78f, -22.15f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 200.0f);
        pathBuilder.lineTo(152.0f, 40.0f);
        pathBuilder.lineToRelative(63.93f, 159.84f);
        pathBuilder.lineToRelative(0.06f, 0.15f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipHorizontal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
