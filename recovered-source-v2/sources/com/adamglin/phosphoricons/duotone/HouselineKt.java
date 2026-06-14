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

/* compiled from: Houseline.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"HouseLine", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHouseLine", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_houseLine", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HouselineKt {
    private static ImageVector _houseLine;

    public static final ImageVector getHouseLine(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(216.0f, 116.69f);
        pathBuilder.verticalLineTo(216.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.verticalLineTo(152.0f);
        pathBuilder.horizontalLineTo(104.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(116.69f);
        pathBuilder.lineToRelative(82.34f, -82.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(240.0f, 208.0f);
        pathBuilder2.lineTo(224.0f, 208.0f);
        pathBuilder2.lineTo(224.0f, 136.0f);
        pathBuilder2.lineToRelative(2.34f, 2.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 237.66f, 127.0f);
        pathBuilder2.lineTo(139.31f, 28.68f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f);
        pathBuilder2.lineTo(18.34f, 127.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.31f);
        pathBuilder2.lineTo(32.0f, 136.0f);
        pathBuilder2.verticalLineToRelative(72.0f);
        pathBuilder2.lineTo(16.0f, 208.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.lineTo(240.0f, 224.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(48.0f, 120.0f);
        pathBuilder2.lineToRelative(80.0f, -80.0f);
        pathBuilder2.lineToRelative(80.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(88.0f);
        pathBuilder2.lineTo(160.0f, 208.0f);
        pathBuilder2.lineTo(160.0f, 152.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineTo(104.0f, 144.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.lineTo(48.0f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(144.0f, 208.0f);
        pathBuilder2.lineTo(112.0f, 208.0f);
        pathBuilder2.lineTo(112.0f, 160.0f);
        pathBuilder2.horizontalLineToRelative(32.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _houseLine = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
