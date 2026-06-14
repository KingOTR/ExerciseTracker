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

/* compiled from: Eyeslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getEyeSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeslashKt {
    private static ImageVector _eyeSlash;

    public static final ImageVector getEyeSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _eyeSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineToRelative(16.0f, 17.65f);
        pathBuilder.curveTo(20.67f, 88.66f, 5.72f, 121.58f, 5.0f, 123.13f);
        pathBuilder.arcToRelative(12.08f, 12.08f, 0.0f, false, false, 0.0f, 9.75f);
        pathBuilder.curveToRelative(0.37f, 0.82f, 9.13f, 20.26f, 28.49f, 39.61f);
        pathBuilder.curveTo(59.37f, 198.34f, 92.0f, 212.0f, 128.0f, 212.0f);
        pathBuilder.arcToRelative(131.34f, 131.34f, 0.0f, false, false, 51.0f, -10.0f);
        pathBuilder.lineToRelative(20.09f, 22.1f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 188.0f);
        pathBuilder.curveToRelative(-29.59f, 0.0f, -55.47f, -10.73f, -76.91f, -31.88f);
        pathBuilder.arcTo(130.69f, 130.69f, 0.0f, false, true, 29.52f, 128.0f);
        pathBuilder.curveToRelative(5.27f, -9.31f, 18.79f, -29.9f, 42.0f, -44.29f);
        pathBuilder.lineToRelative(90.09f, 99.11f);
        pathBuilder.arcTo(109.33f, 109.33f, 0.0f, false, true, 128.0f, 188.0f);
        pathBuilder.close();
        pathBuilder.moveTo(251.0f, 132.88f);
        pathBuilder.curveToRelative(-0.36f, 0.81f, -9.0f, 20.0f, -28.0f, 39.16f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -16.9f);
        pathBuilder.arcTo(130.48f, 130.48f, 0.0f, false, false, 226.48f, 128.0f);
        pathBuilder.arcToRelative(130.36f, 130.36f, 0.0f, false, false, -21.57f, -28.12f);
        pathBuilder.curveTo(183.46f, 78.73f, 157.59f, 68.0f, 128.0f, 68.0f);
        pathBuilder.curveToRelative(-3.35f, 0.0f, -6.7f, 0.14f, -10.0f, 0.42f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -2.0f, -23.91f);
        pathBuilder.curveToRelative(3.93f, -0.34f, 8.0f, -0.51f, 12.0f, -0.51f);
        pathBuilder.curveToRelative(36.0f, 0.0f, 68.63f, 13.67f, 94.49f, 39.52f);
        pathBuilder.curveToRelative(19.35f, 19.35f, 28.11f, 38.8f, 28.48f, 39.61f);
        pathBuilder.arcTo(12.08f, 12.08f, 0.0f, false, true, 251.0f, 132.88f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
