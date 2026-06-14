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

/* compiled from: Footprints.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Footprints", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFootprints", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footprints", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootprintsKt {
    private static ImageVector _footprints;

    public static final ImageVector getFootprints(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _footprints;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Footprints", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(104.0f, 162.0f);
        pathBuilder.lineTo(48.0f, 162.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f);
        pathBuilder.lineTo(110.0f, 168.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 104.0f, 162.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.0f, 180.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.lineTo(98.0f, 174.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 18.0f);
        pathBuilder.curveTo(65.2f, 18.0f, 54.56f, 27.91f, 46.0f, 45.9f);
        pathBuilder.curveToRelative(-13.66f, 28.82f, -18.29f, 71.53f, 0.0f, 93.9f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, 2.2f);
        pathBuilder.horizontalLineToRelative(50.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, -2.2f);
        pathBuilder.curveToRelative(18.32f, -22.37f, 13.69f, -65.08f, 0.0f, -93.9f);
        pathBuilder.curveTo(97.41f, 27.91f, 86.77f, 18.0f, 76.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(98.23f, 130.0f);
        pathBuilder.lineTo(53.74f, 130.0f);
        pathBuilder.curveToRelative(-10.09f, -15.18f, -11.69f, -47.65f, 3.14f, -79.0f);
        pathBuilder.curveTo(64.24f, 35.51f, 71.77f, 30.0f, 76.0f, 30.0f);
        pathBuilder.reflectiveCurveToRelative(11.75f, 5.51f, 19.1f, 21.0f);
        pathBuilder.curveTo(109.92f, 82.35f, 108.32f, 114.82f, 98.23f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 186.0f);
        pathBuilder.lineTo(152.0f, 186.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f);
        pathBuilder.lineTo(214.0f, 192.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 208.0f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.0f, 204.0f);
        pathBuilder.arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.73f, 166.0f);
        pathBuilder.horizontalLineToRelative(50.53f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.65f, -2.2f);
        pathBuilder.curveToRelative(18.32f, -22.37f, 13.69f, -65.08f, 0.0f, -93.9f);
        pathBuilder.curveTo(201.44f, 51.91f, 190.8f, 42.0f, 180.0f, 42.0f);
        pathBuilder.reflectiveCurveToRelative(-21.43f, 9.91f, -30.0f, 27.9f);
        pathBuilder.curveToRelative(-13.66f, 28.82f, -18.29f, 71.53f, 0.0f, 93.9f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 154.75f, 166.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.9f, 75.0f);
        pathBuilder.curveToRelative(7.35f, -15.53f, 14.88f, -21.0f, 19.1f, -21.0f);
        pathBuilder.reflectiveCurveToRelative(11.74f, 5.51f, 19.1f, 21.0f);
        pathBuilder.curveToRelative(14.83f, 31.31f, 13.23f, 63.78f, 3.14f, 79.0f);
        pathBuilder.lineTo(157.77f, 154.0f);
        pathBuilder.curveTo(147.68f, 138.82f, 146.08f, 106.35f, 160.92f, 75.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footprints = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
