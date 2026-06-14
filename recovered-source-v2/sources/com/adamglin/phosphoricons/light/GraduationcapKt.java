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

/* compiled from: Graduationcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GraduationCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getGraduationCap", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graduationCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraduationcapKt {
    private static ImageVector _graduationCap;

    public static final ImageVector getGraduationCap(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _graduationCap;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GraduationCap", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(250.82f, 90.71f);
        pathBuilder.lineToRelative(-120.0f, -64.0f);
        pathBuilder.arcToRelative(5.94f, 5.94f, 0.0f, false, false, -5.64f, 0.0f);
        pathBuilder.lineToRelative(-120.0f, 64.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 10.58f);
        pathBuilder.lineTo(34.0f, 116.67f);
        pathBuilder.verticalLineToRelative(49.62f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 3.55f, 9.32f);
        pathBuilder.curveTo(50.42f, 189.94f, 79.29f, 214.0f, 128.0f, 214.0f);
        pathBuilder.arcToRelative(127.21f, 127.21f, 0.0f, false, false, 50.0f, -9.73f);
        pathBuilder.lineTo(178.0f, 240.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.lineTo(190.0f, 198.35f);
        pathBuilder.arcToRelative(113.18f, 113.18f, 0.0f, false, false, 28.45f, -22.75f);
        pathBuilder.arcToRelative(13.91f, 13.91f, 0.0f, false, false, 3.55f, -9.31f);
        pathBuilder.lineTo(222.0f, 116.67f);
        pathBuilder.lineToRelative(28.82f, -15.38f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.58f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 202.0f);
        pathBuilder.curveToRelative(-44.0f, 0.0f, -70.0f, -21.56f, -81.52f, -34.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.48f, -1.3f);
        pathBuilder.lineTo(46.0f, 123.07f);
        pathBuilder.lineToRelative(79.18f, 42.22f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.64f, 0.0f);
        pathBuilder.lineTo(178.0f, 140.13f);
        pathBuilder.verticalLineToRelative(51.0f);
        pathBuilder.curveTo(165.0f, 197.35f, 148.45f, 202.0f, 128.0f, 202.0f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 166.29f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.48f, 1.3f);
        pathBuilder.arcTo(100.25f, 100.25f, 0.0f, false, true, 190.0f, 184.3f);
        pathBuilder.lineTo(190.0f, 133.73f);
        pathBuilder.lineToRelative(20.0f, -10.66f);
        pathBuilder.close();
        pathBuilder.moveTo(187.85f, 121.29f);
        pathBuilder.arcToRelative(6.27f, 6.27f, 0.0f, false, false, -1.0f, -0.71f);
        pathBuilder.lineToRelative(-56.0f, -29.86f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.64f, 10.58f);
        pathBuilder.lineTo(175.25f, 128.0f);
        pathBuilder.lineTo(128.0f, 153.2f);
        pathBuilder.lineTo(20.75f, 96.0f);
        pathBuilder.lineTo(128.0f, 38.8f);
        pathBuilder.lineTo(235.25f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graduationCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
