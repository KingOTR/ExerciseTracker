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

/* compiled from: Microsoftoutlooklogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftOutlookLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMicrosoftOutlookLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftOutlookLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftoutlooklogoKt {
    private static ImageVector _microsoftOutlookLogo;

    public static final ImageVector getMicrosoftOutlookLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _microsoftOutlookLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrosoftOutlookLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(124.0f, 128.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, false, 124.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(76.0f, 128.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 100.0f);
        pathBuilder.lineTo(212.0f, 100.0f);
        pathBuilder.lineTo(212.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(104.0f, 20.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 32.0f);
        pathBuilder.lineTo(92.0f, 56.0f);
        pathBuilder.lineTo(36.0f, 56.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 16.0f, 76.0f);
        pathBuilder.lineTo(16.0f, 180.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(68.0f, 200.0f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(216.0f, 236.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(236.0f, 112.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 100.0f);
        pathBuilder.close();
        pathBuilder.moveTo(171.55f, 168.0f);
        pathBuilder.lineTo(212.0f, 136.54f);
        pathBuilder.verticalLineToRelative(62.92f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(72.0f);
        pathBuilder.verticalLineToRelative(80.8f);
        pathBuilder.lineToRelative(-28.0f, 21.78f);
        pathBuilder.lineTo(160.0f, 76.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f);
        pathBuilder.lineTo(116.0f, 56.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 80.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.lineTo(40.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 200.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 18.28f, -11.92f);
        pathBuilder.lineTo(189.0f, 212.0f);
        pathBuilder.lineTo(92.0f, 212.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftOutlookLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
