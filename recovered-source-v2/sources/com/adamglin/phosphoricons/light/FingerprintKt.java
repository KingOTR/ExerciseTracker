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

/* compiled from: Fingerprint.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Fingerprint", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFingerprint", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fingerprint", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FingerprintKt {
    private static ImageVector _fingerprint;

    public static final ImageVector getFingerprint(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(70.0f, 128.0f);
        pathBuilder.arcToRelative(132.68f, 132.68f, 0.0f, false, true, -14.0f, 59.58f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.38f, 3.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.36f, -8.67f);
        pathBuilder.arcTo(120.74f, 120.74f, 0.0f, false, false, 58.0f, 128.0f);
        pathBuilder.arcTo(69.72f, 69.72f, 0.0f, false, true, 84.25f, 73.36f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.51f, 9.37f);
        pathBuilder.arcTo(57.73f, 57.73f, 0.0f, false, false, 70.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 122.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.arcToRelative(186.07f, 186.07f, 0.0f, false, true, -23.23f, 90.07f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.5f, 5.82f);
        pathBuilder.arcTo(198.14f, 198.14f, 0.0f, false, false, 134.0f, 128.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 128.0f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 90.0f);
        pathBuilder.arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, true, 52.0f, 0.0f);
        pathBuilder.arcToRelative(216.06f, 216.06f, 0.0f, false, true, -20.71f, 92.85f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 144.16f, 226.0f);
        pathBuilder.arcTo(227.94f, 227.94f, 0.0f, false, false, 166.0f, 128.0f);
        pathBuilder.arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 90.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 26.0f);
        pathBuilder.arcTo(102.11f, 102.11f, 0.0f, false, false, 26.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, -5.12f, 30.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.31f, 4.0f);
        pathBuilder.arcTo(101.83f, 101.83f, 0.0f, false, false, 38.0f, 128.0f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, false, true, 180.0f, 0.0f);
        pathBuilder.arcToRelative(284.7f, 284.7f, 0.0f, false, true, -5.33f, 54.84f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.72f, 7.05f);
        pathBuilder.arcToRelative(6.8f, 6.8f, 0.0f, false, false, 1.17f, 0.11f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.88f, -4.84f);
        pathBuilder.arcTo(295.92f, 295.92f, 0.0f, false, false, 230.0f, 128.0f);
        pathBuilder.arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.0f, 154.13f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.07f, 4.69f);
        pathBuilder.arcToRelative(152.82f, 152.82f, 0.0f, false, true, -17.44f, 46.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.4f, 6.0f);
        pathBuilder.arcToRelative(164.77f, 164.77f, 0.0f, false, false, 18.8f, -49.65f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 94.0f, 154.13f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 58.0f);
        pathBuilder.arcToRelative(70.76f, 70.76f, 0.0f, false, false, -8.75f, 0.54f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 1.49f, 11.91f);
        pathBuilder.arcTo(58.0f, 58.0f, 0.0f, false, true, 186.0f, 128.0f);
        pathBuilder.arcToRelative(252.27f, 252.27f, 0.0f, false, true, -1.94f, 31.26f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.21f, 6.69f);
        pathBuilder.arcToRelative(6.59f, 6.59f, 0.0f, false, false, 0.75f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.95f, -5.26f);
        pathBuilder.arcTo(266.46f, 266.46f, 0.0f, false, false, 198.0f, 128.0f);
        pathBuilder.arcTo(70.08f, 70.08f, 0.0f, false, false, 128.0f, 58.0f);
        pathBuilder.close();
        pathBuilder.moveTo(185.44f, 186.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.31f, 4.31f);
        pathBuilder.curveToRelative(-1.47f, 5.74f, -3.18f, 11.49f, -5.06f, 17.09f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.38f, 3.82f);
        pathBuilder.curveToRelative(2.0f, -5.88f, 3.75f, -11.9f, 5.3f, -17.92f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 185.44f, 186.2f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fingerprint = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
