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

/* compiled from: Baseball.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Baseball", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBaseball", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_baseball", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseballKt {
    private static ImageVector _baseball;

    public static final ImageVector getBaseball(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _baseball;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Baseball", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(60.66f, 59.58f);
        pathBuilder.arcTo(95.74f, 95.74f, 0.0f, false, true, 89.33f, 128.0f);
        pathBuilder.arcToRelative(95.74f, 95.74f, 0.0f, false, true, -28.67f, 68.42f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -136.84f);
        pathBuilder.close();
        pathBuilder.moveTo(195.34f, 59.58f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 0.0f, 136.84f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, false, false, 0.0f, -136.84f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 24.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(72.09f, 195.91f);
        pathBuilder2.curveToRelative(0.82f, -1.0f, 1.64f, -1.93f, 2.42f, -2.91f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 62.0f, 183.0f);
        pathBuilder2.lineToRelative(-1.34f, 1.62f);
        pathBuilder2.arcToRelative(87.82f, 87.82f, 0.0f, false, true, 0.0f, -113.24f);
        pathBuilder2.lineTo(62.0f, 73.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 74.51f, 63.0f);
        pathBuilder2.curveToRelative(-0.78f, -1.0f, -1.6f, -2.0f, -2.42f, -2.91f);
        pathBuilder2.arcToRelative(87.84f, 87.84f, 0.0f, false, true, 111.82f, 0.0f);
        pathBuilder2.curveToRelative(-0.82f, 1.0f, -1.64f, 1.92f, -2.42f, 2.91f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, false, 194.0f, 73.0f);
        pathBuilder2.lineToRelative(1.34f, -1.62f);
        pathBuilder2.arcToRelative(87.82f, 87.82f, 0.0f, false, true, 0.0f, 113.24f);
        pathBuilder2.lineTo(194.0f, 183.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.48f, 10.0f);
        pathBuilder2.curveToRelative(0.78f, 1.0f, 1.6f, 1.95f, 2.42f, 2.91f);
        pathBuilder2.arcToRelative(87.84f, 87.84f, 0.0f, false, true, -111.82f, 0.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(95.89f, 145.32f);
        pathBuilder2.arcToRelative(104.5f, 104.5f, 0.0f, false, true, -4.48f, 17.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.09f, -5.34f);
        pathBuilder2.arcToRelative(87.1f, 87.1f, 0.0f, false, false, 3.79f, -14.65f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, 2.64f);
        pathBuilder2.close();
        pathBuilder2.moveTo(95.89f, 110.68f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.57f, 9.21f);
        pathBuilder2.arcTo(8.52f, 8.52f, 0.0f, false, true, 88.0f, 120.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.88f, -6.68f);
        pathBuilder2.arcToRelative(87.1f, 87.1f, 0.0f, false, false, -3.79f, -14.65f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.09f, -5.34f);
        pathBuilder2.arcTo(104.5f, 104.5f, 0.0f, false, true, 95.89f, 110.68f);
        pathBuilder2.close();
        pathBuilder2.moveTo(174.8f, 167.54f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.21f, -4.87f);
        pathBuilder2.arcToRelative(104.5f, 104.5f, 0.0f, false, true, -4.48f, -17.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.78f, -2.64f);
        pathBuilder2.arcToRelative(87.1f, 87.1f, 0.0f, false, false, 3.79f, 14.65f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 174.8f, 167.54f);
        pathBuilder2.close();
        pathBuilder2.moveTo(160.11f, 110.68f);
        pathBuilder2.arcToRelative(104.5f, 104.5f, 0.0f, false, true, 4.48f, -17.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.09f, 5.34f);
        pathBuilder2.arcToRelative(87.1f, 87.1f, 0.0f, false, false, -3.79f, 14.65f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 120.0f);
        pathBuilder2.arcToRelative(8.52f, 8.52f, 0.0f, false, true, -1.33f, -0.11f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.11f, 110.68f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _baseball = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
