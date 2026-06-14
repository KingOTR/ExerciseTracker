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

/* compiled from: Circlehalftilt.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CircleHalfTilt", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getCircleHalfTilt", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_circleHalfTilt", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CirclehalftiltKt {
    private static ImageVector _circleHalfTilt;

    public static final ImageVector getCircleHalfTilt(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _circleHalfTilt;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CircleHalfTilt", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(204.37f, 51.6f);
        pathBuilder.arcTo(108.08f, 108.08f, 0.0f, true, false, 236.0f, 128.0f);
        pathBuilder.arcTo(108.09f, 108.09f, 0.0f, false, false, 204.37f, 51.6f);
        pathBuilder.close();
        pathBuilder.moveTo(176.0f, 197.0f);
        pathBuilder.arcToRelative(83.43f, 83.43f, 0.0f, false, true, -16.0f, 8.75f);
        pathBuilder.lineTo(160.0f, 113.0f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(68.6f, 68.58f);
        pathBuilder.arcTo(84.08f, 84.08f, 0.0f, false, true, 178.3f, 60.7f);
        pathBuilder.lineTo(60.72f, 178.33f);
        pathBuilder.arcTo(84.08f, 84.08f, 0.0f, false, true, 68.6f, 68.58f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 177.0f);
        pathBuilder.verticalLineToRelative(28.69f);
        pathBuilder.arcTo(83.63f, 83.63f, 0.0f, false, true, 77.7f, 195.3f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 211.62f);
        pathBuilder.lineTo(120.0f, 153.0f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(74.64f);
        pathBuilder.arcTo(84.68f, 84.68f, 0.0f, false, true, 120.0f, 211.62f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 171.35f);
        pathBuilder.lineTo(200.0f, 84.65f);
        pathBuilder.arcToRelative(84.24f, 84.24f, 0.0f, false, true, 0.0f, 86.7f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _circleHalfTilt = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
