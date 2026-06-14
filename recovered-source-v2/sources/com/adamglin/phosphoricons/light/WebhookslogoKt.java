package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Webhookslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WebhooksLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getWebhooksLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_webhooksLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebhookslogoKt {
    private static ImageVector _webhooksLogo;

    public static final ImageVector getWebhooksLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _webhooksLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WebhooksLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(179.37f, 174.0f);
        pathBuilder.lineTo(109.6f, 174.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, true, true, -82.4f, -33.61f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, 7.21f);
        pathBuilder.arcTo(33.68f, 33.68f, 0.0f, false, false, 30.0f, 168.0f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, false, false, 68.0f, 0.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f);
        pathBuilder.horizontalLineToRelative(75.37f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, true, true, 0.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 182.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.73f, -21.62f);
        pathBuilder.lineToRelative(36.42f, -59.18f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.0f, -8.25f);
        pathBuilder.arcToRelative(34.0f, 34.0f, 0.0f, true, true, 49.0f, -42.57f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, -4.79f);
        pathBuilder.arcTo(46.0f, 46.0f, 0.0f, true, false, 99.0f, 99.7f);
        pathBuilder.lineTo(65.52f, 154.08f);
        pathBuilder.curveToRelative(-0.5f, -0.05f, -1.0f, -0.08f, -1.52f, -0.08f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 122.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, -18.8f, 4.0f);
        pathBuilder.lineTo(139.73f, 71.61f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, true, false, 128.0f, 78.0f);
        pathBuilder.arcToRelative(12.79f, 12.79f, 0.0f, false, false, 1.52f, -0.09f);
        pathBuilder.lineToRelative(36.4f, 59.17f);
        pathBuilder.arcToRelative(6.05f, 6.05f, 0.0f, false, false, 3.73f, 2.69f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.53f, -0.73f);
        pathBuilder.arcTo(34.0f, 34.0f, 0.0f, true, true, 192.0f, 202.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _webhooksLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
