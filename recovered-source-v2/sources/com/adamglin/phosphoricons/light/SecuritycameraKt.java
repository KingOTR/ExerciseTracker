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

/* compiled from: Securitycamera.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SecurityCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getSecurityCamera", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_securityCamera", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecuritycameraKt {
    private static ImageVector _securityCamera;

    public static final ImageVector getSecurityCamera(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _securityCamera;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SecurityCamera", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 138.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineTo(195.31f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.59f);
        pathBuilder.lineToRelative(-19.76f, -19.75f);
        pathBuilder.lineTo(225.9f, 89.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.81f, 0.0f);
        pathBuilder.lineTo(4.34f, 160.35f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 10.0f, 174.0f);
        pathBuilder.horizontalLineTo(50.2f);
        pathBuilder.lineToRelative(35.9f, 35.9f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f);
        pathBuilder.lineToRelative(59.76f, -59.76f);
        pathBuilder.lineToRelative(19.75f, 19.76f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f);
        pathBuilder.horizontalLineTo(242.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 138.0f);
        pathBuilder.close();
        pathBuilder.moveTo(158.59f, 22.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f);
        pathBuilder.lineToRelative(14.1f, 14.1f);
        pathBuilder.lineTo(50.2f, 162.0f);
        pathBuilder.horizontalLineTo(19.64f);
        pathBuilder.close();
        pathBuilder.moveTo(97.41f, 201.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.82f, 0.0f);
        pathBuilder.lineTo(61.17f, 168.0f);
        pathBuilder.lineTo(184.0f, 45.17f);
        pathBuilder.lineToRelative(33.41f, 33.42f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _securityCamera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
