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

/* compiled from: Paintbucket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBucket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPaintBucket", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBucket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbucketKt {
    private static ImageVector _paintBucket;

    public static final ImageVector getPaintBucket(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(235.33f, 165.78f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.66f, 0.0f);
        pathBuilder.curveTo(228.0f, 166.8f, 212.0f, 191.0f, 212.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f);
        pathBuilder.curveTo(252.0f, 191.0f, 236.0f, 166.8f, 235.33f, 165.78f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 220.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f);
        pathBuilder.curveToRelative(0.0f, -10.25f, 7.49f, -24.64f, 12.0f, -32.37f);
        pathBuilder.curveToRelative(4.51f, 7.73f, 12.0f, 22.1f, 12.0f, 32.37f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 220.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.89f, 132.4f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.06f, -3.74f);
        pathBuilder.lineTo(119.34f, 13.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 0.0f);
        pathBuilder.lineTo(70.25f, 56.6f);
        pathBuilder.lineTo(42.82f, 29.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.65f, 5.66f);
        pathBuilder.lineTo(64.6f, 62.26f);
        pathBuilder.lineTo(17.86f, 109.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.29f);
        pathBuilder.lineToRelative(84.85f, 84.85f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.29f, 0.0f);
        pathBuilder.lineTo(210.16f, 143.0f);
        pathBuilder.lineToRelative(23.1f, -7.7f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 235.89f, 132.4f);
        pathBuilder.close();
        pathBuilder.moveTo(206.74f, 135.69f);
        pathBuilder.arcToRelative(4.06f, 4.06f, 0.0f, false, false, -1.57f, 1.0f);
        pathBuilder.lineToRelative(-79.83f, 79.82f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f);
        pathBuilder.lineTo(23.51f, 131.63f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f);
        pathBuilder.lineTo(70.25f, 67.92f);
        pathBuilder.lineToRelative(34.2f, 34.2f);
        pathBuilder.arcTo(24.0f, 24.0f, 0.0f, false, false, 141.0f, 133.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, false, -30.86f, -36.51f);
        pathBuilder.lineToRelative(-34.2f, -34.2f);
        pathBuilder.lineToRelative(40.61f, -40.6f);
        pathBuilder.lineTo(224.59f, 129.74f);
        pathBuilder.close();
        pathBuilder.moveTo(112.69f, 104.69f);
        pathBuilder.arcToRelative(0.0f, 0.0f, 0.0f, false, false, 0.0f, 0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 22.64f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.64f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBucket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
