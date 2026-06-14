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

/* compiled from: Fingerprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fingerprint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFingerprint", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintKt {
    private static ImageVector _fingerprint;

    public static final ImageVector getFingerprint(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(72.0f, 128.0f);
        pathBuilder2.arcToRelative(134.63f, 134.63f, 0.0f, false, true, -14.16f, 60.47f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.32f, -7.12f);
        pathBuilder2.arcTo(118.8f, 118.8f, 0.0f, false, false, 56.0f, 128.0f);
        pathBuilder2.arcTo(71.73f, 71.73f, 0.0f, false, true, 83.0f, 71.8f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 93.0f, 84.29f);
        pathBuilder2.arcTo(55.76f, 55.76f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.arcToRelative(184.12f, 184.12f, 0.0f, false, true, -23.0f, 89.1f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.0f, 7.76f);
        pathBuilder2.arcTo(200.19f, 200.19f, 0.0f, false, false, 136.0f, 128.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 120.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 88.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, 40.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 48.0f, 0.0f);
        pathBuilder2.arcToRelative(214.09f, 214.09f, 0.0f, false, true, -20.51f, 92.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 146.0f, 226.83f);
        pathBuilder2.arcTo(230.0f, 230.0f, 0.0f, false, false, 168.0f, 128.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 24.0f, 128.0f);
        pathBuilder2.arcToRelative(87.76f, 87.76f, 0.0f, false, true, -5.0f, 29.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.09f, 5.33f);
        pathBuilder2.arcTo(103.9f, 103.9f, 0.0f, false, false, 40.0f, 128.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, false, true, 176.0f, 0.0f);
        pathBuilder2.arcToRelative(282.24f, 282.24f, 0.0f, false, true, -5.29f, 54.45f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.3f, 9.4f);
        pathBuilder2.arcToRelative(8.22f, 8.22f, 0.0f, false, false, 1.55f, 0.15f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.84f, -6.45f);
        pathBuilder2.arcTo(298.37f, 298.37f, 0.0f, false, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.12f, 104.12f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(94.4f, 152.17f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 85.0f, 158.42f);
        pathBuilder2.arcToRelative(151.0f, 151.0f, 0.0f, false, true, -17.21f, 45.44f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f);
        pathBuilder2.arcToRelative(166.67f, 166.67f, 0.0f, false, false, 19.0f, -50.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 94.4f, 152.17f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 56.0f);
        pathBuilder2.arcToRelative(72.85f, 72.85f, 0.0f, false, false, -9.0f, 0.56f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.0f, 15.87f);
        pathBuilder2.arcTo(56.08f, 56.08f, 0.0f, false, true, 184.0f, 128.0f);
        pathBuilder2.arcToRelative(252.12f, 252.12f, 0.0f, false, true, -1.92f, 31.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 189.0f, 168.0f);
        pathBuilder2.arcToRelative(8.39f, 8.39f, 0.0f, false, false, 1.0f, 0.06f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.92f, -7.0f);
        pathBuilder2.arcToRelative(266.48f, 266.48f, 0.0f, false, false, 2.0f, -33.0f);
        pathBuilder2.arcTo(72.08f, 72.08f, 0.0f, false, false, 128.0f, 56.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(185.93f, 184.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.75f, 5.75f);
        pathBuilder2.curveToRelative(-1.46f, 5.69f, -3.15f, 11.4f, -5.0f, 17.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.0f, 10.13f);
        pathBuilder2.arcToRelative(7.88f, 7.88f, 0.0f, false, false, 2.55f, 0.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.58f, -5.46f);
        pathBuilder2.curveToRelative(2.0f, -5.92f, 3.79f, -12.0f, 5.35f, -18.05f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 185.94f, 184.26f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
