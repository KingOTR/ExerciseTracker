package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fliphorizontal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFlipHorizontal", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipHorizontal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FliphorizontalKt {
    private static ImageVector _flipHorizontal;

    public static final ImageVector getFlipHorizontal(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(112.0f, 40.0f);
        pathBuilder.verticalLineTo(200.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.37f, -11.12f);
        pathBuilder.lineToRelative(64.0f, -160.0f);
        pathBuilder.curveTo(100.0f, 28.86f, 112.0f, 31.29f, 112.0f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(107.18f, 24.33f);
        pathBuilder2.arcToRelative(15.86f, 15.86f, 0.0f, false, false, -17.92f, 9.45f);
        pathBuilder2.lineToRelative(-0.06f, 0.14f);
        pathBuilder2.lineToRelative(-64.0f, 159.93f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 216.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(120.0f, 40.0f);
        pathBuilder2.arcTo(15.85f, 15.85f, 0.0f, false, false, 107.18f, 24.33f);
        pathBuilder2.close();
        pathBuilder2.moveTo(104.0f, 200.0f);
        pathBuilder2.lineTo(40.0f, 200.0f);
        pathBuilder2.lineToRelative(0.06f, -0.15f);
        pathBuilder2.lineTo(104.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(230.77f, 193.85f);
        pathBuilder2.lineTo(166.77f, 33.92f);
        pathBuilder2.lineTo(166.71f, 33.78f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 136.0f, 40.0f);
        pathBuilder2.lineTo(136.0f, 200.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.78f, -22.15f);
        pathBuilder2.close();
        pathBuilder2.moveTo(152.0f, 200.0f);
        pathBuilder2.lineTo(152.0f, 40.0f);
        pathBuilder2.lineToRelative(63.93f, 159.84f);
        pathBuilder2.lineToRelative(0.06f, 0.15f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipHorizontal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
