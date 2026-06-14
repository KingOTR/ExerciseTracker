package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Fediverselogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FediverseLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFediverseLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fediverseLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FediverselogoKt {
    private static ImageVector _fediverseLogo;

    public static final ImageVector getFediverseLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 92.0f);
        pathBuilder.arcToRelative(31.86f, 31.86f, 0.0f, false, false, -9.16f, 1.34f);
        pathBuilder.lineToRelative(-27.0f, -33.68f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 116.0f, 44.0f);
        pathBuilder.curveToRelative(0.0f, 0.11f, 0.0f, 0.22f, 0.0f, 0.33f);
        pathBuilder.lineTo(74.75f, 61.52f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -33.55f, 52.6f);
        pathBuilder.lineToRelative(1.62f, 40.73f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, false, 38.49f, 48.7f);
        pathBuilder.lineToRelative(42.89f, 12.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, false, 182.0f, 193.43f);
        pathBuilder.lineToRelative(24.16f, -38.0f);
        pathBuilder.arcToRelative(31.68f, 31.68f, 0.0f, false, false, 5.8f, 0.54f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(71.64f, 109.24f);
        pathBuilder.lineToRelative(34.93f, 20.22f);
        pathBuilder.lineTo(72.0f, 156.33f);
        pathBuilder.arcToRelative(31.68f, 31.68f, 0.0f, false, false, -5.24f, -2.45f);
        pathBuilder.lineToRelative(-1.62f, -40.73f);
        pathBuilder.arcTo(32.32f, 32.32f, 0.0f, false, false, 71.64f, 109.24f);
        pathBuilder.close();
        pathBuilder.moveTo(152.8f, 75.64f);
        pathBuilder.arcToRelative(33.2f, 33.2f, 0.0f, false, false, 4.36f, -1.0f);
        pathBuilder.lineToRelative(27.0f, 33.68f);
        pathBuilder.arcToRelative(32.81f, 32.81f, 0.0f, false, false, -2.31f, 5.08f);
        pathBuilder.lineToRelative(-38.43f, 1.83f);
        pathBuilder.close();
        pathBuilder.moveTo(86.8f, 175.26f);
        pathBuilder.lineTo(122.0f, 147.89f);
        pathBuilder.lineToRelative(13.26f, 39.79f);
        pathBuilder.arcToRelative(32.6f, 32.6f, 0.0f, false, false, -4.55f, 4.77f);
        pathBuilder.lineToRelative(-42.89f, -12.0f);
        pathBuilder.arcTo(33.0f, 33.0f, 0.0f, false, false, 86.78f, 175.26f);
        pathBuilder.close();
        pathBuilder.moveTo(158.0f, 180.07f);
        pathBuilder.lineToRelative(-13.62f, -40.84f);
        pathBuilder.lineTo(183.0f, 137.4f);
        pathBuilder.arcToRelative(31.7f, 31.7f, 0.0f, false, false, 3.0f, 5.17f);
        pathBuilder.lineToRelative(-24.16f, 38.0f);
        pathBuilder.arcTo(31.64f, 31.64f, 0.0f, false, false, 158.0f, 180.07f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 36.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 148.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(125.25f, 66.48f);
        pathBuilder.arcToRelative(33.46f, 33.46f, 0.0f, false, false, 4.21f, 3.58f);
        pathBuilder.lineToRelative(-9.4f, 39.48f);
        pathBuilder.lineTo(83.68f, 88.48f);
        pathBuilder.arcTo(31.6f, 31.6f, 0.0f, false, false, 84.0f, 84.0f);
        pathBuilder.curveToRelative(0.0f, -0.11f, 0.0f, -0.22f, 0.0f, -0.33f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 76.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 52.0f, 76.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 220.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 132.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 212.0f, 132.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fediverseLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
