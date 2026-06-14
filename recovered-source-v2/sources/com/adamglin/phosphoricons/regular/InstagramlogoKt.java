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

/* compiled from: Instagramlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"InstagramLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getInstagramLogo", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_instagramLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstagramlogoKt {
    private static ImageVector _instagramLogo;

    public static final ImageVector getInstagramLogo(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _instagramLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("InstagramLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 80.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f);
        pathBuilder.arcTo(48.05f, 48.05f, 0.0f, false, false, 128.0f, 80.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 160.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 24.0f);
        pathBuilder.lineTo(80.0f, 24.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 24.0f, 80.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f);
        pathBuilder.lineTo(232.0f, 80.0f);
        pathBuilder.arcTo(56.06f, 56.06f, 0.0f, false, false, 176.0f, 24.0f);
        pathBuilder.close();
        pathBuilder.moveTo(216.0f, 176.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder.lineTo(80.0f, 216.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f);
        pathBuilder.lineTo(40.0f, 80.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 80.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 76.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 76.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _instagramLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
