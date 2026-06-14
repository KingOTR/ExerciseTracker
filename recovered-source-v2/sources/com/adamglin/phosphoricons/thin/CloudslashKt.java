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

/* compiled from: Cloudslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getCloudSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudslashKt {
    private static ImageVector _cloudSlash;

    public static final ImageVector getCloudSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _cloudSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CloudSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(86.16f, 87.93f);
        pathBuilder.quadToRelative(-1.38f, 2.55f, -2.59f, 5.19f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, true, false, 72.0f, 212.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(83.19f, 83.19f, 0.0f, false, false, 32.88f, -6.69f);
        pathBuilder.lineTo(205.0f, 218.69f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 204.0f);
        pathBuilder.lineTo(72.0f, 204.0f);
        pathBuilder.arcToRelative(52.0f, 52.0f, 0.0f, false, true, 0.0f, -104.0f);
        pathBuilder.arcToRelative(52.92f, 52.92f, 0.0f, false, true, 8.54f, 0.72f);
        pathBuilder.arcTo(84.21f, 84.21f, 0.0f, false, false, 76.0f, 128.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.arcToRelative(76.0f, 76.0f, 0.0f, false, true, 7.9f, -33.76f);
        pathBuilder.lineTo(187.13f, 199.0f);
        pathBuilder.arcTo(75.37f, 75.37f, 0.0f, false, true, 160.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 128.0f);
        pathBuilder.arcToRelative(83.86f, 83.86f, 0.0f, false, true, -21.34f, 55.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.33f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, false, 115.0f, 66.75f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.74f, -6.45f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 244.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
