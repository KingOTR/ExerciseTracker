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

/* compiled from: Microsoftwordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftWordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMicrosoftWordLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftWordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftwordlogoKt {
    private static ImageVector _microsoftWordLogo;

    public static final ImageVector getMicrosoftWordLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _microsoftWordLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrosoftWordLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(152.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder.verticalLineTo(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(144.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 152.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(200.0f, 24.0f);
        pathBuilder2.lineTo(72.0f, 24.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f);
        pathBuilder2.lineTo(56.0f, 64.0f);
        pathBuilder2.lineTo(40.0f, 64.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(96.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(56.0f, 192.0f);
        pathBuilder2.verticalLineToRelative(24.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(200.0f, 232.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(216.0f, 40.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.0f, 104.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.lineTo(160.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 40.0f);
        pathBuilder2.lineTo(200.0f, 40.0f);
        pathBuilder2.lineTo(200.0f, 88.0f);
        pathBuilder2.lineTo(160.0f, 88.0f);
        pathBuilder2.lineTo(160.0f, 80.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder2.lineTo(72.0f, 64.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(40.0f, 80.0f);
        pathBuilder2.lineTo(144.0f, 80.0f);
        pathBuilder2.verticalLineToRelative(79.83f);
        pathBuilder2.curveToRelative(0.0f, 0.06f, 0.0f, 0.11f, 0.0f, 0.17f);
        pathBuilder2.reflectiveCurveToRelative(0.0f, 0.11f, 0.0f, 0.17f);
        pathBuilder2.lineTo(144.0f, 176.0f);
        pathBuilder2.lineTo(40.0f, 176.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 216.0f);
        pathBuilder2.lineTo(72.0f, 192.0f);
        pathBuilder2.horizontalLineToRelative(72.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.verticalLineToRelative(-8.0f);
        pathBuilder2.horizontalLineToRelative(40.0f);
        pathBuilder2.verticalLineToRelative(48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(68.24f, 153.94f);
        pathBuilder2.lineTo(56.24f, 105.94f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.52f, -3.88f);
        pathBuilder2.lineToRelative(6.76f, 27.0f);
        pathBuilder2.lineToRelative(6.32f, -12.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.32f, 0.0f);
        pathBuilder2.lineToRelative(6.32f, 12.66f);
        pathBuilder2.lineToRelative(6.76f, -27.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.52f, 3.88f);
        pathBuilder2.lineToRelative(-12.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.89f, 6.0f);
        pathBuilder2.arcToRelative(8.46f, 8.46f, 0.0f, false, true, -0.87f, 0.05f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -4.42f);
        pathBuilder2.lineTo(92.0f, 137.89f);
        pathBuilder2.lineToRelative(-8.84f, 17.69f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.92f, -1.64f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftWordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
