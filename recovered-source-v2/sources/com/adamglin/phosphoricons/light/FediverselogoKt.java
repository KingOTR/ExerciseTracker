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

/* compiled from: Fediverselogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FediverseLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFediverseLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fediverseLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FediverselogoKt {
    private static ImageVector _fediverseLogo;

    public static final ImageVector getFediverseLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(212.0f, 98.0f);
        pathBuilder.arcToRelative(25.85f, 25.85f, 0.0f, false, false, -11.11f, 2.5f);
        pathBuilder.lineTo(168.48f, 60.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 122.0f, 44.0f);
        pathBuilder.arcToRelative(26.23f, 26.23f, 0.0f, false, false, 0.34f, 4.19f);
        pathBuilder.lineTo(73.0f, 68.74f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, 40.78f);
        pathBuilder.lineTo(49.0f, 159.0f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 78.74f, 196.6f);
        pathBuilder.lineTo(130.0f, 211.0f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.0f, 0.69f, 0.0f, 1.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, true, false, 44.63f, -18.11f);
        pathBuilder.lineToRelative(28.85f, -45.33f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, true, false, 212.0f, 98.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 186.0f);
        pathBuilder.curveToRelative(-0.78f, 0.0f, -1.55f, 0.0f, -2.31f, 0.11f);
        pathBuilder.lineTo(136.2f, 133.62f);
        pathBuilder.lineTo(187.0f, 131.2f);
        pathBuilder.arcToRelative(26.08f, 26.08f, 0.0f, false, false, 6.35f, 10.91f);
        pathBuilder.lineToRelative(-28.85f, 45.33f);
        pathBuilder.arcTo(25.87f, 25.87f, 0.0f, false, false, 156.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.27f, 163.74f);
        pathBuilder.arcTo(26.0f, 26.0f, 0.0f, false, false, 61.0f, 158.48f);
        pathBuilder.lineTo(59.0f, 109.0f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 11.86f, -7.17f);
        pathBuilder.lineToRelative(46.42f, 26.87f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 70.0f);
        pathBuilder.arcToRelative(25.85f, 25.85f, 0.0f, false, false, 11.11f, -2.5f);
        pathBuilder.lineTo(191.52f, 108.0f);
        pathBuilder.arcToRelative(25.92f, 25.92f, 0.0f, false, false, -5.07f, 11.2f);
        pathBuilder.lineToRelative(-50.76f, 2.42f);
        pathBuilder.lineTo(148.0f, 70.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 30.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 148.0f, 30.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.0f, 59.26f);
        pathBuilder.arcToRelative(26.19f, 26.19f, 0.0f, false, false, 9.34f, 7.95f);
        pathBuilder.lineTo(124.0f, 118.77f);
        pathBuilder.lineTo(76.9f, 91.48f);
        pathBuilder.arcToRelative(26.0f, 26.0f, 0.0f, false, false, 0.76f, -11.67f);
        pathBuilder.close();
        pathBuilder.moveTo(38.0f, 84.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, true, true, 52.0f, 98.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 38.0f, 84.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 198.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 198.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.0f, 185.0f);
        pathBuilder.curveToRelative(0.0f, -0.34f, 0.0f, -0.69f, 0.0f, -1.0f);
        pathBuilder.arcToRelative(25.94f, 25.94f, 0.0f, false, false, -2.35f, -10.79f);
        pathBuilder.lineTo(125.0f, 137.94f);
        pathBuilder.lineToRelative(17.32f, 52.0f);
        pathBuilder.arcToRelative(26.23f, 26.23f, 0.0f, false, false, -9.05f, 9.49f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 226.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 156.0f, 226.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 138.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, true, 212.0f, 138.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fediverseLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
