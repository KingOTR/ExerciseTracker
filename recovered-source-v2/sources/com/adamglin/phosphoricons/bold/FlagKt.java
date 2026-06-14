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

/* compiled from: Flag.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Flag", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getFlag", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flag", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlagKt {
    private static ImageVector _flag;

    public static final ImageVector getFlag(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _flag;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Flag", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(40.14f, 46.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f);
        pathBuilder.verticalLineTo(224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.verticalLineTo(181.72f);
        pathBuilder.curveToRelative(22.84f, -17.12f, 42.1f, -9.12f, 70.68f, 5.0f);
        pathBuilder.curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f);
        pathBuilder.curveToRelative(14.72f, 0.0f, 30.28f, -4.94f, 46.38f, -18.88f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 176.0f);
        pathBuilder.verticalLineTo(56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.86f, -9.07f);
        pathBuilder.curveToRelative(-24.71f, 21.41f, -44.53f, 13.31f, -74.82f, -1.68f);
        pathBuilder.curveTo(113.19f, 31.27f, 78.17f, 13.94f, 40.14f, 46.88f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 170.26f);
        pathBuilder.curveToRelative(-22.84f, 17.13f, -42.1f, 9.11f, -70.68f, -5.0f);
        pathBuilder.curveTo(118.16f, 153.76f, 90.33f, 140.0f, 60.0f, 153.87f);
        pathBuilder.verticalLineTo(61.69f);
        pathBuilder.curveToRelative(22.84f, -17.12f, 42.1f, -9.12f, 70.68f, 5.0f);
        pathBuilder.curveToRelative(16.23f, 8.0f, 34.74f, 17.2f, 54.8f, 17.2f);
        pathBuilder.arcTo(63.0f, 63.0f, 0.0f, false, false, 212.0f, 78.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flag = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
