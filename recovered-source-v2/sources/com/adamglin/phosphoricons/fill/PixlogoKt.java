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

/* compiled from: Pixlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PixLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPixLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pixLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PixlogoKt {
    private static ImageVector _pixLogo;

    public static final ImageVector getPixLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _pixLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PixLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(235.34f, 139.28f);
        pathBuilder.lineToRelative(-19.56f, 19.55f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 213.0f, 160.0f);
        pathBuilder.lineTo(171.32f, 160.0f);
        pathBuilder.lineToRelative(-32.0f, -32.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.lineTo(213.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f);
        pathBuilder.lineToRelative(19.56f, 19.55f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 235.34f, 139.28f);
        pathBuilder.close();
        pathBuilder.moveTo(67.05f, 80.0f);
        pathBuilder.lineTo(88.0f, 80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f);
        pathBuilder.lineTo(128.0f, 116.68f);
        pathBuilder.lineToRelative(34.35f, -34.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 80.0f);
        pathBuilder.lineTo(189.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -6.83f);
        pathBuilder.lineToRelative(-52.5f, -52.51f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.56f, 0.0f);
        pathBuilder.lineTo(64.22f, 73.17f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 67.05f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.0f, 176.0f);
        pathBuilder.lineTo(168.0f, 176.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, -2.34f);
        pathBuilder.lineTo(128.0f, 139.31f);
        pathBuilder.lineTo(93.65f, 173.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(-21.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f);
        pathBuilder.lineToRelative(52.5f, 52.51f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.56f, 0.0f);
        pathBuilder.lineToRelative(52.5f, -52.51f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 189.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(116.74f, 128.0f);
        pathBuilder.lineTo(84.74f, 96.0f);
        pathBuilder.lineTo(43.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.82f, 1.17f);
        pathBuilder.lineTo(20.66f, 116.72f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.56f);
        pathBuilder.lineToRelative(19.56f, 19.55f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 43.0f, 160.0f);
        pathBuilder.lineTo(84.68f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pixLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
