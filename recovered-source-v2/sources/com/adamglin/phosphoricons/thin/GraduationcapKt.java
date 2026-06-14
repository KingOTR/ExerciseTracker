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

/* compiled from: Graduationcap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GraduationCap", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGraduationCap", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_graduationCap", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GraduationcapKt {
    private static ImageVector _graduationCap;

    public static final ImageVector getGraduationCap(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(249.88f, 92.47f);
        pathBuilder.lineToRelative(-120.0f, -64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, 0.0f);
        pathBuilder.lineToRelative(-120.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.06f);
        pathBuilder.lineTo(36.0f, 115.47f);
        pathBuilder.verticalLineToRelative(50.82f);
        pathBuilder.arcToRelative(11.92f, 11.92f, 0.0f, false, false, 3.0f, 8.0f);
        pathBuilder.curveToRelative(12.65f, 14.09f, 41.0f, 37.73f, 89.0f, 37.73f);
        pathBuilder.curveToRelative(21.0f, 0.0f, 38.2f, -4.52f, 52.0f, -10.79f);
        pathBuilder.lineTo(180.0f, 240.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(188.0f, 197.18f);
        pathBuilder.arcToRelative(111.64f, 111.64f, 0.0f, false, false, 29.0f, -22.91f);
        pathBuilder.arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, -8.0f);
        pathBuilder.lineTo(220.0f, 115.47f);
        pathBuilder.lineToRelative(29.88f, -15.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.06f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 204.0f);
        pathBuilder.curveToRelative(-44.83f, 0.0f, -71.25f, -22.0f, -83.0f, -35.08f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.0f, -2.63f);
        pathBuilder.lineTo(44.0f, 119.73f);
        pathBuilder.lineToRelative(82.12f, 43.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, 0.0f);
        pathBuilder.lineTo(180.0f, 136.8f);
        pathBuilder.verticalLineToRelative(55.53f);
        pathBuilder.curveTo(166.58f, 199.0f, 149.39f, 204.0f, 128.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 166.29f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 2.64f);
        pathBuilder.arcToRelative(103.32f, 103.32f, 0.0f, false, true, -23.0f, 19.0f);
        pathBuilder.verticalLineToRelative(-55.4f);
        pathBuilder.lineToRelative(24.0f, -12.8f);
        pathBuilder.close();
        pathBuilder.moveTo(187.41f, 123.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.53f, -1.44f);
        pathBuilder.lineToRelative(-56.0f, -29.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, 7.06f);
        pathBuilder.lineTo(179.5f, 128.0f);
        pathBuilder.lineTo(128.0f, 155.47f);
        pathBuilder.lineTo(16.5f, 96.0f);
        pathBuilder.lineTo(128.0f, 36.53f);
        pathBuilder.lineTo(239.5f, 96.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _graduationCap = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
