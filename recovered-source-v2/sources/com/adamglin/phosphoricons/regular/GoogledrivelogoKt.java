package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Googledrivelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleDriveLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getGoogleDriveLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleDriveLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogledrivelogoKt {
    private static ImageVector _googleDriveLogo;

    public static final ImageVector getGoogleDriveLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(237.6f, 143.78f);
        pathBuilder.lineTo(169.13f, 31.52f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 155.56f, 24.0f);
        pathBuilder.lineTo(100.43f, 24.0f);
        pathBuilder.arcToRelative(15.89f, 15.89f, 0.0f, false, false, -13.56f, 7.52f);
        pathBuilder.lineToRelative(-0.05f, 0.07f);
        pathBuilder.lineTo(18.44f, 143.7f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.33f, 16.42f);
        pathBuilder.lineToRelative(27.32f, 47.82f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 59.32f, 216.0f);
        pathBuilder.lineTo(196.67f, 216.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.89f, -8.06f);
        pathBuilder.lineToRelative(27.32f, -47.82f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 237.6f, 143.78f);
        pathBuilder.close();
        pathBuilder.moveTo(219.0f, 144.0f);
        pathBuilder.lineTo(172.52f, 144.0f);
        pathBuilder.lineTo(137.33f, 85.33f);
        pathBuilder.lineToRelative(22.75f, -37.92f);
        pathBuilder.close();
        pathBuilder.moveTo(102.13f, 144.0f);
        pathBuilder.lineTo(128.0f, 100.88f);
        pathBuilder.lineTo(153.87f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(163.47f, 160.0f);
        pathBuilder.lineTo(187.47f, 200.0f);
        pathBuilder.lineTo(68.53f, 200.0f);
        pathBuilder.lineToRelative(24.0f, -40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 69.78f);
        pathBuilder.lineTo(110.12f, 40.0f);
        pathBuilder.lineToRelative(35.78f, -0.05f);
        pathBuilder.close();
        pathBuilder.moveTo(95.91f, 47.41f);
        pathBuilder.lineToRelative(22.76f, 37.92f);
        pathBuilder.lineTo(83.47f, 144.0f);
        pathBuilder.lineTo(37.0f, 144.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.54f, 160.0f);
        pathBuilder.lineTo(73.87f, 160.0f);
        pathBuilder.lineTo(54.72f, 191.92f);
        pathBuilder.close();
        pathBuilder.moveTo(201.28f, 191.93f);
        pathBuilder.lineTo(182.12f, 160.0f);
        pathBuilder.horizontalLineToRelative(37.41f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleDriveLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
