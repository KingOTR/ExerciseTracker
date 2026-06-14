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

/* compiled from: Cloudslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getCloudSlash", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudslashKt {
    private static ImageVector _cloudSlash;

    public static final ImageVector getCloudSlash(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(81.32f, 88.55f);
        pathBuilder.lineToRelative(-0.06f, 0.12f);
        pathBuilder.arcTo(65.0f, 65.0f, 0.0f, false, false, 72.0f, 88.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcToRelative(87.34f, 87.34f, 0.0f, false, false, 31.8f, -5.93f);
        pathBuilder.lineToRelative(10.28f, 11.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 200.0f);
        pathBuilder.lineTo(72.0f, 200.0f);
        pathBuilder.arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.2f, 0.0f, 3.3f, 0.12f);
        pathBuilder.arcTo(88.4f, 88.4f, 0.0f, false, false, 72.0f, 128.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder.arcToRelative(72.25f, 72.25f, 0.0f, false, true, 5.06f, -26.54f);
        pathBuilder.lineToRelative(87.0f, 95.7f);
        pathBuilder.arcTo(71.66f, 71.66f, 0.0f, false, true, 160.0f, 200.0f);
        pathBuilder.close();
        pathBuilder.moveTo(248.0f, 128.0f);
        pathBuilder.arcToRelative(87.89f, 87.89f, 0.0f, false, true, -22.35f, 58.61f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 213.71f, 176.0f);
        pathBuilder.arcTo(72.0f, 72.0f, 0.0f, false, false, 117.37f, 70.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.48f, -12.89f);
        pathBuilder.arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
