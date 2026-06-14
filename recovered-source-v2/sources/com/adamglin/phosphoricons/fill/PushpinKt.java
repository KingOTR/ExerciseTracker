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

/* compiled from: Pushpin.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PushPin", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getPushPin", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pushPin", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushpinKt {
    private static ImageVector _pushPin;

    public static final ImageVector getPushPin(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(235.33f, 104.0f);
        pathBuilder.lineToRelative(-53.47f, 53.65f);
        pathBuilder.curveToRelative(4.56f, 12.67f, 6.45f, 33.89f, -13.19f, 60.0f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, true, 157.0f, 224.0f);
        pathBuilder.curveToRelative(-0.38f, 0.0f, -0.75f, 0.0f, -1.13f, 0.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -11.32f, -4.69f);
        pathBuilder.lineTo(96.29f, 171.0f);
        pathBuilder.lineTo(53.66f, 213.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineTo(85.0f, 159.71f);
        pathBuilder.lineToRelative(-48.3f, -48.3f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 38.0f, 87.63f);
        pathBuilder.curveToRelative(25.42f, -20.51f, 49.75f, -16.48f, 60.4f, -13.14f);
        pathBuilder.lineTo(152.0f, 20.7f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.63f, 0.0f);
        pathBuilder.lineToRelative(60.69f, 60.68f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 235.33f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pushPin = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
