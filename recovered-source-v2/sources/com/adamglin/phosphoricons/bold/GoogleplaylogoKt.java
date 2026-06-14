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

/* compiled from: Googleplaylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GooglePlayLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGooglePlayLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googlePlayLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleplaylogoKt {
    private static ImageVector _googlePlayLogo;

    public static final ImageVector getGooglePlayLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(241.79f, 110.7f);
        pathBuilder.lineTo(74.0f, 14.65f);
        pathBuilder.arcToRelative(20.24f, 20.24f, 0.0f, false, false, -20.12f, 0.06f);
        pathBuilder.arcTo(19.62f, 19.62f, 0.0f, false, false, 44.0f, 31.84f);
        pathBuilder.verticalLineTo(224.16f);
        pathBuilder.arcToRelative(19.62f, 19.62f, 0.0f, false, false, 9.91f, 17.13f);
        pathBuilder.arcToRelative(20.22f, 20.22f, 0.0f, false, false, 20.12f, 0.06f);
        pathBuilder.lineToRelative(167.76f, -96.0f);
        pathBuilder.arcToRelative(19.76f, 19.76f, 0.0f, false, false, 0.0f, -34.6f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 203.0f);
        pathBuilder.verticalLineTo(53.0f);
        pathBuilder.lineToRelative(75.0f, 75.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 145.0f);
        pathBuilder.lineToRelative(12.4f, 12.4f);
        pathBuilder.lineToRelative(-58.0f, 33.2f);
        pathBuilder.close();
        pathBuilder.moveTo(114.41f, 65.43f);
        pathBuilder.lineToRelative(58.0f, 33.2f);
        pathBuilder.lineTo(160.0f, 111.0f);
        pathBuilder.close();
        pathBuilder.moveTo(194.0f, 145.0f);
        pathBuilder.lineToRelative(-17.0f, -17.0f);
        pathBuilder.lineToRelative(17.0f, -17.0f);
        pathBuilder.lineToRelative(29.72f, 17.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googlePlayLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
