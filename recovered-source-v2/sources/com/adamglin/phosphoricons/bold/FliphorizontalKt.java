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

/* compiled from: Fliphorizontal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlipHorizontal", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipHorizontal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FliphorizontalKt {
    private static ImageVector _flipHorizontal;

    public static final ImageVector getFlipHorizontal(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(104.0f, 20.41f);
        pathBuilder.arcToRelative(19.83f, 19.83f, 0.0f, false, false, -22.4f, 11.81f);
        pathBuilder.curveToRelative(-0.07f, 0.15f, -0.13f, 0.31f, -0.19f, 0.46f);
        pathBuilder.lineTo(21.47f, 192.49f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 40.0f, 220.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(120.0f, 40.0f);
        pathBuilder.arcTo(19.83f, 19.83f, 0.0f, false, false, 104.0f, 20.41f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 196.0f);
        pathBuilder.lineTo(45.79f, 196.0f);
        pathBuilder.lineTo(96.0f, 62.09f);
        pathBuilder.close();
        pathBuilder.moveTo(234.53f, 192.49f);
        pathBuilder.lineTo(174.61f, 32.68f);
        pathBuilder.curveToRelative(-0.06f, -0.15f, -0.12f, -0.31f, -0.19f, -0.46f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 136.0f, 40.0f);
        pathBuilder.lineTo(136.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(60.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.54f, -27.51f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 196.0f);
        pathBuilder.lineTo(160.0f, 62.09f);
        pathBuilder.lineTo(210.21f, 196.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipHorizontal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
