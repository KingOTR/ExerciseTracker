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

/* compiled from: Carrot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Carrot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCarrot", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carrot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarrotKt {
    private static ImageVector _carrot;

    public static final ImageVector getCarrot(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _carrot;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Carrot", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 80.0f);
        pathBuilder.horizontalLineTo(199.44f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, -10.19f, 77.26f);
        pathBuilder.curveToRelative(-8.52f, 8.69f, -19.61f, 16.92f, -31.85f, 24.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.91f, -0.59f);
        pathBuilder.lineToRelative(-34.84f, -34.84f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.49f, 0.18f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, false, 0.41f, 11.38f);
        pathBuilder.lineToRelative(29.88f, 29.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 6.39f);
        pathBuilder.curveTo(95.74f, 214.79f, 53.0f, 228.54f, 46.78f, 230.48f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -21.26f, -21.26f);
        pathBuilder.curveToRelative(2.73f, -8.71f, 29.0f, -90.27f, 64.86f, -133.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.9f, -0.26f);
        pathBuilder.lineToRelative(42.05f, 42.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.71f, -0.43f);
        pathBuilder.arcToRelative(8.19f, 8.19f, 0.0f, false, false, -0.6f, -11.1f);
        pathBuilder.lineTo(108.08f, 64.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.63f, -6.18f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 67.28f, -2.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.54f, -8.0f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 192.0f, 24.28f);
        pathBuilder.verticalLineTo(52.69f);
        pathBuilder.lineToRelative(26.34f, -26.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineTo(203.31f, 64.0f);
        pathBuilder.horizontalLineToRelative(28.41f);
        pathBuilder.arcTo(8.18f, 8.18f, 0.0f, false, true, 240.0f, 71.47f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carrot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
