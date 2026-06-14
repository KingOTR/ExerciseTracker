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

/* compiled from: Flagcheckered.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlagCheckered", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFlagCheckered", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flagCheckered", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagcheckeredKt {
    private static ImageVector _flagCheckered;

    public static final ImageVector getFlagCheckered(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _flagCheckered;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlagCheckered", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.66f, 52.44f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.28f, 0.61f);
        pathBuilder.curveToRelative(-30.0f, 26.0f, -56.0f, 13.08f, -83.61f, -0.56f);
        pathBuilder.curveToRelative(-28.7f, -14.2f, -58.38f, -28.88f, -92.39f, 0.56f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.38f, 3.0f);
        pathBuilder.lineTo(44.0f, 224.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(52.0f, 177.87f);
        pathBuilder.curveToRelative(29.41f, -24.39f, 55.08f, -11.69f, 82.23f, 1.74f);
        pathBuilder.curveToRelative(28.7f, 14.19f, 58.38f, 28.88f, 92.39f, -0.56f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.38f, -3.0f);
        pathBuilder.verticalLineToRelative(-120.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 225.66f, 52.44f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 64.32f);
        pathBuilder.lineTo(220.0f, 114.2f);
        pathBuilder.curveToRelative(-16.91f, 14.0f, -32.58f, 15.79f, -48.0f, 12.2f);
        pathBuilder.lineTo(172.0f, 74.67f);
        pathBuilder.curveTo(187.24f, 77.9f, 203.09f, 76.37f, 220.0f, 64.32f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 72.55f);
        pathBuilder.verticalLineToRelative(51.54f);
        pathBuilder.curveToRelative(-8.7f, -3.0f, -17.39f, -7.25f, -26.23f, -11.62f);
        pathBuilder.curveToRelative(-9.76f, -4.84f, -19.64f, -9.72f, -29.77f, -12.91f);
        pathBuilder.lineTo(108.0f, 48.0f);
        pathBuilder.curveToRelative(8.7f, 3.0f, 17.39f, 7.25f, 26.23f, 11.62f);
        pathBuilder.curveTo(144.0f, 64.49f, 153.87f, 69.37f, 164.0f, 72.55f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 45.73f);
        pathBuilder.lineTo(100.0f, 97.44f);
        pathBuilder.curveToRelative(-15.24f, -3.23f, -31.09f, -1.69f, -48.0f, 10.37f);
        pathBuilder.lineTo(52.0f, 57.93f);
        pathBuilder.curveTo(68.91f, 43.9f, 84.58f, 42.15f, 100.0f, 45.73f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 167.78f);
        pathBuilder.lineTo(52.0f, 117.9f);
        pathBuilder.curveToRelative(16.91f, -14.0f, 32.58f, -15.79f, 48.0f, -12.2f);
        pathBuilder.verticalLineToRelative(51.72f);
        pathBuilder.arcTo(64.48f, 64.48f, 0.0f, false, false, 86.64f, 156.0f);
        pathBuilder.curveTo(75.52f, 156.0f, 64.0f, 159.2f, 52.0f, 167.78f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 159.55f);
        pathBuilder.lineTo(108.0f, 108.0f);
        pathBuilder.curveToRelative(8.71f, 3.0f, 17.39f, 7.25f, 26.23f, 11.62f);
        pathBuilder.curveToRelative(9.76f, 4.83f, 19.64f, 9.71f, 29.77f, 12.89f);
        pathBuilder.verticalLineToRelative(51.54f);
        pathBuilder.curveToRelative(-8.71f, -3.0f, -17.39f, -7.25f, -26.23f, -11.62f);
        pathBuilder.curveTo(128.0f, 167.61f, 118.13f, 162.73f, 108.0f, 159.55f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 186.37f);
        pathBuilder.lineTo(172.0f, 134.65f);
        pathBuilder.arcToRelative(64.48f, 64.48f, 0.0f, false, false, 13.36f, 1.47f);
        pathBuilder.curveToRelative(11.12f, 0.0f, 22.61f, -3.27f, 34.64f, -11.85f);
        pathBuilder.verticalLineToRelative(49.9f);
        pathBuilder.curveTo(203.09f, 188.19f, 187.42f, 190.0f, 172.0f, 186.37f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flagCheckered = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
