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

/* compiled from: Microphonestage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneStage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getMicrophoneStage", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneStage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophonestageKt {
    private static ImageVector _microphoneStage;

    public static final ImageVector getMicrophoneStage(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _microphoneStage;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrophoneStage", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(115.06f, 46.36f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.11f, 0.54f);
        pathBuilder.arcTo(71.54f, 71.54f, 0.0f, false, false, 96.0f, 88.0f);
        pathBuilder.arcToRelative(73.29f, 73.29f, 0.0f, false, false, 0.63f, 9.42f);
        pathBuilder.lineTo(27.12f, 192.22f);
        pathBuilder.arcTo(15.93f, 15.93f, 0.0f, false, false, 28.71f, 213.0f);
        pathBuilder.lineTo(43.0f, 227.29f);
        pathBuilder.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 20.78f, 1.59f);
        pathBuilder.lineToRelative(94.81f, -69.53f);
        pathBuilder.arcTo(73.29f, 73.29f, 0.0f, false, false, 168.0f, 160.0f);
        pathBuilder.arcToRelative(71.54f, 71.54f, 0.0f, false, false, 41.09f, -12.93f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.54f, -6.11f);
        pathBuilder.close();
        pathBuilder.moveTo(117.67f, 149.64f);
        pathBuilder.lineTo(101.67f, 165.64f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f);
        pathBuilder.lineToRelative(16.0f, -16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, 11.31f);
        pathBuilder.close();
        pathBuilder.moveTo(227.07f, 129.08f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.12f, 0.54f);
        pathBuilder.lineTo(126.38f, 35.05f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.54f, -6.12f);
        pathBuilder.arcTo(71.93f, 71.93f, 0.0f, false, true, 227.07f, 129.08f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneStage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
