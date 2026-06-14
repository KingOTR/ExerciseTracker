package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Paperplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPaperPlaneTilt", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanetiltKt {
    private static ImageVector _paperPlaneTilt;

    public static final ImageVector getPaperPlaneTilt(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(225.88f, 30.12f);
        pathBuilder.arcToRelative(13.83f, 13.83f, 0.0f, false, false, -13.7f, -3.58f);
        pathBuilder.lineToRelative(-0.11f, 0.0f);
        pathBuilder.lineTo(20.14f, 84.77f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 110.85f);
        pathBuilder.lineToRelative(85.56f, 41.64f);
        pathBuilder.lineTo(145.12f, 238.0f);
        pathBuilder.arcToRelative(13.87f, 13.87f, 0.0f, false, false, 12.61f, 8.0f);
        pathBuilder.curveToRelative(0.4f, 0.0f, 0.81f, 0.0f, 1.21f, -0.05f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, 12.29f, -10.09f);
        pathBuilder.lineToRelative(58.2f, -191.93f);
        pathBuilder.lineToRelative(0.0f, -0.11f);
        pathBuilder.arcTo(13.83f, 13.83f, 0.0f, false, false, 225.88f, 30.12f);
        pathBuilder.close();
        pathBuilder.moveTo(217.88f, 40.52f);
        pathBuilder.lineTo(159.73f, 232.43f);
        pathBuilder.lineToRelative(0.0f, 0.11f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.76f, 0.26f);
        pathBuilder.lineToRelative(-40.68f, -83.58f);
        pathBuilder.lineToRelative(49.0f, -49.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, -8.49f);
        pathBuilder.lineToRelative(-49.0f, 49.0f);
        pathBuilder.lineTo(23.15f, 100.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.31f, -3.74f);
        pathBuilder.lineToRelative(0.11f, 0.0f);
        pathBuilder.lineTo(215.48f, 38.08f);
        pathBuilder.arcToRelative(1.94f, 1.94f, 0.0f, false, true, 1.92f, 0.52f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 217.92f, 40.52f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
