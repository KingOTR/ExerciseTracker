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

/* compiled from: Fingerprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fingerprint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFingerprint", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintKt {
    private static ImageVector _fingerprint;

    public static final ImageVector getFingerprint(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fingerprint;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Fingerprint", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(126.42f, 24.0f);
        pathBuilder.curveTo(70.73f, 24.85f, 25.21f, 70.09f, 24.0f, 125.81f);
        pathBuilder.arcToRelative(103.53f, 103.53f, 0.0f, false, false, 13.52f, 53.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.1f, -0.3f);
        pathBuilder.arcToRelative(119.35f, 119.35f, 0.0f, false, false, 11.37f, -51.0f);
        pathBuilder.arcTo(71.77f, 71.77f, 0.0f, false, true, 83.0f, 71.83f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 9.86f, 12.61f);
        pathBuilder.arcTo(55.82f, 55.82f, 0.0f, false, false, 72.0f, 128.07f);
        pathBuilder.arcToRelative(135.28f, 135.28f, 0.0f, false, true, -18.45f, 68.35f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.61f, 4.85f);
        pathBuilder.curveToRelative(2.0f, 2.0f, 4.09f, 4.0f, 6.25f, 5.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.0f, -1.0f);
        pathBuilder.arcTo(151.18f, 151.18f, 0.0f, false, false, 85.0f, 158.49f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.68f, 3.19f);
        pathBuilder.arcToRelative(167.33f, 167.33f, 0.0f, false, true, -21.07f, 53.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.6f, 5.63f);
        pathBuilder.curveToRelative(2.47f, 1.25f, 5.0f, 2.41f, 7.57f, 3.47f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.0f, -1.61f);
        pathBuilder.arcTo(183.0f, 183.0f, 0.0f, false, false, 120.0f, 128.28f);
        pathBuilder.arcToRelative(8.16f, 8.16f, 0.0f, false, true, 7.44f, -8.21f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.56f, 8.0f);
        pathBuilder.arcToRelative(198.94f, 198.94f, 0.0f, false, true, -25.21f, 97.16f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.95f, 5.92f);
        pathBuilder.quadToRelative(4.55f, 0.63f, 9.21f, 0.86f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.67f, -2.1f);
        pathBuilder.arcTo(214.88f, 214.88f, 0.0f, false, false, 152.0f, 128.8f);
        pathBuilder.curveToRelative(0.05f, -13.25f, -10.3f, -24.49f, -23.54f, -24.74f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 104.0f, 128.0f);
        pathBuilder.arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.29f, 8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.71f, -8.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.42f, -40.0f);
        pathBuilder.curveToRelative(22.0f, 0.23f, 39.68f, 19.17f, 39.57f, 41.16f);
        pathBuilder.arcToRelative(231.37f, 231.37f, 0.0f, false, true, -20.52f, 94.57f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.62f, 5.51f);
        pathBuilder.arcToRelative(103.49f, 103.49f, 0.0f, false, false, 10.26f, -3.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.35f, -2.22f);
        pathBuilder.arcToRelative(243.76f, 243.76f, 0.0f, false, false, 11.48f, -34.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.5f, 4.0f);
        pathBuilder.quadToRelative(-1.12f, 4.37f, -2.4f, 8.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.46f, 4.17f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 126.42f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.0f, 161.08f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.92f, 7.0f);
        pathBuilder.arcToRelative(8.39f, 8.39f, 0.0f, false, true, -1.0f, -0.06f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.95f, -8.93f);
        pathBuilder.arcToRelative(252.57f, 252.57f, 0.0f, false, false, 1.92f, -31.0f);
        pathBuilder.arcToRelative(56.08f, 56.08f, 0.0f, false, false, -56.0f, -56.0f);
        pathBuilder.arcToRelative(56.78f, 56.78f, 0.0f, false, false, -7.0f, 0.43f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.0f, -15.89f);
        pathBuilder.arcToRelative(72.1f, 72.1f, 0.0f, false, true, 81.0f, 71.49f);
        pathBuilder.arcTo(266.93f, 266.93f, 0.0f, false, true, 198.0f, 161.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
