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

/* compiled from: Gendernonbinary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderNonbinary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGenderNonbinary", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderNonbinary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GendernonbinaryKt {
    private static ImageVector _genderNonbinary;

    public static final ImageVector getGenderNonbinary(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _genderNonbinary;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GenderNonbinary", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(134.0f, 98.27f);
        pathBuilder.verticalLineTo(58.6f);
        pathBuilder.lineToRelative(30.91f, 18.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, -10.28f);
        pathBuilder.lineTo(139.66f, 48.0f);
        pathBuilder.lineToRelative(31.43f, -18.85f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.18f, -10.29f);
        pathBuilder.lineTo(128.0f, 41.0f);
        pathBuilder.lineTo(91.09f, 18.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.18f, 10.29f);
        pathBuilder.lineTo(116.34f, 48.0f);
        pathBuilder.lineTo(84.91f, 66.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 6.18f, 10.28f);
        pathBuilder.lineTo(122.0f, 58.6f);
        pathBuilder.verticalLineTo(98.27f);
        pathBuilder.arcToRelative(70.0f, 70.0f, 0.0f, true, false, 12.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 226.0f);
        pathBuilder.arcToRelative(58.0f, 58.0f, 0.0f, true, true, 58.0f, -58.0f);
        pathBuilder.arcTo(58.07f, 58.07f, 0.0f, false, true, 128.0f, 226.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderNonbinary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
