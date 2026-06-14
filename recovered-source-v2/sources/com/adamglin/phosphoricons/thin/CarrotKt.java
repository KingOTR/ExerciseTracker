package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Carrot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Carrot", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCarrot", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_carrot", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CarrotKt {
    private static ImageVector _carrot;

    public static final ImageVector getCarrot(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(232.0f, 68.0f);
        pathBuilder.lineTo(193.66f, 68.0f);
        pathBuilder.lineToRelative(33.17f, -33.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineTo(188.0f, 62.34f);
        pathBuilder.lineTo(188.0f, 24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(180.0f, 64.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -78.39f, 5.54f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveToRelative(-17.12f, 16.79f, -34.51f, 45.72f, -51.7f, 86.0f);
        pathBuilder.curveToRelative(-11.93f, 28.0f, -19.61f, 52.0f, -20.59f, 55.09f);
        pathBuilder.arcTo(12.05f, 12.05f, 0.0f, false, false, 40.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.36f, -1.28f);
        pathBuilder.curveToRelative(3.12f, -1.0f, 27.13f, -8.65f, 55.09f, -20.59f);
        pathBuilder.curveToRelative(40.29f, -17.2f, 69.24f, -34.61f, 86.0f, -51.71f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, false, 192.0f, 76.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.74f, 148.79f);
        pathBuilder.curveToRelative(-9.76f, 10.0f, -23.42f, 19.39f, -38.37f, 27.91f);
        pathBuilder.lineToRelative(-27.54f, -27.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.65f);
        pathBuilder.lineToRelative(25.9f, 25.91f);
        pathBuilder.curveTo(92.61f, 203.55f, 43.34f, 219.0f, 42.64f, 219.18f);
        pathBuilder.arcToRelative(4.45f, 4.45f, 0.0f, false, false, -0.71f, 0.3f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, -5.41f);
        pathBuilder.arcToRelative(4.45f, 4.45f, 0.0f, false, false, 0.3f, -0.71f);
        pathBuilder.curveToRelative(0.29f, -1.0f, 29.72f, -95.0f, 67.62f, -135.27f);
        pathBuilder.lineToRelative(36.74f, 36.73f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.65f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.65f);
        pathBuilder.lineTo(110.18f, 72.52f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 70.56f, 76.27f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _carrot = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
