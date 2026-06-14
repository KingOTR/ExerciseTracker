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

/* compiled from: Fingerprintsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FingerprintSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFingerprintSimple", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprintSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintsimpleKt {
    private static ImageVector _fingerprintSimple;

    public static final ImageVector getFingerprintSimple(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _fingerprintSimple;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FingerprintSimple", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(126.41f, 24.0f);
        pathBuilder.curveTo(70.72f, 24.85f, 25.21f, 70.07f, 24.0f, 125.75f);
        pathBuilder.arcToRelative(103.48f, 103.48f, 0.0f, false, false, 13.51f, 53.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.1f, -0.29f);
        pathBuilder.arcTo(119.29f, 119.29f, 0.0f, false, false, 56.0f, 128.0f);
        pathBuilder.arcTo(71.93f, 71.93f, 0.0f, false, true, 73.74f, 80.67f);
        pathBuilder.arcToRelative(8.22f, 8.22f, 0.0f, false, true, 10.8f, -1.59f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 86.0f, 91.0f);
        pathBuilder.arcToRelative(55.92f, 55.92f, 0.0f, false, false, -14.0f, 37.0f);
        pathBuilder.arcToRelative(135.12f, 135.12f, 0.0f, false, true, -18.44f, 68.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.61f, 4.85f);
        pathBuilder.arcTo(104.33f, 104.33f, 0.0f, false, false, 67.0f, 212.21f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 72.82f, 211.0f);
        pathBuilder.arcTo(159.58f, 159.58f, 0.0f, false, false, 84.0f, 189.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.8f, 6.1f);
        pathBuilder.arcToRelative(176.9f, 176.9f, 0.0f, false, true, -11.85f, 23.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, 5.74f);
        pathBuilder.arcToRelative(103.46f, 103.46f, 0.0f, false, false, 25.0f, 6.7f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.07f, -2.0f);
        pathBuilder.arcToRelative(206.86f, 206.86f, 0.0f, false, false, 25.57f, -85.61f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.95f, 1.16f);
        pathBuilder.arcToRelative(222.83f, 222.83f, 0.0f, false, true, -21.58f, 80.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.08f, 5.74f);
        pathBuilder.arcToRelative(103.72f, 103.72f, 0.0f, false, false, 20.6f, -4.95f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.35f, -2.23f);
        pathBuilder.arcTo(247.29f, 247.29f, 0.0f, false, false, 184.0f, 129.76f);
        pathBuilder.curveToRelative(0.22f, -30.64f, -23.4f, -56.67f, -54.0f, -57.73f);
        pathBuilder.arcToRelative(56.72f, 56.72f, 0.0f, false, false, -16.0f, 1.73f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.84f, -6.21f);
        pathBuilder.arcToRelative(8.23f, 8.23f, 0.0f, false, true, 6.29f, -9.39f);
        pathBuilder.arcTo(72.05f, 72.05f, 0.0f, false, true, 200.0f, 128.0f);
        pathBuilder.arcToRelative(264.82f, 264.82f, 0.0f, false, true, -10.66f, 74.63f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.47f, 4.15f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 126.41f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 96.0f);
        pathBuilder.arcToRelative(32.05f, 32.05f, 0.0f, false, true, 23.85f, 10.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.24f, 11.79f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, -10.88f, -1.34f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.78f, -4.3f);
        pathBuilder.arcToRelative(16.39f, 16.39f, 0.0f, false, false, -11.0f, 15.67f);
        pathBuilder.arcToRelative(176.89f, 176.89f, 0.0f, false, true, -3.19f, 33.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 101.0f, 168.0f);
        pathBuilder.arcToRelative(7.69f, 7.69f, 0.0f, false, true, -1.5f, -0.14f);
        pathBuilder.arcToRelative(8.3f, 8.3f, 0.0f, false, true, -6.31f, -9.66f);
        pathBuilder.arcTo(161.12f, 161.12f, 0.0f, false, false, 96.0f, 128.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprintSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
