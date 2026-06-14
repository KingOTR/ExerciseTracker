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

/* compiled from: Gendernonbinary.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderNonbinary", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGenderNonbinary", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderNonbinary", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GendernonbinaryKt {
    private static ImageVector _genderNonbinary;

    public static final ImageVector getGenderNonbinary(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(140.0f, 93.0f);
        pathBuilder.verticalLineTo(69.2f);
        pathBuilder.lineToRelative(21.83f, 13.09f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.34f, -20.58f);
        pathBuilder.lineTo(151.32f, 48.0f);
        pathBuilder.lineToRelative(22.85f, -13.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.34f, -20.58f);
        pathBuilder.lineTo(128.0f, 34.0f);
        pathBuilder.lineTo(94.17f, 13.71f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 81.83f, 34.29f);
        pathBuilder.lineTo(104.68f, 48.0f);
        pathBuilder.lineTo(81.83f, 61.71f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 94.17f, 82.29f);
        pathBuilder.lineTo(116.0f, 69.2f);
        pathBuilder.verticalLineTo(93.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, true, false, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f);
        pathBuilder.arcTo(52.06f, 52.06f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderNonbinary = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
