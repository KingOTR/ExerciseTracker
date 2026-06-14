package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Footprints.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Footprints", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getFootprints", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_footprints", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FootprintsKt {
    private static ImageVector _footprints;

    public static final ImageVector getFootprints(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(216.06f, 192.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 144.0f, 204.0f);
        pathBuilder.lineTo(144.0f, 192.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.06f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(104.0f, 160.0f);
        pathBuilder.horizontalLineToRelative(-56.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 112.0f, 180.0f);
        pathBuilder.lineTo(112.0f, 168.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 16.0f);
        pathBuilder.curveTo(64.36f, 16.0f, 53.07f, 26.31f, 44.2f, 45.0f);
        pathBuilder.curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, 2.93f);
        pathBuilder.horizontalLineToRelative(50.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f);
        pathBuilder.curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f);
        pathBuilder.curveTo(98.85f, 26.31f, 87.57f, 16.0f, 76.0f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.8f, 168.0f);
        pathBuilder.horizontalLineToRelative(50.55f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -2.93f);
        pathBuilder.curveToRelative(18.85f, -23.0f, 14.22f, -66.65f, 0.29f, -96.0f);
        pathBuilder.curveTo(202.93f, 50.31f, 191.64f, 40.0f, 180.0f, 40.0f);
        pathBuilder.reflectiveCurveToRelative(-22.89f, 10.31f, -31.77f, 29.0f);
        pathBuilder.curveToRelative(-13.93f, 29.38f, -18.56f, 73.0f, 0.29f, 96.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 154.76f, 168.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _footprints = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
