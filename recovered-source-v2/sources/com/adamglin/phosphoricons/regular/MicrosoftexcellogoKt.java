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

/* compiled from: Microsoftexcellogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftExcelLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getMicrosoftExcelLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftExcelLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftexcellogoKt {
    private static ImageVector _microsoftExcelLogo;

    public static final ImageVector getMicrosoftExcelLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _microsoftExcelLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrosoftExcelLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.0f, 24.0f);
        pathBuilder.lineTo(72.0f, 24.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f);
        pathBuilder.lineTo(56.0f, 64.0f);
        pathBuilder.lineTo(40.0f, 64.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(56.0f, 192.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(200.0f, 232.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(216.0f, 40.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.lineTo(160.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 88.0f);
        pathBuilder.lineTo(160.0f, 88.0f);
        pathBuilder.lineTo(160.0f, 80.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(144.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.lineTo(128.0f, 64.0f);
        pathBuilder.lineTo(72.0f, 64.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 80.0f);
        pathBuilder.lineTo(144.0f, 80.0f);
        pathBuilder.verticalLineToRelative(79.83f);
        pathBuilder.curveToRelative(0.0f, 0.06f, 0.0f, 0.11f, 0.0f, 0.17f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.11f, 0.0f, 0.17f);
        pathBuilder.lineTo(144.0f, 176.0f);
        pathBuilder.lineTo(40.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.0f, 192.0f);
        pathBuilder.horizontalLineToRelative(56.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.lineTo(72.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(144.0f, 216.0f);
        pathBuilder.lineTo(144.0f, 192.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(40.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(65.85f, 146.88f);
        pathBuilder.lineTo(81.59f, 128.0f);
        pathBuilder.lineTo(65.85f, 109.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.3f, -10.24f);
        pathBuilder.lineTo(92.0f, 115.5f);
        pathBuilder.lineToRelative(13.85f, -16.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.3f, 10.24f);
        pathBuilder.lineTo(102.41f, 128.0f);
        pathBuilder.lineToRelative(15.74f, 18.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, 10.24f);
        pathBuilder.lineTo(92.0f, 140.5f);
        pathBuilder.lineTo(78.15f, 157.12f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.3f, -10.24f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftExcelLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
