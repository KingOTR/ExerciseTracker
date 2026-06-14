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

/* compiled from: Rainbowcloud.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"RainbowCloud", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getRainbowCloud", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_rainbowCloud", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RainbowcloudKt {
    private static ImageVector _rainbowCloud;

    public static final ImageVector getRainbowCloud(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 160.0f);
        pathBuilder.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, 48.0f);
        pathBuilder.lineTo(152.0f, 208.0f);
        pathBuilder.curveToRelative(-17.65f, 0.0f, -32.0f, -14.75f, -32.0f, -32.89f);
        pathBuilder.reflectiveCurveToRelative(14.35f, -32.89f, 32.0f, -32.89f);
        pathBuilder.arcToRelative(31.0f, 31.0f, 0.0f, false, true, 3.34f, 0.18f);
        pathBuilder.arcTo(48.0f, 48.0f, 0.0f, false, true, 248.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 72.0f);
        pathBuilder.arcToRelative(87.57f, 87.57f, 0.0f, false, true, 61.35f, 24.91f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 184.5f, 85.44f);
        pathBuilder.arcTo(104.0f, 104.0f, 0.0f, false, false, 8.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(24.0f, 160.0f);
        pathBuilder.arcTo(88.1f, 88.1f, 0.0f, false, true, 112.0f, 72.0f);
        pathBuilder.close();
        pathBuilder.moveTo(112.0f, 104.0f);
        pathBuilder.arcToRelative(55.58f, 55.58f, 0.0f, false, true, 33.13f, 10.84f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 154.6f, 102.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 40.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(56.0f, 160.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, true, 112.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(127.21f, 130.71f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.94f, -9.63f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 160.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.lineTo(88.0f, 160.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 29.57f, -23.35f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 127.21f, 130.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _rainbowCloud = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
