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

/* compiled from: Googleplaylogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GooglePlayLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGooglePlayLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googlePlayLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogleplaylogoKt {
    private static ImageVector _googlePlayLogo;

    public static final ImageVector getGooglePlayLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(237.89f, 117.69f);
        pathBuilder.lineTo(70.05f, 21.62f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.13f, 0.0f);
        pathBuilder.arcTo(11.69f, 11.69f, 0.0f, false, false, 52.0f, 31.87f);
        pathBuilder.lineTo(52.0f, 224.13f);
        pathBuilder.arcToRelative(11.69f, 11.69f, 0.0f, false, false, 5.92f, 10.21f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.13f, 0.0f);
        pathBuilder.lineToRelative(167.77f, -96.0f);
        pathBuilder.arcToRelative(11.76f, 11.76f, 0.0f, false, false, 0.07f, -20.66f);
        pathBuilder.close();
        pathBuilder.moveTo(185.45f, 96.89f);
        pathBuilder.lineTo(160.0f, 122.34f);
        pathBuilder.lineTo(66.4f, 28.75f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 222.33f);
        pathBuilder.lineTo(60.0f, 33.67f);
        pathBuilder.lineTo(154.34f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(66.4f, 227.25f);
        pathBuilder.lineTo(160.0f, 133.66f);
        pathBuilder.lineToRelative(25.45f, 25.45f);
        pathBuilder.close();
        pathBuilder.moveTo(233.91f, 131.37f);
        pathBuilder.lineTo(192.65f, 155.0f);
        pathBuilder.lineToRelative(-27.0f, -27.0f);
        pathBuilder.lineToRelative(27.0f, -27.0f);
        pathBuilder.lineTo(234.0f, 124.66f);
        pathBuilder.arcToRelative(3.77f, 3.77f, 0.0f, false, true, -0.07f, 6.71f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googlePlayLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
