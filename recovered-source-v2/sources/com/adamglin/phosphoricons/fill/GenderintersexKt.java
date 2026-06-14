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

/* compiled from: Genderintersex.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GenderIntersex", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGenderIntersex", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_genderIntersex", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GenderintersexKt {
    private static ImageVector _genderIntersex;

    public static final ImageVector getGenderIntersex(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _genderIntersex;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GenderIntersex", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(147.91f, 113.72f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -25.63f, -25.63f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, true, 147.91f, 113.72f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 40.0f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.horizontalLineTo(56.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f);
        pathBuilder.horizontalLineTo(200.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.horizontalLineTo(152.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 144.0f, 55.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 64.0f);
        pathBuilder.horizontalLineToRelative(8.69f);
        pathBuilder.lineTo(144.92f, 79.77f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, true, false, 112.0f, 159.26f);
        pathBuilder.verticalLineTo(176.0f);
        pathBuilder.horizontalLineTo(92.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 84.0f, 183.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(15.73f);
        pathBuilder.arcToRelative(8.18f, 8.18f, 0.0f, false, false, 7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f);
        pathBuilder.verticalLineTo(192.0f);
        pathBuilder.horizontalLineToRelative(19.73f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 8.25f, -7.47f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.53f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.verticalLineTo(159.26f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 28.24f, -68.18f);
        pathBuilder.lineTo(172.0f, 75.31f);
        pathBuilder.verticalLineToRelative(8.42f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, false, 179.47f, 92.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 188.0f, 84.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _genderIntersex = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
