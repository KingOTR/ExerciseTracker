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

/* compiled from: Paperplanetilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PaperPlaneTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPaperPlaneTilt", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_paperPlaneTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaperplanetiltKt {
    private static ImageVector _paperPlaneTilt;

    public static final ImageVector getPaperPlaneTilt(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(231.4f, 44.34f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.1f, 0.0f, 0.15f);
        pathBuilder.lineToRelative(-58.2f, 191.94f);
        pathBuilder.arcToRelative(15.88f, 15.88f, 0.0f, false, true, -14.0f, 11.51f);
        pathBuilder.quadToRelative(-0.69f, 0.06f, -1.38f, 0.06f);
        pathBuilder.arcToRelative(15.86f, 15.86f, 0.0f, false, true, -14.42f, -9.15f);
        pathBuilder.lineTo(107.0f, 164.15f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.77f, -4.58f);
        pathBuilder.lineToRelative(57.92f, -57.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.31f);
        pathBuilder.lineTo(96.43f, 148.26f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.58f, 0.77f);
        pathBuilder.lineTo(17.08f, 112.64f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 2.49f, -29.8f);
        pathBuilder.lineToRelative(191.94f, -58.2f);
        pathBuilder.lineToRelative(0.15f, 0.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 231.4f, 44.34f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _paperPlaneTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
