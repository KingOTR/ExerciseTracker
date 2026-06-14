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

/* compiled from: Googledrivelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleDriveLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getGoogleDriveLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleDriveLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogledrivelogoKt {
    private static ImageVector _googleDriveLogo;

    public static final ImageVector getGoogleDriveLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(24.0f, 152.0f);
        pathBuilder.lineTo(88.0f, 152.0f);
        pathBuilder.lineTo(55.12f, 206.8f);
        pathBuilder.arcTo(7.91f, 7.91f, 0.0f, false, true, 52.38f, 204.0f);
        pathBuilder.lineTo(25.05f, 156.15f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 24.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(168.0f, 152.0f);
        pathBuilder.lineTo(200.88f, 206.8f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.74f, -2.83f);
        pathBuilder.lineToRelative(27.32f, -47.82f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.43f, 32.0f);
        pathBuilder.arcToRelative(8.06f, 8.06f, 0.0f, false, false, -3.84f, 1.0f);
        pathBuilder.lineTo(128.0f, 85.33f);
        pathBuilder.lineTo(159.41f, 33.0f);
        pathBuilder.arcToRelative(8.07f, 8.07f, 0.0f, false, false, -3.85f, -1.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(237.6f, 143.78f);
        pathBuilder2.lineTo(169.13f, 31.52f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 155.56f, 24.0f);
        pathBuilder2.lineTo(100.43f, 24.0f);
        pathBuilder2.arcToRelative(15.89f, 15.89f, 0.0f, false, false, -13.56f, 7.52f);
        pathBuilder2.lineToRelative(-0.05f, 0.07f);
        pathBuilder2.lineTo(18.44f, 143.7f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -0.33f, 16.42f);
        pathBuilder2.lineToRelative(27.32f, 47.82f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 59.32f, 216.0f);
        pathBuilder2.lineTo(196.67f, 216.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.89f, -8.06f);
        pathBuilder2.lineToRelative(27.32f, -47.82f);
        pathBuilder2.arcTo(15.91f, 15.91f, 0.0f, false, false, 237.6f, 143.78f);
        pathBuilder2.close();
        pathBuilder2.moveTo(219.0f, 144.0f);
        pathBuilder2.lineTo(172.52f, 144.0f);
        pathBuilder2.lineTo(137.33f, 85.33f);
        pathBuilder2.lineToRelative(22.75f, -37.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(102.13f, 144.0f);
        pathBuilder2.lineTo(128.0f, 100.88f);
        pathBuilder2.lineTo(153.87f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(163.47f, 160.0f);
        pathBuilder2.lineTo(187.47f, 200.0f);
        pathBuilder2.lineTo(68.53f, 200.0f);
        pathBuilder2.lineToRelative(24.0f, -40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 69.78f);
        pathBuilder2.lineTo(110.12f, 40.0f);
        pathBuilder2.lineToRelative(35.78f, -0.05f);
        pathBuilder2.close();
        pathBuilder2.moveTo(95.91f, 47.41f);
        pathBuilder2.lineToRelative(22.76f, 37.92f);
        pathBuilder2.lineTo(83.47f, 144.0f);
        pathBuilder2.lineTo(37.0f, 144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(36.54f, 160.0f);
        pathBuilder2.lineTo(73.87f, 160.0f);
        pathBuilder2.lineTo(54.72f, 191.92f);
        pathBuilder2.close();
        pathBuilder2.moveTo(201.28f, 191.93f);
        pathBuilder2.lineTo(182.12f, 160.0f);
        pathBuilder2.horizontalLineToRelative(37.41f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleDriveLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
