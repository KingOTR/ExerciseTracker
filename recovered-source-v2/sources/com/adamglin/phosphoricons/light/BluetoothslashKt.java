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

/* compiled from: Bluetoothslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BluetoothSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getBluetoothSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bluetoothSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BluetoothslashKt {
    private static ImageVector _bluetoothSlash;

    public static final ImageVector getBluetoothSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
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
        pathBuilder.moveTo(220.44f, 212.0f);
        pathBuilder.lineTo(60.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 51.56f, 44.0f);
        pathBuilder.lineToRelative(72.32f, 79.55f);
        pathBuilder.lineTo(60.4f, 171.2f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.2f, 9.6f);
        pathBuilder.lineTo(122.0f, 140.0f);
        pathBuilder.verticalLineToRelative(84.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.6f, 4.8f);
        pathBuilder.lineToRelative(52.28f, -39.21f);
        pathBuilder.lineTo(211.56f, 220.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 212.0f);
        pathBuilder.verticalLineTo(140.0f);
        pathBuilder.lineToRelative(15.09f, 11.31f);
        pathBuilder.lineToRelative(26.68f, 29.36f);
        pathBuilder.close();
        pathBuilder.moveTo(122.0f, 71.63f);
        pathBuilder.verticalLineTo(32.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, -4.8f);
        pathBuilder.lineToRelative(64.0f, 48.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 9.6f);
        pathBuilder.lineTo(162.07f, 110.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -7.2f, -9.6f);
        pathBuilder.lineTo(182.0f, 80.0f);
        pathBuilder.lineTo(134.0f, 44.0f);
        pathBuilder.verticalLineTo(71.63f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bluetoothSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
