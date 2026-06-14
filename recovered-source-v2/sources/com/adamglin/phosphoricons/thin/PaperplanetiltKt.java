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

/* compiled from: Paperplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getPaperPlaneTilt", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanetiltKt {
    private static ImageVector _paperPlaneTilt;

    public static final ImageVector getPaperPlaneTilt(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _paperPlaneTilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PaperPlaneTilt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.47f, 31.52f);
        pathBuilder.arcToRelative(11.87f, 11.87f, 0.0f, false, false, -11.82f, -3.0f);
        pathBuilder.lineTo(20.74f, 86.67f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.91f, 22.38f);
        pathBuilder.lineTo(105.0f, 151.0f);
        pathBuilder.lineToRelative(41.92f, 86.15f);
        pathBuilder.arcTo(11.88f, 11.88f, 0.0f, false, false, 157.74f, 244.0f);
        pathBuilder.curveToRelative(0.34f, 0.0f, 0.69f, 0.0f, 1.0f, 0.0f);
        pathBuilder.arcToRelative(11.89f, 11.89f, 0.0f, false, false, 10.52f, -8.63f);
        pathBuilder.lineToRelative(58.21f, -192.0f);
        pathBuilder.lineToRelative(0.0f, -0.08f);
        pathBuilder.arcTo(11.85f, 11.85f, 0.0f, false, false, 224.47f, 31.52f);
        pathBuilder.close();
        pathBuilder.moveTo(219.85f, 41.06f);
        pathBuilder.lineTo(161.62f, 233.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.48f, 0.59f);
        pathBuilder.lineToRelative(-41.3f, -84.86f);
        pathBuilder.lineToRelative(50.0f, -50.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f);
        pathBuilder.lineToRelative(-50.0f, 50.0f);
        pathBuilder.lineToRelative(-84.9f, -41.31f);
        pathBuilder.arcToRelative(3.88f, 3.88f, 0.0f, false, true, -2.27f, -4.0f);
        pathBuilder.arcToRelative(3.93f, 3.93f, 0.0f, false, true, 3.0f, -3.54f);
        pathBuilder.lineTo(214.9f, 36.16f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 216.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.79f, 1.19f);
        pathBuilder.arcTo(3.93f, 3.93f, 0.0f, false, true, 219.85f, 41.06f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
