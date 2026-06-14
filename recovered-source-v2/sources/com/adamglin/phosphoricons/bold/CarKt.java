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

/* compiled from: Car.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Car", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCar", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_car", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarKt {
    private static ImageVector _car;

    public static final ImageVector getCar(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _car;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Car", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(240.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(-8.2f);
        pathBuilder.lineTo(205.08f, 39.88f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 186.8f, 28.0f);
        pathBuilder.lineTo(69.2f, 28.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 50.92f, 39.88f);
        pathBuilder.lineTo(24.2f, 100.0f);
        pathBuilder.lineTo(16.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(76.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(68.0f, 220.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(88.0f, 180.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.horizontalLineToRelative(28.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(236.0f, 124.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(71.8f, 52.0f);
        pathBuilder.lineTo(184.2f, 52.0f);
        pathBuilder.lineToRelative(21.33f, 48.0f);
        pathBuilder.lineTo(50.47f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 196.0f);
        pathBuilder.lineTo(44.0f, 196.0f);
        pathBuilder.lineTo(44.0f, 180.0f);
        pathBuilder.lineTo(64.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 196.0f);
        pathBuilder.lineTo(192.0f, 180.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 156.0f);
        pathBuilder.lineTo(44.0f, 156.0f);
        pathBuilder.lineTo(44.0f, 124.0f);
        pathBuilder.lineTo(212.0f, 124.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _car = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
