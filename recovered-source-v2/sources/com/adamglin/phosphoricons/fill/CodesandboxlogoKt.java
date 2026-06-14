package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Codesandboxlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CodesandboxLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCodesandboxLogo", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_codesandboxLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodesandboxlogoKt {
    private static ImageVector _codesandboxLogo;

    public static final ImageVector getCodesandboxLogo(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(229.89f, 72.25f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.18f, -6.06f);
        pathBuilder.lineTo(135.68f, 18.0f);
        pathBuilder.arcToRelative(15.94f, 15.94f, 0.0f, false, false, -15.36f, 0.0f);
        pathBuilder.lineToRelative(-88.0f, 48.18f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, -6.18f, 6.06f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.verticalLineToRelative(0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.18f);
        pathBuilder.verticalLineToRelative(95.64f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f);
        pathBuilder.lineToRelative(88.0f, 48.17f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f);
        pathBuilder.lineToRelative(88.0f, -48.17f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f);
        pathBuilder.lineTo(232.0f, 80.18f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 229.89f, 72.25f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 219.61f);
        pathBuilder.lineTo(88.0f, 202.09f);
        pathBuilder.lineTo(88.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.16f, -7.0f);
        pathBuilder.lineTo(40.0f, 121.0f);
        pathBuilder.verticalLineToRelative(-32.0f);
        pathBuilder.lineToRelative(80.0f, 43.8f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 118.88f);
        pathBuilder.lineTo(48.66f, 75.44f);
        pathBuilder.lineTo(83.14f, 56.57f);
        pathBuilder.lineToRelative(41.0f, 22.45f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.68f, 0.0f);
        pathBuilder.lineToRelative(41.0f, -22.45f);
        pathBuilder.lineToRelative(34.48f, 18.87f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 120.98f);
        pathBuilder.lineTo(172.16f, 144.98f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.16f, 7.0f);
        pathBuilder.verticalLineToRelative(50.09f);
        pathBuilder.lineToRelative(-32.0f, 17.52f);
        pathBuilder.lineTo(136.0f, 132.74f);
        pathBuilder.lineToRelative(80.0f, -43.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _codesandboxLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
