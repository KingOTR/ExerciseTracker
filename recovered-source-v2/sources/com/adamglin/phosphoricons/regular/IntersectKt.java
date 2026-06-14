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

/* compiled from: Intersect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Intersect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getIntersect", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_intersect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersectKt {
    private static ImageVector _intersect;

    public static final ImageVector getIntersect(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _intersect;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Intersect", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(174.63f, 81.37f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.26f, 93.26f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.26f, -93.26f);
        pathBuilder.close();
        pathBuilder.moveTo(100.69f, 136.0f);
        pathBuilder.lineTo(120.0f, 155.31f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 96.0f, 160.0f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 100.69f, 136.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.44f, 147.13f);
        pathBuilder.lineTo(108.87f, 121.56f);
        pathBuilder.arcToRelative(64.65f, 64.65f, 0.0f, false, true, 12.69f, -12.69f);
        pathBuilder.lineToRelative(25.57f, 25.57f);
        pathBuilder.arcTo(64.65f, 64.65f, 0.0f, false, true, 134.44f, 147.13f);
        pathBuilder.close();
        pathBuilder.moveTo(155.31f, 120.0f);
        pathBuilder.lineTo(136.0f, 100.69f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 160.0f, 96.0f);
        pathBuilder.arcTo(63.48f, 63.48f, 0.0f, false, true, 155.31f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(32.0f, 96.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 126.0f, -16.0f);
        pathBuilder.arcTo(80.08f, 80.08f, 0.0f, false, false, 80.05f, 158.0f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 32.0f, 96.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 224.0f);
        pathBuilder.arcTo(64.11f, 64.11f, 0.0f, false, true, 98.0f, 176.0f);
        pathBuilder.arcTo(80.08f, 80.08f, 0.0f, false, false, 176.0f, 98.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _intersect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
