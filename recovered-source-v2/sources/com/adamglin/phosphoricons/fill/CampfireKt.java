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

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(132.19f, 25.19f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.38f, 0.0f);
        pathBuilder.arcTo(156.0f, 156.0f, 0.0f, false, false, 96.24f, 48.0f);
        pathBuilder.curveTo(77.77f, 67.13f, 68.0f, 87.9f, 68.0f, 108.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 120.0f, 0.0f);
        pathBuilder.curveTo(188.0f, 60.08f, 134.47f, 26.59f, 132.19f, 25.19f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f);
        pathBuilder.curveToRelative(0.0f, -24.0f, 24.0f, -40.0f, 24.0f, -40.0f);
        pathBuilder.reflectiveCurveToRelative(24.0f, 16.0f, 24.0f, 40.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 128.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(223.62f, 226.42f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.05f, 5.2f);
        pathBuilder.lineTo(128.0f, 204.39f);
        pathBuilder.lineTo(42.43f, 231.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -4.85f, -15.25f);
        pathBuilder.lineToRelative(64.0f, -20.37f);
        pathBuilder.lineToRelative(-64.0f, -20.38f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, -15.24f);
        pathBuilder.lineTo(128.0f, 187.6f);
        pathBuilder.lineToRelative(85.57f, -27.22f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.85f, 15.24f);
        pathBuilder.lineToRelative(-64.0f, 20.38f);
        pathBuilder.lineToRelative(64.0f, 20.37f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 223.62f, 226.42f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
