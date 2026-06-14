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

/* compiled from: Discoball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscoBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getDiscoBall", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discoBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscoballKt {
    private static ImageVector _discoBall;

    public static final ImageVector getDiscoBall(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _discoBall;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("DiscoBall", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.0f, 60.78f);
        pathBuilder.lineTo(124.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.lineTo(100.0f, 60.78f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(178.92f, 140.0f);
        pathBuilder.horizontalLineToRelative(-23.4f);
        pathBuilder.curveToRelative(-1.64f, -20.74f, -7.36f, -37.0f, -13.81f, -49.15f);
        pathBuilder.arcTo(68.23f, 68.23f, 0.0f, false, true, 178.92f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 215.0f);
        pathBuilder.curveToRelative(-7.0f, -8.62f, -17.0f, -25.09f, -19.45f, -51.0f);
        pathBuilder.horizontalLineToRelative(38.9f);
        pathBuilder.curveTo(129.0f, 189.9f, 119.0f, 206.37f, 112.0f, 215.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.55f, 140.0f);
        pathBuilder.curveTo(95.0f, 114.1f, 105.0f, 97.63f, 112.0f, 89.0f);
        pathBuilder.curveToRelative(7.0f, 8.62f, 17.0f, 25.09f, 19.45f, 51.0f);
        pathBuilder.close();
        pathBuilder.moveTo(82.29f, 90.85f);
        pathBuilder.curveTo(75.84f, 103.0f, 70.12f, 119.26f, 68.48f, 140.0f);
        pathBuilder.lineTo(45.08f, 140.0f);
        pathBuilder.arcTo(68.23f, 68.23f, 0.0f, false, true, 82.29f, 90.85f);
        pathBuilder.close();
        pathBuilder.moveTo(45.08f, 164.0f);
        pathBuilder.horizontalLineToRelative(23.4f);
        pathBuilder.curveToRelative(1.64f, 20.74f, 7.36f, 37.0f, 13.81f, 49.15f);
        pathBuilder.arcTo(68.23f, 68.23f, 0.0f, false, true, 45.08f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(141.71f, 213.15f);
        pathBuilder.curveToRelative(6.45f, -12.15f, 12.17f, -28.41f, 13.81f, -49.15f);
        pathBuilder.horizontalLineToRelative(23.4f);
        pathBuilder.arcTo(68.23f, 68.23f, 0.0f, false, true, 141.71f, 213.15f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(216.0f, 72.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 256.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.lineTo(168.0f, 16.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(168.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 148.0f, 36.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discoBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
