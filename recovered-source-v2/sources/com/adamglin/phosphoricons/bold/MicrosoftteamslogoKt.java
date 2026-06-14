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

/* compiled from: Microsoftteamslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftTeamsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMicrosoftTeamsLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftTeamsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftteamslogoKt {
    private static ImageVector _microsoftTeamsLogo;

    public static final ImageVector getMicrosoftTeamsLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _microsoftTeamsLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrosoftTeamsLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(116.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(76.0f, 116.0f);
        pathBuilder.lineTo(72.0f, 116.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 92.74f);
        pathBuilder.lineTo(240.0f, 152.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, true, 198.0f, 196.0f);
        pathBuilder.arcTo(68.0f, 68.0f, 0.0f, false, true, 76.0f, 200.0f);
        pathBuilder.lineTo(36.0f, 200.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(16.0f, 76.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 36.0f, 56.0f);
        pathBuilder.lineTo(92.0f, 56.0f);
        pathBuilder.arcToRelative(44.0f, 44.0f, 0.0f, false, true, 80.51f, -24.53f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 221.94f, 76.0f);
        pathBuilder.horizontalLineToRelative(1.32f);
        pathBuilder.arcTo(16.76f, 16.76f, 0.0f, false, true, 240.0f, 92.74f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 55.09f);
        pathBuilder.curveToRelative(0.0f, 0.3f, 0.0f, 0.6f, 0.0f, 0.91f);
        pathBuilder.arcToRelative(44.14f, 44.14f, 0.0f, false, true, -4.77f, 20.0f);
        pathBuilder.lineTo(188.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, -8.0f, -20.91f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(24.0f);
        pathBuilder.arcToRelative(19.93f, 19.93f, 0.0f, false, true, 14.86f, 6.66f);
        pathBuilder.arcTo(20.25f, 20.25f, 0.0f, false, false, 156.0f, 56.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 176.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.lineTo(136.0f, 80.0f);
        pathBuilder.lineTo(40.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 168.0f);
        pathBuilder.lineTo(180.0f, 100.0f);
        pathBuilder.lineTo(160.0f, 100.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f);
        pathBuilder.lineTo(105.86f, 200.0f);
        pathBuilder.arcTo(44.0f, 44.0f, 0.0f, false, false, 180.0f, 168.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 100.0f);
        pathBuilder.lineTo(204.0f, 100.0f);
        pathBuilder.verticalLineToRelative(68.0f);
        pathBuilder.curveToRelative(0.0f, 0.79f, 0.0f, 1.57f, -0.06f, 2.35f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftTeamsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
