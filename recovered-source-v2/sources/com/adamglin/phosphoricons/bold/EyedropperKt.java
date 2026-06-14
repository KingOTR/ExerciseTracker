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

/* compiled from: Eyedropper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Eyedropper", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEyedropper", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyedropper", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyedropperKt {
    private static ImageVector _eyedropper;

    public static final ImageVector getEyedropper(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eyedropper;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Eyedropper", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(228.0f, 67.24f);
        pathBuilder.arcToRelative(39.77f, 39.77f, 0.0f, false, false, -12.51f, -28.52f);
        pathBuilder.curveTo(199.91f, 24.0f, 174.71f, 24.5f, 159.29f, 39.93f);
        pathBuilder.lineTo(142.48f, 56.84f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -35.64f, 3.29f);
        pathBuilder.lineToRelative(-9.0f, 9.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.73f, 27.49f);
        pathBuilder.lineTo(48.9f, 144.84f);
        pathBuilder.arcTo(43.76f, 43.76f, 0.0f, false, false, 37.0f, 185.28f);
        pathBuilder.lineToRelative(-7.5f, 17.19f);
        pathBuilder.arcToRelative(17.66f, 17.66f, 0.0f, false, false, 3.71f, 19.65f);
        pathBuilder.arcToRelative(19.9f, 19.9f, 0.0f, false, false, 22.15f, 4.19f);
        pathBuilder.lineToRelative(16.31f, -7.13f);
        pathBuilder.arcToRelative(43.88f, 43.88f, 0.0f, false, false, 39.45f, -12.09f);
        pathBuilder.lineToRelative(48.24f, -48.26f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 27.47f, -0.73f);
        pathBuilder.lineToRelative(9.0f, -9.0f);
        pathBuilder.arcToRelative(28.06f, 28.06f, 0.0f, false, false, 3.26f, -35.72f);
        pathBuilder.lineToRelative(17.23f, -17.33f);
        pathBuilder.arcTo(39.69f, 39.69f, 0.0f, false, false, 228.0f, 67.24f);
        pathBuilder.close();
        pathBuilder.moveTo(94.15f, 190.11f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 5.0f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -8.32f, 0.47f);
        pathBuilder.lineTo(57.0f, 199.38f);
        pathBuilder.lineTo(60.69f, 191.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.37f, -8.64f);
        pathBuilder.arcToRelative(19.92f, 19.92f, 0.0f, false, true, 4.81f, -20.55f);
        pathBuilder.lineToRelative(48.2f, -48.22f);
        pathBuilder.lineToRelative(28.28f, 28.3f);
        pathBuilder.close();
        pathBuilder.moveTo(199.29f, 79.11f);
        pathBuilder.lineTo(173.92f, 104.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 16.95f);
        pathBuilder.lineToRelative(4.88f, 4.89f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.lineToRelative(-6.14f, 6.15f);
        pathBuilder.lineToRelative(-55.0f, -55.05f);
        pathBuilder.lineToRelative(6.14f, -6.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.65f, 0.0f);
        pathBuilder.lineTo(134.35f, 82.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, 3.51f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 151.34f, 82.0f);
        pathBuilder.lineToRelative(24.94f, -25.08f);
        pathBuilder.curveToRelative(6.3f, -6.3f, 16.48f, -6.63f, 22.71f, -0.74f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.3f, 23.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyedropper = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
