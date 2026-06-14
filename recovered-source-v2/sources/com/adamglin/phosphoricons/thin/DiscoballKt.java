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

/* compiled from: Discoball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"DiscoBall", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getDiscoBall", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_discoBall", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiscoballKt {
    private static ImageVector _discoBall;

    public static final ImageVector getDiscoBall(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(116.0f, 68.1f);
        pathBuilder.lineTo(116.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f);
        pathBuilder.lineTo(108.0f, 68.1f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, false, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(187.89f, 148.0f);
        pathBuilder.horizontalLineToRelative(-40.0f);
        pathBuilder.curveToRelative(-1.0f, -37.34f, -15.73f, -60.22f, -25.35f, -71.25f);
        pathBuilder.arcTo(76.12f, 76.12f, 0.0f, false, true, 187.89f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 226.68f);
        pathBuilder.curveTo(105.0f, 220.0f, 85.26f, 197.61f, 84.06f, 156.0f);
        pathBuilder.horizontalLineToRelative(55.88f);
        pathBuilder.curveTo(138.74f, 197.61f, 119.0f, 220.0f, 112.0f, 226.68f);
        pathBuilder.close();
        pathBuilder.moveTo(84.06f, 148.0f);
        pathBuilder.curveToRelative(1.2f, -41.61f, 21.0f, -64.0f, 27.94f, -70.68f);
        pathBuilder.curveToRelative(7.0f, 6.64f, 26.74f, 29.07f, 27.94f, 70.68f);
        pathBuilder.close();
        pathBuilder.moveTo(101.42f, 76.75f);
        pathBuilder.curveToRelative(-9.62f, 11.0f, -24.35f, 33.91f, -25.35f, 71.25f);
        pathBuilder.horizontalLineToRelative(-40.0f);
        pathBuilder.arcTo(76.12f, 76.12f, 0.0f, false, true, 101.42f, 76.75f);
        pathBuilder.close();
        pathBuilder.moveTo(36.11f, 156.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.curveToRelative(1.0f, 37.34f, 15.73f, 60.22f, 25.35f, 71.25f);
        pathBuilder.arcTo(76.12f, 76.12f, 0.0f, false, true, 36.11f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(122.58f, 227.25f);
        pathBuilder.curveToRelative(9.62f, -11.0f, 24.35f, -33.91f, 25.35f, -71.25f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcTo(76.12f, 76.12f, 0.0f, false, true, 122.58f, 227.25f);
        pathBuilder.close();
        pathBuilder.moveTo(252.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(236.0f, 92.0f);
        pathBuilder.verticalLineToRelative(12.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(228.0f, 92.0f);
        pathBuilder.lineTo(216.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.lineTo(228.0f, 72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(236.0f, 84.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(188.0f, 44.0f);
        pathBuilder.lineTo(188.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(180.0f, 44.0f);
        pathBuilder.lineTo(160.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.lineTo(180.0f, 16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.lineTo(188.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 40.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _discoBall = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
