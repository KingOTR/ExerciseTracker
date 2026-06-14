package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Applepodcastslogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ApplePodcastsLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getApplePodcastsLogo", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_applePodcastsLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ApplepodcastslogoKt {
    private static ImageVector _applePodcastsLogo;

    public static final ImageVector getApplePodcastsLogo(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(104.0f, 120.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(143.75f, 144.0f);
        pathBuilder.horizontalLineToRelative(-31.5f);
        pathBuilder.arcToRelative(16.06f, 16.06f, 0.0f, false, false, -15.76f, 19.88f);
        pathBuilder.lineToRelative(12.19f, 48.0f);
        pathBuilder.arcTo(16.2f, 16.2f, 0.0f, false, false, 124.44f, 224.0f);
        pathBuilder.horizontalLineToRelative(7.12f);
        pathBuilder.arcToRelative(16.2f, 16.2f, 0.0f, false, false, 15.76f, -12.12f);
        pathBuilder.lineToRelative(12.19f, -48.0f);
        pathBuilder.arcTo(16.06f, 16.06f, 0.0f, false, false, 143.75f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(154.2f, 138.33f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, true, false, -52.4f, 0.0f);
        pathBuilder2.arcToRelative(24.18f, 24.18f, 0.0f, false, false, -8.76f, 7.0f);
        pathBuilder2.arcToRelative(23.68f, 23.68f, 0.0f, false, false, -4.3f, 20.49f);
        pathBuilder2.lineToRelative(12.18f, 48.0f);
        pathBuilder2.arcTo(24.18f, 24.18f, 0.0f, false, false, 124.44f, 232.0f);
        pathBuilder2.horizontalLineToRelative(7.12f);
        pathBuilder2.arcToRelative(24.18f, 24.18f, 0.0f, false, false, 23.52f, -18.15f);
        pathBuilder2.lineToRelative(12.18f, -48.0f);
        pathBuilder2.arcToRelative(23.68f, 23.68f, 0.0f, false, false, -4.3f, -20.49f);
        pathBuilder2.arcTo(24.18f, 24.18f, 0.0f, false, false, 154.2f, 138.33f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 104.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 104.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(151.75f, 161.91f);
        pathBuilder2.lineTo(139.57f, 209.91f);
        pathBuilder2.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.0f, 6.09f);
        pathBuilder2.horizontalLineToRelative(-7.12f);
        pathBuilder2.arcToRelative(8.18f, 8.18f, 0.0f, false, true, -8.0f, -6.09f);
        pathBuilder2.lineToRelative(-12.18f, -48.0f);
        pathBuilder2.arcToRelative(7.71f, 7.71f, 0.0f, false, true, 1.42f, -6.73f);
        pathBuilder2.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 6.58f, -3.18f);
        pathBuilder2.horizontalLineToRelative(31.5f);
        pathBuilder2.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 6.58f, 3.18f);
        pathBuilder2.arcTo(7.71f, 7.71f, 0.0f, false, true, 151.75f, 161.91f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.0f, 128.0f);
        pathBuilder2.arcToRelative(56.31f, 56.31f, 0.0f, false, false, 2.0f, 15.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.41f, 4.29f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, true, true, 138.74f, 0.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 182.0f, 143.0f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, true, false, 72.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 128.0f);
        pathBuilder2.arcToRelative(103.92f, 103.92f, 0.0f, false, true, -46.18f, 86.46f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.9f, -13.3f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, false, -97.84f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.9f, 13.3f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 128.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _applePodcastsLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
