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

/* compiled from: Bluetoothslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BluetoothSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getBluetoothSlash", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothslashKt {
    private static ImageVector _bluetoothSlash;

    public static final ImageVector getBluetoothSlash(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _bluetoothSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BluetoothSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(128.0f, 128.0f);
        pathBuilder.lineToRelative(64.0f, 48.0f);
        pathBuilder.lineToRelative(-64.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 32.0f);
        pathBuilder.verticalLineToRelative(96.0f);
        pathBuilder.lineToRelative(64.0f, -48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(221.92f, 210.62f);
        pathBuilder2.lineToRelative(-160.0f, -176.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 50.08f, 45.38f);
        pathBuilder2.lineToRelative(70.84f, 77.93f);
        pathBuilder2.lineTo(59.2f, 169.6f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, 12.8f);
        pathBuilder2.lineTo(120.0f, 144.0f);
        pathBuilder2.verticalLineToRelative(80.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f);
        pathBuilder2.lineToRelative(50.83f, -38.12f);
        pathBuilder2.lineToRelative(26.45f, 29.1f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f);
        pathBuilder2.close();
        pathBuilder2.moveTo(136.0f, 208.0f);
        pathBuilder2.verticalLineTo(144.0f);
        pathBuilder2.lineToRelative(11.73f, 8.8f);
        pathBuilder2.lineToRelative(25.08f, 27.59f);
        pathBuilder2.close();
        pathBuilder2.moveTo(120.0f, 71.63f);
        pathBuilder2.verticalLineTo(32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.8f, -6.4f);
        pathBuilder2.lineToRelative(64.0f, 48.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 12.8f);
        pathBuilder2.lineToRelative(-33.53f, 25.15f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.6f, -12.8f);
        pathBuilder2.lineToRelative(25.0f, -18.75f);
        pathBuilder2.lineTo(136.0f, 48.0f);
        pathBuilder2.verticalLineTo(71.63f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bluetoothSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
