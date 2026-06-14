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

/* compiled from: Horse.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Horse", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getHorse", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_horse", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorseKt {
    private static ImageVector _horse;

    public static final ImageVector getHorse(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _horse;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Horse", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 129.37f);
        pathBuilder.curveToRelative(-0.72f, 51.48f, -42.57f, 93.59f, -94.05f, 94.61f);
        pathBuilder.arcToRelative(98.08f, 98.08f, 0.0f, false, true, -37.81f, -6.66f);
        pathBuilder.lineTo(128.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-26.64f, -16.0f, -57.23f, -11.3f, -74.7f, -8.34f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 29.79f, 150.0f);
        pathBuilder.lineTo(16.0f, 128.0f);
        pathBuilder.lineTo(120.0f, 64.0f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 129.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(136.0f, 100.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 100.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 129.48f);
        pathBuilder2.arcTo(104.29f, 104.29f, 0.0f, false, true, 130.1f, 232.0f);
        pathBuilder2.lineToRelative(-2.17f, 0.0f);
        pathBuilder2.arcToRelative(103.32f, 103.32f, 0.0f, false, true, -69.26f, -26.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 69.34f, 194.0f);
        pathBuilder2.arcToRelative(84.71f, 84.71f, 0.0f, false, false, 20.1f, 13.37f);
        pathBuilder2.lineTo(116.0f, 170.84f);
        pathBuilder2.curveToRelative(-22.78f, -9.83f, -47.47f, -5.65f, -61.4f, -3.29f);
        pathBuilder2.arcTo(31.84f, 31.84f, 0.0f, false, true, 23.3f, 154.72f);
        pathBuilder2.lineToRelative(-0.3f, -0.43f);
        pathBuilder2.lineToRelative(-13.78f, -22.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.59f, -11.05f);
        pathBuilder2.lineTo(112.0f, 59.53f);
        pathBuilder2.lineTo(112.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(8.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 129.48f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 129.26f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 128.0f, 40.0f);
        pathBuilder2.lineTo(128.0f, 64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.81f, 6.81f);
        pathBuilder2.lineTo(27.06f, 130.59f);
        pathBuilder2.lineToRelative(9.36f, 15.0f);
        pathBuilder2.arcTo(15.92f, 15.92f, 0.0f, false, false, 52.0f, 151.77f);
        pathBuilder2.curveToRelative(16.0f, -2.7f, 48.77f, -8.24f, 78.07f, 8.18f);
        pathBuilder2.arcTo(40.06f, 40.06f, 0.0f, false, false, 168.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(56.07f, 56.07f, 0.0f, false, true, -51.8f, 55.83f);
        pathBuilder2.lineToRelative(-27.11f, 37.28f);
        pathBuilder2.arcTo(90.89f, 90.89f, 0.0f, false, false, 129.78f, 216.0f);
        pathBuilder2.arcTo(88.29f, 88.29f, 0.0f, false, false, 216.0f, 129.26f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _horse = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
