package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _campfire;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Campfire", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.0f, 108.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, 52.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f);
        pathBuilder.curveToRelative(0.0f, -24.0f, -24.0f, -40.0f, -24.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(-24.0f, 16.0f, -24.0f, 40.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, -52.0f, -52.0f);
        pathBuilder.curveToRelative(0.0f, -44.0f, 52.0f, -76.0f, 52.0f, -76.0f);
        pathBuilder.reflectiveCurveTo(180.0f, 64.0f, 180.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 168.0f);
        pathBuilder2.arcToRelative(60.07f, 60.07f, 0.0f, false, false, 60.0f, -60.0f);
        pathBuilder2.curveToRelative(0.0f, -47.92f, -53.53f, -81.41f, -55.81f, -82.81f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 0.0f);
        pathBuilder2.arcTo(156.0f, 156.0f, 0.0f, false, false, 96.24f, 48.0f);
        pathBuilder2.curveTo(77.77f, 67.13f, 68.0f, 87.9f, 68.0f, 108.0f);
        pathBuilder2.arcTo(60.07f, 60.07f, 0.0f, false, false, 128.0f, 168.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 136.0f);
        pathBuilder2.curveToRelative(0.0f, -13.57f, 10.0f, -24.46f, 16.0f, -29.79f);
        pathBuilder2.curveToRelative(6.0f, 5.33f, 16.0f, 16.22f, 16.0f, 29.79f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 41.66f);
        pathBuilder2.curveTo(139.74f, 50.0f, 172.0f, 76.0f, 172.0f, 108.0f);
        pathBuilder2.arcToRelative(43.83f, 43.83f, 0.0f, false, true, -12.09f, 30.24f);
        pathBuilder2.curveToRelative(0.05f, -0.74f, 0.09f, -1.49f, 0.09f, -2.24f);
        pathBuilder2.curveToRelative(0.0f, -28.0f, -26.44f, -45.91f, -27.56f, -46.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, 0.0f);
        pathBuilder2.curveTo(122.44f, 90.09f, 96.0f, 108.0f, 96.0f, 136.0f);
        pathBuilder2.curveToRelative(0.0f, 0.75f, 0.0f, 1.5f, 0.09f, 2.24f);
        pathBuilder2.arcTo(43.83f, 43.83f, 0.0f, false, true, 84.0f, 108.0f);
        pathBuilder2.curveTo(84.0f, 76.0f, 116.27f, 50.0f, 128.0f, 41.66f);
        pathBuilder2.close();
        pathBuilder2.moveTo(223.62f, 226.42f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.05f, 5.2f);
        pathBuilder2.lineTo(128.0f, 204.39f);
        pathBuilder2.lineTo(42.43f, 231.62f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.85f, -15.25f);
        pathBuilder2.lineToRelative(64.0f, -20.37f);
        pathBuilder2.lineToRelative(-64.0f, -20.38f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, -15.24f);
        pathBuilder2.lineTo(128.0f, 187.6f);
        pathBuilder2.lineToRelative(85.57f, -27.22f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, 15.24f);
        pathBuilder2.lineToRelative(-64.0f, 20.38f);
        pathBuilder2.lineToRelative(64.0f, 20.37f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.62f, 226.42f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
