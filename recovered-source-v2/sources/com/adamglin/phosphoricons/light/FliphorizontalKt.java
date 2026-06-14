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

/* compiled from: Fliphorizontal.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FlipHorizontal", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getFlipHorizontal", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_flipHorizontal", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FliphorizontalKt {
    private static ImageVector _flipHorizontal;

    public static final ImageVector getFlipHorizontal(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _flipHorizontal;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FlipHorizontal", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(106.78f, 26.29f);
        pathBuilder.arcTo(13.88f, 13.88f, 0.0f, false, false, 91.1f, 34.55f);
        pathBuilder.reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.12f);
        pathBuilder.lineToRelative(-64.0f, 159.94f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 40.0f, 214.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(118.0f, 40.0f);
        pathBuilder.arcTo(13.87f, 13.87f, 0.0f, false, false, 106.78f, 26.29f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 200.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f);
        pathBuilder.lineTo(40.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, -2.78f);
        pathBuilder.lineToRelative(0.05f, -0.11f);
        pathBuilder.lineToRelative(64.0f, -159.92f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 106.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(228.92f, 194.61f);
        pathBuilder.lineTo(164.92f, 34.67f);
        pathBuilder.reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.12f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 138.0f, 40.0f);
        pathBuilder.lineTo(138.0f, 200.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.93f, -19.39f);
        pathBuilder.close();
        pathBuilder.moveTo(217.66f, 201.1f);
        pathBuilder.arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.67f, 0.9f);
        pathBuilder.lineTo(152.0f, 202.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f);
        pathBuilder.lineTo(150.0f, 40.0f);
        pathBuilder.arcToRelative(1.82f, 1.82f, 0.0f, false, true, 1.6f, -2.0f);
        pathBuilder.arcToRelative(2.62f, 2.62f, 0.0f, false, true, 0.54f, -0.06f);
        pathBuilder.arcToRelative(1.76f, 1.76f, 0.0f, false, true, 1.69f, 1.2f);
        pathBuilder.lineToRelative(64.0f, 159.92f);
        pathBuilder.lineToRelative(0.05f, 0.11f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 217.66f, 201.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _flipHorizontal = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
