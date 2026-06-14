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

/* compiled from: Rainbowcloud.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RainbowCloud", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getRainbowCloud", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rainbowCloud", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RainbowcloudKt {
    private static ImageVector _rainbowCloud;

    public static final ImageVector getRainbowCloud(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _rainbowCloud;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("RainbowCloud", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 116.0f);
        pathBuilder.arcToRelative(44.16f, 44.16f, 0.0f, false, false, -42.0f, 30.88f);
        pathBuilder.arcToRelative(27.22f, 27.22f, 0.0f, false, false, -6.0f, -0.66f);
        pathBuilder.curveToRelative(-15.44f, 0.0f, -28.0f, 13.0f, -28.0f, 28.89f);
        pathBuilder.reflectiveCurveTo(136.56f, 204.0f, 152.0f, 204.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 196.0f);
        pathBuilder.lineTo(152.0f, 196.0f);
        pathBuilder.curveToRelative(-11.0f, 0.0f, -20.0f, -9.37f, -20.0f, -20.89f);
        pathBuilder.reflectiveCurveToRelative(9.0f, -20.89f, 20.0f, -20.89f);
        pathBuilder.arcToRelative(19.13f, 19.13f, 0.0f, false, true, 7.29f, 1.43f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.44f, -2.9f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, true, true, 200.0f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(20.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(12.0f, 160.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, true, 181.71f, 88.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 176.14f, 94.0f);
        pathBuilder.arcTo(92.0f, 92.0f, 0.0f, false, false, 20.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 100.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 160.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, 108.24f, -54.82f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.74f, 6.44f);
        pathBuilder.arcTo(59.57f, 59.57f, 0.0f, false, false, 112.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(123.31f, 129.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.81f, 3.0f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 84.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(76.0f, 160.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f);
        pathBuilder.arcToRelative(36.58f, 36.58f, 0.0f, false, true, 8.35f, 1.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 123.31f, 129.79f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rainbowCloud = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
