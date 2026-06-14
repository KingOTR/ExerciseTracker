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

/* compiled from: Googledrivelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleDriveLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getGoogleDriveLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleDriveLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogledrivelogoKt {
    private static ImageVector _googleDriveLogo;

    public static final ImageVector getGoogleDriveLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _googleDriveLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("GoogleDriveLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.0f, 141.65f);
        pathBuilder.lineTo(172.59f, 29.51f);
        pathBuilder.lineToRelative(-0.07f, -0.11f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, -17.0f, -9.4f);
        pathBuilder.lineTo(100.44f, 20.0f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, -17.0f, 9.4f);
        pathBuilder.lineToRelative(-0.07f, 0.11f);
        pathBuilder.lineTo(15.0f, 141.65f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -0.36f, 20.46f);
        pathBuilder.lineTo(42.0f, 209.92f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 59.33f, 220.0f);
        pathBuilder.lineTo(196.67f, 220.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 214.0f, 209.92f);
        pathBuilder.lineToRelative(27.32f, -47.81f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 241.0f, 141.65f);
        pathBuilder.close();
        pathBuilder.moveTo(211.88f, 140.0f);
        pathBuilder.lineTo(174.79f, 140.0f);
        pathBuilder.lineTo(142.0f, 85.33f);
        pathBuilder.lineToRelative(18.12f, -30.19f);
        pathBuilder.close();
        pathBuilder.moveTo(54.8f, 184.0f);
        pathBuilder.lineTo(43.36f, 164.0f);
        pathBuilder.lineTo(66.81f, 164.0f);
        pathBuilder.close();
        pathBuilder.moveTo(94.8f, 164.0f);
        pathBuilder.horizontalLineToRelative(66.4f);
        pathBuilder.lineToRelative(19.2f, 32.0f);
        pathBuilder.lineTo(75.6f, 196.0f);
        pathBuilder.close();
        pathBuilder.moveTo(109.2f, 140.0f);
        pathBuilder.lineTo(128.0f, 108.66f);
        pathBuilder.lineTo(146.8f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.2f, 164.0f);
        pathBuilder.horizontalLineToRelative(23.45f);
        pathBuilder.lineTo(201.2f, 184.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 62.0f);
        pathBuilder.lineTo(117.19f, 44.0f);
        pathBuilder.horizontalLineToRelative(21.62f);
        pathBuilder.close();
        pathBuilder.moveTo(95.89f, 55.14f);
        pathBuilder.lineTo(114.0f, 85.33f);
        pathBuilder.lineTo(81.21f, 140.0f);
        pathBuilder.lineTo(44.12f, 140.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleDriveLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
