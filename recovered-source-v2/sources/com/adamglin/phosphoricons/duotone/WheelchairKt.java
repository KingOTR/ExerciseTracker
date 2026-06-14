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

/* compiled from: Wheelchair.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Wheelchair", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWheelchair", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_wheelchair", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WheelchairKt {
    private static ImageVector _wheelchair;

    public static final ImageVector getWheelchair(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _wheelchair;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Wheelchair", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 48.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(255.59f, 189.47f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.12f, -5.06f);
        pathBuilder2.lineToRelative(-17.42f, 5.81f);
        pathBuilder2.lineToRelative(-28.9f, -57.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 192.0f, 128.0f);
        pathBuilder2.horizontalLineTo(112.0f);
        pathBuilder2.verticalLineTo(104.0f);
        pathBuilder2.horizontalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.horizontalLineTo(112.0f);
        pathBuilder2.verticalLineTo(79.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -16.0f, 0.0f);
        pathBuilder2.verticalLineTo(89.81f);
        pathBuilder2.arcTo(72.0f, 72.0f, 0.0f, false, false, 112.0f, 232.0f);
        pathBuilder2.curveToRelative(33.52f, 0.0f, 63.69f, -22.71f, 71.75f, -54.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.5f, -4.0f);
        pathBuilder2.curveTo(162.09f, 198.0f, 137.91f, 216.0f, 112.0f, 216.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 96.0f, 106.34f);
        pathBuilder2.verticalLineTo(136.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f);
        pathBuilder2.horizontalLineToRelative(83.05f);
        pathBuilder2.lineToRelative(29.79f, 59.58f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.69f, 4.0f);
        pathBuilder2.lineToRelative(24.0f, -8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 255.59f, 189.47f);
        pathBuilder2.close();
        pathBuilder2.moveTo(88.0f, 48.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 48.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _wheelchair = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
