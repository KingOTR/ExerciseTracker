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

/* compiled from: Webhookslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WebhooksLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getWebhooksLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_webhooksLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebhookslogoKt {
    private static ImageVector _webhooksLogo;

    public static final ImageVector getWebhooksLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(192.0f, 180.0f);
        pathBuilder.lineTo(118.71f, 180.0f);
        pathBuilder.arcToRelative(56.0f, 56.0f, 0.0f, true, true, -104.6f, -37.46f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.37f, 10.92f);
        pathBuilder.arcTo(31.64f, 31.64f, 0.0f, false, false, 32.0f, 168.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 112.0f);
        pathBuilder.arcToRelative(55.9f, 55.9f, 0.0f, false, false, -18.45f, 3.12f);
        pathBuilder.lineTo(138.22f, 57.71f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.44f, 12.58f);
        pathBuilder.lineToRelative(40.94f, 66.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.52f, 3.93f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 19.68f, 59.13f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 223.82f);
        pathBuilder.arcToRelative(10.05f, 10.05f, 0.0f, false, false, 1.09f, 0.0f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, false, false, 192.0f, 112.0f);
        pathBuilder.close();
        pathBuilder.moveTo(57.71f, 178.22f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.51f, -3.93f);
        pathBuilder.lineToRelative(40.94f, -66.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.92f, -16.51f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.28f, -41.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.37f, -10.92f);
        pathBuilder.arcTo(56.0f, 56.0f, 0.0f, true, false, 89.1f, 104.32f);
        pathBuilder.lineTo(53.78f, 161.71f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 57.71f, 178.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _webhooksLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
