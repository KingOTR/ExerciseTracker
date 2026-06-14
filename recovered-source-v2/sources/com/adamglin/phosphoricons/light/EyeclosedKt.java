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

/* compiled from: Eyeclosed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"EyeClosed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEyeClosed", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_eyeClosed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EyeclosedKt {
    private static ImageVector _eyeClosed;

    public static final ImageVector getEyeClosed(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _eyeClosed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("EyeClosed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.21f, 165.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.42f, 6.0f);
        pathBuilder.lineToRelative(-20.0f, -35.08f);
        pathBuilder.arcToRelative(122.0f, 122.0f, 0.0f, false, true, -39.0f, 18.09f);
        pathBuilder.lineToRelative(6.17f, 37.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.93f, 6.91f);
        pathBuilder.arcToRelative(6.85f, 6.85f, 0.0f, false, true, -1.0f, 0.08f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, -5.0f);
        pathBuilder.lineTo(148.0f, 156.44f);
        pathBuilder.arcToRelative(128.86f, 128.86f, 0.0f, false, true, -40.0f, 0.0f);
        pathBuilder.lineTo(101.92f, 193.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 198.0f);
        pathBuilder.arcToRelative(6.85f, 6.85f, 0.0f, false, true, -1.0f, -0.08f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 90.08f, 191.0f);
        pathBuilder.lineToRelative(6.17f, -37.0f);
        pathBuilder.arcToRelative(122.0f, 122.0f, 0.0f, false, true, -39.0f, -18.09f);
        pathBuilder.lineTo(37.21f, 171.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.42f, -6.0f);
        pathBuilder.lineToRelative(20.85f, -36.48f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, -20.31f, -20.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.34f, -7.54f);
        pathBuilder.curveTo(53.54f, 121.11f, 83.07f, 146.0f, 128.0f, 146.0f);
        pathBuilder.reflectiveCurveToRelative(74.46f, -24.89f, 91.33f, -45.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.34f, 7.54f);
        pathBuilder.arcToRelative(152.0f, 152.0f, 0.0f, false, true, -20.31f, 20.77f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _eyeClosed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
