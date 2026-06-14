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

/* compiled from: Tiktoklogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TiktokLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTiktokLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_tiktokLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TiktoklogoKt {
    private static ImageVector _tiktokLogo;

    public static final ImageVector getTiktokLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _tiktokLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TiktokLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 120.0f);
        pathBuilder.arcToRelative(95.55f, 95.55f, 0.0f, false, true, -56.0f, -18.0f);
        pathBuilder.verticalLineToRelative(54.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, true, -136.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -33.46f, 24.17f, -62.33f, 56.0f, -68.0f);
        pathBuilder.verticalLineToRelative(42.69f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 128.0f, 156.0f);
        pathBuilder.verticalLineTo(24.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(224.0f, 72.0f);
        pathBuilder2.arcToRelative(48.05f, 48.05f, 0.0f, false, true, -48.0f, -48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder2.lineTo(128.0f, 16.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder2.lineTo(120.0f, 156.0f);
        pathBuilder2.arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.57f, -18.08f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 96.0f, 130.69f);
        pathBuilder2.lineTo(96.0f, 88.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.4f, -7.88f);
        pathBuilder2.curveTo(50.91f, 86.48f, 24.0f, 119.1f, 24.0f, 156.0f);
        pathBuilder2.arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f);
        pathBuilder2.lineTo(176.0f, 116.29f);
        pathBuilder2.arcTo(103.25f, 103.25f, 0.0f, false, false, 224.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f);
        pathBuilder2.lineTo(232.0f, 80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 111.64f);
        pathBuilder2.arcToRelative(87.19f, 87.19f, 0.0f, false, true, -43.33f, -16.15f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 102.0f);
        pathBuilder2.verticalLineToRelative(54.0f);
        pathBuilder2.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f);
        pathBuilder2.curveToRelative(0.0f, -25.9f, 16.64f, -49.13f, 40.0f, -57.6f);
        pathBuilder2.verticalLineToRelative(27.67f);
        pathBuilder2.arcTo(36.0f, 36.0f, 0.0f, true, false, 136.0f, 156.0f);
        pathBuilder2.lineTo(136.0f, 32.0f);
        pathBuilder2.horizontalLineToRelative(24.5f);
        pathBuilder2.arcTo(64.14f, 64.14f, 0.0f, false, false, 216.0f, 87.5f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _tiktokLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
