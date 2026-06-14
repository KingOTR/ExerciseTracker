package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bluetoothx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BluetoothX", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getBluetoothX", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothX", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothxKt {
    private static ImageVector _bluetoothX;

    public static final ImageVector getBluetoothX(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(178.4f, 172.8f);
        pathBuilder.lineTo(118.67f, 128.0f);
        pathBuilder.lineToRelative(27.73f, -20.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.8f, -6.4f);
        pathBuilder.lineTo(116.0f, 120.0f);
        pathBuilder.verticalLineTo(40.0f);
        pathBuilder.lineToRelative(25.6f, 19.2f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, -6.4f);
        pathBuilder.lineToRelative(-32.0f, -24.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 108.0f, 32.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.lineTo(50.4f, 76.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.8f, 6.4f);
        pathBuilder.lineTo(105.33f, 128.0f);
        pathBuilder.lineTo(45.6f, 172.8f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.8f, 6.4f);
        pathBuilder.lineTo(108.0f, 136.0f);
        pathBuilder.verticalLineToRelative(88.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.21f, 3.58f);
        pathBuilder.arcTo(4.05f, 4.05f, 0.0f, false, false, 112.0f, 228.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -0.8f);
        pathBuilder.lineToRelative(64.0f, -48.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -6.4f);
        pathBuilder.close();
        pathBuilder.moveTo(116.0f, 216.0f);
        pathBuilder.verticalLineTo(136.0f);
        pathBuilder.lineToRelative(53.33f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(234.83f, 101.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f);
        pathBuilder.lineTo(208.0f, 85.66f);
        pathBuilder.lineToRelative(-21.17f, 21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f);
        pathBuilder.lineTo(202.34f, 80.0f);
        pathBuilder.lineTo(181.17f, 58.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f);
        pathBuilder.lineTo(208.0f, 74.34f);
        pathBuilder.lineToRelative(21.17f, -21.17f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f);
        pathBuilder.lineTo(213.66f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bluetoothX = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
