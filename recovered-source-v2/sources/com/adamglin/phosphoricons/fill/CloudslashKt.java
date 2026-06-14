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

/* compiled from: Cloudslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CloudSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getCloudSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_cloudSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudslashKt {
    private static ImageVector _cloudSlash;

    public static final ImageVector getCloudSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 128.72f);
        pathBuilder.arcTo(87.74f, 87.74f, 0.0f, false, true, 222.41f, 190.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.77f, -0.16f);
        pathBuilder.lineTo(103.78f, 65.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.39f, -5.76f);
        pathBuilder.arcTo(87.82f, 87.82f, 0.0f, false, true, 160.87f, 40.0f);
        pathBuilder.curveTo(209.15f, 40.47f, 248.38f, 80.43f, 248.0f, 128.72f);
        pathBuilder.close();
        pathBuilder.moveTo(53.92f, 34.62f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f);
        pathBuilder.lineTo(81.33f, 88.56f);
        pathBuilder.lineToRelative(-0.06f, 0.11f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 8.0f, 153.0f);
        pathBuilder.curveToRelative(0.53f, 35.12f, 29.84f, 63.0f, 65.0f, 63.0f);
        pathBuilder.horizontalLineToRelative(87.0f);
        pathBuilder.arcToRelative(87.65f, 87.65f, 0.0f, false, false, 31.78f, -5.95f);
        pathBuilder.lineToRelative(10.3f, 11.33f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.33f, 0.52f);
        pathBuilder.arcToRelative(8.32f, 8.32f, 0.0f, false, false, 0.29f, -11.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _cloudSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
