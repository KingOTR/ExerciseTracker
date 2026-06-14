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

/* compiled from: Fediverselogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FediverseLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFediverseLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fediverseLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FediverselogoKt {
    private static ImageVector _fediverseLogo;

    public static final ImageVector getFediverseLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fediverseLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FediverseLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(212.0f, 100.0f);
        pathBuilder.arcToRelative(23.78f, 23.78f, 0.0f, false, false, -11.65f, 3.0f);
        pathBuilder.lineTo(165.9f, 60.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, -41.28f, -10.56f);
        pathBuilder.lineTo(72.29f, 71.21f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 49.0f, 107.8f);
        pathBuilder.lineToRelative(2.11f, 52.71f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, true, false, 77.7f, 194.23f);
        pathBuilder.lineToRelative(54.43f, 15.24f);
        pathBuilder.curveToRelative(-0.08f, 0.83f, -0.13f, 1.68f, -0.13f, 2.53f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, false, 40.07f, -17.81f);
        pathBuilder.lineToRelative(30.6f, -48.08f);
        pathBuilder.arcTo(23.78f, 23.78f, 0.0f, false, false, 212.0f, 148.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.18f, 121.13f);
        pathBuilder.lineTo(133.12f, 123.75f);
        pathBuilder.lineTo(146.41f, 67.94f);
        pathBuilder.quadToRelative(0.79f, 0.06f, 1.59f, 0.06f);
        pathBuilder.arcToRelative(23.78f, 23.78f, 0.0f, false, false, 11.65f, -3.0f);
        pathBuilder.lineTo(194.1f, 108.0f);
        pathBuilder.arcTo(23.91f, 23.91f, 0.0f, false, false, 188.18f, 121.13f);
        pathBuilder.close();
        pathBuilder.moveTo(72.18f, 166.32f);
        pathBuilder.arcToRelative(23.9f, 23.9f, 0.0f, false, false, -13.16f, -6.12f);
        pathBuilder.lineToRelative(-2.11f, -52.71f);
        pathBuilder.arcToRelative(24.05f, 24.05f, 0.0f, false, false, 13.52f, -8.18f);
        pathBuilder.lineToRelative(50.4f, 29.18f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 28.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 148.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.71f, 56.79f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 10.92f, 9.3f);
        pathBuilder.lineToRelative(-13.28f, 55.76f);
        pathBuilder.lineTo(74.48f, 92.39f);
        pathBuilder.arcTo(23.83f, 23.83f, 0.0f, false, false, 76.0f, 84.0f);
        pathBuilder.arcToRelative(24.12f, 24.12f, 0.0f, false, false, -0.62f, -5.41f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 84.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 36.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.87f, 186.53f);
        pathBuilder.curveToRelative(0.08f, -0.83f, 0.13f, -1.68f, 0.13f, -2.53f);
        pathBuilder.arcToRelative(23.86f, 23.86f, 0.0f, false, false, -2.87f, -11.37f);
        pathBuilder.lineToRelative(48.86f, -38.0f);
        pathBuilder.lineToRelative(18.73f, 56.19f);
        pathBuilder.arcToRelative(24.17f, 24.17f, 0.0f, false, false, -10.42f, 11.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 228.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 156.0f, 228.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.33f, 189.89f);
        pathBuilder.arcTo(23.78f, 23.78f, 0.0f, false, false, 156.0f, 188.0f);
        pathBuilder.arcToRelative(24.94f, 24.94f, 0.0f, false, false, -3.69f, 0.28f);
        pathBuilder.lineToRelative(-18.85f, -56.54f);
        pathBuilder.lineToRelative(55.1f, -2.62f);
        pathBuilder.arcToRelative(23.92f, 23.92f, 0.0f, false, false, 7.37f, 12.69f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 140.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 212.0f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fediverseLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
