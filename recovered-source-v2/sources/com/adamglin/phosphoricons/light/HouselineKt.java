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

/* compiled from: Houseline.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HouseLine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getHouseLine", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_houseLine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HouselineKt {
    private static ImageVector _houseLine;

    public static final ImageVector getHouseLine(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _houseLine;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("HouseLine", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 210.0f);
        pathBuilder.horizontalLineTo(222.0f);
        pathBuilder.verticalLineTo(131.17f);
        pathBuilder.lineToRelative(5.76f, 5.76f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.49f);
        pathBuilder.lineTo(137.9f, 30.09f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(19.76f, 128.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.49f);
        pathBuilder.lineTo(34.0f, 131.17f);
        pathBuilder.verticalLineTo(210.0f);
        pathBuilder.horizontalLineTo(16.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineTo(240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 119.17f);
        pathBuilder.lineToRelative(80.58f, -80.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.84f, 0.0f);
        pathBuilder.lineTo(210.0f, 119.17f);
        pathBuilder.verticalLineTo(210.0f);
        pathBuilder.horizontalLineTo(158.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(58.0f);
        pathBuilder.horizontalLineTo(46.0f);
        pathBuilder.close();
        pathBuilder.moveTo(146.0f, 210.0f);
        pathBuilder.horizontalLineTo(110.0f);
        pathBuilder.verticalLineTo(158.0f);
        pathBuilder.horizontalLineToRelative(36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _houseLine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
