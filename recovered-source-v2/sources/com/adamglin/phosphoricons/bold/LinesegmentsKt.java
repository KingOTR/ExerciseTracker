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

/* compiled from: Linesegments.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"LineSegments", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getLineSegments", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_lineSegments", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinesegmentsKt {
    private static ImageVector _lineSegments;

    public static final ImageVector getLineSegments(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _lineSegments;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("LineSegments", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(241.47f, 30.53f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -50.92f, 0.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.06f, 36.06f, 0.0f, false, false, -1.2f, 49.66f);
        pathBuilder.lineToRelative(-23.83f, 44.26f);
        pathBuilder.arcToRelative(36.08f, 36.08f, 0.0f, false, false, -21.0f, 3.07f);
        pathBuilder.lineToRelative(-16.0f, -16.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.94f, -41.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -1.2f, 49.66f);
        pathBuilder.lineTo(45.5f, 164.45f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, -31.0f, 10.1f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 52.12f, 1.26f);
        pathBuilder.lineToRelative(23.83f, -44.26f);
        pathBuilder.arcTo(35.21f, 35.21f, 0.0f, false, false, 96.0f, 132.0f);
        pathBuilder.arcToRelative(36.07f, 36.07f, 0.0f, false, false, 15.51f, -3.5f);
        pathBuilder.lineToRelative(16.0f, 16.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, true, false, 59.14f, -8.68f);
        pathBuilder.lineTo(210.5f, 91.55f);
        pathBuilder.arcTo(36.32f, 36.32f, 0.0f, false, false, 216.0f, 92.0f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, false, 25.46f, -61.45f);
        pathBuilder.close();
        pathBuilder.moveTo(87.47f, 87.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f);
        pathBuilder.close();
        pathBuilder.moveTo(48.47f, 208.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 48.47f, 208.5f);
        pathBuilder.close();
        pathBuilder.moveTo(168.47f, 168.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 168.49f, 168.49f);
        pathBuilder.close();
        pathBuilder.moveTo(224.47f, 64.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -17.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 224.5f, 64.48f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _lineSegments = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
