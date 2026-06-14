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

/* compiled from: Googleplaylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GooglePlayLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGooglePlayLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googlePlayLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleplaylogoKt {
    private static ImageVector _googlePlayLogo;

    public static final ImageVector getGooglePlayLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(160.0f, 128.0f);
        pathBuilder.lineTo(58.32f, 230.0f);
        pathBuilder.arcTo(7.7f, 7.7f, 0.0f, false, true, 56.0f, 224.45f);
        pathBuilder.verticalLineTo(31.55f);
        pathBuilder.arcTo(7.7f, 7.7f, 0.0f, false, true, 58.32f, 26.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(239.82f, 114.18f);
        pathBuilder2.lineTo(72.0f, 18.16f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.12f, 0.0f);
        pathBuilder2.arcTo(15.68f, 15.68f, 0.0f, false, false, 48.0f, 31.87f);
        pathBuilder2.lineTo(48.0f, 224.13f);
        pathBuilder2.arcToRelative(15.68f, 15.68f, 0.0f, false, false, 7.92f, 13.67f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.12f, 0.0f);
        pathBuilder2.lineToRelative(167.78f, -96.0f);
        pathBuilder2.arcToRelative(15.76f, 15.76f, 0.0f, false, false, 0.0f, -27.64f);
        pathBuilder2.close();
        pathBuilder2.moveTo(64.0f, 212.67f);
        pathBuilder2.lineTo(64.0f, 43.33f);
        pathBuilder2.lineTo(148.69f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 139.31f);
        pathBuilder2.lineTo(178.92f, 158.23f);
        pathBuilder2.lineTo(90.42f, 208.89f);
        pathBuilder2.close();
        pathBuilder2.moveTo(90.4f, 47.1f);
        pathBuilder2.lineToRelative(88.53f, 50.67f);
        pathBuilder2.lineTo(160.0f, 116.69f);
        pathBuilder2.close();
        pathBuilder2.moveTo(193.31f, 150.0f);
        pathBuilder2.lineToRelative(-22.0f, -22.0f);
        pathBuilder2.lineToRelative(22.0f, -22.0f);
        pathBuilder2.lineToRelative(38.43f, 22.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googlePlayLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
