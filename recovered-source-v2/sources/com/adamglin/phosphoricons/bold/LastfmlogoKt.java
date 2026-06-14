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

/* compiled from: Lastfmlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LastfmLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLastfmLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lastfmLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LastfmlogoKt {
    private static ImageVector _lastfmLogo;

    public static final ImageVector getLastfmLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _lastfmLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LastfmLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(252.0f, 160.0f);
        pathBuilder.arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f);
        pathBuilder.horizontalLineTo(190.57f);
        pathBuilder.arcToRelative(60.2f, 60.2f, 0.0f, false, true, -54.37f, -34.63f);
        pathBuilder.lineToRelative(-30.15f, -64.59f);
        pathBuilder.arcTo(36.13f, 36.13f, 0.0f, false, false, 73.43f, 84.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 25.68f, -16.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.0f, 9.6f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 72.0f, 204.0f);
        pathBuilder.horizontalLineTo(64.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 4.0f, 144.0f);
        pathBuilder.verticalLineTo(120.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, true, 64.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(9.43f);
        pathBuilder.arcTo(60.2f, 60.2f, 0.0f, false, true, 127.8f, 94.63f);
        pathBuilder.lineTo(158.0f, 159.22f);
        pathBuilder.arcTo(36.13f, 36.13f, 0.0f, false, false, 190.57f, 180.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.horizontalLineTo(188.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(44.05f, 44.05f, 0.0f, false, true, 252.0f, 160.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lastfmLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
