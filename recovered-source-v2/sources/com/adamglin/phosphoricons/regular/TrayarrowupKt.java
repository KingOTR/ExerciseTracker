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

/* compiled from: Trayarrowup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrayArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTrayArrowUp", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trayArrowUp", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrayarrowupKt {
    private static ImageVector _trayArrowUp;

    public static final ImageVector getTrayArrowUp(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(208.0f, 32.0f);
        pathBuilder.lineTo(48.0f, 32.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder.lineTo(32.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(208.0f, 224.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.lineTo(224.0f, 48.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 48.0f);
        pathBuilder.lineTo(208.0f, 152.0f);
        pathBuilder.horizontalLineToRelative(-28.7f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 168.0f, 156.69f);
        pathBuilder.lineTo(148.69f, 176.0f);
        pathBuilder.lineTo(107.31f, 176.0f);
        pathBuilder.lineTo(88.0f, 156.69f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 76.69f, 152.0f);
        pathBuilder.lineTo(48.0f, 152.0f);
        pathBuilder.lineTo(48.0f, 48.0f);
        pathBuilder.close();
        pathBuilder.moveTo(208.0f, 208.0f);
        pathBuilder.lineTo(48.0f, 208.0f);
        pathBuilder.lineTo(48.0f, 168.0f);
        pathBuilder.lineTo(76.69f, 168.0f);
        pathBuilder.lineTo(96.0f, 187.31f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 107.31f, 192.0f);
        pathBuilder.horizontalLineToRelative(41.38f);
        pathBuilder.arcTo(15.86f, 15.86f, 0.0f, false, false, 160.0f, 187.31f);
        pathBuilder.lineTo(179.31f, 168.0f);
        pathBuilder.lineTo(208.0f, 168.0f);
        pathBuilder.verticalLineToRelative(40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(90.34f, 109.66f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f);
        pathBuilder.lineToRelative(32.0f, -32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f);
        pathBuilder.lineToRelative(32.0f, 32.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f);
        pathBuilder.lineTo(136.0f, 91.31f);
        pathBuilder.lineTo(136.0f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(120.0f, 91.31f);
        pathBuilder.lineToRelative(-18.34f, 18.35f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 90.34f, 109.66f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trayArrowUp = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
