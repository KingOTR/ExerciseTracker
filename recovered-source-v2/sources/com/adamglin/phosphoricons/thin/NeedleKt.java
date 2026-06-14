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

/* compiled from: Needle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Needle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getNeedle", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_needle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NeedleKt {
    private static ImageVector _needle;

    public static final ImageVector getNeedle(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _needle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Needle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(186.83f, 69.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.lineToRelative(-16.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 186.83f, 69.17f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 72.0f);
        pathBuilder.arcToRelative(35.76f, 35.76f, 0.0f, false, true, -10.54f, 25.46f);
        pathBuilder.lineToRelative(-24.0f, 24.0f);
        pathBuilder.arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.16f, 1.11f);
        pathBuilder.curveToRelative(-21.65f, 3.72f, -52.74f, 21.46f, -89.91f, 51.33f);
        pathBuilder.curveToRelative(-28.34f, 22.77f, -50.34f, 44.71f, -50.56f, 44.93f);
        pathBuilder.lineToRelative(-0.24f, 0.22f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.42f, -5.88f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.curveTo(37.39f, 213.0f, 59.33f, 191.0f, 82.1f, 162.61f);
        pathBuilder.curveTo(112.0f, 125.44f, 129.71f, 94.35f, 133.43f, 72.7f);
        pathBuilder.arcToRelative(4.05f, 4.05f, 0.0f, false, true, 1.11f, -2.16f);
        pathBuilder.lineToRelative(24.0f, -24.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 220.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 72.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, -47.8f, -19.8f);
        pathBuilder.lineTo(141.08f, 75.32f);
        pathBuilder.curveToRelative(-5.33f, 28.0f, -29.48f, 63.42f, -52.51f, 92.11f);
        pathBuilder.curveToRelative(28.69f, -23.0f, 64.16f, -47.18f, 92.11f, -52.52f);
        pathBuilder.lineTo(203.8f, 91.8f);
        pathBuilder.arcTo(27.81f, 27.81f, 0.0f, false, false, 212.0f, 72.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _needle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
