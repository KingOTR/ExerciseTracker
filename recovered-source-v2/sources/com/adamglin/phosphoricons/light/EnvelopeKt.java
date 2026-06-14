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

/* compiled from: Envelope.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Envelope", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getEnvelope", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_envelope", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EnvelopeKt {
    private static ImageVector _envelope;

    public static final ImageVector getEnvelope(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _envelope;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("Envelope", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 50.0f);
        pathBuilder.lineTo(32.0f, 50.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f);
        pathBuilder.lineTo(26.0f, 192.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(216.0f, 206.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f);
        pathBuilder.lineTo(230.0f, 56.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 50.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 135.86f);
        pathBuilder.lineTo(47.42f, 62.0f);
        pathBuilder.lineTo(208.58f, 62.0f);
        pathBuilder.close();
        pathBuilder.moveTo(101.67f, 128.0f);
        pathBuilder.lineTo(38.0f, 186.36f);
        pathBuilder.lineTo(38.0f, 69.64f);
        pathBuilder.close();
        pathBuilder.moveTo(110.55f, 136.14f);
        pathBuilder.lineTo(124.0f, 148.42f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.1f, 0.0f);
        pathBuilder.lineToRelative(13.4f, -12.28f);
        pathBuilder.lineTo(208.58f, 194.0f);
        pathBuilder.lineTo(47.43f, 194.0f);
        pathBuilder.close();
        pathBuilder.moveTo(154.33f, 128.0f);
        pathBuilder.lineTo(218.0f, 69.64f);
        pathBuilder.lineTo(218.0f, 186.36f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _envelope = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
