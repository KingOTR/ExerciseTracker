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

/* compiled from: Fan.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fan", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFan", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fan", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FanKt {
    private static ImageVector _fan;

    public static final ImageVector getFan(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fan;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fan", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.12f, 136.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, -86.0f, -31.56f);
        pathBuilder.arcToRelative(28.25f, 28.25f, 0.0f, false, false, -4.56f, -2.39f);
        pathBuilder.lineToRelative(17.27f, -68.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.72f, -4.34f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, true, false, 100.0f, 126.62f);
        pathBuilder.curveToRelative(0.0f, 0.46f, 0.0f, 0.92f, 0.0f, 1.38f);
        pathBuilder.arcToRelative(27.39f, 27.39f, 0.0f, false, false, 0.26f, 3.76f);
        pathBuilder.lineTo(31.91f, 151.28f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 29.0f, 154.94f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 41.45f, 56.62f);
        pathBuilder.arcToRelative(56.46f, 56.46f, 0.0f, false, false, 14.59f, 1.93f);
        pathBuilder.arcToRelative(56.07f, 56.07f, 0.0f, false, false, 55.73f, -60.59f);
        pathBuilder.arcToRelative(27.93f, 27.93f, 0.0f, false, false, 4.33f, -2.77f);
        pathBuilder.lineToRelative(51.09f, 49.44f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 199.0f, 200.7f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, 1.84f, -0.45f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 229.12f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 148.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 76.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 71.4f, -41.92f);
        pathBuilder.lineToRelative(-16.55f, 66.06f);
        pathBuilder.curveToRelative(-0.94f, -0.09f, -1.89f, -0.14f, -2.85f, -0.14f);
        pathBuilder.arcToRelative(28.06f, 28.06f, 0.0f, false, false, -26.34f, 18.49f);
        pathBuilder.arcTo(47.82f, 47.82f, 0.0f, false, true, 76.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(109.0f, 199.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, -72.0f, -40.87f);
        pathBuilder.lineToRelative(65.5f, -18.7f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 128.0f, 156.0f);
        pathBuilder.arcToRelative(28.81f, 28.81f, 0.0f, false, false, 4.94f, -0.44f);
        pathBuilder.arcTo(47.81f, 47.81f, 0.0f, false, true, 109.0f, 199.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.6f, 174.54f);
        pathBuilder.arcToRelative(47.93f, 47.93f, 0.0f, false, true, -17.0f, 17.22f);
        pathBuilder.lineToRelative(-49.0f, -47.37f);
        pathBuilder.arcToRelative(27.91f, 27.91f, 0.0f, false, false, -1.3f, -34.44f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 67.22f, 64.59f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fan = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
