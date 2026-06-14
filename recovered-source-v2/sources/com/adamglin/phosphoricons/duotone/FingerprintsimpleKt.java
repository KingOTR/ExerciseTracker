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

/* compiled from: Fingerprintsimple.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FingerprintSimple", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getFingerprintSimple", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprintSimple", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintsimpleKt {
    private static ImageVector _fingerprintSimple;

    public static final ImageVector getFingerprintSimple(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder2.moveTo(184.0f, 128.0f);
        pathBuilder2.arcToRelative(246.64f, 246.64f, 0.0f, false, true, -18.54f, 94.24f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.4f, 5.0f);
        pathBuilder2.arcToRelative(8.19f, 8.19f, 0.0f, false, true, -3.0f, -0.6f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.36f, -10.45f);
        pathBuilder2.arcTo(230.67f, 230.67f, 0.0f, false, false, 168.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 88.0f);
        pathBuilder2.arcToRelative(40.06f, 40.06f, 0.0f, false, true, 29.81f, 13.33f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.92f, -10.67f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder2.arcToRelative(136.06f, 136.06f, 0.0f, false, true, -17.0f, 65.85f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.76f);
        pathBuilder2.arcTo(152.14f, 152.14f, 0.0f, false, false, 88.0f, 128.0f);
        pathBuilder2.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcToRelative(103.75f, 103.75f, 0.0f, false, false, -34.67f, 5.92f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 98.67f, 45.0f);
        pathBuilder2.arcTo(88.05f, 88.05f, 0.0f, false, true, 216.0f, 128.0f);
        pathBuilder2.arcToRelative(281.31f, 281.31f, 0.0f, false, true, -6.94f, 62.23f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.0f, 9.57f);
        pathBuilder2.arcToRelative(7.77f, 7.77f, 0.0f, false, false, 1.78f, 0.2f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.8f, -6.23f);
        pathBuilder2.arcTo(298.11f, 298.11f, 0.0f, false, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(69.31f, 62.42f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 58.64f, 50.49f);
        pathBuilder2.arcTo(104.16f, 104.16f, 0.0f, false, false, 24.0f, 128.0f);
        pathBuilder2.arcToRelative(87.29f, 87.29f, 0.0f, false, true, -8.0f, 36.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.54f, 6.68f);
        pathBuilder2.arcTo(103.17f, 103.17f, 0.0f, false, false, 40.0f, 128.0f);
        pathBuilder2.arcTo(88.13f, 88.13f, 0.0f, false, true, 69.31f, 62.42f);
        pathBuilder2.close();
        pathBuilder2.moveTo(113.89f, 200.74f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.6f, 3.93f);
        pathBuilder2.curveToRelative(-1.93f, 4.2f, -4.05f, 8.39f, -6.3f, 12.44f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 100.11f, 228.0f);
        pathBuilder2.arcToRelative(7.88f, 7.88f, 0.0f, false, false, 3.87f, 1.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.0f, -4.12f);
        pathBuilder2.curveToRelative(2.44f, -4.41f, 4.74f, -9.0f, 6.84f, -13.52f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 113.89f, 200.74f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.arcToRelative(185.07f, 185.07f, 0.0f, false, true, -5.79f, 46.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.75f, 9.74f);
        pathBuilder2.arcToRelative(8.12f, 8.12f, 0.0f, false, false, 2.0f, 0.25f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.74f, -6.0f);
        pathBuilder2.arcToRelative(200.68f, 200.68f, 0.0f, false, false, 6.3f, -50.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 120.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprintSimple = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
