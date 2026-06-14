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

/* compiled from: Applepodcastslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ApplePodcastsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getApplePodcastsLogo", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_applePodcastsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplepodcastslogoKt {
    private static ImageVector _applePodcastsLogo;

    public static final ImageVector getApplePodcastsLogo(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _applePodcastsLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ApplePodcastsLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(147.26f, 140.3f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, false, -38.52f, 0.0f);
        pathBuilder.arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.54f, 7.52f);
        pathBuilder.arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, 17.05f);
        pathBuilder.lineToRelative(12.18f, 48.0f);
        pathBuilder.arcTo(20.17f, 20.17f, 0.0f, false, false, 124.44f, 228.0f);
        pathBuilder.horizontalLineToRelative(7.12f);
        pathBuilder.arcToRelative(20.17f, 20.17f, 0.0f, false, false, 19.64f, -15.13f);
        pathBuilder.lineToRelative(12.18f, -48.0f);
        pathBuilder.arcToRelative(19.67f, 19.67f, 0.0f, false, false, -3.58f, -17.05f);
        pathBuilder.arcTo(20.12f, 20.12f, 0.0f, false, false, 147.26f, 140.3f);
        pathBuilder.close();
        pathBuilder.moveTo(108.0f, 120.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.63f, 162.9f);
        pathBuilder.lineTo(143.45f, 210.9f);
        pathBuilder.arcToRelative(12.19f, 12.19f, 0.0f, false, true, -11.89f, 9.1f);
        pathBuilder.horizontalLineToRelative(-7.12f);
        pathBuilder.arcToRelative(12.19f, 12.19f, 0.0f, false, true, -11.89f, -9.1f);
        pathBuilder.lineToRelative(-12.18f, -48.0f);
        pathBuilder.arcToRelative(11.76f, 11.76f, 0.0f, false, true, 2.14f, -10.17f);
        pathBuilder.arcToRelative(12.24f, 12.24f, 0.0f, false, true, 9.74f, -4.73f);
        pathBuilder.horizontalLineToRelative(31.5f);
        pathBuilder.arcToRelative(12.24f, 12.24f, 0.0f, false, true, 9.74f, 4.73f);
        pathBuilder.arcTo(11.76f, 11.76f, 0.0f, false, true, 155.63f, 162.9f);
        pathBuilder.close();
        pathBuilder.moveTo(188.0f, 128.0f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, true, false, 70.19f, 144.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -7.71f, 2.14f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, true, true, 131.0f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.85f, 2.93f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -1.07f, -0.14f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.79f, -4.93f);
        pathBuilder.arcTo(60.19f, 60.19f, 0.0f, false, false, 188.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.0f, 128.0f);
        pathBuilder.arcToRelative(99.92f, 99.92f, 0.0f, false, true, -44.4f, 83.13f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, -6.64f);
        pathBuilder.arcToRelative(92.0f, 92.0f, 0.0f, true, false, -102.28f, 0.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.46f, 6.64f);
        pathBuilder.arcTo(100.0f, 100.0f, 0.0f, true, true, 228.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _applePodcastsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
