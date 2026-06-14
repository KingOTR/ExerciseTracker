package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Webcamslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WebcamSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWebcamSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_webcamSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebcamslashKt {
    private static ImageVector _webcamSlash;

    public static final ImageVector getWebcamSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _webcamSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WebcamSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.44f, 212.0f);
        pathBuilder.lineTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(61.31f, 63.56f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, false, 122.0f, 181.75f);
        pathBuilder.lineTo(122.0f, 202.0f);
        pathBuilder.lineTo(32.0f, 202.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.lineTo(198.07f, 214.0f);
        pathBuilder.lineToRelative(5.49f, 6.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(120.77f, 129.0f);
        pathBuilder.arcToRelative(26.05f, 26.05f, 0.0f, false, true, -18.31f, -20.15f);
        pathBuilder.close();
        pathBuilder.moveTo(62.0f, 104.0f);
        pathBuilder.arcToRelative(65.6f, 65.6f, 0.0f, false, true, 7.78f, -31.12f);
        pathBuilder.lineTo(90.85f, 96.06f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 142.0f);
        pathBuilder.arcToRelative(37.59f, 37.59f, 0.0f, false, false, 4.38f, -0.26f);
        pathBuilder.lineToRelative(21.06f, 23.17f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, true, 62.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 202.0f);
        pathBuilder.lineTo(134.0f, 181.76f);
        pathBuilder.arcToRelative(78.27f, 78.27f, 0.0f, false, false, 27.93f, -7.51f);
        pathBuilder.lineTo(187.16f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(87.26f, 44.32f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.26f, -8.18f);
        pathBuilder.arcTo(78.0f, 78.0f, 0.0f, false, true, 191.89f, 148.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.82f, -6.89f);
        pathBuilder.arcTo(66.0f, 66.0f, 0.0f, false, false, 95.44f, 46.57f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 87.26f, 44.32f);
        pathBuilder.close();
        pathBuilder.moveTo(152.73f, 112.05f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, -30.4f, -33.43f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -2.6f, -11.72f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, true, 44.41f, 48.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.41f, -3.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _webcamSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
