package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Globe.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Globe", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGlobe", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_globe", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GlobeKt {
    private static ImageVector _globe;

    public static final ImageVector getGlobe(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(206.36f, 88.0f);
        pathBuilder.lineTo(170.71f, 88.0f);
        pathBuilder.arcToRelative(135.28f, 135.28f, 0.0f, false, false, -22.3f, -45.6f);
        pathBuilder.arcTo(88.29f, 88.29f, 0.0f, false, true, 206.37f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 128.0f);
        pathBuilder.arcToRelative(87.61f, 87.61f, 0.0f, false, true, -3.33f, 24.0f);
        pathBuilder.lineTo(174.16f, 152.0f);
        pathBuilder.arcToRelative(157.44f, 157.44f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder.horizontalLineToRelative(38.51f);
        pathBuilder.arcTo(87.61f, 87.61f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 43.0f);
        pathBuilder.arcToRelative(115.27f, 115.27f, 0.0f, false, true, 26.0f, 45.0f);
        pathBuilder.lineTo(102.0f, 88.0f);
        pathBuilder.arcTo(115.11f, 115.11f, 0.0f, false, true, 128.0f, 43.0f);
        pathBuilder.close();
        pathBuilder.moveTo(102.0f, 168.0f);
        pathBuilder.lineTo(154.0f, 168.0f);
        pathBuilder.arcToRelative(115.11f, 115.11f, 0.0f, false, true, -26.0f, 45.0f);
        pathBuilder.arcTo(115.27f, 115.27f, 0.0f, false, true, 102.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.1f, 152.0f);
        pathBuilder.arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, -48.0f);
        pathBuilder.horizontalLineToRelative(59.88f);
        pathBuilder.arcToRelative(140.84f, 140.84f, 0.0f, false, true, 0.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.45f, 213.6f);
        pathBuilder.arcToRelative(135.28f, 135.28f, 0.0f, false, false, 22.3f, -45.6f);
        pathBuilder.horizontalLineToRelative(35.66f);
        pathBuilder.arcTo(88.29f, 88.29f, 0.0f, false, true, 148.41f, 213.6f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _globe = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
