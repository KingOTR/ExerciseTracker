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

/* compiled from: Sliders.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Sliders", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSliders", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_sliders", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SlidersKt {
    private static ImageVector _sliders;

    public static final ImageVector getSliders(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _sliders;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Sliders", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(68.0f, 102.06f);
        pathBuilder.lineTo(68.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(62.06f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f);
        pathBuilder.lineTo(44.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(68.0f, 169.94f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -67.88f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 88.0f);
        pathBuilder.arcToRelative(36.07f, 36.07f, 0.0f, false, false, -24.0f, -33.94f);
        pathBuilder.lineTo(140.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 54.06f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f);
        pathBuilder.lineTo(116.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 121.94f);
        pathBuilder.arcTo(36.07f, 36.07f, 0.0f, false, false, 164.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 168.0f);
        pathBuilder.arcToRelative(36.07f, 36.07f, 0.0f, false, false, -24.0f, -33.94f);
        pathBuilder.lineTo(212.0f, 40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(94.06f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 67.88f);
        pathBuilder.lineTo(188.0f, 216.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(212.0f, 201.94f);
        pathBuilder.arcTo(36.07f, 36.07f, 0.0f, false, false, 236.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 180.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 180.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _sliders = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
