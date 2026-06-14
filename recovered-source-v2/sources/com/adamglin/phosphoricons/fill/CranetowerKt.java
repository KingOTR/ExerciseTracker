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

/* compiled from: Cranetower.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CraneTower", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCraneTower", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_craneTower", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CranetowerKt {
    private static ImageVector _craneTower;

    public static final ImageVector getCraneTower(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _craneTower;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CraneTower", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(127.73f, 208.0f);
        pathBuilder.horizontalLineTo(112.0f);
        pathBuilder.verticalLineTo(164.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.horizontalLineTo(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.horizontalLineTo(24.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 16.0f, 215.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 224.0f);
        pathBuilder.horizontalLineTo(128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 127.73f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.73f, 80.0f);
        pathBuilder2.horizontalLineTo(108.94f);
        pathBuilder2.lineTo(87.16f, 36.42f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 32.0f);
        pathBuilder2.horizontalLineTo(48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineTo(80.0f);
        pathBuilder2.horizontalLineTo(24.27f);
        pathBuilder2.arcTo(8.17f, 8.17f, 0.0f, false, false, 16.0f, 87.47f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 96.0f);
        pathBuilder2.horizontalLineTo(40.0f);
        pathBuilder2.verticalLineToRelative(44.0f);
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder2.horizontalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder2.verticalLineTo(96.0f);
        pathBuilder2.horizontalLineToRelative(96.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.horizontalLineTo(192.0f);
        pathBuilder2.verticalLineToRelative(-7.73f);
        pathBuilder2.arcToRelative(8.18f, 8.18f, 0.0f, false, false, -7.47f, -8.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, 8.0f);
        pathBuilder2.verticalLineToRelative(8.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.verticalLineTo(96.0f);
        pathBuilder2.horizontalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.53f);
        pathBuilder2.arcTo(8.17f, 8.17f, 0.0f, false, false, 239.73f, 80.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 80.0f);
        pathBuilder2.verticalLineTo(48.0f);
        pathBuilder2.horizontalLineTo(75.06f);
        pathBuilder2.lineToRelative(16.0f, 32.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _craneTower = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
