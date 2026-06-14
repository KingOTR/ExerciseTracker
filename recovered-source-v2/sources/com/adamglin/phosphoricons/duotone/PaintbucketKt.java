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

/* compiled from: Paintbucket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBucket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getPaintBucket", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBucket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbucketKt {
    private static ImageVector _paintBucket;

    public static final ImageVector getPaintBucket(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _paintBucket;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaintBucket", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -16.0f, 16.0f, -40.0f, 16.0f, -40.0f);
        pathBuilder.reflectiveCurveTo(248.0f, 192.0f, 248.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 131.48f);
        pathBuilder.lineTo(208.0f, 139.48f);
        pathBuilder.lineTo(128.17f, 219.31f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.63f, 0.0f);
        pathBuilder.lineTo(20.69f, 134.46f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.63f);
        pathBuilder.lineTo(116.52f, 16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(138.14f, 101.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 28.28f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 138.14f, 101.86f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(238.66f, 163.56f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.32f, 0.0f);
        pathBuilder2.curveTo(223.57f, 166.23f, 208.0f, 190.09f, 208.0f, 208.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f);
        pathBuilder2.curveTo(256.0f, 190.09f, 240.43f, 166.23f, 238.66f, 163.56f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 216.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f);
        pathBuilder2.curveToRelative(0.0f, -6.8f, 4.0f, -16.32f, 8.0f, -24.08f);
        pathBuilder2.curveToRelative(4.0f, 7.76f, 8.0f, 17.34f, 8.0f, 24.08f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 216.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(234.53f, 139.07f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.24f);
        pathBuilder2.lineTo(122.17f, 10.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f);
        pathBuilder2.lineTo(70.25f, 51.0f);
        pathBuilder2.lineTo(45.65f, 26.34f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 34.34f, 37.66f);
        pathBuilder2.lineToRelative(24.6f, 24.6f);
        pathBuilder2.lineTo(15.0f, 106.17f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f);
        pathBuilder2.lineTo(99.89f, 225.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f);
        pathBuilder2.lineToRelative(78.49f, -78.49f);
        pathBuilder2.close();
        pathBuilder2.moveTo(202.34f, 133.83f);
        pathBuilder2.lineTo(122.51f, 213.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, 0.0f);
        pathBuilder2.lineTo(26.34f, 128.8f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f);
        pathBuilder2.lineTo(70.25f, 73.57f);
        pathBuilder2.lineToRelative(29.12f, 29.12f);
        pathBuilder2.arcToRelative(28.0f, 28.0f, 0.0f, true, false, 11.31f, -11.32f);
        pathBuilder2.lineTo(81.57f, 62.26f);
        pathBuilder2.lineToRelative(35.0f, -34.95f);
        pathBuilder2.lineTo(217.19f, 128.0f);
        pathBuilder2.lineToRelative(-11.72f, 3.9f);
        pathBuilder2.arcTo(8.09f, 8.09f, 0.0f, false, false, 202.34f, 133.83f);
        pathBuilder2.close();
        pathBuilder2.moveTo(115.51f, 107.52f);
        pathBuilder2.lineTo(115.51f, 107.52f);
        pathBuilder2.arcToRelative(13.26f, 13.26f, 0.0f, true, true, -0.05f, 0.06f);
        pathBuilder2.reflectiveCurveTo(115.51f, 107.53f, 115.51f, 107.52f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBucket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
