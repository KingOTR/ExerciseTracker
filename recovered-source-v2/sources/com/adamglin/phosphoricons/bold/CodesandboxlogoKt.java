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

/* compiled from: Codesandboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodesandboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCodesandboxLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codesandboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodesandboxlogoKt {
    private static ImageVector _codesandboxLogo;

    public static final ImageVector getCodesandboxLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _codesandboxLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CodesandboxLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(225.6f, 62.65f);
        pathBuilder.lineToRelative(-88.0f, -48.18f);
        pathBuilder.arcToRelative(19.91f, 19.91f, 0.0f, false, false, -19.2f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.17f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 80.19f);
        pathBuilder.verticalLineToRelative(95.62f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 10.4f, 17.55f);
        pathBuilder.lineToRelative(88.0f, 48.17f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 19.2f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.18f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 236.0f, 175.81f);
        pathBuilder.lineTo(236.0f, 80.19f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 225.6f, 62.65f);
        pathBuilder.close();
        pathBuilder.moveTo(164.0f, 152.0f);
        pathBuilder.verticalLineToRelative(47.72f);
        pathBuilder.lineToRelative(-24.0f, 13.14f);
        pathBuilder.lineTo(140.0f, 135.11f);
        pathBuilder.lineToRelative(72.0f, -39.42f);
        pathBuilder.verticalLineToRelative(22.92f);
        pathBuilder.lineToRelative(-41.76f, 22.86f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(85.76f, 141.47f);
        pathBuilder.lineTo(44.0f, 118.61f);
        pathBuilder.lineTo(44.0f, 95.69f);
        pathBuilder.lineToRelative(72.0f, 39.42f);
        pathBuilder.verticalLineToRelative(77.75f);
        pathBuilder.lineTo(92.0f, 199.72f);
        pathBuilder.lineTo(92.0f, 152.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 85.76f, 141.47f);
        pathBuilder.close();
        pathBuilder.moveTo(83.14f, 61.13f);
        pathBuilder.lineToRelative(39.1f, 21.4f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f);
        pathBuilder.lineToRelative(39.1f, -21.4f);
        pathBuilder.lineTo(199.0f, 75.45f);
        pathBuilder.lineToRelative(-71.0f, 38.87f);
        pathBuilder.lineTo(57.0f, 75.45f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 36.57f);
        pathBuilder.lineToRelative(19.87f, 10.88f);
        pathBuilder.lineTo(128.0f, 58.33f);
        pathBuilder.lineTo(108.13f, 47.45f);
        pathBuilder.close();
        pathBuilder.moveTo(44.0f, 146.0f);
        pathBuilder.lineToRelative(24.0f, 13.14f);
        pathBuilder.verticalLineToRelative(27.47f);
        pathBuilder.lineTo(44.0f, 173.44f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 186.61f);
        pathBuilder.lineTo(188.0f, 159.11f);
        pathBuilder.lineTo(212.0f, 146.0f);
        pathBuilder.verticalLineToRelative(27.47f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codesandboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
