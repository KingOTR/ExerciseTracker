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

/* compiled from: Pintglass.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PintGlass", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPintGlass", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pintGlass", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PintglassKt {
    private static ImageVector _pintGlass;

    public static final ImageVector getPintGlass(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pintGlass;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PintGlass", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(195.2f, 72.0f);
        pathBuilder.lineTo(176.85f, 225.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.9f, 232.0f);
        pathBuilder.horizontalLineTo(87.1f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 79.15f, 225.0f);
        pathBuilder.lineTo(60.8f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(206.0f, 26.69f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 24.0f);
        pathBuilder2.horizontalLineTo(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.94f, 9.0f);
        pathBuilder2.lineToRelative(23.15f, 193.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 87.1f, 240.0f);
        pathBuilder2.horizontalLineToRelative(81.8f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.89f, -14.09f);
        pathBuilder2.lineTo(207.94f, 33.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 206.0f, 26.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(191.0f, 40.0f);
        pathBuilder2.lineTo(188.1f, 64.0f);
        pathBuilder2.horizontalLineTo(67.9f);
        pathBuilder2.lineTo(65.0f, 40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(168.9f, 224.0f);
        pathBuilder2.horizontalLineTo(87.1f);
        pathBuilder2.lineTo(69.82f, 80.0f);
        pathBuilder2.horizontalLineTo(186.18f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pintGlass = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
