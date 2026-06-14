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

/* compiled from: Trayarrowdown.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TrayArrowDown", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getTrayArrowDown", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_trayArrowDown", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrayarrowdownKt {
    private static ImageVector _trayArrowDown;

    public static final ImageVector getTrayArrowDown(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _trayArrowDown;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TrayArrowDown", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(216.0f, 48.0f);
        pathBuilder.verticalLineTo(160.0f);
        pathBuilder.horizontalLineTo(179.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f);
        pathBuilder.lineToRelative(-19.31f, 19.32f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 2.34f);
        pathBuilder.horizontalLineTo(107.31f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f);
        pathBuilder.lineTo(82.34f, 162.34f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 76.68f, 160.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.verticalLineTo(48.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineTo(208.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(208.0f, 32.0f);
        pathBuilder2.lineTo(48.0f, 32.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f);
        pathBuilder2.lineTo(32.0f, 208.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder2.lineTo(208.0f, 224.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder2.lineTo(224.0f, 48.0f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 48.0f);
        pathBuilder2.lineTo(208.0f, 152.0f);
        pathBuilder2.horizontalLineToRelative(-28.7f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, false, 168.0f, 156.69f);
        pathBuilder2.lineTo(148.69f, 176.0f);
        pathBuilder2.lineTo(107.31f, 176.0f);
        pathBuilder2.lineTo(88.0f, 156.68f);
        pathBuilder2.arcTo(15.89f, 15.89f, 0.0f, false, false, 76.69f, 152.0f);
        pathBuilder2.lineTo(48.0f, 152.0f);
        pathBuilder2.lineTo(48.0f, 48.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(208.0f, 208.0f);
        pathBuilder2.lineTo(48.0f, 208.0f);
        pathBuilder2.lineTo(48.0f, 168.0f);
        pathBuilder2.lineTo(76.69f, 168.0f);
        pathBuilder2.lineTo(96.0f, 187.32f);
        pathBuilder2.arcTo(15.89f, 15.89f, 0.0f, false, false, 107.31f, 192.0f);
        pathBuilder2.horizontalLineToRelative(41.38f);
        pathBuilder2.arcTo(15.86f, 15.86f, 0.0f, false, false, 160.0f, 187.31f);
        pathBuilder2.lineTo(179.31f, 168.0f);
        pathBuilder2.lineTo(208.0f, 168.0f);
        pathBuilder2.verticalLineToRelative(40.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(90.34f, 125.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f);
        pathBuilder2.lineTo(120.0f, 132.69f);
        pathBuilder2.lineTo(120.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f);
        pathBuilder2.verticalLineToRelative(60.69f);
        pathBuilder2.lineToRelative(18.34f, -18.35f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f);
        pathBuilder2.lineToRelative(-32.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _trayArrowDown = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
