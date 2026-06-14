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

/* compiled from: Paintbucket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBucket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPaintBucket", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBucket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbucketKt {
    private static ImageVector _paintBucket;

    public static final ImageVector getPaintBucket(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(256.0f, 208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -17.91f, 15.57f, -41.77f, 17.34f, -44.44f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.32f, 0.0f);
        pathBuilder.curveTo(240.43f, 166.23f, 256.0f, 190.09f, 256.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(132.49f, 124.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 16.94f);
        pathBuilder.close();
        pathBuilder.moveTo(37.65f, 18.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 26.34f, 29.66f);
        pathBuilder.lineToRelative(32.6f, 32.6f);
        pathBuilder.lineTo(70.25f, 51.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.53f, 139.07f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.13f, -13.24f);
        pathBuilder.lineTo(122.17f, 10.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 0.0f);
        pathBuilder.lineTo(70.25f, 51.0f);
        pathBuilder.lineToRelative(40.43f, 40.42f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, true, true, -11.31f, 11.32f);
        pathBuilder.lineTo(58.94f, 62.26f);
        pathBuilder.lineTo(15.0f, 106.17f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f);
        pathBuilder.lineTo(99.89f, 225.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f);
        pathBuilder.lineToRelative(78.49f, -78.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBucket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
