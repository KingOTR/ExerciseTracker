package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Pizza.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPizza", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pizza", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PizzaKt {
    private static ImageVector _pizza;

    public static final ImageVector getPizza(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(239.54f, 63.0f);
        pathBuilder.arcToRelative(15.91f, 15.91f, 0.0f, false, false, -7.25f, -9.9f);
        pathBuilder.arcToRelative(201.49f, 201.49f, 0.0f, false, false, -208.58f, 0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.37f, 22.0f);
        pathBuilder.lineToRelative(96.0f, 157.27f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.36f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -157.27f);
        pathBuilder.arcTo(15.82f, 15.82f, 0.0f, false, false, 239.54f, 63.0f);
        pathBuilder.close();
        pathBuilder.moveTo(63.59f, 118.5f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.47f, 40.09f);
        pathBuilder.close();
        pathBuilder.moveTo(151.51f, 185.45f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 176.0f, 145.37f);
        pathBuilder.close();
        pathBuilder.moveTo(184.44f, 131.52f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -41.38f, 67.77f);
        pathBuilder.lineTo(128.0f, 224.0f);
        pathBuilder.lineTo(96.5f, 172.43f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -41.35f, -67.76f);
        pathBuilder.lineTo(48.8f, 94.26f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, 158.39f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(215.54f, 80.59f);
        pathBuilder.arcToRelative(168.12f, 168.12f, 0.0f, false, false, -175.08f, 0.0f);
        pathBuilder.lineTo(32.0f, 66.77f);
        pathBuilder.arcToRelative(185.6f, 185.6f, 0.0f, false, true, 192.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pizza = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
