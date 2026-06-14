package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(68.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -20.1f, 9.77f, -40.87f, 28.24f, -60.0f);
        pathBuilder.arcToRelative(156.0f, 156.0f, 0.0f, false, true, 27.57f, -22.76f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.38f, 0.0f);
        pathBuilder.curveTo(134.47f, 26.59f, 188.0f, 60.08f, 188.0f, 108.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 152.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.curveToRelative(0.0f, -13.57f, -10.0f, -24.46f, -16.0f, -29.79f);
        pathBuilder.curveToRelative(-6.0f, 5.33f, -16.0f, 16.22f, -16.0f, 29.79f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 108.0f);
        pathBuilder.arcToRelative(43.83f, 43.83f, 0.0f, false, false, 12.09f, 30.24f);
        pathBuilder.curveToRelative(0.0f, -0.74f, -0.09f, -1.49f, -0.09f, -2.24f);
        pathBuilder.curveToRelative(0.0f, -28.0f, 26.44f, -45.91f, 27.56f, -46.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.88f, 0.0f);
        pathBuilder.curveTo(133.56f, 90.09f, 160.0f, 108.0f, 160.0f, 136.0f);
        pathBuilder.curveToRelative(0.0f, 0.75f, 0.0f, 1.5f, -0.09f, 2.24f);
        pathBuilder.arcTo(43.83f, 43.83f, 0.0f, false, false, 172.0f, 108.0f);
        pathBuilder.curveToRelative(0.0f, -32.0f, -32.26f, -58.0f, -44.0f, -66.34f);
        pathBuilder.curveTo(116.27f, 50.0f, 84.0f, 76.0f, 84.0f, 108.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
