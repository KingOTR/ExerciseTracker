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

/* compiled from: Microsoftwordlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrosoftWordLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getMicrosoftWordLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microsoftWordLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrosoftwordlogoKt {
    private static ImageVector _microsoftWordLogo;

    public static final ImageVector getMicrosoftWordLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(200.0f, 28.0f);
        pathBuilder.lineTo(72.0f, 28.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f);
        pathBuilder.lineTo(60.0f, 68.0f);
        pathBuilder.lineTo(40.0f, 68.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(60.0f, 188.0f);
        pathBuilder.verticalLineToRelative(28.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(200.0f, 228.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(212.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(156.0f, 100.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(156.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.0f, 40.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(200.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.lineTo(204.0f, 92.0f);
        pathBuilder.lineTo(156.0f, 92.0f);
        pathBuilder.lineTo(156.0f, 80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f);
        pathBuilder.lineTo(68.0f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 176.0f);
        pathBuilder.lineTo(36.0f, 80.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(144.0f, 76.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f);
        pathBuilder.lineTo(40.0f, 180.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 176.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 220.0f);
        pathBuilder.lineTo(72.0f, 220.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(68.0f, 188.0f);
        pathBuilder.horizontalLineToRelative(76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(156.0f, 164.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(72.12f, 153.0f);
        pathBuilder.lineToRelative(-12.0f, -48.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, true, true, 67.88f, 103.0f);
        pathBuilder.lineToRelative(9.38f, 37.51f);
        pathBuilder.lineToRelative(11.16f, -22.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.16f, 0.0f);
        pathBuilder.lineToRelative(11.16f, 22.33f);
        pathBuilder.lineTo(116.12f, 103.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.76f, 1.94f);
        pathBuilder.lineToRelative(-12.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.44f, 3.0f);
        pathBuilder.lineToRelative(-0.44f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -2.21f);
        pathBuilder.lineTo(92.0f, 128.94f);
        pathBuilder.lineTo(79.58f, 153.79f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.46f, -0.82f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microsoftWordLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
