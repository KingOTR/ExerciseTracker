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

/* compiled from: Securitycamera.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SecurityCamera", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSecurityCamera", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_securityCamera", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SecuritycameraKt {
    private static ImageVector _securityCamera;

    public static final ImageVector getSecurityCamera(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 140.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.horizontalLineTo(195.31f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f);
        pathBuilder.lineToRelative(-21.18f, -21.17f);
        pathBuilder.lineToRelative(53.18f, -53.17f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f);
        pathBuilder.lineToRelative(-56.0f, -56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(5.76f, 161.76f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 10.0f, 172.0f);
        pathBuilder.horizontalLineTo(51.0f);
        pathBuilder.lineToRelative(36.48f, 36.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 0.0f);
        pathBuilder.lineToRelative(61.18f, -61.18f);
        pathBuilder.lineToRelative(21.17f, 21.17f);
        pathBuilder.arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.48f, 3.52f);
        pathBuilder.horizontalLineTo(244.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(157.17f, 21.17f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, true, 5.66f, 0.0f);
        pathBuilder.lineToRelative(15.51f, 15.52f);
        pathBuilder.lineTo(51.0f, 164.0f);
        pathBuilder.horizontalLineTo(14.82f);
        pathBuilder.close();
        pathBuilder.moveTo(98.83f, 202.83f);
        pathBuilder.arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(58.34f, 168.0f);
        pathBuilder.lineTo(184.0f, 42.34f);
        pathBuilder.lineToRelative(34.83f, 34.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _securityCamera = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
