package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Tagchevron.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TagChevron", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTagChevron", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tagChevron", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TagchevronKt {
    private static ImageVector _tagChevron;

    public static final ImageVector getTagChevron(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _tagChevron;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TagChevron", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(245.0f, 124.67f);
        pathBuilder.lineTo(199.37f, 56.23f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 187.72f, 50.0f);
        pathBuilder.lineTo(32.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 9.33f);
        pathBuilder.lineTo(72.79f, 128.0f);
        pathBuilder.lineTo(27.0f, 196.67f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 206.0f);
        pathBuilder.lineTo(187.72f, 206.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.65f, -6.23f);
        pathBuilder.lineTo(245.0f, 131.33f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 245.0f, 124.67f);
        pathBuilder.close();
        pathBuilder.moveTo(189.39f, 193.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.66f, 0.89f);
        pathBuilder.lineTo(43.21f, 194.0f);
        pathBuilder.lineTo(85.0f, 131.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -6.66f);
        pathBuilder.lineTo(43.21f, 62.0f);
        pathBuilder.lineTo(187.72f, 62.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.66f, 0.89f);
        pathBuilder.lineTo(232.79f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tagChevron = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
