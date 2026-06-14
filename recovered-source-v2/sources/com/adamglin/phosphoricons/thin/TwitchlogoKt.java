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

/* compiled from: Twitchlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TwitchLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getTwitchLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_twitchLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TwitchlogoKt {
    private static ImageVector _twitchLogo;

    public static final ImageVector getTwitchLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _twitchLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TwitchLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 36.0f);
        pathBuilder.lineTo(48.0f, 36.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f);
        pathBuilder.lineTo(36.0f, 192.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(68.0f, 204.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.3f, 3.62f);
        pathBuilder.arcTo(3.9f, 3.9f, 0.0f, false, false, 72.0f, 244.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.56f, -0.93f);
        pathBuilder.lineTo(121.45f, 204.0f);
        pathBuilder.lineTo(165.1f, 204.0f);
        pathBuilder.arcToRelative(12.06f, 12.06f, 0.0f, false, false, 7.69f, -2.78f);
        pathBuilder.lineToRelative(42.89f, -35.75f);
        pathBuilder.arcToRelative(11.93f, 11.93f, 0.0f, false, false, 4.32f, -9.22f);
        pathBuilder.lineTo(220.0f, 48.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 156.25f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.44f, 3.08f);
        pathBuilder.lineToRelative(-42.9f, 35.74f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.56f, 0.93f);
        pathBuilder.lineTo(120.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.56f, 0.93f);
        pathBuilder.lineTo(76.0f, 231.46f);
        pathBuilder.lineTo(76.0f, 200.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f);
        pathBuilder.lineTo(48.0f, 196.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(44.0f, 48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(208.0f, 44.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(172.0f, 88.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(164.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(124.0f, 88.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _twitchLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
