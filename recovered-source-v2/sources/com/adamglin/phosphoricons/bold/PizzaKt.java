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

/* compiled from: Pizza.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Pizza", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPizza", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pizza", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PizzaKt {
    private static ImageVector _pizza;

    public static final ImageVector getPizza(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(243.43f, 62.05f);
        pathBuilder.arcToRelative(19.93f, 19.93f, 0.0f, false, false, -9.06f, -12.38f);
        pathBuilder.arcToRelative(205.51f, 205.51f, 0.0f, false, false, -212.74f, 0.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.7f, 27.48f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(96.0f, 157.26f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.2f, 0.0f);
        pathBuilder.lineToRelative(96.0f, -157.26f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, false, 243.43f, 62.05f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 44.0f);
        pathBuilder.arcToRelative(180.93f, 180.93f, 0.0f, false, true, 90.45f, 24.14f);
        pathBuilder.lineTo(210.0f, 82.0f);
        pathBuilder.arcTo(164.15f, 164.15f, 0.0f, false, false, 46.0f, 82.0f);
        pathBuilder.lineTo(37.55f, 68.14f);
        pathBuilder.arcTo(180.93f, 180.93f, 0.0f, false, true, 128.0f, 44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(83.88f, 144.06f);
        pathBuilder.lineToRelative(-20.74f, -34.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 128.0f);
        pathBuilder.arcTo(20.12f, 20.12f, 0.0f, false, true, 83.88f, 144.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 216.36f);
        pathBuilder.lineTo(96.44f, 164.65f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 91.8f, 88.72f);
        pathBuilder.arcToRelative(140.45f, 140.45f, 0.0f, false, true, 105.71f, 13.74f);
        pathBuilder.lineToRelative(-8.95f, 14.66f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, -45.75f, 75.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 156.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.0f, -18.32f);
        pathBuilder.lineToRelative(-20.64f, 33.83f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 156.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pizza = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
