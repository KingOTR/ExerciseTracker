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

/* compiled from: Lightbulb.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lightbulb", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLightbulb", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lightbulb", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LightbulbKt {
    private static ImageVector _lightbulb;

    public static final ImageVector getLightbulb(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _lightbulb;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Lightbulb", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.0f, 232.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(88.0f, 244.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 232.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 104.0f);
        pathBuilder.arcToRelative(91.51f, 91.51f, 0.0f, false, true, -35.17f, 72.35f);
        pathBuilder.arcTo(12.26f, 12.26f, 0.0f, false, false, 180.0f, 186.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(96.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.7f, -9.51f);
        pathBuilder.arcTo(91.57f, 91.57f, 0.0f, false, true, 36.0f, 104.52f);
        pathBuilder.curveTo(35.73f, 54.69f, 76.0f, 13.2f, 125.79f, 12.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, true, 220.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.0f, 104.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, -69.65f, -68.0f);
        pathBuilder.curveTo(89.56f, 36.88f, 59.8f, 67.55f, 60.0f, 104.38f);
        pathBuilder.arcToRelative(67.71f, 67.71f, 0.0f, false, false, 26.1f, 53.19f);
        pathBuilder.arcTo(35.87f, 35.87f, 0.0f, false, true, 100.0f, 184.0f);
        pathBuilder.horizontalLineToRelative(56.1f);
        pathBuilder.arcTo(36.13f, 36.13f, 0.0f, false, true, 170.0f, 157.49f);
        pathBuilder.arcTo(67.68f, 67.68f, 0.0f, false, false, 196.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.93f, 98.68f);
        pathBuilder.arcToRelative(48.5f, 48.5f, 0.0f, false, false, -31.91f, -40.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, 22.62f);
        pathBuilder.arcToRelative(24.31f, 24.31f, 0.0f, false, true, 16.09f, 20.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.86f, -2.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lightbulb = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
