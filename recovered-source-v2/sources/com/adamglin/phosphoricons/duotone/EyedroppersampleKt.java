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

/* compiled from: Eyedroppersample.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyedropperSample", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getEyedropperSample", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyedropperSample", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyedroppersampleKt {
    private static ImageVector _eyedropperSample;

    public static final ImageVector getEyedropperSample(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _eyedropperSample;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyedropperSample", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.3f, 160.0f);
        pathBuilder.horizontalLineToRelative(89.0f);
        pathBuilder.lineToRelative(-38.62f, 38.63f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.06f, 8.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-20.0f, 8.74f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.86f, -1.67f);
        pathBuilder.arcToRelative(5.74f, 5.74f, 0.0f, false, true, -1.2f, -6.36f);
        pathBuilder.lineToRelative(9.19f, -21.06f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(32.07f, 32.07f, 0.0f, false, true, 52.3f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(207.23f, 47.51f);
        pathBuilder.curveToRelative(-11.07f, -10.49f, -28.65f, -9.83f, -39.44f, 1.0f);
        pathBuilder.lineToRelative(-25.0f, 25.1f);
        pathBuilder.lineToRelative(-4.89f, -4.88f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder.lineToRelative(-9.0f, 9.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f);
        pathBuilder.lineTo(167.0f, 149.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.31f, 0.0f);
        pathBuilder.lineToRelative(9.0f, -9.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f);
        pathBuilder.lineToRelative(-4.88f, -4.89f);
        pathBuilder.lineTo(207.8f, 87.66f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 207.23f, 47.51f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 67.3f);
        pathBuilder2.arcToRelative(35.79f, 35.79f, 0.0f, false, false, -11.26f, -25.66f);
        pathBuilder2.curveToRelative(-14.0f, -13.28f, -36.72f, -12.78f, -50.62f, 1.13f);
        pathBuilder2.lineTo(142.8f, 62.2f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.14f, 0.77f);
        pathBuilder2.lineToRelative(-9.0f, 9.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.64f);
        pathBuilder2.lineToRelative(2.0f, 2.06f);
        pathBuilder2.lineToRelative(-51.0f, 51.0f);
        pathBuilder2.arcToRelative(39.75f, 39.75f, 0.0f, false, false, -10.53f, 38.0f);
        pathBuilder2.lineToRelative(-8.0f, 18.41f);
        pathBuilder2.arcTo(13.65f, 13.65f, 0.0f, false, false, 36.0f, 219.29f);
        pathBuilder2.arcToRelative(15.9f, 15.9f, 0.0f, false, false, 17.71f, 3.36f);
        pathBuilder2.lineTo(71.24f, 215.0f);
        pathBuilder2.arcToRelative(39.9f, 39.9f, 0.0f, false, false, 37.05f, -10.75f);
        pathBuilder2.lineToRelative(51.0f, -51.0f);
        pathBuilder2.lineToRelative(2.06f, 2.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f);
        pathBuilder2.lineToRelative(9.0f, -9.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.74f, -33.18f);
        pathBuilder2.lineToRelative(19.75f, -19.87f);
        pathBuilder2.arcTo(35.75f, 35.75f, 0.0f, false, false, 224.0f, 67.3f);
        pathBuilder2.close();
        pathBuilder2.moveTo(97.0f, 193.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 6.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.55f, 0.31f);
        pathBuilder2.lineToRelative(-18.1f, 7.9f);
        pathBuilder2.lineTo(57.0f, 189.41f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.25f, -5.75f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.1f, -15.69f);
        pathBuilder2.lineTo(122.0f, 167.97f);
        pathBuilder2.close();
        pathBuilder2.moveTo(138.0f, 152.0f);
        pathBuilder2.lineTo(70.07f, 152.0f);
        pathBuilder2.lineToRelative(44.0f, -44.0f);
        pathBuilder2.lineToRelative(33.94f, 34.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(202.18f, 82.0f);
        pathBuilder2.lineTo(176.81f, 107.52f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 11.31f);
        pathBuilder2.lineToRelative(4.89f, 4.88f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.32f);
        pathBuilder2.lineToRelative(-9.0f, 9.0f);
        pathBuilder2.lineTo(112.0f, 83.26f);
        pathBuilder2.lineToRelative(9.0f, -9.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 0.0f);
        pathBuilder2.lineToRelative(4.89f, 4.89f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.65f, 2.34f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.36f);
        pathBuilder2.lineToRelative(24.94f, -25.09f);
        pathBuilder2.curveToRelative(7.81f, -7.82f, 20.5f, -8.18f, 28.29f, -0.81f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.39f, 28.7f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyedropperSample = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
