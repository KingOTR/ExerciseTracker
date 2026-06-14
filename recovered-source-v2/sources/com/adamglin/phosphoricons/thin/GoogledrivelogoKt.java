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

/* compiled from: Googledrivelogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GoogleDriveLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getGoogleDriveLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_googleDriveLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GoogledrivelogoKt {
    private static ImageVector _googleDriveLogo;

    public static final ImageVector getGoogleDriveLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(234.19f, 145.86f);
        pathBuilder.lineTo(165.74f, 33.64f);
        pathBuilder.arcTo(11.94f, 11.94f, 0.0f, false, false, 155.56f, 28.0f);
        pathBuilder.lineTo(100.43f, 28.0f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, -10.17f, 5.64f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.lineTo(21.83f, 145.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.25f, 12.32f);
        pathBuilder.lineTo(48.91f, 206.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 59.32f, 212.0f);
        pathBuilder.lineTo(196.67f, 212.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 207.09f, 206.0f);
        pathBuilder.lineToRelative(27.32f, -47.81f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 234.19f, 145.86f);
        pathBuilder.close();
        pathBuilder.moveTo(226.13f, 148.0f);
        pathBuilder.lineTo(170.26f, 148.0f);
        pathBuilder.lineToRelative(-37.6f, -62.67f);
        pathBuilder.lineToRelative(27.39f, -45.65f);
        pathBuilder.close();
        pathBuilder.moveTo(95.06f, 148.0f);
        pathBuilder.lineTo(128.0f, 93.11f);
        pathBuilder.lineTo(160.93f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(165.73f, 156.0f);
        pathBuilder.lineTo(194.53f, 204.0f);
        pathBuilder.lineTo(61.47f, 204.0f);
        pathBuilder.lineToRelative(28.79f, -48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 77.56f);
        pathBuilder.lineTo(103.06f, 36.0f);
        pathBuilder.horizontalLineToRelative(49.87f);
        pathBuilder.close();
        pathBuilder.moveTo(95.94f, 39.68f);
        pathBuilder.lineToRelative(27.39f, 45.65f);
        pathBuilder.lineTo(85.74f, 148.0f);
        pathBuilder.lineTo(29.87f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(29.58f, 156.0f);
        pathBuilder.lineTo(80.94f, 156.0f);
        pathBuilder.lineTo(54.63f, 199.85f);
        pathBuilder.close();
        pathBuilder.moveTo(201.37f, 199.85f);
        pathBuilder.lineTo(175.06f, 156.0f);
        pathBuilder.horizontalLineToRelative(51.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _googleDriveLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
