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

/* compiled from: Androidlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"AndroidLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getAndroidLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_androidLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidlogoKt {
    private static ImageVector _androidLogo;

    public static final ImageVector getAndroidLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(176.0f, 148.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 148.0f);
        pathBuilder.close();
        pathBuilder.moveTo(92.0f, 136.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 160.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f);
        pathBuilder.lineTo(32.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.lineTo(16.0f, 161.13f);
        pathBuilder.arcTo(113.38f, 113.38f, 0.0f, false, true, 51.4f, 78.72f);
        pathBuilder.lineTo(26.34f, 53.66f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 37.66f, 42.34f);
        pathBuilder.lineTo(63.82f, 68.5f);
        pathBuilder.arcToRelative(111.43f, 111.43f, 0.0f, false, true, 128.55f, -0.19f);
        pathBuilder.lineToRelative(26.0f, -26.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineTo(204.82f, 78.5f);
        pathBuilder.curveToRelative(0.75f, 0.71f, 1.5f, 1.43f, 2.24f, 2.17f);
        pathBuilder.arcTo(111.25f, 111.25f, 0.0f, false, true, 240.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 160.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, -96.0f, -96.0f);
        pathBuilder.horizontalLineToRelative(-0.34f);
        pathBuilder.curveTo(74.91f, 64.18f, 32.0f, 107.75f, 32.0f, 161.13f);
        pathBuilder.lineTo(32.0f, 184.0f);
        pathBuilder.lineTo(224.0f, 184.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _androidLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
