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

/* compiled from: Pizza.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPizza", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pizza", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PizzaKt {
    private static ImageVector _pizza;

    public static final ImageVector getPizza(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _pizza;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Pizza", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(218.0f, 91.76f);
        pathBuilder.lineTo(187.13f, 142.4f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 154.0f, 196.78f);
        pathBuilder.lineToRelative(-19.13f, 31.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.7f, 0.0f);
        pathBuilder.lineTo(84.3f, 167.71f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -30.48f, -50.0f);
        pathBuilder.lineTo(38.0f, 91.76f);
        pathBuilder.arcToRelative(159.77f, 159.77f, 0.0f, false, true, 180.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.54f, 63.0f);
        pathBuilder2.arcToRelative(15.91f, 15.91f, 0.0f, false, false, -7.25f, -9.9f);
        pathBuilder2.arcToRelative(201.49f, 201.49f, 0.0f, false, false, -208.58f, 0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.37f, 22.0f);
        pathBuilder2.lineToRelative(96.0f, 157.27f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.36f, 0.0f);
        pathBuilder2.lineTo(194.0f, 146.53f);
        pathBuilder2.verticalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(43.61f, -71.45f);
        pathBuilder2.arcTo(15.82f, 15.82f, 0.0f, false, false, 239.54f, 63.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(63.59f, 118.5f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.47f, 40.09f);
        pathBuilder2.close();
        pathBuilder2.moveTo(151.51f, 185.45f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 145.37f);
        pathBuilder2.close();
        pathBuilder2.moveTo(184.44f, 131.52f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -41.38f, 67.77f);
        pathBuilder2.lineTo(128.0f, 224.0f);
        pathBuilder2.lineTo(96.5f, 172.43f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -41.35f, -67.76f);
        pathBuilder2.lineTo(48.8f, 94.26f);
        pathBuilder2.arcToRelative(152.0f, 152.0f, 0.0f, false, true, 158.39f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(215.54f, 80.59f);
        pathBuilder2.arcToRelative(168.12f, 168.12f, 0.0f, false, false, -175.08f, 0.0f);
        pathBuilder2.lineTo(32.0f, 66.77f);
        pathBuilder2.arcToRelative(185.6f, 185.6f, 0.0f, false, true, 192.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pizza = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
