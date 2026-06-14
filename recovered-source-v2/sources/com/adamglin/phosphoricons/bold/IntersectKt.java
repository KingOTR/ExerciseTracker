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

/* compiled from: Intersect.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Intersect", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getIntersect", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_intersect", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntersectKt {
    private static ImageVector _intersect;

    public static final ImageVector getIntersect(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(178.0f, 78.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, true, false, 78.0f, 178.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, true, false, 178.0f, 78.0f);
        pathBuilder.close();
        pathBuilder.moveTo(155.81f, 100.19f);
        pathBuilder.arcToRelative(59.57f, 59.57f, 0.0f, false, true, -9.81f, 28.9f);
        pathBuilder.lineTo(126.94f, 110.0f);
        pathBuilder.arcTo(59.57f, 59.57f, 0.0f, false, true, 155.84f, 100.16f);
        pathBuilder.close();
        pathBuilder.moveTo(76.31f, 152.7f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, true, true, 76.33f, -76.33f);
        pathBuilder.arcTo(84.11f, 84.11f, 0.0f, false, false, 76.34f, 152.67f);
        pathBuilder.close();
        pathBuilder.moveTo(100.13f, 155.87f);
        pathBuilder.arcToRelative(59.57f, 59.57f, 0.0f, false, true, 9.81f, -28.9f);
        pathBuilder.lineTo(129.06f, 146.0f);
        pathBuilder.arcTo(59.57f, 59.57f, 0.0f, false, true, 100.16f, 155.84f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 220.0f);
        pathBuilder.arcToRelative(60.09f, 60.09f, 0.0f, false, true, -56.67f, -40.34f);
        pathBuilder.arcToRelative(84.11f, 84.11f, 0.0f, false, false, 76.33f, -76.33f);
        pathBuilder.arcTo(60.0f, 60.0f, 0.0f, false, true, 160.0f, 220.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _intersect = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
