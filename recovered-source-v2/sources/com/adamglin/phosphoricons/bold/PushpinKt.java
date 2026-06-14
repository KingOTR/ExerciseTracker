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

/* compiled from: Pushpin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPushPin", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _pushPin;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PushPin", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(238.15f, 78.54f);
        pathBuilder.lineTo(177.46f, 17.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.3f, 0.0f);
        pathBuilder.lineTo(97.2f, 70.0f);
        pathBuilder.curveToRelative(-12.43f, -3.33f, -36.68f, -5.72f, -61.74f, 14.5f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.6f, 29.73f);
        pathBuilder.lineToRelative(45.46f, 45.47f);
        pathBuilder.lineToRelative(-39.8f, 39.8f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(39.8f, -39.81f);
        pathBuilder.lineToRelative(45.47f, 45.46f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 155.91f, 228.0f);
        pathBuilder.curveToRelative(0.46f, 0.0f, 0.93f, 0.0f, 1.4f, -0.05f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 171.87f, 220.0f);
        pathBuilder.curveToRelative(4.69f, -6.23f, 11.0f, -16.13f, 14.44f, -28.0f);
        pathBuilder.reflectiveCurveToRelative(3.45f, -22.88f, 0.16f, -33.4f);
        pathBuilder.lineToRelative(51.7f, -51.87f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 238.15f, 78.54f);
        pathBuilder.close();
        pathBuilder.moveTo(163.89f, 147.33f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.23f, 13.84f);
        pathBuilder.curveToRelative(3.43f, 6.86f, 6.9f, 21.0f, -6.28f, 40.65f);
        pathBuilder.lineTo(54.08f, 100.53f);
        pathBuilder.curveToRelative(21.09f, -14.59f, 39.53f, -6.64f, 41.0f, -6.0f);
        pathBuilder.arcToRelative(11.67f, 11.67f, 0.0f, false, false, 13.81f, -2.29f);
        pathBuilder.lineToRelative(54.43f, -54.61f);
        pathBuilder.lineToRelative(55.0f, 55.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
