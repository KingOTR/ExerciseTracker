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

/* compiled from: Androidlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AndroidLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getAndroidLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_androidLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidlogoKt {
    private static ImageVector _androidLogo;

    public static final ImageVector getAndroidLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _androidLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("AndroidLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(172.0f, 148.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 140.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 92.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 160.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(32.0f, 196.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.lineTo(20.0f, 161.13f);
        pathBuilder.arcTo(109.43f, 109.43f, 0.0f, false, true, 57.18f, 78.84f);
        pathBuilder.lineToRelative(-28.0f, -28.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(63.41f, 73.75f);
        pathBuilder.arcTo(106.63f, 106.63f, 0.0f, false, true, 127.62f, 52.0f);
        pathBuilder.lineTo(128.0f, 52.0f);
        pathBuilder.arcToRelative(107.16f, 107.16f, 0.0f, false, true, 64.78f, 21.57f);
        pathBuilder.lineToRelative(28.39f, -28.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.lineTo(199.0f, 78.64f);
        pathBuilder.curveToRelative(1.78f, 1.56f, 3.52f, 3.17f, 5.21f, 4.86f);
        pathBuilder.arcTo(107.25f, 107.25f, 0.0f, false, true, 236.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 160.0f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, false, false, 128.0f, 60.0f);
        pathBuilder.horizontalLineToRelative(-0.35f);
        pathBuilder.curveTo(72.7f, 60.19f, 28.0f, 105.56f, 28.0f, 161.13f);
        pathBuilder.lineTo(28.0f, 184.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f);
        pathBuilder.lineTo(224.0f, 188.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _androidLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
