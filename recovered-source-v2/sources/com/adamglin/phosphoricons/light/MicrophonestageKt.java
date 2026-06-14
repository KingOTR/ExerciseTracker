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

/* compiled from: Microphonestage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneStage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getMicrophoneStage", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneStage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophonestageKt {
    private static ImageVector _microphoneStage;

    public static final ImageVector getMicrophoneStage(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(168.0f, 18.0f);
        pathBuilder.arcTo(69.94f, 69.94f, 0.0f, false, false, 98.74f, 98.0f);
        pathBuilder.lineToRelative(-70.0f, 95.46f);
        pathBuilder.arcToRelative(13.92f, 13.92f, 0.0f, false, false, 1.39f, 18.17f);
        pathBuilder.lineToRelative(14.3f, 14.3f);
        pathBuilder.arcToRelative(13.93f, 13.93f, 0.0f, false, false, 18.17f, 1.39f);
        pathBuilder.lineToRelative(95.46f, -70.0f);
        pathBuilder.arcTo(70.0f, 70.0f, 0.0f, true, false, 168.0f, 18.0f);
        pathBuilder.close();
        pathBuilder.moveTo(226.0f, 88.0f);
        pathBuilder.arcToRelative(57.65f, 57.65f, 0.0f, false, true, -13.0f, 36.52f);
        pathBuilder.lineTo(131.49f, 43.0f);
        pathBuilder.arcTo(57.95f, 57.95f, 0.0f, false, true, 226.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(55.5f, 217.59f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.6f, -0.2f);
        pathBuilder.lineTo(38.61f, 203.1f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -2.6f);
        pathBuilder.lineToRelative(64.22f, -87.56f);
        pathBuilder.arcToRelative(70.32f, 70.32f, 0.0f, false, false, 40.44f, 40.43f);
        pathBuilder.close();
        pathBuilder.moveTo(110.0f, 88.0f);
        pathBuilder.arcToRelative(57.73f, 57.73f, 0.0f, false, true, 13.0f, -36.52f);
        pathBuilder.lineTo(204.53f, 133.0f);
        pathBuilder.arcTo(58.0f, 58.0f, 0.0f, false, true, 110.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(108.25f, 147.75f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f);
        pathBuilder.lineToRelative(-8.0f, 8.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.49f, -8.49f);
        pathBuilder.lineToRelative(8.0f, -8.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 108.26f, 147.74f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneStage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
