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

/* compiled from: Fastforward.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FastForward", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getFastForward", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fastForward", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FastforwardKt {
    private static ImageVector _fastForward;

    public static final ImageVector getFastForward(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _fastForward;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FastForward", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(248.67f, 114.66f);
        pathBuilder.lineTo(160.48f, 58.5f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 136.0f, 71.84f);
        pathBuilder.verticalLineToRelative(37.3f);
        pathBuilder.lineTo(56.48f, 58.5f);
        pathBuilder.arcTo(15.91f, 15.91f, 0.0f, false, false, 32.0f, 71.84f);
        pathBuilder.lineTo(32.0f, 184.16f);
        pathBuilder.arcTo(15.92f, 15.92f, 0.0f, false, false, 56.48f, 197.5f);
        pathBuilder.lineTo(136.0f, 146.86f);
        pathBuilder.verticalLineToRelative(37.3f);
        pathBuilder.arcToRelative(15.92f, 15.92f, 0.0f, false, false, 24.48f, 13.34f);
        pathBuilder.lineToRelative(88.19f, -56.16f);
        pathBuilder.arcToRelative(15.8f, 15.8f, 0.0f, false, false, 0.0f, -26.68f);
        pathBuilder.close();
        pathBuilder.moveTo(48.0f, 183.94f);
        pathBuilder.lineTo(48.0f, 72.07f);
        pathBuilder.lineTo(135.82f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 183.94f);
        pathBuilder.lineTo(152.0f, 72.07f);
        pathBuilder.lineTo(239.82f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fastForward = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
