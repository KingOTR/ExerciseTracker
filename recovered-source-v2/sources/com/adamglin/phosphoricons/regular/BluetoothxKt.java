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

/* compiled from: Bluetoothx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BluetoothX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBluetoothX", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothxKt {
    private static ImageVector _bluetoothX;

    public static final ImageVector getBluetoothX(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _bluetoothX;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BluetoothX", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(180.8f, 169.6f);
        pathBuilder.lineTo(125.33f, 128.0f);
        pathBuilder.lineToRelative(23.47f, -17.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, -12.8f);
        pathBuilder.lineTo(120.0f, 112.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.lineToRelative(19.2f, 14.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, -12.8f);
        pathBuilder.lineToRelative(-32.0f, -24.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 32.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.lineTo(52.8f, 73.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.6f, 12.8f);
        pathBuilder.lineTo(98.67f, 128.0f);
        pathBuilder.lineTo(43.2f, 169.6f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 9.6f, 12.8f);
        pathBuilder.lineTo(104.0f, 144.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.8f, 6.4f);
        pathBuilder.lineToRelative(64.0f, -48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f);
        pathBuilder.close();
        pathBuilder.moveTo(120.0f, 208.0f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.lineToRelative(42.67f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(237.66f, 98.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(208.0f, 91.31f);
        pathBuilder.lineToRelative(-18.34f, 18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f);
        pathBuilder.lineTo(196.69f, 80.0f);
        pathBuilder.lineTo(178.34f, 61.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder.lineTo(208.0f, 68.69f);
        pathBuilder.lineToRelative(18.34f, -18.35f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder.lineTo(219.31f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bluetoothX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
