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

/* compiled from: Globe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Globe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGlobe", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobeKt {
    private static ImageVector _globe;

    public static final ImageVector getGlobe(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _globe;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Globe", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 128.0f);
        pathBuilder2.arcToRelative(87.61f, 87.61f, 0.0f, false, true, -3.33f, 24.0f);
        pathBuilder2.lineTo(174.16f, 152.0f);
        pathBuilder2.arcToRelative(157.44f, 157.44f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder2.horizontalLineToRelative(38.51f);
        pathBuilder2.arcTo(87.61f, 87.61f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(102.0f, 168.0f);
        pathBuilder2.lineTo(154.0f, 168.0f);
        pathBuilder2.arcToRelative(115.11f, 115.11f, 0.0f, false, true, -26.0f, 45.0f);
        pathBuilder2.arcTo(115.27f, 115.27f, 0.0f, false, true, 102.0f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(98.1f, 152.0f);
        pathBuilder2.arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, -48.0f);
        pathBuilder2.horizontalLineToRelative(59.88f);
        pathBuilder2.arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 128.0f);
        pathBuilder2.arcToRelative(87.61f, 87.61f, 0.0f, false, true, 3.33f, -24.0f);
        pathBuilder2.lineTo(81.84f, 104.0f);
        pathBuilder2.arcToRelative(157.44f, 157.44f, 0.0f, false, false, 0.0f, 48.0f);
        pathBuilder2.lineTo(43.33f, 152.0f);
        pathBuilder2.arcTo(87.61f, 87.61f, 0.0f, false, true, 40.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(154.0f, 88.0f);
        pathBuilder2.lineTo(102.0f, 88.0f);
        pathBuilder2.arcToRelative(115.11f, 115.11f, 0.0f, false, true, 26.0f, -45.0f);
        pathBuilder2.arcTo(115.27f, 115.27f, 0.0f, false, true, 154.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(206.33f, 88.0f);
        pathBuilder2.lineTo(170.71f, 88.0f);
        pathBuilder2.arcToRelative(135.28f, 135.28f, 0.0f, false, false, -22.3f, -45.6f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, true, 206.37f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(107.59f, 42.4f);
        pathBuilder2.arcTo(135.28f, 135.28f, 0.0f, false, false, 85.29f, 88.0f);
        pathBuilder2.lineTo(49.63f, 88.0f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, true, 107.59f, 42.4f);
        pathBuilder2.close();
        pathBuilder2.moveTo(49.63f, 168.0f);
        pathBuilder2.lineTo(85.29f, 168.0f);
        pathBuilder2.arcToRelative(135.28f, 135.28f, 0.0f, false, false, 22.3f, 45.6f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, true, 49.63f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(148.41f, 213.6f);
        pathBuilder2.arcToRelative(135.28f, 135.28f, 0.0f, false, false, 22.3f, -45.6f);
        pathBuilder2.horizontalLineToRelative(35.66f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, true, 148.41f, 213.6f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
