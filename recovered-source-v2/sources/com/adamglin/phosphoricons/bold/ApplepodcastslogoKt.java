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

/* compiled from: Applepodcastslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ApplePodcastsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getApplePodcastsLogo", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_applePodcastsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplepodcastslogoKt {
    private static ImageVector _applePodcastsLogo;

    public static final ImageVector getApplePodcastsLogo(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(161.36f, 130.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -66.72f, 0.0f);
        pathBuilder.arcToRelative(28.35f, 28.35f, 0.0f, false, false, -4.52f, 4.51f);
        pathBuilder.arcToRelative(27.86f, 27.86f, 0.0f, false, false, -5.42f, 23.67f);
        pathBuilder.lineToRelative(12.75f, 56.0f);
        pathBuilder.arcTo(27.87f, 27.87f, 0.0f, false, false, 124.77f, 236.0f);
        pathBuilder.horizontalLineToRelative(6.46f);
        pathBuilder.arcToRelative(27.87f, 27.87f, 0.0f, false, false, 27.32f, -21.79f);
        pathBuilder.lineToRelative(12.75f, -56.0f);
        pathBuilder.arcToRelative(27.86f, 27.86f, 0.0f, false, false, -5.42f, -23.67f);
        pathBuilder.arcTo(28.35f, 28.35f, 0.0f, false, false, 161.36f, 130.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 92.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 92.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.89f, 152.88f);
        pathBuilder.lineTo(135.15f, 208.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, 3.12f);
        pathBuilder.horizontalLineToRelative(-6.46f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.92f, -3.12f);
        pathBuilder.lineToRelative(-12.74f, -56.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, 0.77f, -3.37f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 148.0f);
        pathBuilder.lineTo(144.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.15f, 1.51f);
        pathBuilder.arcTo(3.92f, 3.92f, 0.0f, false, true, 147.89f, 152.88f);
        pathBuilder.close();
        pathBuilder.moveTo(236.0f, 128.0f);
        pathBuilder.arcToRelative(107.88f, 107.88f, 0.0f, false, true, -38.0f, 82.21f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 182.47f, 192.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, true, false, -108.94f, 0.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 58.0f, 210.21f);
        pathBuilder.arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _applePodcastsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
