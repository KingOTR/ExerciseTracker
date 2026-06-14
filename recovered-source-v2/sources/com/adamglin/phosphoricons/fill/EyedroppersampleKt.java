package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Eyedroppersample.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyedropperSample", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getEyedropperSample", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyedropperSample", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyedroppersampleKt {
    private static ImageVector _eyedropperSample;

    public static final ImageVector getEyedropperSample(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 67.3f);
        pathBuilder.arcToRelative(35.79f, 35.79f, 0.0f, false, false, -11.26f, -25.66f);
        pathBuilder.curveToRelative(-14.0f, -13.28f, -36.72f, -12.78f, -50.62f, 1.13f);
        pathBuilder.lineTo(138.8f, 66.2f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.14f, 0.77f);
        pathBuilder.lineToRelative(-5.0f, 5.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.64f);
        pathBuilder.lineToRelative(2.0f, 2.06f);
        pathBuilder.lineToRelative(-51.0f, 51.0f);
        pathBuilder.arcToRelative(39.75f, 39.75f, 0.0f, false, false, -10.53f, 38.0f);
        pathBuilder.lineToRelative(-8.0f, 18.41f);
        pathBuilder.arcTo(13.65f, 13.65f, 0.0f, false, false, 36.0f, 219.29f);
        pathBuilder.arcToRelative(15.9f, 15.9f, 0.0f, false, false, 17.71f, 3.36f);
        pathBuilder.lineTo(71.24f, 215.0f);
        pathBuilder.arcToRelative(39.9f, 39.9f, 0.0f, false, false, 37.05f, -10.75f);
        pathBuilder.lineToRelative(51.0f, -51.0f);
        pathBuilder.lineToRelative(2.06f, 2.06f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, 0.0f);
        pathBuilder.lineToRelative(5.0f, -5.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.74f, -33.18f);
        pathBuilder.lineToRelative(23.75f, -23.87f);
        pathBuilder.arcTo(35.75f, 35.75f, 0.0f, false, false, 224.0f, 67.3f);
        pathBuilder.close();
        pathBuilder.moveTo(138.0f, 152.0f);
        pathBuilder.horizontalLineTo(70.07f);
        pathBuilder.lineToRelative(44.0f, -44.0f);
        pathBuilder.lineToRelative(33.94f, 34.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyedropperSample = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
