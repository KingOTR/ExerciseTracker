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

/* compiled from: Rainbowcloud.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RainbowCloud", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getRainbowCloud", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rainbowCloud", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RainbowcloudKt {
    private static ImageVector _rainbowCloud;

    public static final ImageVector getRainbowCloud(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(240.0f, 160.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder.horizontalLineTo(152.0f);
        pathBuilder.curveToRelative(-13.25f, 0.0f, -24.0f, -11.14f, -24.0f, -24.89f);
        pathBuilder.reflectiveCurveToRelative(10.75f, -24.89f, 24.0f, -24.89f);
        pathBuilder.arcToRelative(23.33f, 23.33f, 0.0f, false, true, 8.81f, 1.73f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 240.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(200.0f, 112.0f);
        pathBuilder2.arcToRelative(48.18f, 48.18f, 0.0f, false, false, -44.66f, 30.4f);
        pathBuilder2.arcToRelative(31.0f, 31.0f, 0.0f, false, false, -3.34f, -0.18f);
        pathBuilder2.curveToRelative(-17.65f, 0.0f, -32.0f, 14.76f, -32.0f, 32.89f);
        pathBuilder2.reflectiveCurveTo(134.35f, 208.0f, 152.0f, 208.0f);
        pathBuilder2.horizontalLineToRelative(48.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(200.0f, 192.0f);
        pathBuilder2.lineTo(152.0f, 192.0f);
        pathBuilder2.curveToRelative(-8.82f, 0.0f, -16.0f, -7.58f, -16.0f, -16.89f);
        pathBuilder2.reflectiveCurveToRelative(7.18f, -16.89f, 16.0f, -16.89f);
        pathBuilder2.arcToRelative(15.0f, 15.0f, 0.0f, false, true, 5.78f, 1.14f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.87f, -5.81f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, true, true, 200.0f, 192.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(24.0f, 160.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(8.0f, 160.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, false, true, 184.5f, 85.44f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.15f, 11.47f);
        pathBuilder2.arcTo(88.0f, 88.0f, 0.0f, false, false, 24.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(56.0f, 160.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(40.0f, 160.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, false, true, 114.6f, -58.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -9.47f, 12.89f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, false, 56.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(117.57f, 136.65f);
        pathBuilder2.arcTo(24.0f, 24.0f, 0.0f, false, false, 88.0f, 160.0f);
        pathBuilder2.verticalLineToRelative(16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(72.0f, 160.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 49.27f, -38.92f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -3.7f, 15.57f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rainbowCloud = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
