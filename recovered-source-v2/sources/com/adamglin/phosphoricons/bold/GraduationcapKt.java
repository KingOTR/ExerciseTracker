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

/* compiled from: Graduationcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GraduationCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGraduationCap", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graduationCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraduationcapKt {
    private static ImageVector _graduationCap;

    public static final ImageVector getGraduationCap(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(249.8f, 85.49f);
        pathBuilder.lineToRelative(-116.0f, -64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, 0.0f);
        pathBuilder.lineToRelative(-116.0f, 64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 21.0f);
        pathBuilder.lineToRelative(21.8f, 12.0f);
        pathBuilder.verticalLineToRelative(47.76f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 5.09f, 13.32f);
        pathBuilder.curveTo(46.63f, 194.7f, 77.0f, 220.0f, 128.0f, 220.0f);
        pathBuilder.arcToRelative(136.88f, 136.88f, 0.0f, false, false, 40.0f, -5.75f);
        pathBuilder.lineTo(168.0f, 240.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(192.0f, 204.12f);
        pathBuilder.arcToRelative(119.53f, 119.53f, 0.0f, false, false, 30.91f, -24.51f);
        pathBuilder.arcTo(19.89f, 19.89f, 0.0f, false, false, 228.0f, 166.29f);
        pathBuilder.lineTo(228.0f, 118.53f);
        pathBuilder.lineToRelative(21.8f, -12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -21.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 45.71f);
        pathBuilder.lineTo(219.16f, 96.0f);
        pathBuilder.lineTo(186.0f, 114.3f);
        pathBuilder.arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.18f, -0.12f);
        pathBuilder.lineToRelative(-52.0f, -28.69f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, 21.0f);
        pathBuilder.lineToRelative(39.0f, 21.49f);
        pathBuilder.lineTo(128.0f, 146.3f);
        pathBuilder.lineTo(36.84f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 196.0f);
        pathBuilder.curveToRelative(-40.42f, 0.0f, -64.65f, -19.07f, -76.0f, -31.27f);
        pathBuilder.verticalLineToRelative(-33.0f);
        pathBuilder.lineToRelative(70.2f, 38.74f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, 0.0f);
        pathBuilder.lineTo(168.0f, 151.64f);
        pathBuilder.verticalLineToRelative(37.23f);
        pathBuilder.arcTo(110.46f, 110.46f, 0.0f, false, true, 128.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 164.73f);
        pathBuilder.arcToRelative(93.21f, 93.21f, 0.0f, false, true, -12.0f, 10.81f);
        pathBuilder.lineTo(192.0f, 138.39f);
        pathBuilder.lineToRelative(12.0f, -6.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graduationCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
