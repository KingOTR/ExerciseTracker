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

/* compiled from: Paintbucket.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaintBucket", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPaintBucket", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paintBucket", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaintbucketKt {
    private static ImageVector _paintBucket;

    public static final ImageVector getPaintBucket(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(235.79f, 142.88f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.7f, -19.87f);
        pathBuilder.lineTo(125.0f, 7.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f);
        pathBuilder.lineTo(70.25f, 45.29f);
        pathBuilder.lineTo(48.48f, 23.52f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f);
        pathBuilder.lineTo(53.28f, 62.26f);
        pathBuilder.lineTo(12.2f, 103.35f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f);
        pathBuilder.lineToRelative(84.86f, 84.86f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f);
        pathBuilder.lineTo(214.48f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.21f, 128.11f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -4.7f, 2.9f);
        pathBuilder.lineToRelative(-79.82f, 79.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f);
        pathBuilder.lineTo(29.17f, 126.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f);
        pathBuilder.lineTo(70.25f, 79.24f);
        pathBuilder.lineToRelative(24.29f, 24.29f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, 52.09f, 35.11f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(32.0f, 32.0f, 0.0f, false, false, -35.12f, -52.08f);
        pathBuilder.lineTo(87.23f, 62.26f);
        pathBuilder.lineTo(116.52f, 33.0f);
        pathBuilder.lineToRelative(93.27f, 93.28f);
        pathBuilder.close();
        pathBuilder.moveTo(118.34f, 110.36f);
        pathBuilder.lineTo(118.34f, 110.36f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -0.06f, 0.06f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 208.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, -19.44f, 12.93f, -37.23f, 14.4f, -39.2f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.2f, 0.0f);
        pathBuilder.curveTo(243.07f, 170.78f, 256.0f, 188.57f, 256.0f, 208.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paintBucket = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
