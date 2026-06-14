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

/* compiled from: Paperplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPaperPlaneTilt", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanetiltKt {
    private static ImageVector _paperPlaneTilt;

    public static final ImageVector getPaperPlaneTilt(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(230.14f, 25.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.57f, -5.11f);
        pathBuilder.lineToRelative(-0.22f, 0.07f);
        pathBuilder.lineTo(18.44f, 79.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.06f, 37.25f);
        pathBuilder.lineTo(99.0f, 157.0f);
        pathBuilder.lineToRelative(40.71f, 83.65f);
        pathBuilder.arcToRelative(19.81f, 19.81f, 0.0f, false, false, 18.0f, 11.38f);
        pathBuilder.curveToRelative(0.57f, 0.0f, 1.15f, 0.0f, 1.73f, -0.07f);
        pathBuilder.arcTo(19.82f, 19.82f, 0.0f, false, false, 177.0f, 237.56f);
        pathBuilder.lineTo(235.18f, 45.65f);
        pathBuilder.arcToRelative(1.42f, 1.42f, 0.0f, false, false, 0.07f, -0.22f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 230.14f, 25.86f);
        pathBuilder.close();
        pathBuilder.moveTo(156.91f, 221.07f);
        pathBuilder.lineToRelative(-34.37f, -70.64f);
        pathBuilder.lineToRelative(46.0f, -45.95f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f);
        pathBuilder.lineToRelative(-46.0f, 46.0f);
        pathBuilder.lineTo(34.93f, 99.09f);
        pathBuilder.lineTo(210.0f, 46.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
