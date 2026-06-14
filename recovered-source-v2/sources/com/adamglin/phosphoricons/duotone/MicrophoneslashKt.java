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

/* compiled from: Microphoneslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"MicrophoneSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getMicrophoneSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_microphoneSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MicrophoneslashKt {
    private static ImageVector _microphoneSlash;

    public static final ImageVector getMicrophoneSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _microphoneSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("MicrophoneSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 64.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f);
        pathBuilder.verticalLineTo(64.0f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, true, 40.0f, -40.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcTo(40.0f, 40.0f, 0.0f, false, true, 168.0f, 64.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(213.92f, 218.62f);
        pathBuilder2.lineToRelative(-160.0f, -176.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 42.08f, 53.38f);
        pathBuilder2.lineTo(80.0f, 95.09f);
        pathBuilder2.lineTo(80.0f, 128.0f);
        pathBuilder2.arcToRelative(48.0f, 48.0f, 0.0f, false, false, 69.11f, 43.12f);
        pathBuilder2.lineToRelative(11.1f, 12.2f);
        pathBuilder2.arcTo(63.41f, 63.41f, 0.0f, false, true, 128.0f, 192.0f);
        pathBuilder2.arcToRelative(64.07f, 64.07f, 0.0f, false, true, -64.0f, -64.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f);
        pathBuilder2.arcToRelative(80.11f, 80.11f, 0.0f, false, false, 72.0f, 79.6f);
        pathBuilder2.lineTo(120.0f, 240.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.lineTo(136.0f, 207.59f);
        pathBuilder2.arcToRelative(78.83f, 78.83f, 0.0f, false, false, 35.16f, -12.22f);
        pathBuilder2.lineToRelative(30.92f, 34.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(128.0f, 160.0f);
        pathBuilder2.arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f);
        pathBuilder2.lineTo(96.0f, 112.69f);
        pathBuilder2.lineToRelative(41.66f, 45.82f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 160.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(185.52f, 156.09f);
        pathBuilder2.arcTo(63.32f, 63.32f, 0.0f, false, false, 192.0f, 128.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(79.16f, 79.16f, 0.0f, false, true, -8.11f, 35.12f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.19f, 4.49f);
        pathBuilder2.arcToRelative(7.88f, 7.88f, 0.0f, false, true, -3.51f, -0.82f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 185.52f, 156.09f);
        pathBuilder2.close();
        pathBuilder2.moveTo(84.0f, 44.87f);
        pathBuilder2.arcTo(48.0f, 48.0f, 0.0f, false, true, 176.0f, 64.0f);
        pathBuilder2.verticalLineToRelative(64.0f);
        pathBuilder2.arcToRelative(49.19f, 49.19f, 0.0f, false, true, -0.26f, 5.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 7.17f);
        pathBuilder2.arcToRelative(8.13f, 8.13f, 0.0f, false, true, -0.84f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.12f, -8.79f);
        pathBuilder2.curveToRelative(0.11f, -1.1f, 0.17f, -2.24f, 0.17f, -3.36f);
        pathBuilder2.lineTo(159.95f, 64.0f);
        pathBuilder2.arcTo(32.0f, 32.0f, 0.0f, false, false, 98.64f, 51.25f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, true, true, 84.0f, 44.87f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _microphoneSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
