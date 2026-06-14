package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Microphonestage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneStage", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMicrophoneStage", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneStage", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophonestageKt {
    private static ImageVector _microphoneStage;

    public static final ImageVector getMicrophoneStage(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
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
        pathBuilder.moveTo(156.5f, 151.0f);
        pathBuilder.lineTo(59.0f, 222.45f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.38f, -0.79f);
        pathBuilder.lineToRelative(-14.3f, -14.3f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 33.55f, 197.0f);
        pathBuilder.lineTo(105.0f, 99.5f);
        pathBuilder.lineToRelative(0.0f, 0.0f);
        pathBuilder.arcTo(64.0f, 64.0f, 0.0f, false, false, 156.48f, 151.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(168.0f, 16.0f);
        pathBuilder2.arcTo(72.07f, 72.07f, 0.0f, false, false, 96.0f, 88.0f);
        pathBuilder2.arcToRelative(73.29f, 73.29f, 0.0f, false, false, 0.63f, 9.42f);
        pathBuilder2.lineTo(27.12f, 192.22f);
        pathBuilder2.arcTo(15.93f, 15.93f, 0.0f, false, false, 28.71f, 213.0f);
        pathBuilder2.lineTo(43.0f, 227.29f);
        pathBuilder2.arcToRelative(15.93f, 15.93f, 0.0f, false, false, 20.78f, 1.59f);
        pathBuilder2.lineToRelative(94.81f, -69.53f);
        pathBuilder2.arcTo(73.29f, 73.29f, 0.0f, false, false, 168.0f, 160.0f);
        pathBuilder2.arcToRelative(72.0f, 72.0f, 0.0f, true, false, 0.0f, -144.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 88.0f);
        pathBuilder2.arcToRelative(55.72f, 55.72f, 0.0f, false, true, -11.16f, 33.52f);
        pathBuilder2.lineTo(134.49f, 43.16f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 224.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(54.32f, 216.0f);
        pathBuilder2.lineTo(40.0f, 201.68f);
        pathBuilder2.lineTo(102.14f, 117.0f);
        pathBuilder2.arcTo(72.37f, 72.37f, 0.0f, false, false, 139.0f, 153.86f);
        pathBuilder2.close();
        pathBuilder2.moveTo(112.0f, 88.0f);
        pathBuilder2.arcToRelative(55.67f, 55.67f, 0.0f, false, true, 11.16f, -33.51f);
        pathBuilder2.lineToRelative(78.34f, 78.34f);
        pathBuilder2.arcTo(56.0f, 56.0f, 0.0f, false, true, 112.0f, 88.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(109.65f, 146.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f);
        pathBuilder2.lineToRelative(-8.0f, 8.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.31f, -11.31f);
        pathBuilder2.lineToRelative(8.0f, -8.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 109.67f, 146.33f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneStage = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
