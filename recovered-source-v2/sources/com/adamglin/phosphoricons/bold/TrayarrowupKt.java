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

/* compiled from: Trayarrowup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrayArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getTrayArrowUp", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trayArrowUp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrayarrowupKt {
    private static ImageVector _trayArrowUp;

    public static final ImageVector getTrayArrowUp(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
        ImageVector imageVector = _trayArrowUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrayArrowUp", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(208.0f, 28.0f);
        pathBuilder.lineTo(48.0f, 28.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(208.0f, 228.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f);
        pathBuilder.lineTo(228.0f, 48.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f);
        pathBuilder.close();
        pathBuilder.moveTo(204.0f, 52.0f);
        pathBuilder.verticalLineToRelative(92.0f);
        pathBuilder.lineTo(179.31f, 144.0f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, -14.14f, 5.86f);
        pathBuilder.lineTo(147.0f, 168.0f);
        pathBuilder.lineTo(109.0f, 168.0f);
        pathBuilder.lineTo(90.83f, 149.86f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 76.69f, 144.0f);
        pathBuilder.lineTo(52.0f, 144.0f);
        pathBuilder.lineTo(52.0f, 52.0f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 204.0f);
        pathBuilder.lineTo(52.0f, 168.0f);
        pathBuilder.lineTo(75.0f, 168.0f);
        pathBuilder.lineToRelative(18.14f, 18.14f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 107.31f, 192.0f);
        pathBuilder.horizontalLineToRelative(41.38f);
        pathBuilder.arcToRelative(19.86f, 19.86f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineTo(181.0f, 168.0f);
        pathBuilder.horizontalLineToRelative(23.0f);
        pathBuilder.verticalLineToRelative(36.0f);
        pathBuilder.close();
        pathBuilder.moveTo(87.51f, 116.49f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f);
        pathBuilder.lineTo(140.0f, 105.0f);
        pathBuilder.verticalLineToRelative(35.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(116.0f, 105.0f);
        pathBuilder.lineToRelative(-11.51f, 11.52f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 87.51f, 116.49f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trayArrowUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
