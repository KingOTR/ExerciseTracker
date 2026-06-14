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

/* compiled from: Microphonestage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneStage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getMicrophoneStage", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneStage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophonestageKt {
    private static ImageVector _microphoneStage;

    public static final ImageVector getMicrophoneStage(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(168.0f, 12.0f);
        pathBuilder.arcTo(75.9f, 75.9f, 0.0f, false, false, 92.49f, 96.33f);
        pathBuilder.lineTo(23.91f, 189.85f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 2.0f, 26.0f);
        pathBuilder.lineToRelative(14.29f, 14.29f);
        pathBuilder.arcToRelative(19.89f, 19.89f, 0.0f, false, false, 26.0f, 2.0f);
        pathBuilder.lineToRelative(93.52f, -68.58f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, true, false, 168.0f, 12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(220.0f, 88.0f);
        pathBuilder.arcToRelative(51.66f, 51.66f, 0.0f, false, true, -7.75f, 27.27f);
        pathBuilder.lineTo(140.74f, 43.75f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 220.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(54.72f, 210.71f);
        pathBuilder.lineToRelative(-9.43f, -9.43f);
        pathBuilder.lineToRelative(56.19f, -76.63f);
        pathBuilder.arcToRelative(76.46f, 76.46f, 0.0f, false, false, 29.87f, 29.87f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 88.0f);
        pathBuilder.arcToRelative(51.63f, 51.63f, 0.0f, false, true, 7.75f, -27.27f);
        pathBuilder.lineToRelative(71.51f, 71.51f);
        pathBuilder.arcTo(52.0f, 52.0f, 0.0f, false, true, 116.0f, 88.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneStage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
