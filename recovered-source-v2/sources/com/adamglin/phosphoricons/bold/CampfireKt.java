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

/* compiled from: Campfire.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Campfire", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCampfire", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_campfire", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CampfireKt {
    private static ImageVector _campfire;

    public static final ImageVector getCampfire(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(227.51f, 227.4f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 216.0f, 236.0f);
        pathBuilder.arcToRelative(12.15f, 12.15f, 0.0f, false, true, -3.4f, -0.49f);
        pathBuilder.lineToRelative(-84.6f, -25.0f);
        pathBuilder.lineToRelative(-84.6f, 25.0f);
        pathBuilder.arcTo(12.15f, 12.15f, 0.0f, false, true, 40.0f, 236.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.4f, -23.51f);
        pathBuilder.lineTo(85.65f, 198.0f);
        pathBuilder.lineTo(36.6f, 183.51f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.8f, -23.0f);
        pathBuilder.lineToRelative(84.6f, 25.0f);
        pathBuilder.lineToRelative(84.6f, -25.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 6.8f, 23.0f);
        pathBuilder.lineTo(170.35f, 198.0f);
        pathBuilder.lineToRelative(49.05f, 14.49f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 227.51f, 227.4f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, -50.59f, 55.93f, -81.28f, 58.31f, -82.57f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 11.38f, 0.0f);
        pathBuilder.curveTo(136.07f, 22.72f, 192.0f, 53.41f, 192.0f, 104.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, -128.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 144.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.curveToRelative(0.0f, -6.47f, -2.71f, -12.55f, -8.0f, -18.07f);
        pathBuilder.arcToRelative(41.26f, 41.26f, 0.0f, false, false, -4.0f, -3.57f);
        pathBuilder.arcToRelative(42.49f, 42.49f, 0.0f, false, false, -4.0f, 3.57f);
        pathBuilder.curveToRelative(-5.33f, 5.52f, -8.0f, 11.6f, -8.0f, 18.07f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(88.0f, 104.0f);
        pathBuilder.arcToRelative(39.78f, 39.78f, 0.0f, false, false, 4.85f, 19.08f);
        pathBuilder.curveToRelative(4.81f, -25.0f, 28.66f, -37.25f, 29.78f, -37.81f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.74f, 0.0f);
        pathBuilder.curveToRelative(1.12f, 0.56f, 25.0f, 12.78f, 29.78f, 37.81f);
        pathBuilder.arcTo(39.78f, 39.78f, 0.0f, false, false, 168.0f, 104.0f);
        pathBuilder.curveToRelative(0.0f, -28.34f, -27.74f, -49.81f, -40.0f, -57.92f);
        pathBuilder.curveTo(115.75f, 54.18f, 88.0f, 75.66f, 88.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _campfire = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
