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

/* compiled from: Windmill.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Windmill", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getWindmill", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_windmill", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindmillKt {
    private static ImageVector _windmill;

    public static final ImageVector getWindmill(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _windmill;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Windmill", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 224.0f);
        pathBuilder.lineTo(182.94f, 224.0f);
        pathBuilder.lineToRelative(-6.3f, -44.12f);
        pathBuilder.lineToRelative(3.24f, 1.91f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.91f, -5.67f);
        pathBuilder.lineToRelative(12.0f, -20.34f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.91f);
        pathBuilder.lineToRelative(-35.0f, -20.61f);
        pathBuilder.lineToRelative(40.69f, -69.13f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.67f, -21.91f);
        pathBuilder.lineToRelative(-20.34f, -12.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f);
        pathBuilder.lineToRelative(-20.61f, 35.0f);
        pathBuilder.lineTo(76.12f, 10.22f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -21.91f, 5.67f);
        pathBuilder.lineToRelative(-12.0f, 20.33f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.92f);
        pathBuilder.lineToRelative(35.0f, 20.61f);
        pathBuilder.lineTo(42.21f, 147.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 5.67f, 21.91f);
        pathBuilder.lineToRelative(20.34f, 12.0f);
        pathBuilder.arcToRelative(15.57f, 15.57f, 0.0f, false, false, 10.58f, 2.0f);
        pathBuilder.lineTo(73.06f, 224.0f);
        pathBuilder.lineTo(32.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.lineTo(224.0f, 240.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 147.66f);
        pathBuilder.lineTo(188.0f, 168.0f);
        pathBuilder.lineToRelative(-69.13f, -40.69f);
        pathBuilder.lineToRelative(12.0f, -20.35f);
        pathBuilder.close();
        pathBuilder.moveTo(179.66f, 24.0f);
        pathBuilder.lineTo(200.0f, 36.0f);
        pathBuilder.lineToRelative(-40.69f, 69.14f);
        pathBuilder.lineTo(139.0f, 93.17f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 44.35f);
        pathBuilder.lineTo(68.0f, 24.0f);
        pathBuilder.lineTo(137.14f, 64.7f);
        pathBuilder.lineToRelative(-12.0f, 20.35f);
        pathBuilder.close();
        pathBuilder.moveTo(76.34f, 168.0f);
        pathBuilder.lineTo(56.0f, 156.0f);
        pathBuilder.lineTo(96.69f, 86.86f);
        pathBuilder.lineToRelative(20.36f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(89.22f, 224.0f);
        pathBuilder.lineTo(98.0f, 162.8f);
        pathBuilder.lineToRelative(12.77f, -21.7f);
        pathBuilder.lineTo(159.0f, 169.5f);
        pathBuilder.lineToRelative(7.79f, 54.5f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _windmill = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
