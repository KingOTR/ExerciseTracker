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

/* compiled from: Rainbowcloud.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RainbowCloud", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getRainbowCloud", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rainbowCloud", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RainbowcloudKt {
    private static ImageVector _rainbowCloud;

    public static final ImageVector getRainbowCloud(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 112.0f);
        pathBuilder.arcToRelative(48.18f, 48.18f, 0.0f, false, false, -44.66f, 30.4f);
        pathBuilder.arcToRelative(31.0f, 31.0f, 0.0f, false, false, -3.34f, -0.18f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, 14.76f, -32.0f, 32.89f);
        pathBuilder.reflectiveCurveTo(134.35f, 208.0f, 152.0f, 208.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 192.0f);
        pathBuilder.lineTo(152.0f, 192.0f);
        pathBuilder.curveToRelative(-8.82f, 0.0f, -16.0f, -7.58f, -16.0f, -16.89f);
        pathBuilder.reflectiveCurveToRelative(7.18f, -16.89f, 16.0f, -16.89f);
        pathBuilder.arcToRelative(15.0f, 15.0f, 0.0f, false, true, 5.78f, 1.14f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.87f, -5.81f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, true, true, 200.0f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(24.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(8.0f, 160.0f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, true, 184.5f, 85.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.15f, 11.47f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(56.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(40.0f, 160.0f);
        pathBuilder.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 114.6f, -58.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.47f, 12.89f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 56.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(117.57f, 136.65f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 88.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(72.0f, 160.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 49.27f, -38.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.7f, 15.57f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rainbowCloud = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
