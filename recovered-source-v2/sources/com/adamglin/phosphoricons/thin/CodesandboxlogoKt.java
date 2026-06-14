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

/* compiled from: Codesandboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodesandboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCodesandboxLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codesandboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodesandboxlogoKt {
    private static ImageVector _codesandboxLogo;

    public static final ImageVector getCodesandboxLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(221.76f, 69.66f);
        pathBuilder.lineToRelative(-88.0f, -48.18f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.52f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.18f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.18f);
        pathBuilder.verticalLineToRelative(95.64f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.24f, 10.52f);
        pathBuilder.lineToRelative(88.0f, 48.18f);
        pathBuilder.arcToRelative(11.95f, 11.95f, 0.0f, false, false, 11.52f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.18f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 175.82f);
        pathBuilder.lineTo(228.0f, 80.18f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 221.76f, 69.66f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 123.44f);
        pathBuilder.lineToRelative(-87.67f, -48.0f);
        pathBuilder.lineTo(83.14f, 52.0f);
        pathBuilder.lineToRelative(42.94f, 23.5f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.84f, 0.0f);
        pathBuilder.lineTo(172.86f, 52.0f);
        pathBuilder.lineToRelative(42.81f, 23.43f);
        pathBuilder.close();
        pathBuilder.moveTo(126.08f, 28.5f);
        pathBuilder.arcToRelative(3.94f, 3.94f, 0.0f, false, true, 3.84f, 0.0f);
        pathBuilder.lineToRelative(34.61f, 19.0f);
        pathBuilder.lineTo(128.0f, 67.44f);
        pathBuilder.lineToRelative(-36.53f, -20.0f);
        pathBuilder.close();
        pathBuilder.moveTo(36.0f, 175.82f);
        pathBuilder.lineTo(36.0f, 132.47f);
        pathBuilder.lineToRelative(40.0f, 21.9f);
        pathBuilder.verticalLineToRelative(45.72f);
        pathBuilder.lineTo(38.08f, 179.33f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 175.82f);
        pathBuilder.close();
        pathBuilder.moveTo(84.0f, 204.47f);
        pathBuilder.lineTo(84.0f, 152.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.08f, -3.51f);
        pathBuilder.lineTo(36.0f, 123.35f);
        pathBuilder.lineTo(36.0f, 82.19f);
        pathBuilder.lineToRelative(88.0f, 48.18f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.0f, 226.36f);
        pathBuilder.verticalLineToRelative(-96.0f);
        pathBuilder.lineToRelative(88.0f, -48.18f);
        pathBuilder.verticalLineToRelative(41.16f);
        pathBuilder.lineToRelative(-45.92f, 25.14f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 152.0f);
        pathBuilder.verticalLineToRelative(52.47f);
        pathBuilder.close();
        pathBuilder.moveTo(217.92f, 179.36f);
        pathBuilder.lineTo(180.0f, 200.09f);
        pathBuilder.lineTo(180.0f, 154.37f);
        pathBuilder.lineToRelative(40.0f, -21.9f);
        pathBuilder.verticalLineToRelative(43.35f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 217.92f, 179.33f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codesandboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
