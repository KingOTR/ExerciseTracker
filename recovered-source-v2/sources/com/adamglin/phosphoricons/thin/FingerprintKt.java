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

/* compiled from: Fingerprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fingerprint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFingerprint", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintKt {
    private static ImageVector _fingerprint;

    public static final ImageVector getFingerprint(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(68.0f, 128.0f);
        pathBuilder.arcTo(130.71f, 130.71f, 0.0f, false, true, 54.27f, 186.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, 2.22f);
        pathBuilder.arcToRelative(3.91f, 3.91f, 0.0f, false, true, -1.78f, -0.42f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, -5.36f);
        pathBuilder.arcTo(122.71f, 122.71f, 0.0f, false, false, 60.0f, 128.0f);
        pathBuilder.arcTo(67.74f, 67.74f, 0.0f, false, true, 85.5f, 74.92f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.0f, 6.25f);
        pathBuilder.arcTo(59.74f, 59.74f, 0.0f, false, false, 68.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 124.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.arcToRelative(188.1f, 188.1f, 0.0f, false, true, -23.48f, 91.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, 3.88f);
        pathBuilder.arcTo(196.22f, 196.22f, 0.0f, false, false, 132.0f, 128.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 124.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f);
        pathBuilder.arcToRelative(218.0f, 218.0f, 0.0f, false, true, -20.9f, 93.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.24f, 3.41f);
        pathBuilder.arcTo(226.0f, 226.0f, 0.0f, false, false, 164.0f, 128.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 28.0f, 128.0f);
        pathBuilder.arcToRelative(91.66f, 91.66f, 0.0f, false, true, -5.24f, 30.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.54f, 2.66f);
        pathBuilder.arcTo(99.66f, 99.66f, 0.0f, false, false, 36.0f, 128.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, false, true, 184.0f, 0.0f);
        pathBuilder.arcToRelative(286.37f, 286.37f, 0.0f, false, true, -5.37f, 55.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.15f, 4.69f);
        pathBuilder.arcToRelative(4.13f, 4.13f, 0.0f, false, false, 0.78f, 0.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.92f, -3.23f);
        pathBuilder.arcTo(294.25f, 294.25f, 0.0f, false, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(93.6f, 156.09f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.71f, 3.12f);
        pathBuilder.arcToRelative(155.0f, 155.0f, 0.0f, false, true, -17.66f, 46.64f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.93f, 4.0f);
        pathBuilder.arcToRelative(163.13f, 163.13f, 0.0f, false, false, 18.57f, -49.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 93.6f, 156.09f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 60.0f);
        pathBuilder.arcToRelative(68.79f, 68.79f, 0.0f, false, false, -8.5f, 0.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 7.93f);
        pathBuilder.arcTo(62.57f, 62.57f, 0.0f, false, true, 128.0f, 68.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, true, 60.0f, 60.0f);
        pathBuilder.arcToRelative(256.15f, 256.15f, 0.0f, false, true, -1.95f, 31.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.47f, 4.47f);
        pathBuilder.lineToRelative(0.5f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -3.51f);
        pathBuilder.arcTo(264.37f, 264.37f, 0.0f, false, false, 196.0f, 128.0f);
        pathBuilder.arcTo(68.08f, 68.08f, 0.0f, false, false, 128.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(184.93f, 188.12f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.87f, 2.88f);
        pathBuilder.curveToRelative(-1.49f, 5.78f, -3.21f, 11.58f, -5.1f, 17.23f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.58f, 2.54f);
        pathBuilder.curveToRelative(2.0f, -5.83f, 3.73f, -11.81f, 5.27f, -17.77f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 184.94f, 188.13f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
