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

/* compiled from: Microsoftteamslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftTeamsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMicrosoftTeamsLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftTeamsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftteamslogoKt {
    private static ImageVector _microsoftTeamsLogo;

    public static final ImageVector getMicrosoftTeamsLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(108.0f, 104.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(92.0f, 108.0f);
        pathBuilder.verticalLineToRelative(44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(84.0f, 108.0f);
        pathBuilder.lineTo(72.0f, 108.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 92.74f);
        pathBuilder.lineTo(228.0f, 152.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, -35.44f, 36.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, true, -113.13f, 0.0f);
        pathBuilder.lineTo(40.0f, 188.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(28.0f, 80.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 68.0f);
        pathBuilder.horizontalLineToRelative(62.07f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 66.48f, -27.36f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 35.0f, 43.36f);
        pathBuilder.horizontalLineToRelative(15.69f);
        pathBuilder.arcTo(8.75f, 8.75f, 0.0f, false, true, 228.0f, 92.74f);
        pathBuilder.close();
        pathBuilder.moveTo(171.23f, 48.61f);
        pathBuilder.arcTo(36.0f, 36.0f, 0.0f, false, true, 158.64f, 84.0f);
        pathBuilder.lineTo(184.0f, 84.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, -12.77f, -35.39f);
        pathBuilder.close();
        pathBuilder.moveTo(110.71f, 68.0f);
        pathBuilder.lineTo(136.0f, 68.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f);
        pathBuilder.verticalLineToRelative(1.29f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, true, false, 110.71f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(40.0f, 180.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(140.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(40.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 180.0f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 168.0f);
        pathBuilder.lineTo(188.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(148.0f, 92.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(88.0f, 188.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, false, 100.0f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 92.74f);
        pathBuilder.arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.74f, -0.74f);
        pathBuilder.horizontalLineToRelative(-24.0f);
        pathBuilder.arcToRelative(11.8f, 11.8f, 0.0f, false, true, 0.7f, 4.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(60.23f, 60.23f, 0.0f, false, true, -1.18f, 11.86f);
        pathBuilder.arcTo(28.0f, 28.0f, 0.0f, false, false, 220.0f, 152.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftTeamsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
