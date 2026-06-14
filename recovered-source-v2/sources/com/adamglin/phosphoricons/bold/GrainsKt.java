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

/* compiled from: Grains.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Grains", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGrains", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_grains", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GrainsKt {
    private static ImageVector _grains;

    public static final ImageVector getGrains(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _grains;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Grains", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 52.0f);
        pathBuilder.arcToRelative(91.68f, 91.68f, 0.0f, false, false, -29.9f, 5.0f);
        pathBuilder.curveToRelative(-15.39f, -28.76f, -43.4f, -43.06f, -44.73f, -43.72f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.74f, 0.0f);
        pathBuilder.curveToRelative(-1.33f, 0.66f, -29.34f, 15.0f, -44.74f, 43.72f);
        pathBuilder.arcTo(91.57f, 91.57f, 0.0f, false, false, 48.0f, 52.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 64.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f);
        pathBuilder.lineTo(220.0f, 64.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 77.06f);
        pathBuilder.arcToRelative(68.15f, 68.15f, 0.0f, false, true, 55.72f, 60.73f);
        pathBuilder.arcToRelative(91.89f, 91.89f, 0.0f, false, false, -55.72f, -29.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 210.94f);
        pathBuilder.arcTo(68.12f, 68.12f, 0.0f, false, true, 60.0f, 144.0f);
        pathBuilder.lineTo(60.0f, 133.06f);
        pathBuilder.arcTo(68.12f, 68.12f, 0.0f, false, true, 116.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(99.37f, 67.71f);
        pathBuilder.curveToRelative(8.2f, -14.94f, 21.32f, -25.0f, 28.63f, -29.77f);
        pathBuilder.curveToRelative(7.32f, 4.79f, 20.43f, 14.83f, 28.63f, 29.77f);
        pathBuilder.arcTo(92.69f, 92.69f, 0.0f, false, false, 128.0f, 98.61f);
        pathBuilder.arcTo(92.8f, 92.8f, 0.0f, false, false, 99.37f, 67.71f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 144.0f);
        pathBuilder.arcToRelative(68.12f, 68.12f, 0.0f, false, true, -56.0f, 66.94f);
        pathBuilder.lineTo(140.0f, 200.0f);
        pathBuilder.arcToRelative(68.12f, 68.12f, 0.0f, false, true, 56.0f, -66.94f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 108.78f);
        pathBuilder.arcToRelative(91.89f, 91.89f, 0.0f, false, false, -55.72f, 29.0f);
        pathBuilder.arcTo(68.15f, 68.15f, 0.0f, false, true, 196.0f, 77.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _grains = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
