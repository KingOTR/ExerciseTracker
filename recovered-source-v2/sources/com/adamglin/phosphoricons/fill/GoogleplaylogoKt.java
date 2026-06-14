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

/* compiled from: Googleplaylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GooglePlayLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getGooglePlayLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googlePlayLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleplaylogoKt {
    private static ImageVector _googlePlayLogo;

    public static final ImageVector getGooglePlayLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _googlePlayLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GooglePlayLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(239.82f, 114.18f);
        pathBuilder.lineTo(72.0f, 18.16f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.12f, 0.0f);
        pathBuilder.arcTo(15.68f, 15.68f, 0.0f, false, false, 48.0f, 31.87f);
        pathBuilder.verticalLineTo(224.13f);
        pathBuilder.arcToRelative(15.68f, 15.68f, 0.0f, false, false, 7.92f, 13.67f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.12f, 0.0f);
        pathBuilder.lineToRelative(167.78f, -96.0f);
        pathBuilder.arcToRelative(15.76f, 15.76f, 0.0f, false, false, 0.0f, -27.64f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 139.31f);
        pathBuilder.lineToRelative(18.92f, 18.92f);
        pathBuilder.lineToRelative(-88.5f, 50.66f);
        pathBuilder.close();
        pathBuilder.moveTo(90.4f, 47.1f);
        pathBuilder.lineToRelative(88.53f, 50.67f);
        pathBuilder.lineTo(160.0f, 116.69f);
        pathBuilder.close();
        pathBuilder.moveTo(193.31f, 150.0f);
        pathBuilder.lineToRelative(-22.0f, -22.0f);
        pathBuilder.lineToRelative(22.0f, -22.0f);
        pathBuilder.lineToRelative(38.43f, 22.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googlePlayLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
