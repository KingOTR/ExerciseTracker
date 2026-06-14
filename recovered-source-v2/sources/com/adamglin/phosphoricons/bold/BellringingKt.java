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

/* compiled from: Bellringing.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellRinging", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBellRinging", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellRinging", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellringingKt {
    private static ImageVector _bellRinging;

    public static final ImageVector getBellRinging(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _bellRinging;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellRinging", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.81f, 74.65f);
        pathBuilder.arcTo(11.86f, 11.86f, 0.0f, false, true, 220.3f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.67f, -6.47f);
        pathBuilder.arcToRelative(90.1f, 90.1f, 0.0f, false, false, -32.0f, -35.38f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.8f, -20.29f);
        pathBuilder.arcToRelative(115.25f, 115.25f, 0.0f, false, true, 40.54f, 44.62f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 225.81f, 74.65f);
        pathBuilder.close();
        pathBuilder.moveTo(46.37f, 69.53f);
        pathBuilder.arcToRelative(90.1f, 90.1f, 0.0f, false, true, 32.0f, -35.38f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 65.6f, 13.86f);
        pathBuilder.arcTo(115.25f, 115.25f, 0.0f, false, false, 25.06f, 58.48f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.13f, 16.17f);
        pathBuilder.arcTo(11.86f, 11.86f, 0.0f, false, false, 35.7f, 76.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 46.37f, 69.53f);
        pathBuilder.close();
        pathBuilder.moveTo(219.88f, 167.88f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 204.0f, 200.0f);
        pathBuilder.lineTo(171.81f, 200.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, -87.62f, 0.0f);
        pathBuilder.lineTo(52.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -15.91f, -32.12f);
        pathBuilder.curveToRelative(7.17f, -9.33f, 15.73f, -26.62f, 15.88f, -55.94f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 204.0f, 112.0f);
        pathBuilder.curveTo(204.15f, 141.26f, 212.71f, 158.55f, 219.88f, 167.88f);
        pathBuilder.close();
        pathBuilder.moveTo(147.6f, 200.0f);
        pathBuilder.lineTo(108.4f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 39.2f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(196.34f, 176.0f);
        pathBuilder.curveToRelative(-8.16f, -13.0f, -16.19f, -33.57f, -16.34f, -63.94f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 112.0f);
        pathBuilder.curveToRelative(-0.15f, 30.42f, -8.18f, 51.0f, -16.34f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellRinging = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
