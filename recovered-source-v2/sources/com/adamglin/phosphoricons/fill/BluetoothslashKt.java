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

/* compiled from: Bluetoothslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BluetoothSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBluetoothSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothslashKt {
    private static ImageVector _bluetoothSlash;

    public static final ImageVector getBluetoothSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
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
        pathBuilder.moveTo(221.38f, 221.92f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.3f, -0.54f);
        pathBuilder.lineToRelative(-26.45f, -29.1f);
        pathBuilder.lineTo(132.8f, 230.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.89f, 0.47f);
        pathBuilder.arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, -7.18f);
        pathBuilder.verticalLineTo(144.0f);
        pathBuilder.lineTo(68.8f, 182.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.16f, -1.55f);
        pathBuilder.arcToRelative(8.26f, 8.26f, 0.0f, false, true, 1.81f, -11.43f);
        pathBuilder.lineToRelative(61.47f, -46.11f);
        pathBuilder.lineTo(50.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 61.92f, 34.62f);
        pathBuilder.lineToRelative(160.0f, 176.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 221.38f, 221.92f);
        pathBuilder.close();
        pathBuilder.moveTo(155.0f, 113.22f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.36f, 0.51f);
        pathBuilder.lineTo(196.8f, 86.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -12.8f);
        pathBuilder.lineToRelative(-64.0f, -48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, 0.29f);
        pathBuilder.arcTo(8.25f, 8.25f, 0.0f, false, false, 120.0f, 32.24f);
        pathBuilder.verticalLineTo(73.18f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.0f, 2.69f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bluetoothSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
