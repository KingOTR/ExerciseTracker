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

/* compiled from: Pushpin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getPushPin", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(235.32f, 81.37f);
        pathBuilder.lineTo(174.63f, 20.69f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.63f, 0.0f);
        pathBuilder.lineTo(98.37f, 74.49f);
        pathBuilder.curveToRelative(-10.66f, -3.34f, -35.0f, -7.37f, -60.4f, 13.14f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.29f, 23.78f);
        pathBuilder.lineTo(85.0f, 159.71f);
        pathBuilder.lineTo(42.34f, 202.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 11.32f);
        pathBuilder.lineTo(96.29f, 171.0f);
        pathBuilder.lineToRelative(48.29f, 48.29f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 155.9f, 224.0f);
        pathBuilder.curveToRelative(0.38f, 0.0f, 0.75f, 0.0f, 1.13f, 0.0f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 11.64f, -6.33f);
        pathBuilder.curveToRelative(19.64f, -26.1f, 17.75f, -47.32f, 13.19f, -60.0f);
        pathBuilder.lineTo(235.33f, 104.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 235.32f, 81.37f);
        pathBuilder.close();
        pathBuilder.moveTo(224.0f, 92.69f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineToRelative(-57.27f, 57.46f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.49f, 9.22f);
        pathBuilder.curveToRelative(9.46f, 18.93f, -1.8f, 38.59f, -9.34f, 48.62f);
        pathBuilder.lineTo(48.0f, 100.08f);
        pathBuilder.curveToRelative(12.08f, -9.74f, 23.64f, -12.31f, 32.48f, -12.31f);
        pathBuilder.arcTo(40.13f, 40.13f, 0.0f, false, true, 96.81f, 91.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.25f, -1.51f);
        pathBuilder.lineTo(163.32f, 32.0f);
        pathBuilder.lineTo(224.0f, 92.68f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
