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

/* compiled from: Webhookslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WebhooksLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWebhooksLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_webhooksLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WebhookslogoKt {
    private static ImageVector _webhooksLogo;

    public static final ImageVector getWebhooksLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(128.0f, 104.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 128.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 192.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 128.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, false, 64.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(178.16f, 176.0f);
        pathBuilder2.lineTo(111.32f, 176.0f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, true, true, 25.6f, 139.19f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, 9.61f);
        pathBuilder2.arcTo(31.69f, 31.69f, 0.0f, false, false, 32.0f, 168.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder2.horizontalLineToRelative(74.16f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 16.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(64.0f, 184.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 14.08f, -23.61f);
        pathBuilder2.lineToRelative(35.77f, -58.14f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.62f, -11.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 46.1f, -40.06f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 172.0f, 44.79f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, true, false, -75.62f, 55.33f);
        pathBuilder2.lineTo(64.44f, 152.0f);
        pathBuilder2.curveToRelative(-0.15f, 0.0f, -0.29f, 0.0f, -0.44f, 0.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(192.0f, 120.0f);
        pathBuilder2.arcToRelative(48.18f, 48.18f, 0.0f, false, false, -18.0f, 3.49f);
        pathBuilder2.lineTo(142.08f, 71.6f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, true, false, 128.0f, 80.0f);
        pathBuilder2.lineToRelative(0.44f, 0.0f);
        pathBuilder2.lineToRelative(35.78f, 58.15f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, 2.61f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, true, true, 192.0f, 200.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _webhooksLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
