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

/* compiled from: Popcorn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Popcorn", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPopcorn", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_popcorn", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PopcornKt {
    private static ImageVector _popcorn;

    public static final ImageVector getPopcorn(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _popcorn;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Popcorn", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(88.0f, 96.0f);
        pathBuilder.lineToRelative(16.0f, 120.0f);
        pathBuilder.lineTo(70.34f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.79f, -6.17f);
        pathBuilder.lineTo(32.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 96.0f);
        pathBuilder.lineTo(152.0f, 216.0f);
        pathBuilder.horizontalLineToRelative(33.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.79f, -6.17f);
        pathBuilder.lineTo(224.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(229.52f, 74.21f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.13f, -2.0f);
        pathBuilder2.arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 41.67f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -80.0f, 0.0f);
        pathBuilder2.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -54.4f, 30.51f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.4f, 9.65f);
        pathBuilder2.lineTo(54.76f, 211.67f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 70.34f, 224.0f);
        pathBuilder2.lineTo(185.66f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.58f, -12.33f);
        pathBuilder2.lineTo(231.79f, 81.83f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 229.52f, 74.21f);
        pathBuilder2.close();
        pathBuilder2.moveTo(76.0f, 56.0f);
        pathBuilder2.arcToRelative(27.68f, 27.68f, 0.0f, false, true, 13.11f, 3.26f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.56f, -5.34f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 54.66f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.56f, 5.34f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 207.0f, 76.54f);
        pathBuilder2.lineToRelative(-38.56f, 11.0f);
        pathBuilder2.lineToRelative(-34.49f, -13.8f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -11.88f, 0.0f);
        pathBuilder2.lineTo(87.57f, 87.56f);
        pathBuilder2.lineTo(49.0f, 76.54f);
        pathBuilder2.arcTo(28.0f, 28.0f, 0.0f, false, true, 76.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(159.25f, 101.11f);
        pathBuilder2.lineTo(145.0f, 208.0f);
        pathBuilder2.lineTo(111.0f, 208.0f);
        pathBuilder2.lineTo(96.75f, 101.11f);
        pathBuilder2.lineTo(128.0f, 88.62f);
        pathBuilder2.close();
        pathBuilder2.moveTo(42.91f, 91.44f);
        pathBuilder2.lineToRelative(37.85f, 10.81f);
        pathBuilder2.lineTo(94.86f, 208.0f);
        pathBuilder2.lineTo(70.34f, 208.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(185.66f, 208.0f);
        pathBuilder2.lineTo(161.14f, 208.0f);
        pathBuilder2.lineToRelative(14.1f, -105.75f);
        pathBuilder2.lineToRelative(37.85f, -10.81f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _popcorn = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
