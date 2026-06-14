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

/* compiled from: Smileysad.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileySad", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSmileySad", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileySad", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileysadKt {
    private static ImageVector _smileySad;

    public static final ImageVector getSmileySad(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _smileySad;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileySad", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 28.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f);
        pathBuilder.arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 220.0f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f);
        pathBuilder.arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 108.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 108.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.46f, 174.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.46f, 5.46f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, -2.0f, 0.54f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.46f, -2.0f);
        pathBuilder.curveToRelative(-8.21f, -14.19f, -21.19f, -22.0f, -36.54f, -22.0f);
        pathBuilder.reflectiveCurveToRelative(-28.33f, 7.81f, -36.54f, 22.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.92f, -4.0f);
        pathBuilder.curveToRelative(9.55f, -16.52f, 25.4f, -26.0f, 43.46f, -26.0f);
        pathBuilder.reflectiveCurveTo(161.91f, 157.48f, 171.46f, 174.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileySad = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
