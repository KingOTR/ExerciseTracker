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

/* compiled from: Eyeclosed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getEyeClosed", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeClosed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeclosedKt {
    private static ImageVector _eyeClosed;

    public static final ImageVector getEyeClosed(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _eyeClosed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeClosed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(226.0f, 171.47f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, 0.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -2.0f);
        pathBuilder.lineToRelative(-21.15f, -37.0f);
        pathBuilder.arcToRelative(120.0f, 120.0f, 0.0f, false, true, -41.91f, 19.53f);
        pathBuilder.lineTo(164.0f, 191.34f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, 4.6f);
        pathBuilder.arcToRelative(3.79f, 3.79f, 0.0f, false, true, -0.67f, 0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.94f, -3.34f);
        pathBuilder.lineToRelative(-6.41f, -38.5f);
        pathBuilder.arcToRelative(128.17f, 128.17f, 0.0f, false, true, -43.28f, 0.0f);
        pathBuilder.lineTo(100.0f, 192.66f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 196.0f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -0.67f, -0.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, -4.6f);
        pathBuilder.lineToRelative(6.48f, -38.83f);
        pathBuilder.arcTo(120.0f, 120.0f, 0.0f, false, true, 56.62f, 133.0f);
        pathBuilder.lineTo(35.47f, 170.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 32.0f, 172.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, -0.53f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 28.53f, 166.0f);
        pathBuilder.lineToRelative(21.68f, -37.94f);
        pathBuilder.arcToRelative(148.24f, 148.24f, 0.0f, false, true, -21.32f, -21.56f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.22f, -5.0f);
        pathBuilder.curveTo(52.25f, 122.71f, 82.29f, 148.0f, 128.0f, 148.0f);
        pathBuilder.reflectiveCurveToRelative(75.75f, -25.29f, 92.89f, -46.51f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.22f, 5.0f);
        pathBuilder.arcToRelative(148.24f, 148.24f, 0.0f, false, true, -21.32f, 21.56f);
        pathBuilder.lineTo(227.47f, 166.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 226.0f, 171.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeClosed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
